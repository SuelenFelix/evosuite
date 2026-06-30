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

public class BuyModuleResponse_setShprslt_208417173216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8530;

    public BuyModuleResponse_setShprslt_208417173216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8530 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse"));
        setField(term8530, term8530.getClass(), "shp_rslt", null);
        setIntField(term8530, term8530.getClass(), "mdl_id", 0);
        setField(term8530, term8530.getClass(), "mdl_have", null);
        setIntField(term8530, term8530.getClass(), "vcld_pts", 0);
        setField(term8530, term8530.getClass(), "cmd", null);
        setField(term8530, term8530.getClass(), "req_id", null);
        setField(term8530, term8530.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setShp_rslt", argTypes, term8530, args);
    }

};


