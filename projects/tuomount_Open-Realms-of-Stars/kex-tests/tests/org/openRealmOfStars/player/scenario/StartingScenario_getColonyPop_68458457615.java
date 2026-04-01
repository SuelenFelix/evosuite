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

public class StartingScenario_getColonyPop_68458457615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20892;

    public StartingScenario_getColonyPop_68458457615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21089 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term21088 = ((Class) term21089).getDeclaredField((String) "NO_HOME");
        ((Field) term21088).setAccessible(true);
        Object enum53 = ((Field) term21088).get((Object) null);
        Class<? extends Object> term21422 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term21421 = ((Class) term21422).getDeclaredField((String) "ARID");
        ((Field) term21421).setAccessible(true);
        Object enum54 = ((Field) term21421).get((Object) null);
        Class<? extends Object> term21721 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term21720 = ((Class) term21721).getDeclaredField((String) "COLD");
        ((Field) term21720).setAccessible(true);
        Object enum55 = ((Field) term21720).get((Object) null);
        ArrayList term20962 = new ArrayList();
        ((ArrayList) term20962).add("VeDtgDzGAN");
        ArrayList term20978 = new ArrayList();
        ((ArrayList) term20978).add("aWYOWZFyaX");
        ((ArrayList) term20978).add("BRIVNtfUWU");
        ((ArrayList) term20978).add("DbiCVtPPCT");
        ((ArrayList) term20978).add("WzFopsaDuG");
        ((ArrayList) term20978).add("PapWxkhEWe");
        ((ArrayList) term20978).add("smnHEqRFRx");
        ((ArrayList) term20978).add("XYtryyobou");
        ((ArrayList) term20978).add("OYbzXylRWW");
        term20892 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term20892, term20892.getClass(), "id", "PtirvZmsGt");
        setField(term20892, term20892.getClass(), "type", enum53);
        setField(term20892, term20892.getClass(), "name", "HWkpTmtlrc");
        setField(term20892, term20892.getClass(), "description", "hMmaoREuCK");
        setIntField(term20892, term20892.getClass(), "numberOfScouts", 1090617576);
        setIntField(term20892, term20892.getClass(), "numberOfColonyShips", -1547384488);
        setIntField(term20892, term20892.getClass(), "startingCredit", 1442160736);
        setField(term20892, term20892.getClass(), "waterLevel", enum54);
        setField(term20892, term20892.getClass(), "temperature", enum55);
        setIntField(term20892, term20892.getClass(), "planetSize", 1114000454);
        setIntField(term20892, term20892.getClass(), "population", -556405712);
        setIntField(term20892, term20892.getClass(), "colonyPop", -1772434990);
        setField(term20892, term20892.getClass(), "extraTech", term20962);
        setField(term20892, term20892.getClass(), "buildings", term20978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColonyPop", argTypes, term20892, args);
    }

};


