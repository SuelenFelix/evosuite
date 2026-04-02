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

public class Book_setGenre_212178240312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6186;

    public Book_setGenre_212178240312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6187 = new Long(-1889784286465977825L);
        Long term6243 = new Long(5592522907226111065L);
        Long term6284 = new Long(-2577420466618938650L);
        Object term6283 = newInstance(Class.forName("example.model.Book"));
        setField(term6283, term6283.getClass(), "id", term6284);
        setField(term6283, term6283.getClass(), "title", null);
        setField(term6283, term6283.getClass(), "description", null);
        setField(term6283, term6283.getClass(), "genre", null);
        setField(term6283, term6283.getClass(), "price", null);
        setField(term6283, term6283.getClass(), "author", null);
        Object term6286 = newInstance(Class.forName("example.model.Book"));
        setField(term6286, term6286.getClass(), "id", null);
        setField(term6286, term6286.getClass(), "title", null);
        setField(term6286, term6286.getClass(), "description", null);
        setField(term6286, term6286.getClass(), "genre", null);
        setField(term6286, term6286.getClass(), "price", null);
        setField(term6286, term6286.getClass(), "author", null);
        Long term6288 = new Long(6848008460134431064L);
        Object term6287 = newInstance(Class.forName("example.model.Book"));
        setField(term6287, term6287.getClass(), "id", term6288);
        setField(term6287, term6287.getClass(), "title", null);
        setField(term6287, term6287.getClass(), "description", null);
        setField(term6287, term6287.getClass(), "genre", null);
        setField(term6287, term6287.getClass(), "price", null);
        setField(term6287, term6287.getClass(), "author", null);
        ArrayList term6281 = new ArrayList();
        ((ArrayList) term6281).add(term6283);
        ((ArrayList) term6281).add(term6286);
        ((ArrayList) term6281).add(term6287);
        term6186 = newInstance(Class.forName("example.model.Book"));
        Object term6225 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6226 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6228 = (int[]) newIntArray(6);
        Object term6242 = newInstance(Class.forName("example.model.Author"));
        setField(term6186, term6186.getClass(), "id", term6187);
        setField(term6186, term6186.getClass(), "title", "JqSCTBGSUs");
        setField(term6186, term6186.getClass(), "description", "bZrrPiMnsr");
        setField(term6186, term6186.getClass(), "genre", "IeromvfDmz");
        setIntField(term6226, term6226.getClass(), "signum", 1);
        setIntElement(term6228, 0, 43906);
        setIntElement(term6228, 1, 478743389);
        setIntElement(term6228, 2, -935973745);
        setIntElement(term6228, 3, -988033990);
        setIntElement(term6228, 4, -884211866);
        setIntElement(term6228, 5, -380861973);
        setField(term6226, term6226.getClass(), "mag", term6228);
        setIntField(term6226, term6226.getClass(), "bitCountPlusOne", 0);
        setIntField(term6226, term6226.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6226, term6226.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6226, term6226.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6225, term6225.getClass(), "intVal", term6226);
        setIntField(term6225, term6225.getClass(), "scale", 53);
        setIntField(term6225, term6225.getClass(), "precision", 0);
        setField(term6225, term6225.getClass(), "stringCache", null);
        setLongField(term6225, term6225.getClass(), "intCompact", -9223372036854775808L);
        setField(term6186, term6186.getClass(), "price", term6225);
        setField(term6242, term6242.getClass(), "id", term6243);
        setField(term6242, term6242.getClass(), "firstName", "xJLHPTRSqe");
        setField(term6242, term6242.getClass(), "lastName", "OIFZYdbUZz");
        setField(term6242, term6242.getClass(), "email", "FPablxseTr");
        setField(term6242, term6242.getClass(), "books", term6281);
        setField(term6186, term6186.getClass(), "author", term6242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IXQQwaXITf";
        callMethod(klass, "setGenre", argTypes, term6186, args);
    }

};


