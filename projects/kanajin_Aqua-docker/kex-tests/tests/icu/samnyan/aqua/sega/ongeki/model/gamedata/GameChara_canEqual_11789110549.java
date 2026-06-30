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

public class GameChara_canEqual_11789110549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21123;
     Object term21150;

    public GameChara_canEqual_11789110549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21123 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameChara"));
        setLongField(term21123, term21123.getClass(), "id", 8313800941204938919L);
        setField(term21123, term21123.getClass(), "name", "yIWXcOQTgy");
        setField(term21123, term21123.getClass(), "cv", "xAWekqanqc");
        setIntField(term21123, term21123.getClass(), "modelId", -75206835);
        term21150 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameChara");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21150;
        callMethod(klass, "canEqual", argTypes, term21123, args);
    }

};


