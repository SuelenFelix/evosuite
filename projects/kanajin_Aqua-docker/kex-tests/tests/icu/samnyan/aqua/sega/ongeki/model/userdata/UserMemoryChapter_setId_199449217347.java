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
import java.lang.Long;

public class UserMemoryChapter_setId_199449217347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403479;
     Object term403492;

    public UserMemoryChapter_setId_199449217347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403479 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        setLongField(term403479, term403479.getClass(), "id", 0L);
        setField(term403479, term403479.getClass(), "user", null);
        setIntField(term403479, term403479.getClass(), "chapterId", 0);
        setIntField(term403479, term403479.getClass(), "jewelCount", 0);
        setIntField(term403479, term403479.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term403479, term403479.getClass(), "lastPlayMusicId", 0);
        setIntField(term403479, term403479.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term403479, term403479.getClass(), "isDialogWatched", false);
        setBooleanField(term403479, term403479.getClass(), "isStoryWatched", false);
        setBooleanField(term403479, term403479.getClass(), "isBossWatched", false);
        setBooleanField(term403479, term403479.getClass(), "isClear", false);
        setIntField(term403479, term403479.getClass(), "gaugeId", 0);
        setIntField(term403479, term403479.getClass(), "gaugeNum", 0);
        term403492 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term403492;
        callMethod(klass, "setId", argTypes, term403479, args);
    }

};


