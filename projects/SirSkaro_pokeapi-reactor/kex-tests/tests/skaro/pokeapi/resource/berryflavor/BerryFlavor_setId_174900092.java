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

public class BerryFlavor_setId_174900092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354;
     Object term426;

    public BerryFlavor_setId_174900092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term355 = new Integer(-522618178);
        Integer term372 = new Integer(1134449235);
        Object term371 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term374 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term371, term371.getClass(), "potency", term372);
        setField(term374, term374.getClass(), "name", null);
        setField(term374, term374.getClass(), "url", null);
        setField(term371, term371.getClass(), "berry", term374);
        Integer term376 = new Integer(-883034806);
        Object term375 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term378 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term375, term375.getClass(), "potency", term376);
        setField(term378, term378.getClass(), "name", null);
        setField(term378, term378.getClass(), "url", null);
        setField(term375, term375.getClass(), "berry", term378);
        Integer term380 = new Integer(1585847225);
        Object term379 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term382 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term379, term379.getClass(), "potency", term380);
        setField(term382, term382.getClass(), "name", null);
        setField(term382, term382.getClass(), "url", null);
        setField(term379, term379.getClass(), "berry", term382);
        ArrayList term369 = new ArrayList();
        ((ArrayList) term369).add(term371);
        ((ArrayList) term369).add(term375);
        ((ArrayList) term369).add(term379);
        Object term412 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term414 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term412, term412.getClass(), "name", "");
        setField(term414, term414.getClass(), "name", null);
        setField(term414, term414.getClass(), "url", null);
        setField(term412, term412.getClass(), "language", term414);
        Object term415 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term417 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term415, term415.getClass(), "name", "");
        setField(term417, term417.getClass(), "name", null);
        setField(term417, term417.getClass(), "url", null);
        setField(term415, term415.getClass(), "language", term417);
        Object term418 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term420 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term418, term418.getClass(), "name", "");
        setField(term420, term420.getClass(), "name", null);
        setField(term420, term420.getClass(), "url", null);
        setField(term418, term418.getClass(), "language", term420);
        Object term421 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term423 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term421, term421.getClass(), "name", "");
        setField(term423, term423.getClass(), "name", null);
        setField(term423, term423.getClass(), "url", null);
        setField(term421, term421.getClass(), "language", term423);
        ArrayList term410 = new ArrayList();
        ((ArrayList) term410).add(term412);
        ((ArrayList) term410).add(term415);
        ((ArrayList) term410).add(term418);
        ((ArrayList) term410).add(term421);
        term354 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term385 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term354, term354.getClass(), "id", term355);
        setField(term354, term354.getClass(), "name", "IDCWpPLRkE");
        setField(term354, term354.getClass(), "barries", term369);
        setField(term385, term385.getClass(), "name", "BndsHwAFMv");
        setField(term385, term385.getClass(), "url", "GzFkzHGYFt");
        setField(term354, term354.getClass(), "contestType", term385);
        setField(term354, term354.getClass(), "names", term410);
        term426 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term426;
        callMethod(klass, "setId", argTypes, term354, args);
    }

};


