package skaro.pokeapi.resource.supercontesteffect;

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
import static skaro.pokeapi.resource.supercontesteffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class SuperContestEffect_setMoves_14562360148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193;
     Object term214;

    public SuperContestEffect_setMoves_14562360148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term194 = new Integer(-1685132342);
        Integer term196 = new Integer(-1456670397);
        Object term200 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term202 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term203 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term200, term200.getClass(), "flavorText", "");
        setField(term202, term202.getClass(), "name", null);
        setField(term202, term202.getClass(), "url", null);
        setField(term200, term200.getClass(), "language", term202);
        setField(term203, term203.getClass(), "name", null);
        setField(term203, term203.getClass(), "url", null);
        setField(term200, term200.getClass(), "version", term203);
        Object term204 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term206 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term207 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term204, term204.getClass(), "flavorText", "");
        setField(term206, term206.getClass(), "name", null);
        setField(term206, term206.getClass(), "url", null);
        setField(term204, term204.getClass(), "language", term206);
        setField(term207, term207.getClass(), "name", null);
        setField(term207, term207.getClass(), "url", null);
        setField(term204, term204.getClass(), "version", term207);
        ArrayList term198 = new ArrayList();
        ((ArrayList) term198).add(term200);
        ((ArrayList) term198).add(term204);
        ArrayList term210 = new ArrayList();
        term193 = newInstance(Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect"));
        setField(term193, term193.getClass(), "id", term194);
        setField(term193, term193.getClass(), "appeal", term196);
        setField(term193, term193.getClass(), "flavorTextEntries", term198);
        setField(term193, term193.getClass(), "moves", term210);
        term214 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.supercontesteffect.SuperContestEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term214;
        callMethod(klass, "setMoves", argTypes, term193, args);
    }

};


