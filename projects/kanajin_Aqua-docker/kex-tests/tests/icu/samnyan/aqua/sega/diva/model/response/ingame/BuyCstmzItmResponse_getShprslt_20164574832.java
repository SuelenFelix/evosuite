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

public class BuyCstmzItmResponse_getShprslt_20164574832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714;

    public BuyCstmzItmResponse_getShprslt_20164574832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term777 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term776 = ((Class) term777).getDeclaredField((String) "FAILED");
        ((Field) term776).setAccessible(true);
        Object enum2 = ((Field) term776).get((Object) null);
        term714 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse"));
        setField(term714, term714.getClass(), "shp_rslt", enum2);
        setIntField(term714, term714.getClass(), "cstmz_itm_id", 1484323161);
        setField(term714, term714.getClass(), "cstmz_itm_have", "MjGYSRKTNF");
        setIntField(term714, term714.getClass(), "vcld_pts", 391863371);
        setField(term714, term714.getClass(), "cmd", "hRNSzYYIrc");
        setField(term714, term714.getClass(), "req_id", "RMFIsYGgne");
        setField(term714, term714.getClass(), "stat", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShp_rslt", argTypes, term714, args);
    }

};


