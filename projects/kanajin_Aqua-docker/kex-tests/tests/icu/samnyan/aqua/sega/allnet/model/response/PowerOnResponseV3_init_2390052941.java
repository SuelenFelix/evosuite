package icu.samnyan.aqua.sega.allnet.model.response;

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
import static icu.samnyan.aqua.sega.allnet.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PowerOnResponseV3_init_2390052941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15419;

    public PowerOnResponseV3_init_2390052941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15419 = new Integer(767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[18];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = Class.forName("java.lang.String");
        argTypes[14] = Class.forName("java.lang.String");
        argTypes[15] = Class.forName("java.lang.String");
        argTypes[16] = Class.forName("java.lang.String");
        argTypes[17] = Class.forName("java.lang.String");
        Object[] args = new Object[18];
        args[0] = term15419;
        args[1] = "BOvgwHfoHQ";
        args[2] = "hPpFNeDBIb";
        args[3] = "DNOtiLPAIY";
        args[4] = "FnEkAHBfyV";
        args[5] = "VfmNFpEuax";
        args[6] = "ANHjlWPmZG";
        args[7] = "SibzENsyyy";
        args[8] = "mrqGHotaef";
        args[9] = "UbZGBpQZQW";
        args[10] = "SvGTualQPa";
        args[11] = "mdxcgZwsaP";
        args[12] = "XildIRoZHG";
        args[13] = "lEcrFlxJXH";
        args[14] = "VNdDwXMYxR";
        args[15] = "bVbexZPmwW";
        args[16] = "tvxYdqiyGc";
        args[17] = "ZEXFoMSKeG";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


