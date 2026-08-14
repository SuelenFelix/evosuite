package skaro.pokeapi.resource.language;

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
import static skaro.pokeapi.resource.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class Language_getIso3166_6785897489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term742;

    public Language_getIso3166_6785897489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term743 = new Integer(-1339778481);
        Boolean term757 = new Boolean(true);
        Object term785 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term787 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term785, term785.getClass(), "name", "");
        setField(term787, term787.getClass(), "name", null);
        setField(term787, term787.getClass(), "url", null);
        setField(term785, term785.getClass(), "language", term787);
        Object term788 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term790 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term788, term788.getClass(), "name", "");
        setField(term790, term790.getClass(), "name", null);
        setField(term790, term790.getClass(), "url", null);
        setField(term788, term788.getClass(), "language", term790);
        Object term791 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term793 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term791, term791.getClass(), "name", "");
        setField(term793, term793.getClass(), "name", null);
        setField(term793, term793.getClass(), "url", null);
        setField(term791, term791.getClass(), "language", term793);
        Object term794 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term796 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term794, term794.getClass(), "name", "");
        setField(term796, term796.getClass(), "name", null);
        setField(term796, term796.getClass(), "url", null);
        setField(term794, term794.getClass(), "language", term796);
        Object term797 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term799 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term797, term797.getClass(), "name", "");
        setField(term799, term799.getClass(), "name", null);
        setField(term799, term799.getClass(), "url", null);
        setField(term797, term797.getClass(), "language", term799);
        Object term800 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term802 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term800, term800.getClass(), "name", "");
        setField(term802, term802.getClass(), "name", null);
        setField(term802, term802.getClass(), "url", null);
        setField(term800, term800.getClass(), "language", term802);
        Object term803 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term805 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term803, term803.getClass(), "name", "");
        setField(term805, term805.getClass(), "name", null);
        setField(term805, term805.getClass(), "url", null);
        setField(term803, term803.getClass(), "language", term805);
        ArrayList term783 = new ArrayList();
        ((ArrayList) term783).add(term785);
        ((ArrayList) term783).add(term788);
        ((ArrayList) term783).add(term791);
        ((ArrayList) term783).add(term794);
        ((ArrayList) term783).add(term797);
        ((ArrayList) term783).add(term800);
        ((ArrayList) term783).add(term803);
        term742 = newInstance(Class.forName("skaro.pokeapi.resource.language.Language"));
        setField(term742, term742.getClass(), "id", term743);
        setField(term742, term742.getClass(), "name", "mXGCWJDOqA");
        setField(term742, term742.getClass(), "official", term757);
        setField(term742, term742.getClass(), "iso639", "dpNsDgfPso");
        setField(term742, term742.getClass(), "iso3166", "hCWPJQKpdc");
        setField(term742, term742.getClass(), "names", term783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.language.Language");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIso3166", argTypes, term742, args);
    }

};


