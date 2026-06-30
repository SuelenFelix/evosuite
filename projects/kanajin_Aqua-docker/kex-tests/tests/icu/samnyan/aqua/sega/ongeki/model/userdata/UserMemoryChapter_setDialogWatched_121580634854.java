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

public class UserMemoryChapter_setDialogWatched_121580634854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403582;
     Object term403595;

    public UserMemoryChapter_setDialogWatched_121580634854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403582 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        setLongField(term403582, term403582.getClass(), "id", 0L);
        setField(term403582, term403582.getClass(), "user", null);
        setIntField(term403582, term403582.getClass(), "chapterId", 0);
        setIntField(term403582, term403582.getClass(), "jewelCount", 0);
        setIntField(term403582, term403582.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term403582, term403582.getClass(), "lastPlayMusicId", 0);
        setIntField(term403582, term403582.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term403582, term403582.getClass(), "isDialogWatched", false);
        setBooleanField(term403582, term403582.getClass(), "isStoryWatched", false);
        setBooleanField(term403582, term403582.getClass(), "isBossWatched", false);
        setBooleanField(term403582, term403582.getClass(), "isClear", false);
        setIntField(term403582, term403582.getClass(), "gaugeId", 0);
        setIntField(term403582, term403582.getClass(), "gaugeNum", 0);
        term403595 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term403595;
        callMethod(klass, "setDialogWatched", argTypes, term403582, args);
    }

};


