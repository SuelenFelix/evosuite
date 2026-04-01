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

public class AppliedStatus_init_16653753700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public AppliedStatus_init_16653753700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term38 = (Object[]) newArray("java.lang.String", 5);
        setField(term1, term1.getClass(), "statusId", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "name", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "description", "MuLcgQHgqz");
        setElement(term38, 0, "xxtlPwDYFs");
        setElement(term38, 1, "jJCZpVmanW");
        setElement(term38, 2, "EGtDIRbSSb");
        setElement(term38, 3, "SzjVpOQTyS");
        setElement(term38, 4, "MjGYSRKTNF");
        setField(term1, term1.getClass(), "conflictingIds", term38);
        setIntField(term1, term1.getClass(), "foodBonus", 568599855);
        setIntField(term1, term1.getClass(), "happinessBonus", 1162663216);
        setIntField(term1, term1.getClass(), "mineBonus", 1484323161);
        setIntField(term1, term1.getClass(), "prodBonus", 391863371);
        setIntField(term1, term1.getClass(), "credBonus", -1922583790);
        setIntField(term1, term1.getClass(), "reseBonus", -616727354);
        setBooleanField(term1, term1.getClass(), "hidden", false);
        setField(term1, term1.getClass(), "discoveryText", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.AppliedStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


