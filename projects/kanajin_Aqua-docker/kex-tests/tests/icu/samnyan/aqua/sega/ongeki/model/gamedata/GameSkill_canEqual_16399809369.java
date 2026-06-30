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

public class GameSkill_canEqual_16399809369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682;
     Object term720;

    public GameSkill_canEqual_16399809369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term682 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameSkill"));
        setLongField(term682, term682.getClass(), "id", -2813493605142626659L);
        setField(term682, term682.getClass(), "name", "OWDIEULEFu");
        setField(term682, term682.getClass(), "category", "dWRymuLBtr");
        setField(term682, term682.getClass(), "info", "AijpHYOFuy");
        term720 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameSkill");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term720;
        callMethod(klass, "canEqual", argTypes, term682, args);
    }

};


