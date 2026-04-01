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

public class SoundEffectManager_run_20970432427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1646;

    public SoundEffectManager_run_20970432427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1646 = newInstance(Class.forName("org.openRealmOfStars.audio.soundeffect.SoundEffectManager"));
        setField(term1646, term1646.getClass(), "soundEffects", null);
        setField(term1646, term1646.getClass(), "clips", null);
        setIntField(term1646, term1646.getClass(), "soundIndex", 0);
        setField(term1646, term1646.getClass(), "name", null);
        setIntField(term1646, term1646.getClass(), "priority", 0);
        setBooleanField(term1646, term1646.getClass(), "daemon", false);
        setBooleanField(term1646, term1646.getClass(), "stillborn", false);
        setLongField(term1646, term1646.getClass(), "eetop", 0L);
        setField(term1646, term1646.getClass(), "target", null);
        setField(term1646, term1646.getClass(), "group", null);
        setField(term1646, term1646.getClass(), "contextClassLoader", null);
        setField(term1646, term1646.getClass(), "inheritedAccessControlContext", null);
        setField(term1646, term1646.getClass(), "threadLocals", null);
        setField(term1646, term1646.getClass(), "inheritableThreadLocals", null);
        setLongField(term1646, term1646.getClass(), "stackSize", 0L);
        setLongField(term1646, term1646.getClass(), "tid", 0L);
        setIntField(term1646, term1646.getClass(), "threadStatus", 0);
        setField(term1646, term1646.getClass(), "parkBlocker", null);
        setField(term1646, term1646.getClass(), "blocker", null);
        setField(term1646, term1646.getClass(), "blockerLock", null);
        setField(term1646, term1646.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term1646, term1646.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term1646, term1646.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term1646, term1646.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.audio.soundeffect.SoundEffectManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term1646, args);
    }

};


