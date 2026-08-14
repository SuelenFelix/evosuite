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

public class Nature_setIncreasedStat_19854234139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18096;
     Object term18221;

    public Nature_setIncreasedStat_19854234139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18097 = new Integer(1894454926);
        Object term18213 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18215 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18213, term18213.getClass(), "name", "");
        setField(term18215, term18215.getClass(), "name", null);
        setField(term18215, term18215.getClass(), "url", null);
        setField(term18213, term18213.getClass(), "language", term18215);
        Object term18216 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term18218 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18216, term18216.getClass(), "name", "");
        setField(term18218, term18218.getClass(), "name", null);
        setField(term18218, term18218.getClass(), "url", null);
        setField(term18216, term18216.getClass(), "language", term18218);
        ArrayList term18211 = new ArrayList();
        ((ArrayList) term18211).add(term18213);
        ((ArrayList) term18211).add(term18216);
        term18096 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term18111 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term18136 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term18161 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term18186 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18096, term18096.getClass(), "id", term18097);
        setField(term18096, term18096.getClass(), "name", "qUfONYtlAU");
        setField(term18111, term18111.getClass(), "name", "QMHmlsCFoq");
        setField(term18111, term18111.getClass(), "url", "JlgbBmNibu");
        setField(term18096, term18096.getClass(), "decreasedStat", term18111);
        setField(term18136, term18136.getClass(), "name", "igRVOATJPd");
        setField(term18136, term18136.getClass(), "url", "DYaMGxxqDk");
        setField(term18096, term18096.getClass(), "increasedStat", term18136);
        setField(term18161, term18161.getClass(), "name", "kTRmkTQpRx");
        setField(term18161, term18161.getClass(), "url", "NmXGFQkgMo");
        setField(term18096, term18096.getClass(), "hatesFlavor", term18161);
        setField(term18186, term18186.getClass(), "name", "lBruaTAkIt");
        setField(term18186, term18186.getClass(), "url", "pIQQBEGLOF");
        setField(term18096, term18096.getClass(), "likesFlavor", term18186);
        setField(term18096, term18096.getClass(), "names", term18211);
        term18221 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18221, term18221.getClass(), "name", "wbtDRRVkMv");
        setField(term18221, term18221.getClass(), "url", "abzzbYwTRo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term18221;
        callMethod(klass, "setIncreasedStat", argTypes, term18096, args);
    }

};


