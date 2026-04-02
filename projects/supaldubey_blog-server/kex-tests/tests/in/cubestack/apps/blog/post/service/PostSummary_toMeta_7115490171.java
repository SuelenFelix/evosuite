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

public class PostSummary_toMeta_7115490171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term763;

    public PostSummary_toMeta_7115490171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term764 = new Long(5270370404989704783L);
        Object term900 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term900, term900.getClass(), "name", "");
        setField(term900, term900.getClass(), "slug", "");
        Object term903 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term903, term903.getClass(), "name", "");
        setField(term903, term903.getClass(), "slug", "");
        Object term906 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term906, term906.getClass(), "name", "");
        setField(term906, term906.getClass(), "slug", "");
        Object term909 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term909, term909.getClass(), "name", "");
        setField(term909, term909.getClass(), "slug", "");
        Object term912 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term912, term912.getClass(), "name", "");
        setField(term912, term912.getClass(), "slug", "");
        ArrayList term898 = new ArrayList();
        ((ArrayList) term898).add(term900);
        ((ArrayList) term898).add(term903);
        ((ArrayList) term898).add(term906);
        ((ArrayList) term898).add(term909);
        ((ArrayList) term898).add(term912);
        Object term919 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term919, term919.getClass(), "name", "");
        setField(term919, term919.getClass(), "slug", "");
        Object term922 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term922, term922.getClass(), "name", "");
        setField(term922, term922.getClass(), "slug", "");
        Object term925 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term925, term925.getClass(), "name", "");
        setField(term925, term925.getClass(), "slug", "");
        Object term928 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term928, term928.getClass(), "name", "");
        setField(term928, term928.getClass(), "slug", "");
        ArrayList term917 = new ArrayList();
        ((ArrayList) term917).add(term919);
        ((ArrayList) term917).add(term922);
        ((ArrayList) term917).add(term925);
        ((ArrayList) term917).add(term928);
        term763 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term933 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term935 = (int[]) newIntArray(4);
        Object term944 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term946 = (int[]) newIntArray(4);
        setField(term763, term763.getClass(), "id", term764);
        setField(term763, term763.getClass(), "firstName", "dWRymuLBtr");
        setField(term763, term763.getClass(), "lastName", "AijpHYOFuy");
        setField(term763, term763.getClass(), "username", "SbAoxhfrkn");
        setField(term763, term763.getClass(), "title", "kuTXqwMtDB");
        setField(term763, term763.getClass(), "metaTitle", "Ghbwtircqb");
        setField(term763, term763.getClass(), "summary", "xrwlQZdwCp");
        setField(term763, term763.getClass(), "slug", "IDCWpPLRkE");
        setField(term763, term763.getClass(), "postType", "nyiiPDVjAc");
        setField(term763, term763.getClass(), "postStatus", "aKnKipADSo");
        setField(term763, term763.getClass(), "content", "wSQxaModmm");
        setField(term763, term763.getClass(), "publishedAt", "UlajhuVLaP");
        setField(term763, term763.getClass(), "tags", term898);
        setField(term763, term763.getClass(), "categories", term917);
        setIntField(term933, term933.getClass(), "signum", 1);
        setIntElement(term935, 0, -165862327);
        setIntElement(term935, 1, 1335502000);
        setIntElement(term935, 2, -1994335642);
        setIntElement(term935, 3, -1099245088);
        setField(term933, term933.getClass(), "mag", term935);
        setIntField(term933, term933.getClass(), "bitCountPlusOne", 0);
        setIntField(term933, term933.getClass(), "bitLengthPlusOne", 0);
        setIntField(term933, term933.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term933, term933.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term763, term763.getClass(), "likes", term933);
        setIntField(term944, term944.getClass(), "signum", 1);
        setIntElement(term946, 0, 1397923395);
        setIntElement(term946, 1, 1257594315);
        setIntElement(term946, 2, -1189378466);
        setIntElement(term946, 3, 834705699);
        setField(term944, term944.getClass(), "mag", term946);
        setIntField(term944, term944.getClass(), "bitCountPlusOne", 0);
        setIntField(term944, term944.getClass(), "bitLengthPlusOne", 0);
        setIntField(term944, term944.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term944, term944.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term763, term763.getClass(), "views", term944);
        setField(term763, term763.getClass(), "htmlContent", "ieCtQFdkii");
        setField(term763, term763.getClass(), "htmlSummary", "dEnhdmILtU");
        setField(term763, term763.getClass(), "readTime", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eqJfYWRaEL";
        callMethod(klass, "toMeta", argTypes, term763, args);
    }

};


