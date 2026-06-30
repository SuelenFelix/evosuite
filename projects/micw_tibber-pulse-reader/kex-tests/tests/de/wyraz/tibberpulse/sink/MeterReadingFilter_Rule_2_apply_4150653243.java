package de.wyraz.tibberpulse.sink;

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
import static de.wyraz.tibberpulse.sink.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class MeterReadingFilter_Rule_2_apply_4150653243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum3;

    public MeterReadingFilter_Rule_2_apply_4150653243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1759 = Class.forName((String) "de.wyraz.tibberpulse.sink.MeterReadingFilter$Rule");
        Field term1758 = ((Class) term1759).getDeclaredField((String) "KILOWATT");
        ((Field) term1758).setAccessible(true);
        enum3 = ((Field) term1758).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.MeterReadingFilter$Rule$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "apply", argTypes, enum3, args);
    }

};


