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

public class GalaxyStat_addStat_4433414945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310;
     Object term340;
     Object term342;

    public GalaxyStat_addStat_4433414945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term324 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 5);
        Object term325 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term326 = (int[]) newIntArray(0);
        Object term328 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term329 = (int[]) newIntArray(0);
        Object term331 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term332 = (int[]) newIntArray(0);
        Object term334 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term335 = (int[]) newIntArray(0);
        Object term337 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term338 = (int[]) newIntArray(0);
        setField(term310, term310.getClass(), "galaxyStatisticsName", "EGtDIRbSSb");
        setIntField(term310, term310.getClass(), "maxPlayers", -1786399638);
        setField(term325, term325.getClass(), "data", term326);
        setIntField(term325, term325.getClass(), "size", -1);
        setElement(term324, 0, term325);
        setField(term328, term328.getClass(), "data", term329);
        setIntField(term328, term328.getClass(), "size", -1);
        setElement(term324, 1, term328);
        setField(term331, term331.getClass(), "data", term332);
        setIntField(term331, term331.getClass(), "size", -1);
        setElement(term324, 2, term331);
        setField(term334, term334.getClass(), "data", term335);
        setIntField(term334, term334.getClass(), "size", -1);
        setElement(term324, 3, term334);
        setField(term337, term337.getClass(), "data", term338);
        setIntField(term337, term337.getClass(), "size", -1);
        setElement(term324, 4, term337);
        setField(term310, term310.getClass(), "dataStat", term324);
        term340 = new Integer(2055867847);
        term342 = new Integer(-1048298087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term340;
        args[1] = term342;
        callMethod(klass, "addStat", argTypes, term310, args);
    }

};


