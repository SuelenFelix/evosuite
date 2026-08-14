package skaro.pokeapi.resource.location;

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
import static skaro.pokeapi.resource.location.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Location_getGameIndices_109539336710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term972;

    public Location_getGameIndices_109539336710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term973 = new Integer(-157887805);
        Object term1014 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1016 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1014, term1014.getClass(), "name", "");
        setField(term1016, term1016.getClass(), "name", null);
        setField(term1016, term1016.getClass(), "url", null);
        setField(term1014, term1014.getClass(), "language", term1016);
        ArrayList term1012 = new ArrayList();
        ((ArrayList) term1012).add(term1014);
        Integer term1022 = new Integer(1876565163);
        Object term1021 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term1024 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1021, term1021.getClass(), "gameIndex", term1022);
        setField(term1024, term1024.getClass(), "name", null);
        setField(term1024, term1024.getClass(), "url", null);
        setField(term1021, term1021.getClass(), "generation", term1024);
        Integer term1026 = new Integer(-817164822);
        Object term1025 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term1028 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1025, term1025.getClass(), "gameIndex", term1026);
        setField(term1028, term1028.getClass(), "name", null);
        setField(term1028, term1028.getClass(), "url", null);
        setField(term1025, term1025.getClass(), "generation", term1028);
        ArrayList term1019 = new ArrayList();
        ((ArrayList) term1019).add(term1021);
        ((ArrayList) term1019).add(term1025);
        ArrayList term1031 = new ArrayList();
        term972 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term987 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term972, term972.getClass(), "id", term973);
        setField(term972, term972.getClass(), "name", "zUlRdimJtU");
        setField(term987, term987.getClass(), "name", "vwbEQQNQrx");
        setField(term987, term987.getClass(), "url", "xtftXXMbem");
        setField(term972, term972.getClass(), "region", term987);
        setField(term972, term972.getClass(), "names", term1012);
        setField(term972, term972.getClass(), "gameIndices", term1019);
        setField(term972, term972.getClass(), "areas", term1031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameIndices", argTypes, term972, args);
    }

};


