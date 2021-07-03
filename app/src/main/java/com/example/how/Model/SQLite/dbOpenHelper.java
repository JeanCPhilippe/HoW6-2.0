package com.example.how.Model.SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class dbOpenHelper extends SQLiteOpenHelper
{
    public static int version = 1;
    public static String name = "dbConta";
    public dbOpenHelper( Context context)
    {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String sql = "CREATE TABLE ACCOUNT (Email TEXT UNIQUE, Senha Text, CPF Text UNIQUE ,Nome Text, Telefone Text, Data Text)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS ACCOUNT");
        onCreate(db);
    }
    public Long CriarConta(String email, String senha, String cpf, String nome, String Telefone, String DataNasc)
    {
        SQLiteDatabase sql = getWritableDatabase();
        ContentValues cv = new ContentValues();
        /**
         * Código para inserir usuário ao Banco de Dados
        **/
        cv.put("Email", email);
        cv.put("Senha", senha);
        cv.put("CPF", cpf);
        cv.put("Telefone", Telefone);
        cv.put("Nome", nome);
        cv.put("Data", DataNasc);

        Long resultado = sql.insert("ACCOUNT", null,cv);
        return resultado;

    }
    public String Autenticar (String email, String senha)
    {
        SQLiteDatabase au = getReadableDatabase();
        Cursor cursor = au.rawQuery("SELECT * FROM ACCOUNT WHERE Email=? AND Senha=?",new String[]{email,senha});
        if (cursor.getCount()>0)
        {
            return "Verificado";
        }

            return "Erro";
    }

}
