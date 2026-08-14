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
import java.util.LinkedList;

public class Language_setNames_119562954412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1031;
     Object term1091;

    public Language_setNames_119562954412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1032 = new Integer(1134449235);
        Boolean term1046 = new Boolean(false);
        Object term1074 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1076 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1074, term1074.getClass(), "name", "");
        setField(term1076, term1076.getClass(), "name", null);
        setField(term1076, term1076.getClass(), "url", null);
        setField(term1074, term1074.getClass(), "language", term1076);
        Object term1077 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1079 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1077, term1077.getClass(), "name", "");
        setField(term1079, term1079.getClass(), "name", null);
        setField(term1079, term1079.getClass(), "url", null);
        setField(term1077, term1077.getClass(), "language", term1079);
        Object term1080 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1082 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1080, term1080.getClass(), "name", "");
        setField(term1082, term1082.getClass(), "name", null);
        setField(term1082, term1082.getClass(), "url", null);
        setField(term1080, term1080.getClass(), "language", term1082);
        Object term1083 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1085 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1083, term1083.getClass(), "name", "");
        setField(term1085, term1085.getClass(), "name", null);
        setField(term1085, term1085.getClass(), "url", null);
        setField(term1083, term1083.getClass(), "language", term1085);
        Object term1086 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1088 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1086, term1086.getClass(), "name", "");
        setField(term1088, term1088.getClass(), "name", null);
        setField(term1088, term1088.getClass(), "url", null);
        setField(term1086, term1086.getClass(), "language", term1088);
        ArrayList term1072 = new ArrayList();
        ((ArrayList) term1072).add(term1074);
        ((ArrayList) term1072).add(term1077);
        ((ArrayList) term1072).add(term1080);
        ((ArrayList) term1072).add(term1083);
        ((ArrayList) term1072).add(term1086);
        term1031 = newInstance(Class.forName("skaro.pokeapi.resource.language.Language"));
        setField(term1031, term1031.getClass(), "id", term1032);
        setField(term1031, term1031.getClass(), "name", "rLHAoqXgPh");
        setField(term1031, term1031.getClass(), "official", term1046);
        setField(term1031, term1031.getClass(), "iso639", "zUlRdimJtU");
        setField(term1031, term1031.getClass(), "iso3166", "vwbEQQNQrx");
        setField(term1031, term1031.getClass(), "names", term1072);
        term1091 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.language.Language");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1091;
        callMethod(klass, "setNames", argTypes, term1031, args);
    }

};


