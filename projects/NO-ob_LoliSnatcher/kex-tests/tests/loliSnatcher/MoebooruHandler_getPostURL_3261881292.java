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

public class MoebooruHandler_getPostURL_3261881292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188;

    public MoebooruHandler_getPostURL_3261881292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term242 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term242, term242.getClass(), "fileURL", "");
        setField(term242, term242.getClass(), "sampleURL", "");
        setField(term242, term242.getClass(), "thumbnailURL", "");
        setField(term242, term242.getClass(), "tags", "");
        setField(term242, term242.getClass(), "postURL", "");
        setIntField(term242, term242.getClass(), "id", -2068769794);
        setIntField(term242, term242.getClass(), "width", -117576464);
        setIntField(term242, term242.getClass(), "height", -1007160944);
        Object term251 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term251, term251.getClass(), "fileURL", "");
        setField(term251, term251.getClass(), "sampleURL", "");
        setField(term251, term251.getClass(), "thumbnailURL", "");
        setField(term251, term251.getClass(), "tags", "");
        setField(term251, term251.getClass(), "postURL", "");
        setIntField(term251, term251.getClass(), "id", 1135664017);
        setIntField(term251, term251.getClass(), "width", 590364439);
        setIntField(term251, term251.getClass(), "height", 865208305);
        Object term260 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term260, term260.getClass(), "fileURL", "");
        setField(term260, term260.getClass(), "sampleURL", "");
        setField(term260, term260.getClass(), "thumbnailURL", "");
        setField(term260, term260.getClass(), "tags", "");
        setField(term260, term260.getClass(), "postURL", "");
        setIntField(term260, term260.getClass(), "id", -1275173084);
        setIntField(term260, term260.getClass(), "width", -244121226);
        setIntField(term260, term260.getClass(), "height", -203030934);
        Object term269 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term269, term269.getClass(), "fileURL", "");
        setField(term269, term269.getClass(), "sampleURL", "");
        setField(term269, term269.getClass(), "thumbnailURL", "");
        setField(term269, term269.getClass(), "tags", "");
        setField(term269, term269.getClass(), "postURL", "");
        setIntField(term269, term269.getClass(), "id", -1179120542);
        setIntField(term269, term269.getClass(), "width", -73683645);
        setIntField(term269, term269.getClass(), "height", -226514366);
        ArrayList term240 = new ArrayList();
        ((ArrayList) term240).add(term242);
        ((ArrayList) term240).add(term251);
        ((ArrayList) term240).add(term260);
        ((ArrayList) term240).add(term269);
        term188 = newInstance(Class.forName("loliSnatcher.MoebooruHandler"));
        setIntField(term188, term188.getClass(), "pageNum", -655067527);
        setField(term188, term188.getClass(), "apiKey", "dWRymuLBtr");
        setField(term188, term188.getClass(), "userID", "AijpHYOFuy");
        setField(term188, term188.getClass(), "baseURL", "SbAoxhfrkn");
        setIntField(term188, term188.getClass(), "limit", -6029667);
        setField(term188, term188.getClass(), "prevTags", "kuTXqwMtDB");
        setField(term188, term188.getClass(), "fetched", term240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.MoebooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YRHGsAkhxb";
        callMethod(klass, "getPostURL", argTypes, term188, args);
    }

};


