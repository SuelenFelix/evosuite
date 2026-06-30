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

public class ContestInfoResponse_setCilut_11139488893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15247;
     Object term15306;

    public ContestInfoResponse_setCilut_11139488893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15247 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ContestInfoResponse"));
        Object term15248 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15249 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15253 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term15249, term15249.getClass(), "year", 2020);
        setShortField(term15249, term15249.getClass(), "month", (short) 7);
        setShortField(term15249, term15249.getClass(), "day", (short) 24);
        setField(term15248, term15248.getClass(), "date", term15249);
        setByteField(term15253, term15253.getClass(), "hour", (byte) 0);
        setByteField(term15253, term15253.getClass(), "minute", (byte) 59);
        setByteField(term15253, term15253.getClass(), "second", (byte) 56);
        setIntField(term15253, term15253.getClass(), "nano", 320219201);
        setField(term15248, term15248.getClass(), "time", term15253);
        setField(term15247, term15247.getClass(), "ci_lut", term15248);
        setField(term15247, term15247.getClass(), "ci_str", "VuLLXpvPpZ");
        setField(term15247, term15247.getClass(), "cmd", "UEdzEKEEEV");
        setField(term15247, term15247.getClass(), "req_id", "BcENaQFYSd");
        setField(term15247, term15247.getClass(), "stat", "POPYycoDBy");
        term15306 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15307 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15311 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term15307, term15307.getClass(), "year", 2014);
        setShortField(term15307, term15307.getClass(), "month", (short) 7);
        setShortField(term15307, term15307.getClass(), "day", (short) 13);
        setField(term15306, term15306.getClass(), "date", term15307);
        setByteField(term15311, term15311.getClass(), "hour", (byte) 21);
        setByteField(term15311, term15311.getClass(), "minute", (byte) 46);
        setByteField(term15311, term15311.getClass(), "second", (byte) 0);
        setIntField(term15311, term15311.getClass(), "nano", 887884128);
        setField(term15306, term15306.getClass(), "time", term15311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ContestInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term15306;
        callMethod(klass, "setCi_lut", argTypes, term15247, args);
    }

};


