package com.example.booklibrary.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.booklibrary.model.AvailableBooksModel;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BookDao_Impl implements BookDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AvailableBooksModel> __insertionAdapterOfAvailableBooksModel;

  public BookDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAvailableBooksModel = new EntityInsertionAdapter<AvailableBooksModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `book` (`bookAuthor`,`bookDesc`,`bookId`,`bookImgUrl`,`bookName`,`bookPrice`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AvailableBooksModel value) {
        if (value.getBookAuthor() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getBookAuthor());
        }
        if (value.getBookDesc() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBookDesc());
        }
        stmt.bindLong(3, value.getBookId());
        if (value.getBookImgUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBookImgUrl());
        }
        if (value.getBookName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBookName());
        }
        if (value.getBookPrice() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getBookPrice());
        }
      }
    };
  }

  @Override
  public Object insertAllBooks(final List<AvailableBooksModel> availableBooksModel,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAvailableBooksModel.insert(availableBooksModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public List<AvailableBooksModel> getBooks() {
    final String _sql = "select * from book";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfBookAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "bookAuthor");
      final int _cursorIndexOfBookDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "bookDesc");
      final int _cursorIndexOfBookId = CursorUtil.getColumnIndexOrThrow(_cursor, "bookId");
      final int _cursorIndexOfBookImgUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "bookImgUrl");
      final int _cursorIndexOfBookName = CursorUtil.getColumnIndexOrThrow(_cursor, "bookName");
      final int _cursorIndexOfBookPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "bookPrice");
      final List<AvailableBooksModel> _result = new ArrayList<AvailableBooksModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AvailableBooksModel _item;
        final String _tmpBookAuthor;
        _tmpBookAuthor = _cursor.getString(_cursorIndexOfBookAuthor);
        final String _tmpBookDesc;
        _tmpBookDesc = _cursor.getString(_cursorIndexOfBookDesc);
        final int _tmpBookId;
        _tmpBookId = _cursor.getInt(_cursorIndexOfBookId);
        final String _tmpBookImgUrl;
        _tmpBookImgUrl = _cursor.getString(_cursorIndexOfBookImgUrl);
        final String _tmpBookName;
        _tmpBookName = _cursor.getString(_cursorIndexOfBookName);
        final String _tmpBookPrice;
        _tmpBookPrice = _cursor.getString(_cursorIndexOfBookPrice);
        _item = new AvailableBooksModel(_tmpBookAuthor,_tmpBookDesc,_tmpBookId,_tmpBookImgUrl,_tmpBookName,_tmpBookPrice);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
