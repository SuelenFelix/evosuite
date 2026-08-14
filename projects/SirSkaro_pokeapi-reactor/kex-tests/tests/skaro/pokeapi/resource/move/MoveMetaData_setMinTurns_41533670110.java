package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class MoveMetaData_setMinTurns_41533670110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2983;
     Object term3054;

    public MoveMetaData_setMinTurns_41533670110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3034 = new Integer(-1388471422);
        Integer term3036 = new Integer(-1498296052);
        Integer term3038 = new Integer(2098647989);
        Integer term3040 = new Integer(1598895173);
        Integer term3042 = new Integer(1830648570);
        Integer term3044 = new Integer(-227365013);
        Integer term3046 = new Integer(11724947);
        Integer term3048 = new Integer(1953277050);
        Integer term3050 = new Integer(1283079251);
        Integer term3052 = new Integer(-523949691);
        term2983 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term2984 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3009 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2984, term2984.getClass(), "name", "DPskuFUobI");
        setField(term2984, term2984.getClass(), "url", "wBGfLpNNiZ");
        setField(term2983, term2983.getClass(), "ailment", term2984);
        setField(term3009, term3009.getClass(), "name", "yUGCjlqgJE");
        setField(term3009, term3009.getClass(), "url", "PXdVZyoJyC");
        setField(term2983, term2983.getClass(), "category", term3009);
        setField(term2983, term2983.getClass(), "minHits", term3034);
        setField(term2983, term2983.getClass(), "maxHits", term3036);
        setField(term2983, term2983.getClass(), "minTurns", term3038);
        setField(term2983, term2983.getClass(), "maxTurns", term3040);
        setField(term2983, term2983.getClass(), "drain", term3042);
        setField(term2983, term2983.getClass(), "healing", term3044);
        setField(term2983, term2983.getClass(), "critRate", term3046);
        setField(term2983, term2983.getClass(), "ailmentChance", term3048);
        setField(term2983, term2983.getClass(), "flinchChance", term3050);
        setField(term2983, term2983.getClass(), "statChance", term3052);
        term3054 = new Integer(1398204340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3054;
        callMethod(klass, "setMinTurns", argTypes, term2983, args);
    }

};


