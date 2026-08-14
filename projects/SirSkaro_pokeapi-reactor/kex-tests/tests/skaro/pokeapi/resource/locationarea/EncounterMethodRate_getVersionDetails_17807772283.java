package skaro.pokeapi.resource.locationarea;

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
import static skaro.pokeapi.resource.locationarea.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class EncounterMethodRate_getVersionDetails_17807772283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182;

    public EncounterMethodRate_getVersionDetails_17807772283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term211 = new Integer(-1339778481);
        Object term210 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term213 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term210, term210.getClass(), "rate", term211);
        setField(term213, term213.getClass(), "name", null);
        setField(term213, term213.getClass(), "url", null);
        setField(term210, term210.getClass(), "version", term213);
        Integer term215 = new Integer(1725571209);
        Object term214 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term217 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term214, term214.getClass(), "rate", term215);
        setField(term217, term217.getClass(), "name", null);
        setField(term217, term217.getClass(), "url", null);
        setField(term214, term214.getClass(), "version", term217);
        Integer term219 = new Integer(-522618178);
        Object term218 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterVersionDetails"));
        Object term221 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term218, term218.getClass(), "rate", term219);
        setField(term221, term221.getClass(), "name", null);
        setField(term221, term221.getClass(), "url", null);
        setField(term218, term218.getClass(), "version", term221);
        ArrayList term208 = new ArrayList();
        ((ArrayList) term208).add(term210);
        ((ArrayList) term208).add(term214);
        ((ArrayList) term208).add(term218);
        term182 = newInstance(Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate"));
        Object term183 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term183, term183.getClass(), "name", "flxyYxBRtu");
        setField(term183, term183.getClass(), "url", "OclPbYPkcH");
        setField(term182, term182.getClass(), "encounterMethod", term183);
        setField(term182, term182.getClass(), "versionDetails", term208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.locationarea.EncounterMethodRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionDetails", argTypes, term182, args);
    }

};


