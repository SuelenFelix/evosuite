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
import java.lang.Integer;

public class GameSetting_setMaxCountItem_110070402365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12108;
     Object term12117;

    public GameSetting_setMaxCountItem_110070402365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12108 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term12108, term12108.getClass(), "romVersion", null);
        setField(term12108, term12108.getClass(), "dataVersion", null);
        setBooleanField(term12108, term12108.getClass(), "isMaintenance", false);
        setIntField(term12108, term12108.getClass(), "requestInterval", 0);
        setField(term12108, term12108.getClass(), "rebootStartTime", null);
        setField(term12108, term12108.getClass(), "rebootEndTime", null);
        setBooleanField(term12108, term12108.getClass(), "isBackgroundDistribute", false);
        setIntField(term12108, term12108.getClass(), "maxCountCharacter", 0);
        setIntField(term12108, term12108.getClass(), "maxCountItem", 0);
        setIntField(term12108, term12108.getClass(), "maxCountMusic", 0);
        setField(term12108, term12108.getClass(), "matchStartTime", null);
        setField(term12108, term12108.getClass(), "matchEndTime", null);
        setIntField(term12108, term12108.getClass(), "matchTimeLimit", 0);
        setIntField(term12108, term12108.getClass(), "matchErrorLimit", 0);
        setField(term12108, term12108.getClass(), "matchingUri", null);
        setField(term12108, term12108.getClass(), "udpHolePunchUri", null);
        setField(term12108, term12108.getClass(), "reflectorUri", null);
        term12117 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term12117;
        callMethod(klass, "setMaxCountItem", argTypes, term12108, args);
    }

};


