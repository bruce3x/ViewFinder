package me.brucezz.viewfinder;

import me.brucezz.viewfinder.provider.Provider;

/**
 * Created by brucezz on 2016-07-27.
 * Github: https://github.com/brucezz
 * Email: im.brucezz@gmail.com
 */
public interface Finder<T> {
    /**
     *
     * @param host
     * @param source
     * @param provider
     */
    void inject(T host, Object source, Provider provider);
}
