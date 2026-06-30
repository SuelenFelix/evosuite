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

public class UserChapter_setId_39470638841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95916;
     Object term95927;

    public UserChapter_setId_39470638841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95916 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        setLongField(term95916, term95916.getClass(), "id", 0L);
        setField(term95916, term95916.getClass(), "user", null);
        setIntField(term95916, term95916.getClass(), "chapterId", 0);
        setIntField(term95916, term95916.getClass(), "jewelCount", 0);
        setIntField(term95916, term95916.getClass(), "lastPlayMusicCategory", 0);
        setIntField(term95916, term95916.getClass(), "lastPlayMusicId", 0);
        setIntField(term95916, term95916.getClass(), "lastPlayMusicLevel", 0);
        setBooleanField(term95916, term95916.getClass(), "isStoryWatched", false);
        setBooleanField(term95916, term95916.getClass(), "isClear", false);
        setIntField(term95916, term95916.getClass(), "skipTiming1", 0);
        setIntField(term95916, term95916.getClass(), "skipTiming2", 0);
        term95927 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term95927;
        callMethod(klass, "setId", argTypes, term95916, args);
    }

};


