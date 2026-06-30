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

public class UserMusicDetail_init_180190544587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108011;
     Object term108013;
     Object term108015;
     Object term108017;
     Object term108019;
     Object term108021;
     Object term108023;
     Object term108025;
     Object term108027;
     Object term108029;
     Object term108031;
     Object term108033;
     Object term108035;
     Object term108037;
     Object term108039;
     Object term108041;
     Object term108043;

    public UserMusicDetail_init_180190544587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108011 = new Long(0L);
        term108013 = new Integer(0);
        term108015 = new Integer(0);
        term108017 = new Integer(0);
        term108019 = new Integer(0);
        term108021 = new Integer(0);
        term108023 = new Integer(0);
        term108025 = new Integer(0);
        term108027 = new Integer(0);
        term108029 = new Integer(0);
        term108031 = new Boolean(false);
        term108033 = new Boolean(false);
        term108035 = new Boolean(false);
        term108037 = new Integer(0);
        term108039 = new Integer(0);
        term108041 = new Integer(0);
        term108043 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[18];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = boolean.class;
        argTypes[12] = boolean.class;
        argTypes[13] = boolean.class;
        argTypes[14] = int.class;
        argTypes[15] = int.class;
        argTypes[16] = int.class;
        argTypes[17] = boolean.class;
        Object[] args = new Object[18];
        args[0] = term108011;
        args[1] = null;
        args[2] = term108013;
        args[3] = term108015;
        args[4] = term108017;
        args[5] = term108019;
        args[6] = term108021;
        args[7] = term108023;
        args[8] = term108025;
        args[9] = term108027;
        args[10] = term108029;
        args[11] = term108031;
        args[12] = term108033;
        args[13] = term108035;
        args[14] = term108037;
        args[15] = term108039;
        args[16] = term108041;
        args[17] = term108043;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


