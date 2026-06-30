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

public class PowerOnResponseV3_getHost_3437997293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1129;

    public PowerOnResponseV3_getHost_3437997293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1129 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term1129, term1129.getClass(), "stat", 391863371);
        setField(term1129, term1129.getClass(), "uri", "UiUYnPrcCi");
        setField(term1129, term1129.getClass(), "host", "UoYtihxVaS");
        setField(term1129, term1129.getClass(), "place_id", "JDswTTCZHV");
        setField(term1129, term1129.getClass(), "name", "onpbIeEKoi");
        setField(term1129, term1129.getClass(), "nickname", "YRHGsAkhxb");
        setField(term1129, term1129.getClass(), "region0", "ffYhPOzlUs");
        setField(term1129, term1129.getClass(), "region_name0", "MLqYREekMl");
        setField(term1129, term1129.getClass(), "region_name1", "ytSBIKXogI");
        setField(term1129, term1129.getClass(), "region_name2", "nHXjMycHlU");
        setField(term1129, term1129.getClass(), "region_name3", "ieCtQFdkii");
        setField(term1129, term1129.getClass(), "country", "dEnhdmILtU");
        setField(term1129, term1129.getClass(), "allnet_id", "hoicvmsovO");
        setField(term1129, term1129.getClass(), "client_timezone", "eqJfYWRaEL");
        setField(term1129, term1129.getClass(), "utc_time", "fhkbdRViHi");
        setField(term1129, term1129.getClass(), "setting", "uWHnvSvaPl");
        setField(term1129, term1129.getClass(), "res_ver", "kBdSllIBVz");
        setField(term1129, term1129.getClass(), "token", "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHost", argTypes, term1129, args);
    }

};


