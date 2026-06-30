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

public class BannerDataResponse_setBdti_51582197915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1167;

    public BannerDataResponse_setBdti_51582197915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1167 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse"));
        setField(term1167, term1167.getClass(), "bd_ut", null);
        setField(term1167, term1167.getClass(), "bd_ti", null);
        setField(term1167, term1167.getClass(), "bd_hs", null);
        setIntField(term1167, term1167.getClass(), "bd_id", 0);
        setField(term1167, term1167.getClass(), "cmd", null);
        setField(term1167, term1167.getClass(), "req_id", null);
        setField(term1167, term1167.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerDataResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBd_ti", argTypes, term1167, args);
    }

};


