package org.openRealmOfStars.game.tutorial;

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
import static org.openRealmOfStars.game.tutorial.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HelpLine_toString_19302524409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term751;

    public HelpLine_toString_19302524409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term751 = newInstance(Class.forName("org.openRealmOfStars.game.tutorial.HelpLine"));
        setIntField(term751, term751.getClass(), "index", 1134449235);
        setField(term751, term751.getClass(), "category", "TEParAifyi");
        setField(term751, term751.getClass(), "title", "OWDIEULEFu");
        setField(term751, term751.getClass(), "text", "dWRymuLBtr");
        setBooleanField(term751, term751.getClass(), "shown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.tutorial.HelpLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term751, args);
    }

};


