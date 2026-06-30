package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class UserCard_init_174735636079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133703;
     Object term133705;
     Object term133707;
     Object term133709;
     Object term133711;
     Object term133713;
     Object term133715;
     Object term133717;
     Object term133719;
     Object term133721;
     Object term133723;
     Object term133725;

    public UserCard_init_174735636079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133703 = new Long(0L);
        term133705 = new Integer(0);
        term133707 = new Integer(0);
        term133709 = new Integer(0);
        term133711 = new Integer(0);
        term133713 = new Integer(0);
        term133715 = new Integer(0);
        term133717 = new Integer(0);
        term133719 = new Integer(0);
        term133721 = new Boolean(false);
        term133723 = new Integer(0);
        term133725 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[16];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = boolean.class;
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = int.class;
        argTypes[14] = boolean.class;
        argTypes[15] = Class.forName("java.lang.String");
        Object[] args = new Object[16];
        args[0] = term133703;
        args[1] = null;
        args[2] = term133705;
        args[3] = term133707;
        args[4] = term133709;
        args[5] = term133711;
        args[6] = term133713;
        args[7] = term133715;
        args[8] = term133717;
        args[9] = term133719;
        args[10] = term133721;
        args[11] = null;
        args[12] = null;
        args[13] = term133723;
        args[14] = term133725;
        args[15] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


