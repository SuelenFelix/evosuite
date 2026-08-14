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

public class Nature_getNames_16818119413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2862;

    public Nature_getNames_16818119413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2863 = new Integer(-883034806);
        Object term2979 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2981 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2979, term2979.getClass(), "name", "");
        setField(term2981, term2981.getClass(), "name", null);
        setField(term2981, term2981.getClass(), "url", null);
        setField(term2979, term2979.getClass(), "language", term2981);
        Object term2982 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2984 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2982, term2982.getClass(), "name", "");
        setField(term2984, term2984.getClass(), "name", null);
        setField(term2984, term2984.getClass(), "url", null);
        setField(term2982, term2982.getClass(), "language", term2984);
        Object term2985 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2987 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2985, term2985.getClass(), "name", "");
        setField(term2987, term2987.getClass(), "name", null);
        setField(term2987, term2987.getClass(), "url", null);
        setField(term2985, term2985.getClass(), "language", term2987);
        Object term2988 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2990 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2988, term2988.getClass(), "name", "");
        setField(term2990, term2990.getClass(), "name", null);
        setField(term2990, term2990.getClass(), "url", null);
        setField(term2988, term2988.getClass(), "language", term2990);
        Object term2991 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2993 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2991, term2991.getClass(), "name", "");
        setField(term2993, term2993.getClass(), "name", null);
        setField(term2993, term2993.getClass(), "url", null);
        setField(term2991, term2991.getClass(), "language", term2993);
        ArrayList term2977 = new ArrayList();
        ((ArrayList) term2977).add(term2979);
        ((ArrayList) term2977).add(term2982);
        ((ArrayList) term2977).add(term2985);
        ((ArrayList) term2977).add(term2988);
        ((ArrayList) term2977).add(term2991);
        term2862 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term2877 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2902 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2927 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2952 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2862, term2862.getClass(), "id", term2863);
        setField(term2862, term2862.getClass(), "name", "NHbOFFjyVK");
        setField(term2877, term2877.getClass(), "name", "zaloBqlrSo");
        setField(term2877, term2877.getClass(), "url", "vvoLrMGCoN");
        setField(term2862, term2862.getClass(), "decreasedStat", term2877);
        setField(term2902, term2902.getClass(), "name", "pXdglvyrQe");
        setField(term2902, term2902.getClass(), "url", "OcfNzHYdki");
        setField(term2862, term2862.getClass(), "increasedStat", term2902);
        setField(term2927, term2927.getClass(), "name", "uPuCVuZYOI");
        setField(term2927, term2927.getClass(), "url", "TweMFhxNdj");
        setField(term2862, term2862.getClass(), "hatesFlavor", term2927);
        setField(term2952, term2952.getClass(), "name", "NBrvVzvQHe");
        setField(term2952, term2952.getClass(), "url", "FjOiNAfBOc");
        setField(term2862, term2862.getClass(), "likesFlavor", term2952);
        setField(term2862, term2862.getClass(), "names", term2977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term2862, args);
    }

};


