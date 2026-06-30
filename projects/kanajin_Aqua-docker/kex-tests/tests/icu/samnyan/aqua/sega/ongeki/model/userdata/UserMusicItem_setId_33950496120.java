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
import java.lang.Long;

public class UserMusicItem_setId_33950496120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6424;
     Object term6428;

    public UserMusicItem_setId_33950496120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6424 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem"));
        setLongField(term6424, term6424.getClass(), "id", 0L);
        setField(term6424, term6424.getClass(), "user", null);
        setIntField(term6424, term6424.getClass(), "musicId", 0);
        setIntField(term6424, term6424.getClass(), "status", 0);
        term6428 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6428;
        callMethod(klass, "setId", argTypes, term6424, args);
    }

};


