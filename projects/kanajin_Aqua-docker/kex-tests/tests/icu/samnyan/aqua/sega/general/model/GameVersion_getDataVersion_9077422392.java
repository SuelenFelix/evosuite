package icu.samnyan.aqua.sega.general.model;

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
import static icu.samnyan.aqua.sega.general.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameVersion_getDataVersion_9077422392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585;

    public GameVersion_getDataVersion_9077422392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term585 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion"));
        Object term622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term627 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term585, term585.getClass(), "uuid", "hNxWaHcfhY");
        setField(term585, term585.getClass(), "romVersion", "RkybSrpybU");
        setField(term585, term585.getClass(), "dataVersion", "xOEqzGAmDU");
        setIntField(term623, term623.getClass(), "year", 2015);
        setShortField(term623, term623.getClass(), "month", (short) 9);
        setShortField(term623, term623.getClass(), "day", (short) 19);
        setField(term622, term622.getClass(), "date", term623);
        setByteField(term627, term627.getClass(), "hour", (byte) 9);
        setByteField(term627, term627.getClass(), "minute", (byte) 4);
        setByteField(term627, term627.getClass(), "second", (byte) 10);
        setIntField(term627, term627.getClass(), "nano", 401765865);
        setField(term622, term622.getClass(), "time", term627);
        setField(term585, term585.getClass(), "lastTime", term622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataVersion", argTypes, term585, args);
    }

};


