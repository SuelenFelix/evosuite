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

public class PlanetaryStatus_setReseBonus_6495709917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9084;
     Object term9213;

    public PlanetaryStatus_setReseBonus_6495709917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9084 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term9121 = (Object[]) newArray("java.lang.String", 6);
        setField(term9084, term9084.getClass(), "statusId", "BwtdjiefJn");
        setField(term9084, term9084.getClass(), "name", "jDmhBrIoDa");
        setField(term9084, term9084.getClass(), "description", "SPtPatHeOm");
        setElement(term9121, 0, "ywmcuThdfL");
        setElement(term9121, 1, "GBOEuByOfr");
        setElement(term9121, 2, "NHbOFFjyVK");
        setElement(term9121, 3, "zaloBqlrSo");
        setElement(term9121, 4, "vvoLrMGCoN");
        setElement(term9121, 5, "pXdglvyrQe");
        setField(term9084, term9084.getClass(), "conflictingIds", term9121);
        setIntField(term9084, term9084.getClass(), "foodBonus", -571169753);
        setIntField(term9084, term9084.getClass(), "happinessBonus", 318591690);
        setIntField(term9084, term9084.getClass(), "mineBonus", -165587447);
        setIntField(term9084, term9084.getClass(), "prodBonus", -1347358701);
        setIntField(term9084, term9084.getClass(), "credBonus", 806595993);
        setIntField(term9084, term9084.getClass(), "reseBonus", 548228925);
        setBooleanField(term9084, term9084.getClass(), "hidden", false);
        setField(term9084, term9084.getClass(), "discoveryText", "OcfNzHYdki");
        term9213 = new Integer(-749861210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9213;
        callMethod(klass, "setReseBonus", argTypes, term9084, args);
    }

};


