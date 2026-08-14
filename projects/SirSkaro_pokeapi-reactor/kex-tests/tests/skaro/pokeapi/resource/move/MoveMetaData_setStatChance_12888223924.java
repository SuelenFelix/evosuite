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

public class MoveMetaData_setStatChance_12888223924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4551;
     Object term4622;

    public MoveMetaData_setStatChance_12888223924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4602 = new Integer(574481092);
        Integer term4604 = new Integer(-310528004);
        Integer term4606 = new Integer(-634976996);
        Integer term4608 = new Integer(-1015274146);
        Integer term4610 = new Integer(-49052672);
        Integer term4612 = new Integer(339372704);
        Integer term4614 = new Integer(-851097944);
        Integer term4616 = new Integer(803925431);
        Integer term4618 = new Integer(76929641);
        Integer term4620 = new Integer(-2003192918);
        term4551 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term4552 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4577 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4552, term4552.getClass(), "name", "UPUbwyHQKN");
        setField(term4552, term4552.getClass(), "url", "lgQkrXANyI");
        setField(term4551, term4551.getClass(), "ailment", term4552);
        setField(term4577, term4577.getClass(), "name", "MeTmRZXErV");
        setField(term4577, term4577.getClass(), "url", "jNxbVmoZgq");
        setField(term4551, term4551.getClass(), "category", term4577);
        setField(term4551, term4551.getClass(), "minHits", term4602);
        setField(term4551, term4551.getClass(), "maxHits", term4604);
        setField(term4551, term4551.getClass(), "minTurns", term4606);
        setField(term4551, term4551.getClass(), "maxTurns", term4608);
        setField(term4551, term4551.getClass(), "drain", term4610);
        setField(term4551, term4551.getClass(), "healing", term4612);
        setField(term4551, term4551.getClass(), "critRate", term4614);
        setField(term4551, term4551.getClass(), "ailmentChance", term4616);
        setField(term4551, term4551.getClass(), "flinchChance", term4618);
        setField(term4551, term4551.getClass(), "statChance", term4620);
        term4622 = new Integer(-1362856620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4622;
        callMethod(klass, "setStatChance", argTypes, term4551, args);
    }

};


