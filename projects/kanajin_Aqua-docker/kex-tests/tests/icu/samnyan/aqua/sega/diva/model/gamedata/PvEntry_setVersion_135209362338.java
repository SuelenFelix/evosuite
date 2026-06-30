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
import java.lang.Integer;

public class PvEntry_setVersion_135209362338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90696;
     Object term90700;

    public PvEntry_setVersion_135209362338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90696 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        setLongField(term90696, term90696.getClass(), "id", 0L);
        setIntField(term90696, term90696.getClass(), "pvId", 0);
        setField(term90696, term90696.getClass(), "difficulty", null);
        setIntField(term90696, term90696.getClass(), "version", 0);
        setField(term90696, term90696.getClass(), "edition", null);
        setField(term90696, term90696.getClass(), "demoStart", null);
        setField(term90696, term90696.getClass(), "demoEnd", null);
        setField(term90696, term90696.getClass(), "playableStart", null);
        setField(term90696, term90696.getClass(), "playableEnd", null);
        term90700 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term90700;
        callMethod(klass, "setVersion", argTypes, term90696, args);
    }

};


