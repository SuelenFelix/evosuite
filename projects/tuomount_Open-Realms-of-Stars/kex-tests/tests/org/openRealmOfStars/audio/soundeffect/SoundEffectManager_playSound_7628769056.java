package org.openRealmOfStars.audio.soundeffect;

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
import static org.openRealmOfStars.audio.soundeffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SoundEffectManager_playSound_7628769056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1634;

    public SoundEffectManager_playSound_7628769056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1634 = newInstance(Class.forName("org.openRealmOfStars.audio.soundeffect.SoundEffectManager"));
        setField(term1634, term1634.getClass(), "soundEffects", null);
        setField(term1634, term1634.getClass(), "clips", null);
        setIntField(term1634, term1634.getClass(), "soundIndex", 0);
        setField(term1634, term1634.getClass(), "name", null);
        setIntField(term1634, term1634.getClass(), "priority", 0);
        setBooleanField(term1634, term1634.getClass(), "daemon", false);
        setBooleanField(term1634, term1634.getClass(), "stillborn", false);
        setLongField(term1634, term1634.getClass(), "eetop", 0L);
        setField(term1634, term1634.getClass(), "target", null);
        setField(term1634, term1634.getClass(), "group", null);
        setField(term1634, term1634.getClass(), "contextClassLoader", null);
        setField(term1634, term1634.getClass(), "inheritedAccessControlContext", null);
        setField(term1634, term1634.getClass(), "threadLocals", null);
        setField(term1634, term1634.getClass(), "inheritableThreadLocals", null);
        setLongField(term1634, term1634.getClass(), "stackSize", 0L);
        setLongField(term1634, term1634.getClass(), "tid", 0L);
        setIntField(term1634, term1634.getClass(), "threadStatus", 0);
        setField(term1634, term1634.getClass(), "parkBlocker", null);
        setField(term1634, term1634.getClass(), "blocker", null);
        setField(term1634, term1634.getClass(), "blockerLock", null);
        setField(term1634, term1634.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1634, term1634.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1634, term1634.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1634, term1634.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.audio.soundeffect.SoundEffectManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "playSound", argTypes, term1634, args);
    }

};


