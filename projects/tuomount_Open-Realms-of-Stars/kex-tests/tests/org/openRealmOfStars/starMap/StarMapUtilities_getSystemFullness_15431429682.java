package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class StarMapUtilities_getSystemFullness_15431429682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3530848;
     Object term3530921;
     Object term3530923;

    public StarMapUtilities_getSystemFullness_15431429682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3530848 = (Object[]) newArray("[I", 9);
        int[] term3530849 = (int[]) newIntArray(7);
        int[] term3530857 = (int[]) newIntArray(9);
        int[] term3530867 = (int[]) newIntArray(2);
        int[] term3530870 = (int[]) newIntArray(9);
        int[] term3530880 = (int[]) newIntArray(9);
        int[] term3530890 = (int[]) newIntArray(5);
        int[] term3530896 = (int[]) newIntArray(5);
        int[] term3530902 = (int[]) newIntArray(9);
        int[] term3530912 = (int[]) newIntArray(8);
        setIntElement(term3530849, 0, -2005715743);
        setIntElement(term3530849, 1, -587628052);
        setIntElement(term3530849, 2, -1508914649);
        setIntElement(term3530849, 3, 455044976);
        setIntElement(term3530849, 4, -1915443148);
        setIntElement(term3530849, 5, 1975483729);
        setIntElement(term3530849, 6, 175243884);
        setElement(term3530848, 0, term3530849);
        setIntElement(term3530857, 0, 1316940696);
        setIntElement(term3530857, 1, -1228600486);
        setIntElement(term3530857, 2, 1941430350);
        setIntElement(term3530857, 3, 1559927357);
        setIntElement(term3530857, 4, 1657810765);
        setIntElement(term3530857, 5, -1515678424);
        setIntElement(term3530857, 6, -1164201079);
        setIntElement(term3530857, 7, -1297363388);
        setIntElement(term3530857, 8, -729040462);
        setElement(term3530848, 1, term3530857);
        setIntElement(term3530867, 0, -1460127248);
        setIntElement(term3530867, 1, 1611137620);
        setElement(term3530848, 2, term3530867);
        setIntElement(term3530870, 0, 220761304);
        setIntElement(term3530870, 1, 86110691);
        setIntElement(term3530870, 2, -1484866505);
        setIntElement(term3530870, 3, -1670402218);
        setIntElement(term3530870, 4, 1978095578);
        setIntElement(term3530870, 5, -1913010631);
        setIntElement(term3530870, 6, 76125355);
        setIntElement(term3530870, 7, 1363373930);
        setIntElement(term3530870, 8, 181465026);
        setElement(term3530848, 3, term3530870);
        setIntElement(term3530880, 0, 1008958413);
        setIntElement(term3530880, 1, 925623635);
        setIntElement(term3530880, 2, -488370490);
        setIntElement(term3530880, 3, 1773542388);
        setIntElement(term3530880, 4, 686453307);
        setIntElement(term3530880, 5, -1495208952);
        setIntElement(term3530880, 6, 932275295);
        setIntElement(term3530880, 7, 48833624);
        setIntElement(term3530880, 8, 886628263);
        setElement(term3530848, 4, term3530880);
        setIntElement(term3530890, 0, 851355683);
        setIntElement(term3530890, 1, -1563781236);
        setIntElement(term3530890, 2, 989646889);
        setIntElement(term3530890, 3, -1033058043);
        setIntElement(term3530890, 4, 507553655);
        setElement(term3530848, 5, term3530890);
        setIntElement(term3530896, 0, 1958386665);
        setIntElement(term3530896, 1, -512492021);
        setIntElement(term3530896, 2, -1947354476);
        setIntElement(term3530896, 3, -1296159103);
        setIntElement(term3530896, 4, 160827261);
        setElement(term3530848, 6, term3530896);
        setIntElement(term3530902, 0, -1421203101);
        setIntElement(term3530902, 1, 952566954);
        setIntElement(term3530902, 2, -434229282);
        setIntElement(term3530902, 3, 729655071);
        setIntElement(term3530902, 4, -168922909);
        setIntElement(term3530902, 5, 1388478647);
        setIntElement(term3530902, 6, -1450260740);
        setIntElement(term3530902, 7, -1530170092);
        setIntElement(term3530902, 8, -825232797);
        setElement(term3530848, 7, term3530902);
        setIntElement(term3530912, 0, 381428355);
        setIntElement(term3530912, 1, -47371756);
        setIntElement(term3530912, 2, 652596733);
        setIntElement(term3530912, 3, -567046153);
        setIntElement(term3530912, 4, -2027497030);
        setIntElement(term3530912, 5, -1830402217);
        setIntElement(term3530912, 6, 1963933679);
        setIntElement(term3530912, 7, 2130211389);
        setElement(term3530848, 8, term3530912);
        term3530921 = new Integer(356485034);
        term3530923 = new Integer(715620711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapUtilities");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3530848;
        args[1] = term3530921;
        args[2] = term3530923;
        callMethod(klass, "getSystemFullness", argTypes, null, args);
    }

};


