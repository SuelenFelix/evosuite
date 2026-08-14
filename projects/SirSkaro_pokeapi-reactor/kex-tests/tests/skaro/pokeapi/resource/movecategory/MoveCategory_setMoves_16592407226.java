package skaro.pokeapi.resource.movecategory;

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
import static skaro.pokeapi.resource.movecategory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class MoveCategory_setMoves_16592407226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253;
     Object term291;

    public MoveCategory_setMoves_16592407226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term254 = new Integer(-1955890973);
        ArrayList term268 = new ArrayList();
        Object term274 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term276 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term274, term274.getClass(), "description", "");
        setField(term276, term276.getClass(), "name", null);
        setField(term276, term276.getClass(), "url", null);
        setField(term274, term274.getClass(), "language", term276);
        Object term277 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term279 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term277, term277.getClass(), "description", "");
        setField(term279, term279.getClass(), "name", null);
        setField(term279, term279.getClass(), "url", null);
        setField(term277, term277.getClass(), "language", term279);
        Object term280 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term282 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term280, term280.getClass(), "description", "");
        setField(term282, term282.getClass(), "name", null);
        setField(term282, term282.getClass(), "url", null);
        setField(term280, term280.getClass(), "language", term282);
        Object term283 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term285 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term283, term283.getClass(), "description", "");
        setField(term285, term285.getClass(), "name", null);
        setField(term285, term285.getClass(), "url", null);
        setField(term283, term283.getClass(), "language", term285);
        Object term286 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term288 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term286, term286.getClass(), "description", "");
        setField(term288, term288.getClass(), "name", null);
        setField(term288, term288.getClass(), "url", null);
        setField(term286, term286.getClass(), "language", term288);
        ArrayList term272 = new ArrayList();
        ((ArrayList) term272).add(term274);
        ((ArrayList) term272).add(term277);
        ((ArrayList) term272).add(term280);
        ((ArrayList) term272).add(term283);
        ((ArrayList) term272).add(term286);
        term253 = newInstance(Class.forName("skaro.pokeapi.resource.movecategory.MoveCategory"));
        setField(term253, term253.getClass(), "id", term254);
        setField(term253, term253.getClass(), "name", "bLPjGVBhlX");
        setField(term253, term253.getClass(), "moves", term268);
        setField(term253, term253.getClass(), "descriptions", term272);
        term291 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movecategory.MoveCategory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term291;
        callMethod(klass, "setMoves", argTypes, term253, args);
    }

};


