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

public class ContestInfoResponse_setCistr_20598784754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15356;

    public ContestInfoResponse_setCistr_20598784754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15356 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ContestInfoResponse"));
        Object term15357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15362 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term15358, term15358.getClass(), "year", 2023);
        setShortField(term15358, term15358.getClass(), "month", (short) 3);
        setShortField(term15358, term15358.getClass(), "day", (short) 7);
        setField(term15357, term15357.getClass(), "date", term15358);
        setByteField(term15362, term15362.getClass(), "hour", (byte) 21);
        setByteField(term15362, term15362.getClass(), "minute", (byte) 15);
        setByteField(term15362, term15362.getClass(), "second", (byte) 43);
        setIntField(term15362, term15362.getClass(), "nano", 639721472);
        setField(term15357, term15357.getClass(), "time", term15362);
        setField(term15356, term15356.getClass(), "ci_lut", term15357);
        setField(term15356, term15356.getClass(), "ci_str", "LuWMOXdAPA");
        setField(term15356, term15356.getClass(), "cmd", "blSffTnsOv");
        setField(term15356, term15356.getClass(), "req_id", "qbUMcIvEXH");
        setField(term15356, term15356.getClass(), "stat", "TVxGTjeDcu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ContestInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ABPtcyCzkR";
        callMethod(klass, "setCi_str", argTypes, term15356, args);
    }

};


