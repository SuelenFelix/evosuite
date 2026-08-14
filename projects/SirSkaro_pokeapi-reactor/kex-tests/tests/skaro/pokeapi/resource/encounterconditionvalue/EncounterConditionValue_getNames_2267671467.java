package skaro.pokeapi.resource.encounterconditionvalue;

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
import static skaro.pokeapi.resource.encounterconditionvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class EncounterConditionValue_getNames_2267671467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583;

    public EncounterConditionValue_getNames_2267671467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term584 = new Integer(-2038273078);
        Object term625 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term627 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term625, term625.getClass(), "name", "");
        setField(term627, term627.getClass(), "name", null);
        setField(term627, term627.getClass(), "url", null);
        setField(term625, term625.getClass(), "language", term627);
        Object term628 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term630 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term628, term628.getClass(), "name", "");
        setField(term630, term630.getClass(), "name", null);
        setField(term630, term630.getClass(), "url", null);
        setField(term628, term628.getClass(), "language", term630);
        ArrayList term623 = new ArrayList();
        ((ArrayList) term623).add(term625);
        ((ArrayList) term623).add(term628);
        term583 = newInstance(Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue"));
        Object term598 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term583, term583.getClass(), "id", term584);
        setField(term583, term583.getClass(), "name", "GVizqqzXpy");
        setField(term598, term598.getClass(), "name", "JqXGgAhZPl");
        setField(term598, term598.getClass(), "url", "jiKYgYHqIS");
        setField(term583, term583.getClass(), "condition", term598);
        setField(term583, term583.getClass(), "names", term623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term583, args);
    }

};


