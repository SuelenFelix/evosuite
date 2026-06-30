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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.Integer;

public class Level_init_99221735616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9350;
     Object term9352;
     Object term9464;
     Object term9466;
     Object term9468;
     Object term9470;

    public Level_init_99221735616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9350 = new Long(1597484336218508869L);
        Class<? extends Object> term9513 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term9512 = ((Class) term9513).getDeclaredField((String) "KOTONOHA");
        ((Field) term9512).setAccessible(true);
        Object enum17 = ((Field) term9512).get((Object) null);
        HashMap term9448 = new HashMap();
        term9352 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term9352, term9352.getClass(), "musicId", 1916544127);
        setField(term9352, term9352.getClass(), "name", "TKlccZUpjz");
        setField(term9352, term9352.getClass(), "sortName", "GGzwMoHZXC");
        setField(term9352, term9352.getClass(), "copyright", "IpmgwHTgnG");
        setField(term9352, term9352.getClass(), "artistName", "tIpkeYIezR");
        setField(term9352, term9352.getClass(), "genre", enum17);
        setField(term9352, term9352.getClass(), "releaseVersion", "YkZtEtthvz");
        setField(term9352, term9352.getClass(), "levels", term9448);
        term9464 = new Boolean(false);
        term9466 = new Integer(-507944154);
        term9468 = new Integer(-1736183862);
        term9470 = new Integer(897010381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term9350;
        args[1] = term9352;
        args[2] = term9464;
        args[3] = term9466;
        args[4] = term9468;
        args[5] = term9470;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


