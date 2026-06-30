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

public class Concert_setStartDate_180624983811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19751;
     Object term19857;

    public Concert_setStartDate_180624983811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19751 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term19789 = newInstance(Class.forName("java.util.Date"));
        Object term19791 = newInstance(Class.forName("java.util.Date"));
        setIntField(term19751, term19751.getClass(), "concertNum", -1736183862);
        setField(term19751, term19751.getClass(), "concertHash", "CwZcgFJqMh");
        setField(term19751, term19751.getClass(), "concertName", "RldCZqgRbO");
        setField(term19751, term19751.getClass(), "explain", "LOVugCAgJs");
        setLongField(term19789, term19789.getClass(), "fastTime", 1550698994689L);
        setField(term19789, term19789.getClass(), "cdate", null);
        setField(term19751, term19751.getClass(), "startDate", term19789);
        setLongField(term19791, term19791.getClass(), "fastTime", 1804998087131L);
        setField(term19791, term19791.getClass(), "cdate", null);
        setField(term19751, term19751.getClass(), "endDate", term19791);
        setDoubleField(term19751, term19751.getClass(), "lat", 0.37439559220953034);
        setDoubleField(term19751, term19751.getClass(), "lng", 0.5010337159337968);
        setIntField(term19751, term19751.getClass(), "starKey", 897010381);
        setField(term19751, term19751.getClass(), "starHash", "SNmHXwCiFY");
        setField(term19751, term19751.getClass(), "imageUrl", "HZfkWoqyUW");
        setIntField(term19751, term19751.getClass(), "status", -15712667);
        setField(term19751, term19751.getClass(), "starName", "QRwANPSyfT");
        setField(term19751, term19751.getClass(), "placeName", "DbZKLwYBgy");
        setField(term19751, term19751.getClass(), "buySite", "LnNRVsjmxw");
        term19857 = newInstance(Class.forName("java.util.Date"));
        setLongField(term19857, term19857.getClass(), "fastTime", 1538078916394L);
        setField(term19857, term19857.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term19857;
        callMethod(klass, "setStartDate", argTypes, term19751, args);
    }

};


