package icu.samnyan.aqua.sega.ongeki.model.response.data;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameRankingItem_setUserName_48185293417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390;

    public GameRankingItem_setUserName_48185293417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameRankingItem"));
        setLongField(term390, term390.getClass(), "id", 0L);
        setLongField(term390, term390.getClass(), "point", 0L);
        setField(term390, term390.getClass(), "userName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameRankingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term390, args);
    }

};


