package example.model;

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
import static example.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Book_setPrice_134214253113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6380;
     Object term6493;

    public Book_setPrice_134214253113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6381 = new Long(7875739215674729968L);
        Long term6437 = new Long(-8605430501912680279L);
        Long term6478 = new Long(2985226914509512766L);
        Object term6477 = newInstance(Class.forName("example.model.Book"));
        setField(term6477, term6477.getClass(), "id", term6478);
        setField(term6477, term6477.getClass(), "title", null);
        setField(term6477, term6477.getClass(), "description", null);
        setField(term6477, term6477.getClass(), "genre", null);
        setField(term6477, term6477.getClass(), "price", null);
        setField(term6477, term6477.getClass(), "author", null);
        Long term6481 = new Long(7199459243454109261L);
        Object term6480 = newInstance(Class.forName("example.model.Book"));
        setField(term6480, term6480.getClass(), "id", term6481);
        setField(term6480, term6480.getClass(), "title", null);
        setField(term6480, term6480.getClass(), "description", null);
        setField(term6480, term6480.getClass(), "genre", null);
        setField(term6480, term6480.getClass(), "price", null);
        setField(term6480, term6480.getClass(), "author", null);
        Long term6484 = new Long(-823085399570394644L);
        Object term6483 = newInstance(Class.forName("example.model.Book"));
        setField(term6483, term6483.getClass(), "id", term6484);
        setField(term6483, term6483.getClass(), "title", null);
        setField(term6483, term6483.getClass(), "description", null);
        setField(term6483, term6483.getClass(), "genre", null);
        setField(term6483, term6483.getClass(), "price", null);
        setField(term6483, term6483.getClass(), "author", null);
        Object term6486 = newInstance(Class.forName("example.model.Book"));
        setField(term6486, term6486.getClass(), "id", null);
        setField(term6486, term6486.getClass(), "title", null);
        setField(term6486, term6486.getClass(), "description", null);
        setField(term6486, term6486.getClass(), "genre", null);
        setField(term6486, term6486.getClass(), "price", null);
        setField(term6486, term6486.getClass(), "author", null);
        Object term6487 = newInstance(Class.forName("example.model.Book"));
        setField(term6487, term6487.getClass(), "id", null);
        setField(term6487, term6487.getClass(), "title", null);
        setField(term6487, term6487.getClass(), "description", null);
        setField(term6487, term6487.getClass(), "genre", null);
        setField(term6487, term6487.getClass(), "price", null);
        setField(term6487, term6487.getClass(), "author", null);
        Long term6489 = new Long(-5044181804110715069L);
        Object term6488 = newInstance(Class.forName("example.model.Book"));
        setField(term6488, term6488.getClass(), "id", term6489);
        setField(term6488, term6488.getClass(), "title", null);
        setField(term6488, term6488.getClass(), "description", null);
        setField(term6488, term6488.getClass(), "genre", null);
        setField(term6488, term6488.getClass(), "price", null);
        setField(term6488, term6488.getClass(), "author", null);
        ArrayList term6475 = new ArrayList();
        ((ArrayList) term6475).add(term6477);
        ((ArrayList) term6475).add(term6480);
        ((ArrayList) term6475).add(term6480);
        ((ArrayList) term6475).add(term6483);
        ((ArrayList) term6475).add(term6486);
        ((ArrayList) term6475).add(term6487);
        ((ArrayList) term6475).add(term6487);
        ((ArrayList) term6475).add(term6488);
        ((ArrayList) term6475).add(term6483);
        term6380 = newInstance(Class.forName("example.model.Book"));
        Object term6419 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6420 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6422 = (int[]) newIntArray(6);
        Object term6436 = newInstance(Class.forName("example.model.Author"));
        setField(term6380, term6380.getClass(), "id", term6381);
        setField(term6380, term6380.getClass(), "title", "fNzFTiRCjp");
        setField(term6380, term6380.getClass(), "description", "yaCGGogKro");
        setField(term6380, term6380.getClass(), "genre", "qxrRUnjshF");
        setIntField(term6420, term6420.getClass(), "signum", 1);
        setIntElement(term6422, 0, 11450);
        setIntElement(term6422, 1, 967918011);
        setIntElement(term6422, 2, -1402718260);
        setIntElement(term6422, 3, 501436555);
        setIntElement(term6422, 4, 1546287126);
        setIntElement(term6422, 5, 58013637);
        setField(term6420, term6420.getClass(), "mag", term6422);
        setIntField(term6420, term6420.getClass(), "bitCountPlusOne", 0);
        setIntField(term6420, term6420.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6420, term6420.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6420, term6420.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6419, term6419.getClass(), "intVal", term6420);
        setIntField(term6419, term6419.getClass(), "scale", 53);
        setIntField(term6419, term6419.getClass(), "precision", 0);
        setField(term6419, term6419.getClass(), "stringCache", null);
        setLongField(term6419, term6419.getClass(), "intCompact", -9223372036854775808L);
        setField(term6380, term6380.getClass(), "price", term6419);
        setField(term6436, term6436.getClass(), "id", term6437);
        setField(term6436, term6436.getClass(), "firstName", "WmVcapKAeJ");
        setField(term6436, term6436.getClass(), "lastName", "jevOVdQdpc");
        setField(term6436, term6436.getClass(), "email", "TLLVSGTNsz");
        setField(term6436, term6436.getClass(), "books", term6475);
        setField(term6380, term6380.getClass(), "author", term6436);
        term6493 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6494 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6496 = (int[]) newIntArray(6);
        setIntField(term6494, term6494.getClass(), "signum", 1);
        setIntElement(term6496, 0, 1737);
        setIntElement(term6496, 1, -1219625213);
        setIntElement(term6496, 2, 1893728314);
        setIntElement(term6496, 3, -1023813699);
        setIntElement(term6496, 4, -1164251519);
        setIntElement(term6496, 5, 1496120717);
        setField(term6494, term6494.getClass(), "mag", term6496);
        setIntField(term6494, term6494.getClass(), "bitCountPlusOne", 0);
        setIntField(term6494, term6494.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6494, term6494.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6494, term6494.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6493, term6493.getClass(), "intVal", term6494);
        setIntField(term6493, term6493.getClass(), "scale", 53);
        setIntField(term6493, term6493.getClass(), "precision", 0);
        setField(term6493, term6493.getClass(), "stringCache", null);
        setLongField(term6493, term6493.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term6493;
        callMethod(klass, "setPrice", argTypes, term6380, args);
    }

};


