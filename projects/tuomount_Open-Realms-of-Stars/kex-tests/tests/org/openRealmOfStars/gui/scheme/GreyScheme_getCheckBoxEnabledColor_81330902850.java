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

public class GreyScheme_getCheckBoxEnabledColor_81330902850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13717;

    public GreyScheme_getCheckBoxEnabledColor_81330902850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13717 = newInstance(Class.forName("org.openRealmOfStars.gui.scheme.GreyScheme"));
        setField(term13717, term13717.getClass(), "smallScrollUp", null);
        setField(term13717, term13717.getClass(), "smallScrollUpPressed", null);
        setField(term13717, term13717.getClass(), "smallScrollDown", null);
        setField(term13717, term13717.getClass(), "smallScrollDownPressed", null);
        setField(term13717, term13717.getClass(), "smallScrollLeft", null);
        setField(term13717, term13717.getClass(), "smallScrollLeftPressed", null);
        setField(term13717, term13717.getClass(), "smallScrollRight", null);
        setField(term13717, term13717.getClass(), "smallScrollRightPressed", null);
        setField(term13717, term13717.getClass(), "scrollLeft", null);
        setField(term13717, term13717.getClass(), "scrollLeftPressed", null);
        setField(term13717, term13717.getClass(), "scrollRight", null);
        setField(term13717, term13717.getClass(), "scrollRightPressed", null);
        setField(term13717, term13717.getClass(), "horizontalThumb", null);
        setField(term13717, term13717.getClass(), "verticalThumb", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.scheme.GreyScheme");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCheckBoxEnabledColor", argTypes, term13717, args);
    }

};


