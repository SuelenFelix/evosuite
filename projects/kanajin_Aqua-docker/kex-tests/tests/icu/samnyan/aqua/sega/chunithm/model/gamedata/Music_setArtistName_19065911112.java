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

public class Music_setArtistName_19065911112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23708;

    public Music_setArtistName_19065911112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23866 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term23865 = ((Class) term23866).getDeclaredField((String) "IRODORI");
        ((Field) term23865).setAccessible(true);
        Object enum42 = ((Field) term23865).get((Object) null);
        HashMap term23797 = new HashMap();
        term23708 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term23708, term23708.getClass(), "musicId", -1804322375);
        setField(term23708, term23708.getClass(), "name", "fFWllaiFvh");
        setField(term23708, term23708.getClass(), "sortName", "PFTdEDSbvZ");
        setField(term23708, term23708.getClass(), "copyright", "TbiwoiebNe");
        setField(term23708, term23708.getClass(), "artistName", "laTITSWZuc");
        setField(term23708, term23708.getClass(), "genre", enum42);
        setField(term23708, term23708.getClass(), "releaseVersion", "fkzRpxlAqS");
        setField(term23708, term23708.getClass(), "levels", term23797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JeyKRznnft";
        callMethod(klass, "setArtistName", argTypes, term23708, args);
    }

};


