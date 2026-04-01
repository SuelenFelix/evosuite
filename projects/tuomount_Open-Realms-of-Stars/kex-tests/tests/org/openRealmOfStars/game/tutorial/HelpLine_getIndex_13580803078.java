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

public class HelpLine_getIndex_13580803078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682;

    public HelpLine_getIndex_13580803078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term682 = newInstance(Class.forName("org.openRealmOfStars.game.tutorial.HelpLine"));
        setIntField(term682, term682.getClass(), "index", -522618178);
        setField(term682, term682.getClass(), "category", "flxyYxBRtu");
        setField(term682, term682.getClass(), "title", "OclPbYPkcH");
        setField(term682, term682.getClass(), "text", "IoAlmYsBwc");
        setBooleanField(term682, term682.getClass(), "shown", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.tutorial.HelpLine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIndex", argTypes, term682, args);
    }

};


