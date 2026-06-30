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

public class PowerOnResponseV2_setRegionname1_190167936330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25515;

    public PowerOnResponseV2_setRegionname1_190167936330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25515 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term25515, term25515.getClass(), "stat", 1507074215);
        setField(term25515, term25515.getClass(), "uri", "igruEzTbBE");
        setField(term25515, term25515.getClass(), "host", "LFjgROsRUV");
        setField(term25515, term25515.getClass(), "place_id", "kHxujKiCsr");
        setField(term25515, term25515.getClass(), "name", "cseZveWowm");
        setField(term25515, term25515.getClass(), "nickname", "idfslIPhgx");
        setField(term25515, term25515.getClass(), "region0", "HyFLOXeoDX");
        setField(term25515, term25515.getClass(), "region_name0", "crkNabVaWs");
        setField(term25515, term25515.getClass(), "region_name1", "qBcAJgrABE");
        setField(term25515, term25515.getClass(), "region_name2", "JKdZuLFRwC");
        setField(term25515, term25515.getClass(), "region_name3", "hfhLLoWnRU");
        setField(term25515, term25515.getClass(), "country", "RpofnOPYha");
        setIntField(term25515, term25515.getClass(), "year", -282881827);
        setIntField(term25515, term25515.getClass(), "month", -1183353915);
        setIntField(term25515, term25515.getClass(), "day", -420030135);
        setIntField(term25515, term25515.getClass(), "hour", 267763294);
        setIntField(term25515, term25515.getClass(), "minute", -1497710478);
        setIntField(term25515, term25515.getClass(), "second", 49950830);
        setField(term25515, term25515.getClass(), "setting", "CQYmAsjvPU");
        setField(term25515, term25515.getClass(), "timezone", "NNkIIFpxiB");
        setField(term25515, term25515.getClass(), "res_class", "sBmtvFPDso");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qsUIxrLolr";
        callMethod(klass, "setRegion_name1", argTypes, term25515, args);
    }

};


