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

public class MeterReadingFilter_Rule_2_apply_4150653241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;
     Object term1411;

    public MeterReadingFilter_Rule_2_apply_4150653241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1449 = Class.forName((String) "de.wyraz.tibberpulse.sink.MeterReadingFilter$Rule");
        Field term1448 = ((Class) term1449).getDeclaredField((String) "KILOWATT");
        ((Field) term1448).setAccessible(true);
        enum2 = ((Field) term1448).get((Object) null);
        term1411 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term1411, term1411.getClass(), "obisCode", "AijpHYOFuy");
        setField(term1411, term1411.getClass(), "name", "SbAoxhfrkn");
        setField(term1411, term1411.getClass(), "value", null);
        setField(term1411, term1411.getClass(), "unit", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.MeterReadingFilter$Rule$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading");
        Object[] args = new Object[1];
        args[0] = term1411;
        callMethod(klass, "apply", argTypes, enum2, args);
    }

};


