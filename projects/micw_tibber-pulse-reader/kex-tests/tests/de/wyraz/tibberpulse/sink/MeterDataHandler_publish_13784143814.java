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
import java.util.ArrayList;
import java.lang.Object;

public class MeterDataHandler_publish_13784143814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;

    public MeterDataHandler_publish_13784143814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term60 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term60, term60.getClass(), "obisCode", "");
        setField(term60, term60.getClass(), "name", "");
        setField(term60, term60.getClass(), "value", null);
        setField(term60, term60.getClass(), "unit", "");
        Object term64 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term64, term64.getClass(), "obisCode", "");
        setField(term64, term64.getClass(), "name", "");
        setField(term64, term64.getClass(), "value", null);
        setField(term64, term64.getClass(), "unit", "");
        Object term68 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term68, term68.getClass(), "obisCode", "");
        setField(term68, term68.getClass(), "name", "");
        setField(term68, term68.getClass(), "value", null);
        setField(term68, term68.getClass(), "unit", "");
        Object term72 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term72, term72.getClass(), "obisCode", "");
        setField(term72, term72.getClass(), "name", "");
        setField(term72, term72.getClass(), "value", null);
        setField(term72, term72.getClass(), "unit", "");
        Object term76 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData$Reading"));
        setField(term76, term76.getClass(), "obisCode", "");
        setField(term76, term76.getClass(), "name", "");
        setField(term76, term76.getClass(), "value", null);
        setField(term76, term76.getClass(), "unit", "");
        ArrayList term58 = new ArrayList();
        ((ArrayList) term58).add(term60);
        ((ArrayList) term58).add(term64);
        ((ArrayList) term58).add(term68);
        ((ArrayList) term58).add(term72);
        ((ArrayList) term58).add(term76);
        term45 = newInstance(Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData"));
        setField(term45, term45.getClass(), "meterId", "MuLcgQHgqz");
        setField(term45, term45.getClass(), "readings", term58);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.tibberpulse.sink.MeterDataHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.wyraz.tibberpulse.sml.SMLMeterData");
        Object[] args = new Object[1];
        args[0] = term45;
        callMethod(klass, "publish", argTypes, null, args);
    }

};


