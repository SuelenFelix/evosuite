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

public class PastMoveStatValues_getPower_16180282035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481;

    public PastMoveStatValues_getPower_16180282035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term482 = new Integer(1622346318);
        Integer term484 = new Integer(1048535127);
        Integer term486 = new Integer(-655067527);
        Integer term488 = new Integer(-6029667);
        Object term492 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term495 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term492, term492.getClass(), "effect", "");
        setField(term492, term492.getClass(), "shortEffect", "");
        setField(term495, term495.getClass(), "name", null);
        setField(term495, term495.getClass(), "url", null);
        setField(term492, term492.getClass(), "language", term495);
        ArrayList term490 = new ArrayList();
        ((ArrayList) term490).add(term492);
        term481 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term498 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term523 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term481, term481.getClass(), "accuracy", term482);
        setField(term481, term481.getClass(), "effectChance", term484);
        setField(term481, term481.getClass(), "power", term486);
        setField(term481, term481.getClass(), "pp", term488);
        setField(term481, term481.getClass(), "effectEntries", term490);
        setField(term498, term498.getClass(), "name", "cAPeiZHKGJ");
        setField(term498, term498.getClass(), "url", "LvJFtLBaxj");
        setField(term481, term481.getClass(), "type", term498);
        setField(term523, term523.getClass(), "name", "PHvxnGHptP");
        setField(term523, term523.getClass(), "url", "TimdotUuNC");
        setField(term481, term481.getClass(), "versionGroup", term523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPower", argTypes, term481, args);
    }

};


