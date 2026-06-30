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

public class GameSetting_init_188215610038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11685;
     Object term11687;
     Object term11713;
     Object term11715;
     Object term11717;
     Object term11719;
     Object term11745;
     Object term11747;

    public GameSetting_init_188215610038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11685 = new Boolean(true);
        term11687 = new Integer(467573222);
        term11713 = new Boolean(true);
        term11715 = new Integer(-197212451);
        term11717 = new Integer(213194885);
        term11719 = new Integer(364063308);
        term11745 = new Integer(-787041664);
        term11747 = new Integer(2141179437);
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
        args[0] = "dfZepHfGwh";
        args[1] = "zjfMxUERFZ";
        args[2] = term11685;
        args[3] = term11687;
        args[4] = "ooVlhmiOff";
        args[5] = "dUNzDLXJcj";
        args[6] = term11713;
        args[7] = term11715;
        args[8] = term11717;
        args[9] = term11719;
        args[10] = "OrVSjRJVwa";
        args[11] = "cdZEcINJAM";
        args[12] = term11745;
        args[13] = term11747;
        args[14] = "qumYSwcWHz";
        args[15] = "raNzcEorkV";
        args[16] = "nEgozCeoUr";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


