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

public class Nature_setDecreasedStat_6781875376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1121;
     Object term1258;

    public Nature_setDecreasedStat_6781875376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1122 = new Integer(-1955890973);
        Object term1238 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1240 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1238, term1238.getClass(), "name", "");
        setField(term1240, term1240.getClass(), "name", null);
        setField(term1240, term1240.getClass(), "url", null);
        setField(term1238, term1238.getClass(), "language", term1240);
        Object term1241 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1243 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1241, term1241.getClass(), "name", "");
        setField(term1243, term1243.getClass(), "name", null);
        setField(term1243, term1243.getClass(), "url", null);
        setField(term1241, term1241.getClass(), "language", term1243);
        Object term1244 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1246 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1244, term1244.getClass(), "name", "");
        setField(term1246, term1246.getClass(), "name", null);
        setField(term1246, term1246.getClass(), "url", null);
        setField(term1244, term1244.getClass(), "language", term1246);
        Object term1247 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1249 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1247, term1247.getClass(), "name", "");
        setField(term1249, term1249.getClass(), "name", null);
        setField(term1249, term1249.getClass(), "url", null);
        setField(term1247, term1247.getClass(), "language", term1249);
        Object term1250 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1252 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1250, term1250.getClass(), "name", "");
        setField(term1252, term1252.getClass(), "name", null);
        setField(term1252, term1252.getClass(), "url", null);
        setField(term1250, term1250.getClass(), "language", term1252);
        Object term1253 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1255 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1253, term1253.getClass(), "name", "");
        setField(term1255, term1255.getClass(), "name", null);
        setField(term1255, term1255.getClass(), "url", null);
        setField(term1253, term1253.getClass(), "language", term1255);
        ArrayList term1236 = new ArrayList();
        ((ArrayList) term1236).add(term1238);
        ((ArrayList) term1236).add(term1241);
        ((ArrayList) term1236).add(term1244);
        ((ArrayList) term1236).add(term1247);
        ((ArrayList) term1236).add(term1250);
        ((ArrayList) term1236).add(term1253);
        term1121 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term1136 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1161 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1186 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1211 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1121, term1121.getClass(), "id", term1122);
        setField(term1121, term1121.getClass(), "name", "JiVRgTZvKc");
        setField(term1136, term1136.getClass(), "name", "XPKmummaqg");
        setField(term1136, term1136.getClass(), "url", "BKLfkLiZTH");
        setField(term1121, term1121.getClass(), "decreasedStat", term1136);
        setField(term1161, term1161.getClass(), "name", "SPpkrGcPRr");
        setField(term1161, term1161.getClass(), "url", "sEccwbJKYE");
        setField(term1121, term1121.getClass(), "increasedStat", term1161);
        setField(term1186, term1186.getClass(), "name", "AWRooQKkdW");
        setField(term1186, term1186.getClass(), "url", "vjxIhXHxGR");
        setField(term1121, term1121.getClass(), "hatesFlavor", term1186);
        setField(term1211, term1211.getClass(), "name", "QXzGXbEXMu");
        setField(term1211, term1211.getClass(), "url", "qxSDVejjiY");
        setField(term1121, term1121.getClass(), "likesFlavor", term1211);
        setField(term1121, term1121.getClass(), "names", term1236);
        term1258 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1258, term1258.getClass(), "name", "JDaAnsVTGV");
        setField(term1258, term1258.getClass(), "url", "mLUZFTfjle");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term1258;
        callMethod(klass, "setDecreasedStat", argTypes, term1121, args);
    }

};


