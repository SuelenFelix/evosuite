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

public class PowerOnRequest_setFirmver_34288900414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3183;

    public PowerOnRequest_setFirmver_34288900414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3183 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term3183, term3183.getClass(), "game_id", "GgZWSjxjyE");
        setField(term3183, term3183.getClass(), "ver", "EeBVbzjcCI");
        setField(term3183, term3183.getClass(), "serial", "UfQtPRyWRC");
        setField(term3183, term3183.getClass(), "ip", "FPvxVzzSvD");
        setField(term3183, term3183.getClass(), "firm_ver", "WHcwFgsGFC");
        setField(term3183, term3183.getClass(), "boot_ver", "HzqpegHiRq");
        setField(term3183, term3183.getClass(), "encode", "jwsfVjMoJT");
        setField(term3183, term3183.getClass(), "format_ver", "ZfdXfCCFDf");
        setField(term3183, term3183.getClass(), "hops", "MwwjNtdOFT");
        setField(term3183, term3183.getClass(), "token", "VYkqXKVlAJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XkIoWJRNwN";
        callMethod(klass, "setFirm_ver", argTypes, term3183, args);
    }

};


