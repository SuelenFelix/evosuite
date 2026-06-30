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

public class UserMissionPoint_setId_72225112920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12891;
     Object term12895;

    public UserMissionPoint_setId_72225112920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12891 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint"));
        setLongField(term12891, term12891.getClass(), "id", 0L);
        setField(term12891, term12891.getClass(), "user", null);
        setIntField(term12891, term12891.getClass(), "eventId", 0);
        setLongField(term12891, term12891.getClass(), "point", 0L);
        term12895 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term12895;
        callMethod(klass, "setId", argTypes, term12891, args);
    }

};


