package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class GameCharge_setOrderId_193902532411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1209;
     Object term1267;

    public GameCharge_setOrderId_193902532411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1209 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge"));
        Object term1214 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1215 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1219 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1224 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1225 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1229 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1235 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1236 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1240 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1245 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1246 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1250 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1209, term1209.getClass(), "id", -4325723315152823407L);
        setIntField(term1209, term1209.getClass(), "orderId", -2027534003);
        setIntField(term1209, term1209.getClass(), "chargeId", 1063420942);
        setIntField(term1209, term1209.getClass(), "price", 1375330971);
        setIntField(term1215, term1215.getClass(), "year", 2011);
        setShortField(term1215, term1215.getClass(), "month", (short) 8);
        setShortField(term1215, term1215.getClass(), "day", (short) 1);
        setField(term1214, term1214.getClass(), "date", term1215);
        setByteField(term1219, term1219.getClass(), "hour", (byte) 7);
        setByteField(term1219, term1219.getClass(), "minute", (byte) 2);
        setByteField(term1219, term1219.getClass(), "second", (byte) 46);
        setIntField(term1219, term1219.getClass(), "nano", 187178462);
        setField(term1214, term1214.getClass(), "time", term1219);
        setField(term1209, term1209.getClass(), "startDate", term1214);
        setIntField(term1225, term1225.getClass(), "year", 2020);
        setShortField(term1225, term1225.getClass(), "month", (short) 9);
        setShortField(term1225, term1225.getClass(), "day", (short) 3);
        setField(term1224, term1224.getClass(), "date", term1225);
        setByteField(term1229, term1229.getClass(), "hour", (byte) 10);
        setByteField(term1229, term1229.getClass(), "minute", (byte) 44);
        setByteField(term1229, term1229.getClass(), "second", (byte) 5);
        setIntField(term1229, term1229.getClass(), "nano", 572560230);
        setField(term1224, term1224.getClass(), "time", term1229);
        setField(term1209, term1209.getClass(), "endDate", term1224);
        setIntField(term1209, term1209.getClass(), "salePrice", -478195677);
        setIntField(term1236, term1236.getClass(), "year", 2020);
        setShortField(term1236, term1236.getClass(), "month", (short) 8);
        setShortField(term1236, term1236.getClass(), "day", (short) 16);
        setField(term1235, term1235.getClass(), "date", term1236);
        setByteField(term1240, term1240.getClass(), "hour", (byte) 4);
        setByteField(term1240, term1240.getClass(), "minute", (byte) 37);
        setByteField(term1240, term1240.getClass(), "second", (byte) 19);
        setIntField(term1240, term1240.getClass(), "nano", 605410923);
        setField(term1235, term1235.getClass(), "time", term1240);
        setField(term1209, term1209.getClass(), "saleStartDate", term1235);
        setIntField(term1246, term1246.getClass(), "year", 2028);
        setShortField(term1246, term1246.getClass(), "month", (short) 5);
        setShortField(term1246, term1246.getClass(), "day", (short) 2);
        setField(term1245, term1245.getClass(), "date", term1246);
        setByteField(term1250, term1250.getClass(), "hour", (byte) 2);
        setByteField(term1250, term1250.getClass(), "minute", (byte) 59);
        setByteField(term1250, term1250.getClass(), "second", (byte) 30);
        setIntField(term1250, term1250.getClass(), "nano", 222274238);
        setField(term1245, term1245.getClass(), "time", term1250);
        setField(term1209, term1209.getClass(), "saleEndDate", term1245);
        setField(term1209, term1209.getClass(), "remarks", "uuaPigETmJ");
        term1267 = new Integer(972867650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1267;
        callMethod(klass, "setOrderId", argTypes, term1209, args);
    }

};


