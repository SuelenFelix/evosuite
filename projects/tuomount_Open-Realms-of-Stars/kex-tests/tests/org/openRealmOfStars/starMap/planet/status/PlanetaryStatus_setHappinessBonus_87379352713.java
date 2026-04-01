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

public class PlanetaryStatus_setHappinessBonus_87379352713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8270;
     Object term8399;

    public PlanetaryStatus_setHappinessBonus_87379352713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8270 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term8307 = (Object[]) newArray("java.lang.String", 6);
        setField(term8270, term8270.getClass(), "statusId", "mfCpTPPQQm");
        setField(term8270, term8270.getClass(), "name", "OcJCIDNIXA");
        setField(term8270, term8270.getClass(), "description", "XfRABIFVEp");
        setElement(term8307, 0, "MHGKyEnwKc");
        setElement(term8307, 1, "ShIELyuULw");
        setElement(term8307, 2, "IpQuOGMgmj");
        setElement(term8307, 3, "pJbnHTYrxn");
        setElement(term8307, 4, "iIRsCSYqXH");
        setElement(term8307, 5, "nghfqDXyCG");
        setField(term8270, term8270.getClass(), "conflictingIds", term8307);
        setIntField(term8270, term8270.getClass(), "foodBonus", -1239406390);
        setIntField(term8270, term8270.getClass(), "happinessBonus", 1557431527);
        setIntField(term8270, term8270.getClass(), "mineBonus", -1504890659);
        setIntField(term8270, term8270.getClass(), "prodBonus", 1358829571);
        setIntField(term8270, term8270.getClass(), "credBonus", 991356662);
        setIntField(term8270, term8270.getClass(), "reseBonus", -506958186);
        setBooleanField(term8270, term8270.getClass(), "hidden", true);
        setField(term8270, term8270.getClass(), "discoveryText", "WBAOTqErtm");
        term8399 = new Integer(-507387516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8399;
        callMethod(klass, "setHappinessBonus", argTypes, term8270, args);
    }

};


