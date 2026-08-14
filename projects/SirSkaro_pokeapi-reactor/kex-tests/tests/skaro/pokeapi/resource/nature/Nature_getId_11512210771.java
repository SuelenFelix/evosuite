package skaro.pokeapi.resource.nature;

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
import static skaro.pokeapi.resource.nature.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Nature_getId_11512210771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Nature_getId_11512210771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Object term118 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term120 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term118, term118.getClass(), "name", "");
        setField(term120, term120.getClass(), "name", null);
        setField(term120, term120.getClass(), "url", null);
        setField(term118, term118.getClass(), "language", term120);
        Object term121 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term123 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term121, term121.getClass(), "name", "");
        setField(term123, term123.getClass(), "name", null);
        setField(term123, term123.getClass(), "url", null);
        setField(term121, term121.getClass(), "language", term123);
        Object term124 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term126 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124, term124.getClass(), "name", "");
        setField(term126, term126.getClass(), "name", null);
        setField(term126, term126.getClass(), "url", null);
        setField(term124, term124.getClass(), "language", term126);
        Object term127 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term129 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term127, term127.getClass(), "name", "");
        setField(term129, term129.getClass(), "name", null);
        setField(term129, term129.getClass(), "url", null);
        setField(term127, term127.getClass(), "language", term129);
        Object term130 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term132 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term130, term130.getClass(), "name", "");
        setField(term132, term132.getClass(), "name", null);
        setField(term132, term132.getClass(), "url", null);
        setField(term130, term130.getClass(), "language", term132);
        ArrayList term116 = new ArrayList();
        ((ArrayList) term116).add(term118);
        ((ArrayList) term116).add(term121);
        ((ArrayList) term116).add(term124);
        ((ArrayList) term116).add(term127);
        ((ArrayList) term116).add(term130);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term16 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term41 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term66 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term91 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term16, term16.getClass(), "name", "sjlJAEtRrb");
        setField(term16, term16.getClass(), "url", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "decreasedStat", term16);
        setField(term41, term41.getClass(), "name", "xxtlPwDYFs");
        setField(term41, term41.getClass(), "url", "jJCZpVmanW");
        setField(term1, term1.getClass(), "increasedStat", term41);
        setField(term66, term66.getClass(), "name", "EGtDIRbSSb");
        setField(term66, term66.getClass(), "url", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "hatesFlavor", term66);
        setField(term91, term91.getClass(), "name", "MjGYSRKTNF");
        setField(term91, term91.getClass(), "url", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "likesFlavor", term91);
        setField(term1, term1.getClass(), "names", term116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


