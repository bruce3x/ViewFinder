package me.brucezz.viewfinder.provider;

import android.content.Context;
import android.view.View;

/**
 * Created by brucezz on 2016-08-04.
 * Github: https://github.com/brucezz
 * Email: im.brucezz@gmail.com
 */
public class ViewProvider implements Provider {
    @Override
    public Context getContext(Object source) {
        return ((View) source).getContext();
    }

    @Override
    public View findView(Object source, int id) {
        return ((View) source).findViewById(id);
    }
}
