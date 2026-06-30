package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GamePoint_getType_190391529719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28125;

    public GamePoint_getType_190391529719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28125 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint"));
        setLongField(term28125, term28125.getClass(), "id", 0L);
        setField(term28125, term28125.getClass(), "type", null);
        setIntField(term28125, term28125.getClass(), "cost", 0);
        setField(term28125, term28125.getClass(), "startDate", null);
        setField(term28125, term28125.getClass(), "endDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GamePoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term28125, args);
    }

};


