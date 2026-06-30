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

public class Book_BookBuilder_price_6203521595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3583;
     Object term3694;

    public Book_BookBuilder_price_6203521595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3584 = new Long(6895382576300001141L);
        Long term3640 = new Long(9062006526792682783L);
        Long term3681 = new Long(-7400951017937830861L);
        Object term3680 = newInstance(Class.forName("example.model.Book"));
        setField(term3680, term3680.getClass(), "id", term3681);
        setField(term3680, term3680.getClass(), "title", null);
        setField(term3680, term3680.getClass(), "description", null);
        setField(term3680, term3680.getClass(), "genre", null);
        setField(term3680, term3680.getClass(), "price", null);
        setField(term3680, term3680.getClass(), "author", null);
        Object term3683 = newInstance(Class.forName("example.model.Book"));
        setField(term3683, term3683.getClass(), "id", null);
        setField(term3683, term3683.getClass(), "title", null);
        setField(term3683, term3683.getClass(), "description", null);
        setField(term3683, term3683.getClass(), "genre", null);
        setField(term3683, term3683.getClass(), "price", null);
        setField(term3683, term3683.getClass(), "author", null);
        Object term3684 = newInstance(Class.forName("example.model.Book"));
        setField(term3684, term3684.getClass(), "id", null);
        setField(term3684, term3684.getClass(), "title", null);
        setField(term3684, term3684.getClass(), "description", null);
        setField(term3684, term3684.getClass(), "genre", null);
        setField(term3684, term3684.getClass(), "price", null);
        setField(term3684, term3684.getClass(), "author", null);
        Object term3685 = newInstance(Class.forName("example.model.Book"));
        setField(term3685, term3685.getClass(), "id", null);
        setField(term3685, term3685.getClass(), "title", null);
        setField(term3685, term3685.getClass(), "description", null);
        setField(term3685, term3685.getClass(), "genre", null);
        setField(term3685, term3685.getClass(), "price", null);
        setField(term3685, term3685.getClass(), "author", null);
        Long term3687 = new Long(-421166328269063791L);
        Object term3686 = newInstance(Class.forName("example.model.Book"));
        setField(term3686, term3686.getClass(), "id", term3687);
        setField(term3686, term3686.getClass(), "title", null);
        setField(term3686, term3686.getClass(), "description", null);
        setField(term3686, term3686.getClass(), "genre", null);
        setField(term3686, term3686.getClass(), "price", null);
        setField(term3686, term3686.getClass(), "author", null);
        Long term3690 = new Long(6351887424140565471L);
        Object term3689 = newInstance(Class.forName("example.model.Book"));
        setField(term3689, term3689.getClass(), "id", term3690);
        setField(term3689, term3689.getClass(), "title", null);
        setField(term3689, term3689.getClass(), "description", null);
        setField(term3689, term3689.getClass(), "genre", null);
        setField(term3689, term3689.getClass(), "price", null);
        setField(term3689, term3689.getClass(), "author", null);
        ArrayList term3678 = new ArrayList();
        ((ArrayList) term3678).add(term3680);
        ((ArrayList) term3678).add(term3683);
        ((ArrayList) term3678).add(term3684);
        ((ArrayList) term3678).add(term3685);
        ((ArrayList) term3678).add(term3686);
        ((ArrayList) term3678).add(term3689);
        ((ArrayList) term3678).add(term3683);
        ((ArrayList) term3678).add(term3685);
        term3583 = newInstance(Class.forName("example.model.Book$BookBuilder"));
        Object term3622 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3623 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3625 = (int[]) newIntArray(6);
        Object term3639 = newInstance(Class.forName("example.model.Author"));
        setField(term3583, term3583.getClass(), "id", term3584);
        setField(term3583, term3583.getClass(), "title", "dHuWgRwLOm");
        setField(term3583, term3583.getClass(), "description", "PsTQDxNIld");
        setField(term3583, term3583.getClass(), "genre", "uoBijJjvaj");
        setIntField(term3623, term3623.getClass(), "signum", 1);
        setIntElement(term3625, 0, 7394);
        setIntElement(term3625, 1, -666644541);
        setIntElement(term3625, 2, 1009709);
        setIntElement(term3625, 3, -217344959);
        setIntElement(term3625, 4, -10974684);
        setIntElement(term3625, 5, -1164360963);
        setField(term3623, term3623.getClass(), "mag", term3625);
        setIntField(term3623, term3623.getClass(), "bitCountPlusOne", 0);
        setIntField(term3623, term3623.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3623, term3623.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3623, term3623.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3622, term3622.getClass(), "intVal", term3623);
        setIntField(term3622, term3622.getClass(), "scale", 53);
        setIntField(term3622, term3622.getClass(), "precision", 0);
        setField(term3622, term3622.getClass(), "stringCache", null);
        setLongField(term3622, term3622.getClass(), "intCompact", -9223372036854775808L);
        setField(term3583, term3583.getClass(), "price", term3622);
        setField(term3639, term3639.getClass(), "id", term3640);
        setField(term3639, term3639.getClass(), "firstName", "BdsLFSRWda");
        setField(term3639, term3639.getClass(), "lastName", "tMhhBYonAI");
        setField(term3639, term3639.getClass(), "email", "AaQRshwIQC");
        setField(term3639, term3639.getClass(), "books", term3678);
        setField(term3583, term3583.getClass(), "author", term3639);
        term3694 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3695 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3697 = (int[]) newIntArray(6);
        setIntField(term3695, term3695.getClass(), "signum", 1);
        setIntElement(term3697, 0, 6251);
        setIntElement(term3697, 1, -2089382194);
        setIntElement(term3697, 2, 108979853);
        setIntElement(term3697, 3, -1512241849);
        setIntElement(term3697, 4, 924695156);
        setIntElement(term3697, 5, -1853169295);
        setField(term3695, term3695.getClass(), "mag", term3697);
        setIntField(term3695, term3695.getClass(), "bitCountPlusOne", 0);
        setIntField(term3695, term3695.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3695, term3695.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3695, term3695.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3694, term3694.getClass(), "intVal", term3695);
        setIntField(term3694, term3694.getClass(), "scale", 52);
        setIntField(term3694, term3694.getClass(), "precision", 0);
        setField(term3694, term3694.getClass(), "stringCache", null);
        setLongField(term3694, term3694.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.model.Book$BookBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term3694;
        callMethod(klass, "price", argTypes, term3583, args);
    }

};


