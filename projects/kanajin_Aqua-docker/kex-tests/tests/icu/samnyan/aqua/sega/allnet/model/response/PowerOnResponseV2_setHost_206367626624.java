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

public class PowerOnResponseV2_setHost_206367626624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23487;

    public PowerOnResponseV2_setHost_206367626624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23487 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term23487, term23487.getClass(), "stat", 806595993);
        setField(term23487, term23487.getClass(), "uri", "nBaMiSdFmS");
        setField(term23487, term23487.getClass(), "host", "ezwGsjqTai");
        setField(term23487, term23487.getClass(), "place_id", "ngeHWMRjnn");
        setField(term23487, term23487.getClass(), "name", "FOKfDXQxMM");
        setField(term23487, term23487.getClass(), "nickname", "gbxMvhrWpA");
        setField(term23487, term23487.getClass(), "region0", "huNTIobUHx");
        setField(term23487, term23487.getClass(), "region_name0", "MrVeCmRVzF");
        setField(term23487, term23487.getClass(), "region_name1", "CPVnQYACKw");
        setField(term23487, term23487.getClass(), "region_name2", "sbdLhVCRsw");
        setField(term23487, term23487.getClass(), "region_name3", "soJHvZwbtF");
        setField(term23487, term23487.getClass(), "country", "dTGwgkfDVj");
        setIntField(term23487, term23487.getClass(), "year", 548228925);
        setIntField(term23487, term23487.getClass(), "month", -749861210);
        setIntField(term23487, term23487.getClass(), "day", 1694224101);
        setIntField(term23487, term23487.getClass(), "hour", 937859191);
        setIntField(term23487, term23487.getClass(), "minute", -916584829);
        setIntField(term23487, term23487.getClass(), "second", -2131181468);
        setField(term23487, term23487.getClass(), "setting", "zHiuLPzYQM");
        setField(term23487, term23487.getClass(), "timezone", "ioYxUYJBrh");
        setField(term23487, term23487.getClass(), "res_class", "GXoLEdKEIe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EugWXkztim";
        callMethod(klass, "setHost", argTypes, term23487, args);
    }

};


