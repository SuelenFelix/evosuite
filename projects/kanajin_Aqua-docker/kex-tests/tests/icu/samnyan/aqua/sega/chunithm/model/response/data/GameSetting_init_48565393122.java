package icu.samnyan.aqua.sega.chunithm.model.response.data;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class GameSetting_init_48565393122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1759;
     Object term1761;
     Object term1763;
     Object term1789;
     Object term1791;
     Object term1793;
     Object term1795;

    public GameSetting_init_48565393122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1759 = new Integer(-1896376975);
        term1761 = new Boolean(true);
        term1763 = new Integer(729658803);
        term1789 = new Boolean(true);
        term1791 = new Integer(114754804);
        term1793 = new Integer(1687361082);
        term1795 = new Integer(584893196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = boolean.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        Object[] args = new Object[9];
        args[0] = term1759;
        args[1] = term1761;
        args[2] = term1763;
        args[3] = "tShwQLRGNe";
        args[4] = "LvtrsXUliU";
        args[5] = term1789;
        args[6] = term1791;
        args[7] = term1793;
        args[8] = term1795;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


