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

public class PastMoveStatValues_getEffectChance_4816524713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245;

    public PastMoveStatValues_getEffectChance_4816524713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term246 = new Integer(-1339778481);
        Integer term248 = new Integer(1725571209);
        Integer term250 = new Integer(-522618178);
        Integer term252 = new Integer(1134449235);
        Object term256 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term259 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term256, term256.getClass(), "effect", "");
        setField(term256, term256.getClass(), "shortEffect", "");
        setField(term259, term259.getClass(), "name", null);
        setField(term259, term259.getClass(), "url", null);
        setField(term256, term256.getClass(), "language", term259);
        Object term260 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term263 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term260, term260.getClass(), "effect", "");
        setField(term260, term260.getClass(), "shortEffect", "");
        setField(term263, term263.getClass(), "name", null);
        setField(term263, term263.getClass(), "url", null);
        setField(term260, term260.getClass(), "language", term263);
        Object term264 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term267 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term264, term264.getClass(), "effect", "");
        setField(term264, term264.getClass(), "shortEffect", "");
        setField(term267, term267.getClass(), "name", null);
        setField(term267, term267.getClass(), "url", null);
        setField(term264, term264.getClass(), "language", term267);
        ArrayList term254 = new ArrayList();
        ((ArrayList) term254).add(term256);
        ((ArrayList) term254).add(term260);
        ((ArrayList) term254).add(term264);
        term245 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term270 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term295 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term245, term245.getClass(), "accuracy", term246);
        setField(term245, term245.getClass(), "effectChance", term248);
        setField(term245, term245.getClass(), "power", term250);
        setField(term245, term245.getClass(), "pp", term252);
        setField(term245, term245.getClass(), "effectEntries", term254);
        setField(term270, term270.getClass(), "name", "ffYhPOzlUs");
        setField(term270, term270.getClass(), "url", "MLqYREekMl");
        setField(term245, term245.getClass(), "type", term270);
        setField(term295, term295.getClass(), "name", "ytSBIKXogI");
        setField(term295, term295.getClass(), "url", "nHXjMycHlU");
        setField(term245, term245.getClass(), "versionGroup", term295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectChance", argTypes, term245, args);
    }

};


