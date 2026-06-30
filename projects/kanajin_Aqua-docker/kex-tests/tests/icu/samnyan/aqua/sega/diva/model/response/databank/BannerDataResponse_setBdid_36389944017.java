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
import java.lang.Integer;

public class BannerDataResponse_setBdid_36389944017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1171;
     Object term1173;

    public BannerDataResponse_setBdid_36389944017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1171 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse"));
        setField(term1171, term1171.getClass(), "bd_ut", null);
        setField(term1171, term1171.getClass(), "bd_ti", null);
        setField(term1171, term1171.getClass(), "bd_hs", null);
        setIntField(term1171, term1171.getClass(), "bd_id", 0);
        setField(term1171, term1171.getClass(), "cmd", null);
        setField(term1171, term1171.getClass(), "req_id", null);
        setField(term1171, term1171.getClass(), "stat", null);
        term1173 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1173;
        callMethod(klass, "setBd_id", argTypes, term1171, args);
    }

};


