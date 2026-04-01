package org.openRealmOfStars.player.scenario;

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
import static org.openRealmOfStars.player.scenario.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class StartingScenario_setTemperature_48176589720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27067;
     Object enum72;

    public StartingScenario_setTemperature_48176589720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27243 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term27242 = ((Class) term27243).getDeclaredField((String) "DOOMED");
        ((Field) term27242).setAccessible(true);
        Object enum69 = ((Field) term27242).get((Object) null);
        Class<? extends Object> term27573 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term27572 = ((Class) term27573).getDeclaredField((String) "MARINE");
        ((Field) term27572).setAccessible(true);
        Object enum70 = ((Field) term27572).get((Object) null);
        Class<? extends Object> term27878 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term27877 = ((Class) term27878).getDeclaredField((String) "ARCTIC");
        ((Field) term27877).setAccessible(true);
        Object enum71 = ((Field) term27877).get((Object) null);
        ArrayList term27140 = new ArrayList();
        ((ArrayList) term27140).add("vGiuZVPJNH");
        ArrayList term27156 = new ArrayList();
        ((ArrayList) term27156).add("tlzpzIjMib");
        ((ArrayList) term27156).add("AZdLeSugwv");
        ((ArrayList) term27156).add("RMsXuyzKJV");
        ((ArrayList) term27156).add("FwPbDZcHmB");
        ((ArrayList) term27156).add("hOncybyCAH");
        term27067 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term27067, term27067.getClass(), "id", "ZkMALXpEAZ");
        setField(term27067, term27067.getClass(), "type", enum69);
        setField(term27067, term27067.getClass(), "name", "tXfQjSqDzN");
        setField(term27067, term27067.getClass(), "description", "BjugTaMcxJ");
        setIntField(term27067, term27067.getClass(), "numberOfScouts", -1963434938);
        setIntField(term27067, term27067.getClass(), "numberOfColonyShips", 906181092);
        setIntField(term27067, term27067.getClass(), "startingCredit", 1045657203);
        setField(term27067, term27067.getClass(), "waterLevel", enum70);
        setField(term27067, term27067.getClass(), "temperature", enum71);
        setIntField(term27067, term27067.getClass(), "planetSize", 1386130016);
        setIntField(term27067, term27067.getClass(), "population", 1072005683);
        setIntField(term27067, term27067.getClass(), "colonyPop", 1861318859);
        setField(term27067, term27067.getClass(), "extraTech", term27140);
        setField(term27067, term27067.getClass(), "buildings", term27156);
        Class<? extends Object> term28248 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term28247 = ((Class) term28248).getDeclaredField((String) "VOLCANIC");
        ((Field) term28247).setAccessible(true);
        enum72 = ((Field) term28247).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Object[] args = new Object[1];
        args[0] = enum72;
        callMethod(klass, "setTemperature", argTypes, term27067, args);
    }

};


