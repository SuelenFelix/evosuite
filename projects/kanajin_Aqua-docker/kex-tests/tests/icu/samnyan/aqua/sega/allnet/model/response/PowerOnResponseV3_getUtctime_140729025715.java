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

public class PowerOnResponseV3_getUtctime_140729025715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5641;

    public PowerOnResponseV3_getUtctime_140729025715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5641 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term5641, term5641.getClass(), "stat", 597278769);
        setField(term5641, term5641.getClass(), "uri", "doQLHkjpNm");
        setField(term5641, term5641.getClass(), "host", "lCyLIcSuom");
        setField(term5641, term5641.getClass(), "place_id", "CGOpQSZZwI");
        setField(term5641, term5641.getClass(), "name", "ypEdrstygY");
        setField(term5641, term5641.getClass(), "nickname", "sNQFlATEeQ");
        setField(term5641, term5641.getClass(), "region0", "ZKMLioamsY");
        setField(term5641, term5641.getClass(), "region_name0", "WVbxuoDBcn");
        setField(term5641, term5641.getClass(), "region_name1", "pvDEABOxLt");
        setField(term5641, term5641.getClass(), "region_name2", "beAMpkroCQ");
        setField(term5641, term5641.getClass(), "region_name3", "uSUvKAyuvd");
        setField(term5641, term5641.getClass(), "country", "onQLVONGuf");
        setField(term5641, term5641.getClass(), "allnet_id", "SOrEHbcbmn");
        setField(term5641, term5641.getClass(), "client_timezone", "bnsyeQXFdu");
        setField(term5641, term5641.getClass(), "utc_time", "BwtdjiefJn");
        setField(term5641, term5641.getClass(), "setting", "jDmhBrIoDa");
        setField(term5641, term5641.getClass(), "res_ver", "SPtPatHeOm");
        setField(term5641, term5641.getClass(), "token", "ywmcuThdfL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUtc_time", argTypes, term5641, args);
    }

};


