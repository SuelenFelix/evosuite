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

public class Book_BookBuilder_author_7851125026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3783;
     Object term3887;

    public Book_BookBuilder_author_7851125026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3784 = new Long(9174730812791817537L);
        Long term3840 = new Long(8024477479047145752L);
        Long term3881 = new Long(7006402814669334483L);
        Object term3880 = newInstance(Class.forName("example.model.Book"));
        setField(term3880, term3880.getClass(), "id", term3881);
        setField(term3880, term3880.getClass(), "title", null);
        setField(term3880, term3880.getClass(), "description", null);
        setField(term3880, term3880.getClass(), "genre", null);
        setField(term3880, term3880.getClass(), "price", null);
        setField(term3880, term3880.getClass(), "author", null);
        Object term3883 = newInstance(Class.forName("example.model.Book"));
        setField(term3883, term3883.getClass(), "id", null);
        setField(term3883, term3883.getClass(), "title", null);
        setField(term3883, term3883.getClass(), "description", null);
        setField(term3883, term3883.getClass(), "genre", null);
        setField(term3883, term3883.getClass(), "price", null);
        setField(term3883, term3883.getClass(), "author", null);
        Object term3884 = newInstance(Class.forName("example.model.Book"));
        setField(term3884, term3884.getClass(), "id", null);
        setField(term3884, term3884.getClass(), "title", null);
        setField(term3884, term3884.getClass(), "description", null);
        setField(term3884, term3884.getClass(), "genre", null);
        setField(term3884, term3884.getClass(), "price", null);
        setField(term3884, term3884.getClass(), "author", null);
        ArrayList term3878 = new ArrayList();
        ((ArrayList) term3878).add(term3880);
        ((ArrayList) term3878).add(term3883);
        ((ArrayList) term3878).add(term3884);
        term3783 = newInstance(Class.forName("example.model.Book$BookBuilder"));
        Object term3822 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3823 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3825 = (int[]) newIntArray(6);
        Object term3839 = newInstance(Class.forName("example.model.Author"));
        setField(term3783, term3783.getClass(), "id", term3784);
        setField(term3783, term3783.getClass(), "title", "rtifrlITwl");
        setField(term3783, term3783.getClass(), "description", "yGWXZDjnPS");
        setField(term3783, term3783.getClass(), "genre", "vZucxbGVyo");
        setIntField(term3823, term3823.getClass(), "signum", 1);
        setIntElement(term3825, 0, 256);
        setIntElement(term3825, 1, 98594422);
        setIntElement(term3825, 2, -1442587441);
        setIntElement(term3825, 3, 1360770213);
        setIntElement(term3825, 4, 1509833096);
        setIntElement(term3825, 5, 1701228933);
        setField(term3823, term3823.getClass(), "mag", term3825);
        setIntField(term3823, term3823.getClass(), "bitCountPlusOne", 0);
        setIntField(term3823, term3823.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3823, term3823.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3823, term3823.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3822, term3822.getClass(), "intVal", term3823);
        setIntField(term3822, term3822.getClass(), "scale", 51);
        setIntField(term3822, term3822.getClass(), "precision", 0);
        setField(term3822, term3822.getClass(), "stringCache", null);
        setLongField(term3822, term3822.getClass(), "intCompact", -9223372036854775808L);
        setField(term3783, term3783.getClass(), "price", term3822);
        setField(term3839, term3839.getClass(), "id", term3840);
        setField(term3839, term3839.getClass(), "firstName", "ZZoLNbeORl");
        setField(term3839, term3839.getClass(), "lastName", "XjIOUIzJUP");
        setField(term3839, term3839.getClass(), "email", "iGTpXnnTqB");
        setField(term3839, term3839.getClass(), "books", term3878);
        setField(term3783, term3783.getClass(), "author", term3839);
        Long term3888 = new Long(-5004803270846838598L);
        Long term3929 = new Long(-8211859616692114655L);
        Long term3939 = new Long(7487838449539103993L);
        Object term3928 = newInstance(Class.forName("example.model.Book"));
        Object term3934 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3938 = newInstance(Class.forName("example.model.Author"));
        setField(term3928, term3928.getClass(), "id", term3929);
        setField(term3928, term3928.getClass(), "title", "");
        setField(term3928, term3928.getClass(), "description", "");
        setField(term3928, term3928.getClass(), "genre", "");
        setField(term3934, term3934.getClass(), "intVal", null);
        setIntField(term3934, term3934.getClass(), "scale", 52);
        setIntField(term3934, term3934.getClass(), "precision", 0);
        setField(term3934, term3934.getClass(), "stringCache", null);
        setLongField(term3934, term3934.getClass(), "intCompact", -9223372036854775808L);
        setField(term3928, term3928.getClass(), "price", term3934);
        setField(term3938, term3938.getClass(), "id", term3939);
        setField(term3938, term3938.getClass(), "firstName", null);
        setField(term3938, term3938.getClass(), "lastName", null);
        setField(term3938, term3938.getClass(), "email", null);
        setField(term3938, term3938.getClass(), "books", null);
        setField(term3928, term3928.getClass(), "author", term3938);
        Long term3942 = new Long(7010148136855890340L);
        Long term3952 = new Long(-6771377873268167033L);
        Object term3941 = newInstance(Class.forName("example.model.Book"));
        Object term3947 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3951 = newInstance(Class.forName("example.model.Author"));
        setField(term3941, term3941.getClass(), "id", term3942);
        setField(term3941, term3941.getClass(), "title", "");
        setField(term3941, term3941.getClass(), "description", "");
        setField(term3941, term3941.getClass(), "genre", "");
        setField(term3947, term3947.getClass(), "intVal", null);
        setIntField(term3947, term3947.getClass(), "scale", 53);
        setIntField(term3947, term3947.getClass(), "precision", 0);
        setField(term3947, term3947.getClass(), "stringCache", null);
        setLongField(term3947, term3947.getClass(), "intCompact", -9223372036854775808L);
        setField(term3941, term3941.getClass(), "price", term3947);
        setField(term3951, term3951.getClass(), "id", term3952);
        setField(term3951, term3951.getClass(), "firstName", null);
        setField(term3951, term3951.getClass(), "lastName", null);
        setField(term3951, term3951.getClass(), "email", null);
        setField(term3951, term3951.getClass(), "books", null);
        setField(term3941, term3941.getClass(), "author", term3951);
        Long term3955 = new Long(5845993504299821981L);
        Long term3965 = new Long(-1750555031444556464L);
        Object term3954 = newInstance(Class.forName("example.model.Book"));
        Object term3960 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3964 = newInstance(Class.forName("example.model.Author"));
        setField(term3954, term3954.getClass(), "id", term3955);
        setField(term3954, term3954.getClass(), "title", "");
        setField(term3954, term3954.getClass(), "description", "");
        setField(term3954, term3954.getClass(), "genre", "");
        setField(term3960, term3960.getClass(), "intVal", null);
        setIntField(term3960, term3960.getClass(), "scale", 53);
        setIntField(term3960, term3960.getClass(), "precision", 0);
        setField(term3960, term3960.getClass(), "stringCache", null);
        setLongField(term3960, term3960.getClass(), "intCompact", -9223372036854775808L);
        setField(term3954, term3954.getClass(), "price", term3960);
        setField(term3964, term3964.getClass(), "id", term3965);
        setField(term3964, term3964.getClass(), "firstName", null);
        setField(term3964, term3964.getClass(), "lastName", null);
        setField(term3964, term3964.getClass(), "email", null);
        setField(term3964, term3964.getClass(), "books", null);
        setField(term3954, term3954.getClass(), "author", term3964);
        ArrayList term3926 = new ArrayList();
        ((ArrayList) term3926).add(term3928);
        ((ArrayList) term3926).add(term3941);
        ((ArrayList) term3926).add(term3941);
        ((ArrayList) term3926).add(term3954);
        term3887 = newInstance(Class.forName("example.model.Author"));
        setField(term3887, term3887.getClass(), "id", term3888);
        setField(term3887, term3887.getClass(), "firstName", "MzXzaqaiHW");
        setField(term3887, term3887.getClass(), "lastName", "jWOWtrhVkA");
        setField(term3887, term3887.getClass(), "email", "IyOhWYyaDV");
        setField(term3887, term3887.getClass(), "books", term3926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book$BookBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("example.model.Author");
        Object[] args = new Object[1];
        args[0] = term3887;
        callMethod(klass, "author", argTypes, term3783, args);
    }

};


