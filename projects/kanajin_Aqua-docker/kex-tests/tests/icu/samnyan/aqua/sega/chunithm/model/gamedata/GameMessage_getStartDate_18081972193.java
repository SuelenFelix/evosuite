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

public class GameMessage_getStartDate_18081972193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13706;

    public GameMessage_getStartDate_18081972193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13706 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage"));
        Object term13721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13726 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13736 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term13706, term13706.getClass(), "id", -380787857);
        setIntField(term13706, term13706.getClass(), "type", 319853052);
        setField(term13706, term13706.getClass(), "message", "UDlkdccCRn");
        setIntField(term13722, term13722.getClass(), "year", 2020);
        setShortField(term13722, term13722.getClass(), "month", (short) 10);
        setShortField(term13722, term13722.getClass(), "day", (short) 8);
        setField(term13721, term13721.getClass(), "date", term13722);
        setByteField(term13726, term13726.getClass(), "hour", (byte) 15);
        setByteField(term13726, term13726.getClass(), "minute", (byte) 57);
        setByteField(term13726, term13726.getClass(), "second", (byte) 17);
        setIntField(term13726, term13726.getClass(), "nano", 288139529);
        setField(term13721, term13721.getClass(), "time", term13726);
        setField(term13706, term13706.getClass(), "startDate", term13721);
        setIntField(term13732, term13732.getClass(), "year", 2022);
        setShortField(term13732, term13732.getClass(), "month", (short) 6);
        setShortField(term13732, term13732.getClass(), "day", (short) 12);
        setField(term13731, term13731.getClass(), "date", term13732);
        setByteField(term13736, term13736.getClass(), "hour", (byte) 14);
        setByteField(term13736, term13736.getClass(), "minute", (byte) 3);
        setByteField(term13736, term13736.getClass(), "second", (byte) 7);
        setIntField(term13736, term13736.getClass(), "nano", 637592645);
        setField(term13731, term13731.getClass(), "time", term13736);
        setField(term13706, term13706.getClass(), "endDate", term13731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term13706, args);
    }

};


