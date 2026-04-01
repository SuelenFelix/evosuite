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
import java.lang.Integer;

public class ShipStat_setNumberOfLoses_131334669130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227722;
     Object term227730;

    public ShipStat_setNumberOfLoses_131334669130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227722 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        setField(term227722, term227722.getClass(), "design", null);
        setIntField(term227722, term227722.getClass(), "numberOfCombats", 0);
        setIntField(term227722, term227722.getClass(), "numberOfVictories", 0);
        setIntField(term227722, term227722.getClass(), "numberOfLoses", 0);
        setIntField(term227722, term227722.getClass(), "numberOfKills", 0);
        setIntField(term227722, term227722.getClass(), "numberOfBuilt", 0);
        setIntField(term227722, term227722.getClass(), "numberOfInUse", 0);
        setBooleanField(term227722, term227722.getClass(), "obsolete", false);
        term227730 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term227730;
        callMethod(klass, "setNumberOfLoses", argTypes, term227722, args);
    }

};


