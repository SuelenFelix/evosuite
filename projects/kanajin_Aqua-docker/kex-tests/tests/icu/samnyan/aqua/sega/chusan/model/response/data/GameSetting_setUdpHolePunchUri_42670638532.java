package icu.samnyan.aqua.sega.chusan.model.response.data;

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
import static icu.samnyan.aqua.sega.chusan.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_setUdpHolePunchUri_42670638532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10373;

    public GameSetting_setUdpHolePunchUri_42670638532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10373 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term10373, term10373.getClass(), "romVersion", "gbxMvhrWpA");
        setField(term10373, term10373.getClass(), "dataVersion", "huNTIobUHx");
        setBooleanField(term10373, term10373.getClass(), "isMaintenance", true);
        setIntField(term10373, term10373.getClass(), "requestInterval", 254984950);
        setField(term10373, term10373.getClass(), "rebootStartTime", "MrVeCmRVzF");
        setField(term10373, term10373.getClass(), "rebootEndTime", "CPVnQYACKw");
        setBooleanField(term10373, term10373.getClass(), "isBackgroundDistribute", false);
        setIntField(term10373, term10373.getClass(), "maxCountCharacter", 491595035);
        setIntField(term10373, term10373.getClass(), "maxCountItem", 2111929590);
        setIntField(term10373, term10373.getClass(), "maxCountMusic", 1984033465);
        setField(term10373, term10373.getClass(), "matchStartTime", "sbdLhVCRsw");
        setField(term10373, term10373.getClass(), "matchEndTime", "soJHvZwbtF");
        setIntField(term10373, term10373.getClass(), "matchTimeLimit", 415386900);
        setIntField(term10373, term10373.getClass(), "matchErrorLimit", -80119579);
        setField(term10373, term10373.getClass(), "matchingUri", "dTGwgkfDVj");
        setField(term10373, term10373.getClass(), "udpHolePunchUri", "zHiuLPzYQM");
        setField(term10373, term10373.getClass(), "reflectorUri", "ioYxUYJBrh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GXoLEdKEIe";
        callMethod(klass, "setUdpHolePunchUri", argTypes, term10373, args);
    }

};


