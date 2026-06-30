package icu.samnyan.aqua.sega.diva.model.response.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BuyCstmzItmResponse_setVcldpts_29311874519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3639;
     Object term3642;

    public BuyCstmzItmResponse_setVcldpts_29311874519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3639 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse"));
        setField(term3639, term3639.getClass(), "shp_rslt", null);
        setIntField(term3639, term3639.getClass(), "cstmz_itm_id", 0);
        setField(term3639, term3639.getClass(), "cstmz_itm_have", null);
        setIntField(term3639, term3639.getClass(), "vcld_pts", 0);
        setField(term3639, term3639.getClass(), "cmd", null);
        setField(term3639, term3639.getClass(), "req_id", null);
        setField(term3639, term3639.getClass(), "stat", null);
        term3642 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3642;
        callMethod(klass, "setVcld_pts", argTypes, term3639, args);
    }

};


