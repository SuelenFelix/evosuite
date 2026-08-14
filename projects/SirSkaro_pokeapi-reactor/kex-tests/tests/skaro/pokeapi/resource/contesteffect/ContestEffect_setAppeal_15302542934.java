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

public class ContestEffect_setAppeal_15302542934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124;
     Object term165;

    public ContestEffect_setAppeal_15302542934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term125 = new Integer(1725571209);
        Integer term127 = new Integer(-522618178);
        Integer term129 = new Integer(1134449235);
        Object term133 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term135 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term133, term133.getClass(), "effect", "");
        setField(term135, term135.getClass(), "name", null);
        setField(term135, term135.getClass(), "url", null);
        setField(term133, term133.getClass(), "language", term135);
        Object term136 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term138 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term136, term136.getClass(), "effect", "");
        setField(term138, term138.getClass(), "name", null);
        setField(term138, term138.getClass(), "url", null);
        setField(term136, term136.getClass(), "language", term138);
        ArrayList term131 = new ArrayList();
        ((ArrayList) term131).add(term133);
        ((ArrayList) term131).add(term136);
        Object term143 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term145 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term146 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term143, term143.getClass(), "flavorText", "");
        setField(term145, term145.getClass(), "name", null);
        setField(term145, term145.getClass(), "url", null);
        setField(term143, term143.getClass(), "language", term145);
        setField(term146, term146.getClass(), "name", null);
        setField(term146, term146.getClass(), "url", null);
        setField(term143, term143.getClass(), "version", term146);
        Object term147 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term149 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term150 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term147, term147.getClass(), "flavorText", "");
        setField(term149, term149.getClass(), "name", null);
        setField(term149, term149.getClass(), "url", null);
        setField(term147, term147.getClass(), "language", term149);
        setField(term150, term150.getClass(), "name", null);
        setField(term150, term150.getClass(), "url", null);
        setField(term147, term147.getClass(), "version", term150);
        Object term151 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term153 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term154 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term151, term151.getClass(), "flavorText", "");
        setField(term153, term153.getClass(), "name", null);
        setField(term153, term153.getClass(), "url", null);
        setField(term151, term151.getClass(), "language", term153);
        setField(term154, term154.getClass(), "name", null);
        setField(term154, term154.getClass(), "url", null);
        setField(term151, term151.getClass(), "version", term154);
        Object term155 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        Object term157 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term158 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term155, term155.getClass(), "flavorText", "");
        setField(term157, term157.getClass(), "name", null);
        setField(term157, term157.getClass(), "url", null);
        setField(term155, term155.getClass(), "language", term157);
        setField(term158, term158.getClass(), "name", null);
        setField(term158, term158.getClass(), "url", null);
        setField(term155, term155.getClass(), "version", term158);
        Object term159 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        setField(term159, term159.getClass(), "flavorText", "");
        setField(term159, term159.getClass(), "language", term154);
        setField(term159, term159.getClass(), "version", term157);
        Object term161 = newInstance(Class.forName("skaro.pokeapi.resource.FlavorText"));
        setField(term161, term161.getClass(), "flavorText", "");
        setField(term161, term161.getClass(), "language", term135);
        setField(term161, term161.getClass(), "version", term150);
        ArrayList term141 = new ArrayList();
        ((ArrayList) term141).add(term143);
        ((ArrayList) term141).add(term147);
        ((ArrayList) term141).add(term151);
        ((ArrayList) term141).add(term155);
        ((ArrayList) term141).add(term159);
        ((ArrayList) term141).add(term161);
        term124 = newInstance(Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect"));
        setField(term124, term124.getClass(), "id", term125);
        setField(term124, term124.getClass(), "appeal", term127);
        setField(term124, term124.getClass(), "jam", term129);
        setField(term124, term124.getClass(), "effectEntries", term131);
        setField(term124, term124.getClass(), "flavorTextEntries", term141);
        term165 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesteffect.ContestEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term165;
        callMethod(klass, "setAppeal", argTypes, term124, args);
    }

};


