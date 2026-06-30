package icu.samnyan.aqua.sega.diva.model.common.collection;

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
import static icu.samnyan.aqua.sega.diva.model.common.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class FestaCollection_getVpMultipliers_171624073310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8039;

    public FestaCollection_getVpMultipliers_171624073310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8210 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term8209 = ((Class) term8210).getDeclaredField((String) "PINK_FESTA");
        ((Field) term8209).setAccessible(true);
        Object enum20 = ((Field) term8209).get((Object) null);
        Class<? extends Object> term8492 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term8491 = ((Class) term8492).getDeclaredField((String) "UNDEFINED");
        ((Field) term8491).setAccessible(true);
        Object enum21 = ((Field) term8491).get((Object) null);
        Integer term8116 = new Integer(0);
        Integer term8118 = new Integer(1);
        Integer term8187 = new Integer(0);
        Integer term8189 = new Integer(1);
        term8039 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term8040 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term8120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8125 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8130 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8131 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8140 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term8191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8196 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8202 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term8040, term8040.getClass(), "id", -1);
        setBooleanField(term8040, term8040.getClass(), "enable", true);
        setField(term8040, term8040.getClass(), "name", "xxx");
        setField(term8040, term8040.getClass(), "kind", enum20);
        setField(term8040, term8040.getClass(), "difficulty", enum21);
        setField(term8040, term8040.getClass(), "pvList", "ALL");
        setField(term8040, term8040.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term8040, term8040.getClass(), "addVP", term8116);
        setField(term8040, term8040.getClass(), "vpMultiplier", term8118);
        setIntField(term8121, term8121.getClass(), "year", 2005);
        setShortField(term8121, term8121.getClass(), "month", (short) 1);
        setShortField(term8121, term8121.getClass(), "day", (short) 1);
        setField(term8120, term8120.getClass(), "date", term8121);
        setByteField(term8125, term8125.getClass(), "hour", (byte) 0);
        setByteField(term8125, term8125.getClass(), "minute", (byte) 0);
        setByteField(term8125, term8125.getClass(), "second", (byte) 0);
        setIntField(term8125, term8125.getClass(), "nano", 0);
        setField(term8120, term8120.getClass(), "time", term8125);
        setField(term8040, term8040.getClass(), "start", term8120);
        setIntField(term8131, term8131.getClass(), "year", 2005);
        setShortField(term8131, term8131.getClass(), "month", (short) 1);
        setShortField(term8131, term8131.getClass(), "day", (short) 1);
        setField(term8130, term8130.getClass(), "date", term8131);
        setField(term8130, term8130.getClass(), "time", term8125);
        setField(term8040, term8040.getClass(), "end", term8130);
        setIntField(term8136, term8136.getClass(), "year", 2005);
        setShortField(term8136, term8136.getClass(), "month", (short) 1);
        setShortField(term8136, term8136.getClass(), "day", (short) 1);
        setField(term8135, term8135.getClass(), "date", term8136);
        setField(term8135, term8135.getClass(), "time", term8125);
        setField(term8040, term8040.getClass(), "createDate", term8135);
        setField(term8039, term8039.getClass(), "firstFesta", term8040);
        setIntField(term8140, term8140.getClass(), "id", -1);
        setBooleanField(term8140, term8140.getClass(), "enable", true);
        setField(term8140, term8140.getClass(), "name", "xxx");
        setField(term8140, term8140.getClass(), "kind", enum20);
        setField(term8140, term8140.getClass(), "difficulty", enum21);
        setField(term8140, term8140.getClass(), "pvList", "ALL");
        setField(term8140, term8140.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term8140, term8140.getClass(), "addVP", term8187);
        setField(term8140, term8140.getClass(), "vpMultiplier", term8189);
        setIntField(term8192, term8192.getClass(), "year", 2005);
        setShortField(term8192, term8192.getClass(), "month", (short) 1);
        setShortField(term8192, term8192.getClass(), "day", (short) 1);
        setField(term8191, term8191.getClass(), "date", term8192);
        setField(term8191, term8191.getClass(), "time", term8125);
        setField(term8140, term8140.getClass(), "start", term8191);
        setIntField(term8197, term8197.getClass(), "year", 2005);
        setShortField(term8197, term8197.getClass(), "month", (short) 1);
        setShortField(term8197, term8197.getClass(), "day", (short) 1);
        setField(term8196, term8196.getClass(), "date", term8197);
        setField(term8196, term8196.getClass(), "time", term8125);
        setField(term8140, term8140.getClass(), "end", term8196);
        setIntField(term8202, term8202.getClass(), "year", 2005);
        setShortField(term8202, term8202.getClass(), "month", (short) 1);
        setShortField(term8202, term8202.getClass(), "day", (short) 1);
        setField(term8201, term8201.getClass(), "date", term8202);
        setField(term8201, term8201.getClass(), "time", term8125);
        setField(term8140, term8140.getClass(), "createDate", term8201);
        setField(term8039, term8039.getClass(), "secondFesta", term8140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVpMultipliers", argTypes, term8039, args);
    }

};


