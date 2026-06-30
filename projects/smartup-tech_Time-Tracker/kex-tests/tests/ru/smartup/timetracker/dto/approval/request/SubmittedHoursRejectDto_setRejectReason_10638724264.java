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

public class SubmittedHoursRejectDto_setRejectReason_10638724264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;

    public SubmittedHoursRejectDto_setRejectReason_10638724264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term240 = new Long(-1154553077993834885L);
        Long term242 = new Long(-2850532706972744550L);
        Long term244 = new Long(-2644215923136513282L);
        Long term246 = new Long(-1468719814009985452L);
        Long term248 = new Long(-7738503207562305297L);
        Long term250 = new Long(3825396310311739952L);
        ArrayList term238 = new ArrayList();
        ((ArrayList) term238).add(term240);
        ((ArrayList) term238).add(term242);
        ((ArrayList) term238).add(term244);
        ((ArrayList) term238).add(term246);
        ((ArrayList) term238).add(term248);
        ((ArrayList) term238).add(term250);
        term237 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto"));
        setField(term237, term237.getClass(), "trackUnitIds", term238);
        setField(term237, term237.getClass(), "rejectReason", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "setRejectReason", argTypes, term237, args);
    }

};


