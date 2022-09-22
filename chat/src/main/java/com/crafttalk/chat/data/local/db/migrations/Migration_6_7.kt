package com.crafttalk.chat.data.local.db.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.crafttalk.chat.data.local.db.entity.MessageEntity

object Migration_6_7: Migration(6, 7) {
    override fun migrate(database: SupportSQLiteDatabase) {

        database.execSQL("ALTER TABLE ${MessageEntity.TABLE_NAME} ADD COLUMN arrival_time INTEGER DEFAULT NULL")

    }
}