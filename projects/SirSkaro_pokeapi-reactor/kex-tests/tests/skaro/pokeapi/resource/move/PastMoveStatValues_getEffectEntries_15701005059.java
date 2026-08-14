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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class PastMoveStatValues_getEffectEntries_15701005059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term957;

    public PastMoveStatValues_getEffectEntries_15701005059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term958 = new Integer(-1530420153);
        Integer term960 = new Integer(-469968304);
        Integer term962 = new Integer(-1145578966);
        Integer term964 = new Integer(679763016);
        Object term968 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term971 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term968, term968.getClass(), "effect", "");
        setField(term968, term968.getClass(), "shortEffect", "");
        setField(term971, term971.getClass(), "name", null);
        setField(term971, term971.getClass(), "url", null);
        setField(term968, term968.getClass(), "language", term971);
        Object term972 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term975 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term972, term972.getClass(), "effect", "");
        setField(term972, term972.getClass(), "shortEffect", "");
        setField(term975, term975.getClass(), "name", null);
        setField(term975, term975.getClass(), "url", null);
        setField(term972, term972.getClass(), "language", term975);
        Object term976 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term979 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term976, term976.getClass(), "effect", "");
        setField(term976, term976.getClass(), "shortEffect", "");
        setField(term979, term979.getClass(), "name", null);
        setField(term979, term979.getClass(), "url", null);
        setField(term976, term976.getClass(), "language", term979);
        Object term980 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term983 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term980, term980.getClass(), "effect", "");
        setField(term980, term980.getClass(), "shortEffect", "");
        setField(term983, term983.getClass(), "name", null);
        setField(term983, term983.getClass(), "url", null);
        setField(term980, term980.getClass(), "language", term983);
        Object term984 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term987 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term984, term984.getClass(), "effect", "");
        setField(term984, term984.getClass(), "shortEffect", "");
        setField(term987, term987.getClass(), "name", null);
        setField(term987, term987.getClass(), "url", null);
        setField(term984, term984.getClass(), "language", term987);
        Object term988 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term991 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term988, term988.getClass(), "effect", "");
        setField(term988, term988.getClass(), "shortEffect", "");
        setField(term991, term991.getClass(), "name", null);
        setField(term991, term991.getClass(), "url", null);
        setField(term988, term988.getClass(), "language", term991);
        Object term992 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term995 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term992, term992.getClass(), "effect", "");
        setField(term992, term992.getClass(), "shortEffect", "");
        setField(term995, term995.getClass(), "name", null);
        setField(term995, term995.getClass(), "url", null);
        setField(term992, term992.getClass(), "language", term995);
        ArrayList term966 = new ArrayList();
        ((ArrayList) term966).add(term968);
        ((ArrayList) term966).add(term972);
        ((ArrayList) term966).add(term976);
        ((ArrayList) term966).add(term980);
        ((ArrayList) term966).add(term984);
        ((ArrayList) term966).add(term988);
        ((ArrayList) term966).add(term992);
        term957 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term998 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1023 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term957, term957.getClass(), "accuracy", term958);
        setField(term957, term957.getClass(), "effectChance", term960);
        setField(term957, term957.getClass(), "power", term962);
        setField(term957, term957.getClass(), "pp", term964);
        setField(term957, term957.getClass(), "effectEntries", term966);
        setField(term998, term998.getClass(), "name", "RbVQXSpxXy");
        setField(term998, term998.getClass(), "url", "YpJbIgJWWv");
        setField(term957, term957.getClass(), "type", term998);
        setField(term1023, term1023.getClass(), "name", "JppkknKVOw");
        setField(term1023, term1023.getClass(), "url", "iljANwuEjk");
        setField(term957, term957.getClass(), "versionGroup", term1023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectEntries", argTypes, term957, args);
    }

};


