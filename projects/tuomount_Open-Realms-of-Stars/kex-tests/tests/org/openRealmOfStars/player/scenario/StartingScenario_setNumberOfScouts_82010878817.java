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
import java.lang.Integer;

public class StartingScenario_setNumberOfScouts_82010878817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23374;
     Object term23493;

    public StartingScenario_setNumberOfScouts_82010878817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23506 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term23505 = ((Class) term23506).getDeclaredField((String) "DOOMED");
        ((Field) term23505).setAccessible(true);
        Object enum59 = ((Field) term23505).get((Object) null);
        Class<? extends Object> term23836 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term23835 = ((Class) term23836).getDeclaredField((String) "DESERT");
        ((Field) term23835).setAccessible(true);
        Object enum60 = ((Field) term23835).get((Object) null);
        Class<? extends Object> term24141 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term24140 = ((Class) term24141).getDeclaredField((String) "TROPICAL");
        ((Field) term24140).setAccessible(true);
        Object enum61 = ((Field) term24140).get((Object) null);
        ArrayList term23449 = new ArrayList();
        ((ArrayList) term23449).add("YpJbIgJWWv");
        ((ArrayList) term23449).add("JppkknKVOw");
        ArrayList term23477 = new ArrayList();
        ((ArrayList) term23477).add("iljANwuEjk");
        term23374 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term23374, term23374.getClass(), "id", "kVEZMHmRtR");
        setField(term23374, term23374.getClass(), "type", enum59);
        setField(term23374, term23374.getClass(), "name", "ekxGuOYIwi");
        setField(term23374, term23374.getClass(), "description", "RbVQXSpxXy");
        setIntField(term23374, term23374.getClass(), "numberOfScouts", -1263114719);
        setIntField(term23374, term23374.getClass(), "numberOfColonyShips", -894662986);
        setIntField(term23374, term23374.getClass(), "startingCredit", 304775596);
        setField(term23374, term23374.getClass(), "waterLevel", enum60);
        setField(term23374, term23374.getClass(), "temperature", enum61);
        setIntField(term23374, term23374.getClass(), "planetSize", -1347665717);
        setIntField(term23374, term23374.getClass(), "population", -1888585309);
        setIntField(term23374, term23374.getClass(), "colonyPop", 683666002);
        setField(term23374, term23374.getClass(), "extraTech", term23449);
        setField(term23374, term23374.getClass(), "buildings", term23477);
        term23493 = new Integer(1596213415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23493;
        callMethod(klass, "setNumberOfScouts", argTypes, term23374, args);
    }

};


