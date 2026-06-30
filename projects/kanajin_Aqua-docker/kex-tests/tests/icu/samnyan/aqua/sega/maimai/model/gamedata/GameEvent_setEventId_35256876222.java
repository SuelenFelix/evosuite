package icu.samnyan.aqua.sega.maimai.model.gamedata;

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
import static icu.samnyan.aqua.sega.maimai.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GameEvent_setEventId_35256876222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term801;
     Object term805;

    public GameEvent_setEventId_35256876222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term801 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.gamedata.GameEvent"));
        setIntField(term801, term801.getClass(), "type", 0);
        setIntField(term801, term801.getClass(), "eventId", 0);
        setField(term801, term801.getClass(), "startDate", null);
        setField(term801, term801.getClass(), "endDate", null);
        setLongField(term801, term801.getClass(), "id", 0L);
        term805 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term805;
        callMethod(klass, "setEventId", argTypes, term801, args);
    }

};


