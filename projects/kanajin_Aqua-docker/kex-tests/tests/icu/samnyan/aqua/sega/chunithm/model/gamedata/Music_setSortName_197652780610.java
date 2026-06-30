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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class Music_setSortName_197652780610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22778;

    public Music_setSortName_197652780610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22943 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term22942 = ((Class) term22943).getDeclaredField((String) "KOTONOHA");
        ((Field) term22942).setAccessible(true);
        Object enum40 = ((Field) term22942).get((Object) null);
        HashMap term22874 = new HashMap();
        term22778 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term22778, term22778.getClass(), "musicId", 698551724);
        setField(term22778, term22778.getClass(), "name", "WAVMPPbIfL");
        setField(term22778, term22778.getClass(), "sortName", "GISHLsgALf");
        setField(term22778, term22778.getClass(), "copyright", "PVykkUSgBq");
        setField(term22778, term22778.getClass(), "artistName", "tnKbZaCsuj");
        setField(term22778, term22778.getClass(), "genre", enum40);
        setField(term22778, term22778.getClass(), "releaseVersion", "ZFpcYBgLNC");
        setField(term22778, term22778.getClass(), "levels", term22874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JukEMhPWql";
        callMethod(klass, "setSortName", argTypes, term22778, args);
    }

};


