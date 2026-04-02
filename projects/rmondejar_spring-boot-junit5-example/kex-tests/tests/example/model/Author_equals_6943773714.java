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
import java.util.ArrayList;
import java.lang.Object;

public class Author_equals_6943773714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2465;
     Object term2567;

    public Author_equals_6943773714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2466 = new Long(4689907154423223972L);
        Long term2507 = new Long(8512025621149521819L);
        Long term2517 = new Long(2022482096970820459L);
        Object term2506 = newInstance(Class.forName("example.model.Book"));
        Object term2512 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2516 = newInstance(Class.forName("example.model.Author"));
        setField(term2506, term2506.getClass(), "id", term2507);
        setField(term2506, term2506.getClass(), "title", "");
        setField(term2506, term2506.getClass(), "description", "");
        setField(term2506, term2506.getClass(), "genre", "");
        setField(term2512, term2512.getClass(), "intVal", null);
        setIntField(term2512, term2512.getClass(), "scale", 51);
        setIntField(term2512, term2512.getClass(), "precision", 0);
        setField(term2512, term2512.getClass(), "stringCache", null);
        setLongField(term2512, term2512.getClass(), "intCompact", -9223372036854775808L);
        setField(term2506, term2506.getClass(), "price", term2512);
        setField(term2516, term2516.getClass(), "id", term2517);
        setField(term2516, term2516.getClass(), "firstName", null);
        setField(term2516, term2516.getClass(), "lastName", null);
        setField(term2516, term2516.getClass(), "email", null);
        setField(term2516, term2516.getClass(), "books", null);
        setField(term2506, term2506.getClass(), "author", term2516);
        Long term2520 = new Long(-6521561238735301071L);
        Object term2519 = newInstance(Class.forName("example.model.Book"));
        Object term2525 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2529 = newInstance(Class.forName("example.model.Author"));
        setField(term2519, term2519.getClass(), "id", term2520);
        setField(term2519, term2519.getClass(), "title", "");
        setField(term2519, term2519.getClass(), "description", "");
        setField(term2519, term2519.getClass(), "genre", "");
        setField(term2525, term2525.getClass(), "intVal", null);
        setIntField(term2525, term2525.getClass(), "scale", 52);
        setIntField(term2525, term2525.getClass(), "precision", 0);
        setField(term2525, term2525.getClass(), "stringCache", null);
        setLongField(term2525, term2525.getClass(), "intCompact", -9223372036854775808L);
        setField(term2519, term2519.getClass(), "price", term2525);
        setField(term2529, term2529.getClass(), "id", null);
        setField(term2529, term2529.getClass(), "firstName", null);
        setField(term2529, term2529.getClass(), "lastName", null);
        setField(term2529, term2529.getClass(), "email", null);
        setField(term2529, term2529.getClass(), "books", null);
        setField(term2519, term2519.getClass(), "author", term2529);
        Long term2531 = new Long(-8890284990655172580L);
        Object term2530 = newInstance(Class.forName("example.model.Book"));
        Object term2536 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2540 = newInstance(Class.forName("example.model.Author"));
        setField(term2530, term2530.getClass(), "id", term2531);
        setField(term2530, term2530.getClass(), "title", "");
        setField(term2530, term2530.getClass(), "description", "");
        setField(term2530, term2530.getClass(), "genre", "");
        setField(term2536, term2536.getClass(), "intVal", null);
        setIntField(term2536, term2536.getClass(), "scale", 53);
        setIntField(term2536, term2536.getClass(), "precision", 0);
        setField(term2536, term2536.getClass(), "stringCache", null);
        setLongField(term2536, term2536.getClass(), "intCompact", -9223372036854775808L);
        setField(term2530, term2530.getClass(), "price", term2536);
        setField(term2540, term2540.getClass(), "id", null);
        setField(term2540, term2540.getClass(), "firstName", null);
        setField(term2540, term2540.getClass(), "lastName", null);
        setField(term2540, term2540.getClass(), "email", null);
        setField(term2540, term2540.getClass(), "books", null);
        setField(term2530, term2530.getClass(), "author", term2540);
        Long term2542 = new Long(768144790810175653L);
        Object term2541 = newInstance(Class.forName("example.model.Book"));
        Object term2547 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2551 = newInstance(Class.forName("example.model.Author"));
        setField(term2541, term2541.getClass(), "id", term2542);
        setField(term2541, term2541.getClass(), "title", "");
        setField(term2541, term2541.getClass(), "description", "");
        setField(term2541, term2541.getClass(), "genre", "");
        setField(term2547, term2547.getClass(), "intVal", null);
        setIntField(term2547, term2547.getClass(), "scale", 53);
        setIntField(term2547, term2547.getClass(), "precision", 0);
        setField(term2547, term2547.getClass(), "stringCache", null);
        setLongField(term2547, term2547.getClass(), "intCompact", -9223372036854775808L);
        setField(term2541, term2541.getClass(), "price", term2547);
        setField(term2551, term2551.getClass(), "id", null);
        setField(term2551, term2551.getClass(), "firstName", null);
        setField(term2551, term2551.getClass(), "lastName", null);
        setField(term2551, term2551.getClass(), "email", null);
        setField(term2551, term2551.getClass(), "books", null);
        setField(term2541, term2541.getClass(), "author", term2551);
        Long term2553 = new Long(-3718250311794019732L);
        Long term2563 = new Long(-5935517391653614345L);
        Object term2552 = newInstance(Class.forName("example.model.Book"));
        Object term2558 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2562 = newInstance(Class.forName("example.model.Author"));
        setField(term2552, term2552.getClass(), "id", term2553);
        setField(term2552, term2552.getClass(), "title", "");
        setField(term2552, term2552.getClass(), "description", "");
        setField(term2552, term2552.getClass(), "genre", "");
        setField(term2558, term2558.getClass(), "intVal", null);
        setIntField(term2558, term2558.getClass(), "scale", 52);
        setIntField(term2558, term2558.getClass(), "precision", 0);
        setField(term2558, term2558.getClass(), "stringCache", null);
        setLongField(term2558, term2558.getClass(), "intCompact", -9223372036854775808L);
        setField(term2552, term2552.getClass(), "price", term2558);
        setField(term2562, term2562.getClass(), "id", term2563);
        setField(term2562, term2562.getClass(), "firstName", null);
        setField(term2562, term2562.getClass(), "lastName", null);
        setField(term2562, term2562.getClass(), "email", null);
        setField(term2562, term2562.getClass(), "books", null);
        setField(term2552, term2552.getClass(), "author", term2562);
        ArrayList term2504 = new ArrayList();
        ((ArrayList) term2504).add(term2506);
        ((ArrayList) term2504).add(term2519);
        ((ArrayList) term2504).add(term2530);
        ((ArrayList) term2504).add(term2541);
        ((ArrayList) term2504).add(term2541);
        ((ArrayList) term2504).add(term2552);
        term2465 = newInstance(Class.forName("example.model.Author"));
        setField(term2465, term2465.getClass(), "id", term2466);
        setField(term2465, term2465.getClass(), "firstName", "GISHLsgALf");
        setField(term2465, term2465.getClass(), "lastName", "PVykkUSgBq");
        setField(term2465, term2465.getClass(), "email", "tnKbZaCsuj");
        setField(term2465, term2465.getClass(), "books", term2504);
        term2567 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2567;
        callMethod(klass, "equals", argTypes, term2465, args);
    }

};


