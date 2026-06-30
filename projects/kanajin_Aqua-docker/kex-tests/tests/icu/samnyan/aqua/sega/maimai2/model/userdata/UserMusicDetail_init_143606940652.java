package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class UserMusicDetail_init_143606940652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70862;
     Object term70864;
     Object term70866;
     Object term70868;
     Object term70870;
     Object term70872;
     Object term70874;
     Object term70876;
     Object term70878;

    public UserMusicDetail_init_143606940652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70862 = new Long(0L);
        term70864 = new Integer(0);
        term70866 = new Integer(0);
        term70868 = new Integer(0);
        term70870 = new Integer(0);
        term70872 = new Integer(0);
        term70874 = new Integer(0);
        term70876 = new Integer(0);
        term70878 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        Object[] args = new Object[10];
        args[0] = term70862;
        args[1] = null;
        args[2] = term70864;
        args[3] = term70866;
        args[4] = term70868;
        args[5] = term70870;
        args[6] = term70872;
        args[7] = term70874;
        args[8] = term70876;
        args[9] = term70878;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


