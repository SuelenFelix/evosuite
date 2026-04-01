package org.openRealmOfStars.player.diplomacy.speeches;

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
import static org.openRealmOfStars.player.diplomacy.speeches.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpeechSet_getId_21254290745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37034;

    public SpeechSet_getId_21254290745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37034 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechSet"));
        setField(term37034, term37034.getClass(), "spSetId", null);
        setField(term37034, term37034.getClass(), "speechData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term37034, args);
    }

};


