package in.cubestack.apps.blog.admin.resource;

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
import static in.cubestack.apps.blog.admin.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class PostCandidate_setStatus_121115367839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32508;
     Object enum79;

    public PostCandidate_setStatus_121115367839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32509 = new Long(-7291743527973326814L);
        Class<? extends Object> term32730 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term32729 = ((Class) term32730).getDeclaredField((String) "COURSE");
        ((Field) term32729).setAccessible(true);
        Object enum78 = ((Field) term32729).get((Object) null);
        Class<? extends Object> term32970 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term32969 = ((Class) term32970).getDeclaredField((String) "DRAFT");
        ((Field) term32969).setAccessible(true);
        enum79 = ((Field) term32969).get((Object) null);
        HashMap term32594 = new HashMap();
        Set<Object> term33226 =  ((Map) term32594).keySet();
        HashSet term32593 = new HashSet((Collection<? extends Object>) term33226);
        HashMap term32600 = new HashMap();
        Set<Object> term33227 =  ((Map) term32600).keySet();
        HashSet term32599 = new HashSet((Collection<? extends Object>) term33227);
        ArrayList term32679 = new ArrayList();
        ArrayList term32683 = new ArrayList();
        term32508 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term32654 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term32508, term32508.getClass(), "id", term32509);
        setField(term32508, term32508.getClass(), "title", "bHHjfDCntT");
        setField(term32508, term32508.getClass(), "metaTitle", "sEphiduvkv");
        setField(term32508, term32508.getClass(), "summary", "PbLgCSAHce");
        setField(term32508, term32508.getClass(), "postType", enum78);
        setField(term32508, term32508.getClass(), "status", enum79);
        setField(term32508, term32508.getClass(), "content", "NWldOLAbqk");
        setField(term32508, term32508.getClass(), "categories", term32593);
        setField(term32508, term32508.getClass(), "tags", term32599);
        setField(term32508, term32508.getClass(), "slug", "qnYaYSpDwO");
        setField(term32508, term32508.getClass(), "htmlContent", "dgbFDCdHtj");
        setField(term32508, term32508.getClass(), "htmlSummary", "EKpdCBubDE");
        setField(term32508, term32508.getClass(), "postStatus", "zMsSLTfGhl");
        setBooleanField(term32508, term32508.getClass(), "seriesOrGuide", true);
        setField(term32654, term32654.getClass(), "firstName", "bEmHScVZaQ");
        setField(term32654, term32654.getClass(), "lastName", "TcuXODkzBV");
        setField(term32508, term32508.getClass(), "person", term32654);
        setField(term32508, term32508.getClass(), "tagCandidates", term32679);
        setField(term32508, term32508.getClass(), "categoryCandidates", term32683);
        setField(term32508, term32508.getClass(), "updatedAt", "coJPjrBZNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.PostStatus");
        Object[] args = new Object[1];
        args[0] = enum79;
        callMethod(klass, "setStatus", argTypes, term32508, args);
    }

};


