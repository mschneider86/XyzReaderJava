package br.com.schneiderapps.xyzreader.ui;

import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import br.com.schneiderapps.xyzreader.data.ArticleLoader;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private Cursor mCursor;

    MyPagerAdapter(FragmentManager fm, Cursor cursor) {
        super(fm);

        mCursor = cursor;
    }

    @Override
    public Fragment getItem(int position) {
        if (mCursor != null) {
            mCursor.moveToPosition(position);
        }
        return ArticleDetailFragment.newInstance(mCursor.getLong(ArticleLoader.Query._ID));
    }

    @Override
    public int getCount() {
        return (mCursor != null) ? mCursor.getCount() : 0;
    }
}
