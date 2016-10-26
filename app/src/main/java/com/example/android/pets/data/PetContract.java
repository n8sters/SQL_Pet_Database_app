package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by ncpow on 10/23/2016.
 */

public final class PetContract {

    private PetContract() {}

    public static abstract class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;

        public static final String COLUMN_PET_NAME = "name";

        public static final String COLUMN_PET_BREED = "breed";

        public static final String COLUMN_PET_GENDER = "gender";

        public static final String COLUMN_PET_WEIGHT = "weight";

        //possible genders
        public static int GENDER_MALE = 1;

        public static int GENDER_FEMALE = 2;

        public static int GENDER_UNKNOWN = 0;

    }
}
