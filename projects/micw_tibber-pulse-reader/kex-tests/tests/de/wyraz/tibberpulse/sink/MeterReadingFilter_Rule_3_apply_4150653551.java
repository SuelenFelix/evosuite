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

public class MeterReadingFilter_Rule_3_apply_4150653551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object term631;

    public MeterReadingFilter_Rule_3_apply_4150653551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term718 = Class.forName((String) "de.wyraz.tibberpulse.sink.MeterReadingFilter$Rule");
        Field term717 = ((Class) term718).getDeclaredField((String) "KILOWATT_HOURS");
        ((Field) term717).setAccessible(true);
        enum0 = ((Field) term717).get((Object) null);
        term631 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term631, term631.getClass(), "obisCode", "vrQLuWIDJX");
        setField(term631, term631.getClass(), "name", "flxyYxBRtu");
        setField(term631, term631.getClass(), "value", null);
        setField(term631, term631.getClass(), "unit", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.MeterReadingFilter$Rule$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading");
        Object[] args = new Object[1];
        args[0] = term631;
        callMethod(klass, "apply", argTypes, enum0, args);
    }

};


