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

public class PlanetaryStatus_setFoodBonus_74947210012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7995;
     Object term8148;

    public PlanetaryStatus_setFoodBonus_74947210012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7995 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term8032 = (Object[]) newArray("java.lang.String", 8);
        setField(term7995, term7995.getClass(), "statusId", "OIHoJeysUi");
        setField(term7995, term7995.getClass(), "name", "WXMWFDGcLB");
        setField(term7995, term7995.getClass(), "description", "wKWbJssZuG");
        setElement(term8032, 0, "NzBMMhkhpT");
        setElement(term8032, 1, "qCpEbQDHdF");
        setElement(term8032, 2, "AHbZyFOmlo");
        setElement(term8032, 3, "TwfWVQGiIj");
        setElement(term8032, 4, "gUvcueTURF");
        setElement(term8032, 5, "EwQBhZjCIT");
        setElement(term8032, 6, "aSkmSwTnEw");
        setElement(term8032, 7, "xvkbvaEGYd");
        setField(term7995, term7995.getClass(), "conflictingIds", term8032);
        setIntField(term7995, term7995.getClass(), "foodBonus", 1041916673);
        setIntField(term7995, term7995.getClass(), "happinessBonus", -601863069);
        setIntField(term7995, term7995.getClass(), "mineBonus", 663292551);
        setIntField(term7995, term7995.getClass(), "prodBonus", -1885090354);
        setIntField(term7995, term7995.getClass(), "credBonus", -2066804303);
        setIntField(term7995, term7995.getClass(), "reseBonus", -1731761810);
        setBooleanField(term7995, term7995.getClass(), "hidden", true);
        setField(term7995, term7995.getClass(), "discoveryText", "HBGNxdNURv");
        term8148 = new Integer(197109649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8148;
        callMethod(klass, "setFoodBonus", argTypes, term7995, args);
    }

};


