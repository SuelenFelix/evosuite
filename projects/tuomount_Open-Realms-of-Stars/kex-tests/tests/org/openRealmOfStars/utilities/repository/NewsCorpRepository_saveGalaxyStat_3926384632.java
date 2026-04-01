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

public class NewsCorpRepository_saveGalaxyStat_3926384632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1948;
     Object term1962;

    public NewsCorpRepository_saveGalaxyStat_3926384632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1948 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term1950 = (byte[]) newByteArray(4);
        byte[] term1955 = (byte[]) newByteArray(4);
        Object term1961 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1948, term1948.getClass(), "written", 1265463001);
        setByteElement(term1950, 0, (byte) -104);
        setByteElement(term1950, 1, (byte) -89);
        setByteElement(term1950, 2, (byte) 13);
        setByteElement(term1950, 3, (byte) 44);
        setField(term1948, term1948.getClass(), "bytearr", term1950);
        setByteElement(term1955, 0, (byte) -63);
        setByteElement(term1955, 1, (byte) 15);
        setByteElement(term1955, 2, (byte) 45);
        setByteElement(term1955, 3, (byte) -39);
        setField(term1948, term1948.getClass(), "writeBuffer", term1955);
        setField(term1948, term1948.getClass(), "out", null);
        setBooleanField(term1948, term1948.getClass(), "closed", true);
        setField(term1948, term1948.getClass(), "closeLock", term1961);
        term1962 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term1976 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 0);
        setField(term1962, term1962.getClass(), "galaxyStatisticsName", "hRNSzYYIrc");
        setIntField(term1962, term1962.getClass(), "maxPlayers", 335112684);
        setField(term1962, term1962.getClass(), "dataStat", term1976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.NewsCorpRepository");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        Object[] args = new Object[2];
        args[0] = term1948;
        args[1] = term1962;
        callMethod(klass, "saveGalaxyStat", argTypes, null, args);
    }

};


