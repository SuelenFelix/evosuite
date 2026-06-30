package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PreStartResponse_init_792820621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum578;
     Object term246312;
     Object term246314;
     Object enum579;
     Object term246345;
     Object term246347;
     Object term246361;
     Object term246363;
     Object term246377;
     Object term246387;
     Object term246389;
     Object term246391;
     Object term246393;
     Object term246395;
     Object term246397;
     Object enum580;

    public PreStartResponse_init_792820621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term246439 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term246438 = ((Class) term246439).getDeclaredField((String) "CARD_TOO_NEW");
        ((Field) term246438).setAccessible(true);
        enum578 = ((Field) term246438).get((Object) null);
        term246312 = new Integer(568599855);
        term246314 = new Integer(1162663216);
        Class<? extends Object> term246762 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term246761 = ((Class) term246762).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term246761).setAccessible(true);
        enum579 = ((Field) term246761).get((Object) null);
        term246345 = new Integer(1484323161);
        term246347 = new Integer(391863371);
        term246361 = new Integer(-1922583790);
        term246363 = new Integer(-616727354);
        term246377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term246378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term246382 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term246378, term246378.getClass(), "year", 2022);
        setShortField(term246378, term246378.getClass(), "month", (short) 11);
        setShortField(term246378, term246378.getClass(), "day", (short) 5);
        setField(term246377, term246377.getClass(), "date", term246378);
        setByteField(term246382, term246382.getClass(), "hour", (byte) 0);
        setByteField(term246382, term246382.getClass(), "minute", (byte) 51);
        setByteField(term246382, term246382.getClass(), "second", (byte) 23);
        setIntField(term246382, term246382.getClass(), "nano", 1140962);
        setField(term246377, term246377.getClass(), "time", term246382);
        term246387 = new Integer(-1955890973);
        term246389 = new Integer(-2038273078);
        term246391 = new Integer(1227103734);
        term246393 = new Integer(-1339778481);
        term246395 = new Integer(1725571209);
        term246397 = new Integer(-522618178);
        Class<? extends Object> term247104 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term247103 = ((Class) term247104).getDeclaredField((String) "MISS");
        ((Field) term247103).setAccessible(true);
        enum580 = ((Field) term247103).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[22];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        argTypes[4] = Class.forName("java.lang.Integer");
        argTypes[5] = Class.forName("java.lang.Integer");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.SortMode");
        argTypes[8] = Class.forName("java.lang.Integer");
        argTypes[9] = Class.forName("java.lang.Integer");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.Integer");
        argTypes[12] = Class.forName("java.lang.Integer");
        argTypes[13] = Class.forName("java.lang.String");
        argTypes[14] = Class.forName("java.time.LocalDateTime");
        argTypes[15] = Class.forName("java.lang.Integer");
        argTypes[16] = Class.forName("java.lang.Integer");
        argTypes[17] = Class.forName("java.lang.Integer");
        argTypes[18] = Class.forName("java.lang.Integer");
        argTypes[19] = Class.forName("java.lang.Integer");
        argTypes[20] = Class.forName("java.lang.Integer");
        argTypes[21] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Object[] args = new Object[22];
        args[0] = "FYBnWmfXch";
        args[1] = "ZCKJKntKil";
        args[2] = "fyrqWlhCEt";
        args[3] = enum578;
        args[4] = term246312;
        args[5] = term246314;
        args[6] = "tFABhePKqp";
        args[7] = enum579;
        args[8] = term246345;
        args[9] = term246347;
        args[10] = "FtjQbVqqqx";
        args[11] = term246361;
        args[12] = term246363;
        args[13] = "FMhmrgLOkN";
        args[14] = term246377;
        args[15] = term246387;
        args[16] = term246389;
        args[17] = term246391;
        args[18] = term246393;
        args[19] = term246395;
        args[20] = term246397;
        args[21] = enum580;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


