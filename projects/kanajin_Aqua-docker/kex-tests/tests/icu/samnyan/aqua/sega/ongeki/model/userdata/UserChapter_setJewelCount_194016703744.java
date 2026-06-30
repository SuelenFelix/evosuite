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

public class UserChapter_setJewelCount_194016703744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95953;
     Object term95964;

    public UserChapter_setJewelCount_194016703744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95953 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        setLongField(term95953, term95953.getClass(), "id", 0L);
        setField(term95953, term95953.getClass(), "user", null);
        setIntField(term95953, term95953.getClass(), "chapterId", 0);
        setIntField(term95953, term95953.getClass(), "jewelCount", 0);
        setIntField(term95953, term95953.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term95953, term95953.getClass(), "lastPlayMusicId", 0);
        setIntField(term95953, term95953.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term95953, term95953.getClass(), "isStoryWatched", false);
        setBooleanField(term95953, term95953.getClass(), "isClear", false);
        setIntField(term95953, term95953.getClass(), "skipTiming1", 0);
        setIntField(term95953, term95953.getClass(), "skipTiming2", 0);
        term95964 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term95964;
        callMethod(klass, "setJewelCount", argTypes, term95953, args);
    }

};


