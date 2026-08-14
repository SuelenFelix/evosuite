package skaro.pokeapi.resource.movelearnmethod;

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
import static skaro.pokeapi.resource.movelearnmethod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class MoveLearnMethod_setDescriptions_17087287376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318;
     Object term348;

    public MoveLearnMethod_setDescriptions_17087287376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term319 = new Integer(-1955890973);
        Object term335 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term337 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term335, term335.getClass(), "description", "");
        setField(term337, term337.getClass(), "name", null);
        setField(term337, term337.getClass(), "url", null);
        setField(term335, term335.getClass(), "language", term337);
        ArrayList term333 = new ArrayList();
        ((ArrayList) term333).add(term335);
        ArrayList term340 = new ArrayList();
        ArrayList term344 = new ArrayList();
        term318 = newInstance(Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod"));
        setField(term318, term318.getClass(), "id", term319);
        setField(term318, term318.getClass(), "name", "yGtHPyvYiQ");
        setField(term318, term318.getClass(), "descriptions", term333);
        setField(term318, term318.getClass(), "names", term340);
        setField(term318, term318.getClass(), "versionGroups", term344);
        term348 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term348;
        callMethod(klass, "setDescriptions", argTypes, term318, args);
    }

};


