package org.openRealmOfStars.gui.labels;

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
import static org.openRealmOfStars.gui.labels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SpaceComboBox_init_6888276980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86104;

    public SpaceComboBox_init_6888276980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86104 = (Object[]) newArray("java.lang.Object", 4);
        Object term86105 = newInstance(Class.forName("java.lang.Object"));
        Object term86106 = newInstance(Class.forName("java.lang.Object"));
        Object term86107 = newInstance(Class.forName("java.lang.Object"));
        Object term86108 = newInstance(Class.forName("java.lang.Object"));
        setElement(term86104, 0, term86105);
        setElement(term86104, 1, term86106);
        setElement(term86104, 2, term86107);
        setElement(term86104, 3, term86108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.SpaceComboBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term86104;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


