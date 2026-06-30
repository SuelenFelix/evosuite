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

public class PvEntry_getPlayableStart_8829768433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90672;

    public PvEntry_getPlayableStart_8829768433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90672 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        setLongField(term90672, term90672.getClass(), "id", 0L);
        setIntField(term90672, term90672.getClass(), "pvId", 0);
        setField(term90672, term90672.getClass(), "difficulty", null);
        setIntField(term90672, term90672.getClass(), "version", 0);
        setField(term90672, term90672.getClass(), "edition", null);
        setField(term90672, term90672.getClass(), "demoStart", null);
        setField(term90672, term90672.getClass(), "demoEnd", null);
        setField(term90672, term90672.getClass(), "playableStart", null);
        setField(term90672, term90672.getClass(), "playableEnd", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayableStart", argTypes, term90672, args);
    }

};


