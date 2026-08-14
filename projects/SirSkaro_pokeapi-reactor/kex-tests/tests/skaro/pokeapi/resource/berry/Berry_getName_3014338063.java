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

public class Berry_getName_3014338063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391;

    public Berry_getName_3014338063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term392 = new Integer(-1007160944);
        Integer term406 = new Integer(1135664017);
        Integer term408 = new Integer(590364439);
        Integer term410 = new Integer(865208305);
        Integer term412 = new Integer(-1275173084);
        Integer term414 = new Integer(-244121226);
        Integer term416 = new Integer(-203030934);
        Integer term446 = new Integer(-1179120542);
        Object term445 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term448 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term445, term445.getClass(), "potency", term446);
        setField(term448, term448.getClass(), "name", null);
        setField(term448, term448.getClass(), "url", null);
        setField(term445, term445.getClass(), "flavor", term448);
        Integer term450 = new Integer(-73683645);
        Object term449 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term452 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term449, term449.getClass(), "potency", term450);
        setField(term452, term452.getClass(), "name", null);
        setField(term452, term452.getClass(), "url", null);
        setField(term449, term449.getClass(), "flavor", term452);
        Integer term454 = new Integer(-226514366);
        Object term453 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term456 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term453, term453.getClass(), "potency", term454);
        setField(term456, term456.getClass(), "name", null);
        setField(term456, term456.getClass(), "url", null);
        setField(term453, term453.getClass(), "flavor", term456);
        ArrayList term443 = new ArrayList();
        ((ArrayList) term443).add(term445);
        ((ArrayList) term443).add(term449);
        ((ArrayList) term443).add(term453);
        term391 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term418 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term459 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term484 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term391, term391.getClass(), "id", term392);
        setField(term391, term391.getClass(), "name", "AijpHYOFuy");
        setField(term391, term391.getClass(), "growthTime", term406);
        setField(term391, term391.getClass(), "maxHarvest", term408);
        setField(term391, term391.getClass(), "naturalGiftPower", term410);
        setField(term391, term391.getClass(), "size", term412);
        setField(term391, term391.getClass(), "smoothness", term414);
        setField(term391, term391.getClass(), "soilDryness", term416);
        setField(term418, term418.getClass(), "name", "SbAoxhfrkn");
        setField(term418, term418.getClass(), "url", "kuTXqwMtDB");
        setField(term391, term391.getClass(), "firmness", term418);
        setField(term391, term391.getClass(), "flavors", term443);
        setField(term459, term459.getClass(), "name", "UlajhuVLaP");
        setField(term459, term459.getClass(), "url", "gGSMzuGICf");
        setField(term391, term391.getClass(), "item", term459);
        setField(term484, term484.getClass(), "name", "hxCBltsObl");
        setField(term484, term484.getClass(), "url", "BndsHwAFMv");
        setField(term391, term391.getClass(), "naturalGiftType", term484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term391, args);
    }

};


