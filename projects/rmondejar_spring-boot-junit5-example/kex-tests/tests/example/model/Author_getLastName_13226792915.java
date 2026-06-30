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

public class Author_getLastName_13226792915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1310;

    public Author_getLastName_13226792915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1311 = new Long(4795660804170399986L);
        Long term1352 = new Long(-4030863184426321096L);
        Long term1362 = new Long(-8010214112439224349L);
        Object term1351 = newInstance(Class.forName("example.model.Book"));
        Object term1357 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1361 = newInstance(Class.forName("example.model.Author"));
        setField(term1351, term1351.getClass(), "id", term1352);
        setField(term1351, term1351.getClass(), "title", "");
        setField(term1351, term1351.getClass(), "description", "");
        setField(term1351, term1351.getClass(), "genre", "");
        setField(term1357, term1357.getClass(), "intVal", null);
        setIntField(term1357, term1357.getClass(), "scale", 52);
        setIntField(term1357, term1357.getClass(), "precision", 0);
        setField(term1357, term1357.getClass(), "stringCache", null);
        setLongField(term1357, term1357.getClass(), "intCompact", -9223372036854775808L);
        setField(term1351, term1351.getClass(), "price", term1357);
        setField(term1361, term1361.getClass(), "id", term1362);
        setField(term1361, term1361.getClass(), "firstName", null);
        setField(term1361, term1361.getClass(), "lastName", null);
        setField(term1361, term1361.getClass(), "email", null);
        setField(term1361, term1361.getClass(), "books", null);
        setField(term1351, term1351.getClass(), "author", term1361);
        Long term1365 = new Long(4394651392080968777L);
        Object term1364 = newInstance(Class.forName("example.model.Book"));
        Object term1370 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1374 = newInstance(Class.forName("example.model.Author"));
        setField(term1364, term1364.getClass(), "id", term1365);
        setField(term1364, term1364.getClass(), "title", "");
        setField(term1364, term1364.getClass(), "description", "");
        setField(term1364, term1364.getClass(), "genre", "");
        setField(term1370, term1370.getClass(), "intVal", null);
        setIntField(term1370, term1370.getClass(), "scale", 53);
        setIntField(term1370, term1370.getClass(), "precision", 0);
        setField(term1370, term1370.getClass(), "stringCache", null);
        setLongField(term1370, term1370.getClass(), "intCompact", -9223372036854775808L);
        setField(term1364, term1364.getClass(), "price", term1370);
        setField(term1374, term1374.getClass(), "id", null);
        setField(term1374, term1374.getClass(), "firstName", null);
        setField(term1374, term1374.getClass(), "lastName", null);
        setField(term1374, term1374.getClass(), "email", null);
        setField(term1374, term1374.getClass(), "books", null);
        setField(term1364, term1364.getClass(), "author", term1374);
        Long term1376 = new Long(-1000830646340880796L);
        Object term1375 = newInstance(Class.forName("example.model.Book"));
        Object term1381 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1385 = newInstance(Class.forName("example.model.Author"));
        setField(term1375, term1375.getClass(), "id", term1376);
        setField(term1375, term1375.getClass(), "title", "");
        setField(term1375, term1375.getClass(), "description", "");
        setField(term1375, term1375.getClass(), "genre", "");
        setField(term1381, term1381.getClass(), "intVal", null);
        setIntField(term1381, term1381.getClass(), "scale", 51);
        setIntField(term1381, term1381.getClass(), "precision", 0);
        setField(term1381, term1381.getClass(), "stringCache", null);
        setLongField(term1381, term1381.getClass(), "intCompact", -9223372036854775808L);
        setField(term1375, term1375.getClass(), "price", term1381);
        setField(term1385, term1385.getClass(), "id", null);
        setField(term1385, term1385.getClass(), "firstName", null);
        setField(term1385, term1385.getClass(), "lastName", null);
        setField(term1385, term1385.getClass(), "email", null);
        setField(term1385, term1385.getClass(), "books", null);
        setField(term1375, term1375.getClass(), "author", term1385);
        Long term1387 = new Long(8863790908271299748L);
        Object term1386 = newInstance(Class.forName("example.model.Book"));
        Object term1392 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1396 = newInstance(Class.forName("example.model.Author"));
        setField(term1386, term1386.getClass(), "id", term1387);
        setField(term1386, term1386.getClass(), "title", "");
        setField(term1386, term1386.getClass(), "description", "");
        setField(term1386, term1386.getClass(), "genre", "");
        setField(term1392, term1392.getClass(), "intVal", null);
        setIntField(term1392, term1392.getClass(), "scale", 52);
        setIntField(term1392, term1392.getClass(), "precision", 0);
        setField(term1392, term1392.getClass(), "stringCache", null);
        setLongField(term1392, term1392.getClass(), "intCompact", -9223372036854775808L);
        setField(term1386, term1386.getClass(), "price", term1392);
        setField(term1396, term1396.getClass(), "id", null);
        setField(term1396, term1396.getClass(), "firstName", null);
        setField(term1396, term1396.getClass(), "lastName", null);
        setField(term1396, term1396.getClass(), "email", null);
        setField(term1396, term1396.getClass(), "books", null);
        setField(term1386, term1386.getClass(), "author", term1396);
        Long term1398 = new Long(5973526439563541711L);
        Object term1397 = newInstance(Class.forName("example.model.Book"));
        Object term1403 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1407 = newInstance(Class.forName("example.model.Author"));
        setField(term1397, term1397.getClass(), "id", term1398);
        setField(term1397, term1397.getClass(), "title", "");
        setField(term1397, term1397.getClass(), "description", "");
        setField(term1397, term1397.getClass(), "genre", "");
        setField(term1403, term1403.getClass(), "intVal", null);
        setIntField(term1403, term1403.getClass(), "scale", 53);
        setIntField(term1403, term1403.getClass(), "precision", 0);
        setField(term1403, term1403.getClass(), "stringCache", null);
        setLongField(term1403, term1403.getClass(), "intCompact", -9223372036854775808L);
        setField(term1397, term1397.getClass(), "price", term1403);
        setField(term1407, term1407.getClass(), "id", null);
        setField(term1407, term1407.getClass(), "firstName", null);
        setField(term1407, term1407.getClass(), "lastName", null);
        setField(term1407, term1407.getClass(), "email", null);
        setField(term1407, term1407.getClass(), "books", null);
        setField(term1397, term1397.getClass(), "author", term1407);
        Long term1409 = new Long(6698455537431331246L);
        Long term1419 = new Long(-8327432141027603933L);
        Object term1408 = newInstance(Class.forName("example.model.Book"));
        Object term1414 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1418 = newInstance(Class.forName("example.model.Author"));
        setField(term1408, term1408.getClass(), "id", term1409);
        setField(term1408, term1408.getClass(), "title", "");
        setField(term1408, term1408.getClass(), "description", "");
        setField(term1408, term1408.getClass(), "genre", "");
        setField(term1414, term1414.getClass(), "intVal", null);
        setIntField(term1414, term1414.getClass(), "scale", 53);
        setIntField(term1414, term1414.getClass(), "precision", 0);
        setField(term1414, term1414.getClass(), "stringCache", null);
        setLongField(term1414, term1414.getClass(), "intCompact", -9223372036854775808L);
        setField(term1408, term1408.getClass(), "price", term1414);
        setField(term1418, term1418.getClass(), "id", term1419);
        setField(term1418, term1418.getClass(), "firstName", null);
        setField(term1418, term1418.getClass(), "lastName", null);
        setField(term1418, term1418.getClass(), "email", null);
        setField(term1418, term1418.getClass(), "books", null);
        setField(term1408, term1408.getClass(), "author", term1418);
        ArrayList term1349 = new ArrayList();
        ((ArrayList) term1349).add(term1351);
        ((ArrayList) term1349).add(term1364);
        ((ArrayList) term1349).add(term1375);
        ((ArrayList) term1349).add(term1386);
        ((ArrayList) term1349).add(term1364);
        ((ArrayList) term1349).add(term1397);
        ((ArrayList) term1349).add(term1408);
        term1310 = newInstance(Class.forName("example.model.Author"));
        setField(term1310, term1310.getClass(), "id", term1311);
        setField(term1310, term1310.getClass(), "firstName", "tOszriqETr");
        setField(term1310, term1310.getClass(), "lastName", "ncSPTkhKjO");
        setField(term1310, term1310.getClass(), "email", "jcWKHRWhyj");
        setField(term1310, term1310.getClass(), "books", term1349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term1310, args);
    }

};


