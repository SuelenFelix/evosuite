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

public class StartingScenario_getName_289851258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12408;

    public StartingScenario_getName_289851258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12621 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term12620 = ((Class) term12621).getDeclaredField((String) "DOOMED");
        ((Field) term12620).setAccessible(true);
        Object enum32 = ((Field) term12620).get((Object) null);
        Class<? extends Object> term12951 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term12950 = ((Class) term12951).getDeclaredField((String) "HUMID");
        ((Field) term12950).setAccessible(true);
        Object enum33 = ((Field) term12950).get((Object) null);
        Class<? extends Object> term13253 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term13252 = ((Class) term13253).getDeclaredField((String) "TROPICAL");
        ((Field) term13252).setAccessible(true);
        Object enum34 = ((Field) term13252).get((Object) null);
        ArrayList term12482 = new ArrayList();
        ((ArrayList) term12482).add("LvJFtLBaxj");
        ((ArrayList) term12482).add("PHvxnGHptP");
        ((ArrayList) term12482).add("TimdotUuNC");
        ((ArrayList) term12482).add("PkWMRdJcBb");
        ((ArrayList) term12482).add("jSpAteRute");
        ArrayList term12546 = new ArrayList();
        ((ArrayList) term12546).add("swZVeJAxjt");
        ((ArrayList) term12546).add("xOcJIiQQDu");
        ((ArrayList) term12546).add("GVizqqzXpy");
        ((ArrayList) term12546).add("JqXGgAhZPl");
        ((ArrayList) term12546).add("jiKYgYHqIS");
        term12408 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term12408, term12408.getClass(), "id", "jUbSRrkrYZ");
        setField(term12408, term12408.getClass(), "type", enum32);
        setField(term12408, term12408.getClass(), "name", "bWWfajKbEX");
        setField(term12408, term12408.getClass(), "description", "cAPeiZHKGJ");
        setIntField(term12408, term12408.getClass(), "numberOfScouts", -157887805);
        setIntField(term12408, term12408.getClass(), "numberOfColonyShips", 1876565163);
        setIntField(term12408, term12408.getClass(), "startingCredit", -817164822);
        setField(term12408, term12408.getClass(), "waterLevel", enum33);
        setField(term12408, term12408.getClass(), "temperature", enum34);
        setIntField(term12408, term12408.getClass(), "planetSize", -1016503459);
        setIntField(term12408, term12408.getClass(), "population", -1968847291);
        setIntField(term12408, term12408.getClass(), "colonyPop", 579005622);
        setField(term12408, term12408.getClass(), "extraTech", term12482);
        setField(term12408, term12408.getClass(), "buildings", term12546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term12408, args);
    }

};


