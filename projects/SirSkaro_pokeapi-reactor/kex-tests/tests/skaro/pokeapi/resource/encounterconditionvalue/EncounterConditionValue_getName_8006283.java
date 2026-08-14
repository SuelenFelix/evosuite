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

public class EncounterConditionValue_getName_8006283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;

    public EncounterConditionValue_getName_8006283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term179 = new Integer(391863371);
        Object term220 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term222 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term220, term220.getClass(), "name", "");
        setField(term222, term222.getClass(), "name", null);
        setField(term222, term222.getClass(), "url", null);
        setField(term220, term220.getClass(), "language", term222);
        Object term223 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term225 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term223, term223.getClass(), "name", "");
        setField(term225, term225.getClass(), "name", null);
        setField(term225, term225.getClass(), "url", null);
        setField(term223, term223.getClass(), "language", term225);
        Object term226 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term228 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term226, term226.getClass(), "name", "");
        setField(term228, term228.getClass(), "name", null);
        setField(term228, term228.getClass(), "url", null);
        setField(term226, term226.getClass(), "language", term228);
        ArrayList term218 = new ArrayList();
        ((ArrayList) term218).add(term220);
        ((ArrayList) term218).add(term223);
        ((ArrayList) term218).add(term226);
        term178 = newInstance(Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue"));
        Object term193 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term178, term178.getClass(), "id", term179);
        setField(term178, term178.getClass(), "name", "SbAoxhfrkn");
        setField(term193, term193.getClass(), "name", "kuTXqwMtDB");
        setField(term193, term193.getClass(), "url", "Ghbwtircqb");
        setField(term178, term178.getClass(), "condition", term193);
        setField(term178, term178.getClass(), "names", term218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term178, args);
    }

};


