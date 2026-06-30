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

public class PvEntry_setPvId_98023418636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90686;
     Object term90690;

    public PvEntry_setPvId_98023418636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90686 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry"));
        setLongField(term90686, term90686.getClass(), "id", 0L);
        setIntField(term90686, term90686.getClass(), "pvId", 0);
        setField(term90686, term90686.getClass(), "difficulty", null);
        setIntField(term90686, term90686.getClass(), "version", 0);
        setField(term90686, term90686.getClass(), "edition", null);
        setField(term90686, term90686.getClass(), "demoStart", null);
        setField(term90686, term90686.getClass(), "demoEnd", null);
        setField(term90686, term90686.getClass(), "playableStart", null);
        setField(term90686, term90686.getClass(), "playableEnd", null);
        term90690 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.PvEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term90690;
        callMethod(klass, "setPvId", argTypes, term90686, args);
    }

};


