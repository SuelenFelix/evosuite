package com.loomcom.symon;

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
import static com.loomcom.symon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CpuState_getStatusFlag_16399993963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82692;

    public CpuState_getStatusFlag_16399993963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82692 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term82700 = (int[]) newIntArray(2);
        int[] term82703 = (int[]) newIntArray(2);
        setIntField(term82692, term82692.getClass(), "a", -991011239);
        setIntField(term82692, term82692.getClass(), "x", -1774267288);
        setIntField(term82692, term82692.getClass(), "y", -1394083316);
        setIntField(term82692, term82692.getClass(), "sp", 23814407);
        setIntField(term82692, term82692.getClass(), "pc", 1941438128);
        setIntField(term82692, term82692.getClass(), "ir", -418002301);
        setIntField(term82692, term82692.getClass(), "nextIr", 2067599442);
        setField(term82692, term82692.getClass(), "args", term82700);
        setField(term82692, term82692.getClass(), "nextArgs", term82703);
        setIntField(term82692, term82692.getClass(), "instSize", -335577660);
        setBooleanField(term82692, term82692.getClass(), "opTrap", false);
        setBooleanField(term82692, term82692.getClass(), "irqAsserted", false);
        setBooleanField(term82692, term82692.getClass(), "nmiAsserted", true);
        setIntField(term82692, term82692.getClass(), "lastPc", 1488144730);
        setBooleanField(term82692, term82692.getClass(), "carryFlag", true);
        setBooleanField(term82692, term82692.getClass(), "negativeFlag", true);
        setBooleanField(term82692, term82692.getClass(), "zeroFlag", false);
        setBooleanField(term82692, term82692.getClass(), "irqDisableFlag", true);
        setBooleanField(term82692, term82692.getClass(), "decimalModeFlag", true);
        setBooleanField(term82692, term82692.getClass(), "breakFlag", true);
        setBooleanField(term82692, term82692.getClass(), "overflowFlag", false);
        setLongField(term82692, term82692.getClass(), "stepCounter", -4663904610228258188L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.CpuState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatusFlag", argTypes, term82692, args);
    }

};


