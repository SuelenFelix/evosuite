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

public class ShipStat_getNumberOfKills_99242500231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227732;

    public ShipStat_getNumberOfKills_99242500231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227732 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        setField(term227732, term227732.getClass(), "design", null);
        setIntField(term227732, term227732.getClass(), "numberOfCombats", 0);
        setIntField(term227732, term227732.getClass(), "numberOfVictories", 0);
        setIntField(term227732, term227732.getClass(), "numberOfLoses", 0);
        setIntField(term227732, term227732.getClass(), "numberOfKills", 0);
        setIntField(term227732, term227732.getClass(), "numberOfBuilt", 0);
        setIntField(term227732, term227732.getClass(), "numberOfInUse", 0);
        setBooleanField(term227732, term227732.getClass(), "obsolete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberOfKills", argTypes, term227732, args);
    }

};


