package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UserBoss_init_48830146253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96621;
     Object term96623;
     Object term96625;
     Object term96627;
     Object term96629;
     Object term96631;
     Object term96633;
     Object term96635;
     Object term96637;

    public UserBoss_init_48830146253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96621 = new Long(0L);
        term96623 = new Long(0L);
        term96625 = new Long(0L);
        term96627 = new Long(0L);
        term96629 = new Long(0L);
        term96631 = new Long(0L);
        term96633 = new Long(0L);
        term96635 = new Long(0L);
        term96637 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        argTypes[2] = long.class;
        argTypes[3] = long.class;
        argTypes[4] = long.class;
        argTypes[5] = long.class;
        argTypes[6] = long.class;
        argTypes[7] = long.class;
        argTypes[8] = long.class;
        argTypes[9] = long.class;
        Object[] args = new Object[10];
        args[0] = term96621;
        args[1] = null;
        args[2] = term96623;
        args[3] = term96625;
        args[4] = term96627;
        args[5] = term96629;
        args[6] = term96631;
        args[7] = term96633;
        args[8] = term96635;
        args[9] = term96637;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


