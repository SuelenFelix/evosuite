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

public class GameEvent_hashCode_57539113212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317;

    public GameEvent_hashCode_57539113212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent"));
        Object term320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term335 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term317, term317.getClass(), "id", 590364439);
        setIntField(term317, term317.getClass(), "type", 865208305);
        setIntField(term321, term321.getClass(), "year", 2028);
        setShortField(term321, term321.getClass(), "month", (short) 10);
        setShortField(term321, term321.getClass(), "day", (short) 1);
        setField(term320, term320.getClass(), "date", term321);
        setByteField(term325, term325.getClass(), "hour", (byte) 17);
        setByteField(term325, term325.getClass(), "minute", (byte) 29);
        setByteField(term325, term325.getClass(), "second", (byte) 30);
        setIntField(term325, term325.getClass(), "nano", 845472306);
        setField(term320, term320.getClass(), "time", term325);
        setField(term317, term317.getClass(), "startDate", term320);
        setIntField(term331, term331.getClass(), "year", 2027);
        setShortField(term331, term331.getClass(), "month", (short) 2);
        setShortField(term331, term331.getClass(), "day", (short) 19);
        setField(term330, term330.getClass(), "date", term331);
        setByteField(term335, term335.getClass(), "hour", (byte) 17);
        setByteField(term335, term335.getClass(), "minute", (byte) 37);
        setByteField(term335, term335.getClass(), "second", (byte) 27);
        setIntField(term335, term335.getClass(), "nano", 920380537);
        setField(term330, term330.getClass(), "time", term335);
        setField(term317, term317.getClass(), "endDate", term330);
        setBooleanField(term317, term317.getClass(), "enable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term317, args);
    }

};


