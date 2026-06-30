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

public class LocalbooruHandler_getWidth_158393143512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6719;

    public LocalbooruHandler_getWidth_158393143512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6748 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6748, term6748.getClass(), "fileURL", "");
        setField(term6748, term6748.getClass(), "sampleURL", "");
        setField(term6748, term6748.getClass(), "thumbnailURL", "");
        setField(term6748, term6748.getClass(), "tags", "");
        setField(term6748, term6748.getClass(), "postURL", "");
        setIntField(term6748, term6748.getClass(), "id", 213831054);
        setIntField(term6748, term6748.getClass(), "width", 330043745);
        setIntField(term6748, term6748.getClass(), "height", -509349195);
        Object term6757 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6757, term6757.getClass(), "fileURL", "");
        setField(term6757, term6757.getClass(), "sampleURL", "");
        setField(term6757, term6757.getClass(), "thumbnailURL", "");
        setField(term6757, term6757.getClass(), "tags", "");
        setField(term6757, term6757.getClass(), "postURL", "");
        setIntField(term6757, term6757.getClass(), "id", -1639041228);
        setIntField(term6757, term6757.getClass(), "width", 2027686272);
        setIntField(term6757, term6757.getClass(), "height", -1494356104);
        ArrayList term6746 = new ArrayList();
        ((ArrayList) term6746).add(term6748);
        ((ArrayList) term6746).add(term6757);
        term6719 = newInstance(Class.forName("loliSnatcher.LocalbooruHandler"));
        setField(term6719, term6719.getClass(), "baseURL", "qMKmSzOQXg");
        setIntField(term6719, term6719.getClass(), "pageNum", 1207142014);
        setIntField(term6719, term6719.getClass(), "limit", -876426634);
        setField(term6719, term6719.getClass(), "prevTags", "CURQCMkqbZ");
        setField(term6719, term6719.getClass(), "fetched", term6746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.LocalbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uuSYOUCVHU";
        callMethod(klass, "getWidth", argTypes, term6719, args);
    }

};


