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

public class BuyModuleResponse_getShprslt_19187774342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5612;

    public BuyModuleResponse_getShprslt_19187774342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5676 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term5675 = ((Class) term5676).getDeclaredField((String) "SUCCESS");
        ((Field) term5675).setAccessible(true);
        Object enum16 = ((Field) term5675).get((Object) null);
        term5612 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse"));
        setField(term5612, term5612.getClass(), "shp_rslt", enum16);
        setIntField(term5612, term5612.getClass(), "mdl_id", -2068769794);
        setField(term5612, term5612.getClass(), "mdl_have", "ffYhPOzlUs");
        setIntField(term5612, term5612.getClass(), "vcld_pts", -117576464);
        setField(term5612, term5612.getClass(), "cmd", "MLqYREekMl");
        setField(term5612, term5612.getClass(), "req_id", "ytSBIKXogI");
        setField(term5612, term5612.getClass(), "stat", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShp_rslt", argTypes, term5612, args);
    }

};


