package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class PastMoveStatValues_getAccuracy_7997127151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public PastMoveStatValues_getAccuracy_7997127151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Integer term4 = new Integer(1162663216);
        Integer term6 = new Integer(1484323161);
        Integer term8 = new Integer(391863371);
        Object term12 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term15 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term12, term12.getClass(), "effect", "");
        setField(term12, term12.getClass(), "shortEffect", "");
        setField(term15, term15.getClass(), "name", null);
        setField(term15, term15.getClass(), "url", null);
        setField(term12, term12.getClass(), "language", term15);
        Object term16 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term19 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16, term16.getClass(), "effect", "");
        setField(term16, term16.getClass(), "shortEffect", "");
        setField(term19, term19.getClass(), "name", null);
        setField(term19, term19.getClass(), "url", null);
        setField(term16, term16.getClass(), "language", term19);
        Object term20 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term23 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term20, term20.getClass(), "effect", "");
        setField(term20, term20.getClass(), "shortEffect", "");
        setField(term23, term23.getClass(), "name", null);
        setField(term23, term23.getClass(), "url", null);
        setField(term20, term20.getClass(), "language", term23);
        Object term24 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term27 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term24, term24.getClass(), "effect", "");
        setField(term24, term24.getClass(), "shortEffect", "");
        setField(term27, term27.getClass(), "name", null);
        setField(term27, term27.getClass(), "url", null);
        setField(term24, term24.getClass(), "language", term27);
        Object term28 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term31 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term28, term28.getClass(), "effect", "");
        setField(term28, term28.getClass(), "shortEffect", "");
        setField(term31, term31.getClass(), "name", null);
        setField(term31, term31.getClass(), "url", null);
        setField(term28, term28.getClass(), "language", term31);
        ArrayList term10 = new ArrayList();
        ((ArrayList) term10).add(term12);
        ((ArrayList) term10).add(term16);
        ((ArrayList) term10).add(term20);
        ((ArrayList) term10).add(term24);
        ((ArrayList) term10).add(term28);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term34 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term59 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1, term1.getClass(), "accuracy", term2);
        setField(term1, term1.getClass(), "effectChance", term4);
        setField(term1, term1.getClass(), "power", term6);
        setField(term1, term1.getClass(), "pp", term8);
        setField(term1, term1.getClass(), "effectEntries", term10);
        setField(term34, term34.getClass(), "name", "hNxWaHcfhY");
        setField(term34, term34.getClass(), "url", "RkybSrpybU");
        setField(term1, term1.getClass(), "type", term34);
        setField(term59, term59.getClass(), "name", "xOEqzGAmDU");
        setField(term59, term59.getClass(), "url", "eZFUvlxvGV");
        setField(term1, term1.getClass(), "versionGroup", term59);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccuracy", argTypes, term1, args);
    }

};


