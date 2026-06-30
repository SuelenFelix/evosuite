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

public class BuyModuleResponse_setMdlhave_7426345248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7772;

    public BuyModuleResponse_setMdlhave_7426345248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7848 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term7847 = ((Class) term7848).getDeclaredField((String) "SUCCESS");
        ((Field) term7847).setAccessible(true);
        Object enum22 = ((Field) term7847).get((Object) null);
        term7772 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse"));
        setField(term7772, term7772.getClass(), "shp_rslt", enum22);
        setIntField(term7772, term7772.getClass(), "mdl_id", -1087774327);
        setField(term7772, term7772.getClass(), "mdl_have", "idgaQsnJpQ");
        setIntField(term7772, term7772.getClass(), "vcld_pts", -1530420153);
        setField(term7772, term7772.getClass(), "cmd", "VgZnGoIFwQ");
        setField(term7772, term7772.getClass(), "req_id", "jUbSRrkrYZ");
        setField(term7772, term7772.getClass(), "stat", "bWWfajKbEX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cAPeiZHKGJ";
        callMethod(klass, "setMdl_have", argTypes, term7772, args);
    }

};


