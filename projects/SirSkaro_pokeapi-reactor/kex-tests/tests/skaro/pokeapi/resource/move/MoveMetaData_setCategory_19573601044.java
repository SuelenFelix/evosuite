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

public class MoveMetaData_setCategory_19573601044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2268;
     Object term2339;

    public MoveMetaData_setCategory_19573601044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2319 = new Integer(-1772434990);
        Integer term2321 = new Integer(-1845499264);
        Integer term2323 = new Integer(-505439934);
        Integer term2325 = new Integer(-344842608);
        Integer term2327 = new Integer(941650513);
        Integer term2329 = new Integer(444029505);
        Integer term2331 = new Integer(-1034506028);
        Integer term2333 = new Integer(-1263114719);
        Integer term2335 = new Integer(-894662986);
        Integer term2337 = new Integer(304775596);
        term2268 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term2269 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2294 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2269, term2269.getClass(), "name", "BwtdjiefJn");
        setField(term2269, term2269.getClass(), "url", "jDmhBrIoDa");
        setField(term2268, term2268.getClass(), "ailment", term2269);
        setField(term2294, term2294.getClass(), "name", "SPtPatHeOm");
        setField(term2294, term2294.getClass(), "url", "ywmcuThdfL");
        setField(term2268, term2268.getClass(), "category", term2294);
        setField(term2268, term2268.getClass(), "minHits", term2319);
        setField(term2268, term2268.getClass(), "maxHits", term2321);
        setField(term2268, term2268.getClass(), "minTurns", term2323);
        setField(term2268, term2268.getClass(), "maxTurns", term2325);
        setField(term2268, term2268.getClass(), "drain", term2327);
        setField(term2268, term2268.getClass(), "healing", term2329);
        setField(term2268, term2268.getClass(), "critRate", term2331);
        setField(term2268, term2268.getClass(), "ailmentChance", term2333);
        setField(term2268, term2268.getClass(), "flinchChance", term2335);
        setField(term2268, term2268.getClass(), "statChance", term2337);
        term2339 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2339, term2339.getClass(), "name", "zaloBqlrSo");
        setField(term2339, term2339.getClass(), "url", "vvoLrMGCoN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term2339;
        callMethod(klass, "setCategory", argTypes, term2268, args);
    }

};


