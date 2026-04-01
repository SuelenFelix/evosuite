package org.openRealmOfStars.starMap.planet.status;

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
import static org.openRealmOfStars.starMap.planet.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AppliedStatus_getStatusId_9354149782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394;

    public AppliedStatus_getStatusId_9354149782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term394 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.AppliedStatus"));
        Object term395 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term432 = (Object[]) newArray("java.lang.String", 3);
        setField(term395, term395.getClass(), "statusId", "tbcdzjIfER");
        setField(term395, term395.getClass(), "name", "HyxfbSQYBe");
        setField(term395, term395.getClass(), "description", "pCTimMblYc");
        setElement(term432, 0, "hNxWaHcfhY");
        setElement(term432, 1, "RkybSrpybU");
        setElement(term432, 2, "xOEqzGAmDU");
        setField(term395, term395.getClass(), "conflictingIds", term432);
        setIntField(term395, term395.getClass(), "foodBonus", 1134449235);
        setIntField(term395, term395.getClass(), "happinessBonus", -883034806);
        setIntField(term395, term395.getClass(), "mineBonus", 1585847225);
        setIntField(term395, term395.getClass(), "prodBonus", 597278769);
        setIntField(term395, term395.getClass(), "credBonus", -1685132342);
        setIntField(term395, term395.getClass(), "reseBonus", -1456670397);
        setBooleanField(term395, term395.getClass(), "hidden", false);
        setField(term395, term395.getClass(), "discoveryText", "eZFUvlxvGV");
        setField(term394, term394.getClass(), "status", term395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.AppliedStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatusId", argTypes, term394, args);
    }

};


