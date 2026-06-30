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

public class Number4EqualityInClonedArraysOrImmutableCollections_getTalks_1821470024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669;

    public Number4EqualityInClonedArraysOrImmutableCollections_getTalks_1821470024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term669 = newInstance(Class.forName("com.github.hannotify.elevencrazyjavathings.number4.Number4EqualityInClonedArraysOrImmutableCollections"));
        setField(term669, term669.getClass(), "talks", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.hannotify.elevencrazyjavathings.number4.Number4EqualityInClonedArraysOrImmutableCollections");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTalks", argTypes, term669, args);
    }

};


