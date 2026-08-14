package skaro.pokeapi.resource.contesteffect;

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
import static skaro.pokeapi.resource.contesteffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class ContestEffect_getAppeal_4028707233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;

    public ContestEffect_getAppeal_4028707233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term86 = new Integer(-2038273078);
        Integer term88 = new Integer(1227103734);
        Integer term90 = new Integer(-1339778481);
        Object term94 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term96 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term94, term94.getClass(), "effect", "");
        setField(term96, term96.getClass(), "name", null);
        setField(term96, term96.getClass(), "url", null);
        setField(term94, term94.getClass(), "language", term96);
        ArrayList term92 = new ArrayList();
        ((ArrayList) term92).add(term94);
        Object term101 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term103 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term104 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term101, term101.getClass(), "flavorText", "");
        setField(term103, term103.getClass(), "name", null);
        setField(term103, term103.getClass(), "url", null);
        setField(term101, term101.getClass(), "language", term103);
        setField(term104, term104.getClass(), "name", null);
        setField(term104, term104.getClass(), "url", null);
        setField(term101, term101.getClass(), "version", term104);
        Object term105 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term107 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term108 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term105, term105.getClass(), "flavorText", "");
        setField(term107, term107.getClass(), "name", null);
        setField(term107, term107.getClass(), "url", null);
        setField(term105, term105.getClass(), "language", term107);
        setField(term108, term108.getClass(), "name", null);
        setField(term108, term108.getClass(), "url", null);
        setField(term105, term105.getClass(), "version", term108);
        Object term109 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term111 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term112 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term109, term109.getClass(), "flavorText", "");
        setField(term111, term111.getClass(), "name", null);
        setField(term111, term111.getClass(), "url", null);
        setField(term109, term109.getClass(), "language", term111);
        setField(term112, term112.getClass(), "name", null);
        setField(term112, term112.getClass(), "url", null);
        setField(term109, term109.getClass(), "version", term112);
        Object term113 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term115 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term116 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term113, term113.getClass(), "flavorText", "");
        setField(term115, term115.getClass(), "name", null);
        setField(term115, term115.getClass(), "url", null);
        setField(term113, term113.getClass(), "language", term115);
        setField(term116, term116.getClass(), "name", null);
        setField(term116, term116.getClass(), "url", null);
        setField(term113, term113.getClass(), "version", term116);
        Object term117 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term119 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term117, term117.getClass(), "flavorText", "");
        setField(term119, term119.getClass(), "name", null);
        setField(term119, term119.getClass(), "url", null);
        setField(term117, term117.getClass(), "language", term119);
        setField(term117, term117.getClass(), "version", term115);
        Object term120 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        setField(term120, term120.getClass(), "flavorText", "");
        setField(term120, term120.getClass(), "language", term116);
        setField(term120, term120.getClass(), "version", term96);
        ArrayList term99 = new ArrayList();
        ((ArrayList) term99).add(term101);
        ((ArrayList) term99).add(term105);
        ((ArrayList) term99).add(term109);
        ((ArrayList) term99).add(term113);
        ((ArrayList) term99).add(term117);
        ((ArrayList) term99).add(term120);
        term85 = newInstance(Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect"));
        setField(term85, term85.getClass(), "id", term86);
        setField(term85, term85.getClass(), "appeal", term88);
        setField(term85, term85.getClass(), "jam", term90);
        setField(term85, term85.getClass(), "effectEntries", term92);
        setField(term85, term85.getClass(), "flavorTextEntries", term99);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAppeal", argTypes, term85, args);
    }

};


