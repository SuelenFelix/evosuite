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

public class FestaInfoResponse_getFiet_150165861133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11340;

    public FestaInfoResponse_getFiet_150165861133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11340 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term11340, term11340.getClass(), "fi_id", null);
        setField(term11340, term11340.getClass(), "fi_name", null);
        setField(term11340, term11340.getClass(), "fi_kind", null);
        setField(term11340, term11340.getClass(), "fi_difficulty", null);
        setField(term11340, term11340.getClass(), "fi_pv_id_lst", null);
        setField(term11340, term11340.getClass(), "fi_attr", null);
        setField(term11340, term11340.getClass(), "fi_add_vp", null);
        setField(term11340, term11340.getClass(), "fi_mul_vp", null);
        setField(term11340, term11340.getClass(), "fi_st", null);
        setField(term11340, term11340.getClass(), "fi_et", null);
        setField(term11340, term11340.getClass(), "fi_lut", null);
        setField(term11340, term11340.getClass(), "cmd", null);
        setField(term11340, term11340.getClass(), "req_id", null);
        setField(term11340, term11340.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFi_et", argTypes, term11340, args);
    }

};


