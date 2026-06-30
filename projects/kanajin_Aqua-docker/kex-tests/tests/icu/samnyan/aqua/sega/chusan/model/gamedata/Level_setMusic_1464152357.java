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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Level_setMusic_1464152357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18908;
     Object term18996;

    public Level_setMusic_1464152357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19115 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term19114 = ((Class) term19115).getDeclaredField((String) "ORIGINAL");
        ((Field) term19114).setAccessible(true);
        Object enum33 = ((Field) term19114).get((Object) null);
        HashMap term18982 = new HashMap();
        term18908 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term18910 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term18908, term18908.getClass(), "id", 3713624957161771816L);
        setIntField(term18910, term18910.getClass(), "musicId", 797015478);
        setField(term18910, term18910.getClass(), "name", "GuVQjhBxma");
        setField(term18910, term18910.getClass(), "sortName", "WAVMPPbIfL");
        setField(term18910, term18910.getClass(), "artistName", "GISHLsgALf");
        setField(term18910, term18910.getClass(), "genre", enum33);
        setField(term18910, term18910.getClass(), "releaseVersion", "PVykkUSgBq");
        setField(term18910, term18910.getClass(), "levels", term18982);
        setField(term18908, term18908.getClass(), "music", term18910);
        setBooleanField(term18908, term18908.getClass(), "enable", true);
        setIntField(term18908, term18908.getClass(), "level", -979568);
        setIntField(term18908, term18908.getClass(), "levelDecimal", -1422131197);
        setIntField(term18908, term18908.getClass(), "diff", -20399281);
        Class<? extends Object> term19431 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term19430 = ((Class) term19431).getDeclaredField((String) "NICONICO");
        ((Field) term19430).setAccessible(true);
        Object enum34 = ((Field) term19430).get((Object) null);
        HashMap term19068 = new HashMap();
        term18996 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term18996, term18996.getClass(), "musicId", -830170410);
        setField(term18996, term18996.getClass(), "name", "fufeuGfwpN");
        setField(term18996, term18996.getClass(), "sortName", "XJbkXbljvz");
        setField(term18996, term18996.getClass(), "artistName", "fuvdkDwBeH");
        setField(term18996, term18996.getClass(), "genre", enum34);
        setField(term18996, term18996.getClass(), "releaseVersion", "NTefzwLPhx");
        setField(term18996, term18996.getClass(), "levels", term19068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Object[] args = new Object[1];
        args[0] = term18996;
        callMethod(klass, "setMusic", argTypes, term18908, args);
    }

};


