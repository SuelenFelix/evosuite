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

public class PlanetaryStatus_setProdBonus_212865702115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8644;
     Object term8797;

    public PlanetaryStatus_setProdBonus_212865702115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8644 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term8681 = (Object[]) newArray("java.lang.String", 8);
        setField(term8644, term8644.getClass(), "statusId", "SIODFGaQhr");
        setField(term8644, term8644.getClass(), "name", "qYzsiuXOgS");
        setField(term8644, term8644.getClass(), "description", "bxrCBbrrct");
        setElement(term8681, 0, "CKWpJaaaxX");
        setElement(term8681, 1, "UBRmXJmfrt");
        setElement(term8681, 2, "WZzvmIHhzZ");
        setElement(term8681, 3, "doQLHkjpNm");
        setElement(term8681, 4, "lCyLIcSuom");
        setElement(term8681, 5, "CGOpQSZZwI");
        setElement(term8681, 6, "ypEdrstygY");
        setElement(term8681, 7, "sNQFlATEeQ");
        setField(term8644, term8644.getClass(), "conflictingIds", term8681);
        setIntField(term8644, term8644.getClass(), "foodBonus", -1899301124);
        setIntField(term8644, term8644.getClass(), "happinessBonus", -1882480155);
        setIntField(term8644, term8644.getClass(), "mineBonus", -1410220680);
        setIntField(term8644, term8644.getClass(), "prodBonus", 389427431);
        setIntField(term8644, term8644.getClass(), "credBonus", -1945706126);
        setIntField(term8644, term8644.getClass(), "reseBonus", 1152356969);
        setBooleanField(term8644, term8644.getClass(), "hidden", true);
        setField(term8644, term8644.getClass(), "discoveryText", "ZKMLioamsY");
        term8797 = new Integer(-1667990367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8797;
        callMethod(klass, "setProdBonus", argTypes, term8644, args);
    }

};


