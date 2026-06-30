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

public class DivaCustomize_setName_127626458827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29670;

    public DivaCustomize_setName_127626458827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29670 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        setIntField(term29670, term29670.getClass(), "id", 0);
        setField(term29670, term29670.getClass(), "name", null);
        setIntField(term29670, term29670.getClass(), "price", 0);
        setField(term29670, term29670.getClass(), "releaseDate", null);
        setField(term29670, term29670.getClass(), "endDate", null);
        setIntField(term29670, term29670.getClass(), "sortOrder", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term29670, args);
    }

};


