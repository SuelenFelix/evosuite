package skaro.pokeapi.resource.contesttype;

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
import static skaro.pokeapi.resource.contesttype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class ContestType_getName_4629703983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term822;

    public ContestType_getName_4629703983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term823 = new Integer(391863371);
        Object term864 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term867 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term864, term864.getClass(), "name", "");
        setField(term864, term864.getClass(), "color", "");
        setField(term867, term867.getClass(), "name", null);
        setField(term867, term867.getClass(), "url", null);
        setField(term864, term864.getClass(), "language", term867);
        Object term868 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term871 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term868, term868.getClass(), "name", "");
        setField(term868, term868.getClass(), "color", "");
        setField(term871, term871.getClass(), "name", null);
        setField(term871, term871.getClass(), "url", null);
        setField(term868, term868.getClass(), "language", term871);
        Object term872 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term875 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term872, term872.getClass(), "name", "");
        setField(term872, term872.getClass(), "color", "");
        setField(term875, term875.getClass(), "name", null);
        setField(term875, term875.getClass(), "url", null);
        setField(term872, term872.getClass(), "language", term875);
        ArrayList term862 = new ArrayList();
        ((ArrayList) term862).add(term864);
        ((ArrayList) term862).add(term868);
        ((ArrayList) term862).add(term872);
        term822 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestType"));
        Object term837 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term822, term822.getClass(), "id", term823);
        setField(term822, term822.getClass(), "name", "JUmudUmaaV");
        setField(term837, term837.getClass(), "name", "KoyGrUJeJW");
        setField(term837, term837.getClass(), "url", "HqBOwkVqjD");
        setField(term822, term822.getClass(), "berryFlavor", term837);
        setField(term822, term822.getClass(), "names", term862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term822, args);
    }

};


