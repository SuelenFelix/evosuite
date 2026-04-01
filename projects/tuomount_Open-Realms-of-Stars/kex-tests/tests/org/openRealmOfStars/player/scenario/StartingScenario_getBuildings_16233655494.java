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

public class StartingScenario_getBuildings_16233655494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7734;

    public StartingScenario_getBuildings_16233655494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7951 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term7950 = ((Class) term7951).getDeclaredField((String) "UTOPIA_WORLD");
        ((Field) term7950).setAccessible(true);
        Object enum20 = ((Field) term7950).get((Object) null);
        Class<? extends Object> term8299 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term8298 = ((Class) term8299).getDeclaredField((String) "OCEAN");
        ((Field) term8298).setAccessible(true);
        Object enum21 = ((Field) term8298).get((Object) null);
        Class<? extends Object> term8601 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term8600 = ((Class) term8601).getDeclaredField((String) "FROZEN");
        ((Field) term8600).setAccessible(true);
        Object enum22 = ((Field) term8600).get((Object) null);
        ArrayList term7812 = new ArrayList();
        ((ArrayList) term7812).add("UoYtihxVaS");
        ((ArrayList) term7812).add("JDswTTCZHV");
        ((ArrayList) term7812).add("onpbIeEKoi");
        ArrayList term7852 = new ArrayList();
        ((ArrayList) term7852).add("YRHGsAkhxb");
        ((ArrayList) term7852).add("ffYhPOzlUs");
        ((ArrayList) term7852).add("MLqYREekMl");
        ((ArrayList) term7852).add("ytSBIKXogI");
        ((ArrayList) term7852).add("nHXjMycHlU");
        ((ArrayList) term7852).add("ieCtQFdkii");
        ((ArrayList) term7852).add("dEnhdmILtU");
        term7734 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term7734, term7734.getClass(), "id", "jDtqGUpnZN");
        setField(term7734, term7734.getClass(), "type", enum20);
        setField(term7734, term7734.getClass(), "name", "nGKItKLYNC");
        setField(term7734, term7734.getClass(), "description", "UiUYnPrcCi");
        setIntField(term7734, term7734.getClass(), "numberOfScouts", 1048535127);
        setIntField(term7734, term7734.getClass(), "numberOfColonyShips", -655067527);
        setIntField(term7734, term7734.getClass(), "startingCredit", -6029667);
        setField(term7734, term7734.getClass(), "waterLevel", enum21);
        setField(term7734, term7734.getClass(), "temperature", enum22);
        setIntField(term7734, term7734.getClass(), "planetSize", -2068769794);
        setIntField(term7734, term7734.getClass(), "population", -117576464);
        setIntField(term7734, term7734.getClass(), "colonyPop", -1007160944);
        setField(term7734, term7734.getClass(), "extraTech", term7812);
        setField(term7734, term7734.getClass(), "buildings", term7852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBuildings", argTypes, term7734, args);
    }

};


