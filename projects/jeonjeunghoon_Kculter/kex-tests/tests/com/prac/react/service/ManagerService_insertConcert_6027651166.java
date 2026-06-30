package com.prac.react.service;

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
import static com.prac.react.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ManagerService_insertConcert_6027651166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1959;
     Object term1960;

    public ManagerService_insertConcert_6027651166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1959 = newInstance(Class.forName("com.prac.react.service.ManagerService"));
        setField(term1959, term1959.getClass(), "md", null);
        setField(term1959, term1959.getClass(), "logger", null);
        term1960 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term1998 = newInstance(Class.forName("java.util.Date"));
        Object term2000 = newInstance(Class.forName("java.util.Date"));
        setIntField(term1960, term1960.getClass(), "concertNum", 1962444399);
        setField(term1960, term1960.getClass(), "concertHash", "IgRJUzaCwW");
        setField(term1960, term1960.getClass(), "concertName", "JUmudUmaaV");
        setField(term1960, term1960.getClass(), "explain", "KoyGrUJeJW");
        setLongField(term1998, term1998.getClass(), "fastTime", 1345871412244L);
        setField(term1998, term1998.getClass(), "cdate", null);
        setField(term1960, term1960.getClass(), "startDate", term1998);
        setLongField(term2000, term2000.getClass(), "fastTime", 1480438351369L);
        setField(term2000, term2000.getClass(), "cdate", null);
        setField(term1960, term1960.getClass(), "endDate", term2000);
        setDoubleField(term1960, term1960.getClass(), "lat", 0.2641345529914265);
        setDoubleField(term1960, term1960.getClass(), "lng", 0.36923381893433327);
        setIntField(term1960, term1960.getClass(), "starKey", 767834723);
        setField(term1960, term1960.getClass(), "starHash", "HqBOwkVqjD");
        setField(term1960, term1960.getClass(), "imageUrl", "MAcUBcBckh");
        setIntField(term1960, term1960.getClass(), "status", -602026508);
        setField(term1960, term1960.getClass(), "starName", "oVgzLbrsFr");
        setField(term1960, term1960.getClass(), "placeName", "vQVyKLdtaz");
        setField(term1960, term1960.getClass(), "buySite", "OWKQODBLzb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.ManagerService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Concert");
        Object[] args = new Object[1];
        args[0] = term1960;
        callMethod(klass, "insertConcert", argTypes, term1959, args);
    }

};


