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

public class CstmzItmNgMdlListResponse_getCinmllut_9501617551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17325;

    public CstmzItmNgMdlListResponse_getCinmllut_9501617551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17325 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.CstmzItmNgMdlListResponse"));
        setField(term17325, term17325.getClass(), "cinml_lut", "itAUCFhZhq");
        setField(term17325, term17325.getClass(), "cinm_lst", "bIqaKgXgPm");
        setField(term17325, term17325.getClass(), "cmd", "uOJFOUcNvv");
        setField(term17325, term17325.getClass(), "req_id", "tkmmGweDwJ");
        setField(term17325, term17325.getClass(), "stat", "pMfTuAFXxg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.CstmzItmNgMdlListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCinml_lut", argTypes, term17325, args);
    }

};


