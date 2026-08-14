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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Bus_getDevices_137512286516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40896;

    public Bus_getDevices_137512286516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40985 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term40984 = ((Class) term40985).getDeclaredField((String) "NMOS_6502");
        ((Field) term40984).setAccessible(true);
        Object enum36 = ((Field) term40984).get((Object) null);
        HashMap term40944 = new HashMap();
        HashMap term40978 = new HashMap();
        term40896 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term40899 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term40914 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term40917 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term40919 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term40922 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term40949 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term40950 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term40958 = (int[]) newIntArray(2);
        int[] term40961 = (int[]) newIntArray(2);
        Object[] term40983 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        setIntField(term40896, term40896.getClass(), "startAddress", -1049546692);
        setIntField(term40896, term40896.getClass(), "endAddress", 1397781598);
        setLongField(term40899, term40899.getClass(), "clockPeriodInNs", 1000L);
        setField(term40899, term40899.getClass(), "behavior", enum36);
        setIntField(term40914, term40914.getClass(), "startAddress", -44720365);
        setIntField(term40914, term40914.getClass(), "endAddress", 1963632911);
        setLongField(term40917, term40917.getClass(), "clockPeriodInNs", 1000L);
        setField(term40917, term40917.getClass(), "behavior", enum36);
        setIntField(term40919, term40919.getClass(), "startAddress", -1100497683);
        setIntField(term40919, term40919.getClass(), "endAddress", 155423433);
        setField(term40919, term40919.getClass(), "cpu", null);
        setField(term40919, term40919.getClass(), "deviceMap", null);
        setField(term40919, term40919.getClass(), "deviceAddressArray", null);
        setField(term40917, term40917.getClass(), "bus", term40919);
        setIntField(term40922, term40922.getClass(), "a", 0);
        setIntField(term40922, term40922.getClass(), "x", 0);
        setIntField(term40922, term40922.getClass(), "y", 0);
        setIntField(term40922, term40922.getClass(), "sp", 0);
        setIntField(term40922, term40922.getClass(), "pc", 0);
        setIntField(term40922, term40922.getClass(), "ir", 0);
        setIntField(term40922, term40922.getClass(), "nextIr", 0);
        setField(term40922, term40922.getClass(), "args", null);
        setField(term40922, term40922.getClass(), "nextArgs", null);
        setIntField(term40922, term40922.getClass(), "instSize", 0);
        setBooleanField(term40922, term40922.getClass(), "opTrap", false);
        setBooleanField(term40922, term40922.getClass(), "irqAsserted", false);
        setBooleanField(term40922, term40922.getClass(), "nmiAsserted", false);
        setIntField(term40922, term40922.getClass(), "lastPc", 0);
        setBooleanField(term40922, term40922.getClass(), "carryFlag", false);
        setBooleanField(term40922, term40922.getClass(), "negativeFlag", false);
        setBooleanField(term40922, term40922.getClass(), "zeroFlag", false);
        setBooleanField(term40922, term40922.getClass(), "irqDisableFlag", false);
        setBooleanField(term40922, term40922.getClass(), "decimalModeFlag", false);
        setBooleanField(term40922, term40922.getClass(), "breakFlag", false);
        setBooleanField(term40922, term40922.getClass(), "overflowFlag", false);
        setLongField(term40922, term40922.getClass(), "stepCounter", 0L);
        setField(term40917, term40917.getClass(), "state", term40922);
        setLongField(term40917, term40917.getClass(), "opBeginTime", -4867941246533901410L);
        setField(term40914, term40914.getClass(), "cpu", term40917);
        setField(term40914, term40914.getClass(), "deviceMap", term40944);
        setField(term40914, term40914.getClass(), "deviceAddressArray", term40949);
        setField(term40899, term40899.getClass(), "bus", term40914);
        setIntField(term40950, term40950.getClass(), "a", 0);
        setIntField(term40950, term40950.getClass(), "x", 0);
        setIntField(term40950, term40950.getClass(), "y", 0);
        setIntField(term40950, term40950.getClass(), "sp", 0);
        setIntField(term40950, term40950.getClass(), "pc", 0);
        setIntField(term40950, term40950.getClass(), "ir", 0);
        setIntField(term40950, term40950.getClass(), "nextIr", 0);
        setField(term40950, term40950.getClass(), "args", term40958);
        setField(term40950, term40950.getClass(), "nextArgs", term40961);
        setIntField(term40950, term40950.getClass(), "instSize", 0);
        setBooleanField(term40950, term40950.getClass(), "opTrap", false);
        setBooleanField(term40950, term40950.getClass(), "irqAsserted", false);
        setBooleanField(term40950, term40950.getClass(), "nmiAsserted", false);
        setIntField(term40950, term40950.getClass(), "lastPc", 0);
        setBooleanField(term40950, term40950.getClass(), "carryFlag", false);
        setBooleanField(term40950, term40950.getClass(), "negativeFlag", false);
        setBooleanField(term40950, term40950.getClass(), "zeroFlag", false);
        setBooleanField(term40950, term40950.getClass(), "irqDisableFlag", false);
        setBooleanField(term40950, term40950.getClass(), "decimalModeFlag", false);
        setBooleanField(term40950, term40950.getClass(), "breakFlag", false);
        setBooleanField(term40950, term40950.getClass(), "overflowFlag", false);
        setLongField(term40950, term40950.getClass(), "stepCounter", 0L);
        setField(term40899, term40899.getClass(), "state", term40950);
        setLongField(term40899, term40899.getClass(), "opBeginTime", 1044883697493326351L);
        setField(term40896, term40896.getClass(), "cpu", term40899);
        setField(term40896, term40896.getClass(), "deviceMap", term40978);
        setField(term40896, term40896.getClass(), "deviceAddressArray", term40983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDevices", argTypes, term40896, args);
    }

};


