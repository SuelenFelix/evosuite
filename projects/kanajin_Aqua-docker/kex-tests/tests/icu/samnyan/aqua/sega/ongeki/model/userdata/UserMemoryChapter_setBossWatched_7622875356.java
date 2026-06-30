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

public class UserMemoryChapter_setBossWatched_7622875356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403612;
     Object term403625;

    public UserMemoryChapter_setBossWatched_7622875356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403612 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        setLongField(term403612, term403612.getClass(), "id", 0L);
        setField(term403612, term403612.getClass(), "user", null);
        setIntField(term403612, term403612.getClass(), "chapterId", 0);
        setIntField(term403612, term403612.getClass(), "jewelCount", 0);
        setIntField(term403612, term403612.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term403612, term403612.getClass(), "lastPlayMusicId", 0);
        setIntField(term403612, term403612.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term403612, term403612.getClass(), "isDialogWatched", false);
        setBooleanField(term403612, term403612.getClass(), "isStoryWatched", false);
        setBooleanField(term403612, term403612.getClass(), "isBossWatched", false);
        setBooleanField(term403612, term403612.getClass(), "isClear", false);
        setIntField(term403612, term403612.getClass(), "gaugeId", 0);
        setIntField(term403612, term403612.getClass(), "gaugeNum", 0);
        term403625 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term403625;
        callMethod(klass, "setBossWatched", argTypes, term403612, args);
    }

};


