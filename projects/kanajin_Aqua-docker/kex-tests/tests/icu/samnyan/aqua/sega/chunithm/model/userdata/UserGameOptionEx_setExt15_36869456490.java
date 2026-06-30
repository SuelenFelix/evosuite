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
import java.lang.Integer;

public class UserGameOptionEx_setExt15_36869456490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333339;
     Object term333361;

    public UserGameOptionEx_setExt15_36869456490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333339 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        setLongField(term333339, term333339.getClass(), "id", 0L);
        setField(term333339, term333339.getClass(), "user", null);
        setIntField(term333339, term333339.getClass(), "ext1", 0);
        setIntField(term333339, term333339.getClass(), "ext2", 0);
        setIntField(term333339, term333339.getClass(), "ext3", 0);
        setIntField(term333339, term333339.getClass(), "ext4", 0);
        setIntField(term333339, term333339.getClass(), "ext5", 0);
        setIntField(term333339, term333339.getClass(), "ext6", 0);
        setIntField(term333339, term333339.getClass(), "ext7", 0);
        setIntField(term333339, term333339.getClass(), "ext8", 0);
        setIntField(term333339, term333339.getClass(), "ext9", 0);
        setIntField(term333339, term333339.getClass(), "ext10", 0);
        setIntField(term333339, term333339.getClass(), "ext11", 0);
        setIntField(term333339, term333339.getClass(), "ext12", 0);
        setIntField(term333339, term333339.getClass(), "ext13", 0);
        setIntField(term333339, term333339.getClass(), "ext14", 0);
        setIntField(term333339, term333339.getClass(), "ext15", 0);
        setIntField(term333339, term333339.getClass(), "ext16", 0);
        setIntField(term333339, term333339.getClass(), "ext17", 0);
        setIntField(term333339, term333339.getClass(), "ext18", 0);
        setIntField(term333339, term333339.getClass(), "ext19", 0);
        setIntField(term333339, term333339.getClass(), "ext20", 0);
        term333361 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term333361;
        callMethod(klass, "setExt15", argTypes, term333339, args);
    }

};


