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

public class MeterReadingFilter_Rule_1_apply_4150652931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4;
     Object term2084;

    public MeterReadingFilter_Rule_1_apply_4150652931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2122 = Class.forName((String) "de.wyraz.tibberpulse.sink.MeterReadingFilter$Rule");
        Field term2121 = ((Class) term2122).getDeclaredField((String) "IGNORE");
        ((Field) term2121).setAccessible(true);
        enum4 = ((Field) term2121).get((Object) null);
        term2084 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term2084, term2084.getClass(), "obisCode", "nyiiPDVjAc");
        setField(term2084, term2084.getClass(), "name", "aKnKipADSo");
        setField(term2084, term2084.getClass(), "value", null);
        setField(term2084, term2084.getClass(), "unit", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.MeterReadingFilter$Rule$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading");
        Object[] args = new Object[1];
        args[0] = term2084;
        callMethod(klass, "apply", argTypes, enum4, args);
    }

};


