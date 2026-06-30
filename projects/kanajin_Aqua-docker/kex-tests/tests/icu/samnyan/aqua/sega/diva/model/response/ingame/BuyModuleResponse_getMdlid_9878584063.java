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
import java.lang.String;
import java.lang.Object;

public class BuyModuleResponse_getMdlid_9878584063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5973;

    public BuyModuleResponse_getMdlid_9878584063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6036 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term6035 = ((Class) term6036).getDeclaredField((String) "FAILED");
        ((Field) term6035).setAccessible(true);
        Object enum17 = ((Field) term6035).get((Object) null);
        term5973 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse"));
        setField(term5973, term5973.getClass(), "shp_rslt", enum17);
        setIntField(term5973, term5973.getClass(), "mdl_id", -1007160944);
        setField(term5973, term5973.getClass(), "mdl_have", "ieCtQFdkii");
        setIntField(term5973, term5973.getClass(), "vcld_pts", 1135664017);
        setField(term5973, term5973.getClass(), "cmd", "dEnhdmILtU");
        setField(term5973, term5973.getClass(), "req_id", "hoicvmsovO");
        setField(term5973, term5973.getClass(), "stat", "eqJfYWRaEL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMdl_id", argTypes, term5973, args);
    }

};


