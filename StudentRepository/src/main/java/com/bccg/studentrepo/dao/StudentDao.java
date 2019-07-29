package com.bccg.studentrepo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bccg.studentrepo.beans.Student;
public interface StudentDao extends JpaRepository<Student, Integer> {}
