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

public class BerryFlavor_getBarries_15116950566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140423;

    public BerryFlavor_getBarries_15116950566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term140424 = new Integer(-1269934000);
        Integer term140441 = new Integer(-565153319);
        Object term140440 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140443 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140440, term140440.getClass(), "potency", term140441);
        setField(term140443, term140443.getClass(), "name", null);
        setField(term140443, term140443.getClass(), "url", null);
        setField(term140440, term140440.getClass(), "berry", term140443);
        Integer term140445 = new Integer(769522534);
        Object term140444 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140447 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140444, term140444.getClass(), "potency", term140445);
        setField(term140447, term140447.getClass(), "name", null);
        setField(term140447, term140447.getClass(), "url", null);
        setField(term140444, term140444.getClass(), "berry", term140447);
        Integer term140449 = new Integer(-1587006706);
        Object term140448 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140451 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140448, term140448.getClass(), "potency", term140449);
        setField(term140451, term140451.getClass(), "name", null);
        setField(term140451, term140451.getClass(), "url", null);
        setField(term140448, term140448.getClass(), "berry", term140451);
        Integer term140453 = new Integer(-1232437615);
        Object term140452 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140455 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140452, term140452.getClass(), "potency", term140453);
        setField(term140455, term140455.getClass(), "name", null);
        setField(term140455, term140455.getClass(), "url", null);
        setField(term140452, term140452.getClass(), "berry", term140455);
        Integer term140457 = new Integer(-19383762);
        Object term140456 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140459 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140456, term140456.getClass(), "potency", term140457);
        setField(term140459, term140459.getClass(), "name", null);
        setField(term140459, term140459.getClass(), "url", null);
        setField(term140456, term140456.getClass(), "berry", term140459);
        Integer term140461 = new Integer(1225890361);
        Object term140460 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140463 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140460, term140460.getClass(), "potency", term140461);
        setField(term140463, term140463.getClass(), "name", null);
        setField(term140463, term140463.getClass(), "url", null);
        setField(term140460, term140460.getClass(), "berry", term140463);
        Integer term140465 = new Integer(629422211);
        Object term140464 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140467 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140464, term140464.getClass(), "potency", term140465);
        setField(term140467, term140467.getClass(), "name", null);
        setField(term140467, term140467.getClass(), "url", null);
        setField(term140464, term140464.getClass(), "berry", term140467);
        ArrayList term140438 = new ArrayList();
        ((ArrayList) term140438).add(term140440);
        ((ArrayList) term140438).add(term140444);
        ((ArrayList) term140438).add(term140448);
        ((ArrayList) term140438).add(term140452);
        ((ArrayList) term140438).add(term140456);
        ((ArrayList) term140438).add(term140460);
        ((ArrayList) term140438).add(term140464);
        Object term140497 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140499 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140497, term140497.getClass(), "name", "");
        setField(term140499, term140499.getClass(), "name", null);
        setField(term140499, term140499.getClass(), "url", null);
        setField(term140497, term140497.getClass(), "language", term140499);
        ArrayList term140495 = new ArrayList();
        ((ArrayList) term140495).add(term140497);
        term140423 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term140470 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140423, term140423.getClass(), "id", term140424);
        setField(term140423, term140423.getClass(), "name", "luOMBGLyUX");
        setField(term140423, term140423.getClass(), "barries", term140438);
        setField(term140470, term140470.getClass(), "name", "FpszFMQPQO");
        setField(term140470, term140470.getClass(), "url", "hcKyitqhXg");
        setField(term140423, term140423.getClass(), "contestType", term140470);
        setField(term140423, term140423.getClass(), "names", term140495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBarries", argTypes, term140423, args);
    }

};


