package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class DivaModule_init_62436083818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2207678;
     Object term2207692;
     Object term2207694;
     Object term2207704;
     Object term2207714;

    public DivaModule_init_62436083818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2207678 = new Integer(528866618);
        term2207692 = new Integer(-537178838);
        term2207694 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2207695 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2207699 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2207695, term2207695.getClass(), "year", 2019);
        setShortField(term2207695, term2207695.getClass(), "month", (short) 5);
        setShortField(term2207695, term2207695.getClass(), "day", (short) 18);
        setField(term2207694, term2207694.getClass(), "date", term2207695);
        setByteField(term2207699, term2207699.getClass(), "hour", (byte) 4);
        setByteField(term2207699, term2207699.getClass(), "minute", (byte) 18);
        setByteField(term2207699, term2207699.getClass(), "second", (byte) 19);
        setIntField(term2207699, term2207699.getClass(), "nano", 835744735);
        setField(term2207694, term2207694.getClass(), "time", term2207699);
        term2207704 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2207705 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2207709 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2207705, term2207705.getClass(), "year", 2028);
        setShortField(term2207705, term2207705.getClass(), "month", (short) 6);
        setShortField(term2207705, term2207705.getClass(), "day", (short) 5);
        setField(term2207704, term2207704.getClass(), "date", term2207705);
        setByteField(term2207709, term2207709.getClass(), "hour", (byte) 0);
        setByteField(term2207709, term2207709.getClass(), "minute", (byte) 43);
        setByteField(term2207709, term2207709.getClass(), "second", (byte) 6);
        setIntField(term2207709, term2207709.getClass(), "nano", 349380197);
        setField(term2207704, term2207704.getClass(), "time", term2207709);
        term2207714 = new Integer(-1018142748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term2207678;
        args[1] = "ZXRylxSmfn";
        args[2] = term2207692;
        args[3] = term2207694;
        args[4] = term2207704;
        args[5] = term2207714;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


