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
import java.util.LinkedList;

public class SubmittedHoursApproveDto_setTrackUnitIds_12355803472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;
     Object term29;

    public SubmittedHoursApproveDto_setTrackUnitIds_12355803472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19 = new Long(7411271909051562686L);
        Long term21 = new Long(4872422362414183754L);
        Long term23 = new Long(6811161968424632369L);
        Long term25 = new Long(-7237588299778557629L);
        ArrayList term17 = new ArrayList();
        ((ArrayList) term17).add(term19);
        ((ArrayList) term17).add(term21);
        ((ArrayList) term17).add(term23);
        ((ArrayList) term17).add(term25);
        term16 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursApproveDto"));
        setField(term16, term16.getClass(), "trackUnitIds", term17);
        term29 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursApproveDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term29;
        callMethod(klass, "setTrackUnitIds", argTypes, term16, args);
    }

};


