package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class Festa_setEnable_63127007743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28705;
     Object term28708;

    public Festa_setEnable_63127007743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28705 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        setIntField(term28705, term28705.getClass(), "id", 0);
        setBooleanField(term28705, term28705.getClass(), "enable", false);
        setField(term28705, term28705.getClass(), "name", null);
        setField(term28705, term28705.getClass(), "kind", null);
        setField(term28705, term28705.getClass(), "difficulty", null);
        setField(term28705, term28705.getClass(), "pvList", null);
        setField(term28705, term28705.getClass(), "attributes", null);
        setField(term28705, term28705.getClass(), "addVP", null);
        setField(term28705, term28705.getClass(), "vpMultiplier", null);
        setField(term28705, term28705.getClass(), "start", null);
        setField(term28705, term28705.getClass(), "end", null);
        setField(term28705, term28705.getClass(), "createDate", null);
        term28708 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term28708;
        callMethod(klass, "setEnable", argTypes, term28705, args);
    }

};


