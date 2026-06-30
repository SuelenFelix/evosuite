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
import java.util.ArrayList;
import java.lang.Object;

public class SMLMeterData_toString_12186883144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term658;

    public SMLMeterData_toString_12186883144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term673 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term673, term673.getClass(), "obisCode", "");
        setField(term673, term673.getClass(), "name", "");
        setField(term673, term673.getClass(), "value", null);
        setField(term673, term673.getClass(), "unit", "");
        Object term677 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term677, term677.getClass(), "obisCode", "");
        setField(term677, term677.getClass(), "name", "");
        setField(term677, term677.getClass(), "value", null);
        setField(term677, term677.getClass(), "unit", "");
        Object term681 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term681, term681.getClass(), "obisCode", "");
        setField(term681, term681.getClass(), "name", "");
        setField(term681, term681.getClass(), "value", null);
        setField(term681, term681.getClass(), "unit", "");
        Object term685 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term685, term685.getClass(), "obisCode", "");
        setField(term685, term685.getClass(), "name", "");
        setField(term685, term685.getClass(), "value", null);
        setField(term685, term685.getClass(), "unit", "");
        ArrayList term671 = new ArrayList();
        ((ArrayList) term671).add(term673);
        ((ArrayList) term671).add(term677);
        ((ArrayList) term671).add(term681);
        ((ArrayList) term671).add(term685);
        term658 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData"));
        setField(term658, term658.getClass(), "meterId", "eqJfYWRaEL");
        setField(term658, term658.getClass(), "readings", term671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term658, args);
    }

};


