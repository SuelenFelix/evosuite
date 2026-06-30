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
import java.util.LinkedList;
import java.lang.Object;

public class SMLMeterData_init_19168853421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442;

    public SMLMeterData_init_19168853421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term445 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term445, term445.getClass(), "obisCode", "hNxWaHcfhY");
        setField(term445, term445.getClass(), "name", "RkybSrpybU");
        setField(term445, term445.getClass(), "value", null);
        setField(term445, term445.getClass(), "unit", "xOEqzGAmDU");
        Object term483 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term483, term483.getClass(), "obisCode", "");
        setField(term483, term483.getClass(), "name", "");
        setField(term483, term483.getClass(), "value", null);
        setField(term483, term483.getClass(), "unit", "");
        Object term488 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term488, term488.getClass(), "obisCode", null);
        setField(term488, term488.getClass(), "name", null);
        setField(term488, term488.getClass(), "value", null);
        setField(term488, term488.getClass(), "unit", null);
        term442 = new LinkedList();
        ((LinkedList) term442).add(term445);
        ((LinkedList) term442).add(term483);
        ((LinkedList) term442).add(term488);
        ((LinkedList) term442).add((Object)null);
        ((LinkedList) term442).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "pCTimMblYc";
        args[1] = term442;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


