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
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.Object;

public class MeterReadingFilter_apply_12893514841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3172;
     Object term3184;

    public MeterReadingFilter_apply_12893514841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3173 = new HashMap();
        term3172 = newInstance(Class.forName("de.wyraz.tibberpulse.sink.MeterReadingFilter"));
        setField(term3172, term3172.getClass(), "rules", term3173);
        Object term3187 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term3187, term3187.getClass(), "obisCode", "nGKItKLYNC");
        setField(term3187, term3187.getClass(), "name", "UiUYnPrcCi");
        setField(term3187, term3187.getClass(), "value", null);
        setField(term3187, term3187.getClass(), "unit", "UoYtihxVaS");
        Object term3225 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term3225, term3225.getClass(), "obisCode", "");
        setField(term3225, term3225.getClass(), "name", "");
        setField(term3225, term3225.getClass(), "value", null);
        setField(term3225, term3225.getClass(), "unit", "");
        Object term3230 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term3230, term3230.getClass(), "obisCode", null);
        setField(term3230, term3230.getClass(), "name", null);
        setField(term3230, term3230.getClass(), "value", null);
        setField(term3230, term3230.getClass(), "unit", null);
        term3184 = new LinkedList();
        ((LinkedList) term3184).add(term3187);
        ((LinkedList) term3184).add(term3225);
        ((LinkedList) term3184).add(term3230);
        ((LinkedList) term3184).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.MeterReadingFilter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3184;
        callMethod(klass, "apply", argTypes, term3172, args);
    }

};


