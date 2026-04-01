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

public class ShipStat_getDesignStatsAsHtml_2781031239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227802;

    public ShipStat_getDesignStatsAsHtml_2781031239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227802 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        setField(term227802, term227802.getClass(), "design", null);
        setIntField(term227802, term227802.getClass(), "numberOfCombats", 0);
        setIntField(term227802, term227802.getClass(), "numberOfVictories", 0);
        setIntField(term227802, term227802.getClass(), "numberOfLoses", 0);
        setIntField(term227802, term227802.getClass(), "numberOfKills", 0);
        setIntField(term227802, term227802.getClass(), "numberOfBuilt", 0);
        setIntField(term227802, term227802.getClass(), "numberOfInUse", 0);
        setBooleanField(term227802, term227802.getClass(), "obsolete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDesignStatsAsHtml", argTypes, term227802, args);
    }

};


