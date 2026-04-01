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

public class GreyScheme_getArrowRight_109752237741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13708;

    public GreyScheme_getArrowRight_109752237741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13708 = newInstance(Class.forName("org.openRealmOfStars.gui.scheme.GreyScheme"));
        setField(term13708, term13708.getClass(), "smallScrollUp", null);
        setField(term13708, term13708.getClass(), "smallScrollUpPressed", null);
        setField(term13708, term13708.getClass(), "smallScrollDown", null);
        setField(term13708, term13708.getClass(), "smallScrollDownPressed", null);
        setField(term13708, term13708.getClass(), "smallScrollLeft", null);
        setField(term13708, term13708.getClass(), "smallScrollLeftPressed", null);
        setField(term13708, term13708.getClass(), "smallScrollRight", null);
        setField(term13708, term13708.getClass(), "smallScrollRightPressed", null);
        setField(term13708, term13708.getClass(), "scrollLeft", null);
        setField(term13708, term13708.getClass(), "scrollLeftPressed", null);
        setField(term13708, term13708.getClass(), "scrollRight", null);
        setField(term13708, term13708.getClass(), "scrollRightPressed", null);
        setField(term13708, term13708.getClass(), "horizontalThumb", null);
        setField(term13708, term13708.getClass(), "verticalThumb", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.scheme.GreyScheme");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArrowRight", argTypes, term13708, args);
    }

};


