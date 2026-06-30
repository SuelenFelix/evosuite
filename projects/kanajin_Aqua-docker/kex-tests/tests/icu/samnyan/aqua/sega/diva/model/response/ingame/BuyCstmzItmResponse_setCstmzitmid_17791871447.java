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

public class BuyCstmzItmResponse_setCstmzitmid_17791871447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2511;
     Object term2573;

    public BuyCstmzItmResponse_setCstmzitmid_17791871447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2576 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term2575 = ((Class) term2576).getDeclaredField((String) "FAILED");
        ((Field) term2575).setAccessible(true);
        Object enum7 = ((Field) term2575).get((Object) null);
        term2511 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse"));
        setField(term2511, term2511.getClass(), "shp_rslt", enum7);
        setIntField(term2511, term2511.getClass(), "cstmz_itm_id", 1134449235);
        setField(term2511, term2511.getClass(), "cstmz_itm_have", "OclPbYPkcH");
        setIntField(term2511, term2511.getClass(), "vcld_pts", -883034806);
        setField(term2511, term2511.getClass(), "cmd", "IoAlmYsBwc");
        setField(term2511, term2511.getClass(), "req_id", "TEParAifyi");
        setField(term2511, term2511.getClass(), "stat", "OWDIEULEFu");
        term2573 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2573;
        callMethod(klass, "setCstmz_itm_id", argTypes, term2511, args);
    }

};


