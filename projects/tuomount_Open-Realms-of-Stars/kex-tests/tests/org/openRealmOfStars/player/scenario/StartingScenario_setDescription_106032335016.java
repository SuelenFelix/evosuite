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

public class StartingScenario_setDescription_106032335016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22114;

    public StartingScenario_setDescription_106032335016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22327 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term22326 = ((Class) term22327).getDeclaredField((String) "REGULAR");
        ((Field) term22326).setAccessible(true);
        Object enum56 = ((Field) term22326).get((Object) null);
        Class<? extends Object> term22660 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term22659 = ((Class) term22660).getDeclaredField((String) "MARINE");
        ((Field) term22659).setAccessible(true);
        Object enum57 = ((Field) term22659).get((Object) null);
        Class<? extends Object> term22965 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term22964 = ((Class) term22965).getDeclaredField((String) "ARCTIC");
        ((Field) term22964).setAccessible(true);
        Object enum58 = ((Field) term22964).get((Object) null);
        ArrayList term22188 = new ArrayList();
        ((ArrayList) term22188).add("zUlRdimJtU");
        ((ArrayList) term22188).add("vwbEQQNQrx");
        ((ArrayList) term22188).add("xtftXXMbem");
        ((ArrayList) term22188).add("cudZvLMQon");
        ((ArrayList) term22188).add("lihXWlGDxk");
        ((ArrayList) term22188).add("JmcmxoGhIK");
        ((ArrayList) term22188).add("jXzmYyrnnT");
        ArrayList term22276 = new ArrayList();
        ((ArrayList) term22276).add("igCAtimmYB");
        ((ArrayList) term22276).add("DyiXbeYIaN");
        term22114 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term22114, term22114.getClass(), "id", "DSNsTGYXDF");
        setField(term22114, term22114.getClass(), "type", enum56);
        setField(term22114, term22114.getClass(), "name", "sQvGcVjdEx");
        setField(term22114, term22114.getClass(), "description", "rLHAoqXgPh");
        setIntField(term22114, term22114.getClass(), "numberOfScouts", -1845499264);
        setIntField(term22114, term22114.getClass(), "numberOfColonyShips", -505439934);
        setIntField(term22114, term22114.getClass(), "startingCredit", -344842608);
        setField(term22114, term22114.getClass(), "waterLevel", enum57);
        setField(term22114, term22114.getClass(), "temperature", enum58);
        setIntField(term22114, term22114.getClass(), "planetSize", 941650513);
        setIntField(term22114, term22114.getClass(), "population", 444029505);
        setIntField(term22114, term22114.getClass(), "colonyPop", -1034506028);
        setField(term22114, term22114.getClass(), "extraTech", term22188);
        setField(term22114, term22114.getClass(), "buildings", term22276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VGizxZnyHX";
        callMethod(klass, "setDescription", argTypes, term22114, args);
    }

};


