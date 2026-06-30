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

public class FestaInfoResponse_setFikind_201424753837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11344;

    public FestaInfoResponse_setFikind_201424753837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11344 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term11344, term11344.getClass(), "fi_id", null);
        setField(term11344, term11344.getClass(), "fi_name", null);
        setField(term11344, term11344.getClass(), "fi_kind", null);
        setField(term11344, term11344.getClass(), "fi_difficulty", null);
        setField(term11344, term11344.getClass(), "fi_pv_id_lst", null);
        setField(term11344, term11344.getClass(), "fi_attr", null);
        setField(term11344, term11344.getClass(), "fi_add_vp", null);
        setField(term11344, term11344.getClass(), "fi_mul_vp", null);
        setField(term11344, term11344.getClass(), "fi_st", null);
        setField(term11344, term11344.getClass(), "fi_et", null);
        setField(term11344, term11344.getClass(), "fi_lut", null);
        setField(term11344, term11344.getClass(), "cmd", null);
        setField(term11344, term11344.getClass(), "req_id", null);
        setField(term11344, term11344.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFi_kind", argTypes, term11344, args);
    }

};


