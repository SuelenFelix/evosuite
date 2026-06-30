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

public class Music_getCopyright_12874189523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19681;

    public Music_getCopyright_12874189523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19822 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term19821 = ((Class) term19822).getDeclaredField((String) "ORIGINAL");
        ((Field) term19821).setAccessible(true);
        Object enum33 = ((Field) term19821).get((Object) null);
        HashMap term19765 = new HashMap();
        term19681 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term19681, term19681.getClass(), "musicId", 313459791);
        setField(term19681, term19681.getClass(), "name", "IbxeAMwLVt");
        setField(term19681, term19681.getClass(), "sortName", "bShlAqoTmZ");
        setField(term19681, term19681.getClass(), "copyright", "nOKlKlNhtU");
        setField(term19681, term19681.getClass(), "artistName", "gXFNBHJSey");
        setField(term19681, term19681.getClass(), "genre", enum33);
        setField(term19681, term19681.getClass(), "releaseVersion", "wUcSfItZgv");
        setField(term19681, term19681.getClass(), "levels", term19765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCopyright", argTypes, term19681, args);
    }

};


