package com.shivanshu.cleanarchitecturenoteapp.di

import android.app.Application
import androidx.room.Room
import com.shivanshu.cleanarchitecturenoteapp.features_note.data.data_source.NoteDatabase
import com.shivanshu.cleanarchitecturenoteapp.features_note.data.repository.NoteRepositoryImp
import com.shivanshu.cleanarchitecturenoteapp.features_note.domain.repository.NoteRepository
import com.shivanshu.cleanarchitecturenoteapp.features_note.domain.use_case.AddNoteUseCase
import com.shivanshu.cleanarchitecturenoteapp.features_note.domain.use_case.DeleteNoteUseCase
import com.shivanshu.cleanarchitecturenoteapp.features_note.domain.use_case.GetNotesUseCase
import com.shivanshu.cleanarchitecturenoteapp.features_note.domain.use_case.NotesUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideNoteDatabase(app : Application) : NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db:NoteDatabase) : NoteRepository {
        return NoteRepositoryImp(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUsecases(repository: NoteRepository) : NotesUseCases {
        return NotesUseCases(
            getNotesUseCase = GetNotesUseCase(repository),
            deleteNoteUseCase = DeleteNoteUseCase(repository),
            addNoteUseCase = AddNoteUseCase(repository)
        )
    }
}