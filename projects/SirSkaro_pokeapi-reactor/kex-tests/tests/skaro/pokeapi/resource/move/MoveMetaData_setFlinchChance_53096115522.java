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

public class MoveMetaData_setFlinchChance_53096115522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4327;
     Object term4398;

    public MoveMetaData_setFlinchChance_53096115522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4378 = new Integer(1050765721);
        Integer term4380 = new Integer(474518942);
        Integer term4382 = new Integer(-1656687479);
        Integer term4384 = new Integer(-249614216);
        Integer term4386 = new Integer(1870727665);
        Integer term4388 = new Integer(-519881101);
        Integer term4390 = new Integer(-680920524);
        Integer term4392 = new Integer(-916335264);
        Integer term4394 = new Integer(-919416536);
        Integer term4396 = new Integer(-43417861);
        term4327 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term4328 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4353 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4328, term4328.getClass(), "name", "xClUIcPECX");
        setField(term4328, term4328.getClass(), "url", "avhRaGZaBF");
        setField(term4327, term4327.getClass(), "ailment", term4328);
        setField(term4353, term4353.getClass(), "name", "JkgoRtImdE");
        setField(term4353, term4353.getClass(), "url", "qFGKIJjlmV");
        setField(term4327, term4327.getClass(), "category", term4353);
        setField(term4327, term4327.getClass(), "minHits", term4378);
        setField(term4327, term4327.getClass(), "maxHits", term4380);
        setField(term4327, term4327.getClass(), "minTurns", term4382);
        setField(term4327, term4327.getClass(), "maxTurns", term4384);
        setField(term4327, term4327.getClass(), "drain", term4386);
        setField(term4327, term4327.getClass(), "healing", term4388);
        setField(term4327, term4327.getClass(), "critRate", term4390);
        setField(term4327, term4327.getClass(), "ailmentChance", term4392);
        setField(term4327, term4327.getClass(), "flinchChance", term4394);
        setField(term4327, term4327.getClass(), "statChance", term4396);
        term4398 = new Integer(-1533843432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4398;
        callMethod(klass, "setFlinchChance", argTypes, term4327, args);
    }

};


