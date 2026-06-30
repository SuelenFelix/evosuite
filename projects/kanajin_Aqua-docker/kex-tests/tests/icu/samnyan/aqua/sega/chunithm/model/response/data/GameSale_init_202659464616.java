package icu.samnyan.aqua.sega.chunithm.model.response.data;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class GameSale_init_202659464616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431;
     Object term433;
     Object term435;
     Object term437;
     Object term439;
     Object term449;

    public GameSale_init_202659464616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431 = new Integer(-112921587);
        term433 = new Integer(933028652);
        term435 = new Integer(287287233);
        term437 = new Integer(962840079);
        term439 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term440 = newInstance(Class.forName("java.time.LocalDate"));
        Object term444 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term440, term440.getClass(), "year", 2010);
        setShortField(term440, term440.getClass(), "month", (short) 5);
        setShortField(term440, term440.getClass(), "day", (short) 2);
        setField(term439, term439.getClass(), "date", term440);
        setByteField(term444, term444.getClass(), "hour", (byte) 2);
        setByteField(term444, term444.getClass(), "minute", (byte) 22);
        setByteField(term444, term444.getClass(), "second", (byte) 33);
        setIntField(term444, term444.getClass(), "nano", 530835039);
        setField(term439, term439.getClass(), "time", term444);
        term449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term454 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term450, term450.getClass(), "year", 2024);
        setShortField(term450, term450.getClass(), "month", (short) 4);
        setShortField(term450, term450.getClass(), "day", (short) 24);
        setField(term449, term449.getClass(), "date", term450);
        setByteField(term454, term454.getClass(), "hour", (byte) 7);
        setByteField(term454, term454.getClass(), "minute", (byte) 2);
        setByteField(term454, term454.getClass(), "second", (byte) 51);
        setIntField(term454, term454.getClass(), "nano", 635502964);
        setField(term449, term449.getClass(), "time", term454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[6];
        args[0] = term431;
        args[1] = term433;
        args[2] = term435;
        args[3] = term437;
        args[4] = term439;
        args[5] = term449;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


