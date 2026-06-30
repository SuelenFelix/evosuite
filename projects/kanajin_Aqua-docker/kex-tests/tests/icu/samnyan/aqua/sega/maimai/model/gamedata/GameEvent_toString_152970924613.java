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

public class GameEvent_toString_152970924613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677;

    public GameEvent_toString_152970924613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term677 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.gamedata.GameEvent"));
        setIntField(term677, term677.getClass(), "type", -1275173084);
        setIntField(term677, term677.getClass(), "eventId", -244121226);
        setField(term677, term677.getClass(), "startDate", "IoAlmYsBwc");
        setField(term677, term677.getClass(), "endDate", "TEParAifyi");
        setLongField(term677, term677.getClass(), "id", -5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term677, args);
    }

};


