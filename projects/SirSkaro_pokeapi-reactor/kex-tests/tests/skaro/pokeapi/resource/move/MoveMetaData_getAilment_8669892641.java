package skaro.pokeapi.resource.move;

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
import static skaro.pokeapi.resource.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class MoveMetaData_getAilment_8669892641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1890;

    public MoveMetaData_getAilment_8669892641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1941 = new Integer(1596070772);
        Integer term1943 = new Integer(97029295);
        Integer term1945 = new Integer(-1371869594);
        Integer term1947 = new Integer(-2095575670);
        Integer term1949 = new Integer(1225272962);
        Integer term1951 = new Integer(1324040357);
        Integer term1953 = new Integer(-1588772968);
        Integer term1955 = new Integer(-93135961);
        Integer term1957 = new Integer(-112921587);
        Integer term1959 = new Integer(933028652);
        term1890 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term1891 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1916 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1891, term1891.getClass(), "name", "CKWpJaaaxX");
        setField(term1891, term1891.getClass(), "url", "UBRmXJmfrt");
        setField(term1890, term1890.getClass(), "ailment", term1891);
        setField(term1916, term1916.getClass(), "name", "WZzvmIHhzZ");
        setField(term1916, term1916.getClass(), "url", "doQLHkjpNm");
        setField(term1890, term1890.getClass(), "category", term1916);
        setField(term1890, term1890.getClass(), "minHits", term1941);
        setField(term1890, term1890.getClass(), "maxHits", term1943);
        setField(term1890, term1890.getClass(), "minTurns", term1945);
        setField(term1890, term1890.getClass(), "maxTurns", term1947);
        setField(term1890, term1890.getClass(), "drain", term1949);
        setField(term1890, term1890.getClass(), "healing", term1951);
        setField(term1890, term1890.getClass(), "critRate", term1953);
        setField(term1890, term1890.getClass(), "ailmentChance", term1955);
        setField(term1890, term1890.getClass(), "flinchChance", term1957);
        setField(term1890, term1890.getClass(), "statChance", term1959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAilment", argTypes, term1890, args);
    }

};


