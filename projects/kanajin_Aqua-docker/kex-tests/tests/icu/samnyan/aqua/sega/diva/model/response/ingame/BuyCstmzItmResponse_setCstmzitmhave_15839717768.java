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

public class BuyCstmzItmResponse_setCstmzitmhave_15839717768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2870;

    public BuyCstmzItmResponse_setCstmzitmhave_15839717768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2946 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term2945 = ((Class) term2946).getDeclaredField((String) "SUCCESS");
        ((Field) term2945).setAccessible(true);
        Object enum8 = ((Field) term2945).get((Object) null);
        term2870 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse"));
        setField(term2870, term2870.getClass(), "shp_rslt", enum8);
        setIntField(term2870, term2870.getClass(), "cstmz_itm_id", 597278769);
        setField(term2870, term2870.getClass(), "cstmz_itm_have", "dWRymuLBtr");
        setIntField(term2870, term2870.getClass(), "vcld_pts", -1685132342);
        setField(term2870, term2870.getClass(), "cmd", "AijpHYOFuy");
        setField(term2870, term2870.getClass(), "req_id", "SbAoxhfrkn");
        setField(term2870, term2870.getClass(), "stat", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Ghbwtircqb";
        callMethod(klass, "setCstmz_itm_have", argTypes, term2870, args);
    }

};


