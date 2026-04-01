package org.openRealmOfStars.ai.planet;

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
import static org.openRealmOfStars.ai.planet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PlanetHandling_getConstruction_210913187527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169505;

    public PlanetHandling_getConstruction_210913187527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169505 = (Object[]) newArray("org.openRealmOfStars.starMap.planet.construction.Construction", 3);
        Object term169506 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction"));
        Object term169545 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction"));
        Object term169584 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction"));
        setField(term169506, term169506.getClass(), "name", "ChbSEsWapt");
        setField(term169506, term169506.getClass(), "iconId", "bQISZgxxwm");
        setField(term169506, term169506.getClass(), "description", "GTtXOBrgdi");
        setIntField(term169506, term169506.getClass(), "prodCost", 1130325657);
        setIntField(term169506, term169506.getClass(), "metalCost", 247563740);
        setElement(term169505, 0, term169506);
        setField(term169545, term169545.getClass(), "name", "YYhXdHIurl");
        setField(term169545, term169545.getClass(), "iconId", "CkrdSBVicO");
        setField(term169545, term169545.getClass(), "description", "msqTjDOpSS");
        setIntField(term169545, term169545.getClass(), "prodCost", 1806796271);
        setIntField(term169545, term169545.getClass(), "metalCost", -91540855);
        setElement(term169505, 1, term169545);
        setField(term169584, term169584.getClass(), "name", "pwskCNsTJJ");
        setField(term169584, term169584.getClass(), "iconId", "QTKtugVjKE");
        setField(term169584, term169584.getClass(), "description", "NTbKSHXEkV");
        setIntField(term169584, term169584.getClass(), "prodCost", -2120152870);
        setIntField(term169584, term169584.getClass(), "metalCost", -2111077974);
        setElement(term169505, 2, term169584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.planet.PlanetHandling");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "ogERhHtdmR";
        args[1] = term169505;
        callMethod(klass, "getConstruction", argTypes, null, args);
    }

};


