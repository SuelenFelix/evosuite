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

public class FestaInfoResponse_setFipvidlst_60604138839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11346;

    public FestaInfoResponse_setFipvidlst_60604138839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11346 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term11346, term11346.getClass(), "fi_id", null);
        setField(term11346, term11346.getClass(), "fi_name", null);
        setField(term11346, term11346.getClass(), "fi_kind", null);
        setField(term11346, term11346.getClass(), "fi_difficulty", null);
        setField(term11346, term11346.getClass(), "fi_pv_id_lst", null);
        setField(term11346, term11346.getClass(), "fi_attr", null);
        setField(term11346, term11346.getClass(), "fi_add_vp", null);
        setField(term11346, term11346.getClass(), "fi_mul_vp", null);
        setField(term11346, term11346.getClass(), "fi_st", null);
        setField(term11346, term11346.getClass(), "fi_et", null);
        setField(term11346, term11346.getClass(), "fi_lut", null);
        setField(term11346, term11346.getClass(), "cmd", null);
        setField(term11346, term11346.getClass(), "req_id", null);
        setField(term11346, term11346.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFi_pv_id_lst", argTypes, term11346, args);
    }

};


