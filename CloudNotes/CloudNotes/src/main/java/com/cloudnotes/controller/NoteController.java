
package com.cloudnotes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.cloudnotes.entity.Note;
import com.cloudnotes.repository.NoteRepository;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

	private final NoteRepository repository;

	public NoteController(NoteRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public List<Note> getAllNotes() {
		return repository.findAll();
	}

	@PostMapping
	public Note addNote(@RequestBody Note note) {
		note.setId(null);
		return repository.save(note);
	}

	@DeleteMapping("/{id}")
	public void deleteNote(@PathVariable Long id) {
		repository.deleteById(id);
	}

	@PutMapping("/{id}")
	public Note updateNote(@PathVariable Long id, @RequestBody Note updatedNote) {

		Note note = repository.findById(id).orElseThrow(() -> new RuntimeException("Note not found"));

		note.setTitle(updatedNote.getTitle());
		note.setContent(updatedNote.getContent());

		return repository.save(note);
	}

}
