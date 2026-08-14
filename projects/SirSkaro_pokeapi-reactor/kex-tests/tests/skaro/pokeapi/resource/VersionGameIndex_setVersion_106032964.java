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
import java.lang.Object;

public class VersionGameIndex_setVersion_106032964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135568;
     Object term135596;

    public VersionGameIndex_setVersion_106032964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term135569 = new Integer(-938188610);
        term135568 = newInstance(Class.forName("skaro.pokeapi.resource.VersionGameIndex"));
        Object term135571 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term135568, term135568.getClass(), "gameIndex", term135569);
        setField(term135571, term135571.getClass(), "name", "PhOhMdKWyC");
        setField(term135571, term135571.getClass(), "url", "ZbxQrzzgSr");
        setField(term135568, term135568.getClass(), "version", term135571);
        term135596 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term135596, term135596.getClass(), "name", "xQvvsETFbe");
        setField(term135596, term135596.getClass(), "url", "HvZXCbuDzi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionGameIndex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term135596;
        callMethod(klass, "setVersion", argTypes, term135568, args);
    }

};


