package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserBO_canEqual_81796580920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27612;
     Object term27697;

    public UserBO_canEqual_81796580920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27613 = new Long(-4029227951294167228L);
        Long term27663 = new Long(5160033404788124731L);
        term27612 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term27677 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27678 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27682 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27692 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27612, term27612.getClass(), "id", term27613);
        setField(term27612, term27612.getClass(), "username", "OeQLvhVERT");
        setField(term27612, term27612.getClass(), "password", "IlvgFINwIa");
        setField(term27612, term27612.getClass(), "mobile", "GEJABPlHSI");
        setField(term27612, term27612.getClass(), "email", "aQFUvuaYxd");
        setField(term27612, term27612.getClass(), "avatarId", term27663);
        setField(term27612, term27612.getClass(), "intro", "zNFLXMifnS");
        setIntField(term27678, term27678.getClass(), "year", 2015);
        setShortField(term27678, term27678.getClass(), "month", (short) 5);
        setShortField(term27678, term27678.getClass(), "day", (short) 14);
        setField(term27677, term27677.getClass(), "date", term27678);
        setByteField(term27682, term27682.getClass(), "hour", (byte) 13);
        setByteField(term27682, term27682.getClass(), "minute", (byte) 25);
        setByteField(term27682, term27682.getClass(), "second", (byte) 10);
        setIntField(term27682, term27682.getClass(), "nano", 246578829);
        setField(term27677, term27677.getClass(), "time", term27682);
        setField(term27612, term27612.getClass(), "createdAt", term27677);
        setIntField(term27688, term27688.getClass(), "year", 2028);
        setShortField(term27688, term27688.getClass(), "month", (short) 5);
        setShortField(term27688, term27688.getClass(), "day", (short) 23);
        setField(term27687, term27687.getClass(), "date", term27688);
        setByteField(term27692, term27692.getClass(), "hour", (byte) 6);
        setByteField(term27692, term27692.getClass(), "minute", (byte) 0);
        setByteField(term27692, term27692.getClass(), "second", (byte) 51);
        setIntField(term27692, term27692.getClass(), "nano", 258967293);
        setField(term27687, term27687.getClass(), "time", term27692);
        setField(term27612, term27612.getClass(), "updatedAt", term27687);
        term27697 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27697;
        callMethod(klass, "canEqual", argTypes, term27612, args);
    }

};


