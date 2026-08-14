package skaro.pokeapi.resource.movelearnmethod;

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
import static skaro.pokeapi.resource.movelearnmethod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class MoveLearnMethod_getDescriptions_20516181495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260;

    public MoveLearnMethod_getDescriptions_20516181495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term261 = new Integer(-616727354);
        Object term277 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term279 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term277, term277.getClass(), "description", "");
        setField(term279, term279.getClass(), "name", null);
        setField(term279, term279.getClass(), "url", null);
        setField(term277, term277.getClass(), "language", term279);
        Object term280 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term282 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term280, term280.getClass(), "description", "");
        setField(term282, term282.getClass(), "name", null);
        setField(term282, term282.getClass(), "url", null);
        setField(term280, term280.getClass(), "language", term282);
        Object term283 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term285 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term283, term283.getClass(), "description", "");
        setField(term285, term285.getClass(), "name", null);
        setField(term285, term285.getClass(), "url", null);
        setField(term283, term283.getClass(), "language", term285);
        Object term286 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term288 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term286, term286.getClass(), "description", "");
        setField(term288, term288.getClass(), "name", null);
        setField(term288, term288.getClass(), "url", null);
        setField(term286, term286.getClass(), "language", term288);
        Object term289 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term291 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term289, term289.getClass(), "description", "");
        setField(term291, term291.getClass(), "name", null);
        setField(term291, term291.getClass(), "url", null);
        setField(term289, term289.getClass(), "language", term291);
        ArrayList term275 = new ArrayList();
        ((ArrayList) term275).add(term277);
        ((ArrayList) term275).add(term280);
        ((ArrayList) term275).add(term283);
        ((ArrayList) term275).add(term286);
        ((ArrayList) term275).add(term289);
        Object term296 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term298 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term296, term296.getClass(), "name", "");
        setField(term298, term298.getClass(), "name", null);
        setField(term298, term298.getClass(), "url", null);
        setField(term296, term296.getClass(), "language", term298);
        Object term299 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term301 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term299, term299.getClass(), "name", "");
        setField(term301, term301.getClass(), "name", null);
        setField(term301, term301.getClass(), "url", null);
        setField(term299, term299.getClass(), "language", term301);
        ArrayList term294 = new ArrayList();
        ((ArrayList) term294).add(term296);
        ((ArrayList) term294).add(term299);
        ArrayList term304 = new ArrayList();
        term260 = newInstance(Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod"));
        setField(term260, term260.getClass(), "id", term261);
        setField(term260, term260.getClass(), "name", "GVizqqzXpy");
        setField(term260, term260.getClass(), "descriptions", term275);
        setField(term260, term260.getClass(), "names", term294);
        setField(term260, term260.getClass(), "versionGroups", term304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescriptions", argTypes, term260, args);
    }

};


