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

public class Berry_getFirmness_35609665617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3097;

    public Berry_getFirmness_35609665617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3098 = new Integer(1557431527);
        Integer term3112 = new Integer(-1504890659);
        Integer term3114 = new Integer(1358829571);
        Integer term3116 = new Integer(991356662);
        Integer term3118 = new Integer(-506958186);
        Integer term3120 = new Integer(-507387516);
        Integer term3122 = new Integer(-1970452551);
        ArrayList term3149 = new ArrayList();
        term3097 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term3124 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3153 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3178 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3097, term3097.getClass(), "id", term3098);
        setField(term3097, term3097.getClass(), "name", "XfRABIFVEp");
        setField(term3097, term3097.getClass(), "growthTime", term3112);
        setField(term3097, term3097.getClass(), "maxHarvest", term3114);
        setField(term3097, term3097.getClass(), "naturalGiftPower", term3116);
        setField(term3097, term3097.getClass(), "size", term3118);
        setField(term3097, term3097.getClass(), "smoothness", term3120);
        setField(term3097, term3097.getClass(), "soilDryness", term3122);
        setField(term3124, term3124.getClass(), "name", "MHGKyEnwKc");
        setField(term3124, term3124.getClass(), "url", "ShIELyuULw");
        setField(term3097, term3097.getClass(), "firmness", term3124);
        setField(term3097, term3097.getClass(), "flavors", term3149);
        setField(term3153, term3153.getClass(), "name", "IpQuOGMgmj");
        setField(term3153, term3153.getClass(), "url", "pJbnHTYrxn");
        setField(term3097, term3097.getClass(), "item", term3153);
        setField(term3178, term3178.getClass(), "name", "iIRsCSYqXH");
        setField(term3178, term3178.getClass(), "url", "nghfqDXyCG");
        setField(term3097, term3097.getClass(), "naturalGiftType", term3178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirmness", argTypes, term3097, args);
    }

};


