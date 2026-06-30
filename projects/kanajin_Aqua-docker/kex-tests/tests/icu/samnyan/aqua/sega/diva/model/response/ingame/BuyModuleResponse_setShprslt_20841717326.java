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

public class BuyModuleResponse_setShprslt_20841717326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7048;
     Object enum20;

    public BuyModuleResponse_setShprslt_20841717326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7112 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term7111 = ((Class) term7112).getDeclaredField((String) "SUCCESS");
        ((Field) term7111).setAccessible(true);
        enum20 = ((Field) term7111).get((Object) null);
        term7048 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse"));
        setField(term7048, term7048.getClass(), "shp_rslt", enum20);
        setIntField(term7048, term7048.getClass(), "mdl_id", -203030934);
        setField(term7048, term7048.getClass(), "mdl_have", "JUmudUmaaV");
        setIntField(term7048, term7048.getClass(), "vcld_pts", -1179120542);
        setField(term7048, term7048.getClass(), "cmd", "KoyGrUJeJW");
        setField(term7048, term7048.getClass(), "req_id", "HqBOwkVqjD");
        setField(term7048, term7048.getClass(), "stat", "MAcUBcBckh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        Object[] args = new Object[1];
        args[0] = enum20;
        callMethod(klass, "setShp_rslt", argTypes, term7048, args);
    }

};


