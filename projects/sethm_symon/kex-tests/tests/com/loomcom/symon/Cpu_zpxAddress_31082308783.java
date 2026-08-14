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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class Cpu_zpxAddress_31082308783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204161;
     Object term204255;

    public Cpu_zpxAddress_31082308783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term204258 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term204257 = ((Class) term204258).getDeclaredField((String) "NMOS_6502");
        ((Field) term204257).setAccessible(true);
        Object enum263 = ((Field) term204257).get((Object) null);
        HashMap term204187 = new HashMap();
        HashMap term204221 = new HashMap();
        term204161 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term204176 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term204179 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term204181 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term204184 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term204192 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term204193 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term204201 = (int[]) newIntArray(2);
        int[] term204204 = (int[]) newIntArray(2);
        Object[] term204226 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term204227 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term204235 = (int[]) newIntArray(2);
        int[] term204238 = (int[]) newIntArray(2);
        setLongField(term204161, term204161.getClass(), "clockPeriodInNs", 1000L);
        setField(term204161, term204161.getClass(), "behavior", enum263);
        setIntField(term204176, term204176.getClass(), "startAddress", 961476617);
        setIntField(term204176, term204176.getClass(), "endAddress", -1978217643);
        setLongField(term204179, term204179.getClass(), "clockPeriodInNs", 1000L);
        setField(term204179, term204179.getClass(), "behavior", enum263);
        setIntField(term204181, term204181.getClass(), "startAddress", 53489031);
        setIntField(term204181, term204181.getClass(), "endAddress", -1349596098);
        setLongField(term204184, term204184.getClass(), "clockPeriodInNs", 1000L);
        setField(term204184, term204184.getClass(), "behavior", enum263);
        setField(term204184, term204184.getClass(), "bus", null);
        setField(term204184, term204184.getClass(), "state", null);
        setLongField(term204184, term204184.getClass(), "opBeginTime", 4600612212546071466L);
        setField(term204181, term204181.getClass(), "cpu", term204184);
        setField(term204181, term204181.getClass(), "deviceMap", term204187);
        setField(term204181, term204181.getClass(), "deviceAddressArray", term204192);
        setField(term204179, term204179.getClass(), "bus", term204181);
        setIntField(term204193, term204193.getClass(), "a", 0);
        setIntField(term204193, term204193.getClass(), "x", 0);
        setIntField(term204193, term204193.getClass(), "y", 0);
        setIntField(term204193, term204193.getClass(), "sp", 0);
        setIntField(term204193, term204193.getClass(), "pc", 0);
        setIntField(term204193, term204193.getClass(), "ir", 0);
        setIntField(term204193, term204193.getClass(), "nextIr", 0);
        setField(term204193, term204193.getClass(), "args", term204201);
        setField(term204193, term204193.getClass(), "nextArgs", term204204);
        setIntField(term204193, term204193.getClass(), "instSize", 0);
        setBooleanField(term204193, term204193.getClass(), "opTrap", false);
        setBooleanField(term204193, term204193.getClass(), "irqAsserted", false);
        setBooleanField(term204193, term204193.getClass(), "nmiAsserted", false);
        setIntField(term204193, term204193.getClass(), "lastPc", 0);
        setBooleanField(term204193, term204193.getClass(), "carryFlag", false);
        setBooleanField(term204193, term204193.getClass(), "negativeFlag", false);
        setBooleanField(term204193, term204193.getClass(), "zeroFlag", false);
        setBooleanField(term204193, term204193.getClass(), "irqDisableFlag", false);
        setBooleanField(term204193, term204193.getClass(), "decimalModeFlag", false);
        setBooleanField(term204193, term204193.getClass(), "breakFlag", false);
        setBooleanField(term204193, term204193.getClass(), "overflowFlag", false);
        setLongField(term204193, term204193.getClass(), "stepCounter", 0L);
        setField(term204179, term204179.getClass(), "state", term204193);
        setLongField(term204179, term204179.getClass(), "opBeginTime", 736282298030442495L);
        setField(term204176, term204176.getClass(), "cpu", term204179);
        setField(term204176, term204176.getClass(), "deviceMap", term204221);
        setField(term204176, term204176.getClass(), "deviceAddressArray", term204226);
        setField(term204161, term204161.getClass(), "bus", term204176);
        setIntField(term204227, term204227.getClass(), "a", 0);
        setIntField(term204227, term204227.getClass(), "x", 0);
        setIntField(term204227, term204227.getClass(), "y", 0);
        setIntField(term204227, term204227.getClass(), "sp", 0);
        setIntField(term204227, term204227.getClass(), "pc", 0);
        setIntField(term204227, term204227.getClass(), "ir", 0);
        setIntField(term204227, term204227.getClass(), "nextIr", 0);
        setField(term204227, term204227.getClass(), "args", term204235);
        setField(term204227, term204227.getClass(), "nextArgs", term204238);
        setIntField(term204227, term204227.getClass(), "instSize", 0);
        setBooleanField(term204227, term204227.getClass(), "opTrap", false);
        setBooleanField(term204227, term204227.getClass(), "irqAsserted", false);
        setBooleanField(term204227, term204227.getClass(), "nmiAsserted", false);
        setIntField(term204227, term204227.getClass(), "lastPc", 0);
        setBooleanField(term204227, term204227.getClass(), "carryFlag", false);
        setBooleanField(term204227, term204227.getClass(), "negativeFlag", false);
        setBooleanField(term204227, term204227.getClass(), "zeroFlag", false);
        setBooleanField(term204227, term204227.getClass(), "irqDisableFlag", false);
        setBooleanField(term204227, term204227.getClass(), "decimalModeFlag", false);
        setBooleanField(term204227, term204227.getClass(), "breakFlag", false);
        setBooleanField(term204227, term204227.getClass(), "overflowFlag", false);
        setLongField(term204227, term204227.getClass(), "stepCounter", 0L);
        setField(term204161, term204161.getClass(), "state", term204227);
        setLongField(term204161, term204161.getClass(), "opBeginTime", -8385042448755891761L);
        term204255 = new Integer(-29580694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term204255;
        callMethod(klass, "zpxAddress", argTypes, term204161, args);
    }

};


