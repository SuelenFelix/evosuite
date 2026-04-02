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
import java.util.ArrayList;
import java.lang.Object;

public class PostSummary_getSlug_24657771411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4515;

    public PostSummary_getSlug_24657771411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4516 = new Long(-5476826692763582090L);
        Object term4652 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term4652, term4652.getClass(), "name", "");
        setField(term4652, term4652.getClass(), "slug", "");
        Object term4655 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term4655, term4655.getClass(), "name", "");
        setField(term4655, term4655.getClass(), "slug", "");
        ArrayList term4650 = new ArrayList();
        ((ArrayList) term4650).add(term4652);
        ((ArrayList) term4650).add(term4655);
        Object term4662 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term4662, term4662.getClass(), "name", "");
        setField(term4662, term4662.getClass(), "slug", "");
        ArrayList term4660 = new ArrayList();
        ((ArrayList) term4660).add(term4662);
        term4515 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term4667 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4669 = (int[]) newIntArray(4);
        Object term4678 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4680 = (int[]) newIntArray(4);
        setField(term4515, term4515.getClass(), "id", term4516);
        setField(term4515, term4515.getClass(), "firstName", "wdoqITnaAP");
        setField(term4515, term4515.getClass(), "lastName", "rIPMBcrNqB");
        setField(term4515, term4515.getClass(), "username", "UDaboHZHhz");
        setField(term4515, term4515.getClass(), "title", "nRvKihUSPj");
        setField(term4515, term4515.getClass(), "metaTitle", "BbNeQJpYPr");
        setField(term4515, term4515.getClass(), "summary", "riMtzCoxNj");
        setField(term4515, term4515.getClass(), "slug", "YAXkVjQZcV");
        setField(term4515, term4515.getClass(), "postType", "pumvwBWvpy");
        setField(term4515, term4515.getClass(), "postStatus", "HwLHeGLyhe");
        setField(term4515, term4515.getClass(), "content", "RDnkgWkcbz");
        setField(term4515, term4515.getClass(), "publishedAt", "IBpaxltauX");
        setField(term4515, term4515.getClass(), "tags", term4650);
        setField(term4515, term4515.getClass(), "categories", term4660);
        setIntField(term4667, term4667.getClass(), "signum", 1);
        setIntElement(term4669, 0, 1179412034);
        setIntElement(term4669, 1, 820827614);
        setIntElement(term4669, 2, -758556010);
        setIntElement(term4669, 3, -2132082799);
        setField(term4667, term4667.getClass(), "mag", term4669);
        setIntField(term4667, term4667.getClass(), "bitCountPlusOne", 0);
        setIntField(term4667, term4667.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4667, term4667.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4667, term4667.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4515, term4515.getClass(), "likes", term4667);
        setIntField(term4678, term4678.getClass(), "signum", 1);
        setIntElement(term4680, 0, 1117380577);
        setIntElement(term4680, 1, -1877052693);
        setIntElement(term4680, 2, 1366433848);
        setIntElement(term4680, 3, 1096447770);
        setField(term4678, term4678.getClass(), "mag", term4680);
        setIntField(term4678, term4678.getClass(), "bitCountPlusOne", 0);
        setIntField(term4678, term4678.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4678, term4678.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4678, term4678.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4515, term4515.getClass(), "views", term4678);
        setField(term4515, term4515.getClass(), "htmlContent", "iuCxnHGMoW");
        setField(term4515, term4515.getClass(), "htmlSummary", "GPSEWEDSTo");
        setField(term4515, term4515.getClass(), "readTime", "RCOqfVsRHt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlug", argTypes, term4515, args);
    }

};


