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

public class UserMemoryChapter_setUser_70698277248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403494;

    public UserMemoryChapter_setUser_70698277248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403494 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        setLongField(term403494, term403494.getClass(), "id", 0L);
        setField(term403494, term403494.getClass(), "user", null);
        setIntField(term403494, term403494.getClass(), "chapterId", 0);
        setIntField(term403494, term403494.getClass(), "jewelCount", 0);
        setIntField(term403494, term403494.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term403494, term403494.getClass(), "lastPlayMusicId", 0);
        setIntField(term403494, term403494.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term403494, term403494.getClass(), "isDialogWatched", false);
        setBooleanField(term403494, term403494.getClass(), "isStoryWatched", false);
        setBooleanField(term403494, term403494.getClass(), "isBossWatched", false);
        setBooleanField(term403494, term403494.getClass(), "isClear", false);
        setIntField(term403494, term403494.getClass(), "gaugeId", 0);
        setIntField(term403494, term403494.getClass(), "gaugeNum", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term403494, args);
    }

};


