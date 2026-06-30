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

public class DivaModule_canEqual_85708904433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30658;

    public DivaModule_canEqual_85708904433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30658 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        setIntField(term30658, term30658.getClass(), "id", 0);
        setField(term30658, term30658.getClass(), "name", null);
        setIntField(term30658, term30658.getClass(), "price", 0);
        setField(term30658, term30658.getClass(), "releaseDate", null);
        setField(term30658, term30658.getClass(), "endDate", null);
        setIntField(term30658, term30658.getClass(), "sortOrder", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term30658, args);
    }

};


