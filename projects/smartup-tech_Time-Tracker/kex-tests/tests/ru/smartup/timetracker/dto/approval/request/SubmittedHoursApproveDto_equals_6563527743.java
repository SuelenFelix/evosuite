package ru.smartup.timetracker.dto.approval.request;

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
import static ru.smartup.timetracker.dto.approval.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;

public class SubmittedHoursApproveDto_equals_6563527743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32;
     Object term45;

    public SubmittedHoursApproveDto_equals_6563527743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35 = new Long(6967924379644551255L);
        Long term37 = new Long(-2813493605142626659L);
        Long term39 = new Long(-8885298608300233488L);
        Long term41 = new Long(-4325723315152823407L);
        ArrayList term33 = new ArrayList();
        ((ArrayList) term33).add(term35);
        ((ArrayList) term33).add(term37);
        ((ArrayList) term33).add(term39);
        ((ArrayList) term33).add(term41);
        term32 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursApproveDto"));
        setField(term32, term32.getClass(), "trackUnitIds", term33);
        term45 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursApproveDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term45;
        callMethod(klass, "equals", argTypes, term32, args);
    }

};


