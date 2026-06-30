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
import java.lang.Integer;

public class UserMemoryChapter_setChapterId_190211229849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403507;
     Object term403520;

    public UserMemoryChapter_setChapterId_190211229849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403507 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        setLongField(term403507, term403507.getClass(), "id", 0L);
        setField(term403507, term403507.getClass(), "user", null);
        setIntField(term403507, term403507.getClass(), "chapterId", 0);
        setIntField(term403507, term403507.getClass(), "jewelCount", 0);
        setIntField(term403507, term403507.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term403507, term403507.getClass(), "lastPlayMusicId", 0);
        setIntField(term403507, term403507.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term403507, term403507.getClass(), "isDialogWatched", false);
        setBooleanField(term403507, term403507.getClass(), "isStoryWatched", false);
        setBooleanField(term403507, term403507.getClass(), "isBossWatched", false);
        setBooleanField(term403507, term403507.getClass(), "isClear", false);
        setIntField(term403507, term403507.getClass(), "gaugeId", 0);
        setIntField(term403507, term403507.getClass(), "gaugeNum", 0);
        term403520 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term403520;
        callMethod(klass, "setChapterId", argTypes, term403507, args);
    }

};


