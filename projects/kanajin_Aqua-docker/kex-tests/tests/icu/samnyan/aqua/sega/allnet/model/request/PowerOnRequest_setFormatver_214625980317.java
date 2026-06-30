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

public class PowerOnRequest_setFormatver_214625980317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3912;

    public PowerOnRequest_setFormatver_214625980317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3912 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term3912, term3912.getClass(), "game_id", "JmcmxoGhIK");
        setField(term3912, term3912.getClass(), "ver", "jXzmYyrnnT");
        setField(term3912, term3912.getClass(), "serial", "igCAtimmYB");
        setField(term3912, term3912.getClass(), "ip", "DyiXbeYIaN");
        setField(term3912, term3912.getClass(), "firm_ver", "VGizxZnyHX");
        setField(term3912, term3912.getClass(), "boot_ver", "kVEZMHmRtR");
        setField(term3912, term3912.getClass(), "encode", "ekxGuOYIwi");
        setField(term3912, term3912.getClass(), "format_ver", "RbVQXSpxXy");
        setField(term3912, term3912.getClass(), "hops", "YpJbIgJWWv");
        setField(term3912, term3912.getClass(), "token", "JppkknKVOw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iljANwuEjk";
        callMethod(klass, "setFormat_ver", argTypes, term3912, args);
    }

};


