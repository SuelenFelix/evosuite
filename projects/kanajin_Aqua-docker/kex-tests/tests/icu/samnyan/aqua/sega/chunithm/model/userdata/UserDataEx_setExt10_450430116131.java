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

public class UserDataEx_setExt10_450430116131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47905;
     Object term47935;

    public UserDataEx_setExt10_450430116131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47905 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDataEx"));
        setLongField(term47905, term47905.getClass(), "id", 0L);
        setField(term47905, term47905.getClass(), "user", null);
        setField(term47905, term47905.getClass(), "compatibleCmVersion", null);
        setIntField(term47905, term47905.getClass(), "medal", 0);
        setIntField(term47905, term47905.getClass(), "mapIconId", 0);
        setIntField(term47905, term47905.getClass(), "voiceId", 0);
        setIntField(term47905, term47905.getClass(), "ext1", 0);
        setIntField(term47905, term47905.getClass(), "ext2", 0);
        setIntField(term47905, term47905.getClass(), "ext3", 0);
        setIntField(term47905, term47905.getClass(), "ext4", 0);
        setIntField(term47905, term47905.getClass(), "ext5", 0);
        setIntField(term47905, term47905.getClass(), "ext6", 0);
        setIntField(term47905, term47905.getClass(), "ext7", 0);
        setIntField(term47905, term47905.getClass(), "ext8", 0);
        setIntField(term47905, term47905.getClass(), "ext9", 0);
        setIntField(term47905, term47905.getClass(), "ext10", 0);
        setIntField(term47905, term47905.getClass(), "ext11", 0);
        setIntField(term47905, term47905.getClass(), "ext12", 0);
        setIntField(term47905, term47905.getClass(), "ext13", 0);
        setIntField(term47905, term47905.getClass(), "ext14", 0);
        setIntField(term47905, term47905.getClass(), "ext15", 0);
        setIntField(term47905, term47905.getClass(), "ext16", 0);
        setIntField(term47905, term47905.getClass(), "ext17", 0);
        setIntField(term47905, term47905.getClass(), "ext18", 0);
        setIntField(term47905, term47905.getClass(), "ext19", 0);
        setIntField(term47905, term47905.getClass(), "ext20", 0);
        setField(term47905, term47905.getClass(), "extStr1", null);
        setField(term47905, term47905.getClass(), "extStr2", null);
        setField(term47905, term47905.getClass(), "extStr3", null);
        setField(term47905, term47905.getClass(), "extStr4", null);
        setField(term47905, term47905.getClass(), "extStr5", null);
        setLongField(term47905, term47905.getClass(), "extLong1", 0L);
        setLongField(term47905, term47905.getClass(), "extLong2", 0L);
        setLongField(term47905, term47905.getClass(), "extLong3", 0L);
        setLongField(term47905, term47905.getClass(), "extLong4", 0L);
        setLongField(term47905, term47905.getClass(), "extLong5", 0L);
        term47935 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDataEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term47935;
        callMethod(klass, "setExt10", argTypes, term47905, args);
    }

};


