package icu.samnyan.aqua.sega.maimai2.model.gamedata;

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
import static icu.samnyan.aqua.sega.maimai2.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameEvent_setEndDate_20616599078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1397;

    public GameEvent_setEndDate_20616599078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1397 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameEvent"));
        setIntField(term1397, term1397.getClass(), "id", 1540719661);
        setIntField(term1397, term1397.getClass(), "type", 1265463001);
        setField(term1397, term1397.getClass(), "startDate", "JDswTTCZHV");
        setField(term1397, term1397.getClass(), "endDate", "onpbIeEKoi");
        setBooleanField(term1397, term1397.getClass(), "enable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YRHGsAkhxb";
        callMethod(klass, "setEndDate", argTypes, term1397, args);
    }

};


