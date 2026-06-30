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

public class PowerOnResponseV2_getRegion0_760332867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18091;

    public PowerOnResponseV2_getRegion0_760332867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18091 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term18091, term18091.getClass(), "stat", -1845499264);
        setField(term18091, term18091.getClass(), "uri", "PoTZjDuBHa");
        setField(term18091, term18091.getClass(), "host", "MIwvgVrhzP");
        setField(term18091, term18091.getClass(), "place_id", "HcUUieXdep");
        setField(term18091, term18091.getClass(), "name", "AbonCTtbef");
        setField(term18091, term18091.getClass(), "nickname", "maXrGOGoKA");
        setField(term18091, term18091.getClass(), "region0", "zAkgWQVCpM");
        setField(term18091, term18091.getClass(), "region_name0", "yQUDyOroXU");
        setField(term18091, term18091.getClass(), "region_name1", "xweqkPdyJH");
        setField(term18091, term18091.getClass(), "region_name2", "kwteHWzwcc");
        setField(term18091, term18091.getClass(), "region_name3", "uMsWXqNhln");
        setField(term18091, term18091.getClass(), "country", "MAnhIPOtHL");
        setIntField(term18091, term18091.getClass(), "year", -505439934);
        setIntField(term18091, term18091.getClass(), "month", -344842608);
        setIntField(term18091, term18091.getClass(), "day", 941650513);
        setIntField(term18091, term18091.getClass(), "hour", 444029505);
        setIntField(term18091, term18091.getClass(), "minute", -1034506028);
        setIntField(term18091, term18091.getClass(), "second", -1263114719);
        setField(term18091, term18091.getClass(), "setting", "dikKjYjmRO");
        setField(term18091, term18091.getClass(), "timezone", "GJnnMDVnEP");
        setField(term18091, term18091.getClass(), "res_class", "zSMVllDpfk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion0", argTypes, term18091, args);
    }

};


