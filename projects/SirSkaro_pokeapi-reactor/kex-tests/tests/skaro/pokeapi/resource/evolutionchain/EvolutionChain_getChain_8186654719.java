package skaro.pokeapi.resource.evolutionchain;

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
import static skaro.pokeapi.resource.evolutionchain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Boolean;
import java.util.ArrayList;

public class EvolutionChain_getChain_8186654719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18652;

    public EvolutionChain_getChain_8186654719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18653 = new Integer(613256157);
        Boolean term18681 = new Boolean(true);
        ArrayList term18708 = new ArrayList();
        ArrayList term18712 = new ArrayList();
        term18652 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionChain"));
        Object term18655 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term18680 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.ChainLink"));
        Object term18683 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18652, term18652.getClass(), "id", term18653);
        setField(term18655, term18655.getClass(), "name", "cGQJTTxcXr");
        setField(term18655, term18655.getClass(), "url", "aKaqvssiby");
        setField(term18652, term18652.getClass(), "item", term18655);
        setField(term18680, term18680.getClass(), "isBaby", term18681);
        setField(term18683, term18683.getClass(), "name", "tTVbtBVAfo");
        setField(term18683, term18683.getClass(), "url", "cjaaJUnNCR");
        setField(term18680, term18680.getClass(), "species", term18683);
        setField(term18680, term18680.getClass(), "evolutionDetails", term18708);
        setField(term18680, term18680.getClass(), "evolvesTo", term18712);
        setField(term18652, term18652.getClass(), "chain", term18680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionChain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChain", argTypes, term18652, args);
    }

};


