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

public class GamePoint_canEqual_155778973712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26546;
     Object term26609;

    public GamePoint_canEqual_155778973712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26611 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.GpProductID");
        Field term26610 = ((Class) term26611).getDeclaredField((String) "B_Credit2");
        ((Field) term26610).setAccessible(true);
        Object enum26 = ((Field) term26610).get((Object) null);
        term26546 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint"));
        setLongField(term26546, term26546.getClass(), "id", -2924531382671518368L);
        setField(term26546, term26546.getClass(), "type", enum26);
        setIntField(term26546, term26546.getClass(), "cost", 1320570890);
        setField(term26546, term26546.getClass(), "startDate", "2000-01-01 05:00:00.0");
        setField(term26546, term26546.getClass(), "endDate", "2099-01-01 05:00:00.0");
        term26609 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26609;
        callMethod(klass, "canEqual", argTypes, term26546, args);
    }

};


