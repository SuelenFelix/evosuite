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

public class SubmittedHoursRejectDto_equals_15458166705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298;
     Object term325;

    public SubmittedHoursRejectDto_equals_15458166705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term301 = new Long(-3838084482494604218L);
        Long term303 = new Long(3892018155439224435L);
        Long term305 = new Long(5953383087795962419L);
        Long term307 = new Long(7994303628307559416L);
        Long term309 = new Long(2443640364875054177L);
        ArrayList term299 = new ArrayList();
        ((ArrayList) term299).add(term301);
        ((ArrayList) term299).add(term303);
        ((ArrayList) term299).add(term305);
        ((ArrayList) term299).add(term307);
        ((ArrayList) term299).add(term309);
        term298 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto"));
        setField(term298, term298.getClass(), "trackUnitIds", term299);
        setField(term298, term298.getClass(), "rejectReason", "EGtDIRbSSb");
        term325 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term325;
        callMethod(klass, "equals", argTypes, term298, args);
    }

};


