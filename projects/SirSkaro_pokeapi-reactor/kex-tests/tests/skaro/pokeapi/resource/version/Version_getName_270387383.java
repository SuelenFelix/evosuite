package skaro.pokeapi.resource.version;

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
import static skaro.pokeapi.resource.version.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Version_getName_270387383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;

    public Version_getName_270387383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term179 = new Integer(391863371);
        Object term195 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term197 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term195, term195.getClass(), "name", "");
        setField(term197, term197.getClass(), "name", null);
        setField(term197, term197.getClass(), "url", null);
        setField(term195, term195.getClass(), "language", term197);
        Object term198 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term200 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term198, term198.getClass(), "name", "");
        setField(term200, term200.getClass(), "name", null);
        setField(term200, term200.getClass(), "url", null);
        setField(term198, term198.getClass(), "language", term200);
        Object term201 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term203 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term201, term201.getClass(), "name", "");
        setField(term203, term203.getClass(), "name", null);
        setField(term203, term203.getClass(), "url", null);
        setField(term201, term201.getClass(), "language", term203);
        ArrayList term193 = new ArrayList();
        ((ArrayList) term193).add(term195);
        ((ArrayList) term193).add(term198);
        ((ArrayList) term193).add(term201);
        term178 = newInstance(Class.forName("skaro.pokeapi.resource.version.Version"));
        Object term206 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term178, term178.getClass(), "id", term179);
        setField(term178, term178.getClass(), "name", "SbAoxhfrkn");
        setField(term178, term178.getClass(), "names", term193);
        setField(term206, term206.getClass(), "name", "hxCBltsObl");
        setField(term206, term206.getClass(), "url", "BndsHwAFMv");
        setField(term178, term178.getClass(), "versionGroup", term206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.version.Version");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term178, args);
    }

};


