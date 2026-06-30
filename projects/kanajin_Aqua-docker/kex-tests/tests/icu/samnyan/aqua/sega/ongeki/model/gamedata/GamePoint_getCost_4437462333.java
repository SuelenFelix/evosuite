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

public class GamePoint_getCost_4437462333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22548;

    public GamePoint_getCost_4437462333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22612 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.GpProductID");
        Field term22611 = ((Class) term22612).getDeclaredField((String) "B_Credit3");
        ((Field) term22611).setAccessible(true);
        Object enum16 = ((Field) term22611).get((Object) null);
        term22548 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint"));
        setLongField(term22548, term22548.getClass(), "id", 7489064039921396098L);
        setField(term22548, term22548.getClass(), "type", enum16);
        setIntField(term22548, term22548.getClass(), "cost", -1146679443);
        setField(term22548, term22548.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term22548, term22548.getClass(), "endDate", "2099-01-01 05:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCost", argTypes, term22548, args);
    }

};


