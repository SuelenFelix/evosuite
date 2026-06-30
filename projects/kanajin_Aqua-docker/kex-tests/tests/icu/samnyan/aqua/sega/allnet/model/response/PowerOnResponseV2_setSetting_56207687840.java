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

public class PowerOnResponseV2_setSetting_56207687840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28775;

    public PowerOnResponseV2_setSetting_56207687840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28775 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term28775, term28775.getClass(), "stat", -1560631747);
        setField(term28775, term28775.getClass(), "uri", "HZODpafOGe");
        setField(term28775, term28775.getClass(), "host", "dUTYEKtTfQ");
        setField(term28775, term28775.getClass(), "place_id", "HUtbHklGel");
        setField(term28775, term28775.getClass(), "name", "QbfKDAwhSB");
        setField(term28775, term28775.getClass(), "nickname", "ckTRHEIcCK");
        setField(term28775, term28775.getClass(), "region0", "NYSBqIpNlD");
        setField(term28775, term28775.getClass(), "region_name0", "OWglDUWQYb");
        setField(term28775, term28775.getClass(), "region_name1", "FiqETbKjpv");
        setField(term28775, term28775.getClass(), "region_name2", "FxXtdhhXyS");
        setField(term28775, term28775.getClass(), "region_name3", "HxCEzaCcgj");
        setField(term28775, term28775.getClass(), "country", "PDYPOQncAB");
        setIntField(term28775, term28775.getClass(), "year", 1215150180);
        setIntField(term28775, term28775.getClass(), "month", -1422859977);
        setIntField(term28775, term28775.getClass(), "day", -1972436591);
        setIntField(term28775, term28775.getClass(), "hour", 68922753);
        setIntField(term28775, term28775.getClass(), "minute", -220791533);
        setIntField(term28775, term28775.getClass(), "second", 1741500243);
        setField(term28775, term28775.getClass(), "setting", "cHqLMqZSmc");
        setField(term28775, term28775.getClass(), "timezone", "hkWmAkXSOW");
        setField(term28775, term28775.getClass(), "res_class", "DwQmZEKeOp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DbxrFiyttv";
        callMethod(klass, "setSetting", argTypes, term28775, args);
    }

};


