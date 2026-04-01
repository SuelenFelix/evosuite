package org.openRealmOfStars.starMap.newsCorp;

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
import static org.openRealmOfStars.starMap.newsCorp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class GalaxyStat_getValue_17078243603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223;
     Object term256;
     Object term258;

    public GalaxyStat_getValue_17078243603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term237 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 6);
        Object term238 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term239 = (int[]) newIntArray(0);
        Object term241 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term242 = (int[]) newIntArray(0);
        Object term244 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term245 = (int[]) newIntArray(0);
        Object term247 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term248 = (int[]) newIntArray(0);
        Object term250 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term251 = (int[]) newIntArray(0);
        Object term253 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term254 = (int[]) newIntArray(0);
        setField(term223, term223.getClass(), "galaxyStatisticsName", "xxtlPwDYFs");
        setIntField(term223, term223.getClass(), "maxPlayers", 579005622);
        setField(term238, term238.getClass(), "data", term239);
        setIntField(term238, term238.getClass(), "size", -1);
        setElement(term237, 0, term238);
        setField(term241, term241.getClass(), "data", term242);
        setIntField(term241, term241.getClass(), "size", -1);
        setElement(term237, 1, term241);
        setField(term244, term244.getClass(), "data", term245);
        setIntField(term244, term244.getClass(), "size", -1);
        setElement(term237, 2, term244);
        setField(term247, term247.getClass(), "data", term248);
        setIntField(term247, term247.getClass(), "size", -1);
        setElement(term237, 3, term247);
        setField(term250, term250.getClass(), "data", term251);
        setIntField(term250, term250.getClass(), "size", -1);
        setElement(term237, 4, term250);
        setField(term253, term253.getClass(), "data", term254);
        setIntField(term253, term253.getClass(), "size", -1);
        setElement(term237, 5, term253);
        setField(term223, term223.getClass(), "dataStat", term237);
        term256 = new Integer(-14890619);
        term258 = new Integer(1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term256;
        args[1] = term258;
        callMethod(klass, "getValue", argTypes, term223, args);
    }

};


