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
import java.lang.Boolean;

public class UserMemoryChapter_setStoryWatched_103226440555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403597;
     Object term403610;

    public UserMemoryChapter_setStoryWatched_103226440555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403597 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        setLongField(term403597, term403597.getClass(), "id", 0L);
        setField(term403597, term403597.getClass(), "user", null);
        setIntField(term403597, term403597.getClass(), "chapterId", 0);
        setIntField(term403597, term403597.getClass(), "jewelCount", 0);
        setIntField(term403597, term403597.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term403597, term403597.getClass(), "lastPlayMusicId", 0);
        setIntField(term403597, term403597.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term403597, term403597.getClass(), "isDialogWatched", false);
        setBooleanField(term403597, term403597.getClass(), "isStoryWatched", false);
        setBooleanField(term403597, term403597.getClass(), "isBossWatched", false);
        setBooleanField(term403597, term403597.getClass(), "isClear", false);
        setIntField(term403597, term403597.getClass(), "gaugeId", 0);
        setIntField(term403597, term403597.getClass(), "gaugeNum", 0);
        term403610 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term403610;
        callMethod(klass, "setStoryWatched", argTypes, term403597, args);
    }

};


