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
import java.lang.Integer;

public class DivaCustomize_setPrice_110602936328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29674;
     Object term29678;

    public DivaCustomize_setPrice_110602936328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29674 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        setIntField(term29674, term29674.getClass(), "id", 0);
        setField(term29674, term29674.getClass(), "name", null);
        setIntField(term29674, term29674.getClass(), "price", 0);
        setField(term29674, term29674.getClass(), "releaseDate", null);
        setField(term29674, term29674.getClass(), "endDate", null);
        setIntField(term29674, term29674.getClass(), "sortOrder", 0);
        term29678 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29678;
        callMethod(klass, "setPrice", argTypes, term29674, args);
    }

};


