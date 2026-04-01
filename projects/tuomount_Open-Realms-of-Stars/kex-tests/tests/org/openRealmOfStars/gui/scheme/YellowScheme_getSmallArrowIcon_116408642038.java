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

public class YellowScheme_getSmallArrowIcon_116408642038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6845;

    public YellowScheme_getSmallArrowIcon_116408642038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6845 = newInstance(Class.forName("org.openRealmOfStars.gui.scheme.YellowScheme"));
        setField(term6845, term6845.getClass(), "smallScrollUp", null);
        setField(term6845, term6845.getClass(), "smallScrollUpPressed", null);
        setField(term6845, term6845.getClass(), "smallScrollDown", null);
        setField(term6845, term6845.getClass(), "smallScrollDownPressed", null);
        setField(term6845, term6845.getClass(), "smallScrollLeft", null);
        setField(term6845, term6845.getClass(), "smallScrollLeftPressed", null);
        setField(term6845, term6845.getClass(), "smallScrollRight", null);
        setField(term6845, term6845.getClass(), "smallScrollRightPressed", null);
        setField(term6845, term6845.getClass(), "scrollLeft", null);
        setField(term6845, term6845.getClass(), "scrollLeftPressed", null);
        setField(term6845, term6845.getClass(), "scrollRight", null);
        setField(term6845, term6845.getClass(), "scrollRightPressed", null);
        setField(term6845, term6845.getClass(), "horizontalThumb", null);
        setField(term6845, term6845.getClass(), "verticalThumb", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.scheme.YellowScheme");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getSmallArrowIcon", argTypes, term6845, args);
    }

};


