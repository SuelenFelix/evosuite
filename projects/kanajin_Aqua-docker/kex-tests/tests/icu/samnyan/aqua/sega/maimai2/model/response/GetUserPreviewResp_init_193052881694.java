package icu.samnyan.aqua.sega.maimai2.model.response;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;

public class GetUserPreviewResp_init_193052881694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32517;
     Object term32519;
     Object term32521;
     Object term32523;
     Object term32525;
     Object term32527;
     Object term32529;
     Object term32531;
     Object term32533;
     Object term32535;
     Object term32537;
     Object term32539;
     Object term32541;
     Object term32543;

    public GetUserPreviewResp_init_193052881694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32517 = new Long(0L);
        term32519 = new Boolean(false);
        term32521 = new Integer(0);
        term32523 = new Integer(0);
        term32525 = new Integer(0);
        term32527 = new Integer(0);
        term32529 = new Integer(0);
        term32531 = new Integer(0);
        term32533 = new Integer(0);
        term32535 = new Integer(0);
        term32537 = new Integer(0);
        term32539 = new Integer(0);
        term32541 = new Boolean(false);
        term32543 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[21];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = int.class;
        argTypes[12] = int.class;
        argTypes[13] = int.class;
        argTypes[14] = int.class;
        argTypes[15] = int.class;
        argTypes[16] = int.class;
        argTypes[17] = Class.forName("java.lang.String");
        argTypes[18] = int.class;
        argTypes[19] = boolean.class;
        argTypes[20] = int.class;
        Object[] args = new Object[21];
        args[0] = term32517;
        args[1] = null;
        args[2] = term32519;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        args[8] = term32521;
        args[9] = term32523;
        args[10] = term32525;
        args[11] = term32527;
        args[12] = term32529;
        args[13] = term32531;
        args[14] = term32533;
        args[15] = term32535;
        args[16] = term32537;
        args[17] = null;
        args[18] = term32539;
        args[19] = term32541;
        args[20] = term32543;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


