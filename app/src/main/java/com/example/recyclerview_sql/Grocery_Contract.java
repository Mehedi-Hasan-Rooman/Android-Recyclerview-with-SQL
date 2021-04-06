package com.example.recyclerview_sql;

import android.provider.BaseColumns;

public class Grocery_Contract implements BaseColumns {

    private Grocery_Contract() {
    }

    public static final class GroceryEntry implements BaseColumns {
        public static final String TABLE_NAME = "groceryList";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_AMOUNT = "amount";
        public static final String COLUMN_TIMESTAMP = "timestamp";
    }
}
