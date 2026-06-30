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

public class GameEvent_getStartDate_12328820382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1083;

    public GameEvent_getStartDate_12328820382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1083 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameEvent"));
        setIntField(term1083, term1083.getClass(), "id", 493620644);
        setIntField(term1083, term1083.getClass(), "type", 1328271830);
        setField(term1083, term1083.getClass(), "startDate", "wSQxaModmm");
        setField(term1083, term1083.getClass(), "endDate", "UlajhuVLaP");
        setBooleanField(term1083, term1083.getClass(), "enable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term1083, args);
    }

};


