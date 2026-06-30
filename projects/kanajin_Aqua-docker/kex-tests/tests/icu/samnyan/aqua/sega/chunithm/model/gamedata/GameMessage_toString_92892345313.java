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

public class GameMessage_toString_92892345313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14204;

    public GameMessage_toString_92892345313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14204 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term14219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14224 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14229 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14230 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14234 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term14204, term14204.getClass(), "id", -695279311);
        setIntField(term14204, term14204.getClass(), "type", 114279242);
        setField(term14204, term14204.getClass(), "message", "VSaNnhMpRc");
        setIntField(term14220, term14220.getClass(), "year", 2020);
        setShortField(term14220, term14220.getClass(), "month", (short) 5);
        setShortField(term14220, term14220.getClass(), "day", (short) 12);
        setField(term14219, term14219.getClass(), "date", term14220);
        setByteField(term14224, term14224.getClass(), "hour", (byte) 22);
        setByteField(term14224, term14224.getClass(), "minute", (byte) 7);
        setByteField(term14224, term14224.getClass(), "second", (byte) 49);
        setIntField(term14224, term14224.getClass(), "nano", 677355362);
        setField(term14219, term14219.getClass(), "time", term14224);
        setField(term14204, term14204.getClass(), "startDate", term14219);
        setIntField(term14230, term14230.getClass(), "year", 2010);
        setShortField(term14230, term14230.getClass(), "month", (short) 11);
        setShortField(term14230, term14230.getClass(), "day", (short) 1);
        setField(term14229, term14229.getClass(), "date", term14230);
        setByteField(term14234, term14234.getClass(), "hour", (byte) 5);
        setByteField(term14234, term14234.getClass(), "minute", (byte) 32);
        setByteField(term14234, term14234.getClass(), "second", (byte) 8);
        setIntField(term14234, term14234.getClass(), "nano", 918832231);
        setField(term14229, term14229.getClass(), "time", term14234);
        setField(term14204, term14204.getClass(), "endDate", term14229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term14204, args);
    }

};


