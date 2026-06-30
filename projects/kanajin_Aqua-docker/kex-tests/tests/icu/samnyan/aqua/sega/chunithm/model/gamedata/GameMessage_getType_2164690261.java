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

public class GameMessage_getType_2164690261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13616;

    public GameMessage_getType_2164690261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13616 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term13631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13636 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13646 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13616, term13616.getClass(), "id", 1351900243);
        setIntField(term13616, term13616.getClass(), "type", -330897705);
        setField(term13616, term13616.getClass(), "message", "rwKoAngzCu");
        setIntField(term13632, term13632.getClass(), "year", 2019);
        setShortField(term13632, term13632.getClass(), "month", (short) 6);
        setShortField(term13632, term13632.getClass(), "day", (short) 12);
        setField(term13631, term13631.getClass(), "date", term13632);
        setByteField(term13636, term13636.getClass(), "hour", (byte) 5);
        setByteField(term13636, term13636.getClass(), "minute", (byte) 13);
        setByteField(term13636, term13636.getClass(), "second", (byte) 8);
        setIntField(term13636, term13636.getClass(), "nano", 838117658);
        setField(term13631, term13631.getClass(), "time", term13636);
        setField(term13616, term13616.getClass(), "startDate", term13631);
        setIntField(term13642, term13642.getClass(), "year", 2014);
        setShortField(term13642, term13642.getClass(), "month", (short) 8);
        setShortField(term13642, term13642.getClass(), "day", (short) 13);
        setField(term13641, term13641.getClass(), "date", term13642);
        setByteField(term13646, term13646.getClass(), "hour", (byte) 13);
        setByteField(term13646, term13646.getClass(), "minute", (byte) 15);
        setByteField(term13646, term13646.getClass(), "second", (byte) 51);
        setIntField(term13646, term13646.getClass(), "nano", 433726678);
        setField(term13641, term13641.getClass(), "time", term13646);
        setField(term13616, term13616.getClass(), "endDate", term13641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term13616, args);
    }

};


