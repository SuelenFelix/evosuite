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

public class Music_getSortName_10600994802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6011;

    public Music_getSortName_10600994802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6130 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term6129 = ((Class) term6130).getDeclaredField((String) "RESERVE2");
        ((Field) term6129).setAccessible(true);
        Object enum2 = ((Field) term6129).get((Object) null);
        HashMap term6083 = new HashMap();
        term6011 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term6011, term6011.getClass(), "musicId", -2066804303);
        setField(term6011, term6011.getClass(), "name", "lihXWlGDxk");
        setField(term6011, term6011.getClass(), "sortName", "JmcmxoGhIK");
        setField(term6011, term6011.getClass(), "artistName", "jXzmYyrnnT");
        setField(term6011, term6011.getClass(), "genre", enum2);
        setField(term6011, term6011.getClass(), "releaseVersion", "igCAtimmYB");
        setField(term6011, term6011.getClass(), "levels", term6083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortName", argTypes, term6011, args);
    }

};


