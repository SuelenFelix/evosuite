package icu.samnyan.aqua.sega.chusan.model.response.data;

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
import static icu.samnyan.aqua.sega.chusan.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;

public class GameSetting_init_188215610078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12233;
     Object term12235;
     Object term12237;
     Object term12239;
     Object term12241;
     Object term12243;
     Object term12245;
     Object term12247;

    public GameSetting_init_188215610078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12233 = new Boolean(false);
        term12235 = new Integer(0);
        term12237 = new Boolean(false);
        term12239 = new Integer(0);
        term12241 = new Integer(0);
        term12243 = new Integer(0);
        term12245 = new Integer(0);
        term12247 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[17];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = boolean.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = int.class;
        argTypes[13] = int.class;
        argTypes[14] = Class.forName("java.lang.String");
        argTypes[15] = Class.forName("java.lang.String");
        argTypes[16] = Class.forName("java.lang.String");
        Object[] args = new Object[17];
        args[0] = null;
        args[1] = null;
        args[2] = term12233;
        args[3] = term12235;
        args[4] = null;
        args[5] = null;
        args[6] = term12237;
        args[7] = term12239;
        args[8] = term12241;
        args[9] = term12243;
        args[10] = null;
        args[11] = null;
        args[12] = term12245;
        args[13] = term12247;
        args[14] = null;
        args[15] = null;
        args[16] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


