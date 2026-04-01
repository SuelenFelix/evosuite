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

public class StarMapUtilities_isSolarSystem_6200599991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3530728;
     Object term3530788;
     Object term3530790;
     Object term3530792;
     Object term3530794;
     Object term3530796;

    public StarMapUtilities_isSolarSystem_6200599991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3530728 = (Object[]) newArray("[I", 9);
        int[] term3530729 = (int[]) newIntArray(8);
        int[] term3530738 = (int[]) newIntArray(5);
        int[] term3530744 = (int[]) newIntArray(7);
        int[] term3530752 = (int[]) newIntArray(3);
        int[] term3530756 = (int[]) newIntArray(9);
        int[] term3530766 = (int[]) newIntArray(3);
        int[] term3530770 = (int[]) newIntArray(3);
        int[] term3530774 = (int[]) newIntArray(8);
        int[] term3530783 = (int[]) newIntArray(4);
        setIntElement(term3530729, 0, 406886576);
        setIntElement(term3530729, 1, -674587049);
        setIntElement(term3530729, 2, 1868860117);
        setIntElement(term3530729, 3, -2091775114);
        setIntElement(term3530729, 4, 816037634);
        setIntElement(term3530729, 5, -1328782550);
        setIntElement(term3530729, 6, -964783590);
        setIntElement(term3530729, 7, 662278555);
        setElement(term3530728, 0, term3530729);
        setIntElement(term3530738, 0, 675053980);
        setIntElement(term3530738, 1, 630896456);
        setIntElement(term3530738, 2, -559620087);
        setIntElement(term3530738, 3, 1044006442);
        setIntElement(term3530738, 4, -884408608);
        setElement(term3530728, 1, term3530738);
        setIntElement(term3530744, 0, -567315556);
        setIntElement(term3530744, 1, 1987001110);
        setIntElement(term3530744, 2, 1688653245);
        setIntElement(term3530744, 3, -550263001);
        setIntElement(term3530744, 4, -964062102);
        setIntElement(term3530744, 5, 472819255);
        setIntElement(term3530744, 6, 1405536519);
        setElement(term3530728, 2, term3530744);
        setIntElement(term3530752, 0, 1976942050);
        setIntElement(term3530752, 1, -2026599004);
        setIntElement(term3530752, 2, -1430273885);
        setElement(term3530728, 3, term3530752);
        setIntElement(term3530756, 0, 1222882124);
        setIntElement(term3530756, 1, 285100289);
        setIntElement(term3530756, 2, 1224740988);
        setIntElement(term3530756, 3, 918347228);
        setIntElement(term3530756, 4, -1591692270);
        setIntElement(term3530756, 5, -1301409129);
        setIntElement(term3530756, 6, -1477044678);
        setIntElement(term3530756, 7, 1651186160);
        setIntElement(term3530756, 8, 1011963928);
        setElement(term3530728, 4, term3530756);
        setIntElement(term3530766, 0, -195059522);
        setIntElement(term3530766, 1, -1943649202);
        setIntElement(term3530766, 2, 44953082);
        setElement(term3530728, 5, term3530766);
        setIntElement(term3530770, 0, -238131833);
        setIntElement(term3530770, 1, -1229174857);
        setIntElement(term3530770, 2, -2001011288);
        setElement(term3530728, 6, term3530770);
        setIntElement(term3530774, 0, 1510017263);
        setIntElement(term3530774, 1, -230211737);
        setIntElement(term3530774, 2, 730708566);
        setIntElement(term3530774, 3, 71152967);
        setIntElement(term3530774, 4, 405827734);
        setIntElement(term3530774, 5, -25064364);
        setIntElement(term3530774, 6, 474856604);
        setIntElement(term3530774, 7, 1026905616);
        setElement(term3530728, 7, term3530774);
        setIntElement(term3530783, 0, 847458008);
        setIntElement(term3530783, 1, 2078282865);
        setIntElement(term3530783, 2, 128703653);
        setIntElement(term3530783, 3, -979184672);
        setElement(term3530728, 8, term3530783);
        term3530788 = new Integer(2022510393);
        term3530790 = new Integer(1873087131);
        term3530792 = new Integer(1048270276);
        term3530794 = new Integer(730675684);
        term3530796 = new Integer(975188134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapUtilities");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term3530728;
        args[1] = term3530788;
        args[2] = term3530790;
        args[3] = term3530792;
        args[4] = term3530794;
        args[5] = term3530796;
        callMethod(klass, "isSolarSystem", argTypes, null, args);
    }

};


