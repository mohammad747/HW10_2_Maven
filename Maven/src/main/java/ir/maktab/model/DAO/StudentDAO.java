package ir.maktab.model.DAO;

import ir.maktab.BaseDao.BaseDAO;
import ir.maktab.model.Student;

import java.util.List;

/**
 * @author Mohammad hashemi
 */
public interface StudentDAO extends BaseDAO<Student> {

    /**
     * Search students by their name
     * @param name
     * @return
     */
    List<Student> searchStudentsByName(String name);

    /**
     * Search students name by their name with Criteria method
     * @param name
     * @return
     */
    List<Student> searchStudentsByNameCriteria(String name);
}
