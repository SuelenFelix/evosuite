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

public class PostSummary_findTime_1625074453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1553;
     Object term1775;

    public PostSummary_findTime_1625074453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1554 = new Long(4872422362414183754L);
        Object term1690 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1690, term1690.getClass(), "name", "");
        setField(term1690, term1690.getClass(), "slug", "");
        ArrayList term1688 = new ArrayList();
        ((ArrayList) term1688).add(term1690);
        Object term1697 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1697, term1697.getClass(), "name", "");
        setField(term1697, term1697.getClass(), "slug", "");
        Object term1700 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1700, term1700.getClass(), "name", "");
        setField(term1700, term1700.getClass(), "slug", "");
        Object term1703 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1703, term1703.getClass(), "name", "");
        setField(term1703, term1703.getClass(), "slug", "");
        Object term1706 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1706, term1706.getClass(), "name", "");
        setField(term1706, term1706.getClass(), "slug", "");
        Object term1709 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1709, term1709.getClass(), "name", "");
        setField(term1709, term1709.getClass(), "slug", "");
        Object term1712 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary$PostMeta"));
        setField(term1712, term1712.getClass(), "name", "");
        setField(term1712, term1712.getClass(), "slug", "");
        ArrayList term1695 = new ArrayList();
        ((ArrayList) term1695).add(term1697);
        ((ArrayList) term1695).add(term1700);
        ((ArrayList) term1695).add(term1703);
        ((ArrayList) term1695).add(term1706);
        ((ArrayList) term1695).add(term1709);
        ((ArrayList) term1695).add(term1712);
        term1553 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        Object term1717 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1719 = (int[]) newIntArray(4);
        Object term1728 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1730 = (int[]) newIntArray(4);
        setField(term1553, term1553.getClass(), "id", term1554);
        setField(term1553, term1553.getClass(), "firstName", "JqXGgAhZPl");
        setField(term1553, term1553.getClass(), "lastName", "jiKYgYHqIS");
        setField(term1553, term1553.getClass(), "username", "DfISiziTgG");
        setField(term1553, term1553.getClass(), "title", "XqgfKFvPSD");
        setField(term1553, term1553.getClass(), "metaTitle", "JiVRgTZvKc");
        setField(term1553, term1553.getClass(), "summary", "XPKmummaqg");
        setField(term1553, term1553.getClass(), "slug", "BKLfkLiZTH");
        setField(term1553, term1553.getClass(), "postType", "SPpkrGcPRr");
        setField(term1553, term1553.getClass(), "postStatus", "sEccwbJKYE");
        setField(term1553, term1553.getClass(), "content", "AWRooQKkdW");
        setField(term1553, term1553.getClass(), "publishedAt", "vjxIhXHxGR");
        setField(term1553, term1553.getClass(), "tags", term1688);
        setField(term1553, term1553.getClass(), "categories", term1695);
        setIntField(term1717, term1717.getClass(), "signum", 1);
        setIntElement(term1719, 0, -1863190589);
        setIntElement(term1719, 1, -1847873469);
        setIntElement(term1719, 2, 390017059);
        setIntElement(term1719, 3, -251162061);
        setField(term1717, term1717.getClass(), "mag", term1719);
        setIntField(term1717, term1717.getClass(), "bitCountPlusOne", 0);
        setIntField(term1717, term1717.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1717, term1717.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1717, term1717.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1553, term1553.getClass(), "likes", term1717);
        setIntField(term1728, term1728.getClass(), "signum", 1);
        setIntElement(term1730, 0, 610795187);
        setIntElement(term1730, 1, 1979806705);
        setIntElement(term1730, 2, 1795089907);
        setIntElement(term1730, 3, 1645000889);
        setField(term1728, term1728.getClass(), "mag", term1730);
        setIntField(term1728, term1728.getClass(), "bitCountPlusOne", 0);
        setIntField(term1728, term1728.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1728, term1728.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1728, term1728.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1553, term1553.getClass(), "views", term1728);
        setField(term1553, term1553.getClass(), "htmlContent", "pORebkoRdD");
        setField(term1553, term1553.getClass(), "htmlSummary", "mXGCWJDOqA");
        setField(term1553, term1553.getClass(), "readTime", "dpNsDgfPso");
        term1775 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1775, term1775.getClass(), "fastTime", 1480438351369L);
        setField(term1775, term1775.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term1775;
        callMethod(klass, "findTime", argTypes, term1553, args);
    }

};


