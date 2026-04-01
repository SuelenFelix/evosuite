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
import java.lang.Boolean;

public class PlanetaryStatus_setHidden_33098341519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9588;
     Object term9753;

    public PlanetaryStatus_setHidden_33098341519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9588 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term9625 = (Object[]) newArray("java.lang.String", 9);
        setField(term9588, term9588.getClass(), "statusId", "vKitydDVnM");
        setField(term9588, term9588.getClass(), "name", "urCiQnUFBM");
        setField(term9588, term9588.getClass(), "description", "EKjQdtKxAM");
        setElement(term9625, 0, "TXZAIPQJHt");
        setElement(term9625, 1, "DIbeDHICho");
        setElement(term9625, 2, "dJGPlmSRnz");
        setElement(term9625, 3, "DPskuFUobI");
        setElement(term9625, 4, "wBGfLpNNiZ");
        setElement(term9625, 5, "yUGCjlqgJE");
        setElement(term9625, 6, "PXdVZyoJyC");
        setElement(term9625, 7, "vLerpqavFM");
        setElement(term9625, 8, "qnvxzwuGKX");
        setField(term9588, term9588.getClass(), "conflictingIds", term9625);
        setIntField(term9588, term9588.getClass(), "foodBonus", 371943306);
        setIntField(term9588, term9588.getClass(), "happinessBonus", 982388293);
        setIntField(term9588, term9588.getClass(), "mineBonus", -159494544);
        setIntField(term9588, term9588.getClass(), "prodBonus", -75206835);
        setIntField(term9588, term9588.getClass(), "credBonus", -1618206977);
        setIntField(term9588, term9588.getClass(), "reseBonus", -1747406163);
        setBooleanField(term9588, term9588.getClass(), "hidden", true);
        setField(term9588, term9588.getClass(), "discoveryText", "EdPAvpluZg");
        term9753 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term9753;
        callMethod(klass, "setHidden", argTypes, term9588, args);
    }

};


