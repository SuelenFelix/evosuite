package skaro.pokeapi.resource.contesttype;

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
import static skaro.pokeapi.resource.contesttype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class ContestType_setName_12569061704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term908;

    public ContestType_setName_12569061704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term909 = new Integer(-1922583790);
        Object term950 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term953 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term950, term950.getClass(), "name", "");
        setField(term950, term950.getClass(), "color", "");
        setField(term953, term953.getClass(), "name", null);
        setField(term953, term953.getClass(), "url", null);
        setField(term950, term950.getClass(), "language", term953);
        Object term954 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term957 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term954, term954.getClass(), "name", "");
        setField(term954, term954.getClass(), "color", "");
        setField(term957, term957.getClass(), "name", null);
        setField(term957, term957.getClass(), "url", null);
        setField(term954, term954.getClass(), "language", term957);
        Object term958 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term961 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term958, term958.getClass(), "name", "");
        setField(term958, term958.getClass(), "color", "");
        setField(term961, term961.getClass(), "name", null);
        setField(term961, term961.getClass(), "url", null);
        setField(term958, term958.getClass(), "language", term961);
        Object term962 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term965 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term962, term962.getClass(), "name", "");
        setField(term962, term962.getClass(), "color", "");
        setField(term965, term965.getClass(), "name", null);
        setField(term965, term965.getClass(), "url", null);
        setField(term962, term962.getClass(), "language", term965);
        ArrayList term948 = new ArrayList();
        ((ArrayList) term948).add(term950);
        ((ArrayList) term948).add(term954);
        ((ArrayList) term948).add(term958);
        ((ArrayList) term948).add(term962);
        term908 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestType"));
        Object term923 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term908, term908.getClass(), "id", term909);
        setField(term908, term908.getClass(), "name", "TimdotUuNC");
        setField(term923, term923.getClass(), "name", "PkWMRdJcBb");
        setField(term923, term923.getClass(), "url", "jSpAteRute");
        setField(term908, term908.getClass(), "berryFlavor", term923);
        setField(term908, term908.getClass(), "names", term948);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xBsXSDjXYK";
        callMethod(klass, "setName", argTypes, term908, args);
    }

};


