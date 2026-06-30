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

public class BuyCstmzItmResponse_getVcldpts_10708772115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1789;

    public BuyCstmzItmResponse_getVcldpts_10708772115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1853 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term1852 = ((Class) term1853).getDeclaredField((String) "SUCCESS");
        ((Field) term1852).setAccessible(true);
        Object enum5 = ((Field) term1852).get((Object) null);
        term1789 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse"));
        setField(term1789, term1789.getClass(), "shp_rslt", enum5);
        setIntField(term1789, term1789.getClass(), "cstmz_itm_id", 1227103734);
        setField(term1789, term1789.getClass(), "cstmz_itm_have", "pCTimMblYc");
        setIntField(term1789, term1789.getClass(), "vcld_pts", -1339778481);
        setField(term1789, term1789.getClass(), "cmd", "hNxWaHcfhY");
        setField(term1789, term1789.getClass(), "req_id", "RkybSrpybU");
        setField(term1789, term1789.getClass(), "stat", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVcld_pts", argTypes, term1789, args);
    }

};


