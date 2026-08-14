package skaro.pokeapi.resource.itemattribute;

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
import static skaro.pokeapi.resource.itemattribute.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class ItemAttribute_setName_20927903964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192;

    public ItemAttribute_setName_20927903964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term193 = new Integer(-1922583790);
        ArrayList term207 = new ArrayList();
        Object term213 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term215 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term213, term213.getClass(), "name", "");
        setField(term215, term215.getClass(), "name", null);
        setField(term215, term215.getClass(), "url", null);
        setField(term213, term213.getClass(), "language", term215);
        Object term216 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term218 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term216, term216.getClass(), "name", "");
        setField(term218, term218.getClass(), "name", null);
        setField(term218, term218.getClass(), "url", null);
        setField(term216, term216.getClass(), "language", term218);
        Object term219 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term221 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term219, term219.getClass(), "name", "");
        setField(term221, term221.getClass(), "name", null);
        setField(term221, term221.getClass(), "url", null);
        setField(term219, term219.getClass(), "language", term221);
        Object term222 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term224 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term222, term222.getClass(), "name", "");
        setField(term224, term224.getClass(), "name", null);
        setField(term224, term224.getClass(), "url", null);
        setField(term222, term222.getClass(), "language", term224);
        Object term225 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term227 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term225, term225.getClass(), "name", "");
        setField(term227, term227.getClass(), "name", null);
        setField(term227, term227.getClass(), "url", null);
        setField(term225, term225.getClass(), "language", term227);
        Object term228 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term230 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term228, term228.getClass(), "name", "");
        setField(term230, term230.getClass(), "name", null);
        setField(term230, term230.getClass(), "url", null);
        setField(term228, term228.getClass(), "language", term230);
        ArrayList term211 = new ArrayList();
        ((ArrayList) term211).add(term213);
        ((ArrayList) term211).add(term216);
        ((ArrayList) term211).add(term219);
        ((ArrayList) term211).add(term222);
        ((ArrayList) term211).add(term225);
        ((ArrayList) term211).add(term228);
        Object term235 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term237 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term235, term235.getClass(), "description", "");
        setField(term237, term237.getClass(), "name", null);
        setField(term237, term237.getClass(), "url", null);
        setField(term235, term235.getClass(), "language", term237);
        Object term238 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term240 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term238, term238.getClass(), "description", "");
        setField(term240, term240.getClass(), "name", null);
        setField(term240, term240.getClass(), "url", null);
        setField(term238, term238.getClass(), "language", term240);
        Object term241 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term243 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term241, term241.getClass(), "description", "");
        setField(term243, term243.getClass(), "name", null);
        setField(term243, term243.getClass(), "url", null);
        setField(term241, term241.getClass(), "language", term243);
        Object term244 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term246 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term244, term244.getClass(), "description", "");
        setField(term246, term246.getClass(), "name", null);
        setField(term246, term246.getClass(), "url", null);
        setField(term244, term244.getClass(), "language", term246);
        Object term247 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        setField(term247, term247.getClass(), "description", "");
        setField(term247, term247.getClass(), "language", term240);
        ArrayList term233 = new ArrayList();
        ((ArrayList) term233).add(term235);
        ((ArrayList) term233).add(term238);
        ((ArrayList) term233).add(term241);
        ((ArrayList) term233).add(term244);
        ((ArrayList) term233).add(term247);
        term192 = newInstance(Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute"));
        setField(term192, term192.getClass(), "id", term193);
        setField(term192, term192.getClass(), "name", "OWKQODBLzb");
        setField(term192, term192.getClass(), "items", term207);
        setField(term192, term192.getClass(), "names", term211);
        setField(term192, term192.getClass(), "descriptions", term233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eVpkWxjuki";
        callMethod(klass, "setName", argTypes, term192, args);
    }

};


