package org.openRealmOfStars.gui.scheme;

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
import static org.openRealmOfStars.gui.scheme.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class YellowScheme_getArrowRight_8317497441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6848;

    public YellowScheme_getArrowRight_8317497441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6848 = newInstance(Class.forName("org.openRealmOfStars.gui.scheme.YellowScheme"));
        setField(term6848, term6848.getClass(), "smallScrollUp", null);
        setField(term6848, term6848.getClass(), "smallScrollUpPressed", null);
        setField(term6848, term6848.getClass(), "smallScrollDown", null);
        setField(term6848, term6848.getClass(), "smallScrollDownPressed", null);
        setField(term6848, term6848.getClass(), "smallScrollLeft", null);
        setField(term6848, term6848.getClass(), "smallScrollLeftPressed", null);
        setField(term6848, term6848.getClass(), "smallScrollRight", null);
        setField(term6848, term6848.getClass(), "smallScrollRightPressed", null);
        setField(term6848, term6848.getClass(), "scrollLeft", null);
        setField(term6848, term6848.getClass(), "scrollLeftPressed", null);
        setField(term6848, term6848.getClass(), "scrollRight", null);
        setField(term6848, term6848.getClass(), "scrollRightPressed", null);
        setField(term6848, term6848.getClass(), "horizontalThumb", null);
        setField(term6848, term6848.getClass(), "verticalThumb", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.scheme.YellowScheme");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArrowRight", argTypes, term6848, args);
    }

};


