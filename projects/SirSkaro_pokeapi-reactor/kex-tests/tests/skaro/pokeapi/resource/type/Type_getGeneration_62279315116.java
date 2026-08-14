package skaro.pokeapi.resource.type;

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
import static skaro.pokeapi.resource.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Type_getGeneration_62279315116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57884;

    public Type_getGeneration_62279315116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term57885 = new Integer(1128720609);
        ArrayList term57900 = new ArrayList();
        ArrayList term57904 = new ArrayList();
        ArrayList term57908 = new ArrayList();
        ArrayList term57912 = new ArrayList();
        ArrayList term57916 = new ArrayList();
        ArrayList term57920 = new ArrayList();
        Object term57926 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term57927 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term57928 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term57927, term57927.getClass(), "name", null);
        setField(term57927, term57927.getClass(), "url", null);
        setField(term57926, term57926.getClass(), "generation", term57927);
        setField(term57928, term57928.getClass(), "noDamageTo", null);
        setField(term57928, term57928.getClass(), "halfDamageTo", null);
        setField(term57928, term57928.getClass(), "doubleDamageTo", null);
        setField(term57928, term57928.getClass(), "noDamageFrom", null);
        setField(term57928, term57928.getClass(), "halfDamageFrom", null);
        setField(term57928, term57928.getClass(), "doubleDamageFrom", null);
        setField(term57926, term57926.getClass(), "damageRelations", term57928);
        Object term57929 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term57930 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term57931 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term57930, term57930.getClass(), "name", null);
        setField(term57930, term57930.getClass(), "url", null);
        setField(term57929, term57929.getClass(), "generation", term57930);
        setField(term57931, term57931.getClass(), "noDamageTo", null);
        setField(term57931, term57931.getClass(), "halfDamageTo", null);
        setField(term57931, term57931.getClass(), "doubleDamageTo", null);
        setField(term57931, term57931.getClass(), "noDamageFrom", null);
        setField(term57931, term57931.getClass(), "halfDamageFrom", null);
        setField(term57931, term57931.getClass(), "doubleDamageFrom", null);
        setField(term57929, term57929.getClass(), "damageRelations", term57931);
        Object term57932 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term57933 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term57934 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term57933, term57933.getClass(), "name", null);
        setField(term57933, term57933.getClass(), "url", null);
        setField(term57932, term57932.getClass(), "generation", term57933);
        setField(term57934, term57934.getClass(), "noDamageTo", null);
        setField(term57934, term57934.getClass(), "halfDamageTo", null);
        setField(term57934, term57934.getClass(), "doubleDamageTo", null);
        setField(term57934, term57934.getClass(), "noDamageFrom", null);
        setField(term57934, term57934.getClass(), "halfDamageFrom", null);
        setField(term57934, term57934.getClass(), "doubleDamageFrom", null);
        setField(term57932, term57932.getClass(), "damageRelations", term57934);
        Object term57935 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term57936 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term57937 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term57936, term57936.getClass(), "name", null);
        setField(term57936, term57936.getClass(), "url", null);
        setField(term57935, term57935.getClass(), "generation", term57936);
        setField(term57937, term57937.getClass(), "noDamageTo", null);
        setField(term57937, term57937.getClass(), "halfDamageTo", null);
        setField(term57937, term57937.getClass(), "doubleDamageTo", null);
        setField(term57937, term57937.getClass(), "noDamageFrom", null);
        setField(term57937, term57937.getClass(), "halfDamageFrom", null);
        setField(term57937, term57937.getClass(), "doubleDamageFrom", null);
        setField(term57935, term57935.getClass(), "damageRelations", term57937);
        Object term57938 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term57939 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term57940 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term57939, term57939.getClass(), "name", null);
        setField(term57939, term57939.getClass(), "url", null);
        setField(term57938, term57938.getClass(), "generation", term57939);
        setField(term57940, term57940.getClass(), "noDamageTo", null);
        setField(term57940, term57940.getClass(), "halfDamageTo", null);
        setField(term57940, term57940.getClass(), "doubleDamageTo", null);
        setField(term57940, term57940.getClass(), "noDamageFrom", null);
        setField(term57940, term57940.getClass(), "halfDamageFrom", null);
        setField(term57940, term57940.getClass(), "doubleDamageFrom", null);
        setField(term57938, term57938.getClass(), "damageRelations", term57940);
        ArrayList term57924 = new ArrayList();
        ((ArrayList) term57924).add(term57926);
        ((ArrayList) term57924).add(term57929);
        ((ArrayList) term57924).add(term57932);
        ((ArrayList) term57924).add(term57935);
        ((ArrayList) term57924).add(term57938);
        Integer term57946 = new Integer(216265002);
        Object term57945 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term57948 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term57945, term57945.getClass(), "gameIndex", term57946);
        setField(term57948, term57948.getClass(), "name", null);
        setField(term57948, term57948.getClass(), "url", null);
        setField(term57945, term57945.getClass(), "generation", term57948);
        ArrayList term57943 = new ArrayList();
        ((ArrayList) term57943).add(term57945);
        ArrayList term58001 = new ArrayList();
        Integer term58008 = new Integer(-97405660);
        Object term58007 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        Object term58010 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58007, term58007.getClass(), "slot", term58008);
        setField(term58010, term58010.getClass(), "name", null);
        setField(term58010, term58010.getClass(), "url", null);
        setField(term58007, term58007.getClass(), "pokemon", term58010);
        Integer term58012 = new Integer(872278468);
        Object term58011 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        Object term58014 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term58011, term58011.getClass(), "slot", term58012);
        setField(term58014, term58014.getClass(), "name", null);
        setField(term58014, term58014.getClass(), "url", null);
        setField(term58011, term58011.getClass(), "pokemon", term58014);
        ArrayList term58005 = new ArrayList();
        ((ArrayList) term58005).add(term58007);
        ((ArrayList) term58005).add(term58011);
        ArrayList term58017 = new ArrayList();
        term57884 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        Object term57899 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        Object term57951 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term57976 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term57884, term57884.getClass(), "id", term57885);
        setField(term57884, term57884.getClass(), "name", "vTdDItJvmi");
        setField(term57899, term57899.getClass(), "noDamageTo", term57900);
        setField(term57899, term57899.getClass(), "halfDamageTo", term57904);
        setField(term57899, term57899.getClass(), "doubleDamageTo", term57908);
        setField(term57899, term57899.getClass(), "noDamageFrom", term57912);
        setField(term57899, term57899.getClass(), "halfDamageFrom", term57916);
        setField(term57899, term57899.getClass(), "doubleDamageFrom", term57920);
        setField(term57884, term57884.getClass(), "damageRelations", term57899);
        setField(term57884, term57884.getClass(), "pastDamageRelations", term57924);
        setField(term57884, term57884.getClass(), "gameIndices", term57943);
        setField(term57951, term57951.getClass(), "name", "AizJhCCKXG");
        setField(term57951, term57951.getClass(), "url", "iLylbwIxgL");
        setField(term57884, term57884.getClass(), "generation", term57951);
        setField(term57976, term57976.getClass(), "name", "GdxqsdOdeY");
        setField(term57976, term57976.getClass(), "url", "ZkgLXzqSzZ");
        setField(term57884, term57884.getClass(), "moveDamageClass", term57976);
        setField(term57884, term57884.getClass(), "names", term58001);
        setField(term57884, term57884.getClass(), "pokemon", term58005);
        setField(term57884, term57884.getClass(), "moves", term58017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeneration", argTypes, term57884, args);
    }

};


