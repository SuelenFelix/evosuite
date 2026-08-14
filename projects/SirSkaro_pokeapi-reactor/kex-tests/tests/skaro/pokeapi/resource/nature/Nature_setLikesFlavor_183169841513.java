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

public class Nature_setLikesFlavor_183169841513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19066;
     Object term19197;

    public Nature_setLikesFlavor_183169841513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term19067 = new Integer(376834234);
        Object term19183 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term19185 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19183, term19183.getClass(), "name", "");
        setField(term19185, term19185.getClass(), "name", null);
        setField(term19185, term19185.getClass(), "url", null);
        setField(term19183, term19183.getClass(), "language", term19185);
        Object term19186 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term19188 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19186, term19186.getClass(), "name", "");
        setField(term19188, term19188.getClass(), "name", null);
        setField(term19188, term19188.getClass(), "url", null);
        setField(term19186, term19186.getClass(), "language", term19188);
        Object term19189 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term19191 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19189, term19189.getClass(), "name", "");
        setField(term19191, term19191.getClass(), "name", null);
        setField(term19191, term19191.getClass(), "url", null);
        setField(term19189, term19189.getClass(), "language", term19191);
        Object term19192 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term19194 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19192, term19192.getClass(), "name", "");
        setField(term19194, term19194.getClass(), "name", null);
        setField(term19194, term19194.getClass(), "url", null);
        setField(term19192, term19192.getClass(), "language", term19194);
        ArrayList term19181 = new ArrayList();
        ((ArrayList) term19181).add(term19183);
        ((ArrayList) term19181).add(term19186);
        ((ArrayList) term19181).add(term19189);
        ((ArrayList) term19181).add(term19192);
        term19066 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term19081 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term19106 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term19131 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term19156 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19066, term19066.getClass(), "id", term19067);
        setField(term19066, term19066.getClass(), "name", "vCJwFnMbeg");
        setField(term19081, term19081.getClass(), "name", "HiMyMWtfDT");
        setField(term19081, term19081.getClass(), "url", "bTxfZATYLW");
        setField(term19066, term19066.getClass(), "decreasedStat", term19081);
        setField(term19106, term19106.getClass(), "name", "lFWdVTokyG");
        setField(term19106, term19106.getClass(), "url", "PwXoorKXoP");
        setField(term19066, term19066.getClass(), "increasedStat", term19106);
        setField(term19131, term19131.getClass(), "name", "FTbhYKJKQL");
        setField(term19131, term19131.getClass(), "url", "CssqWIyxap");
        setField(term19066, term19066.getClass(), "hatesFlavor", term19131);
        setField(term19156, term19156.getClass(), "name", "EtmaqZMoVN");
        setField(term19156, term19156.getClass(), "url", "mluXYJByNP");
        setField(term19066, term19066.getClass(), "likesFlavor", term19156);
        setField(term19066, term19066.getClass(), "names", term19181);
        term19197 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19197, term19197.getClass(), "name", "MGfUFAWSlA");
        setField(term19197, term19197.getClass(), "url", "eCRXbBPOdv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term19197;
        callMethod(klass, "setLikesFlavor", argTypes, term19066, args);
    }

};


