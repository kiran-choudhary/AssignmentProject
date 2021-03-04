package com.example.booklibrary.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lcom/example/booklibrary/network/ApiInterface;", "", "getAllAvailableBooks", "Lcom/example/booklibrary/model/GetBookResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ApiInterface {
    public static final com.example.booklibrary.network.ApiInterface.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getAllAvailableBooks")
    public abstract java.lang.Object getAllAvailableBooks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.booklibrary.model.GetBookResult> p0);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/booklibrary/network/ApiInterface$Companion;", "", "()V", "retrofit", "Lcom/example/booklibrary/network/ApiInterface;", "kotlin.jvm.PlatformType", "getRetrofit", "()Lcom/example/booklibrary/network/ApiInterface;", "app_debug"})
    public static final class Companion {
        @androidx.annotation.Nullable()
        private static final com.example.booklibrary.network.ApiInterface retrofit = null;
        
        public final com.example.booklibrary.network.ApiInterface getRetrofit() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}