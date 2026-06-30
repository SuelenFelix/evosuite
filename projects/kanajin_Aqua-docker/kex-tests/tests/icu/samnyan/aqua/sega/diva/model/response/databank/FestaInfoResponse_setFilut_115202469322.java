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

public class FestaInfoResponse_setFilut_115202469322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11000;

    public FestaInfoResponse_setFilut_115202469322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11000 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term11000, term11000.getClass(), "fi_id", "jiCGTTzKGB");
        setField(term11000, term11000.getClass(), "fi_name", "MqICFYzDJj");
        setField(term11000, term11000.getClass(), "fi_kind", "YgQvdcBQKw");
        setField(term11000, term11000.getClass(), "fi_difficulty", "FiYYLuailz");
        setField(term11000, term11000.getClass(), "fi_pv_id_lst", "XebAeSnCKZ");
        setField(term11000, term11000.getClass(), "fi_attr", "GeddnXjHGy");
        setField(term11000, term11000.getClass(), "fi_add_vp", "vLTbaoAxBm");
        setField(term11000, term11000.getClass(), "fi_mul_vp", "BXTjEyEZxD");
        setField(term11000, term11000.getClass(), "fi_st", "oKhVzOKUFW");
        setField(term11000, term11000.getClass(), "fi_et", "mNHyqmOAFy");
        setField(term11000, term11000.getClass(), "fi_lut", "UxgSdhxPCH");
        setField(term11000, term11000.getClass(), "cmd", "DAujxZPHJC");
        setField(term11000, term11000.getClass(), "req_id", "IlBhdrCvHq");
        setField(term11000, term11000.getClass(), "stat", "OirVUQhauU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GLbyDfbNZI";
        callMethod(klass, "setFi_lut", argTypes, term11000, args);
    }

};


