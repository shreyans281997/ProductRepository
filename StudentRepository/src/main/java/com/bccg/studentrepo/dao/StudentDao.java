package com.bccg.studentrepo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bccg.studentrepo.beans.Student;
@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {}
