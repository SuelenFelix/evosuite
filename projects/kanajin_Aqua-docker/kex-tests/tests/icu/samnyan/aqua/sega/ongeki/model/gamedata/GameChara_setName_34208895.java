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

public class GameChara_setName_34208895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20888;

    public GameChara_setName_34208895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20888 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameChara"));
        setLongField(term20888, term20888.getClass(), "id", -900457279156388404L);
        setField(term20888, term20888.getClass(), "name", "IiNCZfdouL");
        setField(term20888, term20888.getClass(), "cv", "AhOHzCsHKW");
        setIntField(term20888, term20888.getClass(), "modelId", 282916351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameChara");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UqgLPaaAHi";
        callMethod(klass, "setName", argTypes, term20888, args);
    }

};


