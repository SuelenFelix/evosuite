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

public class FestaInfoResponse_setFiname_209271799313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8021;

    public FestaInfoResponse_setFiname_209271799313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8021 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse"));
        setField(term8021, term8021.getClass(), "fi_id", "PvmBHIXaMY");
        setField(term8021, term8021.getClass(), "fi_name", "hulYxtowxw");
        setField(term8021, term8021.getClass(), "fi_kind", "GNEmuHPNcU");
        setField(term8021, term8021.getClass(), "fi_difficulty", "IoSfuKDFRe");
        setField(term8021, term8021.getClass(), "fi_pv_id_lst", "AWYyZiNfsm");
        setField(term8021, term8021.getClass(), "fi_attr", "ITRRYiuDwH");
        setField(term8021, term8021.getClass(), "fi_add_vp", "llRfwANcVF");
        setField(term8021, term8021.getClass(), "fi_mul_vp", "sUEeHQTWkA");
        setField(term8021, term8021.getClass(), "fi_st", "BDIRCxAWLA");
        setField(term8021, term8021.getClass(), "fi_et", "eOJfbiZLnb");
        setField(term8021, term8021.getClass(), "fi_lut", "nKZKnxWYCK");
        setField(term8021, term8021.getClass(), "cmd", "JOqQxuzRuZ");
        setField(term8021, term8021.getClass(), "req_id", "RSaoipUlsg");
        setField(term8021, term8021.getClass(), "stat", "cSHGbqKqlN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.FestaInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pFAfANnxup";
        callMethod(klass, "setFi_name", argTypes, term8021, args);
    }

};


