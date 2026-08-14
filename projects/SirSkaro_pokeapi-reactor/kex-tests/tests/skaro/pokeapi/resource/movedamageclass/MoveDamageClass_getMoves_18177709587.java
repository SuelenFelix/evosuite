package skaro.pokeapi.resource.movedamageclass;

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
import static skaro.pokeapi.resource.movedamageclass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class MoveDamageClass_getMoves_18177709587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382;

    public MoveDamageClass_getMoves_18177709587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term383 = new Integer(-2038273078);
        Object term399 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term401 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term399, term399.getClass(), "description", "");
        setField(term401, term401.getClass(), "name", null);
        setField(term401, term401.getClass(), "url", null);
        setField(term399, term399.getClass(), "language", term401);
        Object term402 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term404 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term402, term402.getClass(), "description", "");
        setField(term404, term404.getClass(), "name", null);
        setField(term404, term404.getClass(), "url", null);
        setField(term402, term402.getClass(), "language", term404);
        Object term405 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term407 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term405, term405.getClass(), "description", "");
        setField(term407, term407.getClass(), "name", null);
        setField(term407, term407.getClass(), "url", null);
        setField(term405, term405.getClass(), "language", term407);
        Object term408 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term410 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term408, term408.getClass(), "description", "");
        setField(term410, term410.getClass(), "name", null);
        setField(term410, term410.getClass(), "url", null);
        setField(term408, term408.getClass(), "language", term410);
        Object term411 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term413 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term411, term411.getClass(), "description", "");
        setField(term413, term413.getClass(), "name", null);
        setField(term413, term413.getClass(), "url", null);
        setField(term411, term411.getClass(), "language", term413);
        ArrayList term397 = new ArrayList();
        ((ArrayList) term397).add(term399);
        ((ArrayList) term397).add(term402);
        ((ArrayList) term397).add(term405);
        ((ArrayList) term397).add(term408);
        ((ArrayList) term397).add(term411);
        ArrayList term416 = new ArrayList();
        Object term422 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term424 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term422, term422.getClass(), "name", "");
        setField(term424, term424.getClass(), "name", null);
        setField(term424, term424.getClass(), "url", null);
        setField(term422, term422.getClass(), "language", term424);
        ArrayList term420 = new ArrayList();
        ((ArrayList) term420).add(term422);
        term382 = newInstance(Class.forName("skaro.pokeapi.resource.movedamageclass.MoveDamageClass"));
        setField(term382, term382.getClass(), "id", term383);
        setField(term382, term382.getClass(), "name", "ZzIujlwVsw");
        setField(term382, term382.getClass(), "descriptions", term397);
        setField(term382, term382.getClass(), "moves", term416);
        setField(term382, term382.getClass(), "names", term420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movedamageclass.MoveDamageClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMoves", argTypes, term382, args);
    }

};


