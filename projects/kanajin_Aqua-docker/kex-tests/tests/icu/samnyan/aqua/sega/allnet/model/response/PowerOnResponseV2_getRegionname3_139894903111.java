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

public class PowerOnResponseV2_getRegionname3_139894903111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19355;

    public PowerOnResponseV2_getRegionname3_139894903111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19355 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term19355, term19355.getClass(), "stat", 1045657203);
        setField(term19355, term19355.getClass(), "uri", "UsxeLMVkAK");
        setField(term19355, term19355.getClass(), "host", "ITrhiKKzcb");
        setField(term19355, term19355.getClass(), "place_id", "qMKmSzOQXg");
        setField(term19355, term19355.getClass(), "name", "CURQCMkqbZ");
        setField(term19355, term19355.getClass(), "nickname", "VZwkkQktrm");
        setField(term19355, term19355.getClass(), "region0", "wIuJvIvEMb");
        setField(term19355, term19355.getClass(), "region_name0", "EyojsbSjWT");
        setField(term19355, term19355.getClass(), "region_name1", "szGicGyWDL");
        setField(term19355, term19355.getClass(), "region_name2", "lkdvUiYwRq");
        setField(term19355, term19355.getClass(), "region_name3", "XuxkPrpfND");
        setField(term19355, term19355.getClass(), "country", "OxNXeKMDje");
        setIntField(term19355, term19355.getClass(), "year", 1386130016);
        setIntField(term19355, term19355.getClass(), "month", 1072005683);
        setIntField(term19355, term19355.getClass(), "day", 1861318859);
        setIntField(term19355, term19355.getClass(), "hour", 1474524152);
        setIntField(term19355, term19355.getClass(), "minute", 568954359);
        setIntField(term19355, term19355.getClass(), "second", 53410913);
        setField(term19355, term19355.getClass(), "setting", "hGTqHomrbc");
        setField(term19355, term19355.getClass(), "timezone", "NNMBrIWEBw");
        setField(term19355, term19355.getClass(), "res_class", "GrTaccOQzl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion_name3", argTypes, term19355, args);
    }

};


