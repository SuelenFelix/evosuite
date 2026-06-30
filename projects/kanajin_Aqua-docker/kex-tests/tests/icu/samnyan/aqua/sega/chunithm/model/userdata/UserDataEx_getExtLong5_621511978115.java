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

public class UserDataEx_getExtLong5_621511978115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47399;

    public UserDataEx_getExtLong5_621511978115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47399 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDataEx"));
        setLongField(term47399, term47399.getClass(), "id", 0L);
        setField(term47399, term47399.getClass(), "user", null);
        setField(term47399, term47399.getClass(), "compatibleCmVersion", null);
        setIntField(term47399, term47399.getClass(), "medal", 0);
        setIntField(term47399, term47399.getClass(), "mapIconId", 0);
        setIntField(term47399, term47399.getClass(), "voiceId", 0);
        setIntField(term47399, term47399.getClass(), "ext1", 0);
        setIntField(term47399, term47399.getClass(), "ext2", 0);
        setIntField(term47399, term47399.getClass(), "ext3", 0);
        setIntField(term47399, term47399.getClass(), "ext4", 0);
        setIntField(term47399, term47399.getClass(), "ext5", 0);
        setIntField(term47399, term47399.getClass(), "ext6", 0);
        setIntField(term47399, term47399.getClass(), "ext7", 0);
        setIntField(term47399, term47399.getClass(), "ext8", 0);
        setIntField(term47399, term47399.getClass(), "ext9", 0);
        setIntField(term47399, term47399.getClass(), "ext10", 0);
        setIntField(term47399, term47399.getClass(), "ext11", 0);
        setIntField(term47399, term47399.getClass(), "ext12", 0);
        setIntField(term47399, term47399.getClass(), "ext13", 0);
        setIntField(term47399, term47399.getClass(), "ext14", 0);
        setIntField(term47399, term47399.getClass(), "ext15", 0);
        setIntField(term47399, term47399.getClass(), "ext16", 0);
        setIntField(term47399, term47399.getClass(), "ext17", 0);
        setIntField(term47399, term47399.getClass(), "ext18", 0);
        setIntField(term47399, term47399.getClass(), "ext19", 0);
        setIntField(term47399, term47399.getClass(), "ext20", 0);
        setField(term47399, term47399.getClass(), "extStr1", null);
        setField(term47399, term47399.getClass(), "extStr2", null);
        setField(term47399, term47399.getClass(), "extStr3", null);
        setField(term47399, term47399.getClass(), "extStr4", null);
        setField(term47399, term47399.getClass(), "extStr5", null);
        setLongField(term47399, term47399.getClass(), "extLong1", 0L);
        setLongField(term47399, term47399.getClass(), "extLong2", 0L);
        setLongField(term47399, term47399.getClass(), "extLong3", 0L);
        setLongField(term47399, term47399.getClass(), "extLong4", 0L);
        setLongField(term47399, term47399.getClass(), "extLong5", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDataEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtLong5", argTypes, term47399, args);
    }

};


