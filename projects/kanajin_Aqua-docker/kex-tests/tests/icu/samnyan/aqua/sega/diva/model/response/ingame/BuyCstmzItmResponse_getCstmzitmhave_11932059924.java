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

public class BuyCstmzItmResponse_getCstmzitmhave_11932059924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1428;

    public BuyCstmzItmResponse_getCstmzitmhave_11932059924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1492 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term1491 = ((Class) term1492).getDeclaredField((String) "SUCCESS");
        ((Field) term1491).setAccessible(true);
        Object enum4 = ((Field) term1491).get((Object) null);
        term1428 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse"));
        setField(term1428, term1428.getClass(), "shp_rslt", enum4);
        setIntField(term1428, term1428.getClass(), "cstmz_itm_id", -1955890973);
        setField(term1428, term1428.getClass(), "cstmz_itm_have", "aJlieCFVtF");
        setIntField(term1428, term1428.getClass(), "vcld_pts", -2038273078);
        setField(term1428, term1428.getClass(), "cmd", "ZiaGIbnzTs");
        setField(term1428, term1428.getClass(), "req_id", "tbcdzjIfER");
        setField(term1428, term1428.getClass(), "stat", "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCstmz_itm_have", argTypes, term1428, args);
    }

};


