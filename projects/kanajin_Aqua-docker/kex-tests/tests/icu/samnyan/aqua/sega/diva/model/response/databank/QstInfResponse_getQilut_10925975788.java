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

public class QstInfResponse_getQilut_10925975788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12349;

    public QstInfResponse_getQilut_10925975788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12349 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.QstInfResponse"));
        setField(term12349, term12349.getClass(), "qi_lut", null);
        setField(term12349, term12349.getClass(), "qhi_str", null);
        setField(term12349, term12349.getClass(), "qrai_str", null);
        setField(term12349, term12349.getClass(), "cmd", null);
        setField(term12349, term12349.getClass(), "req_id", null);
        setField(term12349, term12349.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.QstInfResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQi_lut", argTypes, term12349, args);
    }

};


