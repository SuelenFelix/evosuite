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

public class StartingScenario_getTechs_10149085333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6286;

    public StartingScenario_getTechs_10149085333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6598 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term6597 = ((Class) term6598).getDeclaredField((String) "UTOPIA_WORLD");
        ((Field) term6597).setAccessible(true);
        Object enum17 = ((Field) term6597).get((Object) null);
        Class<? extends Object> term6946 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term6945 = ((Class) term6946).getDeclaredField((String) "MARINE");
        ((Field) term6945).setAccessible(true);
        Object enum18 = ((Field) term6945).get((Object) null);
        Class<? extends Object> term7251 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term7250 = ((Class) term7251).getDeclaredField((String) "COLD");
        ((Field) term7250).setAccessible(true);
        Object enum19 = ((Field) term7250).get((Object) null);
        ArrayList term6363 = new ArrayList();
        ((ArrayList) term6363).add("dWRymuLBtr");
        ((ArrayList) term6363).add("AijpHYOFuy");
        ((ArrayList) term6363).add("SbAoxhfrkn");
        ((ArrayList) term6363).add("kuTXqwMtDB");
        ((ArrayList) term6363).add("Ghbwtircqb");
        ((ArrayList) term6363).add("xrwlQZdwCp");
        ((ArrayList) term6363).add("IDCWpPLRkE");
        ((ArrayList) term6363).add("nyiiPDVjAc");
        ((ArrayList) term6363).add("aKnKipADSo");
        ArrayList term6475 = new ArrayList();
        ((ArrayList) term6475).add("wSQxaModmm");
        ((ArrayList) term6475).add("UlajhuVLaP");
        ((ArrayList) term6475).add("gGSMzuGICf");
        ((ArrayList) term6475).add("hxCBltsObl");
        ((ArrayList) term6475).add("BndsHwAFMv");
        ((ArrayList) term6475).add("GzFkzHGYFt");
        ((ArrayList) term6475).add("tShwQLRGNe");
        ((ArrayList) term6475).add("LvtrsXUliU");
        ((ArrayList) term6475).add("xLbjWUgOIL");
        term6286 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term6286, term6286.getClass(), "id", "IoAlmYsBwc");
        setField(term6286, term6286.getClass(), "type", enum17);
        setField(term6286, term6286.getClass(), "name", "TEParAifyi");
        setField(term6286, term6286.getClass(), "description", "OWDIEULEFu");
        setIntField(term6286, term6286.getClass(), "numberOfScouts", -883034806);
        setIntField(term6286, term6286.getClass(), "numberOfColonyShips", 1585847225);
        setIntField(term6286, term6286.getClass(), "startingCredit", 597278769);
        setField(term6286, term6286.getClass(), "waterLevel", enum18);
        setField(term6286, term6286.getClass(), "temperature", enum19);
        setIntField(term6286, term6286.getClass(), "planetSize", -1685132342);
        setIntField(term6286, term6286.getClass(), "population", -1456670397);
        setIntField(term6286, term6286.getClass(), "colonyPop", 1622346318);
        setField(term6286, term6286.getClass(), "extraTech", term6363);
        setField(term6286, term6286.getClass(), "buildings", term6475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTechs", argTypes, term6286, args);
    }

};


