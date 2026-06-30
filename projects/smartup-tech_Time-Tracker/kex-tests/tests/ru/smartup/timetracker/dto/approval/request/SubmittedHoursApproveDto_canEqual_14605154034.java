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

public class SubmittedHoursApproveDto_canEqual_14605154034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;
     Object term61;

    public SubmittedHoursApproveDto_canEqual_14605154034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49 = new Long(2535595959091595249L);
        Long term51 = new Long(-5476826692763582090L);
        Long term53 = new Long(-872011222785455006L);
        Long term55 = new Long(-316468845751588286L);
        Long term57 = new Long(5127676408959197577L);
        ArrayList term47 = new ArrayList();
        ((ArrayList) term47).add(term49);
        ((ArrayList) term47).add(term51);
        ((ArrayList) term47).add(term53);
        ((ArrayList) term47).add(term55);
        ((ArrayList) term47).add(term57);
        term46 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursApproveDto"));
        setField(term46, term46.getClass(), "trackUnitIds", term47);
        term61 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursApproveDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term61;
        callMethod(klass, "canEqual", argTypes, term46, args);
    }

};


