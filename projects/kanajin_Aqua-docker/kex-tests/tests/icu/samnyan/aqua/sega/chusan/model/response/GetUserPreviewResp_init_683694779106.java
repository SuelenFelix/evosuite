package icu.samnyan.aqua.sega.chusan.model.response;

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
import static icu.samnyan.aqua.sega.chusan.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;

public class GetUserPreviewResp_init_683694779106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53319;
     Object term53321;
     Object term53323;
     Object term53325;
     Object term53327;
     Object term53329;
     Object term53331;
     Object term53333;
     Object term53335;
     Object term53337;
     Object term53339;
     Object term53341;
     Object term53343;
     Object term53345;

    public GetUserPreviewResp_init_683694779106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53319 = new Boolean(false);
        term53321 = new Integer(0);
        term53323 = new Integer(0);
        term53325 = new Integer(0);
        term53327 = new Integer(0);
        term53329 = new Integer(0);
        term53331 = new Integer(0);
        term53333 = new Integer(0);
        term53335 = new Integer(0);
        term53337 = new Integer(0);
        term53339 = new Integer(0);
        term53341 = new Integer(0);
        term53343 = new Integer(0);
        term53345 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[24];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = int.class;
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.time.LocalDateTime");
        argTypes[12] = int.class;
        argTypes[13] = int.class;
        argTypes[14] = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserCharacter");
        argTypes[15] = int.class;
        argTypes[16] = int.class;
        argTypes[17] = int.class;
        argTypes[18] = int.class;
        argTypes[19] = Class.forName("java.lang.String");
        argTypes[20] = int.class;
        argTypes[21] = int.class;
        argTypes[22] = int.class;
        argTypes[23] = int.class;
        Object[] args = new Object[24];
        args[0] = null;
        args[1] = term53319;
        args[2] = null;
        args[3] = null;
        args[4] = term53321;
        args[5] = term53323;
        args[6] = null;
        args[7] = term53325;
        args[8] = null;
        args[9] = null;
        args[10] = null;
        args[11] = null;
        args[12] = term53327;
        args[13] = term53329;
        args[14] = null;
        args[15] = term53331;
        args[16] = term53333;
        args[17] = term53335;
        args[18] = term53337;
        args[19] = null;
        args[20] = term53339;
        args[21] = term53341;
        args[22] = term53343;
        args[23] = term53345;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


