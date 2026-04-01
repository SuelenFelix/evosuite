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

public class PlanetaryStatus_getDescription_11130678904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6515;

    public PlanetaryStatus_getDescription_11130678904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6515 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term6552 = (Object[]) newArray("java.lang.String", 5);
        setField(term6515, term6515.getClass(), "statusId", "PtirvZmsGt");
        setField(term6515, term6515.getClass(), "name", "HWkpTmtlrc");
        setField(term6515, term6515.getClass(), "description", "hMmaoREuCK");
        setElement(term6552, 0, "VeDtgDzGAN");
        setElement(term6552, 1, "aWYOWZFyaX");
        setElement(term6552, 2, "BRIVNtfUWU");
        setElement(term6552, 3, "DbiCVtPPCT");
        setElement(term6552, 4, "WzFopsaDuG");
        setField(term6515, term6515.getClass(), "conflictingIds", term6552);
        setIntField(term6515, term6515.getClass(), "foodBonus", 568954359);
        setIntField(term6515, term6515.getClass(), "happinessBonus", 53410913);
        setIntField(term6515, term6515.getClass(), "mineBonus", -375014958);
        setIntField(term6515, term6515.getClass(), "prodBonus", 1107176718);
        setIntField(term6515, term6515.getClass(), "credBonus", 480137250);
        setIntField(term6515, term6515.getClass(), "reseBonus", -341152642);
        setBooleanField(term6515, term6515.getClass(), "hidden", true);
        setField(term6515, term6515.getClass(), "discoveryText", "PapWxkhEWe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term6515, args);
    }

};


