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

public class GelbooruHandler_getFileURL_13644137983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4230;

    public GelbooruHandler_getFileURL_13644137983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4283 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4283, term4283.getClass(), "fileURL", "");
        setField(term4283, term4283.getClass(), "sampleURL", "");
        setField(term4283, term4283.getClass(), "thumbnailURL", "");
        setField(term4283, term4283.getClass(), "tags", "");
        setField(term4283, term4283.getClass(), "postURL", "");
        setIntField(term4283, term4283.getClass(), "id", 1008080511);
        setIntField(term4283, term4283.getClass(), "width", 1935707624);
        setIntField(term4283, term4283.getClass(), "height", 1507074215);
        Object term4292 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4292, term4292.getClass(), "fileURL", "");
        setField(term4292, term4292.getClass(), "sampleURL", "");
        setField(term4292, term4292.getClass(), "thumbnailURL", "");
        setField(term4292, term4292.getClass(), "tags", "");
        setField(term4292, term4292.getClass(), "postURL", "");
        setIntField(term4292, term4292.getClass(), "id", -282881827);
        setIntField(term4292, term4292.getClass(), "width", -1183353915);
        setIntField(term4292, term4292.getClass(), "height", -420030135);
        Object term4301 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4301, term4301.getClass(), "fileURL", "");
        setField(term4301, term4301.getClass(), "sampleURL", "");
        setField(term4301, term4301.getClass(), "thumbnailURL", "");
        setField(term4301, term4301.getClass(), "tags", "");
        setField(term4301, term4301.getClass(), "postURL", "");
        setIntField(term4301, term4301.getClass(), "id", 267763294);
        setIntField(term4301, term4301.getClass(), "width", -1497710478);
        setIntField(term4301, term4301.getClass(), "height", 49950830);
        ArrayList term4281 = new ArrayList();
        ((ArrayList) term4281).add(term4283);
        ((ArrayList) term4281).add(term4292);
        ((ArrayList) term4281).add(term4301);
        term4230 = newInstance(Class.forName("loliSnatcher.GelbooruHandler"));
        setField(term4230, term4230.getClass(), "apiKey", "EusenEbIoF");
        setField(term4230, term4230.getClass(), "userID", "SScVQYSvWH");
        setField(term4230, term4230.getClass(), "baseURL", "MnovcqFhCl");
        setIntField(term4230, term4230.getClass(), "pageNum", 1743224434);
        setIntField(term4230, term4230.getClass(), "limit", 842904495);
        setField(term4230, term4230.getClass(), "prevTags", "qYtAeLzOhW");
        setField(term4230, term4230.getClass(), "fetched", term4281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.GelbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nxSTJflLQy";
        callMethod(klass, "getFileURL", argTypes, term4230, args);
    }

};


