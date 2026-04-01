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

public class ShipStat_setNumberOfBuilt_143569971534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227758;
     Object term227766;

    public ShipStat_setNumberOfBuilt_143569971534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227758 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        setField(term227758, term227758.getClass(), "design", null);
        setIntField(term227758, term227758.getClass(), "numberOfCombats", 0);
        setIntField(term227758, term227758.getClass(), "numberOfVictories", 0);
        setIntField(term227758, term227758.getClass(), "numberOfLoses", 0);
        setIntField(term227758, term227758.getClass(), "numberOfKills", 0);
        setIntField(term227758, term227758.getClass(), "numberOfBuilt", 0);
        setIntField(term227758, term227758.getClass(), "numberOfInUse", 0);
        setBooleanField(term227758, term227758.getClass(), "obsolete", false);
        term227766 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term227766;
        callMethod(klass, "setNumberOfBuilt", argTypes, term227758, args);
    }

};


