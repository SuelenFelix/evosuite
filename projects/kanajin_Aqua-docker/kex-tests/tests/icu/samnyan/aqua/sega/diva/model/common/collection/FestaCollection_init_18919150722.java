package icu.samnyan.aqua.sega.diva.model.common.collection;

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
import static icu.samnyan.aqua.sega.diva.model.common.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class FestaCollection_init_18919150722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1599;

    public FestaCollection_init_18919150722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1776 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.FestaKind");
        Field term1775 = ((Class) term1776).getDeclaredField((String) "PINK_FESTA");
        ((Field) term1775).setAccessible(true);
        Object enum4 = ((Field) term1775).get((Object) null);
        Class<? extends Object> term2058 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term2057 = ((Class) term2058).getDeclaredField((String) "UNDEFINED");
        ((Field) term2057).setAccessible(true);
        Object enum5 = ((Field) term2057).get((Object) null);
        Integer term1657 = new Integer(0);
        Integer term1659 = new Integer(1);
        Object term1602 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term1661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1666 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1676 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1677 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1602, term1602.getClass(), "id", -1);
        setBooleanField(term1602, term1602.getClass(), "enable", true);
        setField(term1602, term1602.getClass(), "name", "xxx");
        setField(term1602, term1602.getClass(), "kind", enum4);
        setField(term1602, term1602.getClass(), "difficulty", enum5);
        setField(term1602, term1602.getClass(), "pvList", "ALL");
        setField(term1602, term1602.getClass(), "attributes", "7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
        setField(term1602, term1602.getClass(), "addVP", term1657);
        setField(term1602, term1602.getClass(), "vpMultiplier", term1659);
        setIntField(term1662, term1662.getClass(), "year", 2005);
        setShortField(term1662, term1662.getClass(), "month", (short) 1);
        setShortField(term1662, term1662.getClass(), "day", (short) 1);
        setField(term1661, term1661.getClass(), "date", term1662);
        setByteField(term1666, term1666.getClass(), "hour", (byte) 0);
        setByteField(term1666, term1666.getClass(), "minute", (byte) 0);
        setByteField(term1666, term1666.getClass(), "second", (byte) 0);
        setIntField(term1666, term1666.getClass(), "nano", 0);
        setField(term1661, term1661.getClass(), "time", term1666);
        setField(term1602, term1602.getClass(), "start", term1661);
        setIntField(term1672, term1672.getClass(), "year", 2005);
        setShortField(term1672, term1672.getClass(), "month", (short) 1);
        setShortField(term1672, term1672.getClass(), "day", (short) 1);
        setField(term1671, term1671.getClass(), "date", term1672);
        setField(term1671, term1671.getClass(), "time", term1666);
        setField(term1602, term1602.getClass(), "end", term1671);
        setIntField(term1677, term1677.getClass(), "year", 2005);
        setShortField(term1677, term1677.getClass(), "month", (short) 1);
        setShortField(term1677, term1677.getClass(), "day", (short) 1);
        setField(term1676, term1676.getClass(), "date", term1677);
        setField(term1676, term1676.getClass(), "time", term1666);
        setField(term1602, term1602.getClass(), "createDate", term1676);
        Integer term1688 = new Integer(0);
        Integer term1690 = new Integer(1);
        Object term1682 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        Object term1692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1694 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term1682, term1682.getClass(), "id", -1);
        setBooleanField(term1682, term1682.getClass(), "enable", true);
        setField(term1682, term1682.getClass(), "name", "");
        setField(term1682, term1682.getClass(), "kind", enum4);
        setField(term1682, term1682.getClass(), "difficulty", enum5);
        setField(term1682, term1682.getClass(), "pvList", "");
        setField(term1682, term1682.getClass(), "attributes", "");
        setField(term1682, term1682.getClass(), "addVP", term1688);
        setField(term1682, term1682.getClass(), "vpMultiplier", term1690);
        setField(term1692, term1692.getClass(), "date", null);
        setField(term1692, term1692.getClass(), "time", term1666);
        setField(term1682, term1682.getClass(), "start", term1692);
        setField(term1693, term1693.getClass(), "date", null);
        setField(term1693, term1693.getClass(), "time", term1666);
        setField(term1682, term1682.getClass(), "end", term1693);
        setField(term1694, term1694.getClass(), "date", null);
        setField(term1694, term1694.getClass(), "time", term1666);
        setField(term1682, term1682.getClass(), "createDate", term1694);
        Integer term1699 = new Integer(0);
        Integer term1701 = new Integer(1);
        Object term1696 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        setIntField(term1696, term1696.getClass(), "id", -1);
        setBooleanField(term1696, term1696.getClass(), "enable", true);
        setField(term1696, term1696.getClass(), "name", null);
        setField(term1696, term1696.getClass(), "kind", enum4);
        setField(term1696, term1696.getClass(), "difficulty", enum5);
        setField(term1696, term1696.getClass(), "pvList", null);
        setField(term1696, term1696.getClass(), "attributes", null);
        setField(term1696, term1696.getClass(), "addVP", term1699);
        setField(term1696, term1696.getClass(), "vpMultiplier", term1701);
        setField(term1696, term1696.getClass(), "start", null);
        setField(term1696, term1696.getClass(), "end", null);
        setField(term1696, term1696.getClass(), "createDate", null);
        term1599 = new LinkedList();
        ((LinkedList) term1599).add(term1602);
        ((LinkedList) term1599).add(term1682);
        ((LinkedList) term1599).add(term1696);
        ((LinkedList) term1599).add((Object)null);
        ((LinkedList) term1599).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.FestaCollection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1599;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


