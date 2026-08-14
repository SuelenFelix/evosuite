package software.pando.crypto.nacl;

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
import static software.pando.crypto.nacl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Field25519_sub_11699879692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2263;
     Object term2272;
     Object term2278;

    public Field25519_sub_11699879692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2263 = (long[]) newLongArray(8);
        setLongElement(term2263, 0, -8463029266761149071L);
        setLongElement(term2263, 1, 3133860696238261492L);
        setLongElement(term2263, 2, 7247160664318067468L);
        setLongElement(term2263, 3, 2135754395358000892L);
        setLongElement(term2263, 4, -8085190702504231560L);
        setLongElement(term2263, 5, 1672578078364590450L);
        setLongElement(term2263, 6, 4949335493504695457L);
        setLongElement(term2263, 7, -5216789073301458893L);
        term2272 = (long[]) newLongArray(5);
        setLongElement(term2272, 0, -1832940336320585644L);
        setLongElement(term2272, 1, -8033714905181142681L);
        setLongElement(term2272, 2, -9040825890007374809L);
        setLongElement(term2272, 3, 1368340889161782793L);
        setLongElement(term2272, 4, -5786861555969446503L);
        term2278 = (long[]) newLongArray(6);
        setLongElement(term2278, 0, 2354625302846375590L);
        setLongElement(term2278, 1, 7276637106827860087L);
        setLongElement(term2278, 2, -3936701866695933852L);
        setLongElement(term2278, 3, 1215116475929634177L);
        setLongElement(term2278, 4, 1597484336218508869L);
        setLongElement(term2278, 5, -685023850445639859L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("software.pando.crypto.nacl.Field25519");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        argTypes[2] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term2263;
        args[1] = term2272;
        args[2] = term2278;
        callMethod(klass, "sub", argTypes, null, args);
    }

};


