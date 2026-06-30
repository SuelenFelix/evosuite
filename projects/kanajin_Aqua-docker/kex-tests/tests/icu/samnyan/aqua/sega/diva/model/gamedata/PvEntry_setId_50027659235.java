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
import java.lang.Long;

public class PvEntry_setId_50027659235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90680;
     Object term90684;

    public PvEntry_setId_50027659235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90680 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        setLongField(term90680, term90680.getClass(), "id", 0L);
        setIntField(term90680, term90680.getClass(), "pvId", 0);
        setField(term90680, term90680.getClass(), "difficulty", null);
        setIntField(term90680, term90680.getClass(), "version", 0);
        setField(term90680, term90680.getClass(), "edition", null);
        setField(term90680, term90680.getClass(), "demoStart", null);
        setField(term90680, term90680.getClass(), "demoEnd", null);
        setField(term90680, term90680.getClass(), "playableStart", null);
        setField(term90680, term90680.getClass(), "playableEnd", null);
        term90684 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term90684;
        callMethod(klass, "setId", argTypes, term90680, args);
    }

};


