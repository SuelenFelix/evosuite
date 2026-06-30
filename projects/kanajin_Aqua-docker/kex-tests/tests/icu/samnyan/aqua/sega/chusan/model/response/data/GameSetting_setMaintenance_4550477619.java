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
import java.lang.Boolean;

public class GameSetting_setMaintenance_4550477619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7556;
     Object term7673;

    public GameSetting_setMaintenance_4550477619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7556 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term7556, term7556.getClass(), "romVersion", "ZKVeStsSNT");
        setField(term7556, term7556.getClass(), "dataVersion", "cqCXYaAnFB");
        setBooleanField(term7556, term7556.getClass(), "isMaintenance", true);
        setIntField(term7556, term7556.getClass(), "requestInterval", -309536114);
        setField(term7556, term7556.getClass(), "rebootStartTime", "UPLNFZHXjw");
        setField(term7556, term7556.getClass(), "rebootEndTime", "CwrrJlrGmg");
        setBooleanField(term7556, term7556.getClass(), "isBackgroundDistribute", false);
        setIntField(term7556, term7556.getClass(), "maxCountCharacter", 755500171);
        setIntField(term7556, term7556.getClass(), "maxCountItem", -535062491);
        setIntField(term7556, term7556.getClass(), "maxCountMusic", -147381920);
        setField(term7556, term7556.getClass(), "matchStartTime", "HejzvyejjG");
        setField(term7556, term7556.getClass(), "matchEndTime", "pbqJjeooBM");
        setIntField(term7556, term7556.getClass(), "matchTimeLimit", -7568006);
        setIntField(term7556, term7556.getClass(), "matchErrorLimit", 1952367361);
        setField(term7556, term7556.getClass(), "matchingUri", "ccnotFfPXt");
        setField(term7556, term7556.getClass(), "udpHolePunchUri", "plWlgdgIhn");
        setField(term7556, term7556.getClass(), "reflectorUri", "RZaKVKWtND");
        term7673 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7673;
        callMethod(klass, "setMaintenance", argTypes, term7556, args);
    }

};


