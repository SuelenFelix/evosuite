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

public class StartingScenario_setNumberOfColonyShips_198353144018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24486;
     Object term24659;

    public StartingScenario_setNumberOfColonyShips_198353144018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24672 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term24671 = ((Class) term24672).getDeclaredField((String) "DOOMED");
        ((Field) term24671).setAccessible(true);
        Object enum62 = ((Field) term24671).get((Object) null);
        Class<? extends Object> term25002 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term25001 = ((Class) term25002).getDeclaredField((String) "HUMID");
        ((Field) term25001).setAccessible(true);
        Object enum63 = ((Field) term25001).get((Object) null);
        Class<? extends Object> term25304 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term25303 = ((Class) term25304).getDeclaredField((String) "HOT");
        ((Field) term25303).setAccessible(true);
        Object enum64 = ((Field) term25303).get((Object) null);
        ArrayList term24555 = new ArrayList();
        ArrayList term24559 = new ArrayList();
        ((ArrayList) term24559).add("sZdUNdggUW");
        ((ArrayList) term24559).add("OqbwYQfvAe");
        ((ArrayList) term24559).add("tRxZafjqIx");
        ((ArrayList) term24559).add("DhjNLmRMCu");
        ((ArrayList) term24559).add("PgPzMSEjjX");
        ((ArrayList) term24559).add("wzsPSPcRdj");
        ((ArrayList) term24559).add("kGMQdqJYyB");
        ((ArrayList) term24559).add("XJJNClzHRf");
        term24486 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term24486, term24486.getClass(), "id", "kNqaJKIATy");
        setField(term24486, term24486.getClass(), "type", enum62);
        setField(term24486, term24486.getClass(), "name", "vKQukfbJUd");
        setField(term24486, term24486.getClass(), "description", "lFRJFUMVbx");
        setIntField(term24486, term24486.getClass(), "numberOfScouts", -268815336);
        setIntField(term24486, term24486.getClass(), "numberOfColonyShips", -1210583429);
        setIntField(term24486, term24486.getClass(), "startingCredit", -663691365);
        setField(term24486, term24486.getClass(), "waterLevel", enum63);
        setField(term24486, term24486.getClass(), "temperature", enum64);
        setIntField(term24486, term24486.getClass(), "planetSize", 339854490);
        setIntField(term24486, term24486.getClass(), "population", -615654495);
        setIntField(term24486, term24486.getClass(), "colonyPop", -1476117762);
        setField(term24486, term24486.getClass(), "extraTech", term24555);
        setField(term24486, term24486.getClass(), "buildings", term24559);
        term24659 = new Integer(-341962980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24659;
        callMethod(klass, "setNumberOfColonyShips", argTypes, term24486, args);
    }

};


