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

public class Nature_getLikesFlavor_103911812112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18845;

    public Nature_getLikesFlavor_103911812112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18846 = new Integer(-1165271567);
        Object term18962 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18964 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18962, term18962.getClass(), "name", "");
        setField(term18964, term18964.getClass(), "name", null);
        setField(term18964, term18964.getClass(), "url", null);
        setField(term18962, term18962.getClass(), "language", term18964);
        Object term18965 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18967 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18965, term18965.getClass(), "name", "");
        setField(term18967, term18967.getClass(), "name", null);
        setField(term18967, term18967.getClass(), "url", null);
        setField(term18965, term18965.getClass(), "language", term18967);
        Object term18968 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18970 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18968, term18968.getClass(), "name", "");
        setField(term18970, term18970.getClass(), "name", null);
        setField(term18970, term18970.getClass(), "url", null);
        setField(term18968, term18968.getClass(), "language", term18970);
        Object term18971 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18973 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18971, term18971.getClass(), "name", "");
        setField(term18973, term18973.getClass(), "name", null);
        setField(term18973, term18973.getClass(), "url", null);
        setField(term18971, term18971.getClass(), "language", term18973);
        ArrayList term18960 = new ArrayList();
        ((ArrayList) term18960).add(term18962);
        ((ArrayList) term18960).add(term18965);
        ((ArrayList) term18960).add(term18968);
        ((ArrayList) term18960).add(term18971);
        term18845 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term18860 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term18885 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term18910 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term18935 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18845, term18845.getClass(), "id", term18846);
        setField(term18845, term18845.getClass(), "name", "iGWKoojIzf");
        setField(term18860, term18860.getClass(), "name", "hBwCfmunWp");
        setField(term18860, term18860.getClass(), "url", "dEmUNxEaGp");
        setField(term18845, term18845.getClass(), "decreasedStat", term18860);
        setField(term18885, term18885.getClass(), "name", "FiihXkdDjE");
        setField(term18885, term18885.getClass(), "url", "ttkSFEAzwY");
        setField(term18845, term18845.getClass(), "increasedStat", term18885);
        setField(term18910, term18910.getClass(), "name", "ZTUqSMjJHU");
        setField(term18910, term18910.getClass(), "url", "TAvUGVCPaa");
        setField(term18845, term18845.getClass(), "hatesFlavor", term18910);
        setField(term18935, term18935.getClass(), "name", "oacMptGUKE");
        setField(term18935, term18935.getClass(), "url", "vjVwvYdNhl");
        setField(term18845, term18845.getClass(), "likesFlavor", term18935);
        setField(term18845, term18845.getClass(), "names", term18960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikesFlavor", argTypes, term18845, args);
    }

};


