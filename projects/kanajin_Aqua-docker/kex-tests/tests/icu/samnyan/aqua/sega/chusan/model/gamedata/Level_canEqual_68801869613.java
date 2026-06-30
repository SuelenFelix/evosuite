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

public class Level_canEqual_68801869613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21769;
     Object term21863;

    public Level_canEqual_68801869613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21895 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term21894 = ((Class) term21895).getDeclaredField((String) "POPS_ANIME");
        ((Field) term21894).setAccessible(true);
        Object enum40 = ((Field) term21894).get((Object) null);
        HashMap term21849 = new HashMap();
        term21769 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level"));
        Object term21771 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setLongField(term21769, term21769.getClass(), "id", -8890284990655172580L);
        setIntField(term21771, term21771.getClass(), "musicId", 1841493736);
        setField(term21771, term21771.getClass(), "name", "xPVddlPSQR");
        setField(term21771, term21771.getClass(), "sortName", "MxrhCLTMTH");
        setField(term21771, term21771.getClass(), "artistName", "kEehLMZcOU");
        setField(term21771, term21771.getClass(), "genre", enum40);
        setField(term21771, term21771.getClass(), "releaseVersion", "RhLliqMiOF");
        setField(term21771, term21771.getClass(), "levels", term21849);
        setField(term21769, term21769.getClass(), "music", term21771);
        setBooleanField(term21769, term21769.getClass(), "enable", true);
        setIntField(term21769, term21769.getClass(), "level", -2126539433);
        setIntField(term21769, term21769.getClass(), "levelDecimal", 196952878);
        setIntField(term21769, term21769.getClass(), "diff", 802673242);
        term21863 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21863;
        callMethod(klass, "canEqual", argTypes, term21769, args);
    }

};


