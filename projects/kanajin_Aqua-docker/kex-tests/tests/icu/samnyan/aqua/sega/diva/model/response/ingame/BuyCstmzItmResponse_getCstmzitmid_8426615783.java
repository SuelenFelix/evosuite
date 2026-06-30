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

public class BuyCstmzItmResponse_getCstmzitmid_8426615783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1071;

    public BuyCstmzItmResponse_getCstmzitmid_8426615783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1134 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term1133 = ((Class) term1134).getDeclaredField((String) "FAILED");
        ((Field) term1133).setAccessible(true);
        Object enum3 = ((Field) term1133).get((Object) null);
        term1071 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse"));
        setField(term1071, term1071.getClass(), "shp_rslt", enum3);
        setIntField(term1071, term1071.getClass(), "cstmz_itm_id", -1922583790);
        setField(term1071, term1071.getClass(), "cstmz_itm_have", "uuaPigETmJ");
        setIntField(term1071, term1071.getClass(), "vcld_pts", -616727354);
        setField(term1071, term1071.getClass(), "cmd", "MxlszYVzRf");
        setField(term1071, term1071.getClass(), "req_id", "LQFpaHEwXR");
        setField(term1071, term1071.getClass(), "stat", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCstmz_itm_id", argTypes, term1071, args);
    }

};


