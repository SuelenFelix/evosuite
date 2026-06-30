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

public class FestaInfoResponse_setFikind_201424753814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8352;

    public FestaInfoResponse_setFikind_201424753814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8352 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term8352, term8352.getClass(), "fi_id", "FbSIUZyBXZ");
        setField(term8352, term8352.getClass(), "fi_name", "mhQDwIyrRi");
        setField(term8352, term8352.getClass(), "fi_kind", "HpZXWDPhlg");
        setField(term8352, term8352.getClass(), "fi_difficulty", "lBOokzEPfe");
        setField(term8352, term8352.getClass(), "fi_pv_id_lst", "dtGZCsKXbW");
        setField(term8352, term8352.getClass(), "fi_attr", "bdyhHbDAmJ");
        setField(term8352, term8352.getClass(), "fi_add_vp", "BBXiTNHqGE");
        setField(term8352, term8352.getClass(), "fi_mul_vp", "IEYhJmgCVd");
        setField(term8352, term8352.getClass(), "fi_st", "KSJeYkkvpk");
        setField(term8352, term8352.getClass(), "fi_et", "qUtkFGMNUV");
        setField(term8352, term8352.getClass(), "fi_lut", "mGRiYhnMcR");
        setField(term8352, term8352.getClass(), "cmd", "NFlvfJCVPO");
        setField(term8352, term8352.getClass(), "req_id", "KarbTXFmUU");
        setField(term8352, term8352.getClass(), "stat", "jiUSjqwSIQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MgLCedQfoj";
        callMethod(klass, "setFi_kind", argTypes, term8352, args);
    }

};


