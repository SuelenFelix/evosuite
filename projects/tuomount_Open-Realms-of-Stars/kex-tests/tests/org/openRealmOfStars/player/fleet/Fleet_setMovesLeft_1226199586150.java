package org.openRealmOfStars.player.fleet;

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
import static org.openRealmOfStars.player.fleet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Fleet_setMovesLeft_1226199586150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194078;
     Object term194080;

    public Fleet_setMovesLeft_1226199586150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194078 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term194078, term194078.getClass(), "ships", null);
        setField(term194078, term194078.getClass(), "coordinate", null);
        setField(term194078, term194078.getClass(), "name", null);
        setIntField(term194078, term194078.getClass(), "movesLeft", 0);
        setField(term194078, term194078.getClass(), "route", null);
        setField(term194078, term194078.getClass(), "commander", null);
        setField(term194078, term194078.getClass(), "aStarSearch", null);
        term194080 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term194080;
        callMethod(klass, "setMovesLeft", argTypes, term194078, args);
    }

};


