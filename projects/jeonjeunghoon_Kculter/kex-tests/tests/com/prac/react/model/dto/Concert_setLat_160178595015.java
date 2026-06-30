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
import java.lang.Double;

public class Concert_setLat_160178595015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20499;
     Object term20605;

    public Concert_setLat_160178595015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20499 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term20537 = newInstance(Class.forName("java.util.Date"));
        Object term20539 = newInstance(Class.forName("java.util.Date"));
        setIntField(term20499, term20499.getClass(), "concertNum", 1608016787);
        setField(term20499, term20499.getClass(), "concertHash", "HuKdqrrxIm");
        setField(term20499, term20499.getClass(), "concertName", "yJKKddLqMb");
        setField(term20499, term20499.getClass(), "explain", "LWEYaXeKBe");
        setLongField(term20537, term20537.getClass(), "fastTime", 1496859828764L);
        setField(term20537, term20537.getClass(), "cdate", null);
        setField(term20499, term20499.getClass(), "startDate", term20537);
        setLongField(term20539, term20539.getClass(), "fastTime", 1691868468367L);
        setField(term20539, term20539.getClass(), "cdate", null);
        setField(term20499, term20499.getClass(), "endDate", term20539);
        setDoubleField(term20499, term20499.getClass(), "lat", 0.47210750955444725);
        setDoubleField(term20499, term20499.getClass(), "lng", 0.8381176594884352);
        setIntField(term20499, term20499.getClass(), "starKey", -516303035);
        setField(term20499, term20499.getClass(), "starHash", "cNoFvpHBHw");
        setField(term20499, term20499.getClass(), "imageUrl", "DoSWbCtsBg");
        setIntField(term20499, term20499.getClass(), "status", -2143043890);
        setField(term20499, term20499.getClass(), "starName", "NrXtkbXwDc");
        setField(term20499, term20499.getClass(), "placeName", "EUapSrAmOe");
        setField(term20499, term20499.getClass(), "buySite", "dUHylIprea");
        term20605 = new Double(0.23070800524236523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term20605;
        callMethod(klass, "setLat", argTypes, term20499, args);
    }

};


