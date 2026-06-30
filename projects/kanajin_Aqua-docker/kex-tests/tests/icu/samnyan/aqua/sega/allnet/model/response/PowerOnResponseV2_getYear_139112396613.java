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

public class PowerOnResponseV2_getYear_139112396613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19987;

    public PowerOnResponseV2_getYear_139112396613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19987 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term19987, term19987.getClass(), "stat", -343325701);
        setField(term19987, term19987.getClass(), "uri", "oOnRVGqFmy");
        setField(term19987, term19987.getClass(), "host", "LaXzFIlWMk");
        setField(term19987, term19987.getClass(), "place_id", "GuVQjhBxma");
        setField(term19987, term19987.getClass(), "name", "WAVMPPbIfL");
        setField(term19987, term19987.getClass(), "nickname", "GISHLsgALf");
        setField(term19987, term19987.getClass(), "region0", "PVykkUSgBq");
        setField(term19987, term19987.getClass(), "region_name0", "tnKbZaCsuj");
        setField(term19987, term19987.getClass(), "region_name1", "ZFpcYBgLNC");
        setField(term19987, term19987.getClass(), "region_name2", "VAGkRppBem");
        setField(term19987, term19987.getClass(), "region_name3", "eKcEJRxNSu");
        setField(term19987, term19987.getClass(), "country", "NTXQPWFYSA");
        setIntField(term19987, term19987.getClass(), "year", 107945604);
        setIntField(term19987, term19987.getClass(), "month", -1963464809);
        setIntField(term19987, term19987.getClass(), "day", 71190297);
        setIntField(term19987, term19987.getClass(), "hour", 1202361360);
        setIntField(term19987, term19987.getClass(), "minute", -2015048153);
        setIntField(term19987, term19987.getClass(), "second", -2063457669);
        setField(term19987, term19987.getClass(), "setting", "fOuOhBpldm");
        setField(term19987, term19987.getClass(), "timezone", "qQQRKGPyIM");
        setField(term19987, term19987.getClass(), "res_class", "lzcwhvjdFg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYear", argTypes, term19987, args);
    }

};


