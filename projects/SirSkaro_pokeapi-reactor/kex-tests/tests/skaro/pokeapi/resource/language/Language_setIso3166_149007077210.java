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

public class Language_setIso3166_149007077210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term838;

    public Language_setIso3166_149007077210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term839 = new Integer(1725571209);
        Boolean term853 = new Boolean(false);
        Object term881 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term883 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term881, term881.getClass(), "name", "");
        setField(term883, term883.getClass(), "name", null);
        setField(term883, term883.getClass(), "url", null);
        setField(term881, term881.getClass(), "language", term883);
        ArrayList term879 = new ArrayList();
        ((ArrayList) term879).add(term881);
        term838 = newInstance(Class.forName("skaro.pokeapi.resource.language.Language"));
        setField(term838, term838.getClass(), "id", term839);
        setField(term838, term838.getClass(), "name", "pXOkjyeIRb");
        setField(term838, term838.getClass(), "official", term853);
        setField(term838, term838.getClass(), "iso639", "GgZWSjxjyE");
        setField(term838, term838.getClass(), "iso3166", "EeBVbzjcCI");
        setField(term838, term838.getClass(), "names", term879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.language.Language");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HzqpegHiRq";
        callMethod(klass, "setIso3166", argTypes, term838, args);
    }

};


