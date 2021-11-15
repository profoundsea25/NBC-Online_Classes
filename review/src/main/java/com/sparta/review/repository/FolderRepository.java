package com.sparta.review.repository;

import com.sparta.review.domain.Folder;
import com.sparta.review.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUser(User user);
    List<Folder> findAllByUserAndNameIn(User user, List<String> nameList);
}