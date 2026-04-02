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

public class Book_BookBuilder_genre_1592877134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3388;

    public Book_BookBuilder_genre_1592877134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3389 = new Long(1353683663053784647L);
        Long term3445 = new Long(-1465819833800717311L);
        Long term3486 = new Long(-8306611953768020559L);
        Object term3485 = newInstance(Class.forName("example.model.Book"));
        setField(term3485, term3485.getClass(), "id", term3486);
        setField(term3485, term3485.getClass(), "title", null);
        setField(term3485, term3485.getClass(), "description", null);
        setField(term3485, term3485.getClass(), "genre", null);
        setField(term3485, term3485.getClass(), "price", null);
        setField(term3485, term3485.getClass(), "author", null);
        Object term3488 = newInstance(Class.forName("example.model.Book"));
        setField(term3488, term3488.getClass(), "id", null);
        setField(term3488, term3488.getClass(), "title", null);
        setField(term3488, term3488.getClass(), "description", null);
        setField(term3488, term3488.getClass(), "genre", null);
        setField(term3488, term3488.getClass(), "price", null);
        setField(term3488, term3488.getClass(), "author", null);
        Long term3490 = new Long(8073378116544724166L);
        Object term3489 = newInstance(Class.forName("example.model.Book"));
        setField(term3489, term3489.getClass(), "id", term3490);
        setField(term3489, term3489.getClass(), "title", null);
        setField(term3489, term3489.getClass(), "description", null);
        setField(term3489, term3489.getClass(), "genre", null);
        setField(term3489, term3489.getClass(), "price", null);
        setField(term3489, term3489.getClass(), "author", null);
        Object term3492 = newInstance(Class.forName("example.model.Book"));
        setField(term3492, term3492.getClass(), "id", null);
        setField(term3492, term3492.getClass(), "title", null);
        setField(term3492, term3492.getClass(), "description", null);
        setField(term3492, term3492.getClass(), "genre", null);
        setField(term3492, term3492.getClass(), "price", null);
        setField(term3492, term3492.getClass(), "author", null);
        ArrayList term3483 = new ArrayList();
        ((ArrayList) term3483).add(term3485);
        ((ArrayList) term3483).add(term3488);
        ((ArrayList) term3483).add(term3489);
        ((ArrayList) term3483).add(term3492);
        ((ArrayList) term3483).add(term3492);
        term3388 = newInstance(Class.forName("example.model.Book$BookBuilder"));
        Object term3427 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3428 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3430 = (int[]) newIntArray(6);
        Object term3444 = newInstance(Class.forName("example.model.Author"));
        setField(term3388, term3388.getClass(), "id", term3389);
        setField(term3388, term3388.getClass(), "title", "XeSDJYKMBf");
        setField(term3388, term3388.getClass(), "description", "tIsFcOGTUX");
        setField(term3388, term3388.getClass(), "genre", "XUVRcnELFP");
        setIntField(term3428, term3428.getClass(), "signum", 1);
        setIntElement(term3430, 0, 39866);
        setIntElement(term3430, 1, -1989847847);
        setIntElement(term3430, 2, 1104108541);
        setIntElement(term3430, 3, 123287253);
        setIntElement(term3430, 4, -1687970232);
        setIntElement(term3430, 5, -969823949);
        setField(term3428, term3428.getClass(), "mag", term3430);
        setIntField(term3428, term3428.getClass(), "bitCountPlusOne", 0);
        setIntField(term3428, term3428.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3428, term3428.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3428, term3428.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3427, term3427.getClass(), "intVal", term3428);
        setIntField(term3427, term3427.getClass(), "scale", 53);
        setIntField(term3427, term3427.getClass(), "precision", 0);
        setField(term3427, term3427.getClass(), "stringCache", null);
        setLongField(term3427, term3427.getClass(), "intCompact", -9223372036854775808L);
        setField(term3388, term3388.getClass(), "price", term3427);
        setField(term3444, term3444.getClass(), "id", term3445);
        setField(term3444, term3444.getClass(), "firstName", "xIeSbezmkD");
        setField(term3444, term3444.getClass(), "lastName", "txUWLZRkSv");
        setField(term3444, term3444.getClass(), "email", "gHRMJRsBGm");
        setField(term3444, term3444.getClass(), "books", term3483);
        setField(term3388, term3388.getClass(), "author", term3444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book$BookBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lIgKCvCuoH";
        callMethod(klass, "genre", argTypes, term3388, args);
    }

};


