package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Level_toString_212362526033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9908;

    public Level_toString_212362526033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9908 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        setLongField(term9908, term9908.getClass(), "id", 0L);
        setField(term9908, term9908.getClass(), "music", null);
        setBooleanField(term9908, term9908.getClass(), "enable", false);
        setIntField(term9908, term9908.getClass(), "level", 0);
        setIntField(term9908, term9908.getClass(), "levelDecimal", 0);
        setIntField(term9908, term9908.getClass(), "diff", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9908, args);
    }

};


