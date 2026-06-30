package icu.samnyan.aqua.sega.maimai.model.response;

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
import static icu.samnyan.aqua.sega.maimai.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;

public class GetUserPreviewResp_init_159163155674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6851;
     Object term6853;
     Object term6855;
     Object term6857;
     Object term6859;
     Object term6861;
     Object term6863;
     Object term6865;
     Object term6867;
     Object term6869;
     Object term6871;
     Object term6873;

    public GetUserPreviewResp_init_159163155674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6851 = new Boolean(false);
        term6853 = new Integer(0);
        term6855 = new Integer(0);
        term6857 = new Integer(0);
        term6859 = new Integer(0);
        term6861 = new Integer(0);
        term6863 = new Integer(0);
        term6865 = new Integer(0);
        term6867 = new Integer(0);
        term6869 = new Integer(0);
        term6871 = new Integer(0);
        term6873 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetUserPreviewResp");
        Class<?>[] argTypes = new Class<?>[16];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = int.class;
        argTypes[12] = int.class;
        argTypes[13] = int.class;
        argTypes[14] = int.class;
        argTypes[15] = int.class;
        Object[] args = new Object[16];
        args[0] = null;
        args[1] = null;
        args[2] = term6851;
        args[3] = term6853;
        args[4] = null;
        args[5] = null;
        args[6] = term6855;
        args[7] = term6857;
        args[8] = term6859;
        args[9] = term6861;
        args[10] = term6863;
        args[11] = term6865;
        args[12] = term6867;
        args[13] = term6869;
        args[14] = term6871;
        args[15] = term6873;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


