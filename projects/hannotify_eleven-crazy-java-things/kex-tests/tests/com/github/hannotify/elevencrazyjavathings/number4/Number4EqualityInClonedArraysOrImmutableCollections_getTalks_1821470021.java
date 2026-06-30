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

public class Number4EqualityInClonedArraysOrImmutableCollections_getTalks_1821470021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Number4EqualityInClonedArraysOrImmutableCollections_getTalks_1821470021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.github.hannotify.elevencrazyjavathings.number4.Number4EqualityInClonedArraysOrImmutableCollections"));
        Object[] term2 = (Object[]) newArray("com.github.hannotify.elevencrazyjavathings.number10.Talk", 2);
        Object term3 = newInstance(Class.forName("com.github.hannotify.elevencrazyjavathings.number10.Talk"));
        Object term101 = newInstance(Class.forName("java.time.LocalTime"));
        Object term106 = newInstance(Class.forName("com.github.hannotify.elevencrazyjavathings.number10.Talk"));
        Object term174 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3, term3.getClass(), "speaker", "Hanno Embregts");
        setField(term3, term3.getClass(), "title", "11 Crazy Things I Didn\'t Know You Could Do With Java Until I Got Java Certified");
        setByteField(term101, term101.getClass(), "hour", (byte) 7);
        setByteField(term101, term101.getClass(), "minute", (byte) 35);
        setByteField(term101, term101.getClass(), "second", (byte) 0);
        setIntField(term101, term101.getClass(), "nano", 0);
        setField(term3, term3.getClass(), "startTime", term101);
        setElement(term2, 0, term3);
        setField(term106, term106.getClass(), "speaker", "Rishin Mitra");
        setField(term106, term106.getClass(), "title", "Sheldon Cooper learns about JSON Relational Duality");
        setByteField(term174, term174.getClass(), "hour", (byte) 8);
        setByteField(term174, term174.getClass(), "minute", (byte) 35);
        setByteField(term174, term174.getClass(), "second", (byte) 0);
        setIntField(term174, term174.getClass(), "nano", 0);
        setField(term106, term106.getClass(), "startTime", term174);
        setElement(term2, 1, term106);
        setField(term1, term1.getClass(), "talks", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.hannotify.elevencrazyjavathings.number4.Number4EqualityInClonedArraysOrImmutableCollections");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTalks", argTypes, term1, args);
    }

};


