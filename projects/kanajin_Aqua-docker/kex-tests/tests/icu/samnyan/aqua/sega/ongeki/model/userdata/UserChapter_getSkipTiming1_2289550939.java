package icu.samnyan.aqua.sega.ongeki.model.userdata;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserChapter_getSkipTiming1_2289550939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95894;

    public UserChapter_getSkipTiming1_2289550939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95894 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        setLongField(term95894, term95894.getClass(), "id", 0L);
        setField(term95894, term95894.getClass(), "user", null);
        setIntField(term95894, term95894.getClass(), "chapterId", 0);
        setIntField(term95894, term95894.getClass(), "jewelCount", 0);
        setIntField(term95894, term95894.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term95894, term95894.getClass(), "lastPlayMusicId", 0);
        setIntField(term95894, term95894.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term95894, term95894.getClass(), "isStoryWatched", false);
        setBooleanField(term95894, term95894.getClass(), "isClear", false);
        setIntField(term95894, term95894.getClass(), "skipTiming1", 0);
        setIntField(term95894, term95894.getClass(), "skipTiming2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkipTiming1", argTypes, term95894, args);
    }

};


