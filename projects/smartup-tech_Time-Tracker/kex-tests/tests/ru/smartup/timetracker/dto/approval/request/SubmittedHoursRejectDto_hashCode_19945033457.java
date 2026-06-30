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

public class SubmittedHoursRejectDto_hashCode_19945033457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374;

    public SubmittedHoursRejectDto_hashCode_19945033457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term377 = new Long(305759998609888272L);
        Long term379 = new Long(-8654565919063661957L);
        ArrayList term375 = new ArrayList();
        ((ArrayList) term375).add(term377);
        ((ArrayList) term375).add(term379);
        term374 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto"));
        setField(term374, term374.getClass(), "trackUnitIds", term375);
        setField(term374, term374.getClass(), "rejectReason", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term374, args);
    }

};


