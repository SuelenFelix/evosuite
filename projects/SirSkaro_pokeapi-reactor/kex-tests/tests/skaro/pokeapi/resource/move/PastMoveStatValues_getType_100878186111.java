package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class PastMoveStatValues_getType_100878186111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1198;

    public PastMoveStatValues_getType_100878186111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1199 = new Integer(1876565163);
        Integer term1201 = new Integer(-817164822);
        Integer term1203 = new Integer(-1016503459);
        Integer term1205 = new Integer(-1968847291);
        Object term1209 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term1212 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1209, term1209.getClass(), "effect", "");
        setField(term1209, term1209.getClass(), "shortEffect", "");
        setField(term1212, term1212.getClass(), "name", null);
        setField(term1212, term1212.getClass(), "url", null);
        setField(term1209, term1209.getClass(), "language", term1212);
        Object term1213 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term1216 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1213, term1213.getClass(), "effect", "");
        setField(term1213, term1213.getClass(), "shortEffect", "");
        setField(term1216, term1216.getClass(), "name", null);
        setField(term1216, term1216.getClass(), "url", null);
        setField(term1213, term1213.getClass(), "language", term1216);
        Object term1217 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term1220 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1217, term1217.getClass(), "effect", "");
        setField(term1217, term1217.getClass(), "shortEffect", "");
        setField(term1220, term1220.getClass(), "name", null);
        setField(term1220, term1220.getClass(), "url", null);
        setField(term1217, term1217.getClass(), "language", term1220);
        Object term1221 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term1224 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1221, term1221.getClass(), "effect", "");
        setField(term1221, term1221.getClass(), "shortEffect", "");
        setField(term1224, term1224.getClass(), "name", null);
        setField(term1224, term1224.getClass(), "url", null);
        setField(term1221, term1221.getClass(), "language", term1224);
        Object term1225 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term1228 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1225, term1225.getClass(), "effect", "");
        setField(term1225, term1225.getClass(), "shortEffect", "");
        setField(term1228, term1228.getClass(), "name", null);
        setField(term1228, term1228.getClass(), "url", null);
        setField(term1225, term1225.getClass(), "language", term1228);
        Object term1229 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term1232 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1229, term1229.getClass(), "effect", "");
        setField(term1229, term1229.getClass(), "shortEffect", "");
        setField(term1232, term1232.getClass(), "name", null);
        setField(term1232, term1232.getClass(), "url", null);
        setField(term1229, term1229.getClass(), "language", term1232);
        Object term1233 = newInstance(Class.forName("skaro.pokeapi.resource.VerboseEffect"));
        Object term1236 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1233, term1233.getClass(), "effect", "");
        setField(term1233, term1233.getClass(), "shortEffect", "");
        setField(term1236, term1236.getClass(), "name", null);
        setField(term1236, term1236.getClass(), "url", null);
        setField(term1233, term1233.getClass(), "language", term1236);
        ArrayList term1207 = new ArrayList();
        ((ArrayList) term1207).add(term1209);
        ((ArrayList) term1207).add(term1213);
        ((ArrayList) term1207).add(term1217);
        ((ArrayList) term1207).add(term1221);
        ((ArrayList) term1207).add(term1225);
        ((ArrayList) term1207).add(term1229);
        ((ArrayList) term1207).add(term1233);
        term1198 = newInstance(Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues"));
        Object term1239 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1264 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1198, term1198.getClass(), "accuracy", term1199);
        setField(term1198, term1198.getClass(), "effectChance", term1201);
        setField(term1198, term1198.getClass(), "power", term1203);
        setField(term1198, term1198.getClass(), "pp", term1205);
        setField(term1198, term1198.getClass(), "effectEntries", term1207);
        setField(term1239, term1239.getClass(), "name", "NzBMMhkhpT");
        setField(term1239, term1239.getClass(), "url", "qCpEbQDHdF");
        setField(term1198, term1198.getClass(), "type", term1239);
        setField(term1264, term1264.getClass(), "name", "AHbZyFOmlo");
        setField(term1264, term1264.getClass(), "url", "TwfWVQGiIj");
        setField(term1198, term1198.getClass(), "versionGroup", term1264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.PastMoveStatValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term1198, args);
    }

};


