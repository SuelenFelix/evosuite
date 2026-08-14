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

public class Berry_setFirmness_153751993618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3273;
     Object term3387;

    public Berry_setFirmness_153751993618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3274 = new Integer(-1896376975);
        Integer term3288 = new Integer(729658803);
        Integer term3290 = new Integer(114754804);
        Integer term3292 = new Integer(1687361082);
        Integer term3294 = new Integer(584893196);
        Integer term3296 = new Integer(497269071);
        Integer term3298 = new Integer(-1899301124);
        Integer term3328 = new Integer(-1882480155);
        Object term3327 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3330 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3327, term3327.getClass(), "potency", term3328);
        setField(term3330, term3330.getClass(), "name", null);
        setField(term3330, term3330.getClass(), "url", null);
        setField(term3327, term3327.getClass(), "flavor", term3330);
        Integer term3332 = new Integer(-1410220680);
        Object term3331 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3334 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3331, term3331.getClass(), "potency", term3332);
        setField(term3334, term3334.getClass(), "name", null);
        setField(term3334, term3334.getClass(), "url", null);
        setField(term3331, term3331.getClass(), "flavor", term3334);
        ArrayList term3325 = new ArrayList();
        ((ArrayList) term3325).add(term3327);
        ((ArrayList) term3325).add(term3331);
        term3273 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term3300 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3337 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3362 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3273, term3273.getClass(), "id", term3274);
        setField(term3273, term3273.getClass(), "name", "WBAOTqErtm");
        setField(term3273, term3273.getClass(), "growthTime", term3288);
        setField(term3273, term3273.getClass(), "maxHarvest", term3290);
        setField(term3273, term3273.getClass(), "naturalGiftPower", term3292);
        setField(term3273, term3273.getClass(), "size", term3294);
        setField(term3273, term3273.getClass(), "smoothness", term3296);
        setField(term3273, term3273.getClass(), "soilDryness", term3298);
        setField(term3300, term3300.getClass(), "name", "PqtVXXZMqK");
        setField(term3300, term3300.getClass(), "url", "rYbtIDVdnd");
        setField(term3273, term3273.getClass(), "firmness", term3300);
        setField(term3273, term3273.getClass(), "flavors", term3325);
        setField(term3337, term3337.getClass(), "name", "SIODFGaQhr");
        setField(term3337, term3337.getClass(), "url", "qYzsiuXOgS");
        setField(term3273, term3273.getClass(), "item", term3337);
        setField(term3362, term3362.getClass(), "name", "bxrCBbrrct");
        setField(term3362, term3362.getClass(), "url", "CKWpJaaaxX");
        setField(term3273, term3273.getClass(), "naturalGiftType", term3362);
        term3387 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3387, term3387.getClass(), "name", "doQLHkjpNm");
        setField(term3387, term3387.getClass(), "url", "lCyLIcSuom");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term3387;
        callMethod(klass, "setFirmness", argTypes, term3273, args);
    }

};


