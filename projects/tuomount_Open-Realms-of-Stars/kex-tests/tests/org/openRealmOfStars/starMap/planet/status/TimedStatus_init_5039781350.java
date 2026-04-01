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
import java.lang.String;
import java.lang.Integer;

public class TimedStatus_init_5039781350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805;
     Object enum0;
     Object term948;

    public TimedStatus_init_5039781350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term805 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term842 = (Object[]) newArray("java.lang.String", 6);
        setField(term805, term805.getClass(), "statusId", "AijpHYOFuy");
        setField(term805, term805.getClass(), "name", "SbAoxhfrkn");
        setField(term805, term805.getClass(), "description", "kuTXqwMtDB");
        setElement(term842, 0, "Ghbwtircqb");
        setElement(term842, 1, "xrwlQZdwCp");
        setElement(term842, 2, "IDCWpPLRkE");
        setElement(term842, 3, "nyiiPDVjAc");
        setElement(term842, 4, "aKnKipADSo");
        setElement(term842, 5, "wSQxaModmm");
        setField(term805, term805.getClass(), "conflictingIds", term842);
        setIntField(term805, term805.getClass(), "foodBonus", 1135664017);
        setIntField(term805, term805.getClass(), "happinessBonus", 590364439);
        setIntField(term805, term805.getClass(), "mineBonus", 865208305);
        setIntField(term805, term805.getClass(), "prodBonus", -1275173084);
        setIntField(term805, term805.getClass(), "credBonus", -244121226);
        setIntField(term805, term805.getClass(), "reseBonus", -203030934);
        setBooleanField(term805, term805.getClass(), "hidden", true);
        setField(term805, term805.getClass(), "discoveryText", "UlajhuVLaP");
        Class<? extends Object> term1139 = Class.forName((String) "org.openRealmOfStars.starMap.planet.status.TimedStatusType");
        Field term1138 = ((Class) term1139).getDeclaredField((String) "GAME_START");
        ((Field) term1138).setAccessible(true);
        enum0 = ((Field) term1138).get((Object) null);
        term948 = new Integer(-1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatusType");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term805;
        args[1] = enum0;
        args[2] = term948;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


