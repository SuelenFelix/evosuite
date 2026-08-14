package skaro.pokeapi.resource.movedamageclass;

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
import static skaro.pokeapi.resource.movedamageclass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class MoveDamageClass_setName_6064560064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195;

    public MoveDamageClass_setName_6064560064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term196 = new Integer(-1922583790);
        Object term212 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term214 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term212, term212.getClass(), "description", "");
        setField(term214, term214.getClass(), "name", null);
        setField(term214, term214.getClass(), "url", null);
        setField(term212, term212.getClass(), "language", term214);
        ArrayList term210 = new ArrayList();
        ((ArrayList) term210).add(term212);
        ArrayList term217 = new ArrayList();
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
        Object term229 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term231 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term229, term229.getClass(), "name", "");
        setField(term231, term231.getClass(), "name", null);
        setField(term231, term231.getClass(), "url", null);
        setField(term229, term229.getClass(), "language", term231);
        Object term232 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term234 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term232, term232.getClass(), "name", "");
        setField(term234, term234.getClass(), "name", null);
        setField(term234, term234.getClass(), "url", null);
        setField(term232, term232.getClass(), "language", term234);
        Object term235 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term237 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term235, term235.getClass(), "name", "");
        setField(term237, term237.getClass(), "name", null);
        setField(term237, term237.getClass(), "url", null);
        setField(term235, term235.getClass(), "language", term237);
        ArrayList term221 = new ArrayList();
        ((ArrayList) term221).add(term223);
        ((ArrayList) term221).add(term226);
        ((ArrayList) term221).add(term229);
        ((ArrayList) term221).add(term232);
        ((ArrayList) term221).add(term235);
        term195 = newInstance(Class.forName("skaro.pokeapi.resource.movedamageclass.MoveDamageClass"));
        setField(term195, term195.getClass(), "id", term196);
        setField(term195, term195.getClass(), "name", "cAPeiZHKGJ");
        setField(term195, term195.getClass(), "descriptions", term210);
        setField(term195, term195.getClass(), "moves", term217);
        setField(term195, term195.getClass(), "names", term221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movedamageclass.MoveDamageClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vjxIhXHxGR";
        callMethod(klass, "setName", argTypes, term195, args);
    }

};


