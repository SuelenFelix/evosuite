package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class GameMusic_init_50107379429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17545;
     Object term17595;
     Object term17597;

    public GameMusic_init_50107379429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17545 = new Long(7247160664318067468L);
        term17595 = new Integer(-2014576105);
        term17597 = new Integer(1296895584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[12];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        Object[] args = new Object[12];
        args[0] = term17545;
        args[1] = "vgdwrCZczl";
        args[2] = "gKMNrpKBpu";
        args[3] = "ZbHJVEqcoa";
        args[4] = "awDQVEVIKi";
        args[5] = term17595;
        args[6] = term17597;
        args[7] = "HJwNgUzZZR";
        args[8] = "FvUCZgTXhq";
        args[9] = "wWWidPCHzx";
        args[10] = "OwPIiBRuKK";
        args[11] = "sgfGySMODT";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


