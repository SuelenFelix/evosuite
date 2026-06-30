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

public class Music_setSortName_16485253769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8859;

    public Music_setSortName_16485253769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8995 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term8994 = ((Class) term8995).getDeclaredField((String) "IRODORI");
        ((Field) term8994).setAccessible(true);
        Object enum9 = ((Field) term8994).get((Object) null);
        HashMap term8936 = new HashMap();
        term8859 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term8859, term8859.getClass(), "musicId", 1843268026);
        setField(term8859, term8859.getClass(), "name", "wdoqITnaAP");
        setField(term8859, term8859.getClass(), "sortName", "rIPMBcrNqB");
        setField(term8859, term8859.getClass(), "artistName", "UDaboHZHhz");
        setField(term8859, term8859.getClass(), "genre", enum9);
        setField(term8859, term8859.getClass(), "releaseVersion", "nRvKihUSPj");
        setField(term8859, term8859.getClass(), "levels", term8936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TSyCeEZPaT";
        callMethod(klass, "setSortName", argTypes, term8859, args);
    }

};


