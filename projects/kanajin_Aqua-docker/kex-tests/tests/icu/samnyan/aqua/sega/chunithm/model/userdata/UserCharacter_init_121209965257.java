package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class UserCharacter_init_121209965257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121033;
     Object term121035;
     Object term121037;
     Object term121039;
     Object term121041;
     Object term121043;
     Object term121045;
     Object term121047;
     Object term121049;
     Object term121051;

    public UserCharacter_init_121209965257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121033 = new Long(0L);
        term121035 = new Integer(0);
        term121037 = new Integer(0);
        term121039 = new Integer(0);
        term121041 = new Integer(0);
        term121043 = new Integer(0);
        term121045 = new Boolean(false);
        term121047 = new Boolean(false);
        term121049 = new Integer(0);
        term121051 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = boolean.class;
        argTypes[8] = boolean.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        Object[] args = new Object[11];
        args[0] = term121033;
        args[1] = null;
        args[2] = term121035;
        args[3] = term121037;
        args[4] = term121039;
        args[5] = term121041;
        args[6] = term121043;
        args[7] = term121045;
        args[8] = term121047;
        args[9] = term121049;
        args[10] = term121051;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


