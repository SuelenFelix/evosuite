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
import java.lang.Integer;

public class Level_setLevelDecimal_182328719210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6744;
     Object term6852;

    public Level_setLevelDecimal_182328719210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6895 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term6894 = ((Class) term6895).getDeclaredField((String) "TOUHOU");
        ((Field) term6894).setAccessible(true);
        Object enum11 = ((Field) term6894).get((Object) null);
        HashMap term6838 = new HashMap();
        term6744 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term6746 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term6744, term6744.getClass(), "id", 5510783420697225605L);
        setIntField(term6746, term6746.getClass(), "musicId", 877649659);
        setField(term6746, term6746.getClass(), "name", "vvoLrMGCoN");
        setField(term6746, term6746.getClass(), "sortName", "pXdglvyrQe");
        setField(term6746, term6746.getClass(), "copyright", "OcfNzHYdki");
        setField(term6746, term6746.getClass(), "artistName", "uPuCVuZYOI");
        setField(term6746, term6746.getClass(), "genre", enum11);
        setField(term6746, term6746.getClass(), "releaseVersion", "TweMFhxNdj");
        setField(term6746, term6746.getClass(), "levels", term6838);
        setField(term6744, term6744.getClass(), "music", term6746);
        setBooleanField(term6744, term6744.getClass(), "enable", true);
        setIntField(term6744, term6744.getClass(), "level", -938508470);
        setIntField(term6744, term6744.getClass(), "levelDecimal", 1242676024);
        setIntField(term6744, term6744.getClass(), "diff", -1865023308);
        term6852 = new Integer(1698510819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6852;
        callMethod(klass, "setLevelDecimal", argTypes, term6744, args);
    }

};


