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

public class MoveMetaData_getMaxTurns_179199008311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3096;

    public MoveMetaData_getMaxTurns_179199008311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3147 = new Integer(229204365);
        Integer term3149 = new Integer(-461771056);
        Integer term3151 = new Integer(-243422082);
        Integer term3153 = new Integer(1384592638);
        Integer term3155 = new Integer(-1002370457);
        Integer term3157 = new Integer(-2014576105);
        Integer term3159 = new Integer(1296895584);
        Integer term3161 = new Integer(628918458);
        Integer term3163 = new Integer(-1274456137);
        Integer term3165 = new Integer(1041916673);
        term3096 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term3097 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3122 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3097, term3097.getClass(), "name", "vLerpqavFM");
        setField(term3097, term3097.getClass(), "url", "qnvxzwuGKX");
        setField(term3096, term3096.getClass(), "ailment", term3097);
        setField(term3122, term3122.getClass(), "name", "EdPAvpluZg");
        setField(term3122, term3122.getClass(), "url", "DzHVBMqWtE");
        setField(term3096, term3096.getClass(), "category", term3122);
        setField(term3096, term3096.getClass(), "minHits", term3147);
        setField(term3096, term3096.getClass(), "maxHits", term3149);
        setField(term3096, term3096.getClass(), "minTurns", term3151);
        setField(term3096, term3096.getClass(), "maxTurns", term3153);
        setField(term3096, term3096.getClass(), "drain", term3155);
        setField(term3096, term3096.getClass(), "healing", term3157);
        setField(term3096, term3096.getClass(), "critRate", term3159);
        setField(term3096, term3096.getClass(), "ailmentChance", term3161);
        setField(term3096, term3096.getClass(), "flinchChance", term3163);
        setField(term3096, term3096.getClass(), "statChance", term3165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxTurns", argTypes, term3096, args);
    }

};


