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

public class MoveCategory_setName_17411300404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144;

    public MoveCategory_setName_17411300404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term145 = new Integer(-1922583790);
        ArrayList term159 = new ArrayList();
        Object term165 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term167 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term165, term165.getClass(), "description", "");
        setField(term167, term167.getClass(), "name", null);
        setField(term167, term167.getClass(), "url", null);
        setField(term165, term165.getClass(), "language", term167);
        Object term168 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term170 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term168, term168.getClass(), "description", "");
        setField(term170, term170.getClass(), "name", null);
        setField(term170, term170.getClass(), "url", null);
        setField(term168, term168.getClass(), "language", term170);
        Object term171 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term173 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term171, term171.getClass(), "description", "");
        setField(term173, term173.getClass(), "name", null);
        setField(term173, term173.getClass(), "url", null);
        setField(term171, term171.getClass(), "language", term173);
        Object term174 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term176 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term174, term174.getClass(), "description", "");
        setField(term176, term176.getClass(), "name", null);
        setField(term176, term176.getClass(), "url", null);
        setField(term174, term174.getClass(), "language", term176);
        Object term177 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term179 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term177, term177.getClass(), "description", "");
        setField(term179, term179.getClass(), "name", null);
        setField(term179, term179.getClass(), "url", null);
        setField(term177, term177.getClass(), "language", term179);
        Object term180 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term182 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term180, term180.getClass(), "description", "");
        setField(term182, term182.getClass(), "name", null);
        setField(term182, term182.getClass(), "url", null);
        setField(term180, term180.getClass(), "language", term182);
        ArrayList term163 = new ArrayList();
        ((ArrayList) term163).add(term165);
        ((ArrayList) term163).add(term168);
        ((ArrayList) term163).add(term171);
        ((ArrayList) term163).add(term174);
        ((ArrayList) term163).add(term177);
        ((ArrayList) term163).add(term180);
        term144 = newInstance(Class.forName("skaro.pokeapi.resource.movecategory.MoveCategory"));
        setField(term144, term144.getClass(), "id", term145);
        setField(term144, term144.getClass(), "name", "GzFkzHGYFt");
        setField(term144, term144.getClass(), "moves", term159);
        setField(term144, term144.getClass(), "descriptions", term163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movecategory.MoveCategory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fhkbdRViHi";
        callMethod(klass, "setName", argTypes, term144, args);
    }

};


