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

public class Location_getName_10977517443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214;

    public Location_getName_10977517443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term215 = new Integer(1227103734);
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
        ArrayList term254 = new ArrayList();
        ((ArrayList) term254).add(term256);
        ((ArrayList) term254).add(term259);
        Integer term267 = new Integer(-1339778481);
        Object term266 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term269 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term266, term266.getClass(), "gameIndex", term267);
        setField(term269, term269.getClass(), "name", null);
        setField(term269, term269.getClass(), "url", null);
        setField(term266, term266.getClass(), "generation", term269);
        Integer term271 = new Integer(1725571209);
        Object term270 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term273 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term270, term270.getClass(), "gameIndex", term271);
        setField(term273, term273.getClass(), "name", null);
        setField(term273, term273.getClass(), "url", null);
        setField(term270, term270.getClass(), "generation", term273);
        Integer term275 = new Integer(-522618178);
        Object term274 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term277 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term274, term274.getClass(), "gameIndex", term275);
        setField(term277, term277.getClass(), "name", null);
        setField(term277, term277.getClass(), "url", null);
        setField(term274, term274.getClass(), "generation", term277);
        Integer term279 = new Integer(1134449235);
        Object term278 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term281 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term278, term278.getClass(), "gameIndex", term279);
        setField(term281, term281.getClass(), "name", null);
        setField(term281, term281.getClass(), "url", null);
        setField(term278, term278.getClass(), "generation", term281);
        Integer term283 = new Integer(-883034806);
        Object term282 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term285 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term282, term282.getClass(), "gameIndex", term283);
        setField(term285, term285.getClass(), "name", null);
        setField(term285, term285.getClass(), "url", null);
        setField(term282, term282.getClass(), "generation", term285);
        Integer term287 = new Integer(1585847225);
        Object term286 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term289 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term286, term286.getClass(), "gameIndex", term287);
        setField(term289, term289.getClass(), "name", null);
        setField(term289, term289.getClass(), "url", null);
        setField(term286, term286.getClass(), "generation", term289);
        ArrayList term264 = new ArrayList();
        ((ArrayList) term264).add(term266);
        ((ArrayList) term264).add(term270);
        ((ArrayList) term264).add(term274);
        ((ArrayList) term264).add(term278);
        ((ArrayList) term264).add(term282);
        ((ArrayList) term264).add(term286);
        ArrayList term292 = new ArrayList();
        term214 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term229 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term214, term214.getClass(), "id", term215);
        setField(term214, term214.getClass(), "name", "hxCBltsObl");
        setField(term229, term229.getClass(), "name", "BndsHwAFMv");
        setField(term229, term229.getClass(), "url", "GzFkzHGYFt");
        setField(term214, term214.getClass(), "region", term229);
        setField(term214, term214.getClass(), "names", term254);
        setField(term214, term214.getClass(), "gameIndices", term264);
        setField(term214, term214.getClass(), "areas", term292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term214, args);
    }

};


