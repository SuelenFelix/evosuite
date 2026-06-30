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

public class UserChapter_getLastPlayMusicLevel_72665994436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95861;

    public UserChapter_getLastPlayMusicLevel_72665994436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95861 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        setLongField(term95861, term95861.getClass(), "id", 0L);
        setField(term95861, term95861.getClass(), "user", null);
        setIntField(term95861, term95861.getClass(), "chapterId", 0);
        setIntField(term95861, term95861.getClass(), "jewelCount", 0);
        setIntField(term95861, term95861.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term95861, term95861.getClass(), "lastPlayMusicId", 0);
        setIntField(term95861, term95861.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term95861, term95861.getClass(), "isStoryWatched", false);
        setBooleanField(term95861, term95861.getClass(), "isClear", false);
        setIntField(term95861, term95861.getClass(), "skipTiming1", 0);
        setIntField(term95861, term95861.getClass(), "skipTiming2", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMusicLevel", argTypes, term95861, args);
    }

};


