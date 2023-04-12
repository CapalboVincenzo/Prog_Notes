package controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Folder;


@Repository
public interface FolderRepository extends JpaRepository<Folder, Integer> {

}
