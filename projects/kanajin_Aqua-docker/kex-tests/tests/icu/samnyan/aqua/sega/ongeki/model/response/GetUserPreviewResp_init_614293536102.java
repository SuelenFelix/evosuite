package icu.samnyan.aqua.sega.ongeki.model.response;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;

public class GetUserPreviewResp_init_614293536102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9944;
     Object term9946;
     Object term9948;
     Object term9950;
     Object term9952;
     Object term9954;
     Object term9956;
     Object term9958;
     Object term9960;
     Object term9962;
     Object term9964;
     Object term9966;
     Object term9968;
     Object term9970;
     Object term9972;
     Object term9974;
     Object term9976;

    public GetUserPreviewResp_init_614293536102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9944 = new Long(0L);
        term9946 = new Boolean(false);
        term9948 = new Integer(0);
        term9950 = new Integer(0);
        term9952 = new Long(0L);
        term9954 = new Long(0L);
        term9956 = new Integer(0);
        term9958 = new Integer(0);
        term9960 = new Integer(0);
        term9962 = new Integer(0);
        term9964 = new Integer(0);
        term9966 = new Integer(0);
        term9968 = new Integer(0);
        term9970 = new Integer(0);
        term9972 = new Boolean(false);
        term9974 = new Integer(0);
        term9976 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[23];
        argTypes[0] = long.class;
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = long.class;
        argTypes[7] = long.class;
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = int.class;
        argTypes[13] = int.class;
        argTypes[14] = int.class;
        argTypes[15] = int.class;
        argTypes[16] = int.class;
        argTypes[17] = int.class;
        argTypes[18] = int.class;
        argTypes[19] = int.class;
        argTypes[20] = boolean.class;
        argTypes[21] = int.class;
        argTypes[22] = int.class;
        Object[] args = new Object[23];
        args[0] = term9944;
        args[1] = term9946;
        args[2] = null;
        args[3] = null;
        args[4] = term9948;
        args[5] = term9950;
        args[6] = term9952;
        args[7] = term9954;
        args[8] = null;
        args[9] = null;
        args[10] = null;
        args[11] = null;
        args[12] = term9956;
        args[13] = term9958;
        args[14] = term9960;
        args[15] = term9962;
        args[16] = term9964;
        args[17] = term9966;
        args[18] = term9968;
        args[19] = term9970;
        args[20] = term9972;
        args[21] = term9974;
        args[22] = term9976;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


