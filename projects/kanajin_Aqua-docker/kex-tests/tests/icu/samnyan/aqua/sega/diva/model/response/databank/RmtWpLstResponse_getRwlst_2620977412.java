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

public class RmtWpLstResponse_getRwlst_2620977412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1396;

    public RmtWpLstResponse_getRwlst_2620977412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1396 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.RmtWpLstResponse"));
        setField(term1396, term1396.getClass(), "rwl_lut", "MLqYREekMl");
        setField(term1396, term1396.getClass(), "rw_lst", "ytSBIKXogI");
        setField(term1396, term1396.getClass(), "cmd", "nHXjMycHlU");
        setField(term1396, term1396.getClass(), "req_id", "ieCtQFdkii");
        setField(term1396, term1396.getClass(), "stat", "dEnhdmILtU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.RmtWpLstResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRw_lst", argTypes, term1396, args);
    }

};


