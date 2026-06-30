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
import java.lang.Integer;
import java.lang.Boolean;

public class UserMusicDetail_init_102263202785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423481;
     Object term423483;
     Object term423485;
     Object term423487;
     Object term423489;
     Object term423491;
     Object term423493;
     Object term423495;
     Object term423497;
     Object term423499;
     Object term423501;
     Object term423503;
     Object term423505;
     Object term423507;
     Object term423509;
     Object term423511;
     Object term423513;

    public UserMusicDetail_init_102263202785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423481 = new Long(0L);
        term423483 = new Integer(0);
        term423485 = new Integer(0);
        term423487 = new Integer(0);
        term423489 = new Integer(0);
        term423491 = new Integer(0);
        term423493 = new Integer(0);
        term423495 = new Integer(0);
        term423497 = new Integer(0);
        term423499 = new Integer(0);
        term423501 = new Integer(0);
        term423503 = new Boolean(false);
        term423505 = new Boolean(false);
        term423507 = new Boolean(false);
        term423509 = new Boolean(false);
        term423511 = new Integer(0);
        term423513 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[18];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = int.class;
        argTypes[12] = boolean.class;
        argTypes[13] = boolean.class;
        argTypes[14] = boolean.class;
        argTypes[15] = boolean.class;
        argTypes[16] = int.class;
        argTypes[17] = boolean.class;
        Object[] args = new Object[18];
        args[0] = term423481;
        args[1] = null;
        args[2] = term423483;
        args[3] = term423485;
        args[4] = term423487;
        args[5] = term423489;
        args[6] = term423491;
        args[7] = term423493;
        args[8] = term423495;
        args[9] = term423497;
        args[10] = term423499;
        args[11] = term423501;
        args[12] = term423503;
        args[13] = term423505;
        args[14] = term423507;
        args[15] = term423509;
        args[16] = term423511;
        args[17] = term423513;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


