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

public class BuyCstmzItmResponse_getShprslt_201645748312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3616;

    public BuyCstmzItmResponse_getShprslt_201645748312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3616 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse"));
        setField(term3616, term3616.getClass(), "shp_rslt", null);
        setIntField(term3616, term3616.getClass(), "cstmz_itm_id", 0);
        setField(term3616, term3616.getClass(), "cstmz_itm_have", null);
        setIntField(term3616, term3616.getClass(), "vcld_pts", 0);
        setField(term3616, term3616.getClass(), "cmd", null);
        setField(term3616, term3616.getClass(), "req_id", null);
        setField(term3616, term3616.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.BuyCstmzItmResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShp_rslt", argTypes, term3616, args);
    }

};


