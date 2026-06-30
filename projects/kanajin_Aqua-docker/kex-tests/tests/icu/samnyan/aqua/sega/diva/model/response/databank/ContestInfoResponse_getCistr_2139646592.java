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

public class ContestInfoResponse_getCistr_2139646592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15148;

    public ContestInfoResponse_getCistr_2139646592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15148 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ContestInfoResponse"));
        Object term15149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15150 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15154 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term15150, term15150.getClass(), "year", 2017);
        setShortField(term15150, term15150.getClass(), "month", (short) 3);
        setShortField(term15150, term15150.getClass(), "day", (short) 5);
        setField(term15149, term15149.getClass(), "date", term15150);
        setByteField(term15154, term15154.getClass(), "hour", (byte) 20);
        setByteField(term15154, term15154.getClass(), "minute", (byte) 34);
        setByteField(term15154, term15154.getClass(), "second", (byte) 55);
        setIntField(term15154, term15154.getClass(), "nano", 78024496);
        setField(term15149, term15149.getClass(), "time", term15154);
        setField(term15148, term15148.getClass(), "ci_lut", term15149);
        setField(term15148, term15148.getClass(), "ci_str", "TGiJfagfky");
        setField(term15148, term15148.getClass(), "cmd", "BJklinBmhN");
        setField(term15148, term15148.getClass(), "req_id", "IOddzvEWcl");
        setField(term15148, term15148.getClass(), "stat", "bIrtpkYJWT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.ContestInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCi_str", argTypes, term15148, args);
    }

};


