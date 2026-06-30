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

public class GameEvent_getId_19760608160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GameEvent_getId_19760608160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameEvent"));
        Object term4 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1, term1.getClass(), "id", 568599855);
        setIntField(term1, term1.getClass(), "type", 1162663216);
        setIntField(term5, term5.getClass(), "year", 2012);
        setShortField(term5, term5.getClass(), "month", (short) 8);
        setShortField(term5, term5.getClass(), "day", (short) 25);
        setField(term4, term4.getClass(), "date", term5);
        setByteField(term9, term9.getClass(), "hour", (byte) 5);
        setByteField(term9, term9.getClass(), "minute", (byte) 20);
        setByteField(term9, term9.getClass(), "second", (byte) 50);
        setIntField(term9, term9.getClass(), "nano", 345595912);
        setField(term4, term4.getClass(), "time", term9);
        setField(term1, term1.getClass(), "startDate", term4);
        setIntField(term15, term15.getClass(), "year", 2021);
        setShortField(term15, term15.getClass(), "month", (short) 1);
        setShortField(term15, term15.getClass(), "day", (short) 18);
        setField(term14, term14.getClass(), "date", term15);
        setByteField(term19, term19.getClass(), "hour", (byte) 13);
        setByteField(term19, term19.getClass(), "minute", (byte) 38);
        setByteField(term19, term19.getClass(), "second", (byte) 26);
        setIntField(term19, term19.getClass(), "nano", 544608644);
        setField(term14, term14.getClass(), "time", term19);
        setField(term1, term1.getClass(), "endDate", term14);
        setBooleanField(term1, term1.getClass(), "enable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


