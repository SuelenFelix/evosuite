package icu.samnyan.aqua.sega.chunithm.model.response.data;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GameRanking_setId_6842435362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2027;
     Object term2030;

    public GameRanking_setId_6842435362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2027 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameRanking"));
        setIntField(term2027, term2027.getClass(), "id", -1882480155);
        setLongField(term2027, term2027.getClass(), "point", -8257434502486459194L);
        term2030 = new Integer(-1410220680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2030;
        callMethod(klass, "setId", argTypes, term2027, args);
    }

};


