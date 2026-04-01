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

public class StartingScenario_setPlanetSize_36512577621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28563;
     Object term28741;

    public StartingScenario_setPlanetSize_36512577621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28754 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term28753 = ((Class) term28754).getDeclaredField((String) "DOOMED");
        ((Field) term28753).setAccessible(true);
        Object enum73 = ((Field) term28753).get((Object) null);
        Class<? extends Object> term29084 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term29083 = ((Class) term29084).getDeclaredField((String) "BARREN");
        ((Field) term29083).setAccessible(true);
        Object enum74 = ((Field) term29083).get((Object) null);
        Class<? extends Object> term29389 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term29388 = ((Class) term29389).getDeclaredField((String) "INFERNO");
        ((Field) term29388).setAccessible(true);
        Object enum75 = ((Field) term29388).get((Object) null);
        ArrayList term28637 = new ArrayList();
        ((ArrayList) term28637).add("tlQSNgTkQX");
        ((ArrayList) term28637).add("PCipZnmBOF");
        ((ArrayList) term28637).add("zcorEihhLK");
        ((ArrayList) term28637).add("GrqozDKFOk");
        ArrayList term28689 = new ArrayList();
        ((ArrayList) term28689).add("CFyoseFGLF");
        ((ArrayList) term28689).add("SFqCrhEWLm");
        ((ArrayList) term28689).add("GZdcJyZntS");
        ((ArrayList) term28689).add("OIHoJeysUi");
        term28563 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term28563, term28563.getClass(), "id", "QduALnDSVo");
        setField(term28563, term28563.getClass(), "type", enum73);
        setField(term28563, term28563.getClass(), "name", "izPpKDErnQ");
        setField(term28563, term28563.getClass(), "description", "NnpwZBUTvx");
        setIntField(term28563, term28563.getClass(), "numberOfScouts", 1474524152);
        setIntField(term28563, term28563.getClass(), "numberOfColonyShips", 568954359);
        setIntField(term28563, term28563.getClass(), "startingCredit", 53410913);
        setField(term28563, term28563.getClass(), "waterLevel", enum74);
        setField(term28563, term28563.getClass(), "temperature", enum75);
        setIntField(term28563, term28563.getClass(), "planetSize", -375014958);
        setIntField(term28563, term28563.getClass(), "population", 1107176718);
        setIntField(term28563, term28563.getClass(), "colonyPop", 480137250);
        setField(term28563, term28563.getClass(), "extraTech", term28637);
        setField(term28563, term28563.getClass(), "buildings", term28689);
        term28741 = new Integer(-341152642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28741;
        callMethod(klass, "setPlanetSize", argTypes, term28563, args);
    }

};


