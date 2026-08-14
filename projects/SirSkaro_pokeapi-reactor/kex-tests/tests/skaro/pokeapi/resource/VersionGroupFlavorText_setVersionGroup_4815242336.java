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

public class VersionGroupFlavorText_setVersionGroup_4815242336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132331;
     Object term132394;

    public VersionGroupFlavorText_setVersionGroup_4815242336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132331 = newInstance(Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText"));
        Object term132344 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term132369 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term132331, term132331.getClass(), "text", "utwHLYlfjY");
        setField(term132344, term132344.getClass(), "name", "CocyXlvKGk");
        setField(term132344, term132344.getClass(), "url", "FGRmHabccq");
        setField(term132331, term132331.getClass(), "language", term132344);
        setField(term132369, term132369.getClass(), "name", "VBWKpnBhbU");
        setField(term132369, term132369.getClass(), "url", "EtNxUsJtvI");
        setField(term132331, term132331.getClass(), "versionGroup", term132369);
        term132394 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term132394, term132394.getClass(), "name", "pJFhpyDCLO");
        setField(term132394, term132394.getClass(), "url", "gOeJjiJaCf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionGroupFlavorText");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term132394;
        callMethod(klass, "setVersionGroup", argTypes, term132331, args);
    }

};


