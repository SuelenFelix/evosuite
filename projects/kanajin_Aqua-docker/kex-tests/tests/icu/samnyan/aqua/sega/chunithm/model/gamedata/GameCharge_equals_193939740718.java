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

public class GameCharge_equals_193939740718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1337;
     Object term1383;

    public GameCharge_equals_193939740718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1337 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge"));
        Object term1342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1343 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1347 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1352 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1353 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1357 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1363 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1364 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1368 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1378 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1337, term1337.getClass(), "id", -4920224193275732920L);
        setIntField(term1337, term1337.getClass(), "orderId", -615654495);
        setIntField(term1337, term1337.getClass(), "chargeId", -1476117762);
        setIntField(term1337, term1337.getClass(), "price", -341962980);
        setIntField(term1343, term1343.getClass(), "year", 2013);
        setShortField(term1343, term1343.getClass(), "month", (short) 7);
        setShortField(term1343, term1343.getClass(), "day", (short) 3);
        setField(term1342, term1342.getClass(), "date", term1343);
        setByteField(term1347, term1347.getClass(), "hour", (byte) 10);
        setByteField(term1347, term1347.getClass(), "minute", (byte) 59);
        setByteField(term1347, term1347.getClass(), "second", (byte) 22);
        setIntField(term1347, term1347.getClass(), "nano", 937921480);
        setField(term1342, term1342.getClass(), "time", term1347);
        setField(term1337, term1337.getClass(), "startDate", term1342);
        setIntField(term1353, term1353.getClass(), "year", 2012);
        setShortField(term1353, term1353.getClass(), "month", (short) 2);
        setShortField(term1353, term1353.getClass(), "day", (short) 29);
        setField(term1352, term1352.getClass(), "date", term1353);
        setByteField(term1357, term1357.getClass(), "hour", (byte) 14);
        setByteField(term1357, term1357.getClass(), "minute", (byte) 26);
        setByteField(term1357, term1357.getClass(), "second", (byte) 20);
        setIntField(term1357, term1357.getClass(), "nano", 780823452);
        setField(term1352, term1352.getClass(), "time", term1357);
        setField(term1337, term1337.getClass(), "endDate", term1352);
        setIntField(term1337, term1337.getClass(), "salePrice", 1532716628);
        setIntField(term1364, term1364.getClass(), "year", 2029);
        setShortField(term1364, term1364.getClass(), "month", (short) 7);
        setShortField(term1364, term1364.getClass(), "day", (short) 19);
        setField(term1363, term1363.getClass(), "date", term1364);
        setByteField(term1368, term1368.getClass(), "hour", (byte) 17);
        setByteField(term1368, term1368.getClass(), "minute", (byte) 37);
        setByteField(term1368, term1368.getClass(), "second", (byte) 21);
        setIntField(term1368, term1368.getClass(), "nano", 320093277);
        setField(term1363, term1363.getClass(), "time", term1368);
        setField(term1337, term1337.getClass(), "saleStartDate", term1363);
        setIntField(term1374, term1374.getClass(), "year", 2028);
        setShortField(term1374, term1374.getClass(), "month", (short) 1);
        setShortField(term1374, term1374.getClass(), "day", (short) 11);
        setField(term1373, term1373.getClass(), "date", term1374);
        setByteField(term1378, term1378.getClass(), "hour", (byte) 22);
        setByteField(term1378, term1378.getClass(), "minute", (byte) 3);
        setByteField(term1378, term1378.getClass(), "second", (byte) 39);
        setIntField(term1378, term1378.getClass(), "nano", 175567313);
        setField(term1373, term1373.getClass(), "time", term1378);
        setField(term1337, term1337.getClass(), "saleEndDate", term1373);
        term1383 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1383;
        callMethod(klass, "equals", argTypes, term1337, args);
    }

};


