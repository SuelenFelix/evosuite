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

public class PvDefChrLstResponse_setPdclst_9821604979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17214;

    public PvDefChrLstResponse_setPdclst_9821604979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17214 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvDefChrLstResponse"));
        setField(term17214, term17214.getClass(), "pdcl_lut", null);
        setField(term17214, term17214.getClass(), "pdc_lst", null);
        setField(term17214, term17214.getClass(), "cmd", null);
        setField(term17214, term17214.getClass(), "req_id", null);
        setField(term17214, term17214.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.PvDefChrLstResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPdc_lst", argTypes, term17214, args);
    }

};


