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

public class PowerOnResponseV2_setResclass_46724970542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29451;

    public PowerOnResponseV2_setResclass_46724970542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29451 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term29451, term29451.getClass(), "stat", -1529797673);
        setField(term29451, term29451.getClass(), "uri", "otxkkKfDfl");
        setField(term29451, term29451.getClass(), "host", "bqIuFFFwnP");
        setField(term29451, term29451.getClass(), "place_id", "hDxvvVgGlk");
        setField(term29451, term29451.getClass(), "name", "XdjSvjaTqk");
        setField(term29451, term29451.getClass(), "nickname", "ukrlYVcvsg");
        setField(term29451, term29451.getClass(), "region0", "cpjqTCNflQ");
        setField(term29451, term29451.getClass(), "region_name0", "wiYGATEfmw");
        setField(term29451, term29451.getClass(), "region_name1", "FiALSqneIg");
        setField(term29451, term29451.getClass(), "region_name2", "lGVACSQceQ");
        setField(term29451, term29451.getClass(), "region_name3", "jpgWRbSvyQ");
        setField(term29451, term29451.getClass(), "country", "tFMlYmPEBX");
        setIntField(term29451, term29451.getClass(), "year", -868676396);
        setIntField(term29451, term29451.getClass(), "month", 1922684808);
        setIntField(term29451, term29451.getClass(), "day", -2005784375);
        setIntField(term29451, term29451.getClass(), "hour", -288604325);
        setIntField(term29451, term29451.getClass(), "minute", -1268314569);
        setIntField(term29451, term29451.getClass(), "second", 877649659);
        setField(term29451, term29451.getClass(), "setting", "ljkZxGNgjZ");
        setField(term29451, term29451.getClass(), "timezone", "hrFtgdcZKS");
        setField(term29451, term29451.getClass(), "res_class", "ZhZJvpPaTU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NZwUsJxDLI";
        callMethod(klass, "setRes_class", argTypes, term29451, args);
    }

};


