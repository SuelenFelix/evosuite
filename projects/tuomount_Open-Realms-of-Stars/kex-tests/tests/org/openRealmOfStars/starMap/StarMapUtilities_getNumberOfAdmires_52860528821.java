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
import java.lang.Integer;
import java.util.ArrayList;

public class StarMapUtilities_getNumberOfAdmires_52860528821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3623647;
     Object term3623649;

    public StarMapUtilities_getNumberOfAdmires_52860528821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3623647 = new Integer(-993733947);
        ArrayList term3623650 = new ArrayList();
        term3623649 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term3623649, term3623649.getClass(), "list", term3623650);
        setIntField(term3623649, term3623649.getClass(), "currentPlayer", 1425453172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = term3623647;
        args[1] = term3623649;
        callMethod(klass, "getNumberOfAdmires", argTypes, null, args);
    }

};


