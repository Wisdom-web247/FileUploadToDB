package com.example.dbfileupload.Repository;

import com.example.dbfileupload.Models.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Connects to SQL
@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
}

