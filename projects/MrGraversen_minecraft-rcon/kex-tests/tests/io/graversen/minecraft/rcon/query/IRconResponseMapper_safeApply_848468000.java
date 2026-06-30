package io.graversen.minecraft.rcon.query;

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
import static io.graversen.minecraft.rcon.query.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IRconResponseMapper_safeApply_848468000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270;

    public IRconResponseMapper_safeApply_848468000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270 = newInstance(Class.forName("io.graversen.minecraft.rcon.RconResponse"));
        setLongField(term270, term270.getClass(), "requestStart", 2442117782898005296L);
        setLongField(term270, term270.getClass(), "requestEnd", 6375119433582206027L);
        setLongField(term270, term270.getClass(), "requestDuration", -8257434502486459194L);
        setIntField(term270, term270.getClass(), "requestCounter", 568599855);
        setIntField(term270, term270.getClass(), "responseId", 1162663216);
        setField(term270, term270.getClass(), "responseString", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.query.IRconResponseMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.RconResponse");
        Object[] args = new Object[1];
        args[0] = term270;
        callMethod(klass, "safeApply", argTypes, null, args);
    }

};


