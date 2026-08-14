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
import java.util.LinkedList;

public class Nature_setNames_178444845615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19553;
     Object term19675;

    public Nature_setNames_178444845615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term19554 = new Integer(-642716895);
        Object term19670 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term19672 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19670, term19670.getClass(), "name", "");
        setField(term19672, term19672.getClass(), "name", null);
        setField(term19672, term19672.getClass(), "url", null);
        setField(term19670, term19670.getClass(), "language", term19672);
        ArrayList term19668 = new ArrayList();
        ((ArrayList) term19668).add(term19670);
        term19553 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term19568 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term19593 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term19618 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term19643 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19553, term19553.getClass(), "id", term19554);
        setField(term19553, term19553.getClass(), "name", "gFKwlpZWQn");
        setField(term19568, term19568.getClass(), "name", "zkXBYRvjpo");
        setField(term19568, term19568.getClass(), "url", "nmebweybpn");
        setField(term19553, term19553.getClass(), "decreasedStat", term19568);
        setField(term19593, term19593.getClass(), "name", "rRiUyNVzoJ");
        setField(term19593, term19593.getClass(), "url", "IpeZajjVYM");
        setField(term19553, term19553.getClass(), "increasedStat", term19593);
        setField(term19618, term19618.getClass(), "name", "ZZMugYyPLU");
        setField(term19618, term19618.getClass(), "url", "UknzoUqzIv");
        setField(term19553, term19553.getClass(), "hatesFlavor", term19618);
        setField(term19643, term19643.getClass(), "name", "xctmTnBQin");
        setField(term19643, term19643.getClass(), "url", "MsvgumOnks");
        setField(term19553, term19553.getClass(), "likesFlavor", term19643);
        setField(term19553, term19553.getClass(), "names", term19668);
        Object term19678 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term19691 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19678, term19678.getClass(), "name", "QRoYxbbXBu");
        setField(term19691, term19691.getClass(), "name", "");
        setField(term19691, term19691.getClass(), "url", "");
        setField(term19678, term19678.getClass(), "language", term19691);
        Object term19695 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term19697 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term19695, term19695.getClass(), "name", "");
        setField(term19697, term19697.getClass(), "name", null);
        setField(term19697, term19697.getClass(), "url", null);
        setField(term19695, term19695.getClass(), "language", term19697);
        term19675 = new LinkedList();
        ((LinkedList) term19675).add(term19678);
        ((LinkedList) term19675).add(term19695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term19675;
        callMethod(klass, "setNames", argTypes, term19553, args);
    }

};


