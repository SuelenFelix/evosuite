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

public class Location_getGameIndices_109539336713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125168;

    public Location_getGameIndices_109539336713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term125169 = new Integer(-345174419);
        Object term125210 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125212 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125210, term125210.getClass(), "name", "");
        setField(term125212, term125212.getClass(), "name", null);
        setField(term125212, term125212.getClass(), "url", null);
        setField(term125210, term125210.getClass(), "language", term125212);
        Object term125213 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125215 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125213, term125213.getClass(), "name", "");
        setField(term125215, term125215.getClass(), "name", null);
        setField(term125215, term125215.getClass(), "url", null);
        setField(term125213, term125213.getClass(), "language", term125215);
        Object term125216 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125218 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125216, term125216.getClass(), "name", "");
        setField(term125218, term125218.getClass(), "name", null);
        setField(term125218, term125218.getClass(), "url", null);
        setField(term125216, term125216.getClass(), "language", term125218);
        Object term125219 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125221 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125219, term125219.getClass(), "name", "");
        setField(term125221, term125221.getClass(), "name", null);
        setField(term125221, term125221.getClass(), "url", null);
        setField(term125219, term125219.getClass(), "language", term125221);
        Object term125222 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125224 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125222, term125222.getClass(), "name", "");
        setField(term125224, term125224.getClass(), "name", null);
        setField(term125224, term125224.getClass(), "url", null);
        setField(term125222, term125222.getClass(), "language", term125224);
        Object term125225 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125227 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125225, term125225.getClass(), "name", "");
        setField(term125227, term125227.getClass(), "name", null);
        setField(term125227, term125227.getClass(), "url", null);
        setField(term125225, term125225.getClass(), "language", term125227);
        Object term125228 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125230 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125228, term125228.getClass(), "name", "");
        setField(term125230, term125230.getClass(), "name", null);
        setField(term125230, term125230.getClass(), "url", null);
        setField(term125228, term125228.getClass(), "language", term125230);
        Object term125231 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125233 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125231, term125231.getClass(), "name", "");
        setField(term125233, term125233.getClass(), "name", null);
        setField(term125233, term125233.getClass(), "url", null);
        setField(term125231, term125231.getClass(), "language", term125233);
        Object term125234 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term125236 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125234, term125234.getClass(), "name", "");
        setField(term125236, term125236.getClass(), "name", null);
        setField(term125236, term125236.getClass(), "url", null);
        setField(term125234, term125234.getClass(), "language", term125236);
        ArrayList term125208 = new ArrayList();
        ((ArrayList) term125208).add(term125210);
        ((ArrayList) term125208).add(term125213);
        ((ArrayList) term125208).add(term125216);
        ((ArrayList) term125208).add(term125219);
        ((ArrayList) term125208).add(term125222);
        ((ArrayList) term125208).add(term125225);
        ((ArrayList) term125208).add(term125228);
        ((ArrayList) term125208).add(term125231);
        ((ArrayList) term125208).add(term125234);
        ArrayList term125239 = new ArrayList();
        ArrayList term125243 = new ArrayList();
        term125168 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term125183 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term125168, term125168.getClass(), "id", term125169);
        setField(term125168, term125168.getClass(), "name", "ERfROMMcJz");
        setField(term125183, term125183.getClass(), "name", "dJHqfheJnO");
        setField(term125183, term125183.getClass(), "url", "LlMJEHjudq");
        setField(term125168, term125168.getClass(), "region", term125183);
        setField(term125168, term125168.getClass(), "names", term125208);
        setField(term125168, term125168.getClass(), "gameIndices", term125239);
        setField(term125168, term125168.getClass(), "areas", term125243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameIndices", argTypes, term125168, args);
    }

};


