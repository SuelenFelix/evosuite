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

public class PokemonForm_setIsBattleOnly_62976637212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3721;
     Object term3891;

    public PokemonForm_setIsBattleOnly_62976637212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3722 = new Integer(-1530420153);
        Integer term3736 = new Integer(-469968304);
        Integer term3738 = new Integer(-1145578966);
        Boolean term3740 = new Boolean(true);
        Boolean term3742 = new Boolean(true);
        Object term3857 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3859 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3857, term3857.getClass(), "name", "");
        setField(term3859, term3859.getClass(), "name", null);
        setField(term3859, term3859.getClass(), "url", null);
        setField(term3857, term3857.getClass(), "language", term3859);
        Object term3860 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3862 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3860, term3860.getClass(), "name", "");
        setField(term3862, term3862.getClass(), "name", null);
        setField(term3862, term3862.getClass(), "url", null);
        setField(term3860, term3860.getClass(), "language", term3862);
        Object term3863 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3865 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3863, term3863.getClass(), "name", "");
        setField(term3865, term3865.getClass(), "name", null);
        setField(term3865, term3865.getClass(), "url", null);
        setField(term3863, term3863.getClass(), "language", term3865);
        Object term3866 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3868 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3866, term3866.getClass(), "name", "");
        setField(term3868, term3868.getClass(), "name", null);
        setField(term3868, term3868.getClass(), "url", null);
        setField(term3866, term3866.getClass(), "language", term3868);
        Object term3869 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3871 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3869, term3869.getClass(), "name", "");
        setField(term3871, term3871.getClass(), "name", null);
        setField(term3871, term3871.getClass(), "url", null);
        setField(term3869, term3869.getClass(), "language", term3871);
        Object term3872 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3874 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3872, term3872.getClass(), "name", "");
        setField(term3874, term3874.getClass(), "name", null);
        setField(term3874, term3874.getClass(), "url", null);
        setField(term3872, term3872.getClass(), "language", term3874);
        Object term3875 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3877 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3875, term3875.getClass(), "name", "");
        setField(term3877, term3877.getClass(), "name", null);
        setField(term3877, term3877.getClass(), "url", null);
        setField(term3875, term3875.getClass(), "language", term3877);
        Object term3878 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3880 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3878, term3878.getClass(), "name", "");
        setField(term3880, term3880.getClass(), "name", null);
        setField(term3880, term3880.getClass(), "url", null);
        setField(term3878, term3878.getClass(), "language", term3880);
        Object term3881 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term3881, term3881.getClass(), "name", "");
        setField(term3881, term3881.getClass(), "language", term3874);
        ArrayList term3855 = new ArrayList();
        ((ArrayList) term3855).add(term3857);
        ((ArrayList) term3855).add(term3860);
        ((ArrayList) term3855).add(term3863);
        ((ArrayList) term3855).add(term3866);
        ((ArrayList) term3855).add(term3869);
        ((ArrayList) term3855).add(term3872);
        ((ArrayList) term3855).add(term3875);
        ((ArrayList) term3855).add(term3878);
        ((ArrayList) term3855).add(term3881);
        Object term3887 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term3887, term3887.getClass(), "name", "");
        setField(term3887, term3887.getClass(), "language", term3877);
        ArrayList term3885 = new ArrayList();
        ((ArrayList) term3885).add(term3887);
        ((ArrayList) term3885).add(term3857);
        ((ArrayList) term3885).add(term3872);
        term3721 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term3756 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3781 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term3830 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3721, term3721.getClass(), "id", term3722);
        setField(term3721, term3721.getClass(), "name", "llRfwANcVF");
        setField(term3721, term3721.getClass(), "order", term3736);
        setField(term3721, term3721.getClass(), "formOrder", term3738);
        setField(term3721, term3721.getClass(), "isDefault", term3740);
        setField(term3721, term3721.getClass(), "isBattleOnly", term3742);
        setField(term3721, term3721.getClass(), "formName", "sUEeHQTWkA");
        setField(term3756, term3756.getClass(), "name", "BDIRCxAWLA");
        setField(term3756, term3756.getClass(), "url", "eOJfbiZLnb");
        setField(term3721, term3721.getClass(), "pokemon", term3756);
        setField(term3781, term3781.getClass(), "frontDefault", "nKZKnxWYCK");
        setField(term3781, term3781.getClass(), "frontShiny", "JOqQxuzRuZ");
        setField(term3781, term3781.getClass(), "backDefault", "RSaoipUlsg");
        setField(term3781, term3781.getClass(), "backShiny", "cSHGbqKqlN");
        setField(term3721, term3721.getClass(), "sprites", term3781);
        setField(term3830, term3830.getClass(), "name", "pFAfANnxup");
        setField(term3830, term3830.getClass(), "url", "FbSIUZyBXZ");
        setField(term3721, term3721.getClass(), "versionGroup", term3830);
        setField(term3721, term3721.getClass(), "names", term3855);
        setField(term3721, term3721.getClass(), "formNames", term3885);
        term3891 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term3891;
        callMethod(klass, "setIsBattleOnly", argTypes, term3721, args);
    }

};


