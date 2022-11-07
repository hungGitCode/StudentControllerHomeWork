package com.cybersoft.student.StundenController.HomeWork.repostiory;

import com.cybersoft.student.StundenController.HomeWork.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
