package in.cubestack.apps.blog.post.service;

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
import static in.cubestack.apps.blog.post.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class PostSummary_init_2100849020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465;
     Object term575;
     Object term613;
     Object term624;

    public PostSummary_init_2100849020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465 = new Long(-8400487765614892086L);
        term575 = newInstance(Class.forName("java.util.Date"));
        setLongField(term575, term575.getClass(), "fastTime", 1345871412244L);
        setField(term575, term575.getClass(), "cdate", null);
        term613 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term615 = (int[]) newIntArray(4);
        setIntField(term613, term613.getClass(), "signum", 1);
        setIntElement(term615, 0, 791012385);
        setIntElement(term615, 1, 819285061);
        setIntElement(term615, 2, 1509521496);
        setIntElement(term615, 3, 1264343831);
        setField(term613, term613.getClass(), "mag", term615);
        setIntField(term613, term613.getClass(), "bitCountPlusOne", 0);
        setIntField(term613, term613.getClass(), "bitLengthPlusOne", 0);
        setIntField(term613, term613.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term613, term613.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term624 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term626 = (int[]) newIntArray(4);
        setIntField(term624, term624.getClass(), "signum", 1);
        setIntElement(term626, 0, 313747341);
        setIntElement(term626, 1, -964936229);
        setIntElement(term626, 2, -478647413);
        setIntElement(term626, 3, -898923898);
        setField(term624, term624.getClass(), "mag", term626);
        setIntField(term624, term624.getClass(), "bitCountPlusOne", 0);
        setIntField(term624, term624.getClass(), "bitLengthPlusOne", 0);
        setIntField(term624, term624.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term624, term624.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[16];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.util.Date");
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = Class.forName("java.lang.String");
        argTypes[14] = Class.forName("java.math.BigInteger");
        argTypes[15] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[16];
        args[0] = term465;
        args[1] = "pCTimMblYc";
        args[2] = "hNxWaHcfhY";
        args[3] = "RkybSrpybU";
        args[4] = "xOEqzGAmDU";
        args[5] = "eZFUvlxvGV";
        args[6] = "BYqFIqCKAV";
        args[7] = "vrQLuWIDJX";
        args[8] = "flxyYxBRtu";
        args[9] = "OclPbYPkcH";
        args[10] = term575;
        args[11] = "IoAlmYsBwc";
        args[12] = "TEParAifyi";
        args[13] = "OWDIEULEFu";
        args[14] = term613;
        args[15] = term624;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


