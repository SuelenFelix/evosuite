package icu.samnyan.aqua.sega.allnet.model.response;

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
import static icu.samnyan.aqua.sega.allnet.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnResponseV2_getRegionname0_13989461488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18407;

    public PowerOnResponseV2_getRegionname0_13989461488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18407 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term18407, term18407.getClass(), "stat", -894662986);
        setField(term18407, term18407.getClass(), "uri", "iptRXVDoYE");
        setField(term18407, term18407.getClass(), "host", "kucsxnvbES");
        setField(term18407, term18407.getClass(), "place_id", "IdGzDFfcZf");
        setField(term18407, term18407.getClass(), "name", "KDdRNhZmnU");
        setField(term18407, term18407.getClass(), "nickname", "iMsqJaKlDC");
        setField(term18407, term18407.getClass(), "region0", "aPkGHbZyjj");
        setField(term18407, term18407.getClass(), "region_name0", "nSWdsVyJRI");
        setField(term18407, term18407.getClass(), "region_name1", "JBOPGgGKnc");
        setField(term18407, term18407.getClass(), "region_name2", "GlPTiCMCGP");
        setField(term18407, term18407.getClass(), "region_name3", "jlcBpLoWfd");
        setField(term18407, term18407.getClass(), "country", "oYymmLqbfJ");
        setIntField(term18407, term18407.getClass(), "year", 304775596);
        setIntField(term18407, term18407.getClass(), "month", -1347665717);
        setIntField(term18407, term18407.getClass(), "day", -1888585309);
        setIntField(term18407, term18407.getClass(), "hour", 683666002);
        setIntField(term18407, term18407.getClass(), "minute", 1596213415);
        setIntField(term18407, term18407.getClass(), "second", -268815336);
        setField(term18407, term18407.getClass(), "setting", "YaDWphDOSz");
        setField(term18407, term18407.getClass(), "timezone", "nnnmCgFBLw");
        setField(term18407, term18407.getClass(), "res_class", "hSSCyNEhyH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion_name0", argTypes, term18407, args);
    }

};


