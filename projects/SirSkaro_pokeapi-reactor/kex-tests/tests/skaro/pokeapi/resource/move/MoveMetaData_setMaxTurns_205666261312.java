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

public class MoveMetaData_setMaxTurns_205666261312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3207;
     Object term3278;

    public MoveMetaData_setMaxTurns_205666261312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3258 = new Integer(-601863069);
        Integer term3260 = new Integer(663292551);
        Integer term3262 = new Integer(-1885090354);
        Integer term3264 = new Integer(-2066804303);
        Integer term3266 = new Integer(-1731761810);
        Integer term3268 = new Integer(197109649);
        Integer term3270 = new Integer(-1239406390);
        Integer term3272 = new Integer(1557431527);
        Integer term3274 = new Integer(-1504890659);
        Integer term3276 = new Integer(1358829571);
        term3207 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term3208 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3233 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3208, term3208.getClass(), "name", "THZSpzBRYP");
        setField(term3208, term3208.getClass(), "url", "ZfBIVGBQOE");
        setField(term3207, term3207.getClass(), "ailment", term3208);
        setField(term3233, term3233.getClass(), "name", "QSrDQfEsTR");
        setField(term3233, term3233.getClass(), "url", "PsqusYmejD");
        setField(term3207, term3207.getClass(), "category", term3233);
        setField(term3207, term3207.getClass(), "minHits", term3258);
        setField(term3207, term3207.getClass(), "maxHits", term3260);
        setField(term3207, term3207.getClass(), "minTurns", term3262);
        setField(term3207, term3207.getClass(), "maxTurns", term3264);
        setField(term3207, term3207.getClass(), "drain", term3266);
        setField(term3207, term3207.getClass(), "healing", term3268);
        setField(term3207, term3207.getClass(), "critRate", term3270);
        setField(term3207, term3207.getClass(), "ailmentChance", term3272);
        setField(term3207, term3207.getClass(), "flinchChance", term3274);
        setField(term3207, term3207.getClass(), "statChance", term3276);
        term3278 = new Integer(991356662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3278;
        callMethod(klass, "setMaxTurns", argTypes, term3207, args);
    }

};


