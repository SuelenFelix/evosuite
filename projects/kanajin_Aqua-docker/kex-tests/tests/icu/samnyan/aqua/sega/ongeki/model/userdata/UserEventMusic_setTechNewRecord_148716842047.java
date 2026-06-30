package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class UserEventMusic_setTechNewRecord_148716842047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381483;
     Object term381492;

    public UserEventMusic_setTechNewRecord_148716842047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381483 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        setLongField(term381483, term381483.getClass(), "id", 0L);
        setField(term381483, term381483.getClass(), "user", null);
        setIntField(term381483, term381483.getClass(), "eventId", 0);
        setIntField(term381483, term381483.getClass(), "type", 0);
        setIntField(term381483, term381483.getClass(), "musicId", 0);
        setIntField(term381483, term381483.getClass(), "level", 0);
        setIntField(term381483, term381483.getClass(), "techScoreMax", 0);
        setIntField(term381483, term381483.getClass(), "platinumScoreMax", 0);
        setField(term381483, term381483.getClass(), "techRecordDate", null);
        setBooleanField(term381483, term381483.getClass(), "isTechNewRecord", false);
        term381492 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term381492;
        callMethod(klass, "setTechNewRecord", argTypes, term381483, args);
    }

};


