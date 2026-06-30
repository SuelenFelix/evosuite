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
import java.lang.Integer;

public class Music_setMusicId_1606996068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21868;
     Object term21976;

    public Music_setMusicId_1606996068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22019 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term22018 = ((Class) term22019).getDeclaredField((String) "TOUHOU");
        ((Field) term22018).setAccessible(true);
        Object enum38 = ((Field) term22018).get((Object) null);
        HashMap term21960 = new HashMap();
        term21868 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term21868, term21868.getClass(), "musicId", 1053773809);
        setField(term21868, term21868.getClass(), "name", "GDGBPlYeLn");
        setField(term21868, term21868.getClass(), "sortName", "jdQANIXSTq");
        setField(term21868, term21868.getClass(), "copyright", "stVcZLTNpu");
        setField(term21868, term21868.getClass(), "artistName", "LgXdqWrsLL");
        setField(term21868, term21868.getClass(), "genre", enum38);
        setField(term21868, term21868.getClass(), "releaseVersion", "bbHWyibNmy");
        setField(term21868, term21868.getClass(), "levels", term21960);
        term21976 = new Integer(1431951992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21976;
        callMethod(klass, "setMusicId", argTypes, term21868, args);
    }

};


