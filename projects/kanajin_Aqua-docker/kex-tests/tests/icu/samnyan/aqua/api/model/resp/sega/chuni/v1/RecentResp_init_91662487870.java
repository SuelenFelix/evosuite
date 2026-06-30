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
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class RecentResp_init_91662487870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55079;
     Object term55089;
     Object term55099;
     Object term55101;
     Object term55103;
     Object term55105;
     Object term55107;
     Object term55109;
     Object term55111;
     Object term55113;
     Object term55115;
     Object term55117;
     Object term55119;
     Object term55121;
     Object term55123;
     Object term55125;
     Object term55127;
     Object term55129;
     Object term55131;
     Object term55133;
     Object term55135;
     Object term55137;
     Object term55139;
     Object term55141;
     Object term55143;
     Object term55145;
     Object term55147;
     Object term55149;
     Object term55151;
     Object term55153;
     Object term55155;
     Object term55157;
     Object term55159;

    public RecentResp_init_91662487870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55079 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55080 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55084 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term55080, term55080.getClass(), "year", 2023);
        setShortField(term55080, term55080.getClass(), "month", (short) 11);
        setShortField(term55080, term55080.getClass(), "day", (short) 25);
        setField(term55079, term55079.getClass(), "date", term55080);
        setByteField(term55084, term55084.getClass(), "hour", (byte) 1);
        setByteField(term55084, term55084.getClass(), "minute", (byte) 27);
        setByteField(term55084, term55084.getClass(), "second", (byte) 54);
        setIntField(term55084, term55084.getClass(), "nano", 382362839);
        setField(term55079, term55079.getClass(), "time", term55084);
        term55089 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55090 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55094 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term55090, term55090.getClass(), "year", 2019);
        setShortField(term55090, term55090.getClass(), "month", (short) 7);
        setShortField(term55090, term55090.getClass(), "day", (short) 3);
        setField(term55089, term55089.getClass(), "date", term55090);
        setByteField(term55094, term55094.getClass(), "hour", (byte) 1);
        setByteField(term55094, term55094.getClass(), "minute", (byte) 7);
        setByteField(term55094, term55094.getClass(), "second", (byte) 43);
        setIntField(term55094, term55094.getClass(), "nano", 632872277);
        setField(term55089, term55089.getClass(), "time", term55094);
        term55099 = new Integer(1538271896);
        term55101 = new Integer(840990489);
        term55103 = new Integer(-793012848);
        term55105 = new Integer(-2041331473);
        term55107 = new Integer(-416355601);
        term55109 = new Integer(439309680);
        term55111 = new Integer(-1717455505);
        term55113 = new Integer(1898536358);
        term55115 = new Integer(1296009499);
        term55117 = new Integer(-427335137);
        term55119 = new Integer(9865038);
        term55121 = new Integer(1202401386);
        term55123 = new Integer(1173310137);
        term55125 = new Integer(957107652);
        term55127 = new Integer(292629613);
        term55129 = new Integer(1420755413);
        term55131 = new Integer(-755973893);
        term55133 = new Integer(-890311309);
        term55135 = new Integer(2132845865);
        term55137 = new Integer(1676055742);
        term55139 = new Integer(-963623987);
        term55141 = new Boolean(true);
        term55143 = new Boolean(false);
        term55145 = new Integer(1184368914);
        term55147 = new Boolean(true);
        term55149 = new Integer(138525382);
        term55151 = new Integer(-1100331351);
        term55153 = new Integer(1506966329);
        term55155 = new Boolean(false);
        term55157 = new Integer(38318819);
        term55159 = new Integer(277037422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
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
        args[0] = term55079;
        args[1] = term55089;
        args[2] = term55099;
        args[3] = term55101;
        args[4] = term55103;
        args[5] = term55105;
        args[6] = term55107;
        args[7] = term55109;
        args[8] = term55111;
        args[9] = term55113;
        args[10] = term55115;
        args[11] = term55117;
        args[12] = term55119;
        args[13] = term55121;
        args[14] = term55123;
        args[15] = term55125;
        args[16] = term55127;
        args[17] = term55129;
        args[18] = term55131;
        args[19] = term55133;
        args[20] = term55135;
        args[21] = term55137;
        args[22] = term55139;
        args[23] = term55141;
        args[24] = term55143;
        args[25] = term55145;
        args[26] = term55147;
        args[27] = term55149;
        args[28] = term55151;
        args[29] = term55153;
        args[30] = term55155;
        args[31] = term55157;
        args[32] = term55159;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


