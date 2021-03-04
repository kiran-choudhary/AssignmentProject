package com.example.booklibrary.viewModel;

import java.lang.System;

/**
 * Created by Kiran Kumar Choudhary on 02,March,2021).
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/booklibrary/viewModel/BookViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "books", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/booklibrary/model/GetBookResult;", "repository", "Lcom/example/booklibrary/repository/Repository;", "getAvailableBooks", "", "getBookLiveData", "app_debug"})
public final class BookViewModel extends androidx.lifecycle.AndroidViewModel {
    private com.example.booklibrary.repository.Repository repository;
    private androidx.lifecycle.MutableLiveData<com.example.booklibrary.model.GetBookResult> books;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.booklibrary.model.GetBookResult> getBookLiveData() {
        return null;
    }
    
    public final void getAvailableBooks() {
    }
    
    public BookViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}