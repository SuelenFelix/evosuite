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

public class PostSummary_getTitle_8205385098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3420;

    public PostSummary_getTitle_8205385098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3421 = new Long(-8885298608300233488L);
        Object term3557 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term3557, term3557.getClass(), "name", "");
        setField(term3557, term3557.getClass(), "slug", "");
        Object term3560 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term3560, term3560.getClass(), "name", "");
        setField(term3560, term3560.getClass(), "slug", "");
        Object term3563 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term3563, term3563.getClass(), "name", "");
        setField(term3563, term3563.getClass(), "slug", "");
        ArrayList term3555 = new ArrayList();
        ((ArrayList) term3555).add(term3557);
        ((ArrayList) term3555).add(term3560);
        ((ArrayList) term3555).add(term3563);
        Object term3570 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term3570, term3570.getClass(), "name", "");
        setField(term3570, term3570.getClass(), "slug", "");
        ArrayList term3568 = new ArrayList();
        ((ArrayList) term3568).add(term3570);
        term3420 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term3575 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3577 = (int[]) newIntArray(4);
        Object term3586 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3588 = (int[]) newIntArray(4);
        setField(term3420, term3420.getClass(), "id", term3421);
        setField(term3420, term3420.getClass(), "firstName", "PqtVXXZMqK");
        setField(term3420, term3420.getClass(), "lastName", "rYbtIDVdnd");
        setField(term3420, term3420.getClass(), "username", "UKAReurpHG");
        setField(term3420, term3420.getClass(), "title", "WVRMUmrljA");
        setField(term3420, term3420.getClass(), "metaTitle", "NTlKJDDWlk");
        setField(term3420, term3420.getClass(), "summary", "vOuMEpOQAg");
        setField(term3420, term3420.getClass(), "slug", "SIODFGaQhr");
        setField(term3420, term3420.getClass(), "postType", "qYzsiuXOgS");
        setField(term3420, term3420.getClass(), "postStatus", "bxrCBbrrct");
        setField(term3420, term3420.getClass(), "content", "CKWpJaaaxX");
        setField(term3420, term3420.getClass(), "publishedAt", "UBRmXJmfrt");
        setField(term3420, term3420.getClass(), "tags", term3555);
        setField(term3420, term3420.getClass(), "categories", term3568);
        setIntField(term3575, term3575.getClass(), "signum", 1);
        setIntElement(term3577, 0, -2110912439);
        setIntElement(term3577, 1, -1522472114);
        setIntElement(term3577, 2, -1740681823);
        setIntElement(term3577, 3, -1478790406);
        setField(term3575, term3575.getClass(), "mag", term3577);
        setIntField(term3575, term3575.getClass(), "bitCountPlusOne", 0);
        setIntField(term3575, term3575.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3575, term3575.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3575, term3575.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3420, term3420.getClass(), "likes", term3575);
        setIntField(term3586, term3586.getClass(), "signum", 1);
        setIntElement(term3588, 0, 234112249);
        setIntElement(term3588, 1, 753114167);
        setIntElement(term3588, 2, -1046012143);
        setIntElement(term3588, 3, 264659769);
        setField(term3586, term3586.getClass(), "mag", term3588);
        setIntField(term3586, term3586.getClass(), "bitCountPlusOne", 0);
        setIntField(term3586, term3586.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3586, term3586.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3586, term3586.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3420, term3420.getClass(), "views", term3586);
        setField(term3420, term3420.getClass(), "htmlContent", "pvDEABOxLt");
        setField(term3420, term3420.getClass(), "htmlSummary", "beAMpkroCQ");
        setField(term3420, term3420.getClass(), "readTime", "uSUvKAyuvd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term3420, args);
    }

};


