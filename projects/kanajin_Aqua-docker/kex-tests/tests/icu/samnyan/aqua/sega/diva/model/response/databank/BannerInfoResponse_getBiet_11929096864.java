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

public class BannerInfoResponse_getBiet_11929096864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13592;

    public BannerInfoResponse_getBiet_11929096864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13592 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse"));
        setField(term13592, term13592.getClass(), "bi_lut", "JdOMfNWgLP");
        setField(term13592, term13592.getClass(), "bi_id", "uWqXrwAsDU");
        setField(term13592, term13592.getClass(), "bi_st", "hgFbWAUtsu");
        setField(term13592, term13592.getClass(), "bi_et", "HqoTWlkbwF");
        setField(term13592, term13592.getClass(), "bi_ut", "CwNELDTAPP");
        setField(term13592, term13592.getClass(), "cmd", "GSzQdbHLHw");
        setField(term13592, term13592.getClass(), "req_id", "IkfarsYNJO");
        setField(term13592, term13592.getClass(), "stat", "aZKOWhHMEh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.BannerInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBi_et", argTypes, term13592, args);
    }

};


