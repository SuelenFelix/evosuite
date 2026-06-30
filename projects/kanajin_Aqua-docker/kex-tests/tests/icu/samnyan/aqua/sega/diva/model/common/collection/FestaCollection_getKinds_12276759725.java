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

public class FestaCollection_getKinds_12276759725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3994;

    public FestaCollection_getKinds_12276759725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4165 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term4164 = ((Class) term4165).getDeclaredField((String) "PINK_FESTA");
        ((Field) term4164).setAccessible(true);
        Object enum10 = ((Field) term4164).get((Object) null);
        Class<? extends Object> term4447 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term4446 = ((Class) term4447).getDeclaredField((String) "UNDEFINED");
        ((Field) term4446).setAccessible(true);
        Object enum11 = ((Field) term4446).get((Object) null);
        Integer term4071 = new Integer(0);
        Integer term4073 = new Integer(1);
        Integer term4142 = new Integer(0);
        Integer term4144 = new Integer(1);
        term3994 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection"));
        Object term3995 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term4075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4080 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4090 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4091 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4095 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term4146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4157 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3995, term3995.getClass(), "id", -1);
        setBooleanField(term3995, term3995.getClass(), "enable", true);
        setField(term3995, term3995.getClass(), "name", "xxx");
        setField(term3995, term3995.getClass(), "kind", enum10);
        setField(term3995, term3995.getClass(), "difficulty", enum11);
        setField(term3995, term3995.getClass(), "pvList", "ALL");
        setField(term3995, term3995.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term3995, term3995.getClass(), "addVP", term4071);
        setField(term3995, term3995.getClass(), "vpMultiplier", term4073);
        setIntField(term4076, term4076.getClass(), "year", 2005);
        setShortField(term4076, term4076.getClass(), "month", (short) 1);
        setShortField(term4076, term4076.getClass(), "day", (short) 1);
        setField(term4075, term4075.getClass(), "date", term4076);
        setByteField(term4080, term4080.getClass(), "hour", (byte) 0);
        setByteField(term4080, term4080.getClass(), "minute", (byte) 0);
        setByteField(term4080, term4080.getClass(), "second", (byte) 0);
        setIntField(term4080, term4080.getClass(), "nano", 0);
        setField(term4075, term4075.getClass(), "time", term4080);
        setField(term3995, term3995.getClass(), "start", term4075);
        setIntField(term4086, term4086.getClass(), "year", 2005);
        setShortField(term4086, term4086.getClass(), "month", (short) 1);
        setShortField(term4086, term4086.getClass(), "day", (short) 1);
        setField(term4085, term4085.getClass(), "date", term4086);
        setField(term4085, term4085.getClass(), "time", term4080);
        setField(term3995, term3995.getClass(), "end", term4085);
        setIntField(term4091, term4091.getClass(), "year", 2005);
        setShortField(term4091, term4091.getClass(), "month", (short) 1);
        setShortField(term4091, term4091.getClass(), "day", (short) 1);
        setField(term4090, term4090.getClass(), "date", term4091);
        setField(term4090, term4090.getClass(), "time", term4080);
        setField(term3995, term3995.getClass(), "createDate", term4090);
        setField(term3994, term3994.getClass(), "firstFesta", term3995);
        setIntField(term4095, term4095.getClass(), "id", -1);
        setBooleanField(term4095, term4095.getClass(), "enable", true);
        setField(term4095, term4095.getClass(), "name", "xxx");
        setField(term4095, term4095.getClass(), "kind", enum10);
        setField(term4095, term4095.getClass(), "difficulty", enum11);
        setField(term4095, term4095.getClass(), "pvList", "ALL");
        setField(term4095, term4095.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term4095, term4095.getClass(), "addVP", term4142);
        setField(term4095, term4095.getClass(), "vpMultiplier", term4144);
        setIntField(term4147, term4147.getClass(), "year", 2005);
        setShortField(term4147, term4147.getClass(), "month", (short) 1);
        setShortField(term4147, term4147.getClass(), "day", (short) 1);
        setField(term4146, term4146.getClass(), "date", term4147);
        setField(term4146, term4146.getClass(), "time", term4080);
        setField(term4095, term4095.getClass(), "start", term4146);
        setIntField(term4152, term4152.getClass(), "year", 2005);
        setShortField(term4152, term4152.getClass(), "month", (short) 1);
        setShortField(term4152, term4152.getClass(), "day", (short) 1);
        setField(term4151, term4151.getClass(), "date", term4152);
        setField(term4151, term4151.getClass(), "time", term4080);
        setField(term4095, term4095.getClass(), "end", term4151);
        setIntField(term4157, term4157.getClass(), "year", 2005);
        setShortField(term4157, term4157.getClass(), "month", (short) 1);
        setShortField(term4157, term4157.getClass(), "day", (short) 1);
        setField(term4156, term4156.getClass(), "date", term4157);
        setField(term4156, term4156.getClass(), "time", term4080);
        setField(term4095, term4095.getClass(), "createDate", term4156);
        setField(term3994, term3994.getClass(), "secondFesta", term4095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKinds", argTypes, term3994, args);
    }

};


