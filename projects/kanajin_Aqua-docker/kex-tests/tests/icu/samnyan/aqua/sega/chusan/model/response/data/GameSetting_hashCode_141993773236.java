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

public class GameSetting_hashCode_141993773236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11247;

    public GameSetting_hashCode_141993773236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11247 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term11247, term11247.getClass(), "romVersion", "ETbxNuJLii");
        setField(term11247, term11247.getClass(), "dataVersion", "YJhnPtWtJR");
        setBooleanField(term11247, term11247.getClass(), "isMaintenance", false);
        setIntField(term11247, term11247.getClass(), "requestInterval", -1368801661);
        setField(term11247, term11247.getClass(), "rebootStartTime", "xzGnrvbExX");
        setField(term11247, term11247.getClass(), "rebootEndTime", "LFZNDELxUZ");
        setBooleanField(term11247, term11247.getClass(), "isBackgroundDistribute", true);
        setIntField(term11247, term11247.getClass(), "maxCountCharacter", -2094311816);
        setIntField(term11247, term11247.getClass(), "maxCountItem", 419332770);
        setIntField(term11247, term11247.getClass(), "maxCountMusic", 1742733401);
        setField(term11247, term11247.getClass(), "matchStartTime", "GNIVsSTglt");
        setField(term11247, term11247.getClass(), "matchEndTime", "mzPebFiUSP");
        setIntField(term11247, term11247.getClass(), "matchTimeLimit", 1634939612);
        setIntField(term11247, term11247.getClass(), "matchErrorLimit", -590256406);
        setField(term11247, term11247.getClass(), "matchingUri", "HvbkjsQyDy");
        setField(term11247, term11247.getClass(), "udpHolePunchUri", "wzSukELQFL");
        setField(term11247, term11247.getClass(), "reflectorUri", "VZyeaOWYEj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term11247, args);
    }

};


