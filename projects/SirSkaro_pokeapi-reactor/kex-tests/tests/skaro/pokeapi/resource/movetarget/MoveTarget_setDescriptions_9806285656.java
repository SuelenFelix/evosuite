package skaro.pokeapi.resource.movetarget;

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
import static skaro.pokeapi.resource.movetarget.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class MoveTarget_setDescriptions_9806285656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333;
     Object term369;

    public MoveTarget_setDescriptions_9806285656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term334 = new Integer(-1955890973);
        Object term350 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term352 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term350, term350.getClass(), "description", "");
        setField(term352, term352.getClass(), "name", null);
        setField(term352, term352.getClass(), "url", null);
        setField(term350, term350.getClass(), "language", term352);
        ArrayList term348 = new ArrayList();
        ((ArrayList) term348).add(term350);
        ArrayList term355 = new ArrayList();
        Object term361 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term363 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term361, term361.getClass(), "name", "");
        setField(term363, term363.getClass(), "name", null);
        setField(term363, term363.getClass(), "url", null);
        setField(term361, term361.getClass(), "language", term363);
        Object term364 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term366 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term364, term364.getClass(), "name", "");
        setField(term366, term366.getClass(), "name", null);
        setField(term366, term366.getClass(), "url", null);
        setField(term364, term364.getClass(), "language", term366);
        ArrayList term359 = new ArrayList();
        ((ArrayList) term359).add(term361);
        ((ArrayList) term359).add(term364);
        term333 = newInstance(Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget"));
        setField(term333, term333.getClass(), "id", term334);
        setField(term333, term333.getClass(), "name", "SdCKLMIYnX");
        setField(term333, term333.getClass(), "descriptions", term348);
        setField(term333, term333.getClass(), "moves", term355);
        setField(term333, term333.getClass(), "names", term359);
        term369 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term369;
        callMethod(klass, "setDescriptions", argTypes, term333, args);
    }

};


