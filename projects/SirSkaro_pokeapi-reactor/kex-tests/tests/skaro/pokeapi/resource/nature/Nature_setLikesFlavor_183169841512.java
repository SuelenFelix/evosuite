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

public class Nature_setLikesFlavor_183169841512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2593;
     Object term2727;

    public Nature_setLikesFlavor_183169841512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2594 = new Integer(1134449235);
        Object term2710 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2712 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2710, term2710.getClass(), "name", "");
        setField(term2712, term2712.getClass(), "name", null);
        setField(term2712, term2712.getClass(), "url", null);
        setField(term2710, term2710.getClass(), "language", term2712);
        Object term2713 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2715 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2713, term2713.getClass(), "name", "");
        setField(term2715, term2715.getClass(), "name", null);
        setField(term2715, term2715.getClass(), "url", null);
        setField(term2713, term2713.getClass(), "language", term2715);
        Object term2716 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2718 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2716, term2716.getClass(), "name", "");
        setField(term2718, term2718.getClass(), "name", null);
        setField(term2718, term2718.getClass(), "url", null);
        setField(term2716, term2716.getClass(), "language", term2718);
        Object term2719 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2721 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2719, term2719.getClass(), "name", "");
        setField(term2721, term2721.getClass(), "name", null);
        setField(term2721, term2721.getClass(), "url", null);
        setField(term2719, term2719.getClass(), "language", term2721);
        Object term2722 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2724 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2722, term2722.getClass(), "name", "");
        setField(term2724, term2724.getClass(), "name", null);
        setField(term2724, term2724.getClass(), "url", null);
        setField(term2722, term2722.getClass(), "language", term2724);
        ArrayList term2708 = new ArrayList();
        ((ArrayList) term2708).add(term2710);
        ((ArrayList) term2708).add(term2713);
        ((ArrayList) term2708).add(term2716);
        ((ArrayList) term2708).add(term2719);
        ((ArrayList) term2708).add(term2722);
        term2593 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term2608 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2633 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2658 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2683 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2593, term2593.getClass(), "id", term2594);
        setField(term2593, term2593.getClass(), "name", "UKAReurpHG");
        setField(term2608, term2608.getClass(), "name", "WVRMUmrljA");
        setField(term2608, term2608.getClass(), "url", "NTlKJDDWlk");
        setField(term2593, term2593.getClass(), "decreasedStat", term2608);
        setField(term2633, term2633.getClass(), "name", "vOuMEpOQAg");
        setField(term2633, term2633.getClass(), "url", "SIODFGaQhr");
        setField(term2593, term2593.getClass(), "increasedStat", term2633);
        setField(term2658, term2658.getClass(), "name", "qYzsiuXOgS");
        setField(term2658, term2658.getClass(), "url", "bxrCBbrrct");
        setField(term2593, term2593.getClass(), "hatesFlavor", term2658);
        setField(term2683, term2683.getClass(), "name", "CKWpJaaaxX");
        setField(term2683, term2683.getClass(), "url", "UBRmXJmfrt");
        setField(term2593, term2593.getClass(), "likesFlavor", term2683);
        setField(term2593, term2593.getClass(), "names", term2708);
        term2727 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2727, term2727.getClass(), "name", "ywmcuThdfL");
        setField(term2727, term2727.getClass(), "url", "GBOEuByOfr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term2727;
        callMethod(klass, "setLikesFlavor", argTypes, term2593, args);
    }

};


