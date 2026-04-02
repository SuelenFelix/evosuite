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

public class Book_BookBuilder_id_20803619641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2821;
     Object term2926;

    public Book_BookBuilder_id_20803619641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2822 = new Long(4742108233936970770L);
        Long term2878 = new Long(2722004046017350471L);
        Long term2919 = new Long(6636235983121346803L);
        Object term2918 = newInstance(Class.forName("example.model.Book"));
        setField(term2918, term2918.getClass(), "id", term2919);
        setField(term2918, term2918.getClass(), "title", null);
        setField(term2918, term2918.getClass(), "description", null);
        setField(term2918, term2918.getClass(), "genre", null);
        setField(term2918, term2918.getClass(), "price", null);
        setField(term2918, term2918.getClass(), "author", null);
        Object term2921 = newInstance(Class.forName("example.model.Book"));
        setField(term2921, term2921.getClass(), "id", null);
        setField(term2921, term2921.getClass(), "title", null);
        setField(term2921, term2921.getClass(), "description", null);
        setField(term2921, term2921.getClass(), "genre", null);
        setField(term2921, term2921.getClass(), "price", null);
        setField(term2921, term2921.getClass(), "author", null);
        Object term2922 = newInstance(Class.forName("example.model.Book"));
        setField(term2922, term2922.getClass(), "id", null);
        setField(term2922, term2922.getClass(), "title", null);
        setField(term2922, term2922.getClass(), "description", null);
        setField(term2922, term2922.getClass(), "genre", null);
        setField(term2922, term2922.getClass(), "price", null);
        setField(term2922, term2922.getClass(), "author", null);
        Object term2923 = newInstance(Class.forName("example.model.Book"));
        setField(term2923, term2923.getClass(), "id", null);
        setField(term2923, term2923.getClass(), "title", null);
        setField(term2923, term2923.getClass(), "description", null);
        setField(term2923, term2923.getClass(), "genre", null);
        setField(term2923, term2923.getClass(), "price", null);
        setField(term2923, term2923.getClass(), "author", null);
        ArrayList term2916 = new ArrayList();
        ((ArrayList) term2916).add(term2918);
        ((ArrayList) term2916).add(term2921);
        ((ArrayList) term2916).add(term2922);
        ((ArrayList) term2916).add(term2923);
        term2821 = newInstance(Class.forName("example.model.Book$BookBuilder"));
        Object term2860 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2861 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2863 = (int[]) newIntArray(6);
        Object term2877 = newInstance(Class.forName("example.model.Author"));
        setField(term2821, term2821.getClass(), "id", term2822);
        setField(term2821, term2821.getClass(), "title", "YcgHACNgyo");
        setField(term2821, term2821.getClass(), "description", "MrUPJzBTEn");
        setField(term2821, term2821.getClass(), "genre", "IaSymdfFGa");
        setIntField(term2861, term2861.getClass(), "signum", 1);
        setIntElement(term2863, 0, 2215);
        setIntElement(term2863, 1, -1270781433);
        setIntElement(term2863, 2, 524945021);
        setIntElement(term2863, 3, 1102440339);
        setIntElement(term2863, 4, 1502907533);
        setIntElement(term2863, 5, 743577859);
        setField(term2861, term2861.getClass(), "mag", term2863);
        setIntField(term2861, term2861.getClass(), "bitCountPlusOne", 0);
        setIntField(term2861, term2861.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2861, term2861.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2861, term2861.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2860, term2860.getClass(), "intVal", term2861);
        setIntField(term2860, term2860.getClass(), "scale", 52);
        setIntField(term2860, term2860.getClass(), "precision", 0);
        setField(term2860, term2860.getClass(), "stringCache", null);
        setLongField(term2860, term2860.getClass(), "intCompact", -9223372036854775808L);
        setField(term2821, term2821.getClass(), "price", term2860);
        setField(term2877, term2877.getClass(), "id", term2878);
        setField(term2877, term2877.getClass(), "firstName", "FxSvJCIpul");
        setField(term2877, term2877.getClass(), "lastName", "HCjKwpexJj");
        setField(term2877, term2877.getClass(), "email", "sCpIHVPdfl");
        setField(term2877, term2877.getClass(), "books", term2916);
        setField(term2821, term2821.getClass(), "author", term2877);
        term2926 = new Long(4525924047960478347L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book$BookBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2926;
        callMethod(klass, "id", argTypes, term2821, args);
    }

};


