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

public class Difficulty_getId_36219813318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7719;

    public Difficulty_getId_36219813318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7719 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty"));
        setLongField(term7719, term7719.getClass(), "id", 0L);
        setField(term7719, term7719.getClass(), "pv", null);
        setIntField(term7719, term7719.getClass(), "edition", 0);
        setField(term7719, term7719.getClass(), "level", null);
        setIntField(term7719, term7719.getClass(), "version", 0);
        setField(term7719, term7719.getClass(), "diff", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Difficulty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term7719, args);
    }

};


