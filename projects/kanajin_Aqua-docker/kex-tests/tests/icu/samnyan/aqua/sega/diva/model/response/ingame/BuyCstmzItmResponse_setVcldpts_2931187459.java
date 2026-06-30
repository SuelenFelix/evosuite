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

public class BuyCstmzItmResponse_setVcldpts_2931187459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3253;
     Object term3315;

    public BuyCstmzItmResponse_setVcldpts_2931187459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3318 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term3317 = ((Class) term3318).getDeclaredField((String) "FAILED");
        ((Field) term3317).setAccessible(true);
        Object enum9 = ((Field) term3317).get((Object) null);
        term3253 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse"));
        setField(term3253, term3253.getClass(), "shp_rslt", enum9);
        setIntField(term3253, term3253.getClass(), "cstmz_itm_id", -1456670397);
        setField(term3253, term3253.getClass(), "cstmz_itm_have", "xrwlQZdwCp");
        setIntField(term3253, term3253.getClass(), "vcld_pts", 1622346318);
        setField(term3253, term3253.getClass(), "cmd", "IDCWpPLRkE");
        setField(term3253, term3253.getClass(), "req_id", "nyiiPDVjAc");
        setField(term3253, term3253.getClass(), "stat", "aKnKipADSo");
        term3315 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3315;
        callMethod(klass, "setVcld_pts", argTypes, term3253, args);
    }

};


