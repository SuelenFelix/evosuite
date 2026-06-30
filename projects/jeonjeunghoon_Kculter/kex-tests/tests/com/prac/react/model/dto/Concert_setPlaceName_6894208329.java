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

public class Concert_setPlaceName_6894208329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23177;

    public Concert_setPlaceName_6894208329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23177 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term23215 = newInstance(Class.forName("java.util.Date"));
        Object term23217 = newInstance(Class.forName("java.util.Date"));
        setIntField(term23177, term23177.getClass(), "concertNum", -1220630391);
        setField(term23177, term23177.getClass(), "concertHash", "zUXaSvayQe");
        setField(term23177, term23177.getClass(), "concertName", "bPVcnnQPSC");
        setField(term23177, term23177.getClass(), "explain", "PQLyoEKWSa");
        setLongField(term23215, term23215.getClass(), "fastTime", 1762147441299L);
        setField(term23215, term23215.getClass(), "cdate", null);
        setField(term23177, term23177.getClass(), "startDate", term23215);
        setLongField(term23217, term23217.getClass(), "fastTime", 1395479491666L);
        setField(term23217, term23217.getClass(), "cdate", null);
        setField(term23177, term23177.getClass(), "endDate", term23217);
        setDoubleField(term23177, term23177.getClass(), "lat", 0.540850203722707);
        setDoubleField(term23177, term23177.getClass(), "lng", 6.134294677928587E-4);
        setIntField(term23177, term23177.getClass(), "starKey", -995822131);
        setField(term23177, term23177.getClass(), "starHash", "HOgkhttJZS");
        setField(term23177, term23177.getClass(), "imageUrl", "goqNSmXSSS");
        setIntField(term23177, term23177.getClass(), "status", -687282231);
        setField(term23177, term23177.getClass(), "starName", "AkViBLdqXM");
        setField(term23177, term23177.getClass(), "placeName", "UlxGFzEifL");
        setField(term23177, term23177.getClass(), "buySite", "HilHTbDKDF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IaEqlVwmNS";
        callMethod(klass, "setPlaceName", argTypes, term23177, args);
    }

};


