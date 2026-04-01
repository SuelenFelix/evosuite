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
import java.lang.String;
import java.lang.Object;

public class SpeechLine_getType_18917142931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4892;

    public SpeechLine_getType_18917142931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4915 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.speeches.SpeechType");
        Field term4914 = ((Class) term4915).getDeclaredField((String) "TRADE");
        ((Field) term4914).setAccessible(true);
        Object enum11 = ((Field) term4914).get((Object) null);
        term4892 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechLine"));
        setField(term4892, term4892.getClass(), "type", enum11);
        setField(term4892, term4892.getClass(), "line", "GzFkzHGYFt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.speeches.SpeechLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term4892, args);
    }

};


