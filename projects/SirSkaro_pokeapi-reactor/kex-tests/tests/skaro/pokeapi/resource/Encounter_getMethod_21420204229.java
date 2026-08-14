package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Encounter_getMethod_21420204229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5577;

    public Encounter_getMethod_21420204229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5578 = new Integer(-1674430871);
        Integer term5580 = new Integer(794352120);
        ArrayList term5582 = new ArrayList();
        Integer term5586 = new Integer(340719678);
        term5577 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term5588 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5577, term5577.getClass(), "minLevel", term5578);
        setField(term5577, term5577.getClass(), "maxLevel", term5580);
        setField(term5577, term5577.getClass(), "conditionValues", term5582);
        setField(term5577, term5577.getClass(), "chance", term5586);
        setField(term5588, term5588.getClass(), "name", "WAVMPPbIfL");
        setField(term5588, term5588.getClass(), "url", "GISHLsgALf");
        setField(term5577, term5577.getClass(), "method", term5588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Encounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term5577, args);
    }

};


