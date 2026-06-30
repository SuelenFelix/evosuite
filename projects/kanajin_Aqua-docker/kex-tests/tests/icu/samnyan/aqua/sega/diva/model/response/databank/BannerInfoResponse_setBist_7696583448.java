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

public class BannerInfoResponse_setBist_7696583448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14344;

    public BannerInfoResponse_setBist_7696583448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14344 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse"));
        setField(term14344, term14344.getClass(), "bi_lut", "RbQmXqfXAT");
        setField(term14344, term14344.getClass(), "bi_id", "fcCAsvfBbe");
        setField(term14344, term14344.getClass(), "bi_st", "mUNcKUxghj");
        setField(term14344, term14344.getClass(), "bi_et", "lnvLKbtveE");
        setField(term14344, term14344.getClass(), "bi_ut", "FfrrEhTHzQ");
        setField(term14344, term14344.getClass(), "cmd", "LXnDNrMsqT");
        setField(term14344, term14344.getClass(), "req_id", "ZLQamJFBmu");
        setField(term14344, term14344.getClass(), "stat", "ZWcOCwKNvd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GTmoNrziyc";
        callMethod(klass, "setBi_st", argTypes, term14344, args);
    }

};


