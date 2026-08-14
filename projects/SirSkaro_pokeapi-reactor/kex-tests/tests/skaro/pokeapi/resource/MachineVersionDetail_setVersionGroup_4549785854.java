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

public class MachineVersionDetail_setVersionGroup_4549785854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80852;
     Object term80891;

    public MachineVersionDetail_setVersionGroup_4549785854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80852 = newInstance(Class.forName("skaro.pokeapi.resource.MachineVersionDetail"));
        Object term80853 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        Object term80866 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term80853, term80853.getClass(), "url", "JbrLDrpoAv");
        setField(term80852, term80852.getClass(), "machine", term80853);
        setField(term80866, term80866.getClass(), "name", "kLAYfNPTYi");
        setField(term80866, term80866.getClass(), "url", "bgvEvjROsI");
        setField(term80852, term80852.getClass(), "versionGroup", term80866);
        term80891 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term80891, term80891.getClass(), "name", "inHvGjtHrL");
        setField(term80891, term80891.getClass(), "url", "IkxYpScZwm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.MachineVersionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term80891;
        callMethod(klass, "setVersionGroup", argTypes, term80852, args);
    }

};


