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

public class Fleet_setaStarSearch_1816540424141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194058;

    public Fleet_setaStarSearch_1816540424141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194058 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term194058, term194058.getClass(), "ships", null);
        setField(term194058, term194058.getClass(), "coordinate", null);
        setField(term194058, term194058.getClass(), "name", null);
        setIntField(term194058, term194058.getClass(), "movesLeft", 0);
        setField(term194058, term194058.getClass(), "route", null);
        setField(term194058, term194058.getClass(), "commander", null);
        setField(term194058, term194058.getClass(), "aStarSearch", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setaStarSearch", argTypes, term194058, args);
    }

};


