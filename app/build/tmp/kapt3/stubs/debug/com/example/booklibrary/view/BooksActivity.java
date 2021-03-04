package com.example.booklibrary.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/booklibrary/view/BooksActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/booklibrary/ICallBack;", "()V", "booksAdapter", "Lcom/example/booklibrary/adapter/BooksAdapter;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewModel", "Lcom/example/booklibrary/viewModel/BookViewModel;", "handleClick", "", "book", "Lcom/example/booklibrary/model/AvailableBooksModel;", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "app_debug"})
public final class BooksActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.booklibrary.ICallBack {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.example.booklibrary.adapter.BooksAdapter booksAdapter;
    private com.example.booklibrary.viewModel.BookViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override()
    public void handleClick(@org.jetbrains.annotations.Nullable()
    com.example.booklibrary.model.AvailableBooksModel book) {
    }
    
    public BooksActivity() {
        super();
    }
}