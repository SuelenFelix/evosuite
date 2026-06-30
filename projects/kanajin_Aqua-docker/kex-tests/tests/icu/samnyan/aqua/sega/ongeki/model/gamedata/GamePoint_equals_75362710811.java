package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class GamePoint_equals_75362710811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26141;
     Object term26204;

    public GamePoint_equals_75362710811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26206 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.GpProductID");
        Field term26205 = ((Class) term26206).getDeclaredField((String) "A_Credit2");
        ((Field) term26205).setAccessible(true);
        Object enum25 = ((Field) term26205).get((Object) null);
        term26141 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint"));
        setLongField(term26141, term26141.getClass(), "id", 8034714140377562739L);
        setField(term26141, term26141.getClass(), "type", enum25);
        setIntField(term26141, term26141.getClass(), "cost", 479531250);
        setField(term26141, term26141.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term26141, term26141.getClass(), "endDate", "2099-01-01 05:00:00.0");
        term26204 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26204;
        callMethod(klass, "equals", argTypes, term26141, args);
    }

};


