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

public class Book_hashCode_36950012218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7398;

    public Book_hashCode_36950012218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7399 = new Long(-7717027128782374599L);
        Long term7455 = new Long(4872921045907555824L);
        Long term7496 = new Long(6921855906793748590L);
        Object term7495 = newInstance(Class.forName("example.model.Book"));
        setField(term7495, term7495.getClass(), "id", term7496);
        setField(term7495, term7495.getClass(), "title", null);
        setField(term7495, term7495.getClass(), "description", null);
        setField(term7495, term7495.getClass(), "genre", null);
        setField(term7495, term7495.getClass(), "price", null);
        setField(term7495, term7495.getClass(), "author", null);
        ArrayList term7493 = new ArrayList();
        ((ArrayList) term7493).add(term7495);
        term7398 = newInstance(Class.forName("example.model.Book"));
        Object term7437 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term7438 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7440 = (int[]) newIntArray(6);
        Object term7454 = newInstance(Class.forName("example.model.Author"));
        setField(term7398, term7398.getClass(), "id", term7399);
        setField(term7398, term7398.getClass(), "title", "schPUnVfDW");
        setField(term7398, term7398.getClass(), "description", "CpdMEgjUka");
        setField(term7398, term7398.getClass(), "genre", "WRisHdgnmm");
        setIntField(term7438, term7438.getClass(), "signum", 1);
        setIntElement(term7440, 0, 16885);
        setIntElement(term7440, 1, -1414733295);
        setIntElement(term7440, 2, 1992912053);
        setIntElement(term7440, 3, 1180703615);
        setIntElement(term7440, 4, -106163018);
        setIntElement(term7440, 5, -96032073);
        setField(term7438, term7438.getClass(), "mag", term7440);
        setIntField(term7438, term7438.getClass(), "bitCountPlusOne", 0);
        setIntField(term7438, term7438.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7438, term7438.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7438, term7438.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7437, term7437.getClass(), "intVal", term7438);
        setIntField(term7437, term7437.getClass(), "scale", 53);
        setIntField(term7437, term7437.getClass(), "precision", 0);
        setField(term7437, term7437.getClass(), "stringCache", null);
        setLongField(term7437, term7437.getClass(), "intCompact", -9223372036854775808L);
        setField(term7398, term7398.getClass(), "price", term7437);
        setField(term7454, term7454.getClass(), "id", term7455);
        setField(term7454, term7454.getClass(), "firstName", "XxZiwWPLOx");
        setField(term7454, term7454.getClass(), "lastName", "nyqsjMHTba");
        setField(term7454, term7454.getClass(), "email", "ylUHzURWyg");
        setField(term7454, term7454.getClass(), "books", term7493);
        setField(term7398, term7398.getClass(), "author", term7454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7398, args);
    }

};


