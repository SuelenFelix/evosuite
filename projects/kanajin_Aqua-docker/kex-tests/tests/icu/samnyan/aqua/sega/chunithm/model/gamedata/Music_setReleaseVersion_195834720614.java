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

public class Music_setReleaseVersion_195834720614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24904;

    public Music_setReleaseVersion_195834720614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25057 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term25056 = ((Class) term25057).getDeclaredField((String) "NICONICO");
        ((Field) term25056).setAccessible(true);
        Object enum45 = ((Field) term25056).get((Object) null);
        HashMap term24988 = new HashMap();
        term24904 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term24904, term24904.getClass(), "musicId", -2009613557);
        setField(term24904, term24904.getClass(), "name", "FxSvJCIpul");
        setField(term24904, term24904.getClass(), "sortName", "HCjKwpexJj");
        setField(term24904, term24904.getClass(), "copyright", "sCpIHVPdfl");
        setField(term24904, term24904.getClass(), "artistName", "lMUBBGRjfY");
        setField(term24904, term24904.getClass(), "genre", enum45);
        setField(term24904, term24904.getClass(), "releaseVersion", "olYpqbolWL");
        setField(term24904, term24904.getClass(), "levels", term24988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TbYrjEyFPc";
        callMethod(klass, "setReleaseVersion", argTypes, term24904, args);
    }

};


