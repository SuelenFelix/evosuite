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

public class GreyScheme_getVerticalThumb_59899399248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13715;

    public GreyScheme_getVerticalThumb_59899399248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13715 = newInstance(Class.forName("org.openRealmOfStars.gui.scheme.GreyScheme"));
        setField(term13715, term13715.getClass(), "smallScrollUp", null);
        setField(term13715, term13715.getClass(), "smallScrollUpPressed", null);
        setField(term13715, term13715.getClass(), "smallScrollDown", null);
        setField(term13715, term13715.getClass(), "smallScrollDownPressed", null);
        setField(term13715, term13715.getClass(), "smallScrollLeft", null);
        setField(term13715, term13715.getClass(), "smallScrollLeftPressed", null);
        setField(term13715, term13715.getClass(), "smallScrollRight", null);
        setField(term13715, term13715.getClass(), "smallScrollRightPressed", null);
        setField(term13715, term13715.getClass(), "scrollLeft", null);
        setField(term13715, term13715.getClass(), "scrollLeftPressed", null);
        setField(term13715, term13715.getClass(), "scrollRight", null);
        setField(term13715, term13715.getClass(), "scrollRightPressed", null);
        setField(term13715, term13715.getClass(), "horizontalThumb", null);
        setField(term13715, term13715.getClass(), "verticalThumb", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.scheme.GreyScheme");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVerticalThumb", argTypes, term13715, args);
    }

};


