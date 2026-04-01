package org.openRealmOfStars.utilities.repository;

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
import static org.openRealmOfStars.utilities.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NewsCorpRepository_loadGalaxyStat_11573185033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1995;
     Object term2016;

    public NewsCorpRepository_loadGalaxyStat_11573185033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1995 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term1996 = (byte[]) newByteArray(7);
        char[] term2004 = (char[]) newCharArray(2);
        byte[] term2007 = (byte[]) newByteArray(1);
        char[] term2009 = (char[]) newCharArray(6);
        setByteElement(term1996, 0, (byte) -20);
        setByteElement(term1996, 1, (byte) 10);
        setByteElement(term1996, 2, (byte) 77);
        setByteElement(term1996, 3, (byte) 14);
        setByteElement(term1996, 4, (byte) -101);
        setByteElement(term1996, 5, (byte) 35);
        setByteElement(term1996, 6, (byte) 66);
        setField(term1995, term1995.getClass(), "bytearr", term1996);
        setCharElement(term2004, 0, 'F');
        setCharElement(term2004, 1, 's');
        setField(term1995, term1995.getClass(), "chararr", term2004);
        setByteElement(term2007, 0, (byte) 123);
        setField(term1995, term1995.getClass(), "readBuffer", term2007);
        setCharElement(term2009, 0, 'j');
        setCharElement(term2009, 1, 'J');
        setCharElement(term2009, 2, 'C');
        setCharElement(term2009, 3, 'Z');
        setCharElement(term2009, 4, 'p');
        setCharElement(term2009, 5, 'V');
        setField(term1995, term1995.getClass(), "lineBuffer", term2009);
        setField(term1995, term1995.getClass(), "in", null);
        term2016 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term2030 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 1);
        Object term2031 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term2032 = (int[]) newIntArray(0);
        setField(term2016, term2016.getClass(), "galaxyStatisticsName", "RMFIsYGgne");
        setIntField(term2016, term2016.getClass(), "maxPlayers", 1551099402);
        setField(term2031, term2031.getClass(), "data", term2032);
        setIntField(term2031, term2031.getClass(), "size", -1);
        setElement(term2030, 0, term2031);
        setField(term2016, term2016.getClass(), "dataStat", term2030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.NewsCorpRepository");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        Object[] args = new Object[2];
        args[0] = term1995;
        args[1] = term2016;
        callMethod(klass, "loadGalaxyStat", argTypes, null, args);
    }

};


