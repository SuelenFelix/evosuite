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

public class Music_getArtistName_16403802394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20117;

    public Music_getArtistName_16403802394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20256 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term20255 = ((Class) term20256).getDeclaredField((String) "VARIETY");
        ((Field) term20255).setAccessible(true);
        Object enum34 = ((Field) term20255).get((Object) null);
        HashMap term20199 = new HashMap();
        term20117 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term20117, term20117.getClass(), "musicId", 1470349147);
        setField(term20117, term20117.getClass(), "name", "YcTbglHiUq");
        setField(term20117, term20117.getClass(), "sortName", "TiUqHrjoEU");
        setField(term20117, term20117.getClass(), "copyright", "eoEvZbdLjL");
        setField(term20117, term20117.getClass(), "artistName", "BkIxsyPkGy");
        setField(term20117, term20117.getClass(), "genre", enum34);
        setField(term20117, term20117.getClass(), "releaseVersion", "mrMGwoRgVY");
        setField(term20117, term20117.getClass(), "levels", term20199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArtistName", argTypes, term20117, args);
    }

};


