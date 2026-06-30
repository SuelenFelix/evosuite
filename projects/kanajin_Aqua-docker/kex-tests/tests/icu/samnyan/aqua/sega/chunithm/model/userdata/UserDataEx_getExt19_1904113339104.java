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

public class UserDataEx_getExt19_1904113339104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47069;

    public UserDataEx_getExt19_1904113339104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47069 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDataEx"));
        setLongField(term47069, term47069.getClass(), "id", 0L);
        setField(term47069, term47069.getClass(), "user", null);
        setField(term47069, term47069.getClass(), "compatibleCmVersion", null);
        setIntField(term47069, term47069.getClass(), "medal", 0);
        setIntField(term47069, term47069.getClass(), "mapIconId", 0);
        setIntField(term47069, term47069.getClass(), "voiceId", 0);
        setIntField(term47069, term47069.getClass(), "ext1", 0);
        setIntField(term47069, term47069.getClass(), "ext2", 0);
        setIntField(term47069, term47069.getClass(), "ext3", 0);
        setIntField(term47069, term47069.getClass(), "ext4", 0);
        setIntField(term47069, term47069.getClass(), "ext5", 0);
        setIntField(term47069, term47069.getClass(), "ext6", 0);
        setIntField(term47069, term47069.getClass(), "ext7", 0);
        setIntField(term47069, term47069.getClass(), "ext8", 0);
        setIntField(term47069, term47069.getClass(), "ext9", 0);
        setIntField(term47069, term47069.getClass(), "ext10", 0);
        setIntField(term47069, term47069.getClass(), "ext11", 0);
        setIntField(term47069, term47069.getClass(), "ext12", 0);
        setIntField(term47069, term47069.getClass(), "ext13", 0);
        setIntField(term47069, term47069.getClass(), "ext14", 0);
        setIntField(term47069, term47069.getClass(), "ext15", 0);
        setIntField(term47069, term47069.getClass(), "ext16", 0);
        setIntField(term47069, term47069.getClass(), "ext17", 0);
        setIntField(term47069, term47069.getClass(), "ext18", 0);
        setIntField(term47069, term47069.getClass(), "ext19", 0);
        setIntField(term47069, term47069.getClass(), "ext20", 0);
        setField(term47069, term47069.getClass(), "extStr1", null);
        setField(term47069, term47069.getClass(), "extStr2", null);
        setField(term47069, term47069.getClass(), "extStr3", null);
        setField(term47069, term47069.getClass(), "extStr4", null);
        setField(term47069, term47069.getClass(), "extStr5", null);
        setLongField(term47069, term47069.getClass(), "extLong1", 0L);
        setLongField(term47069, term47069.getClass(), "extLong2", 0L);
        setLongField(term47069, term47069.getClass(), "extLong3", 0L);
        setLongField(term47069, term47069.getClass(), "extLong4", 0L);
        setLongField(term47069, term47069.getClass(), "extLong5", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDataEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt19", argTypes, term47069, args);
    }

};


