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

public class PostSummary_getUsername_14995165737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3050;

    public PostSummary_getUsername_14995165737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3051 = new Long(-2813493605142626659L);
        Object term3187 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term3187, term3187.getClass(), "name", "");
        setField(term3187, term3187.getClass(), "slug", "");
        Object term3190 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term3190, term3190.getClass(), "name", "");
        setField(term3190, term3190.getClass(), "slug", "");
        Object term3193 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term3193, term3193.getClass(), "name", "");
        setField(term3193, term3193.getClass(), "slug", "");
        Object term3196 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term3196, term3196.getClass(), "name", "");
        setField(term3196, term3196.getClass(), "slug", "");
        Object term3199 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term3199, term3199.getClass(), "name", "");
        setField(term3199, term3199.getClass(), "slug", "");
        ArrayList term3185 = new ArrayList();
        ((ArrayList) term3185).add(term3187);
        ((ArrayList) term3185).add(term3190);
        ((ArrayList) term3185).add(term3193);
        ((ArrayList) term3185).add(term3196);
        ((ArrayList) term3185).add(term3199);
        Object term3206 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term3206, term3206.getClass(), "name", "");
        setField(term3206, term3206.getClass(), "slug", "");
        Object term3209 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term3209, term3209.getClass(), "name", "");
        setField(term3209, term3209.getClass(), "slug", "");
        ArrayList term3204 = new ArrayList();
        ((ArrayList) term3204).add(term3206);
        ((ArrayList) term3204).add(term3209);
        term3050 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term3214 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3216 = (int[]) newIntArray(4);
        Object term3225 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3227 = (int[]) newIntArray(4);
        setField(term3050, term3050.getClass(), "id", term3051);
        setField(term3050, term3050.getClass(), "firstName", "PCipZnmBOF");
        setField(term3050, term3050.getClass(), "lastName", "zcorEihhLK");
        setField(term3050, term3050.getClass(), "username", "GrqozDKFOk");
        setField(term3050, term3050.getClass(), "title", "CFyoseFGLF");
        setField(term3050, term3050.getClass(), "metaTitle", "SFqCrhEWLm");
        setField(term3050, term3050.getClass(), "summary", "GZdcJyZntS");
        setField(term3050, term3050.getClass(), "slug", "OIHoJeysUi");
        setField(term3050, term3050.getClass(), "postType", "WXMWFDGcLB");
        setField(term3050, term3050.getClass(), "postStatus", "wKWbJssZuG");
        setField(term3050, term3050.getClass(), "content", "NzBMMhkhpT");
        setField(term3050, term3050.getClass(), "publishedAt", "qCpEbQDHdF");
        setField(term3050, term3050.getClass(), "tags", term3185);
        setField(term3050, term3050.getClass(), "categories", term3204);
        setIntField(term3214, term3214.getClass(), "signum", 1);
        setIntElement(term3216, 0, 1338396187);
        setIntElement(term3216, 1, 1024067317);
        setIntElement(term3216, 2, -1542624227);
        setIntElement(term3216, 3, -690934961);
        setField(term3214, term3214.getClass(), "mag", term3216);
        setIntField(term3214, term3214.getClass(), "bitCountPlusOne", 0);
        setIntField(term3214, term3214.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3214, term3214.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3214, term3214.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3050, term3050.getClass(), "likes", term3214);
        setIntField(term3225, term3225.getClass(), "signum", 1);
        setIntElement(term3227, 0, 1947935327);
        setIntElement(term3227, 1, -1349728251);
        setIntElement(term3227, 2, 1726888622);
        setIntElement(term3227, 3, -1978853245);
        setField(term3225, term3225.getClass(), "mag", term3227);
        setIntField(term3225, term3225.getClass(), "bitCountPlusOne", 0);
        setIntField(term3225, term3225.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3225, term3225.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3225, term3225.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3050, term3050.getClass(), "views", term3225);
        setField(term3050, term3050.getClass(), "htmlContent", "iIRsCSYqXH");
        setField(term3050, term3050.getClass(), "htmlSummary", "nghfqDXyCG");
        setField(term3050, term3050.getClass(), "readTime", "WBAOTqErtm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term3050, args);
    }

};


