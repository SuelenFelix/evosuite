package io.graversen.minecraft.rcon.query.seed;

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
import static io.graversen.minecraft.rcon.query.seed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SeedMapper_apply_18238255911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public SeedMapper_apply_18238255911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("io.graversen.minecraft.rcon.query.seed.SeedMapper"));
        term2 = newInstance(Class.forName("io.graversen.minecraft.rcon.RconResponse"));
        setLongField(term2, term2.getClass(), "requestStart", 2442117782898005296L);
        setLongField(term2, term2.getClass(), "requestEnd", 6375119433582206027L);
        setLongField(term2, term2.getClass(), "requestDuration", -8257434502486459194L);
        setIntField(term2, term2.getClass(), "requestCounter", 568599855);
        setIntField(term2, term2.getClass(), "responseId", 1162663216);
        setField(term2, term2.getClass(), "responseString", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.query.seed.SeedMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.graversen.minecraft.rcon.RconResponse");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "apply", argTypes, term1, args);
    }

};


