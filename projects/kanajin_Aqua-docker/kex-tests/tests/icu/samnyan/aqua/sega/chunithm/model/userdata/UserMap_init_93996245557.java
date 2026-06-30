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
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class UserMap_init_93996245557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291387;
     Object term291389;
     Object term291391;
     Object term291393;
     Object term291395;
     Object term291397;
     Object term291399;
     Object term291401;
     Object term291403;
     Object term291405;

    public UserMap_init_93996245557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291387 = new Long(0L);
        term291389 = new Integer(0);
        term291391 = new Integer(0);
        term291393 = new Boolean(false);
        term291395 = new Integer(0);
        term291397 = new Integer(0);
        term291399 = new Integer(0);
        term291401 = new Integer(0);
        term291403 = new Integer(0);
        term291405 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = boolean.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = boolean.class;
        Object[] args = new Object[11];
        args[0] = term291387;
        args[1] = null;
        args[2] = term291389;
        args[3] = term291391;
        args[4] = term291393;
        args[5] = term291395;
        args[6] = term291397;
        args[7] = term291399;
        args[8] = term291401;
        args[9] = term291403;
        args[10] = term291405;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


