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

public class MachineVersionDetail_getMachine_1674038101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80622;

    public MachineVersionDetail_getMachine_1674038101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80622 = newInstance(Class.forName("skaro.pokeapi.resource.MachineVersionDetail"));
        Object term80623 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        Object term80636 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term80623, term80623.getClass(), "url", "MJovsjjSeM");
        setField(term80622, term80622.getClass(), "machine", term80623);
        setField(term80636, term80636.getClass(), "name", "YONpdIaYPl");
        setField(term80636, term80636.getClass(), "url", "xQwJTVPqIz");
        setField(term80622, term80622.getClass(), "versionGroup", term80636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.MachineVersionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMachine", argTypes, term80622, args);
    }

};


