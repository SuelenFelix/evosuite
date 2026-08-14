package skaro.pokeapi.resource;

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
import static skaro.pokeapi.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;

public class VersionEncounterDetail_getVersion_13306241001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38361;

    public VersionEncounterDetail_getVersion_13306241001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38387 = new Integer(1986855642);
        Integer term38392 = new Integer(1280322790);
        Integer term38394 = new Integer(-1702209203);
        ArrayList term38396 = new ArrayList();
        Integer term38399 = new Integer(-1592307668);
        Object term38391 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38401 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38391, term38391.getClass(), "minLevel", term38392);
        setField(term38391, term38391.getClass(), "maxLevel", term38394);
        setField(term38391, term38391.getClass(), "conditionValues", term38396);
        setField(term38391, term38391.getClass(), "chance", term38399);
        setField(term38401, term38401.getClass(), "name", null);
        setField(term38401, term38401.getClass(), "url", null);
        setField(term38391, term38391.getClass(), "method", term38401);
        Integer term38403 = new Integer(-203832871);
        Integer term38405 = new Integer(1151963130);
        ArrayList term38407 = new ArrayList();
        Integer term38410 = new Integer(-1855819749);
        Object term38402 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38412 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38402, term38402.getClass(), "minLevel", term38403);
        setField(term38402, term38402.getClass(), "maxLevel", term38405);
        setField(term38402, term38402.getClass(), "conditionValues", term38407);
        setField(term38402, term38402.getClass(), "chance", term38410);
        setField(term38412, term38412.getClass(), "name", null);
        setField(term38412, term38412.getClass(), "url", null);
        setField(term38402, term38402.getClass(), "method", term38412);
        Integer term38414 = new Integer(1059048043);
        Integer term38416 = new Integer(537273345);
        ArrayList term38418 = new ArrayList();
        Integer term38421 = new Integer(-346107257);
        Object term38413 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38423 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38413, term38413.getClass(), "minLevel", term38414);
        setField(term38413, term38413.getClass(), "maxLevel", term38416);
        setField(term38413, term38413.getClass(), "conditionValues", term38418);
        setField(term38413, term38413.getClass(), "chance", term38421);
        setField(term38423, term38423.getClass(), "name", null);
        setField(term38423, term38423.getClass(), "url", null);
        setField(term38413, term38413.getClass(), "method", term38423);
        Integer term38425 = new Integer(-1577393360);
        Integer term38427 = new Integer(1112256038);
        ArrayList term38429 = new ArrayList();
        Integer term38432 = new Integer(-441333794);
        Object term38424 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38434 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38424, term38424.getClass(), "minLevel", term38425);
        setField(term38424, term38424.getClass(), "maxLevel", term38427);
        setField(term38424, term38424.getClass(), "conditionValues", term38429);
        setField(term38424, term38424.getClass(), "chance", term38432);
        setField(term38434, term38434.getClass(), "name", null);
        setField(term38434, term38434.getClass(), "url", null);
        setField(term38424, term38424.getClass(), "method", term38434);
        Integer term38436 = new Integer(1504698817);
        Integer term38438 = new Integer(-2018333791);
        ArrayList term38440 = new ArrayList();
        Integer term38443 = new Integer(-742476678);
        Object term38435 = newInstance(Class.forName("skaro.pokeapi.resource.Encounter"));
        Object term38445 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38435, term38435.getClass(), "minLevel", term38436);
        setField(term38435, term38435.getClass(), "maxLevel", term38438);
        setField(term38435, term38435.getClass(), "conditionValues", term38440);
        setField(term38435, term38435.getClass(), "chance", term38443);
        setField(term38445, term38445.getClass(), "name", null);
        setField(term38445, term38445.getClass(), "url", null);
        setField(term38435, term38435.getClass(), "method", term38445);
        ArrayList term38389 = new ArrayList();
        ((ArrayList) term38389).add(term38391);
        ((ArrayList) term38389).add(term38402);
        ((ArrayList) term38389).add(term38413);
        ((ArrayList) term38389).add(term38424);
        ((ArrayList) term38389).add(term38435);
        term38361 = newInstance(Class.forName("skaro.pokeapi.resource.VersionEncounterDetail"));
        Object term38362 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term38362, term38362.getClass(), "name", "SMpEesDFbN");
        setField(term38362, term38362.getClass(), "url", "Nmrdnhkhse");
        setField(term38361, term38361.getClass(), "version", term38362);
        setField(term38361, term38361.getClass(), "maxChance", term38387);
        setField(term38361, term38361.getClass(), "encounterDetails", term38389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.VersionEncounterDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term38361, args);
    }

};


