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

public class Level_getLevelDecimal_8867616264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3693;

    public Level_getLevelDecimal_8867616264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3834 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term3833 = ((Class) term3834).getDeclaredField((String) "RESERVE2");
        ((Field) term3833).setAccessible(true);
        Object enum4 = ((Field) term3833).get((Object) null);
        HashMap term3779 = new HashMap();
        term3693 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term3695 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term3693, term3693.getClass(), "id", 4784595517102746672L);
        setIntField(term3695, term3695.getClass(), "musicId", 318591690);
        setField(term3695, term3695.getClass(), "name", "SPpkrGcPRr");
        setField(term3695, term3695.getClass(), "sortName", "sEccwbJKYE");
        setField(term3695, term3695.getClass(), "copyright", "AWRooQKkdW");
        setField(term3695, term3695.getClass(), "artistName", "vjxIhXHxGR");
        setField(term3695, term3695.getClass(), "genre", enum4);
        setField(term3695, term3695.getClass(), "releaseVersion", "QXzGXbEXMu");
        setField(term3695, term3695.getClass(), "levels", term3779);
        setField(term3693, term3693.getClass(), "music", term3695);
        setBooleanField(term3693, term3693.getClass(), "enable", false);
        setIntField(term3693, term3693.getClass(), "level", -1747406163);
        setIntField(term3693, term3693.getClass(), "levelDecimal", 388157121);
        setIntField(term3693, term3693.getClass(), "diff", 1684998508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevelDecimal", argTypes, term3693, args);
    }

};


