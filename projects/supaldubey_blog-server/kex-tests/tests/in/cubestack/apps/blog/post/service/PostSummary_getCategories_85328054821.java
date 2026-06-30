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

public class PostSummary_getCategories_85328054821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8267;

    public PostSummary_getCategories_85328054821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8268 = new Long(2486810210675247493L);
        Object term8404 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8404, term8404.getClass(), "name", "");
        setField(term8404, term8404.getClass(), "slug", "");
        Object term8407 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8407, term8407.getClass(), "name", "");
        setField(term8407, term8407.getClass(), "slug", "");
        Object term8410 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8410, term8410.getClass(), "name", "");
        setField(term8410, term8410.getClass(), "slug", "");
        Object term8413 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8413, term8413.getClass(), "name", "");
        setField(term8413, term8413.getClass(), "slug", "");
        ArrayList term8402 = new ArrayList();
        ((ArrayList) term8402).add(term8404);
        ((ArrayList) term8402).add(term8407);
        ((ArrayList) term8402).add(term8410);
        ((ArrayList) term8402).add(term8413);
        Object term8420 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8420, term8420.getClass(), "name", "");
        setField(term8420, term8420.getClass(), "slug", "");
        Object term8423 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8423, term8423.getClass(), "name", "");
        setField(term8423, term8423.getClass(), "slug", "");
        Object term8426 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8426, term8426.getClass(), "name", "");
        setField(term8426, term8426.getClass(), "slug", "");
        Object term8429 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8429, term8429.getClass(), "name", "");
        setField(term8429, term8429.getClass(), "slug", "");
        Object term8432 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8432, term8432.getClass(), "name", "");
        setField(term8432, term8432.getClass(), "slug", "");
        Object term8435 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term8435, term8435.getClass(), "name", "");
        setField(term8435, term8435.getClass(), "slug", "");
        ArrayList term8418 = new ArrayList();
        ((ArrayList) term8418).add(term8420);
        ((ArrayList) term8418).add(term8423);
        ((ArrayList) term8418).add(term8426);
        ((ArrayList) term8418).add(term8429);
        ((ArrayList) term8418).add(term8432);
        ((ArrayList) term8418).add(term8435);
        ((ArrayList) term8418).add(term8429);
        ((ArrayList) term8418).add(term8432);
        term8267 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term8440 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8442 = (int[]) newIntArray(4);
        Object term8451 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8453 = (int[]) newIntArray(4);
        setField(term8267, term8267.getClass(), "id", term8268);
        setField(term8267, term8267.getClass(), "firstName", "UBPHmOICBs");
        setField(term8267, term8267.getClass(), "lastName", "IDJUVPgUJf");
        setField(term8267, term8267.getClass(), "username", "JmnWRJUxGr");
        setField(term8267, term8267.getClass(), "title", "wgRGBNrTGP");
        setField(term8267, term8267.getClass(), "metaTitle", "FIdNVptZpW");
        setField(term8267, term8267.getClass(), "summary", "rQjxAhisjm");
        setField(term8267, term8267.getClass(), "slug", "ZDhASPHjDG");
        setField(term8267, term8267.getClass(), "postType", "HNVOAXYNEZ");
        setField(term8267, term8267.getClass(), "postStatus", "gbbYBYyfvr");
        setField(term8267, term8267.getClass(), "content", "SrWMUlbtWV");
        setField(term8267, term8267.getClass(), "publishedAt", "VePIumgrrU");
        setField(term8267, term8267.getClass(), "tags", term8402);
        setField(term8267, term8267.getClass(), "categories", term8418);
        setIntField(term8440, term8440.getClass(), "signum", 1);
        setIntElement(term8442, 0, 386067591);
        setIntElement(term8442, 1, 1611550029);
        setIntElement(term8442, 2, -1165460443);
        setIntElement(term8442, 3, -1219032652);
        setField(term8440, term8440.getClass(), "mag", term8442);
        setIntField(term8440, term8440.getClass(), "bitCountPlusOne", 0);
        setIntField(term8440, term8440.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8440, term8440.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8440, term8440.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8267, term8267.getClass(), "likes", term8440);
        setIntField(term8451, term8451.getClass(), "signum", 1);
        setIntElement(term8453, 0, 23271998);
        setIntElement(term8453, 1, 1665933532);
        setIntElement(term8453, 2, -2029352665);
        setIntElement(term8453, 3, -825384049);
        setField(term8451, term8451.getClass(), "mag", term8453);
        setIntField(term8451, term8451.getClass(), "bitCountPlusOne", 0);
        setIntField(term8451, term8451.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8451, term8451.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8451, term8451.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8267, term8267.getClass(), "views", term8451);
        setField(term8267, term8267.getClass(), "htmlContent", "fLRqcTSfzF");
        setField(term8267, term8267.getClass(), "htmlSummary", "EBYHwsuWAU");
        setField(term8267, term8267.getClass(), "readTime", "PtIjKpiSix");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategories", argTypes, term8267, args);
    }

};


