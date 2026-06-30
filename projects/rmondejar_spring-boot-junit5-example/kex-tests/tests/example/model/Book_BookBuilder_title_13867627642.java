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

public class Book_BookBuilder_title_13867627642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2994;

    public Book_BookBuilder_title_13867627642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2995 = new Long(-3225860270104198596L);
        Long term3051 = new Long(-1164342036939643746L);
        Long term3092 = new Long(-7013378340043571457L);
        Object term3091 = newInstance(Class.forName("example.model.Book"));
        setField(term3091, term3091.getClass(), "id", term3092);
        setField(term3091, term3091.getClass(), "title", null);
        setField(term3091, term3091.getClass(), "description", null);
        setField(term3091, term3091.getClass(), "genre", null);
        setField(term3091, term3091.getClass(), "price", null);
        setField(term3091, term3091.getClass(), "author", null);
        Long term3095 = new Long(-6490254947459640565L);
        Object term3094 = newInstance(Class.forName("example.model.Book"));
        setField(term3094, term3094.getClass(), "id", term3095);
        setField(term3094, term3094.getClass(), "title", null);
        setField(term3094, term3094.getClass(), "description", null);
        setField(term3094, term3094.getClass(), "genre", null);
        setField(term3094, term3094.getClass(), "price", null);
        setField(term3094, term3094.getClass(), "author", null);
        Long term3098 = new Long(8765880103547975810L);
        Object term3097 = newInstance(Class.forName("example.model.Book"));
        setField(term3097, term3097.getClass(), "id", term3098);
        setField(term3097, term3097.getClass(), "title", null);
        setField(term3097, term3097.getClass(), "description", null);
        setField(term3097, term3097.getClass(), "genre", null);
        setField(term3097, term3097.getClass(), "price", null);
        setField(term3097, term3097.getClass(), "author", null);
        Object term3100 = newInstance(Class.forName("example.model.Book"));
        setField(term3100, term3100.getClass(), "id", null);
        setField(term3100, term3100.getClass(), "title", null);
        setField(term3100, term3100.getClass(), "description", null);
        setField(term3100, term3100.getClass(), "genre", null);
        setField(term3100, term3100.getClass(), "price", null);
        setField(term3100, term3100.getClass(), "author", null);
        Object term3101 = newInstance(Class.forName("example.model.Book"));
        setField(term3101, term3101.getClass(), "id", null);
        setField(term3101, term3101.getClass(), "title", null);
        setField(term3101, term3101.getClass(), "description", null);
        setField(term3101, term3101.getClass(), "genre", null);
        setField(term3101, term3101.getClass(), "price", null);
        setField(term3101, term3101.getClass(), "author", null);
        Long term3103 = new Long(3077284143733577490L);
        Object term3102 = newInstance(Class.forName("example.model.Book"));
        setField(term3102, term3102.getClass(), "id", term3103);
        setField(term3102, term3102.getClass(), "title", null);
        setField(term3102, term3102.getClass(), "description", null);
        setField(term3102, term3102.getClass(), "genre", null);
        setField(term3102, term3102.getClass(), "price", null);
        setField(term3102, term3102.getClass(), "author", null);
        ArrayList term3089 = new ArrayList();
        ((ArrayList) term3089).add(term3091);
        ((ArrayList) term3089).add(term3094);
        ((ArrayList) term3089).add(term3097);
        ((ArrayList) term3089).add(term3097);
        ((ArrayList) term3089).add(term3100);
        ((ArrayList) term3089).add(term3101);
        ((ArrayList) term3089).add(term3102);
        term2994 = newInstance(Class.forName("example.model.Book$BookBuilder"));
        Object term3033 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3034 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3036 = (int[]) newIntArray(6);
        Object term3050 = newInstance(Class.forName("example.model.Author"));
        setField(term2994, term2994.getClass(), "id", term2995);
        setField(term2994, term2994.getClass(), "title", "tuYaAqvYrh");
        setField(term2994, term2994.getClass(), "description", "CIbhheukbR");
        setField(term2994, term2994.getClass(), "genre", "VOHPpErtan");
        setIntField(term3034, term3034.getClass(), "signum", 1);
        setIntElement(term3036, 0, 3414);
        setIntElement(term3036, 1, 1913952634);
        setIntElement(term3036, 2, -2146032071);
        setIntElement(term3036, 3, 1452615800);
        setIntElement(term3036, 4, -138847786);
        setIntElement(term3036, 5, -1441353949);
        setField(term3034, term3034.getClass(), "mag", term3036);
        setIntField(term3034, term3034.getClass(), "bitCountPlusOne", 0);
        setIntField(term3034, term3034.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3034, term3034.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3034, term3034.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3033, term3033.getClass(), "intVal", term3034);
        setIntField(term3033, term3033.getClass(), "scale", 52);
        setIntField(term3033, term3033.getClass(), "precision", 0);
        setField(term3033, term3033.getClass(), "stringCache", null);
        setLongField(term3033, term3033.getClass(), "intCompact", -9223372036854775808L);
        setField(term2994, term2994.getClass(), "price", term3033);
        setField(term3050, term3050.getClass(), "id", term3051);
        setField(term3050, term3050.getClass(), "firstName", "GDMUlolTNs");
        setField(term3050, term3050.getClass(), "lastName", "xpLvWisjzN");
        setField(term3050, term3050.getClass(), "email", "IKfozyyKEj");
        setField(term3050, term3050.getClass(), "books", term3089);
        setField(term2994, term2994.getClass(), "author", term3050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book$BookBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IXPaHQnEUy";
        callMethod(klass, "title", argTypes, term2994, args);
    }

};


