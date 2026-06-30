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

public class GameSetting_toString_193069742237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11454;

    public GameSetting_toString_193069742237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11454 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term11454, term11454.getClass(), "romVersion", "PErxMBQSUv");
        setField(term11454, term11454.getClass(), "dataVersion", "KZQwbvujui");
        setBooleanField(term11454, term11454.getClass(), "isMaintenance", false);
        setIntField(term11454, term11454.getClass(), "requestInterval", -1319797966);
        setField(term11454, term11454.getClass(), "rebootStartTime", "JPUZuGxKlI");
        setField(term11454, term11454.getClass(), "rebootEndTime", "xqIbVsUspl");
        setBooleanField(term11454, term11454.getClass(), "isBackgroundDistribute", false);
        setIntField(term11454, term11454.getClass(), "maxCountCharacter", -388682282);
        setIntField(term11454, term11454.getClass(), "maxCountItem", 2028706829);
        setIntField(term11454, term11454.getClass(), "maxCountMusic", -656080518);
        setField(term11454, term11454.getClass(), "matchStartTime", "GnjLRtJywq");
        setField(term11454, term11454.getClass(), "matchEndTime", "TDaodpHTRK");
        setIntField(term11454, term11454.getClass(), "matchTimeLimit", 1769230265);
        setIntField(term11454, term11454.getClass(), "matchErrorLimit", -1946503216);
        setField(term11454, term11454.getClass(), "matchingUri", "JayazbYDLK");
        setField(term11454, term11454.getClass(), "udpHolePunchUri", "ORDuSTrpNA");
        setField(term11454, term11454.getClass(), "reflectorUri", "hysThIPoEJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term11454, args);
    }

};


