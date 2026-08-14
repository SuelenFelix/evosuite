package skaro.pokeapi.resource.encountermethod;

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
import static skaro.pokeapi.resource.encountermethod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class EncounterMethod_setOrder_19691865046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231;
     Object term270;

    public EncounterMethod_setOrder_19691865046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term232 = new Integer(-522618178);
        Integer term246 = new Integer(1134449235);
        Object term250 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term252 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term250, term250.getClass(), "name", "");
        setField(term252, term252.getClass(), "name", null);
        setField(term252, term252.getClass(), "url", null);
        setField(term250, term250.getClass(), "language", term252);
        Object term253 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term255 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term253, term253.getClass(), "name", "");
        setField(term255, term255.getClass(), "name", null);
        setField(term255, term255.getClass(), "url", null);
        setField(term253, term253.getClass(), "language", term255);
        Object term256 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term258 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term256, term256.getClass(), "name", "");
        setField(term258, term258.getClass(), "name", null);
        setField(term258, term258.getClass(), "url", null);
        setField(term256, term256.getClass(), "language", term258);
        Object term259 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term261 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term259, term259.getClass(), "name", "");
        setField(term261, term261.getClass(), "name", null);
        setField(term261, term261.getClass(), "url", null);
        setField(term259, term259.getClass(), "language", term261);
        Object term262 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term264 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term262, term262.getClass(), "name", "");
        setField(term264, term264.getClass(), "name", null);
        setField(term264, term264.getClass(), "url", null);
        setField(term262, term262.getClass(), "language", term264);
        Object term265 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term267 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term265, term265.getClass(), "name", "");
        setField(term267, term267.getClass(), "name", null);
        setField(term267, term267.getClass(), "url", null);
        setField(term265, term265.getClass(), "language", term267);
        ArrayList term248 = new ArrayList();
        ((ArrayList) term248).add(term250);
        ((ArrayList) term248).add(term253);
        ((ArrayList) term248).add(term256);
        ((ArrayList) term248).add(term259);
        ((ArrayList) term248).add(term262);
        ((ArrayList) term248).add(term265);
        term231 = newInstance(Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod"));
        setField(term231, term231.getClass(), "id", term232);
        setField(term231, term231.getClass(), "name", "MLqYREekMl");
        setField(term231, term231.getClass(), "order", term246);
        setField(term231, term231.getClass(), "names", term248);
        term270 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encountermethod.EncounterMethod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term270;
        callMethod(klass, "setOrder", argTypes, term231, args);
    }

};


