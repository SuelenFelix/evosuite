package com.example.backend.entity;

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
import static com.example.backend.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class PaoCard_getCard_20707780132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1589;

    public PaoCard_getCard_20707780132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1590 = new Long(3892018155439224435L);
        Long term1593 = new Long(5953383087795962419L);
        Class<? extends Object> term1682 = Class.forName((String) "com.example.backend.entity.Rank");
        Field term1681 = ((Class) term1682).getDeclaredField((String) "FIVE");
        ((Field) term1681).setAccessible(true);
        Object enum6 = ((Field) term1681).get((Object) null);
        Class<? extends Object> term1856 = Class.forName((String) "com.example.backend.entity.Suit");
        Field term1855 = ((Class) term1856).getDeclaredField((String) "CLUBS");
        ((Field) term1855).setAccessible(true);
        Object enum7 = ((Field) term1855).get((Object) null);
        Long term1615 = new Long(7994303628307559416L);
        Object term1614 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term1614, term1614.getClass(), "id", term1615);
        setField(term1614, term1614.getClass(), "card", null);
        setField(term1614, term1614.getClass(), "pao", null);
        Long term1618 = new Long(-1610676979013636850L);
        Object term1617 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term1617, term1617.getClass(), "id", term1618);
        setField(term1617, term1617.getClass(), "card", null);
        setField(term1617, term1617.getClass(), "pao", null);
        Long term1621 = new Long(463622836963501975L);
        Object term1620 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term1620, term1620.getClass(), "id", term1621);
        setField(term1620, term1620.getClass(), "card", null);
        setField(term1620, term1620.getClass(), "pao", null);
        Object term1623 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term1623, term1623.getClass(), "id", null);
        setField(term1623, term1623.getClass(), "card", null);
        setField(term1623, term1623.getClass(), "pao", null);
        Object term1624 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term1624, term1624.getClass(), "id", null);
        setField(term1624, term1624.getClass(), "card", null);
        setField(term1624, term1624.getClass(), "pao", null);
        Long term1626 = new Long(-8658027316505137504L);
        Object term1625 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        setField(term1625, term1625.getClass(), "id", term1626);
        setField(term1625, term1625.getClass(), "card", null);
        setField(term1625, term1625.getClass(), "pao", null);
        ArrayList term1612 = new ArrayList();
        ((ArrayList) term1612).add(term1614);
        ((ArrayList) term1612).add(term1617);
        ((ArrayList) term1612).add(term1620);
        ((ArrayList) term1612).add(term1623);
        ((ArrayList) term1612).add(term1624);
        ((ArrayList) term1612).add(term1624);
        ((ArrayList) term1612).add(term1625);
        ((ArrayList) term1612).add(term1620);
        Long term1631 = new Long(6682528376118987775L);
        term1589 = newInstance(Class.forName("com.example.backend.entity.PaoCard"));
        Object term1592 = newInstance(Class.forName("com.example.backend.entity.Card"));
        Object term1630 = newInstance(Class.forName("com.example.backend.entity.Pao"));
        setField(term1589, term1589.getClass(), "id", term1590);
        setField(term1592, term1592.getClass(), "id", term1593);
        setField(term1592, term1592.getClass(), "rank", enum6);
        setField(term1592, term1592.getClass(), "suit", enum7);
        setField(term1592, term1592.getClass(), "paoCards", term1612);
        setField(term1589, term1589.getClass(), "card", term1592);
        setField(term1630, term1630.getClass(), "id", term1631);
        setField(term1630, term1630.getClass(), "imageUrl", "idgaQsnJpQ");
        setField(term1630, term1630.getClass(), "person", "VgZnGoIFwQ");
        setField(term1630, term1630.getClass(), "action", "jUbSRrkrYZ");
        setField(term1630, term1630.getClass(), "object", "bWWfajKbEX");
        setField(term1630, term1630.getClass(), "paoCard", term1620);
        setField(term1589, term1589.getClass(), "pao", term1630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.PaoCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCard", argTypes, term1589, args);
    }

};


