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
import java.lang.Integer;

public class GamePoint_setCost_2327564118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24883;
     Object term24946;

    public GamePoint_setCost_2327564118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24949 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.GpProductID");
        Field term24948 = ((Class) term24949).getDeclaredField((String) "A_Credit3");
        ((Field) term24948).setAccessible(true);
        Object enum22 = ((Field) term24948).get((Object) null);
        term24883 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint"));
        setLongField(term24883, term24883.getClass(), "id", 8802866251294305945L);
        setField(term24883, term24883.getClass(), "type", enum22);
        setIntField(term24883, term24883.getClass(), "cost", -542712742);
        setField(term24883, term24883.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term24883, term24883.getClass(), "endDate", "2099-01-01 05:00:00.0");
        term24946 = new Integer(-1254072822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24946;
        callMethod(klass, "setCost", argTypes, term24883, args);
    }

};


