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

public class FestaInfoResponse_setFiet_192532702721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10669;

    public FestaInfoResponse_setFiet_192532702721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10669 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term10669, term10669.getClass(), "fi_id", "nHpMKOmlpQ");
        setField(term10669, term10669.getClass(), "fi_name", "fKhrQsJToZ");
        setField(term10669, term10669.getClass(), "fi_kind", "wsysQLGFnl");
        setField(term10669, term10669.getClass(), "fi_difficulty", "ckQLZGFjMX");
        setField(term10669, term10669.getClass(), "fi_pv_id_lst", "qphdrqUtNx");
        setField(term10669, term10669.getClass(), "fi_attr", "bwlLFAfNWx");
        setField(term10669, term10669.getClass(), "fi_add_vp", "JWodNQzjjV");
        setField(term10669, term10669.getClass(), "fi_mul_vp", "CAgxWjhxNf");
        setField(term10669, term10669.getClass(), "fi_st", "goAoCMhKBu");
        setField(term10669, term10669.getClass(), "fi_et", "BWxJSgKHRT");
        setField(term10669, term10669.getClass(), "fi_lut", "AGXoIndFnm");
        setField(term10669, term10669.getClass(), "cmd", "mwmFMNEzkK");
        setField(term10669, term10669.getClass(), "req_id", "kVAmKknVln");
        setField(term10669, term10669.getClass(), "stat", "MRFLbEGYKG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYrGukTyof";
        callMethod(klass, "setFi_et", argTypes, term10669, args);
    }

};


