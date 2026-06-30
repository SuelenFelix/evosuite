package icu.samnyan.aqua.sega.chunithm.model.response;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;

public class GetUserPreviewResp_init_8231236586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26143;
     Object term26145;
     Object term26147;
     Object term26149;
     Object term26151;
     Object term26153;
     Object term26155;
     Object term26157;
     Object term26159;

    public GetUserPreviewResp_init_8231236586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26143 = new Boolean(false);
        term26145 = new Integer(0);
        term26147 = new Integer(0);
        term26149 = new Integer(0);
        term26151 = new Integer(0);
        term26153 = new Integer(0);
        term26155 = new Integer(0);
        term26157 = new Integer(0);
        term26159 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[19];
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
        argTypes[13] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        argTypes[14] = int.class;
        argTypes[15] = int.class;
        argTypes[16] = int.class;
        argTypes[17] = int.class;
        argTypes[18] = Class.forName("java.lang.String");
        Object[] args = new Object[19];
        args[0] = null;
        args[1] = term26143;
        args[2] = null;
        args[3] = null;
        args[4] = term26145;
        args[5] = term26147;
        args[6] = null;
        args[7] = term26149;
        args[8] = null;
        args[9] = null;
        args[10] = null;
        args[11] = null;
        args[12] = term26151;
        args[13] = null;
        args[14] = term26153;
        args[15] = term26155;
        args[16] = term26157;
        args[17] = term26159;
        args[18] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


