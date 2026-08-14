package skaro.pokeapi.resource.growthrate;

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
import static skaro.pokeapi.resource.growthrate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class GrowthRate_setLevels_138764447710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term876;
     Object term972;

    public GrowthRate_setLevels_138764447710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term877 = new Integer(-481533957);
        Object term905 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term907 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term905, term905.getClass(), "description", "");
        setField(term907, term907.getClass(), "name", null);
        setField(term907, term907.getClass(), "url", null);
        setField(term905, term905.getClass(), "language", term907);
        Object term908 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term910 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term908, term908.getClass(), "description", "");
        setField(term910, term910.getClass(), "name", null);
        setField(term910, term910.getClass(), "url", null);
        setField(term908, term908.getClass(), "language", term910);
        Object term911 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term913 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term911, term911.getClass(), "description", "");
        setField(term913, term913.getClass(), "name", null);
        setField(term913, term913.getClass(), "url", null);
        setField(term911, term911.getClass(), "language", term913);
        Object term914 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term916 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term914, term914.getClass(), "description", "");
        setField(term916, term916.getClass(), "name", null);
        setField(term916, term916.getClass(), "url", null);
        setField(term914, term914.getClass(), "language", term916);
        ArrayList term903 = new ArrayList();
        ((ArrayList) term903).add(term905);
        ((ArrayList) term903).add(term908);
        ((ArrayList) term903).add(term911);
        ((ArrayList) term903).add(term914);
        Integer term922 = new Integer(1240914516);
        Integer term924 = new Integer(-1465035361);
        Object term921 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term921, term921.getClass(), "level", term922);
        setField(term921, term921.getClass(), "experience", term924);
        Integer term927 = new Integer(1090617576);
        Integer term929 = new Integer(-1547384488);
        Object term926 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term926, term926.getClass(), "level", term927);
        setField(term926, term926.getClass(), "experience", term929);
        Integer term932 = new Integer(1442160736);
        Integer term934 = new Integer(1114000454);
        Object term931 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term931, term931.getClass(), "level", term932);
        setField(term931, term931.getClass(), "experience", term934);
        Integer term937 = new Integer(-556405712);
        Integer term939 = new Integer(-1772434990);
        Object term936 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term936, term936.getClass(), "level", term937);
        setField(term936, term936.getClass(), "experience", term939);
        Integer term942 = new Integer(-1845499264);
        Integer term944 = new Integer(-505439934);
        Object term941 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term941, term941.getClass(), "level", term942);
        setField(term941, term941.getClass(), "experience", term944);
        Integer term947 = new Integer(-344842608);
        Integer term949 = new Integer(941650513);
        Object term946 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term946, term946.getClass(), "level", term947);
        setField(term946, term946.getClass(), "experience", term949);
        Integer term952 = new Integer(444029505);
        Integer term954 = new Integer(-1034506028);
        Object term951 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term951, term951.getClass(), "level", term952);
        setField(term951, term951.getClass(), "experience", term954);
        Integer term957 = new Integer(-1263114719);
        Integer term959 = new Integer(-894662986);
        Object term956 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term956, term956.getClass(), "level", term957);
        setField(term956, term956.getClass(), "experience", term959);
        Integer term962 = new Integer(304775596);
        Integer term964 = new Integer(-1347665717);
        Object term961 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term961, term961.getClass(), "level", term962);
        setField(term961, term961.getClass(), "experience", term964);
        ArrayList term919 = new ArrayList();
        ((ArrayList) term919).add(term921);
        ((ArrayList) term919).add(term926);
        ((ArrayList) term919).add(term931);
        ((ArrayList) term919).add(term936);
        ((ArrayList) term919).add(term941);
        ((ArrayList) term919).add(term946);
        ((ArrayList) term919).add(term951);
        ((ArrayList) term919).add(term956);
        ((ArrayList) term919).add(term961);
        ArrayList term968 = new ArrayList();
        term876 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate"));
        setField(term876, term876.getClass(), "id", term877);
        setField(term876, term876.getClass(), "name", "eVpkWxjuki");
        setField(term876, term876.getClass(), "formula", "SJiQaLvSKv");
        setField(term876, term876.getClass(), "descriptions", term903);
        setField(term876, term876.getClass(), "levels", term919);
        setField(term876, term876.getClass(), "pokemonSpecies", term968);
        Integer term976 = new Integer(-1888585309);
        Integer term978 = new Integer(683666002);
        Object term975 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term975, term975.getClass(), "level", term976);
        setField(term975, term975.getClass(), "experience", term978);
        Integer term982 = new Integer(1596213415);
        Integer term984 = new Integer(-268815336);
        Object term981 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term981, term981.getClass(), "level", term982);
        setField(term981, term981.getClass(), "experience", term984);
        Integer term988 = new Integer(-1210583429);
        Integer term990 = new Integer(-663691365);
        Object term987 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term987, term987.getClass(), "level", term988);
        setField(term987, term987.getClass(), "experience", term990);
        term972 = new LinkedList();
        ((LinkedList) term972).add(term975);
        ((LinkedList) term972).add(term981);
        ((LinkedList) term972).add(term987);
        ((LinkedList) term972).add((Object)null);
        ((LinkedList) term972).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term972;
        callMethod(klass, "setLevels", argTypes, term876, args);
    }

};


