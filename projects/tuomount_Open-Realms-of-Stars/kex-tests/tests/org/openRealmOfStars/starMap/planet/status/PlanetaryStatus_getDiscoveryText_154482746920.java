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

public class PlanetaryStatus_getDiscoveryText_154482746920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9885;

    public PlanetaryStatus_getDiscoveryText_154482746920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9885 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term9922 = (Object[]) newArray("java.lang.String", 7);
        setField(term9885, term9885.getClass(), "statusId", "DzHVBMqWtE");
        setField(term9885, term9885.getClass(), "name", "THZSpzBRYP");
        setField(term9885, term9885.getClass(), "description", "ZfBIVGBQOE");
        setElement(term9922, 0, "QSrDQfEsTR");
        setElement(term9922, 1, "PsqusYmejD");
        setElement(term9922, 2, "NTWMiBEaDF");
        setElement(term9922, 3, "SPBstwKFVr");
        setElement(term9922, 4, "WxYUTuqmIq");
        setElement(term9922, 5, "OeQLvhVERT");
        setElement(term9922, 6, "IlvgFINwIa");
        setField(term9885, term9885.getClass(), "conflictingIds", term9922);
        setIntField(term9885, term9885.getClass(), "foodBonus", 388157121);
        setIntField(term9885, term9885.getClass(), "happinessBonus", 1684998508);
        setIntField(term9885, term9885.getClass(), "mineBonus", -1476644457);
        setIntField(term9885, term9885.getClass(), "prodBonus", 1270666529);
        setIntField(term9885, term9885.getClass(), "credBonus", -1146679443);
        setIntField(term9885, term9885.getClass(), "reseBonus", -860131894);
        setBooleanField(term9885, term9885.getClass(), "hidden", true);
        setField(term9885, term9885.getClass(), "discoveryText", "GEJABPlHSI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiscoveryText", argTypes, term9885, args);
    }

};


