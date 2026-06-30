package ru.smartup.timetracker.service;

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
import static ru.smartup.timetracker.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Long;
import java.lang.Object;

public class TrackUnitService_getTrackUnitsInfo_212112078617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3385;

    public TrackUnitService_getTrackUnitsInfo_212112078617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3388 = new Long(6967924379644551255L);
        Long term3391 = new Long(-2813493605142626659L);
        Long term3394 = new Long(-8885298608300233488L);
        Long term3397 = new Long(-4325723315152823407L);
        term3385 = new LinkedList();
        ((LinkedList) term3385).add(term3388);
        ((LinkedList) term3385).add(term3391);
        ((LinkedList) term3385).add(term3394);
        ((LinkedList) term3385).add(term3397);
        ((LinkedList) term3385).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3385;
        callMethod(klass, "getTrackUnitsInfo", argTypes, null, args);
    }

};


