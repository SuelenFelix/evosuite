package org.openRealmOfStars.gui.buttons;

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
import static org.openRealmOfStars.gui.buttons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SpaceCombo_init_740139950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19441;

    public SpaceCombo_init_740139950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19441 = (Object[]) newArray("java.lang.Object", 4);
        Object term19442 = newInstance(Class.forName("java.lang.Object"));
        Object term19443 = newInstance(Class.forName("java.lang.Object"));
        Object term19444 = newInstance(Class.forName("java.lang.Object"));
        Object term19445 = newInstance(Class.forName("java.lang.Object"));
        setElement(term19441, 0, term19442);
        setElement(term19441, 1, term19443);
        setElement(term19441, 2, term19444);
        setElement(term19441, 3, term19445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.SpaceCombo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term19441;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


