package org.openRealmOfStars.player.ship;

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
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class ShipStat_setObsolete_104845730842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227826;
     Object term227834;

    public ShipStat_setObsolete_104845730842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227826 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        setField(term227826, term227826.getClass(), "design", null);
        setIntField(term227826, term227826.getClass(), "numberOfCombats", 0);
        setIntField(term227826, term227826.getClass(), "numberOfVictories", 0);
        setIntField(term227826, term227826.getClass(), "numberOfLoses", 0);
        setIntField(term227826, term227826.getClass(), "numberOfKills", 0);
        setIntField(term227826, term227826.getClass(), "numberOfBuilt", 0);
        setIntField(term227826, term227826.getClass(), "numberOfInUse", 0);
        setBooleanField(term227826, term227826.getClass(), "obsolete", false);
        term227834 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term227834;
        callMethod(klass, "setObsolete", argTypes, term227826, args);
    }

};


