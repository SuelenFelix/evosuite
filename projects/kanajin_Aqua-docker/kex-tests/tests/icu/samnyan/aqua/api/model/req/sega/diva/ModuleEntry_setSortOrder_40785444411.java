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
import java.lang.Object;
import java.lang.Integer;

public class ModuleEntry_setSortOrder_40785444411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4228522;
     Object term4228558;

    public ModuleEntry_setSortOrder_40785444411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4228522 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry"));
        Object term4228537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228542 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4228547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4228548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4228552 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4228522, term4228522.getClass(), "ID", -1283328658);
        setField(term4228522, term4228522.getClass(), "Name", "SVWqwadpaO");
        setIntField(term4228522, term4228522.getClass(), "Price", -1103451774);
        setIntField(term4228538, term4228538.getClass(), "year", 2010);
        setShortField(term4228538, term4228538.getClass(), "month", (short) 9);
        setShortField(term4228538, term4228538.getClass(), "day", (short) 26);
        setField(term4228537, term4228537.getClass(), "date", term4228538);
        setByteField(term4228542, term4228542.getClass(), "hour", (byte) 4);
        setByteField(term4228542, term4228542.getClass(), "minute", (byte) 24);
        setByteField(term4228542, term4228542.getClass(), "second", (byte) 41);
        setIntField(term4228542, term4228542.getClass(), "nano", 214581453);
        setField(term4228537, term4228537.getClass(), "time", term4228542);
        setField(term4228522, term4228522.getClass(), "ReleaseDate", term4228537);
        setIntField(term4228548, term4228548.getClass(), "year", 2011);
        setShortField(term4228548, term4228548.getClass(), "month", (short) 6);
        setShortField(term4228548, term4228548.getClass(), "day", (short) 20);
        setField(term4228547, term4228547.getClass(), "date", term4228548);
        setByteField(term4228552, term4228552.getClass(), "hour", (byte) 23);
        setByteField(term4228552, term4228552.getClass(), "minute", (byte) 11);
        setByteField(term4228552, term4228552.getClass(), "second", (byte) 30);
        setIntField(term4228552, term4228552.getClass(), "nano", 696906740);
        setField(term4228547, term4228547.getClass(), "time", term4228552);
        setField(term4228522, term4228522.getClass(), "EndDate", term4228547);
        setIntField(term4228522, term4228522.getClass(), "SortOrder", -284674791);
        term4228558 = new Integer(1174339143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.ModuleEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4228558;
        callMethod(klass, "setSortOrder", argTypes, term4228522, args);
    }

};


