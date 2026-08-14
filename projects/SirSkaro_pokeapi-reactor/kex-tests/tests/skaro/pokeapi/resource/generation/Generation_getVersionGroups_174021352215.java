package skaro.pokeapi.resource.generation;

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
import static skaro.pokeapi.resource.generation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Generation_getVersionGroups_174021352215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1163;

    public Generation_getVersionGroups_174021352215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1164 = new Integer(597278769);
        ArrayList term1178 = new ArrayList();
        Object term1184 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1186 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1184, term1184.getClass(), "name", "");
        setField(term1186, term1186.getClass(), "name", null);
        setField(term1186, term1186.getClass(), "url", null);
        setField(term1184, term1184.getClass(), "language", term1186);
        Object term1187 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1189 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1187, term1187.getClass(), "name", "");
        setField(term1189, term1189.getClass(), "name", null);
        setField(term1189, term1189.getClass(), "url", null);
        setField(term1187, term1187.getClass(), "language", term1189);
        Object term1190 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1192 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1190, term1190.getClass(), "name", "");
        setField(term1192, term1192.getClass(), "name", null);
        setField(term1192, term1192.getClass(), "url", null);
        setField(term1190, term1190.getClass(), "language", term1192);
        Object term1193 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1195 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1193, term1193.getClass(), "name", "");
        setField(term1195, term1195.getClass(), "name", null);
        setField(term1195, term1195.getClass(), "url", null);
        setField(term1193, term1193.getClass(), "language", term1195);
        Object term1196 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1198 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1196, term1196.getClass(), "name", "");
        setField(term1198, term1198.getClass(), "name", null);
        setField(term1198, term1198.getClass(), "url", null);
        setField(term1196, term1196.getClass(), "language", term1198);
        Object term1199 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1201 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1199, term1199.getClass(), "name", "");
        setField(term1201, term1201.getClass(), "name", null);
        setField(term1201, term1201.getClass(), "url", null);
        setField(term1199, term1199.getClass(), "language", term1201);
        Object term1202 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1204 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1202, term1202.getClass(), "name", "");
        setField(term1204, term1204.getClass(), "name", null);
        setField(term1204, term1204.getClass(), "url", null);
        setField(term1202, term1202.getClass(), "language", term1204);
        ArrayList term1182 = new ArrayList();
        ((ArrayList) term1182).add(term1184);
        ((ArrayList) term1182).add(term1187);
        ((ArrayList) term1182).add(term1190);
        ((ArrayList) term1182).add(term1193);
        ((ArrayList) term1182).add(term1196);
        ((ArrayList) term1182).add(term1199);
        ((ArrayList) term1182).add(term1202);
        ArrayList term1207 = new ArrayList();
        ArrayList term1211 = new ArrayList();
        ArrayList term1215 = new ArrayList();
        ArrayList term1219 = new ArrayList();
        term1163 = newInstance(Class.forName("skaro.pokeapi.resource.generation.Generation"));
        setField(term1163, term1163.getClass(), "id", term1164);
        setField(term1163, term1163.getClass(), "name", "beAMpkroCQ");
        setField(term1163, term1163.getClass(), "abilities", term1178);
        setField(term1163, term1163.getClass(), "names", term1182);
        setField(term1163, term1163.getClass(), "moves", term1207);
        setField(term1163, term1163.getClass(), "pokemonSpecies", term1211);
        setField(term1163, term1163.getClass(), "types", term1215);
        setField(term1163, term1163.getClass(), "versionGroups", term1219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.generation.Generation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroups", argTypes, term1163, args);
    }

};


