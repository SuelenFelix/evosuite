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

public class QstInfResponse_getQraistr_2806194253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11751;

    public QstInfResponse_getQraistr_2806194253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11751 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.QstInfResponse"));
        setField(term11751, term11751.getClass(), "qi_lut", "CAMnvfDLJL");
        setField(term11751, term11751.getClass(), "qhi_str", "mfHtgSbdjD");
        setField(term11751, term11751.getClass(), "qrai_str", "cmuaUiHMVL");
        setField(term11751, term11751.getClass(), "cmd", "xjoSGPWUgu");
        setField(term11751, term11751.getClass(), "req_id", "uzmqjnOUXu");
        setField(term11751, term11751.getClass(), "stat", "xeyjTOCOJb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.QstInfResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQrai_str", argTypes, term11751, args);
    }

};


