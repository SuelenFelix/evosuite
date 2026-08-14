package skaro.pokeapi.resource.berryflavor;

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
import static skaro.pokeapi.resource.berryflavor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class BerryFlavor_getId_10038158291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;

    public BerryFlavor_getId_10038158291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term245 = new Integer(-616727354);
        Integer term262 = new Integer(-1955890973);
        Object term261 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term264 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term261, term261.getClass(), "potency", term262);
        setField(term264, term264.getClass(), "name", null);
        setField(term264, term264.getClass(), "url", null);
        setField(term261, term261.getClass(), "berry", term264);
        Integer term266 = new Integer(-2038273078);
        Object term265 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term268 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term265, term265.getClass(), "potency", term266);
        setField(term268, term268.getClass(), "name", null);
        setField(term268, term268.getClass(), "url", null);
        setField(term265, term265.getClass(), "berry", term268);
        Integer term270 = new Integer(1227103734);
        Object term269 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term272 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term269, term269.getClass(), "potency", term270);
        setField(term272, term272.getClass(), "name", null);
        setField(term272, term272.getClass(), "url", null);
        setField(term269, term269.getClass(), "berry", term272);
        Integer term274 = new Integer(-1339778481);
        Object term273 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term276 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term273, term273.getClass(), "potency", term274);
        setField(term276, term276.getClass(), "name", null);
        setField(term276, term276.getClass(), "url", null);
        setField(term273, term273.getClass(), "berry", term276);
        Integer term278 = new Integer(1725571209);
        Object term277 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term280 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term277, term277.getClass(), "potency", term278);
        setField(term280, term280.getClass(), "name", null);
        setField(term280, term280.getClass(), "url", null);
        setField(term277, term277.getClass(), "berry", term280);
        ArrayList term259 = new ArrayList();
        ((ArrayList) term259).add(term261);
        ((ArrayList) term259).add(term265);
        ((ArrayList) term259).add(term269);
        ((ArrayList) term259).add(term273);
        ((ArrayList) term259).add(term277);
        Object term310 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term312 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term310, term310.getClass(), "name", "");
        setField(term312, term312.getClass(), "name", null);
        setField(term312, term312.getClass(), "url", null);
        setField(term310, term310.getClass(), "language", term312);
        Object term313 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term315 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term313, term313.getClass(), "name", "");
        setField(term315, term315.getClass(), "name", null);
        setField(term315, term315.getClass(), "url", null);
        setField(term313, term313.getClass(), "language", term315);
        Object term316 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term318 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term316, term316.getClass(), "name", "");
        setField(term318, term318.getClass(), "name", null);
        setField(term318, term318.getClass(), "url", null);
        setField(term316, term316.getClass(), "language", term318);
        Object term319 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term321 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term319, term319.getClass(), "name", "");
        setField(term321, term321.getClass(), "name", null);
        setField(term321, term321.getClass(), "url", null);
        setField(term319, term319.getClass(), "language", term321);
        ArrayList term308 = new ArrayList();
        ((ArrayList) term308).add(term310);
        ((ArrayList) term308).add(term313);
        ((ArrayList) term308).add(term316);
        ((ArrayList) term308).add(term319);
        term244 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term283 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term244, term244.getClass(), "id", term245);
        setField(term244, term244.getClass(), "name", "MxlszYVzRf");
        setField(term244, term244.getClass(), "barries", term259);
        setField(term283, term283.getClass(), "name", "eZFUvlxvGV");
        setField(term283, term283.getClass(), "url", "BYqFIqCKAV");
        setField(term244, term244.getClass(), "contestType", term283);
        setField(term244, term244.getClass(), "names", term308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term244, args);
    }

};


