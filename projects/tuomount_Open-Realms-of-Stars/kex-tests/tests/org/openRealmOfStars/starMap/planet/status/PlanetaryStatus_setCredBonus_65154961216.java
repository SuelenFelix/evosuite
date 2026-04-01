package org.openRealmOfStars.starMap.planet.status;

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
import static org.openRealmOfStars.starMap.planet.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class PlanetaryStatus_setCredBonus_65154961216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8919;
     Object term9012;

    public PlanetaryStatus_setCredBonus_65154961216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8919 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term8956 = (Object[]) newArray("java.lang.String", 3);
        setField(term8919, term8919.getClass(), "statusId", "WVbxuoDBcn");
        setField(term8919, term8919.getClass(), "name", "pvDEABOxLt");
        setField(term8919, term8919.getClass(), "description", "beAMpkroCQ");
        setElement(term8956, 0, "uSUvKAyuvd");
        setElement(term8956, 1, "onQLVONGuf");
        setElement(term8956, 2, "SOrEHbcbmn");
        setField(term8919, term8919.getClass(), "conflictingIds", term8956);
        setIntField(term8919, term8919.getClass(), "foodBonus", -1214628358);
        setIntField(term8919, term8919.getClass(), "happinessBonus", 1102721075);
        setIntField(term8919, term8919.getClass(), "mineBonus", -426764678);
        setIntField(term8919, term8919.getClass(), "prodBonus", -1222614956);
        setIntField(term8919, term8919.getClass(), "credBonus", -1870495012);
        setIntField(term8919, term8919.getClass(), "reseBonus", -1310015129);
        setBooleanField(term8919, term8919.getClass(), "hidden", true);
        setField(term8919, term8919.getClass(), "discoveryText", "bnsyeQXFdu");
        term9012 = new Integer(-2104981311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9012;
        callMethod(klass, "setCredBonus", argTypes, term8919, args);
    }

};


