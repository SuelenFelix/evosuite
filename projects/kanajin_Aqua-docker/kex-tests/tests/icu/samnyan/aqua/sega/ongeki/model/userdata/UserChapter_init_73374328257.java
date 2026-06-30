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

public class UserChapter_init_73374328257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96101;
     Object term96103;
     Object term96105;
     Object term96107;
     Object term96109;
     Object term96111;
     Object term96113;
     Object term96115;
     Object term96117;
     Object term96119;

    public UserChapter_init_73374328257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96101 = new Long(0L);
        term96103 = new Integer(0);
        term96105 = new Integer(0);
        term96107 = new Integer(0);
        term96109 = new Integer(0);
        term96111 = new Integer(0);
        term96113 = new Boolean(false);
        term96115 = new Boolean(false);
        term96117 = new Integer(0);
        term96119 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
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
        args[0] = term96101;
        args[1] = null;
        args[2] = term96103;
        args[3] = term96105;
        args[4] = term96107;
        args[5] = term96109;
        args[6] = term96111;
        args[7] = term96113;
        args[8] = term96115;
        args[9] = term96117;
        args[10] = term96119;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


