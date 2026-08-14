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

public class MoveMetaData_getStatChance_83102123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4440;

    public MoveMetaData_getStatChance_83102123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4491 = new Integer(-123338791);
        Integer term4493 = new Integer(-1467089634);
        Integer term4495 = new Integer(413548937);
        Integer term4497 = new Integer(1901317214);
        Integer term4499 = new Integer(1166710220);
        Integer term4501 = new Integer(-1070592289);
        Integer term4503 = new Integer(-1464172784);
        Integer term4505 = new Integer(32185364);
        Integer term4507 = new Integer(1768204942);
        Integer term4509 = new Integer(1252951645);
        term4440 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term4441 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4466 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4441, term4441.getClass(), "name", "IHqvyhMtuM");
        setField(term4441, term4441.getClass(), "url", "dAldIGYAXV");
        setField(term4440, term4440.getClass(), "ailment", term4441);
        setField(term4466, term4466.getClass(), "name", "mLwibAPEsa");
        setField(term4466, term4466.getClass(), "url", "zsWKWiTFuo");
        setField(term4440, term4440.getClass(), "category", term4466);
        setField(term4440, term4440.getClass(), "minHits", term4491);
        setField(term4440, term4440.getClass(), "maxHits", term4493);
        setField(term4440, term4440.getClass(), "minTurns", term4495);
        setField(term4440, term4440.getClass(), "maxTurns", term4497);
        setField(term4440, term4440.getClass(), "drain", term4499);
        setField(term4440, term4440.getClass(), "healing", term4501);
        setField(term4440, term4440.getClass(), "critRate", term4503);
        setField(term4440, term4440.getClass(), "ailmentChance", term4505);
        setField(term4440, term4440.getClass(), "flinchChance", term4507);
        setField(term4440, term4440.getClass(), "statChance", term4509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatChance", argTypes, term4440, args);
    }

};


