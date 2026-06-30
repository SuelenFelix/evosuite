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

public class GelbooruHandler_getHeight_10455609079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5112;

    public GelbooruHandler_getHeight_10455609079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5165 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5165, term5165.getClass(), "fileURL", "");
        setField(term5165, term5165.getClass(), "sampleURL", "");
        setField(term5165, term5165.getClass(), "thumbnailURL", "");
        setField(term5165, term5165.getClass(), "tags", "");
        setField(term5165, term5165.getClass(), "postURL", "");
        setIntField(term5165, term5165.getClass(), "id", 2007134147);
        setIntField(term5165, term5165.getClass(), "width", 993388358);
        setIntField(term5165, term5165.getClass(), "height", -765191335);
        Object term5174 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term5174, term5174.getClass(), "fileURL", "");
        setField(term5174, term5174.getClass(), "sampleURL", "");
        setField(term5174, term5174.getClass(), "thumbnailURL", "");
        setField(term5174, term5174.getClass(), "tags", "");
        setField(term5174, term5174.getClass(), "postURL", "");
        setIntField(term5174, term5174.getClass(), "id", -1697741155);
        setIntField(term5174, term5174.getClass(), "width", 1295839803);
        setIntField(term5174, term5174.getClass(), "height", -1891015523);
        ArrayList term5163 = new ArrayList();
        ((ArrayList) term5163).add(term5165);
        ((ArrayList) term5163).add(term5174);
        term5112 = newInstance(Class.forName("loliSnatcher.GelbooruHandler"));
        setField(term5112, term5112.getClass(), "apiKey", "PNoWXrsFic");
        setField(term5112, term5112.getClass(), "userID", "QZBHZqZope");
        setField(term5112, term5112.getClass(), "baseURL", "VBUahCvyxC");
        setIntField(term5112, term5112.getClass(), "pageNum", -310648604);
        setIntField(term5112, term5112.getClass(), "limit", -648200466);
        setField(term5112, term5112.getClass(), "prevTags", "MlzTkzKMCX");
        setField(term5112, term5112.getClass(), "fetched", term5163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.GelbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ONcbPCQnHd";
        callMethod(klass, "getHeight", argTypes, term5112, args);
    }

};


