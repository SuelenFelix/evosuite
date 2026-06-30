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

public class PowerOnResponseV2_getDay_40139034715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20619;

    public PowerOnResponseV2_getDay_40139034715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20619 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term20619, term20619.getClass(), "stat", 202001407);
        setField(term20619, term20619.getClass(), "uri", "JukEMhPWql");
        setField(term20619, term20619.getClass(), "host", "ZdNcodHERG");
        setField(term20619, term20619.getClass(), "place_id", "CLHomjAqIM");
        setField(term20619, term20619.getClass(), "name", "mzCFLzFuSj");
        setField(term20619, term20619.getClass(), "nickname", "WQnMpDlSfA");
        setField(term20619, term20619.getClass(), "region0", "aOIvTQtXiv");
        setField(term20619, term20619.getClass(), "region_name0", "IyjDiknqhA");
        setField(term20619, term20619.getClass(), "region_name1", "IHsXSAFYKi");
        setField(term20619, term20619.getClass(), "region_name2", "KyGbLglqbW");
        setField(term20619, term20619.getClass(), "region_name3", "ZKVeStsSNT");
        setField(term20619, term20619.getClass(), "country", "cqCXYaAnFB");
        setIntField(term20619, term20619.getClass(), "year", 158873461);
        setIntField(term20619, term20619.getClass(), "month", -430151637);
        setIntField(term20619, term20619.getClass(), "day", -1697741339);
        setIntField(term20619, term20619.getClass(), "hour", 98922530);
        setIntField(term20619, term20619.getClass(), "minute", -1388471422);
        setIntField(term20619, term20619.getClass(), "second", -1498296052);
        setField(term20619, term20619.getClass(), "setting", "UPLNFZHXjw");
        setField(term20619, term20619.getClass(), "timezone", "CwrrJlrGmg");
        setField(term20619, term20619.getClass(), "res_class", "HejzvyejjG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDay", argTypes, term20619, args);
    }

};


