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

public class SMLMeterData_getMeterId_3532211602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569;

    public SMLMeterData_getMeterId_3532211602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term584 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term584, term584.getClass(), "obisCode", "");
        setField(term584, term584.getClass(), "name", "");
        setField(term584, term584.getClass(), "value", null);
        setField(term584, term584.getClass(), "unit", "");
        Object term588 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term588, term588.getClass(), "obisCode", "");
        setField(term588, term588.getClass(), "name", "");
        setField(term588, term588.getClass(), "value", null);
        setField(term588, term588.getClass(), "unit", "");
        Object term592 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term592, term592.getClass(), "obisCode", "");
        setField(term592, term592.getClass(), "name", "");
        setField(term592, term592.getClass(), "value", null);
        setField(term592, term592.getClass(), "unit", "");
        Object term596 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term596, term596.getClass(), "obisCode", "");
        setField(term596, term596.getClass(), "name", "");
        setField(term596, term596.getClass(), "value", null);
        setField(term596, term596.getClass(), "unit", "");
        Object term600 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term600, term600.getClass(), "obisCode", "");
        setField(term600, term600.getClass(), "name", "");
        setField(term600, term600.getClass(), "value", null);
        setField(term600, term600.getClass(), "unit", "");
        Object term604 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term604, term604.getClass(), "obisCode", "");
        setField(term604, term604.getClass(), "name", "");
        setField(term604, term604.getClass(), "value", null);
        setField(term604, term604.getClass(), "unit", "");
        Object term608 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term608, term608.getClass(), "obisCode", "");
        setField(term608, term608.getClass(), "name", "");
        setField(term608, term608.getClass(), "value", null);
        setField(term608, term608.getClass(), "unit", "");
        Object term612 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term612, term612.getClass(), "obisCode", "");
        setField(term612, term612.getClass(), "name", "");
        setField(term612, term612.getClass(), "value", null);
        setField(term612, term612.getClass(), "unit", "");
        Object term616 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term616, term616.getClass(), "obisCode", "");
        setField(term616, term616.getClass(), "name", "");
        setField(term616, term616.getClass(), "value", null);
        setField(term616, term616.getClass(), "unit", null);
        ArrayList term582 = new ArrayList();
        ((ArrayList) term582).add(term584);
        ((ArrayList) term582).add(term588);
        ((ArrayList) term582).add(term592);
        ((ArrayList) term582).add(term596);
        ((ArrayList) term582).add(term600);
        ((ArrayList) term582).add(term604);
        ((ArrayList) term582).add(term608);
        ((ArrayList) term582).add(term612);
        ((ArrayList) term582).add(term616);
        term569 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData"));
        setField(term569, term569.getClass(), "meterId", "Ghbwtircqb");
        setField(term569, term569.getClass(), "readings", term582);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeterId", argTypes, term569, args);
    }

};


