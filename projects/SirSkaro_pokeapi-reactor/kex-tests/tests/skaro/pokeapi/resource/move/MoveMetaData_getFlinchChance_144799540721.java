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

public class MoveMetaData_getFlinchChance_144799540721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4216;

    public MoveMetaData_getFlinchChance_144799540721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4267 = new Integer(-936895502);
        Integer term4269 = new Integer(-129547140);
        Integer term4271 = new Integer(199287428);
        Integer term4273 = new Integer(-1195339592);
        Integer term4275 = new Integer(-376422566);
        Integer term4277 = new Integer(306847454);
        Integer term4279 = new Integer(1745276158);
        Integer term4281 = new Integer(2009020256);
        Integer term4283 = new Integer(2049577015);
        Integer term4285 = new Integer(1236004505);
        term4216 = newInstance(Class.forName("skaro.pokeapi.resource.move.MoveMetaData"));
        Object term4217 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4242 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4217, term4217.getClass(), "name", "fzeqPnzpnt");
        setField(term4217, term4217.getClass(), "url", "RxbhrFBjkO");
        setField(term4216, term4216.getClass(), "ailment", term4217);
        setField(term4242, term4242.getClass(), "name", "aanyiAOJCl");
        setField(term4242, term4242.getClass(), "url", "VDokbsCuqq");
        setField(term4216, term4216.getClass(), "category", term4242);
        setField(term4216, term4216.getClass(), "minHits", term4267);
        setField(term4216, term4216.getClass(), "maxHits", term4269);
        setField(term4216, term4216.getClass(), "minTurns", term4271);
        setField(term4216, term4216.getClass(), "maxTurns", term4273);
        setField(term4216, term4216.getClass(), "drain", term4275);
        setField(term4216, term4216.getClass(), "healing", term4277);
        setField(term4216, term4216.getClass(), "critRate", term4279);
        setField(term4216, term4216.getClass(), "ailmentChance", term4281);
        setField(term4216, term4216.getClass(), "flinchChance", term4283);
        setField(term4216, term4216.getClass(), "statChance", term4285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.move.MoveMetaData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFlinchChance", argTypes, term4216, args);
    }

};


