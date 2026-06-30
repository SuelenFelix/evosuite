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

public class PvEntry_setDemoStart_212914057540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90706;

    public PvEntry_setDemoStart_212914057540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90706 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        setLongField(term90706, term90706.getClass(), "id", 0L);
        setIntField(term90706, term90706.getClass(), "pvId", 0);
        setField(term90706, term90706.getClass(), "difficulty", null);
        setIntField(term90706, term90706.getClass(), "version", 0);
        setField(term90706, term90706.getClass(), "edition", null);
        setField(term90706, term90706.getClass(), "demoStart", null);
        setField(term90706, term90706.getClass(), "demoEnd", null);
        setField(term90706, term90706.getClass(), "playableStart", null);
        setField(term90706, term90706.getClass(), "playableEnd", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDemoStart", argTypes, term90706, args);
    }

};


