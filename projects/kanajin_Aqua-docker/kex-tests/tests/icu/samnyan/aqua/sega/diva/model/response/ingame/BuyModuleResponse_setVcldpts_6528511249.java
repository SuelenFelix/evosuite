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
import java.lang.Integer;

public class BuyModuleResponse_setVcldpts_6528511249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8155;
     Object term8217;

    public BuyModuleResponse_setVcldpts_6528511249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8220 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term8219 = ((Class) term8220).getDeclaredField((String) "FAILED");
        ((Field) term8219).setAccessible(true);
        Object enum23 = ((Field) term8219).get((Object) null);
        term8155 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse"));
        setField(term8155, term8155.getClass(), "shp_rslt", enum23);
        setIntField(term8155, term8155.getClass(), "mdl_id", -469968304);
        setField(term8155, term8155.getClass(), "mdl_have", "LvJFtLBaxj");
        setIntField(term8155, term8155.getClass(), "vcld_pts", -1145578966);
        setField(term8155, term8155.getClass(), "cmd", "PHvxnGHptP");
        setField(term8155, term8155.getClass(), "req_id", "TimdotUuNC");
        setField(term8155, term8155.getClass(), "stat", "PkWMRdJcBb");
        term8217 = new Integer(679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyModuleResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8217;
        callMethod(klass, "setVcld_pts", argTypes, term8155, args);
    }

};


