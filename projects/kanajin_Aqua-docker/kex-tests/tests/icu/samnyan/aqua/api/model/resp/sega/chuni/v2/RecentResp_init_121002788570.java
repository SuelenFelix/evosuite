package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class RecentResp_init_121002788570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49909;
     Object term49919;
     Object term49929;
     Object term49931;
     Object term49933;
     Object term49935;
     Object term49937;
     Object term49939;
     Object term49941;
     Object term49943;
     Object term49945;
     Object term49947;
     Object term49949;
     Object term49951;
     Object term49953;
     Object term49955;
     Object term49957;
     Object term49959;
     Object term49961;
     Object term49963;
     Object term49965;
     Object term49967;
     Object term49969;
     Object term49971;
     Object term49973;
     Object term49975;
     Object term49977;
     Object term49979;
     Object term49981;
     Object term49983;
     Object term49985;
     Object term49987;
     Object term49989;

    public RecentResp_init_121002788570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49914 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49910, term49910.getClass(), "year", 2013);
        setShortField(term49910, term49910.getClass(), "month", (short) 1);
        setShortField(term49910, term49910.getClass(), "day", (short) 25);
        setField(term49909, term49909.getClass(), "date", term49910);
        setByteField(term49914, term49914.getClass(), "hour", (byte) 11);
        setByteField(term49914, term49914.getClass(), "minute", (byte) 5);
        setByteField(term49914, term49914.getClass(), "second", (byte) 35);
        setIntField(term49914, term49914.getClass(), "nano", 914812579);
        setField(term49909, term49909.getClass(), "time", term49914);
        term49919 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49920 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49924 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49920, term49920.getClass(), "year", 2020);
        setShortField(term49920, term49920.getClass(), "month", (short) 11);
        setShortField(term49920, term49920.getClass(), "day", (short) 6);
        setField(term49919, term49919.getClass(), "date", term49920);
        setByteField(term49924, term49924.getClass(), "hour", (byte) 20);
        setByteField(term49924, term49924.getClass(), "minute", (byte) 26);
        setByteField(term49924, term49924.getClass(), "second", (byte) 26);
        setIntField(term49924, term49924.getClass(), "nano", 961202696);
        setField(term49919, term49919.getClass(), "time", term49924);
        term49929 = new Integer(1670332444);
        term49931 = new Integer(-1903805864);
        term49933 = new Integer(751123733);
        term49935 = new Integer(-2099677081);
        term49937 = new Integer(-1911852008);
        term49939 = new Integer(-126937505);
        term49941 = new Integer(1600311664);
        term49943 = new Integer(1505616296);
        term49945 = new Integer(453453842);
        term49947 = new Integer(591356101);
        term49949 = new Integer(1387849981);
        term49951 = new Integer(518095920);
        term49953 = new Integer(1333750018);
        term49955 = new Integer(1824319777);
        term49957 = new Integer(-942865663);
        term49959 = new Integer(612230460);
        term49961 = new Integer(-87837417);
        term49963 = new Integer(-1864680068);
        term49965 = new Integer(1979269463);
        term49967 = new Integer(-1690818607);
        term49969 = new Integer(252440319);
        term49971 = new Boolean(true);
        term49973 = new Boolean(false);
        term49975 = new Integer(-1798089143);
        term49977 = new Boolean(true);
        term49979 = new Integer(-2056399026);
        term49981 = new Integer(-150070327);
        term49983 = new Integer(-731659931);
        term49985 = new Boolean(false);
        term49987 = new Integer(645238162);
        term49989 = new Integer(-987757870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[33];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
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
        argTypes[16] = int.class;
        argTypes[17] = int.class;
        argTypes[18] = int.class;
        argTypes[19] = int.class;
        argTypes[20] = int.class;
        argTypes[21] = int.class;
        argTypes[22] = int.class;
        argTypes[23] = boolean.class;
        argTypes[24] = boolean.class;
        argTypes[25] = int.class;
        argTypes[26] = boolean.class;
        argTypes[27] = int.class;
        argTypes[28] = int.class;
        argTypes[29] = int.class;
        argTypes[30] = boolean.class;
        argTypes[31] = int.class;
        argTypes[32] = int.class;
        Object[] args = new Object[33];
        args[0] = term49909;
        args[1] = term49919;
        args[2] = term49929;
        args[3] = term49931;
        args[4] = term49933;
        args[5] = term49935;
        args[6] = term49937;
        args[7] = term49939;
        args[8] = term49941;
        args[9] = term49943;
        args[10] = term49945;
        args[11] = term49947;
        args[12] = term49949;
        args[13] = term49951;
        args[14] = term49953;
        args[15] = term49955;
        args[16] = term49957;
        args[17] = term49959;
        args[18] = term49961;
        args[19] = term49963;
        args[20] = term49965;
        args[21] = term49967;
        args[22] = term49969;
        args[23] = term49971;
        args[24] = term49973;
        args[25] = term49975;
        args[26] = term49977;
        args[27] = term49979;
        args[28] = term49981;
        args[29] = term49983;
        args[30] = term49985;
        args[31] = term49987;
        args[32] = term49989;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


