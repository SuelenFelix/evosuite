package skaro.pokeapi.resource.movetarget;

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
import static skaro.pokeapi.resource.movetarget.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class MoveTarget_getDescriptions_4460081555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272;

    public MoveTarget_getDescriptions_4460081555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term273 = new Integer(-616727354);
        Object term289 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term291 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term289, term289.getClass(), "description", "");
        setField(term291, term291.getClass(), "name", null);
        setField(term291, term291.getClass(), "url", null);
        setField(term289, term289.getClass(), "language", term291);
        Object term292 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term294 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term292, term292.getClass(), "description", "");
        setField(term294, term294.getClass(), "name", null);
        setField(term294, term294.getClass(), "url", null);
        setField(term292, term292.getClass(), "language", term294);
        Object term295 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term297 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term295, term295.getClass(), "description", "");
        setField(term297, term297.getClass(), "name", null);
        setField(term297, term297.getClass(), "url", null);
        setField(term295, term295.getClass(), "language", term297);
        Object term298 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term300 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term298, term298.getClass(), "description", "");
        setField(term300, term300.getClass(), "name", null);
        setField(term300, term300.getClass(), "url", null);
        setField(term298, term298.getClass(), "language", term300);
        Object term301 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term303 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term301, term301.getClass(), "description", "");
        setField(term303, term303.getClass(), "name", null);
        setField(term303, term303.getClass(), "url", null);
        setField(term301, term301.getClass(), "language", term303);
        ArrayList term287 = new ArrayList();
        ((ArrayList) term287).add(term289);
        ((ArrayList) term287).add(term292);
        ((ArrayList) term287).add(term295);
        ((ArrayList) term287).add(term298);
        ((ArrayList) term287).add(term301);
        ArrayList term306 = new ArrayList();
        Object term312 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term314 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term312, term312.getClass(), "name", "");
        setField(term314, term314.getClass(), "name", null);
        setField(term314, term314.getClass(), "url", null);
        setField(term312, term312.getClass(), "language", term314);
        Object term315 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term317 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term315, term315.getClass(), "name", "");
        setField(term317, term317.getClass(), "name", null);
        setField(term317, term317.getClass(), "url", null);
        setField(term315, term315.getClass(), "language", term317);
        Object term318 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term320 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term318, term318.getClass(), "name", "");
        setField(term320, term320.getClass(), "name", null);
        setField(term320, term320.getClass(), "url", null);
        setField(term318, term318.getClass(), "language", term320);
        ArrayList term310 = new ArrayList();
        ((ArrayList) term310).add(term312);
        ((ArrayList) term310).add(term315);
        ((ArrayList) term310).add(term318);
        term272 = newInstance(Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget"));
        setField(term272, term272.getClass(), "id", term273);
        setField(term272, term272.getClass(), "name", "QXzGXbEXMu");
        setField(term272, term272.getClass(), "descriptions", term287);
        setField(term272, term272.getClass(), "moves", term306);
        setField(term272, term272.getClass(), "names", term310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescriptions", argTypes, term272, args);
    }

};


