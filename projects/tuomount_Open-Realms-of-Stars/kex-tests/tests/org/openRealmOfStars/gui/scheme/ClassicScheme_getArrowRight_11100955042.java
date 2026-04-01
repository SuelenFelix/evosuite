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

public class ClassicScheme_getArrowRight_11100955042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21969;

    public ClassicScheme_getArrowRight_11100955042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21969 = newInstance(Class.forName("org.openRealmOfStars.gui.scheme.ClassicScheme"));
        setField(term21969, term21969.getClass(), "smallScrollUp", null);
        setField(term21969, term21969.getClass(), "smallScrollUpPressed", null);
        setField(term21969, term21969.getClass(), "smallScrollDown", null);
        setField(term21969, term21969.getClass(), "smallScrollDownPressed", null);
        setField(term21969, term21969.getClass(), "smallScrollLeft", null);
        setField(term21969, term21969.getClass(), "smallScrollLeftPressed", null);
        setField(term21969, term21969.getClass(), "smallScrollRight", null);
        setField(term21969, term21969.getClass(), "smallScrollRightPressed", null);
        setField(term21969, term21969.getClass(), "scrollLeft", null);
        setField(term21969, term21969.getClass(), "scrollLeftPressed", null);
        setField(term21969, term21969.getClass(), "scrollRight", null);
        setField(term21969, term21969.getClass(), "scrollRightPressed", null);
        setField(term21969, term21969.getClass(), "horizontalThumb", null);
        setField(term21969, term21969.getClass(), "verticalThumb", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.scheme.ClassicScheme");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArrowRight", argTypes, term21969, args);
    }

};


