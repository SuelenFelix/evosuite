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

public class PlanetaryStatus_isHidden_117776681118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9315;

    public PlanetaryStatus_isHidden_117776681118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9315 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term9352 = (Object[]) newArray("java.lang.String", 8);
        setField(term9315, term9315.getClass(), "statusId", "uPuCVuZYOI");
        setField(term9315, term9315.getClass(), "name", "TweMFhxNdj");
        setField(term9315, term9315.getClass(), "description", "NBrvVzvQHe");
        setElement(term9352, 0, "FjOiNAfBOc");
        setElement(term9352, 1, "iCCsaLHohG");
        setElement(term9352, 2, "NJhGgctbdj");
        setElement(term9352, 3, "MYWYUeLGOp");
        setElement(term9352, 4, "tsTGdgQYUL");
        setElement(term9352, 5, "TtGbVmKcnX");
        setElement(term9352, 6, "GJVkUrCVdD");
        setElement(term9352, 7, "zNdorvdUgu");
        setField(term9315, term9315.getClass(), "conflictingIds", term9352);
        setIntField(term9315, term9315.getClass(), "foodBonus", 1694224101);
        setIntField(term9315, term9315.getClass(), "happinessBonus", 937859191);
        setIntField(term9315, term9315.getClass(), "mineBonus", -916584829);
        setIntField(term9315, term9315.getClass(), "prodBonus", -2131181468);
        setIntField(term9315, term9315.getClass(), "credBonus", 282916351);
        setIntField(term9315, term9315.getClass(), "reseBonus", 880977281);
        setBooleanField(term9315, term9315.getClass(), "hidden", true);
        setField(term9315, term9315.getClass(), "discoveryText", "oPxuZbkYio");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHidden", argTypes, term9315, args);
    }

};


