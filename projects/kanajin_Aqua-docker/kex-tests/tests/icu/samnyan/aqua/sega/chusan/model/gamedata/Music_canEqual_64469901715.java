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

public class Music_canEqual_64469901715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11723;
     Object term11819;

    public Music_canEqual_64469901715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11851 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term11850 = ((Class) term11851).getDeclaredField((String) "TOUHOU");
        ((Field) term11850).setAccessible(true);
        Object enum16 = ((Field) term11850).get((Object) null);
        HashMap term11803 = new HashMap();
        term11723 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term11723, term11723.getClass(), "musicId", 550892835);
        setField(term11723, term11723.getClass(), "name", "zMsSLTfGhl");
        setField(term11723, term11723.getClass(), "sortName", "bEmHScVZaQ");
        setField(term11723, term11723.getClass(), "artistName", "TcuXODkzBV");
        setField(term11723, term11723.getClass(), "genre", enum16);
        setField(term11723, term11723.getClass(), "releaseVersion", "coJPjrBZNe");
        setField(term11723, term11723.getClass(), "levels", term11803);
        term11819 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11819;
        callMethod(klass, "canEqual", argTypes, term11723, args);
    }

};


