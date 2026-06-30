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

public class Book_BookBuilder_build_7375645757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4065;

    public Book_BookBuilder_build_7375645757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4066 = new Long(-1528017371096319990L);
        Long term4122 = new Long(-1526328443223793465L);
        Long term4163 = new Long(-412186147449928821L);
        Object term4162 = newInstance(Class.forName("example.model.Book"));
        setField(term4162, term4162.getClass(), "id", term4163);
        setField(term4162, term4162.getClass(), "title", null);
        setField(term4162, term4162.getClass(), "description", null);
        setField(term4162, term4162.getClass(), "genre", null);
        setField(term4162, term4162.getClass(), "price", null);
        setField(term4162, term4162.getClass(), "author", null);
        Long term4166 = new Long(3453457027014743006L);
        Object term4165 = newInstance(Class.forName("example.model.Book"));
        setField(term4165, term4165.getClass(), "id", term4166);
        setField(term4165, term4165.getClass(), "title", null);
        setField(term4165, term4165.getClass(), "description", null);
        setField(term4165, term4165.getClass(), "genre", null);
        setField(term4165, term4165.getClass(), "price", null);
        setField(term4165, term4165.getClass(), "author", null);
        Object term4168 = newInstance(Class.forName("example.model.Book"));
        setField(term4168, term4168.getClass(), "id", null);
        setField(term4168, term4168.getClass(), "title", null);
        setField(term4168, term4168.getClass(), "description", null);
        setField(term4168, term4168.getClass(), "genre", null);
        setField(term4168, term4168.getClass(), "price", null);
        setField(term4168, term4168.getClass(), "author", null);
        Object term4169 = newInstance(Class.forName("example.model.Book"));
        setField(term4169, term4169.getClass(), "id", null);
        setField(term4169, term4169.getClass(), "title", null);
        setField(term4169, term4169.getClass(), "description", null);
        setField(term4169, term4169.getClass(), "genre", null);
        setField(term4169, term4169.getClass(), "price", null);
        setField(term4169, term4169.getClass(), "author", null);
        ArrayList term4160 = new ArrayList();
        ((ArrayList) term4160).add(term4162);
        ((ArrayList) term4160).add(term4165);
        ((ArrayList) term4160).add(term4168);
        ((ArrayList) term4160).add(term4169);
        term4065 = newInstance(Class.forName("example.model.Book$BookBuilder"));
        Object term4104 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4105 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4107 = (int[]) newIntArray(6);
        Object term4121 = newInstance(Class.forName("example.model.Author"));
        setField(term4065, term4065.getClass(), "id", term4066);
        setField(term4065, term4065.getClass(), "title", "WRIQkTdeMl");
        setField(term4065, term4065.getClass(), "description", "rLSEheWsHd");
        setField(term4065, term4065.getClass(), "genre", "DoUKDhlGCY");
        setIntField(term4105, term4105.getClass(), "signum", 1);
        setIntElement(term4107, 0, 56264);
        setIntElement(term4107, 1, -689615198);
        setIntElement(term4107, 2, 1027150763);
        setIntElement(term4107, 3, 3972545);
        setIntElement(term4107, 4, 1573519667);
        setIntElement(term4107, 5, 356611003);
        setField(term4105, term4105.getClass(), "mag", term4107);
        setIntField(term4105, term4105.getClass(), "bitCountPlusOne", 0);
        setIntField(term4105, term4105.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4105, term4105.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4105, term4105.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4104, term4104.getClass(), "intVal", term4105);
        setIntField(term4104, term4104.getClass(), "scale", 53);
        setIntField(term4104, term4104.getClass(), "precision", 0);
        setField(term4104, term4104.getClass(), "stringCache", null);
        setLongField(term4104, term4104.getClass(), "intCompact", -9223372036854775808L);
        setField(term4065, term4065.getClass(), "price", term4104);
        setField(term4121, term4121.getClass(), "id", term4122);
        setField(term4121, term4121.getClass(), "firstName", "IeoToWsQWU");
        setField(term4121, term4121.getClass(), "lastName", "QxiiHtQAzN");
        setField(term4121, term4121.getClass(), "email", "gQgTBlRIvX");
        setField(term4121, term4121.getClass(), "books", term4160);
        setField(term4065, term4065.getClass(), "author", term4121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book$BookBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4065, args);
    }

};


