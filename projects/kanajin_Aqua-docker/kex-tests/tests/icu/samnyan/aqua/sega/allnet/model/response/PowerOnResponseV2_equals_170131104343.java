package icu.samnyan.aqua.sega.allnet.model.response;

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
import static icu.samnyan.aqua.sega.allnet.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnResponseV2_equals_170131104343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29789;
     Object term29965;

    public PowerOnResponseV2_equals_170131104343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29789 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term29789, term29789.getClass(), "stat", -1332748804);
        setField(term29789, term29789.getClass(), "uri", "wlusYBOfXW");
        setField(term29789, term29789.getClass(), "host", "HEWWLhfKIa");
        setField(term29789, term29789.getClass(), "place_id", "mJJkYzNPob");
        setField(term29789, term29789.getClass(), "name", "mRDwekkZQg");
        setField(term29789, term29789.getClass(), "nickname", "RIGChgqpTI");
        setField(term29789, term29789.getClass(), "region0", "YCrgXnhgoK");
        setField(term29789, term29789.getClass(), "region_name0", "nQodIeQekM");
        setField(term29789, term29789.getClass(), "region_name1", "YXORpHCDcd");
        setField(term29789, term29789.getClass(), "region_name2", "XzZbAcRADD");
        setField(term29789, term29789.getClass(), "region_name3", "UqSNWSoTRy");
        setField(term29789, term29789.getClass(), "country", "VesRqDfjMa");
        setIntField(term29789, term29789.getClass(), "year", 1774507971);
        setIntField(term29789, term29789.getClass(), "month", -1420269858);
        setIntField(term29789, term29789.getClass(), "day", -2119545015);
        setIntField(term29789, term29789.getClass(), "hour", 1272542218);
        setIntField(term29789, term29789.getClass(), "minute", 1209799204);
        setIntField(term29789, term29789.getClass(), "second", 1094107751);
        setField(term29789, term29789.getClass(), "setting", "AQTTebOiZR");
        setField(term29789, term29789.getClass(), "timezone", "mgeIhswNtk");
        setField(term29789, term29789.getClass(), "res_class", "QwKYpiVQlL");
        term29965 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29965;
        callMethod(klass, "equals", argTypes, term29789, args);
    }

};


