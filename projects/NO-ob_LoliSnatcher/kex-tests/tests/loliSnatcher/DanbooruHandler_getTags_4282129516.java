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

public class DanbooruHandler_getTags_4282129516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2125;

    public DanbooruHandler_getTags_4282129516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2154 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2154, term2154.getClass(), "fileURL", "");
        setField(term2154, term2154.getClass(), "sampleURL", "");
        setField(term2154, term2154.getClass(), "thumbnailURL", "");
        setField(term2154, term2154.getClass(), "tags", "");
        setField(term2154, term2154.getClass(), "postURL", "");
        setIntField(term2154, term2154.getClass(), "id", -341962980);
        setIntField(term2154, term2154.getClass(), "width", 1532716628);
        setIntField(term2154, term2154.getClass(), "height", -1801760683);
        Object term2163 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2163, term2163.getClass(), "fileURL", "");
        setField(term2163, term2163.getClass(), "sampleURL", "");
        setField(term2163, term2163.getClass(), "thumbnailURL", "");
        setField(term2163, term2163.getClass(), "tags", "");
        setField(term2163, term2163.getClass(), "postURL", "");
        setIntField(term2163, term2163.getClass(), "id", 1141317871);
        setIntField(term2163, term2163.getClass(), "width", 890669485);
        setIntField(term2163, term2163.getClass(), "height", 691577392);
        Object term2172 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2172, term2172.getClass(), "fileURL", "");
        setField(term2172, term2172.getClass(), "sampleURL", "");
        setField(term2172, term2172.getClass(), "thumbnailURL", "");
        setField(term2172, term2172.getClass(), "tags", "");
        setField(term2172, term2172.getClass(), "postURL", "");
        setIntField(term2172, term2172.getClass(), "id", -893623680);
        setIntField(term2172, term2172.getClass(), "width", -1963434938);
        setIntField(term2172, term2172.getClass(), "height", 906181092);
        Object term2181 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2181, term2181.getClass(), "fileURL", "");
        setField(term2181, term2181.getClass(), "sampleURL", "");
        setField(term2181, term2181.getClass(), "thumbnailURL", "");
        setField(term2181, term2181.getClass(), "tags", "");
        setField(term2181, term2181.getClass(), "postURL", "");
        setIntField(term2181, term2181.getClass(), "id", 1045657203);
        setIntField(term2181, term2181.getClass(), "width", 1386130016);
        setIntField(term2181, term2181.getClass(), "height", 1072005683);
        Object term2190 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2190, term2190.getClass(), "fileURL", "");
        setField(term2190, term2190.getClass(), "sampleURL", "");
        setField(term2190, term2190.getClass(), "thumbnailURL", "");
        setField(term2190, term2190.getClass(), "tags", "");
        setField(term2190, term2190.getClass(), "postURL", "");
        setIntField(term2190, term2190.getClass(), "id", 1861318859);
        setIntField(term2190, term2190.getClass(), "width", 1474524152);
        setIntField(term2190, term2190.getClass(), "height", 568954359);
        Object term2199 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term2199, term2199.getClass(), "fileURL", "");
        setField(term2199, term2199.getClass(), "sampleURL", "");
        setField(term2199, term2199.getClass(), "thumbnailURL", "");
        setField(term2199, term2199.getClass(), "tags", "");
        setField(term2199, term2199.getClass(), "postURL", "");
        setIntField(term2199, term2199.getClass(), "id", 53410913);
        setIntField(term2199, term2199.getClass(), "width", -375014958);
        setIntField(term2199, term2199.getClass(), "height", 1107176718);
        ArrayList term2152 = new ArrayList();
        ((ArrayList) term2152).add(term2154);
        ((ArrayList) term2152).add(term2163);
        ((ArrayList) term2152).add(term2172);
        ((ArrayList) term2152).add(term2181);
        ((ArrayList) term2152).add(term2190);
        ((ArrayList) term2152).add(term2199);
        term2125 = newInstance(Class.forName("loliSnatcher.DanbooruHandler"));
        setField(term2125, term2125.getClass(), "baseURL", "YpJbIgJWWv");
        setIntField(term2125, term2125.getClass(), "pageNum", -615654495);
        setIntField(term2125, term2125.getClass(), "limit", -1476117762);
        setField(term2125, term2125.getClass(), "prevTags", "JppkknKVOw");
        setField(term2125, term2125.getClass(), "fetched", term2152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.DanbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GrqozDKFOk";
        callMethod(klass, "getTags", argTypes, term2125, args);
    }

};


