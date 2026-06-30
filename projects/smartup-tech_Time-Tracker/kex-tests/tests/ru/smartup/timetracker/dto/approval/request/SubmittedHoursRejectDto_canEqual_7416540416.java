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

public class SubmittedHoursRejectDto_canEqual_7416540416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336;
     Object term363;

    public SubmittedHoursRejectDto_canEqual_7416540416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term339 = new Long(-1610676979013636850L);
        Long term341 = new Long(2062173786000223358L);
        Long term343 = new Long(-8658027316505137504L);
        Long term345 = new Long(414749984815662075L);
        Long term347 = new Long(463622836963501975L);
        ArrayList term337 = new ArrayList();
        ((ArrayList) term337).add(term339);
        ((ArrayList) term337).add(term341);
        ((ArrayList) term337).add(term343);
        ((ArrayList) term337).add(term345);
        ((ArrayList) term337).add(term347);
        term336 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto"));
        setField(term336, term336.getClass(), "trackUnitIds", term337);
        setField(term336, term336.getClass(), "rejectReason", "SzjVpOQTyS");
        term363 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term363;
        callMethod(klass, "canEqual", argTypes, term336, args);
    }

};


