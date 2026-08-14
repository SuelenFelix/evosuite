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

public class Nature_setName_21140242804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term666;

    public Nature_setName_21140242804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term667 = new Integer(-1922583790);
        Object term783 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term785 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term783, term783.getClass(), "name", "");
        setField(term785, term785.getClass(), "name", null);
        setField(term785, term785.getClass(), "url", null);
        setField(term783, term783.getClass(), "language", term785);
        Object term786 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term788 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term786, term786.getClass(), "name", "");
        setField(term788, term788.getClass(), "name", null);
        setField(term788, term788.getClass(), "url", null);
        setField(term786, term786.getClass(), "language", term788);
        Object term789 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term791 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term789, term789.getClass(), "name", "");
        setField(term791, term791.getClass(), "name", null);
        setField(term791, term791.getClass(), "url", null);
        setField(term789, term789.getClass(), "language", term791);
        Object term792 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term794 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term792, term792.getClass(), "name", "");
        setField(term794, term794.getClass(), "name", null);
        setField(term794, term794.getClass(), "url", null);
        setField(term792, term792.getClass(), "language", term794);
        ArrayList term781 = new ArrayList();
        ((ArrayList) term781).add(term783);
        ((ArrayList) term781).add(term786);
        ((ArrayList) term781).add(term789);
        ((ArrayList) term781).add(term792);
        term666 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term681 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term706 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term731 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term756 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term666, term666.getClass(), "id", term667);
        setField(term666, term666.getClass(), "name", "eqJfYWRaEL");
        setField(term681, term681.getClass(), "name", "fhkbdRViHi");
        setField(term681, term681.getClass(), "url", "uWHnvSvaPl");
        setField(term666, term666.getClass(), "decreasedStat", term681);
        setField(term706, term706.getClass(), "name", "kBdSllIBVz");
        setField(term706, term706.getClass(), "url", "TJmVBGfTML");
        setField(term666, term666.getClass(), "increasedStat", term706);
        setField(term731, term731.getClass(), "name", "tPlsykYBqO");
        setField(term731, term731.getClass(), "url", "bLPjGVBhlX");
        setField(term666, term666.getClass(), "hatesFlavor", term731);
        setField(term756, term756.getClass(), "name", "whBvTVIIlC");
        setField(term756, term756.getClass(), "url", "IgRJUzaCwW");
        setField(term666, term666.getClass(), "likesFlavor", term756);
        setField(term666, term666.getClass(), "names", term781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cAPeiZHKGJ";
        callMethod(klass, "setName", argTypes, term666, args);
    }

};


