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

public class UserMemoryChapter_equals_65747508060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403672;

    public UserMemoryChapter_equals_65747508060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403672 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        setLongField(term403672, term403672.getClass(), "id", 0L);
        setField(term403672, term403672.getClass(), "user", null);
        setIntField(term403672, term403672.getClass(), "chapterId", 0);
        setIntField(term403672, term403672.getClass(), "jewelCount", 0);
        setIntField(term403672, term403672.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term403672, term403672.getClass(), "lastPlayMusicId", 0);
        setIntField(term403672, term403672.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term403672, term403672.getClass(), "isDialogWatched", false);
        setBooleanField(term403672, term403672.getClass(), "isStoryWatched", false);
        setBooleanField(term403672, term403672.getClass(), "isBossWatched", false);
        setBooleanField(term403672, term403672.getClass(), "isClear", false);
        setIntField(term403672, term403672.getClass(), "gaugeId", 0);
        setIntField(term403672, term403672.getClass(), "gaugeNum", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term403672, args);
    }

};


