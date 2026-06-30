package icu.samnyan.aqua.api.model.req.sega.diva;

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
import static icu.samnyan.aqua.api.model.req.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class PvListEntry_init_305746414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term695;
     Object term697;
     Object term699;
     Object term701;
     Object term722;

    public PvListEntry_init_305746414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term695 = new Integer(-817164822);
        term697 = new Integer(-1016503459);
        term699 = new Integer(-1968847291);
        term701 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term707 = newInstance(Class.forName("java.time.LocalTime"));
        Object term712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term717 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term703, term703.getClass(), "year", 2016);
        setShortField(term703, term703.getClass(), "month", (short) 2);
        setShortField(term703, term703.getClass(), "day", (short) 25);
        setField(term702, term702.getClass(), "date", term703);
        setByteField(term707, term707.getClass(), "hour", (byte) 8);
        setByteField(term707, term707.getClass(), "minute", (byte) 54);
        setByteField(term707, term707.getClass(), "second", (byte) 40);
        setIntField(term707, term707.getClass(), "nano", 124525896);
        setField(term702, term702.getClass(), "time", term707);
        setField(term701, term701.getClass(), "Start", term702);
        setIntField(term713, term713.getClass(), "year", 2029);
        setShortField(term713, term713.getClass(), "month", (short) 1);
        setShortField(term713, term713.getClass(), "day", (short) 10);
        setField(term712, term712.getClass(), "date", term713);
        setByteField(term717, term717.getClass(), "hour", (byte) 8);
        setByteField(term717, term717.getClass(), "minute", (byte) 46);
        setByteField(term717, term717.getClass(), "second", (byte) 35);
        setIntField(term717, term717.getClass(), "nano", 58807194);
        setField(term712, term712.getClass(), "time", term717);
        setField(term701, term701.getClass(), "End", term712);
        term722 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term723 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term724 = newInstance(Class.forName("java.time.LocalDate"));
        Object term728 = newInstance(Class.forName("java.time.LocalTime"));
        Object term733 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term734 = newInstance(Class.forName("java.time.LocalDate"));
        Object term738 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term724, term724.getClass(), "year", 2016);
        setShortField(term724, term724.getClass(), "month", (short) 10);
        setShortField(term724, term724.getClass(), "day", (short) 20);
        setField(term723, term723.getClass(), "date", term724);
        setByteField(term728, term728.getClass(), "hour", (byte) 18);
        setByteField(term728, term728.getClass(), "minute", (byte) 39);
        setByteField(term728, term728.getClass(), "second", (byte) 1);
        setIntField(term728, term728.getClass(), "nano", 196253988);
        setField(term723, term723.getClass(), "time", term728);
        setField(term722, term722.getClass(), "Start", term723);
        setIntField(term734, term734.getClass(), "year", 2019);
        setShortField(term734, term734.getClass(), "month", (short) 1);
        setShortField(term734, term734.getClass(), "day", (short) 6);
        setField(term733, term733.getClass(), "date", term734);
        setByteField(term738, term738.getClass(), "hour", (byte) 18);
        setByteField(term738, term738.getClass(), "minute", (byte) 8);
        setByteField(term738, term738.getClass(), "second", (byte) 46);
        setIntField(term738, term738.getClass(), "nano", 934136445);
        setField(term733, term733.getClass(), "time", term738);
        setField(term722, term722.getClass(), "End", term733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair");
        argTypes[4] = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair");
        Object[] args = new Object[5];
        args[0] = term695;
        args[1] = term697;
        args[2] = term699;
        args[3] = term701;
        args[4] = term722;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


