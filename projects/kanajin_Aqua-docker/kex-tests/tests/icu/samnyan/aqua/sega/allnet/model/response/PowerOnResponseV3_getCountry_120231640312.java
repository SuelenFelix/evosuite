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

public class PowerOnResponseV3_getCountry_120231640312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4513;

    public PowerOnResponseV3_getCountry_120231640312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4513 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term4513, term4513.getClass(), "stat", 1134449235);
        setField(term4513, term4513.getClass(), "uri", "BjugTaMcxJ");
        setField(term4513, term4513.getClass(), "host", "vGiuZVPJNH");
        setField(term4513, term4513.getClass(), "place_id", "tlzpzIjMib");
        setField(term4513, term4513.getClass(), "name", "AZdLeSugwv");
        setField(term4513, term4513.getClass(), "nickname", "RMsXuyzKJV");
        setField(term4513, term4513.getClass(), "region0", "FwPbDZcHmB");
        setField(term4513, term4513.getClass(), "region_name0", "hOncybyCAH");
        setField(term4513, term4513.getClass(), "region_name1", "QduALnDSVo");
        setField(term4513, term4513.getClass(), "region_name2", "izPpKDErnQ");
        setField(term4513, term4513.getClass(), "region_name3", "NnpwZBUTvx");
        setField(term4513, term4513.getClass(), "country", "tlQSNgTkQX");
        setField(term4513, term4513.getClass(), "allnet_id", "PCipZnmBOF");
        setField(term4513, term4513.getClass(), "client_timezone", "zcorEihhLK");
        setField(term4513, term4513.getClass(), "utc_time", "GrqozDKFOk");
        setField(term4513, term4513.getClass(), "setting", "CFyoseFGLF");
        setField(term4513, term4513.getClass(), "res_ver", "SFqCrhEWLm");
        setField(term4513, term4513.getClass(), "token", "GZdcJyZntS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term4513, args);
    }

};


