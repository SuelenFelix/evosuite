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

public class Author_AuthorBuilder_build_6637506576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term699;

    public Author_AuthorBuilder_build_6637506576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term700 = new Long(-1983291584002806658L);
        Long term741 = new Long(5946780097489996391L);
        Long term751 = new Long(-8652538484981166496L);
        Object term740 = newInstance(Class.forName("example.model.Book"));
        Object term746 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term750 = newInstance(Class.forName("example.model.Author"));
        setField(term740, term740.getClass(), "id", term741);
        setField(term740, term740.getClass(), "title", "");
        setField(term740, term740.getClass(), "description", "");
        setField(term740, term740.getClass(), "genre", "");
        setField(term746, term746.getClass(), "intVal", null);
        setIntField(term746, term746.getClass(), "scale", 53);
        setIntField(term746, term746.getClass(), "precision", 0);
        setField(term746, term746.getClass(), "stringCache", null);
        setLongField(term746, term746.getClass(), "intCompact", -9223372036854775808L);
        setField(term740, term740.getClass(), "price", term746);
        setField(term750, term750.getClass(), "id", term751);
        setField(term750, term750.getClass(), "firstName", null);
        setField(term750, term750.getClass(), "lastName", null);
        setField(term750, term750.getClass(), "email", null);
        setField(term750, term750.getClass(), "books", null);
        setField(term740, term740.getClass(), "author", term750);
        ArrayList term738 = new ArrayList();
        ((ArrayList) term738).add(term740);
        term699 = newInstance(Class.forName("example.model.Author$AuthorBuilder"));
        setField(term699, term699.getClass(), "id", term700);
        setField(term699, term699.getClass(), "firstName", "WVRMUmrljA");
        setField(term699, term699.getClass(), "lastName", "NTlKJDDWlk");
        setField(term699, term699.getClass(), "email", "vOuMEpOQAg");
        setField(term699, term699.getClass(), "books", term738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author$AuthorBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term699, args);
    }

};


