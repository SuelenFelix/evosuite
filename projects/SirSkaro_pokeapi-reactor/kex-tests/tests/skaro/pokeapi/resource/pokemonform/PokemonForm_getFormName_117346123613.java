package skaro.pokeapi.resource.pokemonform;

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
import static skaro.pokeapi.resource.pokemonform.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;

public class PokemonForm_getFormName_117346123613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3993;

    public PokemonForm_getFormName_117346123613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3994 = new Integer(679763016);
        Integer term4008 = new Integer(1962444399);
        Integer term4010 = new Integer(767834723);
        Boolean term4012 = new Boolean(false);
        Boolean term4014 = new Boolean(false);
        Object term4129 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4131 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4129, term4129.getClass(), "name", "");
        setField(term4131, term4131.getClass(), "name", null);
        setField(term4131, term4131.getClass(), "url", null);
        setField(term4129, term4129.getClass(), "language", term4131);
        Object term4132 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4134 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4132, term4132.getClass(), "name", "");
        setField(term4134, term4134.getClass(), "name", null);
        setField(term4134, term4134.getClass(), "url", null);
        setField(term4132, term4132.getClass(), "language", term4134);
        Object term4135 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4137 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4135, term4135.getClass(), "name", "");
        setField(term4137, term4137.getClass(), "name", null);
        setField(term4137, term4137.getClass(), "url", null);
        setField(term4135, term4135.getClass(), "language", term4137);
        Object term4138 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4140 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4138, term4138.getClass(), "name", "");
        setField(term4140, term4140.getClass(), "name", null);
        setField(term4140, term4140.getClass(), "url", null);
        setField(term4138, term4138.getClass(), "language", term4140);
        Object term4141 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4143 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4141, term4141.getClass(), "name", "");
        setField(term4143, term4143.getClass(), "name", null);
        setField(term4143, term4143.getClass(), "url", null);
        setField(term4141, term4141.getClass(), "language", term4143);
        ArrayList term4127 = new ArrayList();
        ((ArrayList) term4127).add(term4129);
        ((ArrayList) term4127).add(term4132);
        ((ArrayList) term4127).add(term4135);
        ((ArrayList) term4127).add(term4138);
        ((ArrayList) term4127).add(term4141);
        Object term4148 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4150 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4148, term4148.getClass(), "name", "");
        setField(term4150, term4150.getClass(), "name", null);
        setField(term4150, term4150.getClass(), "url", null);
        setField(term4148, term4148.getClass(), "language", term4150);
        Object term4151 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4153 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4151, term4151.getClass(), "name", "");
        setField(term4153, term4153.getClass(), "name", null);
        setField(term4153, term4153.getClass(), "url", null);
        setField(term4151, term4151.getClass(), "language", term4153);
        Object term4154 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4156 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4154, term4154.getClass(), "name", "");
        setField(term4156, term4156.getClass(), "name", null);
        setField(term4156, term4156.getClass(), "url", null);
        setField(term4154, term4154.getClass(), "language", term4156);
        Object term4157 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term4157, term4157.getClass(), "name", "");
        setField(term4157, term4157.getClass(), "language", term4150);
        Object term4159 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term4159, term4159.getClass(), "name", "");
        setField(term4159, term4159.getClass(), "language", term4153);
        ArrayList term4146 = new ArrayList();
        ((ArrayList) term4146).add(term4148);
        ((ArrayList) term4146).add(term4151);
        ((ArrayList) term4146).add(term4154);
        ((ArrayList) term4146).add(term4157);
        ((ArrayList) term4146).add(term4159);
        ((ArrayList) term4146).add(term4129);
        term3993 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term4028 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4053 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term4102 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3993, term3993.getClass(), "id", term3994);
        setField(term3993, term3993.getClass(), "name", "sOdkipUKRu");
        setField(term3993, term3993.getClass(), "order", term4008);
        setField(term3993, term3993.getClass(), "formOrder", term4010);
        setField(term3993, term3993.getClass(), "isDefault", term4012);
        setField(term3993, term3993.getClass(), "isBattleOnly", term4014);
        setField(term3993, term3993.getClass(), "formName", "oKwCDqywym");
        setField(term4028, term4028.getClass(), "name", "zjZYTddemL");
        setField(term4028, term4028.getClass(), "url", "QtrylgCLiF");
        setField(term3993, term3993.getClass(), "pokemon", term4028);
        setField(term4053, term4053.getClass(), "frontDefault", "orEuhCStGM");
        setField(term4053, term4053.getClass(), "frontShiny", "HhEaSXWvrY");
        setField(term4053, term4053.getClass(), "backDefault", "CVRGEomOth");
        setField(term4053, term4053.getClass(), "backShiny", "vSeruUyNWX");
        setField(term3993, term3993.getClass(), "sprites", term4053);
        setField(term4102, term4102.getClass(), "name", "UkKvaeJfEC");
        setField(term4102, term4102.getClass(), "url", "WPxXsahPRq");
        setField(term3993, term3993.getClass(), "versionGroup", term4102);
        setField(term3993, term3993.getClass(), "names", term4127);
        setField(term3993, term3993.getClass(), "formNames", term4146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormName", argTypes, term3993, args);
    }

};


