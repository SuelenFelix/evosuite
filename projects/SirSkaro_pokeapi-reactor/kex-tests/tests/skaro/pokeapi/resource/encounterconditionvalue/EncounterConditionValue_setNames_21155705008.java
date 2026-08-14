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
import java.util.LinkedList;

public class EncounterConditionValue_setNames_21155705008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term663;
     Object term725;

    public EncounterConditionValue_setNames_21155705008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term664 = new Integer(1227103734);
        Object term705 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term707 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term705, term705.getClass(), "name", "");
        setField(term707, term707.getClass(), "name", null);
        setField(term707, term707.getClass(), "url", null);
        setField(term705, term705.getClass(), "language", term707);
        Object term708 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term710 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term708, term708.getClass(), "name", "");
        setField(term710, term710.getClass(), "name", null);
        setField(term710, term710.getClass(), "url", null);
        setField(term708, term708.getClass(), "language", term710);
        Object term711 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term713 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term711, term711.getClass(), "name", "");
        setField(term713, term713.getClass(), "name", null);
        setField(term713, term713.getClass(), "url", null);
        setField(term711, term711.getClass(), "language", term713);
        Object term714 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term716 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term714, term714.getClass(), "name", "");
        setField(term716, term716.getClass(), "name", null);
        setField(term716, term716.getClass(), "url", null);
        setField(term714, term714.getClass(), "language", term716);
        Object term717 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term719 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term717, term717.getClass(), "name", "");
        setField(term719, term719.getClass(), "name", null);
        setField(term719, term719.getClass(), "url", null);
        setField(term717, term717.getClass(), "language", term719);
        Object term720 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term722 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term720, term720.getClass(), "name", "");
        setField(term722, term722.getClass(), "name", null);
        setField(term722, term722.getClass(), "url", null);
        setField(term720, term720.getClass(), "language", term722);
        ArrayList term703 = new ArrayList();
        ((ArrayList) term703).add(term705);
        ((ArrayList) term703).add(term708);
        ((ArrayList) term703).add(term711);
        ((ArrayList) term703).add(term714);
        ((ArrayList) term703).add(term717);
        ((ArrayList) term703).add(term720);
        term663 = newInstance(Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue"));
        Object term678 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term663, term663.getClass(), "id", term664);
        setField(term663, term663.getClass(), "name", "sEccwbJKYE");
        setField(term678, term678.getClass(), "name", "AWRooQKkdW");
        setField(term678, term678.getClass(), "url", "vjxIhXHxGR");
        setField(term663, term663.getClass(), "condition", term678);
        setField(term663, term663.getClass(), "names", term703);
        term725 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term725;
        callMethod(klass, "setNames", argTypes, term663, args);
    }

};


