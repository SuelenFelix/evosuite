package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class UserCharacter_init_179210983861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87697;
     Object term87699;
     Object term87701;
     Object term87703;
     Object term87705;
     Object term87707;
     Object term87709;
     Object term87711;
     Object term87713;
     Object term87715;
     Object term87717;

    public UserCharacter_init_179210983861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87697 = new Long(0L);
        term87699 = new Integer(0);
        term87701 = new Integer(0);
        term87703 = new Integer(0);
        term87705 = new Integer(0);
        term87707 = new Boolean(false);
        term87709 = new Boolean(false);
        term87711 = new Integer(0);
        term87713 = new Integer(0);
        term87715 = new Integer(0);
        term87717 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[12];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = boolean.class;
        argTypes[7] = boolean.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = int.class;
        Object[] args = new Object[12];
        args[0] = term87697;
        args[1] = null;
        args[2] = term87699;
        args[3] = term87701;
        args[4] = term87703;
        args[5] = term87705;
        args[6] = term87707;
        args[7] = term87709;
        args[8] = term87711;
        args[9] = term87713;
        args[10] = term87715;
        args[11] = term87717;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


