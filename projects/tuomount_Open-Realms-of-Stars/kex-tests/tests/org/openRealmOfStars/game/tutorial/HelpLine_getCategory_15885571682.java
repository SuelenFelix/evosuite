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

public class HelpLine_getCategory_15885571682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202;

    public HelpLine_getCategory_15885571682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202 = newInstance(Class.forName("org.openRealmOfStars.game.tutorial.HelpLine"));
        setIntField(term202, term202.getClass(), "index", -616727354);
        setField(term202, term202.getClass(), "category", "EGtDIRbSSb");
        setField(term202, term202.getClass(), "title", "SzjVpOQTyS");
        setField(term202, term202.getClass(), "text", "MjGYSRKTNF");
        setBooleanField(term202, term202.getClass(), "shown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.tutorial.HelpLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term202, args);
    }

};


