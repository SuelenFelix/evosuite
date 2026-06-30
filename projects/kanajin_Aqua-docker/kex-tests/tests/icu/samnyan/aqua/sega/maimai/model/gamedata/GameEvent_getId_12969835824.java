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

public class GameEvent_getId_12969835824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193;

    public GameEvent_getId_12969835824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.gamedata.GameEvent"));
        setIntField(term193, term193.getClass(), "type", 1227103734);
        setIntField(term193, term193.getClass(), "eventId", -1339778481);
        setField(term193, term193.getClass(), "startDate", "hRNSzYYIrc");
        setField(term193, term193.getClass(), "endDate", "RMFIsYGgne");
        setLongField(term193, term193.getClass(), "id", 5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term193, args);
    }

};


