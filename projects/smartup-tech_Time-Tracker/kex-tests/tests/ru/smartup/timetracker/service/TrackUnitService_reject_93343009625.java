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

public class TrackUnitService_reject_93343009625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3422;

    public TrackUnitService_reject_93343009625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3425 = new Long(-5476826692763582090L);
        Long term3428 = new Long(-872011222785455006L);
        Long term3431 = new Long(-316468845751588286L);
        Long term3434 = new Long(5127676408959197577L);
        term3422 = new LinkedList();
        ((LinkedList) term3422).add(term3425);
        ((LinkedList) term3422).add(term3428);
        ((LinkedList) term3422).add(term3431);
        ((LinkedList) term3422).add(term3434);
        ((LinkedList) term3422).add((Object)null);
        ((LinkedList) term3422).add((Object)null);
        ((LinkedList) term3422).add((Object)null);
        ((LinkedList) term3422).add((Object)null);
        ((LinkedList) term3422).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3422;
        args[1] = "nghfqDXyCG";
        callMethod(klass, "reject", argTypes, null, args);
    }

};


