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

public class Location_getRegion_5027333735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term457;

    public Location_getRegion_5027333735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term458 = new Integer(-2068769794);
        Object term499 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term501 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term499, term499.getClass(), "name", "");
        setField(term501, term501.getClass(), "name", null);
        setField(term501, term501.getClass(), "url", null);
        setField(term499, term499.getClass(), "language", term501);
        Object term502 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term504 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term502, term502.getClass(), "name", "");
        setField(term504, term504.getClass(), "name", null);
        setField(term504, term504.getClass(), "url", null);
        setField(term502, term502.getClass(), "language", term504);
        Object term505 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term507 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term505, term505.getClass(), "name", "");
        setField(term507, term507.getClass(), "name", null);
        setField(term507, term507.getClass(), "url", null);
        setField(term505, term505.getClass(), "language", term507);
        Object term508 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term510 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term508, term508.getClass(), "name", "");
        setField(term510, term510.getClass(), "name", null);
        setField(term510, term510.getClass(), "url", null);
        setField(term508, term508.getClass(), "language", term510);
        Object term511 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term513 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term511, term511.getClass(), "name", "");
        setField(term513, term513.getClass(), "name", null);
        setField(term513, term513.getClass(), "url", null);
        setField(term511, term511.getClass(), "language", term513);
        ArrayList term497 = new ArrayList();
        ((ArrayList) term497).add(term499);
        ((ArrayList) term497).add(term502);
        ((ArrayList) term497).add(term505);
        ((ArrayList) term497).add(term508);
        ((ArrayList) term497).add(term511);
        Integer term519 = new Integer(-117576464);
        Object term518 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term521 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term518, term518.getClass(), "gameIndex", term519);
        setField(term521, term521.getClass(), "name", null);
        setField(term521, term521.getClass(), "url", null);
        setField(term518, term518.getClass(), "generation", term521);
        Integer term523 = new Integer(-1007160944);
        Object term522 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term525 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term522, term522.getClass(), "gameIndex", term523);
        setField(term525, term525.getClass(), "name", null);
        setField(term525, term525.getClass(), "url", null);
        setField(term522, term522.getClass(), "generation", term525);
        ArrayList term516 = new ArrayList();
        ((ArrayList) term516).add(term518);
        ((ArrayList) term516).add(term522);
        ArrayList term528 = new ArrayList();
        term457 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term472 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term457, term457.getClass(), "id", term458);
        setField(term457, term457.getClass(), "name", "bWWfajKbEX");
        setField(term472, term472.getClass(), "name", "cAPeiZHKGJ");
        setField(term472, term472.getClass(), "url", "LvJFtLBaxj");
        setField(term457, term457.getClass(), "region", term472);
        setField(term457, term457.getClass(), "names", term497);
        setField(term457, term457.getClass(), "gameIndices", term516);
        setField(term457, term457.getClass(), "areas", term528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion", argTypes, term457, args);
    }

};


