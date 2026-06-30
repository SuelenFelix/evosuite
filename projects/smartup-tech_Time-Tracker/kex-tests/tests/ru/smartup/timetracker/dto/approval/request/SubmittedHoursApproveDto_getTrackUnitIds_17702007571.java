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

public class SubmittedHoursApproveDto_getTrackUnitIds_17702007571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SubmittedHoursApproveDto_getTrackUnitIds_17702007571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4 = new Long(2442117782898005296L);
        Long term6 = new Long(6375119433582206027L);
        Long term8 = new Long(-8257434502486459194L);
        Long term10 = new Long(-8400487765614892086L);
        Long term12 = new Long(5270370404989704783L);
        ArrayList term2 = new ArrayList();
        ((ArrayList) term2).add(term4);
        ((ArrayList) term2).add(term6);
        ((ArrayList) term2).add(term8);
        ((ArrayList) term2).add(term10);
        ((ArrayList) term2).add(term12);
        term1 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursApproveDto"));
        setField(term1, term1.getClass(), "trackUnitIds", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursApproveDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackUnitIds", argTypes, term1, args);
    }

};


