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

public class Music_setCopyright_112466151211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23248;

    public Music_setCopyright_112466151211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23409 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term23408 = ((Class) term23409).getDeclaredField((String) "TOUHOU");
        ((Field) term23408).setAccessible(true);
        Object enum41 = ((Field) term23408).get((Object) null);
        HashMap term23340 = new HashMap();
        term23248 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term23248, term23248.getClass(), "musicId", 1409095253);
        setField(term23248, term23248.getClass(), "name", "ZdNcodHERG");
        setField(term23248, term23248.getClass(), "sortName", "CLHomjAqIM");
        setField(term23248, term23248.getClass(), "copyright", "mzCFLzFuSj");
        setField(term23248, term23248.getClass(), "artistName", "WQnMpDlSfA");
        setField(term23248, term23248.getClass(), "genre", enum41);
        setField(term23248, term23248.getClass(), "releaseVersion", "aOIvTQtXiv");
        setField(term23248, term23248.getClass(), "levels", term23340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ceGeARYMoa";
        callMethod(klass, "setCopyright", argTypes, term23248, args);
    }

};


