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

public class LocalbooruHandler_getSampleURL_9209046877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6138;

    public LocalbooruHandler_getSampleURL_9209046877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6167 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6167, term6167.getClass(), "fileURL", "");
        setField(term6167, term6167.getClass(), "sampleURL", "");
        setField(term6167, term6167.getClass(), "thumbnailURL", "");
        setField(term6167, term6167.getClass(), "tags", "");
        setField(term6167, term6167.getClass(), "postURL", "");
        setIntField(term6167, term6167.getClass(), "id", -266625190);
        setIntField(term6167, term6167.getClass(), "width", 489201218);
        setIntField(term6167, term6167.getClass(), "height", 464181937);
        Object term6176 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6176, term6176.getClass(), "fileURL", "");
        setField(term6176, term6176.getClass(), "sampleURL", "");
        setField(term6176, term6176.getClass(), "thumbnailURL", "");
        setField(term6176, term6176.getClass(), "tags", "");
        setField(term6176, term6176.getClass(), "postURL", "");
        setIntField(term6176, term6176.getClass(), "id", -1455526612);
        setIntField(term6176, term6176.getClass(), "width", -941356098);
        setIntField(term6176, term6176.getClass(), "height", -201517446);
        Object term6185 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6185, term6185.getClass(), "fileURL", "");
        setField(term6185, term6185.getClass(), "sampleURL", "");
        setField(term6185, term6185.getClass(), "thumbnailURL", "");
        setField(term6185, term6185.getClass(), "tags", "");
        setField(term6185, term6185.getClass(), "postURL", "");
        setIntField(term6185, term6185.getClass(), "id", -97742366);
        setIntField(term6185, term6185.getClass(), "width", 1638851942);
        setIntField(term6185, term6185.getClass(), "height", 1374790203);
        ArrayList term6165 = new ArrayList();
        ((ArrayList) term6165).add(term6167);
        ((ArrayList) term6165).add(term6176);
        ((ArrayList) term6165).add(term6185);
        term6138 = newInstance(Class.forName("loliSnatcher.LocalbooruHandler"));
        setField(term6138, term6138.getClass(), "baseURL", "ktKcSZiuGM");
        setIntField(term6138, term6138.getClass(), "pageNum", 752152965);
        setIntField(term6138, term6138.getClass(), "limit", -1577069773);
        setField(term6138, term6138.getClass(), "prevTags", "PSOttyUeqv");
        setField(term6138, term6138.getClass(), "fetched", term6165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.LocalbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mrMGwoRgVY";
        callMethod(klass, "getSampleURL", argTypes, term6138, args);
    }

};


