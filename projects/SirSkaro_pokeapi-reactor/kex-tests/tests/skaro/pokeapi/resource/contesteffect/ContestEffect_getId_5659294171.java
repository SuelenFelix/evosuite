package skaro.pokeapi.resource.contesteffect;

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
import static skaro.pokeapi.resource.contesteffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class ContestEffect_getId_5659294171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ContestEffect_getId_5659294171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Integer term4 = new Integer(1162663216);
        Integer term6 = new Integer(1484323161);
        Object term10 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term12 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term10, term10.getClass(), "effect", "");
        setField(term12, term12.getClass(), "name", null);
        setField(term12, term12.getClass(), "url", null);
        setField(term10, term10.getClass(), "language", term12);
        Object term13 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term15 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term13, term13.getClass(), "effect", "");
        setField(term15, term15.getClass(), "name", null);
        setField(term15, term15.getClass(), "url", null);
        setField(term13, term13.getClass(), "language", term15);
        Object term16 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term18 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16, term16.getClass(), "effect", "");
        setField(term18, term18.getClass(), "name", null);
        setField(term18, term18.getClass(), "url", null);
        setField(term16, term16.getClass(), "language", term18);
        Object term19 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term21 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19, term19.getClass(), "effect", "");
        setField(term21, term21.getClass(), "name", null);
        setField(term21, term21.getClass(), "url", null);
        setField(term19, term19.getClass(), "language", term21);
        Object term22 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term24 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term22, term22.getClass(), "effect", "");
        setField(term24, term24.getClass(), "name", null);
        setField(term24, term24.getClass(), "url", null);
        setField(term22, term22.getClass(), "language", term24);
        ArrayList term8 = new ArrayList();
        ((ArrayList) term8).add(term10);
        ((ArrayList) term8).add(term13);
        ((ArrayList) term8).add(term16);
        ((ArrayList) term8).add(term19);
        ((ArrayList) term8).add(term22);
        Object term29 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term31 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term32 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term29, term29.getClass(), "flavorText", "");
        setField(term31, term31.getClass(), "name", null);
        setField(term31, term31.getClass(), "url", null);
        setField(term29, term29.getClass(), "language", term31);
        setField(term32, term32.getClass(), "name", null);
        setField(term32, term32.getClass(), "url", null);
        setField(term29, term29.getClass(), "version", term32);
        Object term33 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term35 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term36 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term33, term33.getClass(), "flavorText", "");
        setField(term35, term35.getClass(), "name", null);
        setField(term35, term35.getClass(), "url", null);
        setField(term33, term33.getClass(), "language", term35);
        setField(term36, term36.getClass(), "name", null);
        setField(term36, term36.getClass(), "url", null);
        setField(term33, term33.getClass(), "version", term36);
        Object term37 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term39 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term37, term37.getClass(), "flavorText", "");
        setField(term39, term39.getClass(), "name", null);
        setField(term39, term39.getClass(), "url", null);
        setField(term37, term37.getClass(), "language", term39);
        setField(term37, term37.getClass(), "version", term35);
        Object term40 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        setField(term40, term40.getClass(), "flavorText", "");
        setField(term40, term40.getClass(), "language", term36);
        setField(term40, term40.getClass(), "version", term12);
        ArrayList term27 = new ArrayList();
        ((ArrayList) term27).add(term29);
        ((ArrayList) term27).add(term33);
        ((ArrayList) term27).add(term37);
        ((ArrayList) term27).add(term40);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "appeal", term4);
        setField(term1, term1.getClass(), "jam", term6);
        setField(term1, term1.getClass(), "effectEntries", term8);
        setField(term1, term1.getClass(), "flavorTextEntries", term27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


