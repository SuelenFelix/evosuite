package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class Contest_init_1866111196100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75545;
     Object term75547;
     Object term75549;
     Object term75551;
     Object term75553;
     Object term75555;
     Object term75557;
     Object term75559;
     Object term75561;

    public Contest_init_1866111196100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75545 = new Integer(0);
        term75547 = new Boolean(false);
        term75549 = new Integer(0);
        term75551 = new Integer(0);
        term75553 = new Integer(0);
        term75555 = new Integer(0);
        term75557 = new Integer(0);
        term75559 = new Integer(0);
        term75561 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.Contest");
        Class<?>[] argTypes = new Class<?>[22];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestLeague");
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestNormaType");
        argTypes[13] = int.class;
        argTypes[14] = int.class;
        argTypes[15] = int.class;
        argTypes[16] = Class.forName("java.lang.String");
        argTypes[17] = Class.forName("java.lang.String");
        argTypes[18] = Class.forName("java.lang.String");
        argTypes[19] = Class.forName("java.lang.String");
        argTypes[20] = Class.forName("java.lang.String");
        argTypes[21] = Class.forName("java.lang.String");
        Object[] args = new Object[22];
        args[0] = term75545;
        args[1] = term75547;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = term75549;
        args[8] = term75551;
        args[9] = term75553;
        args[10] = term75555;
        args[11] = null;
        args[12] = null;
        args[13] = term75557;
        args[14] = term75559;
        args[15] = term75561;
        args[16] = null;
        args[17] = null;
        args[18] = null;
        args[19] = null;
        args[20] = null;
        args[21] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


