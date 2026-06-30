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
import java.lang.Integer;

public class MeterReadingFilter_Rule_scaleUnit_10645471403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3009;
     Object term3070;

    public MeterReadingFilter_Rule_scaleUnit_10645471403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3009 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term3009, term3009.getClass(), "obisCode", "gGSMzuGICf");
        setField(term3009, term3009.getClass(), "name", "hxCBltsObl");
        setField(term3009, term3009.getClass(), "value", null);
        setField(term3009, term3009.getClass(), "unit", "BndsHwAFMv");
        term3070 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.MeterReadingFilter$Rule");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term3009;
        args[1] = "GzFkzHGYFt";
        args[2] = "tShwQLRGNe";
        args[3] = term3070;
        callMethod(klass, "scaleUnit", argTypes, null, args);
    }

};


