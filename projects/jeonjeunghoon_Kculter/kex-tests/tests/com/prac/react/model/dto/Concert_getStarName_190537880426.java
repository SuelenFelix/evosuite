package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Concert_getStarName_190537880426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22597;

    public Concert_getStarName_190537880426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22597 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term22635 = newInstance(Class.forName("java.util.Date"));
        Object term22637 = newInstance(Class.forName("java.util.Date"));
        setIntField(term22597, term22597.getClass(), "concertNum", -1945635750);
        setField(term22597, term22597.getClass(), "concertHash", "HEWWLhfKIa");
        setField(term22597, term22597.getClass(), "concertName", "mJJkYzNPob");
        setField(term22597, term22597.getClass(), "explain", "mRDwekkZQg");
        setLongField(term22635, term22635.getClass(), "fastTime", 1853963979281L);
        setField(term22635, term22635.getClass(), "cdate", null);
        setField(term22597, term22597.getClass(), "startDate", term22635);
        setLongField(term22637, term22637.getClass(), "fastTime", 1795936337628L);
        setField(term22637, term22637.getClass(), "cdate", null);
        setField(term22597, term22597.getClass(), "endDate", term22637);
        setDoubleField(term22597, term22597.getClass(), "lat", 0.0013046823258857643);
        setDoubleField(term22597, term22597.getClass(), "lng", 0.5404409545293147);
        setIntField(term22597, term22597.getClass(), "starKey", -1622760744);
        setField(term22597, term22597.getClass(), "starHash", "RIGChgqpTI");
        setField(term22597, term22597.getClass(), "imageUrl", "YCrgXnhgoK");
        setIntField(term22597, term22597.getClass(), "status", 2068435279);
        setField(term22597, term22597.getClass(), "starName", "nQodIeQekM");
        setField(term22597, term22597.getClass(), "placeName", "YXORpHCDcd");
        setField(term22597, term22597.getClass(), "buySite", "XzZbAcRADD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStarName", argTypes, term22597, args);
    }

};


