package icu.samnyan.aqua.sega.diva.model.response.databank;

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
import static icu.samnyan.aqua.sega.diva.model.response.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ContestInfoResponse_getCilut_2384166151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15049;

    public ContestInfoResponse_getCilut_2384166151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15049 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ContestInfoResponse"));
        Object term15050 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15055 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term15051, term15051.getClass(), "year", 2029);
        setShortField(term15051, term15051.getClass(), "month", (short) 6);
        setShortField(term15051, term15051.getClass(), "day", (short) 23);
        setField(term15050, term15050.getClass(), "date", term15051);
        setByteField(term15055, term15055.getClass(), "hour", (byte) 21);
        setByteField(term15055, term15055.getClass(), "minute", (byte) 55);
        setByteField(term15055, term15055.getClass(), "second", (byte) 27);
        setIntField(term15055, term15055.getClass(), "nano", 66889274);
        setField(term15050, term15050.getClass(), "time", term15055);
        setField(term15049, term15049.getClass(), "ci_lut", term15050);
        setField(term15049, term15049.getClass(), "ci_str", "vpZIqpFbKM");
        setField(term15049, term15049.getClass(), "cmd", "dAbwpJCDif");
        setField(term15049, term15049.getClass(), "req_id", "ATSXJPySio");
        setField(term15049, term15049.getClass(), "stat", "XZkOUcbfFg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ContestInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCi_lut", argTypes, term15049, args);
    }

};


