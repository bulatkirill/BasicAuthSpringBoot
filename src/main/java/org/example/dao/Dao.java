package org.example.dao;

import java.util.List;

public interface Dao<T, I> {

    /**
     * Finds all records.
     *
     * @return all records found
     */
    List<T> findAll();

    /**
     * Finds record by id.
     *
     * @param id id to search by
     * @return found record or null
     */
    T findById(I id);

    /**
     * Adds record.
     *
     * @param toAdd record to add
     */
    void add(T toAdd);

    /**
     * Deletes record based on the provided id.
     *
     * @param idToDelete id of the record to delete
     */
    void delete(I idToDelete);
}
