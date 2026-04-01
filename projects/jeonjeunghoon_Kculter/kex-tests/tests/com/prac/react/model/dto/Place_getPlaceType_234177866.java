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

public class Place_getPlaceType_234177866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4997;

    public Place_getPlaceType_234177866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4997 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term4997, term4997.getClass(), "placeNum", -1685132342);
        setField(term4997, term4997.getClass(), "keyHash", "SFqCrhEWLm");
        setIntField(term4997, term4997.getClass(), "placeType", -1456670397);
        setField(term4997, term4997.getClass(), "culture", "GZdcJyZntS");
        setField(term4997, term4997.getClass(), "kpop", "OIHoJeysUi");
        setDoubleField(term4997, term4997.getClass(), "lat", 0.5804948995371725);
        setDoubleField(term4997, term4997.getClass(), "lng", 0.20737514139742264);
        setIntField(term4997, term4997.getClass(), "status", 1622346318);
        setField(term4997, term4997.getClass(), "name", "WXMWFDGcLB");
        setField(term4997, term4997.getClass(), "explain", "wKWbJssZuG");
        setField(term4997, term4997.getClass(), "address", "NzBMMhkhpT");
        setField(term4997, term4997.getClass(), "fileUrl", "qCpEbQDHdF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceType", argTypes, term4997, args);
    }

};


