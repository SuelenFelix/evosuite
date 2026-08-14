package skaro.pokeapi.resource.version;

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
import static skaro.pokeapi.resource.version.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Version_setId_17513404652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;
     Object term146;

    public Version_setId_17513404652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term91 = new Integer(1162663216);
        Object term107 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term109 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term107, term107.getClass(), "name", "");
        setField(term109, term109.getClass(), "name", null);
        setField(term109, term109.getClass(), "url", null);
        setField(term107, term107.getClass(), "language", term109);
        Object term110 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term112 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term110, term110.getClass(), "name", "");
        setField(term112, term112.getClass(), "name", null);
        setField(term112, term112.getClass(), "url", null);
        setField(term110, term110.getClass(), "language", term112);
        Object term113 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term115 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113, term113.getClass(), "name", "");
        setField(term115, term115.getClass(), "name", null);
        setField(term115, term115.getClass(), "url", null);
        setField(term113, term113.getClass(), "language", term115);
        Object term116 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term118 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term116, term116.getClass(), "name", "");
        setField(term118, term118.getClass(), "name", null);
        setField(term118, term118.getClass(), "url", null);
        setField(term116, term116.getClass(), "language", term118);
        ArrayList term105 = new ArrayList();
        ((ArrayList) term105).add(term107);
        ((ArrayList) term105).add(term110);
        ((ArrayList) term105).add(term113);
        ((ArrayList) term105).add(term116);
        term90 = newInstance(Class.forName("skaro.pokeapi.resource.version.Version"));
        Object term121 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term90, term90.getClass(), "id", term91);
        setField(term90, term90.getClass(), "name", "HyxfbSQYBe");
        setField(term90, term90.getClass(), "names", term105);
        setField(term121, term121.getClass(), "name", "dWRymuLBtr");
        setField(term121, term121.getClass(), "url", "AijpHYOFuy");
        setField(term90, term90.getClass(), "versionGroup", term121);
        term146 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.version.Version");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term146;
        callMethod(klass, "setId", argTypes, term90, args);
    }

};


