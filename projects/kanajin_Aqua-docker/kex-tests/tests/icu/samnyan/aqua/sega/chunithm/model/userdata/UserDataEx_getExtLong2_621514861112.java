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

public class UserDataEx_getExtLong2_621514861112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47309;

    public UserDataEx_getExtLong2_621514861112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47309 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDataEx"));
        setLongField(term47309, term47309.getClass(), "id", 0L);
        setField(term47309, term47309.getClass(), "user", null);
        setField(term47309, term47309.getClass(), "compatibleCmVersion", null);
        setIntField(term47309, term47309.getClass(), "medal", 0);
        setIntField(term47309, term47309.getClass(), "mapIconId", 0);
        setIntField(term47309, term47309.getClass(), "voiceId", 0);
        setIntField(term47309, term47309.getClass(), "ext1", 0);
        setIntField(term47309, term47309.getClass(), "ext2", 0);
        setIntField(term47309, term47309.getClass(), "ext3", 0);
        setIntField(term47309, term47309.getClass(), "ext4", 0);
        setIntField(term47309, term47309.getClass(), "ext5", 0);
        setIntField(term47309, term47309.getClass(), "ext6", 0);
        setIntField(term47309, term47309.getClass(), "ext7", 0);
        setIntField(term47309, term47309.getClass(), "ext8", 0);
        setIntField(term47309, term47309.getClass(), "ext9", 0);
        setIntField(term47309, term47309.getClass(), "ext10", 0);
        setIntField(term47309, term47309.getClass(), "ext11", 0);
        setIntField(term47309, term47309.getClass(), "ext12", 0);
        setIntField(term47309, term47309.getClass(), "ext13", 0);
        setIntField(term47309, term47309.getClass(), "ext14", 0);
        setIntField(term47309, term47309.getClass(), "ext15", 0);
        setIntField(term47309, term47309.getClass(), "ext16", 0);
        setIntField(term47309, term47309.getClass(), "ext17", 0);
        setIntField(term47309, term47309.getClass(), "ext18", 0);
        setIntField(term47309, term47309.getClass(), "ext19", 0);
        setIntField(term47309, term47309.getClass(), "ext20", 0);
        setField(term47309, term47309.getClass(), "extStr1", null);
        setField(term47309, term47309.getClass(), "extStr2", null);
        setField(term47309, term47309.getClass(), "extStr3", null);
        setField(term47309, term47309.getClass(), "extStr4", null);
        setField(term47309, term47309.getClass(), "extStr5", null);
        setLongField(term47309, term47309.getClass(), "extLong1", 0L);
        setLongField(term47309, term47309.getClass(), "extLong2", 0L);
        setLongField(term47309, term47309.getClass(), "extLong3", 0L);
        setLongField(term47309, term47309.getClass(), "extLong4", 0L);
        setLongField(term47309, term47309.getClass(), "extLong5", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDataEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtLong2", argTypes, term47309, args);
    }

};


