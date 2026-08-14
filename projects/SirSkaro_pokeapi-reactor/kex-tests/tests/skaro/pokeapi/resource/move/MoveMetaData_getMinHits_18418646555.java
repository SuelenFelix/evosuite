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

public class MoveMetaData_getMinHits_18418646555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2424;

    public MoveMetaData_getMinHits_18418646555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2475 = new Integer(-1347665717);
        Integer term2477 = new Integer(-1888585309);
        Integer term2479 = new Integer(683666002);
        Integer term2481 = new Integer(1596213415);
        Integer term2483 = new Integer(-268815336);
        Integer term2485 = new Integer(-1210583429);
        Integer term2487 = new Integer(-663691365);
        Integer term2489 = new Integer(339854490);
        Integer term2491 = new Integer(-615654495);
        Integer term2493 = new Integer(-1476117762);
        term2424 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term2425 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2450 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2425, term2425.getClass(), "name", "pXdglvyrQe");
        setField(term2425, term2425.getClass(), "url", "OcfNzHYdki");
        setField(term2424, term2424.getClass(), "ailment", term2425);
        setField(term2450, term2450.getClass(), "name", "uPuCVuZYOI");
        setField(term2450, term2450.getClass(), "url", "TweMFhxNdj");
        setField(term2424, term2424.getClass(), "category", term2450);
        setField(term2424, term2424.getClass(), "minHits", term2475);
        setField(term2424, term2424.getClass(), "maxHits", term2477);
        setField(term2424, term2424.getClass(), "minTurns", term2479);
        setField(term2424, term2424.getClass(), "maxTurns", term2481);
        setField(term2424, term2424.getClass(), "drain", term2483);
        setField(term2424, term2424.getClass(), "healing", term2485);
        setField(term2424, term2424.getClass(), "critRate", term2487);
        setField(term2424, term2424.getClass(), "ailmentChance", term2489);
        setField(term2424, term2424.getClass(), "flinchChance", term2491);
        setField(term2424, term2424.getClass(), "statChance", term2493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinHits", argTypes, term2424, args);
    }

};


