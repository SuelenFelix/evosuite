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

public class MachineVersionDetail_setMachine_8211733602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80691;
     Object term80730;

    public MachineVersionDetail_setMachine_8211733602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80691 = newInstance(Class.forName("skaro.pokeapi.resource.MachineVersionDetail"));
        Object term80692 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        Object term80705 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term80692, term80692.getClass(), "url", "VkVNOcUvlO");
        setField(term80691, term80691.getClass(), "machine", term80692);
        setField(term80705, term80705.getClass(), "name", "DVBrSfNLwF");
        setField(term80705, term80705.getClass(), "url", "QeeIOyYsmx");
        setField(term80691, term80691.getClass(), "versionGroup", term80705);
        term80730 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        setField(term80730, term80730.getClass(), "url", "oMVmfIrXEu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.MachineVersionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.ApiResource");
        Object[] args = new Object[1];
        args[0] = term80730;
        callMethod(klass, "setMachine", argTypes, term80691, args);
    }

};


