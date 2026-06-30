package com.github.hannotify.elevencrazyjavathings.number4;

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
import static com.github.hannotify.elevencrazyjavathings.number4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Number4EqualityInClonedArraysOrImmutableCollections_getClonedTalks_3149352652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335;

    public Number4EqualityInClonedArraysOrImmutableCollections_getClonedTalks_3149352652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335 = newInstance(Class.forName("com.github.hannotify.elevencrazyjavathings.number4.Number4EqualityInClonedArraysOrImmutableCollections"));
        Object[] term336 = (Object[]) newArray("com.github.hannotify.elevencrazyjavathings.number10.Talk", 2);
        Object term337 = newInstance(Class.forName("com.github.hannotify.elevencrazyjavathings.number10.Talk"));
        Object term435 = newInstance(Class.forName("java.time.LocalTime"));
        Object term440 = newInstance(Class.forName("com.github.hannotify.elevencrazyjavathings.number10.Talk"));
        Object term508 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term337, term337.getClass(), "speaker", "Hanno Embregts");
        setField(term337, term337.getClass(), "title", "11 Crazy Things I Didn\'t Know You Could Do With Java Until I Got Java Certified");
        setByteField(term435, term435.getClass(), "hour", (byte) 7);
        setByteField(term435, term435.getClass(), "minute", (byte) 35);
        setByteField(term435, term435.getClass(), "second", (byte) 0);
        setIntField(term435, term435.getClass(), "nano", 0);
        setField(term337, term337.getClass(), "startTime", term435);
        setElement(term336, 0, term337);
        setField(term440, term440.getClass(), "speaker", "Rishin Mitra");
        setField(term440, term440.getClass(), "title", "Sheldon Cooper learns about JSON Relational Duality");
        setByteField(term508, term508.getClass(), "hour", (byte) 8);
        setByteField(term508, term508.getClass(), "minute", (byte) 35);
        setByteField(term508, term508.getClass(), "second", (byte) 0);
        setIntField(term508, term508.getClass(), "nano", 0);
        setField(term440, term440.getClass(), "startTime", term508);
        setElement(term336, 1, term440);
        setField(term335, term335.getClass(), "talks", term336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.hannotify.elevencrazyjavathings.number4.Number4EqualityInClonedArraysOrImmutableCollections");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClonedTalks", argTypes, term335, args);
    }

};


