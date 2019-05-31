package ir.maktab.model.DAO;

import ir.maktab.BaseDao.BaseDAO;
import ir.maktab.model.Teacher;

import java.util.List;

/**
 * @author Mohammad hashemi
 */
public interface TeacherDAO extends BaseDAO<Teacher> {

    /**
     * Delete teachers by their code
     * @param teacherCode
     */
    void deleteByTeacherCode(Long teacherCode);

    /**
     *
     * @return
     */
    List<Teacher> maxAndMinSalaryOfTeachers();



    List<Teacher> youngestAndOldestTeachers();
}
