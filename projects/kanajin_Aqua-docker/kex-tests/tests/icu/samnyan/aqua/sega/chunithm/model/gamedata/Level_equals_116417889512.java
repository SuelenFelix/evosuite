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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Level_equals_116417889512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7617;
     Object term7729;

    public Level_equals_116417889512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7771 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term7770 = ((Class) term7771).getDeclaredField((String) "KOTONOHA");
        ((Field) term7770).setAccessible(true);
        Object enum13 = ((Field) term7770).get((Object) null);
        HashMap term7715 = new HashMap();
        term7617 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term7619 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term7617, term7617.getClass(), "id", 6689117472719450333L);
        setIntField(term7619, term7619.getClass(), "musicId", -944542900);
        setField(term7619, term7619.getClass(), "name", "HwLHeGLyhe");
        setField(term7619, term7619.getClass(), "sortName", "RDnkgWkcbz");
        setField(term7619, term7619.getClass(), "copyright", "IBpaxltauX");
        setField(term7619, term7619.getClass(), "artistName", "hePqROaplw");
        setField(term7619, term7619.getClass(), "genre", enum13);
        setField(term7619, term7619.getClass(), "releaseVersion", "PJcSNDruWd");
        setField(term7619, term7619.getClass(), "levels", term7715);
        setField(term7617, term7617.getClass(), "music", term7619);
        setBooleanField(term7617, term7617.getClass(), "enable", true);
        setIntField(term7617, term7617.getClass(), "level", 833762980);
        setIntField(term7617, term7617.getClass(), "levelDecimal", 320711637);
        setIntField(term7617, term7617.getClass(), "diff", 1241164745);
        term7729 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7729;
        callMethod(klass, "equals", argTypes, term7617, args);
    }

};


