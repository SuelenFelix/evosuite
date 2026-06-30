package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;

public class ProfileResp_init_18019347248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4099;
     Object term4113;
     Object term4115;
     Object term4117;
     Object term4119;
     Object term4121;
     Object term4123;
     Object term4125;
     Object term4127;
     Object term4129;
     Object term4131;
     Object term4133;
     Object term4135;
     Object term4137;
     Object term4139;
     Object term4141;
     Object term4143;
     Object term4145;
     Object term4155;
     Object term4165;

    public ProfileResp_init_18019347248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4099 = new Integer(-1945635750);
        term4113 = new Long(4525924047960478347L);
        term4115 = new Long(-3225860270104198596L);
        term4117 = new Integer(-1622760744);
        term4119 = new Integer(2068435279);
        term4121 = new Integer(-1556527718);
        term4123 = new Integer(895255351);
        term4125 = new Integer(-1317044799);
        term4127 = new Integer(-1428063820);
        term4129 = new Integer(-1271375703);
        term4131 = new Integer(1136208236);
        term4133 = new Long(-1164342036939643746L);
        term4135 = new Long(-7013378340043571457L);
        term4137 = new Long(-3279534582096707294L);
        term4139 = new Long(-6490254947459640565L);
        term4141 = new Long(-7001094993638840490L);
        term4143 = new Integer(-1220630391);
        term4145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4150 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4146, term4146.getClass(), "year", 2019);
        setShortField(term4146, term4146.getClass(), "month", (short) 8);
        setShortField(term4146, term4146.getClass(), "day", (short) 12);
        setField(term4145, term4145.getClass(), "date", term4146);
        setByteField(term4150, term4150.getClass(), "hour", (byte) 14);
        setByteField(term4150, term4150.getClass(), "minute", (byte) 1);
        setByteField(term4150, term4150.getClass(), "second", (byte) 51);
        setIntField(term4150, term4150.getClass(), "nano", 499021786);
        setField(term4145, term4145.getClass(), "time", term4150);
        term4155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4160 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4156, term4156.getClass(), "year", 2014);
        setShortField(term4156, term4156.getClass(), "month", (short) 7);
        setShortField(term4156, term4156.getClass(), "day", (short) 22);
        setField(term4155, term4155.getClass(), "date", term4156);
        setByteField(term4160, term4160.getClass(), "hour", (byte) 9);
        setByteField(term4160, term4160.getClass(), "minute", (byte) 40);
        setByteField(term4160, term4160.getClass(), "second", (byte) 34);
        setIntField(term4160, term4160.getClass(), "nano", 463008257);
        setField(term4155, term4155.getClass(), "time", term4160);
        term4165 = new Integer(-995822131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[22];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = long.class;
        argTypes[4] = long.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = int.class;
        argTypes[12] = int.class;
        argTypes[13] = long.class;
        argTypes[14] = long.class;
        argTypes[15] = long.class;
        argTypes[16] = long.class;
        argTypes[17] = long.class;
        argTypes[18] = int.class;
        argTypes[19] = Class.forName("java.time.LocalDateTime");
        argTypes[20] = Class.forName("java.time.LocalDateTime");
        argTypes[21] = int.class;
        Object[] args = new Object[22];
        args[0] = "XPKmummaqg";
        args[1] = term4099;
        args[2] = "BKLfkLiZTH";
        args[3] = term4113;
        args[4] = term4115;
        args[5] = term4117;
        args[6] = term4119;
        args[7] = term4121;
        args[8] = term4123;
        args[9] = term4125;
        args[10] = term4127;
        args[11] = term4129;
        args[12] = term4131;
        args[13] = term4133;
        args[14] = term4135;
        args[15] = term4137;
        args[16] = term4139;
        args[17] = term4141;
        args[18] = term4143;
        args[19] = term4145;
        args[20] = term4155;
        args[21] = term4165;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


