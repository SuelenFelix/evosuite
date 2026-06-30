package loliSnatcher;

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
import static loliSnatcher.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class GelbooruHandler_getPostURL_19548339107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4752;

    public GelbooruHandler_getPostURL_19548339107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4805 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4805, term4805.getClass(), "fileURL", "");
        setField(term4805, term4805.getClass(), "sampleURL", "");
        setField(term4805, term4805.getClass(), "thumbnailURL", "");
        setField(term4805, term4805.getClass(), "tags", "");
        setField(term4805, term4805.getClass(), "postURL", "");
        setIntField(term4805, term4805.getClass(), "id", 1236004505);
        setIntField(term4805, term4805.getClass(), "width", 1050765721);
        setIntField(term4805, term4805.getClass(), "height", 474518942);
        Object term4814 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4814, term4814.getClass(), "fileURL", "");
        setField(term4814, term4814.getClass(), "sampleURL", "");
        setField(term4814, term4814.getClass(), "thumbnailURL", "");
        setField(term4814, term4814.getClass(), "tags", "");
        setField(term4814, term4814.getClass(), "postURL", "");
        setIntField(term4814, term4814.getClass(), "id", -1656687479);
        setIntField(term4814, term4814.getClass(), "width", -249614216);
        setIntField(term4814, term4814.getClass(), "height", 1870727665);
        Object term4823 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4823, term4823.getClass(), "fileURL", "");
        setField(term4823, term4823.getClass(), "sampleURL", "");
        setField(term4823, term4823.getClass(), "thumbnailURL", "");
        setField(term4823, term4823.getClass(), "tags", "");
        setField(term4823, term4823.getClass(), "postURL", "");
        setIntField(term4823, term4823.getClass(), "id", -519881101);
        setIntField(term4823, term4823.getClass(), "width", -680920524);
        setIntField(term4823, term4823.getClass(), "height", -916335264);
        Object term4832 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4832, term4832.getClass(), "fileURL", "");
        setField(term4832, term4832.getClass(), "sampleURL", "");
        setField(term4832, term4832.getClass(), "thumbnailURL", "");
        setField(term4832, term4832.getClass(), "tags", "");
        setField(term4832, term4832.getClass(), "postURL", "");
        setIntField(term4832, term4832.getClass(), "id", -919416536);
        setIntField(term4832, term4832.getClass(), "width", -43417861);
        setIntField(term4832, term4832.getClass(), "height", -1533843432);
        Object term4841 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4841, term4841.getClass(), "fileURL", "");
        setField(term4841, term4841.getClass(), "sampleURL", "");
        setField(term4841, term4841.getClass(), "thumbnailURL", "");
        setField(term4841, term4841.getClass(), "tags", "");
        setField(term4841, term4841.getClass(), "postURL", "");
        setIntField(term4841, term4841.getClass(), "id", -123338791);
        setIntField(term4841, term4841.getClass(), "width", -1467089634);
        setIntField(term4841, term4841.getClass(), "height", 413548937);
        Object term4850 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4850, term4850.getClass(), "fileURL", "");
        setField(term4850, term4850.getClass(), "sampleURL", "");
        setField(term4850, term4850.getClass(), "thumbnailURL", "");
        setField(term4850, term4850.getClass(), "tags", "");
        setField(term4850, term4850.getClass(), "postURL", "");
        setIntField(term4850, term4850.getClass(), "id", 1901317214);
        setIntField(term4850, term4850.getClass(), "width", 1166710220);
        setIntField(term4850, term4850.getClass(), "height", -1070592289);
        Object term4859 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4859, term4859.getClass(), "fileURL", "");
        setField(term4859, term4859.getClass(), "sampleURL", "");
        setField(term4859, term4859.getClass(), "thumbnailURL", "");
        setField(term4859, term4859.getClass(), "tags", "");
        setField(term4859, term4859.getClass(), "postURL", "");
        setIntField(term4859, term4859.getClass(), "id", -1464172784);
        setIntField(term4859, term4859.getClass(), "width", 32185364);
        setIntField(term4859, term4859.getClass(), "height", 1768204942);
        Object term4868 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4868, term4868.getClass(), "fileURL", "");
        setField(term4868, term4868.getClass(), "sampleURL", "");
        setField(term4868, term4868.getClass(), "thumbnailURL", "");
        setField(term4868, term4868.getClass(), "tags", "");
        setField(term4868, term4868.getClass(), "postURL", "");
        setIntField(term4868, term4868.getClass(), "id", 1252951645);
        setIntField(term4868, term4868.getClass(), "width", 574481092);
        setIntField(term4868, term4868.getClass(), "height", -310528004);
        ArrayList term4803 = new ArrayList();
        ((ArrayList) term4803).add(term4805);
        ((ArrayList) term4803).add(term4814);
        ((ArrayList) term4803).add(term4823);
        ((ArrayList) term4803).add(term4832);
        ((ArrayList) term4803).add(term4841);
        ((ArrayList) term4803).add(term4850);
        ((ArrayList) term4803).add(term4859);
        ((ArrayList) term4803).add(term4868);
        term4752 = newInstance(Class.forName("loliSnatcher.GelbooruHandler"));
        setField(term4752, term4752.getClass(), "apiKey", "hIYsRyOZxk");
        setField(term4752, term4752.getClass(), "userID", "RjNoEywJbC");
        setField(term4752, term4752.getClass(), "baseURL", "RTTvrwwhou");
        setIntField(term4752, term4752.getClass(), "pageNum", 2009020256);
        setIntField(term4752, term4752.getClass(), "limit", 2049577015);
        setField(term4752, term4752.getClass(), "prevTags", "lRORwXipuk");
        setField(term4752, term4752.getClass(), "fetched", term4803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.GelbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rsumfoDNHa";
        callMethod(klass, "getPostURL", argTypes, term4752, args);
    }

};


