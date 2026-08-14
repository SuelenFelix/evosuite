package skaro.pokeapi.resource.nature;

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
import static skaro.pokeapi.resource.nature.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Nature_getIncreasedStat_9822181637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1393;

    public Nature_getIncreasedStat_9822181637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1394 = new Integer(-2038273078);
        Object term1510 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1512 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1510, term1510.getClass(), "name", "");
        setField(term1512, term1512.getClass(), "name", null);
        setField(term1512, term1512.getClass(), "url", null);
        setField(term1510, term1510.getClass(), "language", term1512);
        Object term1513 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1515 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1513, term1513.getClass(), "name", "");
        setField(term1515, term1515.getClass(), "name", null);
        setField(term1515, term1515.getClass(), "url", null);
        setField(term1513, term1513.getClass(), "language", term1515);
        ArrayList term1508 = new ArrayList();
        ((ArrayList) term1508).add(term1510);
        ((ArrayList) term1508).add(term1513);
        term1393 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term1408 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1433 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1458 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1483 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1393, term1393.getClass(), "id", term1394);
        setField(term1393, term1393.getClass(), "name", "xIeFjkHkOe");
        setField(term1408, term1408.getClass(), "name", "SdCKLMIYnX");
        setField(term1408, term1408.getClass(), "url", "OJJtVNPyKZ");
        setField(term1393, term1393.getClass(), "decreasedStat", term1408);
        setField(term1433, term1433.getClass(), "name", "AKNapTAfmD");
        setField(term1433, term1433.getClass(), "url", "xJgPlLxpgC");
        setField(term1393, term1393.getClass(), "increasedStat", term1433);
        setField(term1458, term1458.getClass(), "name", "EYtfuJaxiM");
        setField(term1458, term1458.getClass(), "url", "gCWtLVKVVe");
        setField(term1393, term1393.getClass(), "hatesFlavor", term1458);
        setField(term1483, term1483.getClass(), "name", "fWKJoSoCwE");
        setField(term1483, term1483.getClass(), "url", "wfaXBpWAUH");
        setField(term1393, term1393.getClass(), "likesFlavor", term1483);
        setField(term1393, term1393.getClass(), "names", term1508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIncreasedStat", argTypes, term1393, args);
    }

};


