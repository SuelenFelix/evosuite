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

public class BuyModuleResponse_setVcldpts_65285112419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8541;
     Object term8544;

    public BuyModuleResponse_setVcldpts_65285112419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8541 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse"));
        setField(term8541, term8541.getClass(), "shp_rslt", null);
        setIntField(term8541, term8541.getClass(), "mdl_id", 0);
        setField(term8541, term8541.getClass(), "mdl_have", null);
        setIntField(term8541, term8541.getClass(), "vcld_pts", 0);
        setField(term8541, term8541.getClass(), "cmd", null);
        setField(term8541, term8541.getClass(), "req_id", null);
        setField(term8541, term8541.getClass(), "stat", null);
        term8544 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8544;
        callMethod(klass, "setVcld_pts", argTypes, term8541, args);
    }

};


