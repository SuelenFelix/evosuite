package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class UserMusicDetail_init_120792780361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188853;
     Object term188855;
     Object term188857;
     Object term188859;
     Object term188861;
     Object term188863;
     Object term188865;
     Object term188867;
     Object term188869;
     Object term188871;
     Object term188873;

    public UserMusicDetail_init_120792780361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188853 = new Long(0L);
        term188855 = new Integer(0);
        term188857 = new Integer(0);
        term188859 = new Integer(0);
        term188861 = new Integer(0);
        term188863 = new Integer(0);
        term188865 = new Boolean(false);
        term188867 = new Integer(0);
        term188869 = new Integer(0);
        term188871 = new Integer(0);
        term188873 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[12];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = boolean.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = int.class;
        Object[] args = new Object[12];
        args[0] = term188853;
        args[1] = null;
        args[2] = term188855;
        args[3] = term188857;
        args[4] = term188859;
        args[5] = term188861;
        args[6] = term188863;
        args[7] = term188865;
        args[8] = term188867;
        args[9] = term188869;
        args[10] = term188871;
        args[11] = term188873;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


