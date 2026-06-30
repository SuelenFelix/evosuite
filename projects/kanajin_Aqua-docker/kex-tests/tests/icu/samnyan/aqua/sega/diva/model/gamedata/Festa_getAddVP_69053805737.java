package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Festa_getAddVP_69053805737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28685;

    public Festa_getAddVP_69053805737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28685 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        setIntField(term28685, term28685.getClass(), "id", 0);
        setBooleanField(term28685, term28685.getClass(), "enable", false);
        setField(term28685, term28685.getClass(), "name", null);
        setField(term28685, term28685.getClass(), "kind", null);
        setField(term28685, term28685.getClass(), "difficulty", null);
        setField(term28685, term28685.getClass(), "pvList", null);
        setField(term28685, term28685.getClass(), "attributes", null);
        setField(term28685, term28685.getClass(), "addVP", null);
        setField(term28685, term28685.getClass(), "vpMultiplier", null);
        setField(term28685, term28685.getClass(), "start", null);
        setField(term28685, term28685.getClass(), "end", null);
        setField(term28685, term28685.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddVP", argTypes, term28685, args);
    }

};


