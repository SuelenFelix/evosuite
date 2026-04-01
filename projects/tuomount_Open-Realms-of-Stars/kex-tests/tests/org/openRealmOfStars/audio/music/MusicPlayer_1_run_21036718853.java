package org.openRealmOfStars.audio.music;

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
import static org.openRealmOfStars.audio.music.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MusicPlayer_1_run_21036718853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2087;

    public MusicPlayer_1_run_21036718853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2087 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicPlayer$1"));
        setField(term2087, term2087.getClass(), "name", null);
        setIntField(term2087, term2087.getClass(), "priority", 0);
        setBooleanField(term2087, term2087.getClass(), "daemon", false);
        setBooleanField(term2087, term2087.getClass(), "stillborn", false);
        setLongField(term2087, term2087.getClass(), "eetop", 0L);
        setField(term2087, term2087.getClass(), "target", null);
        setField(term2087, term2087.getClass(), "group", null);
        setField(term2087, term2087.getClass(), "contextClassLoader", null);
        setField(term2087, term2087.getClass(), "inheritedAccessControlContext", null);
        setField(term2087, term2087.getClass(), "threadLocals", null);
        setField(term2087, term2087.getClass(), "inheritableThreadLocals", null);
        setLongField(term2087, term2087.getClass(), "stackSize", 0L);
        setLongField(term2087, term2087.getClass(), "tid", 0L);
        setIntField(term2087, term2087.getClass(), "threadStatus", 0);
        setField(term2087, term2087.getClass(), "parkBlocker", null);
        setField(term2087, term2087.getClass(), "blocker", null);
        setField(term2087, term2087.getClass(), "blockerLock", null);
        setField(term2087, term2087.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term2087, term2087.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term2087, term2087.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term2087, term2087.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.audio.music.MusicPlayer$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term2087, args);
    }

};


