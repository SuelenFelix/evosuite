package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class GameCharge_init_212883794546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1715;
     Object term1717;
     Object term1719;
     Object term1721;
     Object term1723;

    public GameCharge_init_212883794546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1715 = new Long(0L);
        term1717 = new Integer(0);
        term1719 = new Integer(0);
        term1721 = new Integer(0);
        term1723 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = Class.forName("java.time.LocalDateTime");
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        argTypes[8] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[9];
        args[0] = term1715;
        args[1] = term1717;
        args[2] = term1719;
        args[3] = term1721;
        args[4] = null;
        args[5] = null;
        args[6] = term1723;
        args[7] = null;
        args[8] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


