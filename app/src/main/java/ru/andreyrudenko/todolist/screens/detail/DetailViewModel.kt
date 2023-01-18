package ru.andreyrudenko.todolist.screens.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.andreyrudenko.todolist.REPOSITORY
import ru.andreyrudenko.todolist.model.NoteModel

class DetailViewModel : ViewModel() {
    fun delete(noteModel: NoteModel, onSuccess:() -> Unit) =
        viewModelScope.launch(Dispatchers.IO){
            REPOSITORY.deleteNote(noteModel) {
                onSuccess()
            }
        }
}