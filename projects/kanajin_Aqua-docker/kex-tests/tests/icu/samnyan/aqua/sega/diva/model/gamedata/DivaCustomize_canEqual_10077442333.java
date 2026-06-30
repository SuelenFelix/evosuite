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

public class DivaCustomize_canEqual_10077442333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29698;

    public DivaCustomize_canEqual_10077442333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29698 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        setIntField(term29698, term29698.getClass(), "id", 0);
        setField(term29698, term29698.getClass(), "name", null);
        setIntField(term29698, term29698.getClass(), "price", 0);
        setField(term29698, term29698.getClass(), "releaseDate", null);
        setField(term29698, term29698.getClass(), "endDate", null);
        setIntField(term29698, term29698.getClass(), "sortOrder", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term29698, args);
    }

};


