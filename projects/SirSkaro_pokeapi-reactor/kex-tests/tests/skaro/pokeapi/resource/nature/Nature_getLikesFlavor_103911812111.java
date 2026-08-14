package skaro.pokeapi.resource.nature;

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
import static skaro.pokeapi.resource.nature.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Nature_getLikesFlavor_103911812111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2366;

    public Nature_getLikesFlavor_103911812111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2367 = new Integer(-522618178);
        Object term2483 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2485 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2483, term2483.getClass(), "name", "");
        setField(term2485, term2485.getClass(), "name", null);
        setField(term2485, term2485.getClass(), "url", null);
        setField(term2483, term2483.getClass(), "language", term2485);
        Object term2486 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2488 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2486, term2486.getClass(), "name", "");
        setField(term2488, term2488.getClass(), "name", null);
        setField(term2488, term2488.getClass(), "url", null);
        setField(term2486, term2486.getClass(), "language", term2488);
        Object term2489 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2491 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2489, term2489.getClass(), "name", "");
        setField(term2491, term2491.getClass(), "name", null);
        setField(term2491, term2491.getClass(), "url", null);
        setField(term2489, term2489.getClass(), "language", term2491);
        Object term2492 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2494 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2492, term2492.getClass(), "name", "");
        setField(term2494, term2494.getClass(), "name", null);
        setField(term2494, term2494.getClass(), "url", null);
        setField(term2492, term2492.getClass(), "language", term2494);
        Object term2495 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2497 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2495, term2495.getClass(), "name", "");
        setField(term2497, term2497.getClass(), "name", null);
        setField(term2497, term2497.getClass(), "url", null);
        setField(term2495, term2495.getClass(), "language", term2497);
        Object term2498 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2500 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2498, term2498.getClass(), "name", "");
        setField(term2500, term2500.getClass(), "name", null);
        setField(term2500, term2500.getClass(), "url", null);
        setField(term2498, term2498.getClass(), "language", term2500);
        ArrayList term2481 = new ArrayList();
        ((ArrayList) term2481).add(term2483);
        ((ArrayList) term2481).add(term2486);
        ((ArrayList) term2481).add(term2489);
        ((ArrayList) term2481).add(term2492);
        ((ArrayList) term2481).add(term2495);
        ((ArrayList) term2481).add(term2498);
        term2366 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term2381 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2406 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2431 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2456 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2366, term2366.getClass(), "id", term2367);
        setField(term2366, term2366.getClass(), "name", "CFyoseFGLF");
        setField(term2381, term2381.getClass(), "name", "SFqCrhEWLm");
        setField(term2381, term2381.getClass(), "url", "GZdcJyZntS");
        setField(term2366, term2366.getClass(), "decreasedStat", term2381);
        setField(term2406, term2406.getClass(), "name", "OIHoJeysUi");
        setField(term2406, term2406.getClass(), "url", "WXMWFDGcLB");
        setField(term2366, term2366.getClass(), "increasedStat", term2406);
        setField(term2431, term2431.getClass(), "name", "wKWbJssZuG");
        setField(term2431, term2431.getClass(), "url", "NzBMMhkhpT");
        setField(term2366, term2366.getClass(), "hatesFlavor", term2431);
        setField(term2456, term2456.getClass(), "name", "qCpEbQDHdF");
        setField(term2456, term2456.getClass(), "url", "AHbZyFOmlo");
        setField(term2366, term2366.getClass(), "likesFlavor", term2456);
        setField(term2366, term2366.getClass(), "names", term2481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikesFlavor", argTypes, term2366, args);
    }

};


