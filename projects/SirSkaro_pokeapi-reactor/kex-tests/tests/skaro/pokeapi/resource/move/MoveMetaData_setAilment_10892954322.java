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

public class MoveMetaData_setAilment_10892954322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2001;
     Object term2072;

    public MoveMetaData_setAilment_10892954322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2052 = new Integer(287287233);
        Integer term2054 = new Integer(962840079);
        Integer term2056 = new Integer(1540719661);
        Integer term2058 = new Integer(1265463001);
        Integer term2060 = new Integer(335112684);
        Integer term2062 = new Integer(1551099402);
        Integer term2064 = new Integer(-2027534003);
        Integer term2066 = new Integer(1063420942);
        Integer term2068 = new Integer(1375330971);
        Integer term2070 = new Integer(-478195677);
        term2001 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term2002 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2027 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2002, term2002.getClass(), "name", "lCyLIcSuom");
        setField(term2002, term2002.getClass(), "url", "CGOpQSZZwI");
        setField(term2001, term2001.getClass(), "ailment", term2002);
        setField(term2027, term2027.getClass(), "name", "ypEdrstygY");
        setField(term2027, term2027.getClass(), "url", "sNQFlATEeQ");
        setField(term2001, term2001.getClass(), "category", term2027);
        setField(term2001, term2001.getClass(), "minHits", term2052);
        setField(term2001, term2001.getClass(), "maxHits", term2054);
        setField(term2001, term2001.getClass(), "minTurns", term2056);
        setField(term2001, term2001.getClass(), "maxTurns", term2058);
        setField(term2001, term2001.getClass(), "drain", term2060);
        setField(term2001, term2001.getClass(), "healing", term2062);
        setField(term2001, term2001.getClass(), "critRate", term2064);
        setField(term2001, term2001.getClass(), "ailmentChance", term2066);
        setField(term2001, term2001.getClass(), "flinchChance", term2068);
        setField(term2001, term2001.getClass(), "statChance", term2070);
        term2072 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2072, term2072.getClass(), "name", "pvDEABOxLt");
        setField(term2072, term2072.getClass(), "url", "beAMpkroCQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term2072;
        callMethod(klass, "setAilment", argTypes, term2001, args);
    }

};


