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

public class PlanetaryStatus_setDiscoveryText_130969982721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10136;

    public PlanetaryStatus_setDiscoveryText_130969982721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10136 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term10173 = (Object[]) newArray("java.lang.String", 3);
        setField(term10136, term10136.getClass(), "statusId", "aQFUvuaYxd");
        setField(term10136, term10136.getClass(), "name", "zNFLXMifnS");
        setField(term10136, term10136.getClass(), "description", "HHQcYMSBVc");
        setElement(term10173, 0, "wdoqITnaAP");
        setElement(term10173, 1, "rIPMBcrNqB");
        setElement(term10173, 2, "UDaboHZHhz");
        setField(term10136, term10136.getClass(), "conflictingIds", term10173);
        setIntField(term10136, term10136.getClass(), "foodBonus", -1022990421);
        setIntField(term10136, term10136.getClass(), "happinessBonus", 1045547089);
        setIntField(term10136, term10136.getClass(), "mineBonus", -1122880881);
        setIntField(term10136, term10136.getClass(), "prodBonus", -542712742);
        setIntField(term10136, term10136.getClass(), "credBonus", -1254072822);
        setIntField(term10136, term10136.getClass(), "reseBonus", -1111249833);
        setBooleanField(term10136, term10136.getClass(), "hidden", false);
        setField(term10136, term10136.getClass(), "discoveryText", "nRvKihUSPj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BbNeQJpYPr";
        callMethod(klass, "setDiscoveryText", argTypes, term10136, args);
    }

};


