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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.Integer;

public class Level_init_101448881616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22998;
     Object term23000;
     Object term23093;
     Object term23095;
     Object term23097;
     Object term23099;

    public Level_init_101448881616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22998 = new Long(6465987664600701876L);
        Class<? extends Object> term23132 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term23131 = ((Class) term23132).getDeclaredField((String) "IRODORI");
        ((Field) term23131).setAccessible(true);
        Object enum43 = ((Field) term23131).get((Object) null);
        HashMap term23077 = new HashMap();
        term23000 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term23000, term23000.getClass(), "musicId", -994742871);
        setField(term23000, term23000.getClass(), "name", "mzPebFiUSP");
        setField(term23000, term23000.getClass(), "sortName", "HvbkjsQyDy");
        setField(term23000, term23000.getClass(), "artistName", "wzSukELQFL");
        setField(term23000, term23000.getClass(), "genre", enum43);
        setField(term23000, term23000.getClass(), "releaseVersion", "VZyeaOWYEj");
        setField(term23000, term23000.getClass(), "levels", term23077);
        term23093 = new Boolean(false);
        term23095 = new Integer(-534033672);
        term23097 = new Integer(-1162790806);
        term23099 = new Integer(-1264595049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term22998;
        args[1] = term23000;
        args[2] = term23093;
        args[3] = term23095;
        args[4] = term23097;
        args[5] = term23099;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


