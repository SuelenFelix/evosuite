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

public class StartingScenario_setWaterLevel_11263550719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25684;
     Object enum68;

    public StartingScenario_setWaterLevel_11263550719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25794 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term25793 = ((Class) term25794).getDeclaredField((String) "UTOPIA_WORLD");
        ((Field) term25793).setAccessible(true);
        Object enum65 = ((Field) term25793).get((Object) null);
        Class<? extends Object> term26142 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term26141 = ((Class) term26142).getDeclaredField((String) "HUMID");
        ((Field) term26141).setAccessible(true);
        Object enum66 = ((Field) term26141).get((Object) null);
        Class<? extends Object> term26444 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term26443 = ((Class) term26444).getDeclaredField((String) "TEMPERATE");
        ((Field) term26443).setAccessible(true);
        Object enum67 = ((Field) term26443).get((Object) null);
        ArrayList term25765 = new ArrayList();
        ArrayList term25769 = new ArrayList();
        term25684 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term25684, term25684.getClass(), "id", "HDaezxQfQR");
        setField(term25684, term25684.getClass(), "type", enum65);
        setField(term25684, term25684.getClass(), "name", "iikZEapDlu");
        setField(term25684, term25684.getClass(), "description", "nhoHrZfnIN");
        setIntField(term25684, term25684.getClass(), "numberOfScouts", 1532716628);
        setIntField(term25684, term25684.getClass(), "numberOfColonyShips", -1801760683);
        setIntField(term25684, term25684.getClass(), "startingCredit", 1141317871);
        setField(term25684, term25684.getClass(), "waterLevel", enum66);
        setField(term25684, term25684.getClass(), "temperature", enum67);
        setIntField(term25684, term25684.getClass(), "planetSize", 890669485);
        setIntField(term25684, term25684.getClass(), "population", 691577392);
        setIntField(term25684, term25684.getClass(), "colonyPop", -893623680);
        setField(term25684, term25684.getClass(), "extraTech", term25765);
        setField(term25684, term25684.getClass(), "buildings", term25769);
        Class<? extends Object> term26763 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term26762 = ((Class) term26763).getDeclaredField((String) "DESERT");
        ((Field) term26762).setAccessible(true);
        enum68 = ((Field) term26762).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Object[] args = new Object[1];
        args[0] = enum68;
        callMethod(klass, "setWaterLevel", argTypes, term25684, args);
    }

};


