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

public class Music_getLevels_7216389097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21428;

    public Music_getLevels_7216389097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21570 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term21569 = ((Class) term21570).getDeclaredField((String) "GEKICHUMA");
        ((Field) term21569).setAccessible(true);
        Object enum37 = ((Field) term21569).get((Object) null);
        HashMap term21513 = new HashMap();
        term21428 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term21428, term21428.getClass(), "musicId", 1104108112);
        setField(term21428, term21428.getClass(), "name", "dikKjYjmRO");
        setField(term21428, term21428.getClass(), "sortName", "GJnnMDVnEP");
        setField(term21428, term21428.getClass(), "copyright", "zSMVllDpfk");
        setField(term21428, term21428.getClass(), "artistName", "iptRXVDoYE");
        setField(term21428, term21428.getClass(), "genre", enum37);
        setField(term21428, term21428.getClass(), "releaseVersion", "kucsxnvbES");
        setField(term21428, term21428.getClass(), "levels", term21513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevels", argTypes, term21428, args);
    }

};


