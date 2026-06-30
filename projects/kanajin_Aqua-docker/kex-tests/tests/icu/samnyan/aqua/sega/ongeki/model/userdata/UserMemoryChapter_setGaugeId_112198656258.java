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

public class UserMemoryChapter_setGaugeId_112198656258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403642;
     Object term403655;

    public UserMemoryChapter_setGaugeId_112198656258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403642 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        setLongField(term403642, term403642.getClass(), "id", 0L);
        setField(term403642, term403642.getClass(), "user", null);
        setIntField(term403642, term403642.getClass(), "chapterId", 0);
        setIntField(term403642, term403642.getClass(), "jewelCount", 0);
        setIntField(term403642, term403642.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term403642, term403642.getClass(), "lastPlayMusicId", 0);
        setIntField(term403642, term403642.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term403642, term403642.getClass(), "isDialogWatched", false);
        setBooleanField(term403642, term403642.getClass(), "isStoryWatched", false);
        setBooleanField(term403642, term403642.getClass(), "isBossWatched", false);
        setBooleanField(term403642, term403642.getClass(), "isClear", false);
        setIntField(term403642, term403642.getClass(), "gaugeId", 0);
        setIntField(term403642, term403642.getClass(), "gaugeNum", 0);
        term403655 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term403655;
        callMethod(klass, "setGaugeId", argTypes, term403642, args);
    }

};


