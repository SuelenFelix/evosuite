package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserDuel_getLastPlayDate_137898062836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87849;

    public UserDuel_getLastPlayDate_137898062836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87849 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        setLongField(term87849, term87849.getClass(), "id", 0L);
        setField(term87849, term87849.getClass(), "user", null);
        setIntField(term87849, term87849.getClass(), "duelId", 0);
        setIntField(term87849, term87849.getClass(), "progress", 0);
        setIntField(term87849, term87849.getClass(), "point", 0);
        setBooleanField(term87849, term87849.getClass(), "isClear", false);
        setField(term87849, term87849.getClass(), "lastPlayDate", null);
        setIntField(term87849, term87849.getClass(), "param1", 0);
        setIntField(term87849, term87849.getClass(), "param2", 0);
        setIntField(term87849, term87849.getClass(), "param3", 0);
        setIntField(term87849, term87849.getClass(), "param4", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term87849, args);
    }

};


