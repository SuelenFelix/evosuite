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

public class UserDuel_init_89931440857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88067;
     Object term88069;
     Object term88071;
     Object term88073;
     Object term88075;
     Object term88077;
     Object term88079;
     Object term88081;
     Object term88083;

    public UserDuel_init_89931440857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88067 = new Long(0L);
        term88069 = new Integer(0);
        term88071 = new Integer(0);
        term88073 = new Integer(0);
        term88075 = new Boolean(false);
        term88077 = new Integer(0);
        term88079 = new Integer(0);
        term88081 = new Integer(0);
        term88083 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = boolean.class;
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        Object[] args = new Object[11];
        args[0] = term88067;
        args[1] = null;
        args[2] = term88069;
        args[3] = term88071;
        args[4] = term88073;
        args[5] = term88075;
        args[6] = null;
        args[7] = term88077;
        args[8] = term88079;
        args[9] = term88081;
        args[10] = term88083;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


