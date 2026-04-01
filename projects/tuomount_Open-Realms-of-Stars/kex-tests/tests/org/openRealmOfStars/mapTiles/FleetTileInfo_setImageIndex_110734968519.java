package org.openRealmOfStars.mapTiles;

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
import static org.openRealmOfStars.mapTiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class FleetTileInfo_setImageIndex_110734968519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109175;
     Object term109181;

    public FleetTileInfo_setImageIndex_110734968519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109175 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        setField(term109175, term109175.getClass(), "race", null);
        setIntField(term109175, term109175.getClass(), "imageIndex", 0);
        setIntField(term109175, term109175.getClass(), "playerIndex", 0);
        setIntField(term109175, term109175.getClass(), "fleetIndex", 0);
        setIntField(term109175, term109175.getClass(), "planetIndex", 0);
        setIntField(term109175, term109175.getClass(), "conflictIndex", 0);
        term109181 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term109181;
        callMethod(klass, "setImageIndex", argTypes, term109175, args);
    }

};


