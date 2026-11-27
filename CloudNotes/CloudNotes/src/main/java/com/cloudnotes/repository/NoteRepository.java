
package com.cloudnotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cloudnotes.entity.Note;

public interface NoteRepository
        extends JpaRepository<Note, Long> {
}
