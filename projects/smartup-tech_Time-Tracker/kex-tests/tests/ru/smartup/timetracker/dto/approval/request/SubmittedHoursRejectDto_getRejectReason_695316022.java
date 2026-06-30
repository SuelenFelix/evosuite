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

public class SubmittedHoursRejectDto_getRejectReason_695316022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123;

    public SubmittedHoursRejectDto_getRejectReason_695316022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term126 = new Long(-4502405999831680926L);
        Long term128 = new Long(1967728129628047933L);
        Long term130 = new Long(2120084523938730454L);
        Long term132 = new Long(6855071767938501807L);
        Long term134 = new Long(-5892135042702373494L);
        Long term136 = new Long(5262507301787091109L);
        Long term138 = new Long(-6823727938421990489L);
        Long term140 = new Long(-484994522244390100L);
        Long term142 = new Long(1233889271256172047L);
        ArrayList term124 = new ArrayList();
        ((ArrayList) term124).add(term126);
        ((ArrayList) term124).add(term128);
        ((ArrayList) term124).add(term130);
        ((ArrayList) term124).add(term132);
        ((ArrayList) term124).add(term134);
        ((ArrayList) term124).add(term136);
        ((ArrayList) term124).add(term138);
        ((ArrayList) term124).add(term140);
        ((ArrayList) term124).add(term142);
        term123 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto"));
        setField(term123, term123.getClass(), "trackUnitIds", term124);
        setField(term123, term123.getClass(), "rejectReason", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.request.SubmittedHoursRejectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRejectReason", argTypes, term123, args);
    }

};


