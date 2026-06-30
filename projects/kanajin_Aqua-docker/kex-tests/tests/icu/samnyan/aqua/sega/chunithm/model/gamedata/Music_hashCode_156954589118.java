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

public class Music_hashCode_156954589118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26724;

    public Music_hashCode_156954589118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26871 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term26870 = ((Class) term26871).getDeclaredField((String) "POPS_ANIME");
        ((Field) term26870).setAccessible(true);
        Object enum49 = ((Field) term26870).get((Object) null);
        HashMap term26814 = new HashMap();
        term26724 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term26724, term26724.getClass(), "musicId", 1778570695);
        setField(term26724, term26724.getClass(), "name", "qYOIXsGycY");
        setField(term26724, term26724.getClass(), "sortName", "sJNXNshRLe");
        setField(term26724, term26724.getClass(), "copyright", "AYnbmgRCKr");
        setField(term26724, term26724.getClass(), "artistName", "iQRfDlaoYD");
        setField(term26724, term26724.getClass(), "genre", enum49);
        setField(term26724, term26724.getClass(), "releaseVersion", "kpcyrjDQzN");
        setField(term26724, term26724.getClass(), "levels", term26814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term26724, args);
    }

};


