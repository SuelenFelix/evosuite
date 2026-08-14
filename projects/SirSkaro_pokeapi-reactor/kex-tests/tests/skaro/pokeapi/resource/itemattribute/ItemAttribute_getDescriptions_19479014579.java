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

public class ItemAttribute_getDescriptions_19479014579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494;

    public ItemAttribute_getDescriptions_19479014579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term495 = new Integer(-1339778481);
        ArrayList term509 = new ArrayList();
        Object term515 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term517 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term515, term515.getClass(), "name", "");
        setField(term517, term517.getClass(), "name", null);
        setField(term517, term517.getClass(), "url", null);
        setField(term515, term515.getClass(), "language", term517);
        Object term518 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term520 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term518, term518.getClass(), "name", "");
        setField(term520, term520.getClass(), "name", null);
        setField(term520, term520.getClass(), "url", null);
        setField(term518, term518.getClass(), "language", term520);
        Object term521 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term523 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term521, term521.getClass(), "name", "");
        setField(term523, term523.getClass(), "name", null);
        setField(term523, term523.getClass(), "url", null);
        setField(term521, term521.getClass(), "language", term523);
        Object term524 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term526 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term524, term524.getClass(), "name", "");
        setField(term526, term526.getClass(), "name", null);
        setField(term526, term526.getClass(), "url", null);
        setField(term524, term524.getClass(), "language", term526);
        Object term527 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term529 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term527, term527.getClass(), "name", "");
        setField(term529, term529.getClass(), "name", null);
        setField(term529, term529.getClass(), "url", null);
        setField(term527, term527.getClass(), "language", term529);
        ArrayList term513 = new ArrayList();
        ((ArrayList) term513).add(term515);
        ((ArrayList) term513).add(term518);
        ((ArrayList) term513).add(term521);
        ((ArrayList) term513).add(term524);
        ((ArrayList) term513).add(term527);
        Object term534 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term536 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term534, term534.getClass(), "description", "");
        setField(term536, term536.getClass(), "name", null);
        setField(term536, term536.getClass(), "url", null);
        setField(term534, term534.getClass(), "language", term536);
        Object term537 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term539 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term537, term537.getClass(), "description", "");
        setField(term539, term539.getClass(), "name", null);
        setField(term539, term539.getClass(), "url", null);
        setField(term537, term537.getClass(), "language", term539);
        Object term540 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term542 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term540, term540.getClass(), "description", "");
        setField(term542, term542.getClass(), "name", null);
        setField(term542, term542.getClass(), "url", null);
        setField(term540, term540.getClass(), "language", term542);
        ArrayList term532 = new ArrayList();
        ((ArrayList) term532).add(term534);
        ((ArrayList) term532).add(term537);
        ((ArrayList) term532).add(term540);
        term494 = newInstance(Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute"));
        setField(term494, term494.getClass(), "id", term495);
        setField(term494, term494.getClass(), "name", "zUlRdimJtU");
        setField(term494, term494.getClass(), "items", term509);
        setField(term494, term494.getClass(), "names", term513);
        setField(term494, term494.getClass(), "descriptions", term532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescriptions", argTypes, term494, args);
    }

};


