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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class GamePoint_init_4568719316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27759;
     Object enum29;
     Object term27775;

    public GamePoint_init_4568719316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27759 = new Long(-6301101997917060727L);
        Class<? extends Object> term27802 = Class.forName((String) "icu.samnyan.aqua.sega.ongeki.model.common.GpProductID");
        Field term27801 = ((Class) term27802).getDeclaredField((String) "B_Credit1");
        ((Field) term27801).setAccessible(true);
        enum29 = ((Field) term27801).get((Object) null);
        term27775 = new Integer(1959097203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.common.GpProductID");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term27759;
        args[1] = enum29;
        args[2] = term27775;
        args[3] = "bIrtpkYJWT";
        args[4] = "VuLLXpvPpZ";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


