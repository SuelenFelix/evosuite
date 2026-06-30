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

public class QstInfResponse_getQilut_10925975781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11485;

    public QstInfResponse_getQilut_10925975781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11485 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.QstInfResponse"));
        setField(term11485, term11485.getClass(), "qi_lut", "HknsTajwxJ");
        setField(term11485, term11485.getClass(), "qhi_str", "XtiurrVYKw");
        setField(term11485, term11485.getClass(), "qrai_str", "rsumfoDNHa");
        setField(term11485, term11485.getClass(), "cmd", "ceCWHUTQUM");
        setField(term11485, term11485.getClass(), "req_id", "LrqwfrKKtS");
        setField(term11485, term11485.getClass(), "stat", "ZUdnQXfzCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.QstInfResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQi_lut", argTypes, term11485, args);
    }

};


