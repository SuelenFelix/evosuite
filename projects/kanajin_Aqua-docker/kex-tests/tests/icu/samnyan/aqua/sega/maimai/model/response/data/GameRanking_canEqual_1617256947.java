package icu.samnyan.aqua.sega.maimai.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GameRanking_canEqual_1617256947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217;
     Object term234;

    public GameRanking_canEqual_1617256947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term218 = new Integer(-1685132342);
        Integer term220 = new Integer(-1456670397);
        term217 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameRanking"));
        setField(term217, term217.getClass(), "id", term218);
        setField(term217, term217.getClass(), "point", term220);
        setField(term217, term217.getClass(), "userName", "hRNSzYYIrc");
        term234 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term234;
        callMethod(klass, "canEqual", argTypes, term217, args);
    }

};


