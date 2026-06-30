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
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;

public class GetUserPreviewResp_init_159163155636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6267;
     Object term6281;
     Object term6283;
     Object term6309;
     Object term6311;
     Object term6313;
     Object term6315;
     Object term6317;
     Object term6319;
     Object term6321;
     Object term6323;
     Object term6325;
     Object term6327;

    public GetUserPreviewResp_init_159163155636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6267 = new Long(6617340557564669657L);
        term6281 = new Boolean(true);
        term6283 = new Integer(2053372601);
        term6309 = new Integer(-1828855069);
        term6311 = new Integer(-1213694931);
        term6313 = new Integer(-1255656944);
        term6315 = new Integer(-377697034);
        term6317 = new Integer(1102778743);
        term6319 = new Integer(1300928519);
        term6321 = new Integer(338172676);
        term6323 = new Integer(-1896960942);
        term6325 = new Integer(-935912608);
        term6327 = new Integer(505087197);
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
        args[0] = term6267;
        args[1] = "tKmrUDURku";
        args[2] = term6281;
        args[3] = term6283;
        args[4] = "JeZbrwZmsP";
        args[5] = "bxyfeicqrK";
        args[6] = term6309;
        args[7] = term6311;
        args[8] = term6313;
        args[9] = term6315;
        args[10] = term6317;
        args[11] = term6319;
        args[12] = term6321;
        args[13] = term6323;
        args[14] = term6325;
        args[15] = term6327;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


