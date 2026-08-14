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

public class Berry_getSoilDryness_54610540515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2727;

    public Berry_getSoilDryness_54610540515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2728 = new Integer(-523949691);
        Integer term2742 = new Integer(1398204340);
        Integer term2744 = new Integer(229204365);
        Integer term2746 = new Integer(-461771056);
        Integer term2748 = new Integer(-243422082);
        Integer term2750 = new Integer(1384592638);
        Integer term2752 = new Integer(-1002370457);
        Integer term2782 = new Integer(-2014576105);
        Object term2781 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2784 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2781, term2781.getClass(), "potency", term2782);
        setField(term2784, term2784.getClass(), "name", null);
        setField(term2784, term2784.getClass(), "url", null);
        setField(term2781, term2781.getClass(), "flavor", term2784);
        Integer term2786 = new Integer(1296895584);
        Object term2785 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2788 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2785, term2785.getClass(), "potency", term2786);
        setField(term2788, term2788.getClass(), "name", null);
        setField(term2788, term2788.getClass(), "url", null);
        setField(term2785, term2785.getClass(), "flavor", term2788);
        Integer term2790 = new Integer(628918458);
        Object term2789 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2792 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2789, term2789.getClass(), "potency", term2790);
        setField(term2792, term2792.getClass(), "name", null);
        setField(term2792, term2792.getClass(), "url", null);
        setField(term2789, term2789.getClass(), "flavor", term2792);
        ArrayList term2779 = new ArrayList();
        ((ArrayList) term2779).add(term2781);
        ((ArrayList) term2779).add(term2785);
        ((ArrayList) term2779).add(term2789);
        term2727 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term2754 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2795 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2820 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2727, term2727.getClass(), "id", term2728);
        setField(term2727, term2727.getClass(), "name", "NnpwZBUTvx");
        setField(term2727, term2727.getClass(), "growthTime", term2742);
        setField(term2727, term2727.getClass(), "maxHarvest", term2744);
        setField(term2727, term2727.getClass(), "naturalGiftPower", term2746);
        setField(term2727, term2727.getClass(), "size", term2748);
        setField(term2727, term2727.getClass(), "smoothness", term2750);
        setField(term2727, term2727.getClass(), "soilDryness", term2752);
        setField(term2754, term2754.getClass(), "name", "tlQSNgTkQX");
        setField(term2754, term2754.getClass(), "url", "PCipZnmBOF");
        setField(term2727, term2727.getClass(), "firmness", term2754);
        setField(term2727, term2727.getClass(), "flavors", term2779);
        setField(term2795, term2795.getClass(), "name", "WXMWFDGcLB");
        setField(term2795, term2795.getClass(), "url", "wKWbJssZuG");
        setField(term2727, term2727.getClass(), "item", term2795);
        setField(term2820, term2820.getClass(), "name", "NzBMMhkhpT");
        setField(term2820, term2820.getClass(), "url", "qCpEbQDHdF");
        setField(term2727, term2727.getClass(), "naturalGiftType", term2820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSoilDryness", argTypes, term2727, args);
    }

};


