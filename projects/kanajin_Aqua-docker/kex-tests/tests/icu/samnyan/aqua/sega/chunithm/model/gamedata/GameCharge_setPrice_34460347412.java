package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class GameCharge_setPrice_34460347412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1017;
     Object term1063;

    public GameCharge_setPrice_34460347412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1017 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term1022 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1023 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1027 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1037 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1043 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1044 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1048 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1053 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1054 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1058 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1017, term1017.getClass(), "id", 2535595959091595249L);
        setIntField(term1017, term1017.getClass(), "orderId", -481533957);
        setIntField(term1017, term1017.getClass(), "chargeId", 1240914516);
        setIntField(term1017, term1017.getClass(), "price", -1465035361);
        setIntField(term1023, term1023.getClass(), "year", 2011);
        setShortField(term1023, term1023.getClass(), "month", (short) 4);
        setShortField(term1023, term1023.getClass(), "day", (short) 19);
        setField(term1022, term1022.getClass(), "date", term1023);
        setByteField(term1027, term1027.getClass(), "hour", (byte) 12);
        setByteField(term1027, term1027.getClass(), "minute", (byte) 0);
        setByteField(term1027, term1027.getClass(), "second", (byte) 14);
        setIntField(term1027, term1027.getClass(), "nano", 849079063);
        setField(term1022, term1022.getClass(), "time", term1027);
        setField(term1017, term1017.getClass(), "startDate", term1022);
        setIntField(term1033, term1033.getClass(), "year", 2014);
        setShortField(term1033, term1033.getClass(), "month", (short) 8);
        setShortField(term1033, term1033.getClass(), "day", (short) 17);
        setField(term1032, term1032.getClass(), "date", term1033);
        setByteField(term1037, term1037.getClass(), "hour", (byte) 19);
        setByteField(term1037, term1037.getClass(), "minute", (byte) 32);
        setByteField(term1037, term1037.getClass(), "second", (byte) 5);
        setIntField(term1037, term1037.getClass(), "nano", 604713831);
        setField(term1032, term1032.getClass(), "time", term1037);
        setField(term1017, term1017.getClass(), "endDate", term1032);
        setIntField(term1017, term1017.getClass(), "salePrice", 1090617576);
        setIntField(term1044, term1044.getClass(), "year", 2021);
        setShortField(term1044, term1044.getClass(), "month", (short) 3);
        setShortField(term1044, term1044.getClass(), "day", (short) 13);
        setField(term1043, term1043.getClass(), "date", term1044);
        setByteField(term1048, term1048.getClass(), "hour", (byte) 6);
        setByteField(term1048, term1048.getClass(), "minute", (byte) 25);
        setByteField(term1048, term1048.getClass(), "second", (byte) 42);
        setIntField(term1048, term1048.getClass(), "nano", 282924199);
        setField(term1043, term1043.getClass(), "time", term1048);
        setField(term1017, term1017.getClass(), "saleStartDate", term1043);
        setIntField(term1054, term1054.getClass(), "year", 2020);
        setShortField(term1054, term1054.getClass(), "month", (short) 10);
        setShortField(term1054, term1054.getClass(), "day", (short) 25);
        setField(term1053, term1053.getClass(), "date", term1054);
        setByteField(term1058, term1058.getClass(), "hour", (byte) 18);
        setByteField(term1058, term1058.getClass(), "minute", (byte) 22);
        setByteField(term1058, term1058.getClass(), "second", (byte) 30);
        setIntField(term1058, term1058.getClass(), "nano", 948592965);
        setField(term1053, term1053.getClass(), "time", term1058);
        setField(term1017, term1017.getClass(), "saleEndDate", term1053);
        term1063 = new Integer(-1547384488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1063;
        callMethod(klass, "setPrice", argTypes, term1017, args);
    }

};


