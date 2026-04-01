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

public class YellowScheme_getCoolSpaceColor_178835931230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6837;

    public YellowScheme_getCoolSpaceColor_178835931230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6837 = newInstance(Class.forName("org.openRealmOfStars.gui.scheme.YellowScheme"));
        setField(term6837, term6837.getClass(), "smallScrollUp", null);
        setField(term6837, term6837.getClass(), "smallScrollUpPressed", null);
        setField(term6837, term6837.getClass(), "smallScrollDown", null);
        setField(term6837, term6837.getClass(), "smallScrollDownPressed", null);
        setField(term6837, term6837.getClass(), "smallScrollLeft", null);
        setField(term6837, term6837.getClass(), "smallScrollLeftPressed", null);
        setField(term6837, term6837.getClass(), "smallScrollRight", null);
        setField(term6837, term6837.getClass(), "smallScrollRightPressed", null);
        setField(term6837, term6837.getClass(), "scrollLeft", null);
        setField(term6837, term6837.getClass(), "scrollLeftPressed", null);
        setField(term6837, term6837.getClass(), "scrollRight", null);
        setField(term6837, term6837.getClass(), "scrollRightPressed", null);
        setField(term6837, term6837.getClass(), "horizontalThumb", null);
        setField(term6837, term6837.getClass(), "verticalThumb", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.scheme.YellowScheme");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoolSpaceColor", argTypes, term6837, args);
    }

};


