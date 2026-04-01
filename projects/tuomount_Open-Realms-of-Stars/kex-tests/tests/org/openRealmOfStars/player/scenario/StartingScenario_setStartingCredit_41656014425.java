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

public class StartingScenario_setStartingCredit_41656014425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33295;
     Object term33548;

    public StartingScenario_setStartingCredit_41656014425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33561 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term33560 = ((Class) term33561).getDeclaredField((String) "UTOPIA_WORLD");
        ((Field) term33560).setAccessible(true);
        Object enum85 = ((Field) term33560).get((Object) null);
        Class<? extends Object> term33909 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term33908 = ((Class) term33909).getDeclaredField((String) "BARREN");
        ((Field) term33908).setAccessible(true);
        Object enum86 = ((Field) term33908).get((Object) null);
        Class<? extends Object> term34214 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term34213 = ((Class) term34214).getDeclaredField((String) "COLD");
        ((Field) term34213).setAccessible(true);
        Object enum87 = ((Field) term34213).get((Object) null);
        ArrayList term33372 = new ArrayList();
        ((ArrayList) term33372).add("bxrCBbrrct");
        ((ArrayList) term33372).add("CKWpJaaaxX");
        ((ArrayList) term33372).add("UBRmXJmfrt");
        ((ArrayList) term33372).add("WZzvmIHhzZ");
        ((ArrayList) term33372).add("doQLHkjpNm");
        ((ArrayList) term33372).add("lCyLIcSuom");
        ((ArrayList) term33372).add("CGOpQSZZwI");
        ArrayList term33460 = new ArrayList();
        ((ArrayList) term33460).add("ypEdrstygY");
        ((ArrayList) term33460).add("sNQFlATEeQ");
        ((ArrayList) term33460).add("ZKMLioamsY");
        ((ArrayList) term33460).add("WVbxuoDBcn");
        ((ArrayList) term33460).add("pvDEABOxLt");
        ((ArrayList) term33460).add("beAMpkroCQ");
        ((ArrayList) term33460).add("uSUvKAyuvd");
        term33295 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term33295, term33295.getClass(), "id", "vOuMEpOQAg");
        setField(term33295, term33295.getClass(), "type", enum85);
        setField(term33295, term33295.getClass(), "name", "SIODFGaQhr");
        setField(term33295, term33295.getClass(), "description", "qYzsiuXOgS");
        setIntField(term33295, term33295.getClass(), "numberOfScouts", -1697741339);
        setIntField(term33295, term33295.getClass(), "numberOfColonyShips", 98922530);
        setIntField(term33295, term33295.getClass(), "startingCredit", -1388471422);
        setField(term33295, term33295.getClass(), "waterLevel", enum86);
        setField(term33295, term33295.getClass(), "temperature", enum87);
        setIntField(term33295, term33295.getClass(), "planetSize", -1498296052);
        setIntField(term33295, term33295.getClass(), "population", 2098647989);
        setIntField(term33295, term33295.getClass(), "colonyPop", 1598895173);
        setField(term33295, term33295.getClass(), "extraTech", term33372);
        setField(term33295, term33295.getClass(), "buildings", term33460);
        term33548 = new Integer(1830648570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33548;
        callMethod(klass, "setStartingCredit", argTypes, term33295, args);
    }

};


