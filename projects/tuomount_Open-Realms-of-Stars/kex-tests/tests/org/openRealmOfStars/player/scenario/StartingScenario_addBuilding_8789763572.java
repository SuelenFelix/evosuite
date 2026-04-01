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

public class StartingScenario_addBuilding_8789763572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5046;

    public StartingScenario_addBuilding_8789763572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5254 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term5253 = ((Class) term5254).getDeclaredField((String) "DOOMED");
        ((Field) term5253).setAccessible(true);
        Object enum14 = ((Field) term5253).get((Object) null);
        Class<? extends Object> term5584 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term5583 = ((Class) term5584).getDeclaredField((String) "ARID");
        ((Field) term5583).setAccessible(true);
        Object enum15 = ((Field) term5583).get((Object) null);
        Class<? extends Object> term5883 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term5882 = ((Class) term5883).getDeclaredField((String) "COLD");
        ((Field) term5882).setAccessible(true);
        Object enum16 = ((Field) term5882).get((Object) null);
        ArrayList term5115 = new ArrayList();
        ((ArrayList) term5115).add("HyxfbSQYBe");
        ((ArrayList) term5115).add("pCTimMblYc");
        ((ArrayList) term5115).add("hNxWaHcfhY");
        ((ArrayList) term5115).add("RkybSrpybU");
        ((ArrayList) term5115).add("xOEqzGAmDU");
        ((ArrayList) term5115).add("eZFUvlxvGV");
        ((ArrayList) term5115).add("BYqFIqCKAV");
        ((ArrayList) term5115).add("vrQLuWIDJX");
        ((ArrayList) term5115).add("flxyYxBRtu");
        ArrayList term5227 = new ArrayList();
        term5046 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term5046, term5046.getClass(), "id", "aJlieCFVtF");
        setField(term5046, term5046.getClass(), "type", enum14);
        setField(term5046, term5046.getClass(), "name", "ZiaGIbnzTs");
        setField(term5046, term5046.getClass(), "description", "tbcdzjIfER");
        setIntField(term5046, term5046.getClass(), "numberOfScouts", -2038273078);
        setIntField(term5046, term5046.getClass(), "numberOfColonyShips", 1227103734);
        setIntField(term5046, term5046.getClass(), "startingCredit", -1339778481);
        setField(term5046, term5046.getClass(), "waterLevel", enum15);
        setField(term5046, term5046.getClass(), "temperature", enum16);
        setIntField(term5046, term5046.getClass(), "planetSize", 1725571209);
        setIntField(term5046, term5046.getClass(), "population", -522618178);
        setIntField(term5046, term5046.getClass(), "colonyPop", 1134449235);
        setField(term5046, term5046.getClass(), "extraTech", term5115);
        setField(term5046, term5046.getClass(), "buildings", term5227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OclPbYPkcH";
        callMethod(klass, "addBuilding", argTypes, term5046, args);
    }

};


