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

public class HelpLine_setCategory_221472815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term968;

    public HelpLine_setCategory_221472815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term968 = newInstance(Class.forName("org.openRealmOfStars.game.tutorial.HelpLine"));
        setIntField(term968, term968.getClass(), "index", 0);
        setField(term968, term968.getClass(), "category", null);
        setField(term968, term968.getClass(), "title", null);
        setField(term968, term968.getClass(), "text", null);
        setBooleanField(term968, term968.getClass(), "shown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.tutorial.HelpLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCategory", argTypes, term968, args);
    }

};


