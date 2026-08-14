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
import java.util.LinkedList;

public class Encounter_setConditionValues_12849935596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5404;
     Object term5440;

    public Encounter_setConditionValues_12849935596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5405 = new Integer(-1626451656);
        Integer term5407 = new Integer(173952451);
        ArrayList term5409 = new ArrayList();
        Integer term5413 = new Integer(-1972033388);
        term5404 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term5415 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5404, term5404.getClass(), "minLevel", term5405);
        setField(term5404, term5404.getClass(), "maxLevel", term5407);
        setField(term5404, term5404.getClass(), "conditionValues", term5409);
        setField(term5404, term5404.getClass(), "chance", term5413);
        setField(term5415, term5415.getClass(), "name", "Yrvtdcltri");
        setField(term5415, term5415.getClass(), "url", "RxrsjXRVcT");
        setField(term5404, term5404.getClass(), "method", term5415);
        term5440 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.Encounter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term5440;
        callMethod(klass, "setConditionValues", argTypes, term5404, args);
    }

};


