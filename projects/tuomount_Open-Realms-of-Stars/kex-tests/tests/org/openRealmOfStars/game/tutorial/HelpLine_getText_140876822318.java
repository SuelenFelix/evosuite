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

public class HelpLine_getText_140876822318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977;

    public HelpLine_getText_140876822318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term977 = newInstance(Class.forName("org.openRealmOfStars.game.tutorial.HelpLine"));
        setIntField(term977, term977.getClass(), "index", 0);
        setField(term977, term977.getClass(), "category", null);
        setField(term977, term977.getClass(), "title", null);
        setField(term977, term977.getClass(), "text", null);
        setBooleanField(term977, term977.getClass(), "shown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.tutorial.HelpLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term977, args);
    }

};


