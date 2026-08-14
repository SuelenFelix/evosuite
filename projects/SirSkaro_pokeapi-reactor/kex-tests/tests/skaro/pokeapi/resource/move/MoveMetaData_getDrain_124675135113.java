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

public class MoveMetaData_getDrain_124675135113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3320;

    public MoveMetaData_getDrain_124675135113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3371 = new Integer(-506958186);
        Integer term3373 = new Integer(-507387516);
        Integer term3375 = new Integer(-1970452551);
        Integer term3377 = new Integer(-1896376975);
        Integer term3379 = new Integer(729658803);
        Integer term3381 = new Integer(114754804);
        Integer term3383 = new Integer(1687361082);
        Integer term3385 = new Integer(584893196);
        Integer term3387 = new Integer(497269071);
        Integer term3389 = new Integer(-1899301124);
        term3320 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term3321 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3346 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3321, term3321.getClass(), "name", "NTWMiBEaDF");
        setField(term3321, term3321.getClass(), "url", "SPBstwKFVr");
        setField(term3320, term3320.getClass(), "ailment", term3321);
        setField(term3346, term3346.getClass(), "name", "WxYUTuqmIq");
        setField(term3346, term3346.getClass(), "url", "OeQLvhVERT");
        setField(term3320, term3320.getClass(), "category", term3346);
        setField(term3320, term3320.getClass(), "minHits", term3371);
        setField(term3320, term3320.getClass(), "maxHits", term3373);
        setField(term3320, term3320.getClass(), "minTurns", term3375);
        setField(term3320, term3320.getClass(), "maxTurns", term3377);
        setField(term3320, term3320.getClass(), "drain", term3379);
        setField(term3320, term3320.getClass(), "healing", term3381);
        setField(term3320, term3320.getClass(), "critRate", term3383);
        setField(term3320, term3320.getClass(), "ailmentChance", term3385);
        setField(term3320, term3320.getClass(), "flinchChance", term3387);
        setField(term3320, term3320.getClass(), "statChance", term3389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDrain", argTypes, term3320, args);
    }

};


