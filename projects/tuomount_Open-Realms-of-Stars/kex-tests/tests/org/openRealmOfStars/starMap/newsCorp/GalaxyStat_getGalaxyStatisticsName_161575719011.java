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

public class GalaxyStat_getGalaxyStatisticsName_161575719011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507;

    public GalaxyStat_getGalaxyStatisticsName_161575719011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term507 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term521 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 8);
        Object term522 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term523 = (int[]) newIntArray(0);
        Object term525 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term526 = (int[]) newIntArray(0);
        Object term528 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term529 = (int[]) newIntArray(0);
        Object term531 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term532 = (int[]) newIntArray(0);
        Object term534 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term535 = (int[]) newIntArray(0);
        Object term537 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term538 = (int[]) newIntArray(0);
        Object term540 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term541 = (int[]) newIntArray(0);
        Object term543 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term544 = (int[]) newIntArray(0);
        setField(term507, term507.getClass(), "galaxyStatisticsName", "uuaPigETmJ");
        setIntField(term507, term507.getClass(), "maxPlayers", -1371869594);
        setField(term522, term522.getClass(), "data", term523);
        setIntField(term522, term522.getClass(), "size", -1);
        setElement(term521, 0, term522);
        setField(term525, term525.getClass(), "data", term526);
        setIntField(term525, term525.getClass(), "size", -1);
        setElement(term521, 1, term525);
        setField(term528, term528.getClass(), "data", term529);
        setIntField(term528, term528.getClass(), "size", -1);
        setElement(term521, 2, term528);
        setField(term531, term531.getClass(), "data", term532);
        setIntField(term531, term531.getClass(), "size", -1);
        setElement(term521, 3, term531);
        setField(term534, term534.getClass(), "data", term535);
        setIntField(term534, term534.getClass(), "size", -1);
        setElement(term521, 4, term534);
        setField(term537, term537.getClass(), "data", term538);
        setIntField(term537, term537.getClass(), "size", -1);
        setElement(term521, 5, term537);
        setField(term540, term540.getClass(), "data", term541);
        setIntField(term540, term540.getClass(), "size", -1);
        setElement(term521, 6, term540);
        setField(term543, term543.getClass(), "data", term544);
        setIntField(term543, term543.getClass(), "size", -1);
        setElement(term521, 7, term543);
        setField(term507, term507.getClass(), "dataStat", term521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGalaxyStatisticsName", argTypes, term507, args);
    }

};


