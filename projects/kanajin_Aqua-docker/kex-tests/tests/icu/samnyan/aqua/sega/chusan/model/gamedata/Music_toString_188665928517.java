package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class Music_toString_188665928517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12534;

    public Music_toString_188665928517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12653 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term12652 = ((Class) term12653).getDeclaredField((String) "RESERVE2");
        ((Field) term12652).setAccessible(true);
        Object enum18 = ((Field) term12652).get((Object) null);
        HashMap term12606 = new HashMap();
        term12534 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term12534, term12534.getClass(), "musicId", 612177768);
        setField(term12534, term12534.getClass(), "name", "AdSHvysxQB");
        setField(term12534, term12534.getClass(), "sortName", "jlraKkBWFA");
        setField(term12534, term12534.getClass(), "artistName", "mRBtFTxVdE");
        setField(term12534, term12534.getClass(), "genre", enum18);
        setField(term12534, term12534.getClass(), "releaseVersion", "IVacFDAZcj");
        setField(term12534, term12534.getClass(), "levels", term12606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term12534, args);
    }

};


