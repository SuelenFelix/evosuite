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

public class StartingScenario_getNumberOfColonyShips_151098207410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14806;

    public StartingScenario_getNumberOfColonyShips_151098207410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14990 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term14989 = ((Class) term14990).getDeclaredField((String) "DOOMED");
        ((Field) term14989).setAccessible(true);
        Object enum38 = ((Field) term14989).get((Object) null);
        Class<? extends Object> term15320 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term15319 = ((Class) term15320).getDeclaredField((String) "HUMID");
        ((Field) term15319).setAccessible(true);
        Object enum39 = ((Field) term15319).get((Object) null);
        Class<? extends Object> term15622 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term15621 = ((Class) term15622).getDeclaredField((String) "HOT");
        ((Field) term15621).setAccessible(true);
        Object enum40 = ((Field) term15621).get((Object) null);
        ArrayList term14875 = new ArrayList();
        ((ArrayList) term14875).add("xBsXSDjXYK");
        ((ArrayList) term14875).add("sEnIVFtZuQ");
        ArrayList term14903 = new ArrayList();
        ((ArrayList) term14903).add("ZVecLZMLHF");
        ((ArrayList) term14903).add("fztQhjqwdP");
        ((ArrayList) term14903).add("eVpkWxjuki");
        ((ArrayList) term14903).add("SJiQaLvSKv");
        ((ArrayList) term14903).add("OEXDRUKcFl");
        ((ArrayList) term14903).add("RYdKCNNMBR");
        term14806 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term14806, term14806.getClass(), "id", "vjxIhXHxGR");
        setField(term14806, term14806.getClass(), "type", enum38);
        setField(term14806, term14806.getClass(), "name", "QXzGXbEXMu");
        setField(term14806, term14806.getClass(), "description", "qxSDVejjiY");
        setIntField(term14806, term14806.getClass(), "numberOfScouts", 292681826);
        setIntField(term14806, term14806.getClass(), "numberOfColonyShips", 458147407);
        setIntField(term14806, term14806.getClass(), "startingCredit", -184153539);
        setField(term14806, term14806.getClass(), "waterLevel", enum39);
        setField(term14806, term14806.getClass(), "temperature", enum40);
        setIntField(term14806, term14806.getClass(), "planetSize", 493620644);
        setIntField(term14806, term14806.getClass(), "population", 1328271830);
        setIntField(term14806, term14806.getClass(), "colonyPop", 1596070772);
        setField(term14806, term14806.getClass(), "extraTech", term14875);
        setField(term14806, term14806.getClass(), "buildings", term14903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberOfColonyShips", argTypes, term14806, args);
    }

};


