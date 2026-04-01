package online.devupgrade.sezon2.entities;

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
import static online.devupgrade.sezon2.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class DiscountEntity_getExcluded_212973766110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2306;

    public DiscountEntity_getExcluded_212973766110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2307 = new Integer(1041916673);
        Long term2309 = new Long(1233889271256172047L);
        ArrayList term2311 = new ArrayList();
        ((ArrayList) term2311).add("VeDtgDzGAN");
        Integer term2330 = new Integer(-601863069);
        Object term2329 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term2329, term2329.getClass(), "id", term2330);
        setFloatField(term2329, term2329.getClass(), "price", 0.7799478F);
        setFloatField(term2329, term2329.getClass(), "pricePoPrzecinku", 0.37100673F);
        setBooleanField(term2329, term2329.getClass(), "isPriceGetOnce", false);
        Integer term2336 = new Integer(663292551);
        Object term2335 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term2335, term2335.getClass(), "id", term2336);
        setFloatField(term2335, term2335.getClass(), "price", 0.119950235F);
        setFloatField(term2335, term2335.getClass(), "pricePoPrzecinku", 0.78186196F);
        setBooleanField(term2335, term2335.getClass(), "isPriceGetOnce", true);
        Integer term2342 = new Integer(-1885090354);
        Object term2341 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term2341, term2341.getClass(), "id", term2342);
        setFloatField(term2341, term2341.getClass(), "price", 0.9698374F);
        setFloatField(term2341, term2341.getClass(), "pricePoPrzecinku", 0.04640019F);
        setBooleanField(term2341, term2341.getClass(), "isPriceGetOnce", false);
        Integer term2348 = new Integer(-2066804303);
        Object term2347 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term2347, term2347.getClass(), "id", term2348);
        setFloatField(term2347, term2347.getClass(), "price", 0.7216883F);
        setFloatField(term2347, term2347.getClass(), "pricePoPrzecinku", 0.9123573F);
        setBooleanField(term2347, term2347.getClass(), "isPriceGetOnce", true);
        Integer term2354 = new Integer(-1731761810);
        Object term2353 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term2353, term2353.getClass(), "id", term2354);
        setFloatField(term2353, term2353.getClass(), "price", 0.07144344F);
        setFloatField(term2353, term2353.getClass(), "pricePoPrzecinku", 0.4063537F);
        setBooleanField(term2353, term2353.getClass(), "isPriceGetOnce", false);
        Integer term2360 = new Integer(197109649);
        Object term2359 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term2359, term2359.getClass(), "id", term2360);
        setFloatField(term2359, term2359.getClass(), "price", 0.46776146F);
        setFloatField(term2359, term2359.getClass(), "pricePoPrzecinku", 0.47720432F);
        setBooleanField(term2359, term2359.getClass(), "isPriceGetOnce", false);
        ArrayList term2327 = new ArrayList();
        ((ArrayList) term2327).add(term2329);
        ((ArrayList) term2327).add(term2335);
        ((ArrayList) term2327).add(term2341);
        ((ArrayList) term2327).add(term2347);
        ((ArrayList) term2327).add(term2353);
        ((ArrayList) term2327).add(term2359);
        Integer term2370 = new Integer(-1239406390);
        Object term2369 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term2369, term2369.getClass(), "id", term2370);
        setFloatField(term2369, term2369.getClass(), "price", 0.2877797F);
        setFloatField(term2369, term2369.getClass(), "pricePoPrzecinku", 0.24465042F);
        setBooleanField(term2369, term2369.getClass(), "isPriceGetOnce", true);
        Integer term2376 = new Integer(1557431527);
        Object term2375 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term2375, term2375.getClass(), "id", term2376);
        setFloatField(term2375, term2375.getClass(), "price", 0.110482514F);
        setFloatField(term2375, term2375.getClass(), "pricePoPrzecinku", 0.61427236F);
        setBooleanField(term2375, term2375.getClass(), "isPriceGetOnce", true);
        Integer term2382 = new Integer(-1504890659);
        Object term2381 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term2381, term2381.getClass(), "id", term2382);
        setFloatField(term2381, term2381.getClass(), "price", 0.94188213F);
        setFloatField(term2381, term2381.getClass(), "pricePoPrzecinku", 0.43556267F);
        setBooleanField(term2381, term2381.getClass(), "isPriceGetOnce", true);
        ArrayList term2367 = new ArrayList();
        ((ArrayList) term2367).add(term2369);
        ((ArrayList) term2367).add(term2375);
        ((ArrayList) term2367).add(term2381);
        term2306 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term2306, term2306.getClass(), "id", term2307);
        setField(term2306, term2306.getClass(), "value", term2309);
        setField(term2306, term2306.getClass(), "roles", term2311);
        setField(term2306, term2306.getClass(), "included", term2327);
        setField(term2306, term2306.getClass(), "excluded", term2367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.DiscountEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExcluded", argTypes, term2306, args);
    }

};


