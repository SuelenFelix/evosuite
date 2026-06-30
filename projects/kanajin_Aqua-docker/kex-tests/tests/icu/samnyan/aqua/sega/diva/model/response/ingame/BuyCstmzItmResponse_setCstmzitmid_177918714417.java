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
import java.lang.Integer;

public class BuyCstmzItmResponse_setCstmzitmid_177918714417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3631;
     Object term3634;

    public BuyCstmzItmResponse_setCstmzitmid_177918714417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3631 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse"));
        setField(term3631, term3631.getClass(), "shp_rslt", null);
        setIntField(term3631, term3631.getClass(), "cstmz_itm_id", 0);
        setField(term3631, term3631.getClass(), "cstmz_itm_have", null);
        setIntField(term3631, term3631.getClass(), "vcld_pts", 0);
        setField(term3631, term3631.getClass(), "cmd", null);
        setField(term3631, term3631.getClass(), "req_id", null);
        setField(term3631, term3631.getClass(), "stat", null);
        term3634 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3634;
        callMethod(klass, "setCstmz_itm_id", argTypes, term3631, args);
    }

};


