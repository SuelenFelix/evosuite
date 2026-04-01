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

public class StartingScenario_getId_6896529396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10076;

    public StartingScenario_getId_6896529396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10200 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term10199 = ((Class) term10200).getDeclaredField((String) "UTOPIA_WORLD");
        ((Field) term10199).setAccessible(true);
        Object enum26 = ((Field) term10199).get((Object) null);
        Class<? extends Object> term10548 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term10547 = ((Class) term10548).getDeclaredField((String) "DESERT");
        ((Field) term10547).setAccessible(true);
        Object enum27 = ((Field) term10547).get((Object) null);
        Class<? extends Object> term10853 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term10852 = ((Class) term10853).getDeclaredField((String) "VOLCANIC");
        ((Field) term10852).setAccessible(true);
        Object enum28 = ((Field) term10852).get((Object) null);
        ArrayList term10157 = new ArrayList();
        ArrayList term10161 = new ArrayList();
        ((ArrayList) term10161).add("bLPjGVBhlX");
        ((ArrayList) term10161).add("whBvTVIIlC");
        term10076 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term10076, term10076.getClass(), "id", "kBdSllIBVz");
        setField(term10076, term10076.getClass(), "type", enum26);
        setField(term10076, term10076.getClass(), "name", "TJmVBGfTML");
        setField(term10076, term10076.getClass(), "description", "tPlsykYBqO");
        setIntField(term10076, term10076.getClass(), "numberOfScouts", -1179120542);
        setIntField(term10076, term10076.getClass(), "numberOfColonyShips", -73683645);
        setIntField(term10076, term10076.getClass(), "startingCredit", -226514366);
        setField(term10076, term10076.getClass(), "waterLevel", enum27);
        setField(term10076, term10076.getClass(), "temperature", enum28);
        setIntField(term10076, term10076.getClass(), "planetSize", 1193880199);
        setIntField(term10076, term10076.getClass(), "population", -1087774327);
        setIntField(term10076, term10076.getClass(), "colonyPop", -1530420153);
        setField(term10076, term10076.getClass(), "extraTech", term10157);
        setField(term10076, term10076.getClass(), "buildings", term10161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term10076, args);
    }

};


