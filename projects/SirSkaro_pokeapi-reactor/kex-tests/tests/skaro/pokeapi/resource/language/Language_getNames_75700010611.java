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

public class Language_getNames_75700010611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term938;

    public Language_getNames_75700010611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term939 = new Integer(-522618178);
        Boolean term953 = new Boolean(true);
        Object term981 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term983 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term981, term981.getClass(), "name", "");
        setField(term983, term983.getClass(), "name", null);
        setField(term983, term983.getClass(), "url", null);
        setField(term981, term981.getClass(), "language", term983);
        Object term984 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term986 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term984, term984.getClass(), "name", "");
        setField(term986, term986.getClass(), "name", null);
        setField(term986, term986.getClass(), "url", null);
        setField(term984, term984.getClass(), "language", term986);
        Object term987 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term989 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term987, term987.getClass(), "name", "");
        setField(term989, term989.getClass(), "name", null);
        setField(term989, term989.getClass(), "url", null);
        setField(term987, term987.getClass(), "language", term989);
        Object term990 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term992 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term990, term990.getClass(), "name", "");
        setField(term992, term992.getClass(), "name", null);
        setField(term992, term992.getClass(), "url", null);
        setField(term990, term990.getClass(), "language", term992);
        Object term993 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term995 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term993, term993.getClass(), "name", "");
        setField(term995, term995.getClass(), "name", null);
        setField(term995, term995.getClass(), "url", null);
        setField(term993, term993.getClass(), "language", term995);
        Object term996 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term998 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term996, term996.getClass(), "name", "");
        setField(term998, term998.getClass(), "name", null);
        setField(term998, term998.getClass(), "url", null);
        setField(term996, term996.getClass(), "language", term998);
        ArrayList term979 = new ArrayList();
        ((ArrayList) term979).add(term981);
        ((ArrayList) term979).add(term984);
        ((ArrayList) term979).add(term987);
        ((ArrayList) term979).add(term990);
        ((ArrayList) term979).add(term993);
        ((ArrayList) term979).add(term996);
        term938 = newInstance(Class.forName("skaro.pokeapi.resource.language.Language"));
        setField(term938, term938.getClass(), "id", term939);
        setField(term938, term938.getClass(), "name", "jwsfVjMoJT");
        setField(term938, term938.getClass(), "official", term953);
        setField(term938, term938.getClass(), "iso639", "ZfdXfCCFDf");
        setField(term938, term938.getClass(), "iso3166", "MwwjNtdOFT");
        setField(term938, term938.getClass(), "names", term979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.language.Language");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term938, args);
    }

};


