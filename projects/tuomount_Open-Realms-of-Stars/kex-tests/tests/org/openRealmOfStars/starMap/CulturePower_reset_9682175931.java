package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CulturePower_reset_9682175931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3376818;

    public CulturePower_reset_9682175931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3376818 = newInstance(Class.forName("org.openRealmOfStars.starMap.CulturePower"));
        int[] term3376819 = (int[]) newIntArray(4);
        setIntElement(term3376819, 0, 1292626075);
        setIntElement(term3376819, 1, -776899306);
        setIntElement(term3376819, 2, 1542922322);
        setIntElement(term3376819, 3, -1409223077);
        setField(term3376818, term3376818.getClass(), "culture", term3376819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.CulturePower");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term3376818, args);
    }

};


