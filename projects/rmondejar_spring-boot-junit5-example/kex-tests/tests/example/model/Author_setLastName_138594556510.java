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

public class Author_setLastName_138594556510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1922;

    public Author_setLastName_138594556510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1923 = new Long(-7456852906235966771L);
        Long term1964 = new Long(-67485388932970712L);
        Long term1974 = new Long(5806367330808555223L);
        Object term1963 = newInstance(Class.forName("example.model.Book"));
        Object term1969 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1973 = newInstance(Class.forName("example.model.Author"));
        setField(term1963, term1963.getClass(), "id", term1964);
        setField(term1963, term1963.getClass(), "title", "");
        setField(term1963, term1963.getClass(), "description", "");
        setField(term1963, term1963.getClass(), "genre", "");
        setField(term1969, term1969.getClass(), "intVal", null);
        setIntField(term1969, term1969.getClass(), "scale", 53);
        setIntField(term1969, term1969.getClass(), "precision", 0);
        setField(term1969, term1969.getClass(), "stringCache", null);
        setLongField(term1969, term1969.getClass(), "intCompact", -9223372036854775808L);
        setField(term1963, term1963.getClass(), "price", term1969);
        setField(term1973, term1973.getClass(), "id", term1974);
        setField(term1973, term1973.getClass(), "firstName", null);
        setField(term1973, term1973.getClass(), "lastName", null);
        setField(term1973, term1973.getClass(), "email", null);
        setField(term1973, term1973.getClass(), "books", null);
        setField(term1963, term1963.getClass(), "author", term1973);
        Long term1977 = new Long(-4714000263923324167L);
        Long term1987 = new Long(6906379511067694917L);
        Object term1976 = newInstance(Class.forName("example.model.Book"));
        Object term1982 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1986 = newInstance(Class.forName("example.model.Author"));
        setField(term1976, term1976.getClass(), "id", term1977);
        setField(term1976, term1976.getClass(), "title", "");
        setField(term1976, term1976.getClass(), "description", "");
        setField(term1976, term1976.getClass(), "genre", "");
        setField(term1982, term1982.getClass(), "intVal", null);
        setIntField(term1982, term1982.getClass(), "scale", 53);
        setIntField(term1982, term1982.getClass(), "precision", 0);
        setField(term1982, term1982.getClass(), "stringCache", null);
        setLongField(term1982, term1982.getClass(), "intCompact", -9223372036854775808L);
        setField(term1976, term1976.getClass(), "price", term1982);
        setField(term1986, term1986.getClass(), "id", term1987);
        setField(term1986, term1986.getClass(), "firstName", null);
        setField(term1986, term1986.getClass(), "lastName", null);
        setField(term1986, term1986.getClass(), "email", null);
        setField(term1986, term1986.getClass(), "books", null);
        setField(term1976, term1976.getClass(), "author", term1986);
        Long term1990 = new Long(8000844860910174690L);
        Object term1989 = newInstance(Class.forName("example.model.Book"));
        Object term1995 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1999 = newInstance(Class.forName("example.model.Author"));
        setField(term1989, term1989.getClass(), "id", term1990);
        setField(term1989, term1989.getClass(), "title", "");
        setField(term1989, term1989.getClass(), "description", "");
        setField(term1989, term1989.getClass(), "genre", "");
        setField(term1995, term1995.getClass(), "intVal", null);
        setIntField(term1995, term1995.getClass(), "scale", 50);
        setIntField(term1995, term1995.getClass(), "precision", 0);
        setField(term1995, term1995.getClass(), "stringCache", null);
        setLongField(term1995, term1995.getClass(), "intCompact", -9223372036854775808L);
        setField(term1989, term1989.getClass(), "price", term1995);
        setField(term1999, term1999.getClass(), "id", null);
        setField(term1999, term1999.getClass(), "firstName", null);
        setField(term1999, term1999.getClass(), "lastName", null);
        setField(term1999, term1999.getClass(), "email", null);
        setField(term1999, term1999.getClass(), "books", null);
        setField(term1989, term1989.getClass(), "author", term1999);
        Long term2001 = new Long(8708846223293804408L);
        Object term2000 = newInstance(Class.forName("example.model.Book"));
        Object term2006 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2010 = newInstance(Class.forName("example.model.Author"));
        setField(term2000, term2000.getClass(), "id", term2001);
        setField(term2000, term2000.getClass(), "title", "");
        setField(term2000, term2000.getClass(), "description", "");
        setField(term2000, term2000.getClass(), "genre", "");
        setField(term2006, term2006.getClass(), "intVal", null);
        setIntField(term2006, term2006.getClass(), "scale", 51);
        setIntField(term2006, term2006.getClass(), "precision", 0);
        setField(term2006, term2006.getClass(), "stringCache", null);
        setLongField(term2006, term2006.getClass(), "intCompact", -9223372036854775808L);
        setField(term2000, term2000.getClass(), "price", term2006);
        setField(term2010, term2010.getClass(), "id", null);
        setField(term2010, term2010.getClass(), "firstName", null);
        setField(term2010, term2010.getClass(), "lastName", null);
        setField(term2010, term2010.getClass(), "email", null);
        setField(term2010, term2010.getClass(), "books", null);
        setField(term2000, term2000.getClass(), "author", term2010);
        ArrayList term1961 = new ArrayList();
        ((ArrayList) term1961).add(term1963);
        ((ArrayList) term1961).add(term1976);
        ((ArrayList) term1961).add(term1989);
        ((ArrayList) term1961).add(term2000);
        term1922 = newInstance(Class.forName("example.model.Author"));
        setField(term1922, term1922.getClass(), "id", term1923);
        setField(term1922, term1922.getClass(), "firstName", "PSOttyUeqv");
        setField(term1922, term1922.getClass(), "lastName", "HmEvTlmzXo");
        setField(term1922, term1922.getClass(), "email", "BMMonTIZgJ");
        setField(term1922, term1922.getClass(), "books", term1961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OFTJwdPiTG";
        callMethod(klass, "setLastName", argTypes, term1922, args);
    }

};


