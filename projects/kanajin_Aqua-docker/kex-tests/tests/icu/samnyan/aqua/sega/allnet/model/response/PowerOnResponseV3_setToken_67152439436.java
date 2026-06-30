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

public class PowerOnResponseV3_setToken_67152439436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13891;

    public PowerOnResponseV3_setToken_67152439436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13891 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term13891, term13891.getClass(), "stat", -469968304);
        setField(term13891, term13891.getClass(), "uri", "VePIumgrrU");
        setField(term13891, term13891.getClass(), "host", "DPwIqlszZo");
        setField(term13891, term13891.getClass(), "place_id", "mNgDshwZNc");
        setField(term13891, term13891.getClass(), "name", "pDqgDbJoFw");
        setField(term13891, term13891.getClass(), "nickname", "iVOvTzOxwt");
        setField(term13891, term13891.getClass(), "region0", "BjZQdecXvB");
        setField(term13891, term13891.getClass(), "region_name0", "iUkOOQhEkw");
        setField(term13891, term13891.getClass(), "region_name1", "wmVoFoUVmU");
        setField(term13891, term13891.getClass(), "region_name2", "lLiSiPCciB");
        setField(term13891, term13891.getClass(), "region_name3", "PsMKIIEwdR");
        setField(term13891, term13891.getClass(), "country", "RbQmXqfXAT");
        setField(term13891, term13891.getClass(), "allnet_id", "fcCAsvfBbe");
        setField(term13891, term13891.getClass(), "client_timezone", "mUNcKUxghj");
        setField(term13891, term13891.getClass(), "utc_time", "lnvLKbtveE");
        setField(term13891, term13891.getClass(), "setting", "FfrrEhTHzQ");
        setField(term13891, term13891.getClass(), "res_ver", "LXnDNrMsqT");
        setField(term13891, term13891.getClass(), "token", "ZLQamJFBmu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZWcOCwKNvd";
        callMethod(klass, "setToken", argTypes, term13891, args);
    }

};


