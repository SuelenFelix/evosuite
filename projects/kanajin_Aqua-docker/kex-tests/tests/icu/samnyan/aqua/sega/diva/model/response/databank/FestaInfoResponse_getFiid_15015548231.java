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

public class FestaInfoResponse_getFiid_15015548231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4291;

    public FestaInfoResponse_getFiid_15015548231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4291 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term4291, term4291.getClass(), "fi_id", "iljANwuEjk");
        setField(term4291, term4291.getClass(), "fi_name", "kNqaJKIATy");
        setField(term4291, term4291.getClass(), "fi_kind", "vKQukfbJUd");
        setField(term4291, term4291.getClass(), "fi_difficulty", "lFRJFUMVbx");
        setField(term4291, term4291.getClass(), "fi_pv_id_lst", "sZdUNdggUW");
        setField(term4291, term4291.getClass(), "fi_attr", "OqbwYQfvAe");
        setField(term4291, term4291.getClass(), "fi_add_vp", "tRxZafjqIx");
        setField(term4291, term4291.getClass(), "fi_mul_vp", "DhjNLmRMCu");
        setField(term4291, term4291.getClass(), "fi_st", "PgPzMSEjjX");
        setField(term4291, term4291.getClass(), "fi_et", "wzsPSPcRdj");
        setField(term4291, term4291.getClass(), "fi_lut", "kGMQdqJYyB");
        setField(term4291, term4291.getClass(), "cmd", "XJJNClzHRf");
        setField(term4291, term4291.getClass(), "req_id", "HDaezxQfQR");
        setField(term4291, term4291.getClass(), "stat", "iikZEapDlu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFi_id", argTypes, term4291, args);
    }

};


