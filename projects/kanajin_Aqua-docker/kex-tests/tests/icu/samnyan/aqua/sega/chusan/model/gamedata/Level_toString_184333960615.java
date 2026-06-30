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

public class Level_toString_184333960615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22594;

    public Level_toString_184333960615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22713 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term22712 = ((Class) term22713).getDeclaredField((String) "RESERVE2");
        ((Field) term22712).setAccessible(true);
        Object enum42 = ((Field) term22712).get((Object) null);
        HashMap term22668 = new HashMap();
        term22594 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term22596 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term22594, term22594.getClass(), "id", -187772971269812453L);
        setIntField(term22596, term22596.getClass(), "musicId", 1304396087);
        setField(term22596, term22596.getClass(), "name", "iSPirUEhXs");
        setField(term22596, term22596.getClass(), "sortName", "WWyLFmYpAy");
        setField(term22596, term22596.getClass(), "artistName", "vbSWeJWOQh");
        setField(term22596, term22596.getClass(), "genre", enum42);
        setField(term22596, term22596.getClass(), "releaseVersion", "hyvFdAvkOr");
        setField(term22596, term22596.getClass(), "levels", term22668);
        setField(term22594, term22594.getClass(), "music", term22596);
        setBooleanField(term22594, term22594.getClass(), "enable", false);
        setIntField(term22594, term22594.getClass(), "level", 504525721);
        setIntField(term22594, term22594.getClass(), "levelDecimal", 1835568392);
        setIntField(term22594, term22594.getClass(), "diff", 457470807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term22594, args);
    }

};


