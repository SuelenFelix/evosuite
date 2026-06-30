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

public class Festa_setId_201684063542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28700;
     Object term28703;

    public Festa_setId_201684063542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28700 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa"));
        setIntField(term28700, term28700.getClass(), "id", 0);
        setBooleanField(term28700, term28700.getClass(), "enable", false);
        setField(term28700, term28700.getClass(), "name", null);
        setField(term28700, term28700.getClass(), "kind", null);
        setField(term28700, term28700.getClass(), "difficulty", null);
        setField(term28700, term28700.getClass(), "pvList", null);
        setField(term28700, term28700.getClass(), "attributes", null);
        setField(term28700, term28700.getClass(), "addVP", null);
        setField(term28700, term28700.getClass(), "vpMultiplier", null);
        setField(term28700, term28700.getClass(), "start", null);
        setField(term28700, term28700.getClass(), "end", null);
        setField(term28700, term28700.getClass(), "createDate", null);
        term28703 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Festa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28703;
        callMethod(klass, "setId", argTypes, term28700, args);
    }

};


