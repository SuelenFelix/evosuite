package de.wyraz.tibberpulse.sml;

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
import static de.wyraz.tibberpulse.sml.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SMLMeterData_Reading_getUnit_16231966604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224;

    public SMLMeterData_Reading_getUnit_16231966604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term224, term224.getClass(), "obisCode", "NRdvgJlhkX");
        setField(term224, term224.getClass(), "name", "uuaPigETmJ");
        setField(term224, term224.getClass(), "value", null);
        setField(term224, term224.getClass(), "unit", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnit", argTypes, term224, args);
    }

};


