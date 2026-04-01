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

public class SpeechSet_setSpeechData_12863753117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37036;

    public SpeechSet_setSpeechData_12863753117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37036 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechSet"));
        setField(term37036, term37036.getClass(), "spSetId", null);
        setField(term37036, term37036.getClass(), "speechData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "setSpeechData", argTypes, term37036, args);
    }

};


