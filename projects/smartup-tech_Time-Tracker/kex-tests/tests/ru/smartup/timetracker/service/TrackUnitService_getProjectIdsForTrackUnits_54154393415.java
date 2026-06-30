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

public class TrackUnitService_getProjectIdsForTrackUnits_54154393415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3358;

    public TrackUnitService_getProjectIdsForTrackUnits_54154393415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3361 = new Long(2442117782898005296L);
        Long term3364 = new Long(6375119433582206027L);
        Long term3367 = new Long(-8257434502486459194L);
        Long term3370 = new Long(-8400487765614892086L);
        term3358 = new LinkedList();
        ((LinkedList) term3358).add(term3361);
        ((LinkedList) term3358).add(term3364);
        ((LinkedList) term3358).add(term3367);
        ((LinkedList) term3358).add(term3370);
        ((LinkedList) term3358).add((Object)null);
        ((LinkedList) term3358).add((Object)null);
        ((LinkedList) term3358).add((Object)null);
        ((LinkedList) term3358).add((Object)null);
        ((LinkedList) term3358).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3358;
        callMethod(klass, "getProjectIdsForTrackUnits", argTypes, null, args);
    }

};


