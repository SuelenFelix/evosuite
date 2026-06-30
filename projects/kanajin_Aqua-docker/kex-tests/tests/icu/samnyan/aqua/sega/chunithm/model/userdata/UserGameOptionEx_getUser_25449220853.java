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

public class UserGameOptionEx_getUser_25449220853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332495;

    public UserGameOptionEx_getUser_25449220853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term332495 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        setLongField(term332495, term332495.getClass(), "id", 0L);
        setField(term332495, term332495.getClass(), "user", null);
        setIntField(term332495, term332495.getClass(), "ext1", 0);
        setIntField(term332495, term332495.getClass(), "ext2", 0);
        setIntField(term332495, term332495.getClass(), "ext3", 0);
        setIntField(term332495, term332495.getClass(), "ext4", 0);
        setIntField(term332495, term332495.getClass(), "ext5", 0);
        setIntField(term332495, term332495.getClass(), "ext6", 0);
        setIntField(term332495, term332495.getClass(), "ext7", 0);
        setIntField(term332495, term332495.getClass(), "ext8", 0);
        setIntField(term332495, term332495.getClass(), "ext9", 0);
        setIntField(term332495, term332495.getClass(), "ext10", 0);
        setIntField(term332495, term332495.getClass(), "ext11", 0);
        setIntField(term332495, term332495.getClass(), "ext12", 0);
        setIntField(term332495, term332495.getClass(), "ext13", 0);
        setIntField(term332495, term332495.getClass(), "ext14", 0);
        setIntField(term332495, term332495.getClass(), "ext15", 0);
        setIntField(term332495, term332495.getClass(), "ext16", 0);
        setIntField(term332495, term332495.getClass(), "ext17", 0);
        setIntField(term332495, term332495.getClass(), "ext18", 0);
        setIntField(term332495, term332495.getClass(), "ext19", 0);
        setIntField(term332495, term332495.getClass(), "ext20", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term332495, args);
    }

};


