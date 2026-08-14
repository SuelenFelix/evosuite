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
import java.lang.Object;

public class MachineVersionDetail_getVersionGroup_9878393373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80783;

    public MachineVersionDetail_getVersionGroup_9878393373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80783 = newInstance(Class.forName("skaro.pokeapi.resource.MachineVersionDetail"));
        Object term80784 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        Object term80797 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term80784, term80784.getClass(), "url", "wpVzLLfXkK");
        setField(term80783, term80783.getClass(), "machine", term80784);
        setField(term80797, term80797.getClass(), "name", "SEPrgtTBVv");
        setField(term80797, term80797.getClass(), "url", "vtJRIanbwg");
        setField(term80783, term80783.getClass(), "versionGroup", term80797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.MachineVersionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroup", argTypes, term80783, args);
    }

};


