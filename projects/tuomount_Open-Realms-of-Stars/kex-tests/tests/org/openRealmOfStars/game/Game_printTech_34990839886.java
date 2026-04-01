package org.openRealmOfStars.game;

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
import static org.openRealmOfStars.game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class Game_printTech_34990839886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2203734;
     Object enum4446;
     Object term2203809;

    public Game_printTech_34990839886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2203734 = (Object[]) newArray("java.lang.String", 5);
        setElement(term2203734, 0, "ApUARqNMyD");
        setElement(term2203734, 1, "LDlsiwqNgh");
        setElement(term2203734, 2, "sjOSIZEJcG");
        setElement(term2203734, 3, "IbZKtNXgzN");
        setElement(term2203734, 4, "HiTKsxsLpp");
        Class<? extends Object> term2203862 = Class.forName((String) "org.openRealmOfStars.player.tech.TechType");
        Field term2203861 = ((Class) term2203862).getDeclaredField((String) "Propulsion");
        ((Field) term2203861).setAccessible(true);
        enum4446 = ((Field) term2203861).get((Object) null);
        term2203809 = new Integer(1567756346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2203734;
        args[1] = enum4446;
        args[2] = term2203809;
        callMethod(klass, "printTech", argTypes, null, args);
    }

};


