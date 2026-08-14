package skaro.pokeapi.resource.berry;

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
import static skaro.pokeapi.resource.berry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Berry_setId_14769453972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197;
     Object term319;

    public Berry_setId_14769453972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term198 = new Integer(1134449235);
        Integer term212 = new Integer(-883034806);
        Integer term214 = new Integer(1585847225);
        Integer term216 = new Integer(597278769);
        Integer term218 = new Integer(-1685132342);
        Integer term220 = new Integer(-1456670397);
        Integer term222 = new Integer(1622346318);
        Integer term252 = new Integer(1048535127);
        Object term251 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term254 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term251, term251.getClass(), "potency", term252);
        setField(term254, term254.getClass(), "name", null);
        setField(term254, term254.getClass(), "url", null);
        setField(term251, term251.getClass(), "flavor", term254);
        Integer term256 = new Integer(-655067527);
        Object term255 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term258 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term255, term255.getClass(), "potency", term256);
        setField(term258, term258.getClass(), "name", null);
        setField(term258, term258.getClass(), "url", null);
        setField(term255, term255.getClass(), "flavor", term258);
        Integer term260 = new Integer(-6029667);
        Object term259 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term262 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term259, term259.getClass(), "potency", term260);
        setField(term262, term262.getClass(), "name", null);
        setField(term262, term262.getClass(), "url", null);
        setField(term259, term259.getClass(), "flavor", term262);
        Integer term264 = new Integer(-2068769794);
        Object term263 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term266 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term263, term263.getClass(), "potency", term264);
        setField(term266, term266.getClass(), "name", null);
        setField(term266, term266.getClass(), "url", null);
        setField(term263, term263.getClass(), "flavor", term266);
        ArrayList term249 = new ArrayList();
        ((ArrayList) term249).add(term251);
        ((ArrayList) term249).add(term255);
        ((ArrayList) term249).add(term259);
        ((ArrayList) term249).add(term263);
        term197 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term224 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term269 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term294 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term197, term197.getClass(), "id", term198);
        setField(term197, term197.getClass(), "name", "tbcdzjIfER");
        setField(term197, term197.getClass(), "growthTime", term212);
        setField(term197, term197.getClass(), "maxHarvest", term214);
        setField(term197, term197.getClass(), "naturalGiftPower", term216);
        setField(term197, term197.getClass(), "size", term218);
        setField(term197, term197.getClass(), "smoothness", term220);
        setField(term197, term197.getClass(), "soilDryness", term222);
        setField(term224, term224.getClass(), "name", "HyxfbSQYBe");
        setField(term224, term224.getClass(), "url", "pCTimMblYc");
        setField(term197, term197.getClass(), "firmness", term224);
        setField(term197, term197.getClass(), "flavors", term249);
        setField(term269, term269.getClass(), "name", "IoAlmYsBwc");
        setField(term269, term269.getClass(), "url", "TEParAifyi");
        setField(term197, term197.getClass(), "item", term269);
        setField(term294, term294.getClass(), "name", "OWDIEULEFu");
        setField(term294, term294.getClass(), "url", "dWRymuLBtr");
        setField(term197, term197.getClass(), "naturalGiftType", term294);
        term319 = new Integer(-117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term319;
        callMethod(klass, "setId", argTypes, term197, args);
    }

};


