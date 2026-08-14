package skaro.pokeapi.resource.location;

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
import static skaro.pokeapi.resource.location.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Location_setName_14773389844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;

    public Location_setName_14773389844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term327 = new Integer(597278769);
        Object term368 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term370 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term368, term368.getClass(), "name", "");
        setField(term370, term370.getClass(), "name", null);
        setField(term370, term370.getClass(), "url", null);
        setField(term368, term368.getClass(), "language", term370);
        ArrayList term366 = new ArrayList();
        ((ArrayList) term366).add(term368);
        Integer term376 = new Integer(-1685132342);
        Object term375 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term378 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term375, term375.getClass(), "gameIndex", term376);
        setField(term378, term378.getClass(), "name", null);
        setField(term378, term378.getClass(), "url", null);
        setField(term375, term375.getClass(), "generation", term378);
        Integer term380 = new Integer(-1456670397);
        Object term379 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term382 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term379, term379.getClass(), "gameIndex", term380);
        setField(term382, term382.getClass(), "name", null);
        setField(term382, term382.getClass(), "url", null);
        setField(term379, term379.getClass(), "generation", term382);
        Integer term384 = new Integer(1622346318);
        Object term383 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term386 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term383, term383.getClass(), "gameIndex", term384);
        setField(term386, term386.getClass(), "name", null);
        setField(term386, term386.getClass(), "url", null);
        setField(term383, term383.getClass(), "generation", term386);
        Integer term388 = new Integer(1048535127);
        Object term387 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term390 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term387, term387.getClass(), "gameIndex", term388);
        setField(term390, term390.getClass(), "name", null);
        setField(term390, term390.getClass(), "url", null);
        setField(term387, term387.getClass(), "generation", term390);
        Integer term392 = new Integer(-655067527);
        Object term391 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term394 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term391, term391.getClass(), "gameIndex", term392);
        setField(term394, term394.getClass(), "name", null);
        setField(term394, term394.getClass(), "url", null);
        setField(term391, term391.getClass(), "generation", term394);
        Integer term396 = new Integer(-6029667);
        Object term395 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term398 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term395, term395.getClass(), "gameIndex", term396);
        setField(term398, term398.getClass(), "name", null);
        setField(term398, term398.getClass(), "url", null);
        setField(term395, term395.getClass(), "generation", term398);
        ArrayList term373 = new ArrayList();
        ((ArrayList) term373).add(term375);
        ((ArrayList) term373).add(term379);
        ((ArrayList) term373).add(term383);
        ((ArrayList) term373).add(term387);
        ((ArrayList) term373).add(term391);
        ((ArrayList) term373).add(term395);
        ArrayList term401 = new ArrayList();
        term326 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term341 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term326, term326.getClass(), "id", term327);
        setField(term326, term326.getClass(), "name", "fhkbdRViHi");
        setField(term341, term341.getClass(), "name", "uWHnvSvaPl");
        setField(term341, term341.getClass(), "url", "kBdSllIBVz");
        setField(term326, term326.getClass(), "region", term341);
        setField(term326, term326.getClass(), "names", term366);
        setField(term326, term326.getClass(), "gameIndices", term373);
        setField(term326, term326.getClass(), "areas", term401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jUbSRrkrYZ";
        callMethod(klass, "setName", argTypes, term326, args);
    }

};


