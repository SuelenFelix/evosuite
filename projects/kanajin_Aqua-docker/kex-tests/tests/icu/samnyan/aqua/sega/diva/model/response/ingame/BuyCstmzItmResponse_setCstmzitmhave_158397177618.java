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

public class BuyCstmzItmResponse_setCstmzitmhave_158397177618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3636;

    public BuyCstmzItmResponse_setCstmzitmhave_158397177618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3636 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse"));
        setField(term3636, term3636.getClass(), "shp_rslt", null);
        setIntField(term3636, term3636.getClass(), "cstmz_itm_id", 0);
        setField(term3636, term3636.getClass(), "cstmz_itm_have", null);
        setIntField(term3636, term3636.getClass(), "vcld_pts", 0);
        setField(term3636, term3636.getClass(), "cmd", null);
        setField(term3636, term3636.getClass(), "req_id", null);
        setField(term3636, term3636.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCstmz_itm_have", argTypes, term3636, args);
    }

};


