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

public class AppliedStatus_save_3565031623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558;
     Object term664;

    public AppliedStatus_save_3565031623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.AppliedStatus"));
        Object term559 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term596 = (Object[]) newArray("java.lang.String", 4);
        setField(term559, term559.getClass(), "statusId", "BYqFIqCKAV");
        setField(term559, term559.getClass(), "name", "vrQLuWIDJX");
        setField(term559, term559.getClass(), "description", "flxyYxBRtu");
        setElement(term596, 0, "OclPbYPkcH");
        setElement(term596, 1, "IoAlmYsBwc");
        setElement(term596, 2, "TEParAifyi");
        setElement(term596, 3, "OWDIEULEFu");
        setField(term559, term559.getClass(), "conflictingIds", term596);
        setIntField(term559, term559.getClass(), "foodBonus", 1622346318);
        setIntField(term559, term559.getClass(), "happinessBonus", 1048535127);
        setIntField(term559, term559.getClass(), "mineBonus", -655067527);
        setIntField(term559, term559.getClass(), "prodBonus", -6029667);
        setIntField(term559, term559.getClass(), "credBonus", -2068769794);
        setIntField(term559, term559.getClass(), "reseBonus", -117576464);
        setBooleanField(term559, term559.getClass(), "hidden", false);
        setField(term559, term559.getClass(), "discoveryText", "dWRymuLBtr");
        setField(term558, term558.getClass(), "status", term559);
        term664 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term666 = (byte[]) newByteArray(1);
        byte[] term668 = (byte[]) newByteArray(6);
        Object term676 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term664, term664.getClass(), "written", -1007160944);
        setByteElement(term666, 0, (byte) 47);
        setField(term664, term664.getClass(), "bytearr", term666);
        setByteElement(term668, 0, (byte) 48);
        setByteElement(term668, 1, (byte) 89);
        setByteElement(term668, 2, (byte) 75);
        setByteElement(term668, 3, (byte) 18);
        setByteElement(term668, 4, (byte) -58);
        setByteElement(term668, 5, (byte) -29);
        setField(term664, term664.getClass(), "writeBuffer", term668);
        setField(term664, term664.getClass(), "out", null);
        setBooleanField(term664, term664.getClass(), "closed", true);
        setField(term664, term664.getClass(), "closeLock", term676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.AppliedStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term664;
        callMethod(klass, "save", argTypes, term558, args);
    }

};


