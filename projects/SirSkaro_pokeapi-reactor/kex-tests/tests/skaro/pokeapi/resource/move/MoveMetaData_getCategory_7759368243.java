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

public class MoveMetaData_getCategory_7759368243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2157;

    public MoveMetaData_getCategory_7759368243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2208 = new Integer(972867650);
        Integer term2210 = new Integer(1655935355);
        Integer term2212 = new Integer(-481533957);
        Integer term2214 = new Integer(1240914516);
        Integer term2216 = new Integer(-1465035361);
        Integer term2218 = new Integer(1090617576);
        Integer term2220 = new Integer(-1547384488);
        Integer term2222 = new Integer(1442160736);
        Integer term2224 = new Integer(1114000454);
        Integer term2226 = new Integer(-556405712);
        term2157 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term2158 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2183 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2158, term2158.getClass(), "name", "uSUvKAyuvd");
        setField(term2158, term2158.getClass(), "url", "onQLVONGuf");
        setField(term2157, term2157.getClass(), "ailment", term2158);
        setField(term2183, term2183.getClass(), "name", "SOrEHbcbmn");
        setField(term2183, term2183.getClass(), "url", "bnsyeQXFdu");
        setField(term2157, term2157.getClass(), "category", term2183);
        setField(term2157, term2157.getClass(), "minHits", term2208);
        setField(term2157, term2157.getClass(), "maxHits", term2210);
        setField(term2157, term2157.getClass(), "minTurns", term2212);
        setField(term2157, term2157.getClass(), "maxTurns", term2214);
        setField(term2157, term2157.getClass(), "drain", term2216);
        setField(term2157, term2157.getClass(), "healing", term2218);
        setField(term2157, term2157.getClass(), "critRate", term2220);
        setField(term2157, term2157.getClass(), "ailmentChance", term2222);
        setField(term2157, term2157.getClass(), "flinchChance", term2224);
        setField(term2157, term2157.getClass(), "statChance", term2226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term2157, args);
    }

};


