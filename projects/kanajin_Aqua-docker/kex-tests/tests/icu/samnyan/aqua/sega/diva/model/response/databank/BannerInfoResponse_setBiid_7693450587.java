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

public class BannerInfoResponse_setBiid_7693450587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14145;

    public BannerInfoResponse_setBiid_7693450587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14145 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse"));
        setField(term14145, term14145.getClass(), "bi_lut", "DPwIqlszZo");
        setField(term14145, term14145.getClass(), "bi_id", "mNgDshwZNc");
        setField(term14145, term14145.getClass(), "bi_st", "pDqgDbJoFw");
        setField(term14145, term14145.getClass(), "bi_et", "iVOvTzOxwt");
        setField(term14145, term14145.getClass(), "bi_ut", "BjZQdecXvB");
        setField(term14145, term14145.getClass(), "cmd", "iUkOOQhEkw");
        setField(term14145, term14145.getClass(), "req_id", "wmVoFoUVmU");
        setField(term14145, term14145.getClass(), "stat", "lLiSiPCciB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PsMKIIEwdR";
        callMethod(klass, "setBi_id", argTypes, term14145, args);
    }

};


