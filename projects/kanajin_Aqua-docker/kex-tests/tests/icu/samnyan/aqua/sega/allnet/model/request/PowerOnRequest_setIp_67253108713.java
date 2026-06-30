package icu.samnyan.aqua.sega.allnet.model.request;

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
import static icu.samnyan.aqua.sega.allnet.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnRequest_setIp_67253108713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2940;

    public PowerOnRequest_setIp_67253108713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2940 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term2940, term2940.getClass(), "game_id", "EYtfuJaxiM");
        setField(term2940, term2940.getClass(), "ver", "gCWtLVKVVe");
        setField(term2940, term2940.getClass(), "serial", "fWKJoSoCwE");
        setField(term2940, term2940.getClass(), "ip", "wfaXBpWAUH");
        setField(term2940, term2940.getClass(), "firm_ver", "VMeAzAHwZj");
        setField(term2940, term2940.getClass(), "boot_ver", "PznxWXsZME");
        setField(term2940, term2940.getClass(), "encode", "ZzIujlwVsw");
        setField(term2940, term2940.getClass(), "format_ver", "LWyEaeIyAo");
        setField(term2940, term2940.getClass(), "hops", "yVMkkQhvmN");
        setField(term2940, term2940.getClass(), "token", "mvrkADEgpp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pXOkjyeIRb";
        callMethod(klass, "setIp", argTypes, term2940, args);
    }

};


