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

public class UserCourse_init_21620882583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197229;
     Object term197231;
     Object term197233;
     Object term197235;
     Object term197237;
     Object term197239;
     Object term197241;
     Object term197243;
     Object term197245;
     Object term197247;
     Object term197249;
     Object term197251;
     Object term197253;
     Object term197255;
     Object term197257;

    public UserCourse_init_21620882583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197229 = new Long(0L);
        term197231 = new Integer(0);
        term197233 = new Integer(0);
        term197235 = new Integer(0);
        term197237 = new Integer(0);
        term197239 = new Boolean(false);
        term197241 = new Boolean(false);
        term197243 = new Boolean(false);
        term197245 = new Integer(0);
        term197247 = new Integer(0);
        term197249 = new Integer(0);
        term197251 = new Integer(0);
        term197253 = new Integer(0);
        term197255 = new Integer(0);
        term197257 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[17];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = boolean.class;
        argTypes[7] = boolean.class;
        argTypes[8] = boolean.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = Class.forName("java.time.LocalDateTime");
        argTypes[12] = int.class;
        argTypes[13] = int.class;
        argTypes[14] = int.class;
        argTypes[15] = int.class;
        argTypes[16] = boolean.class;
        Object[] args = new Object[17];
        args[0] = term197229;
        args[1] = null;
        args[2] = term197231;
        args[3] = term197233;
        args[4] = term197235;
        args[5] = term197237;
        args[6] = term197239;
        args[7] = term197241;
        args[8] = term197243;
        args[9] = term197245;
        args[10] = term197247;
        args[11] = null;
        args[12] = term197249;
        args[13] = term197251;
        args[14] = term197253;
        args[15] = term197255;
        args[16] = term197257;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


