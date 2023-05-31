package com.example.transactions;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository //UNNECESSARY
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // @Query("SELECT s FROM Student s WHERE s.email = ?1")
    //Optional<Student> findStudentByEmail(String email);
    // @Query("SELECT s FROM Student)
    //List<Student> findStudentsByEmail(String email);
}
