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

public class Concert_getLat_101165511414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20313;

    public Concert_getLat_101165511414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20313 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term20351 = newInstance(Class.forName("java.util.Date"));
        Object term20353 = newInstance(Class.forName("java.util.Date"));
        setIntField(term20313, term20313.getClass(), "concertNum", 319853052);
        setField(term20313, term20313.getClass(), "concertHash", "iOCnOQXWTl");
        setField(term20313, term20313.getClass(), "concertName", "ARnOWpgtAg");
        setField(term20313, term20313.getClass(), "explain", "MRrYxZoJBW");
        setLongField(term20351, term20351.getClass(), "fastTime", 1329640267573L);
        setField(term20351, term20351.getClass(), "cdate", null);
        setField(term20313, term20313.getClass(), "startDate", term20351);
        setLongField(term20353, term20353.getClass(), "fastTime", 1334853104718L);
        setField(term20353, term20353.getClass(), "cdate", null);
        setField(term20313, term20313.getClass(), "endDate", term20353);
        setDoubleField(term20313, term20313.getClass(), "lat", 0.049786419821445604);
        setDoubleField(term20313, term20313.getClass(), "lng", 0.8814078959581401);
        setIntField(term20313, term20313.getClass(), "starKey", -1097563716);
        setField(term20313, term20313.getClass(), "starHash", "fheZXFNQZh");
        setField(term20313, term20313.getClass(), "imageUrl", "YxHVWlebna");
        setIntField(term20313, term20313.getClass(), "status", 1572907769);
        setField(term20313, term20313.getClass(), "starName", "IEmAQCkrPE");
        setField(term20313, term20313.getClass(), "placeName", "lqFGhtlNRM");
        setField(term20313, term20313.getClass(), "buySite", "GLxLHUsuLw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLat", argTypes, term20313, args);
    }

};


