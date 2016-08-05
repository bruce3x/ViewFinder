package me.brucezz.viewfinder.provider;

import android.content.Context;
import android.view.View;

/**
 * Created by brucezz on 2016-08-04.
 * Github: https://github.com/brucezz
 * Email: im.brucezz@gmail.com
 */
public interface Provider {
    Context getContext(Object source);

    View findView(Object source, int id);
}
