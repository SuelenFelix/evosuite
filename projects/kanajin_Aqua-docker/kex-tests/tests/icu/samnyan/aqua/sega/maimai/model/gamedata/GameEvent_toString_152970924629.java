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

public class GameEvent_toString_152970924629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term833;

    public GameEvent_toString_152970924629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term833 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.gamedata.GameEvent"));
        setIntField(term833, term833.getClass(), "type", 0);
        setIntField(term833, term833.getClass(), "eventId", 0);
        setField(term833, term833.getClass(), "startDate", null);
        setField(term833, term833.getClass(), "endDate", null);
        setLongField(term833, term833.getClass(), "id", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term833, args);
    }

};


