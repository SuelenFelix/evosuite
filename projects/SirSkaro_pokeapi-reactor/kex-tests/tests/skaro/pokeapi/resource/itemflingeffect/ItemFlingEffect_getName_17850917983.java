package skaro.pokeapi.resource.itemflingeffect;

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
import static skaro.pokeapi.resource.itemflingeffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class ItemFlingEffect_getName_17850917983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;

    public ItemFlingEffect_getName_17850917983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term94 = new Integer(391863371);
        Object term110 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term112 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term110, term110.getClass(), "effect", "");
        setField(term112, term112.getClass(), "name", null);
        setField(term112, term112.getClass(), "url", null);
        setField(term110, term110.getClass(), "language", term112);
        ArrayList term108 = new ArrayList();
        ((ArrayList) term108).add(term110);
        ArrayList term115 = new ArrayList();
        term93 = newInstance(Class.forName("skaro.pokeapi.resource.itemflingeffect.ItemFlingEffect"));
        setField(term93, term93.getClass(), "id", term94);
        setField(term93, term93.getClass(), "name", "flxyYxBRtu");
        setField(term93, term93.getClass(), "effectEntries", term108);
        setField(term93, term93.getClass(), "items", term115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemflingeffect.ItemFlingEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term93, args);
    }

};


