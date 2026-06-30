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

public class LocalbooruHandler_getPostURL_89369261510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6465;

    public LocalbooruHandler_getPostURL_89369261510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6494 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6494, term6494.getClass(), "fileURL", "");
        setField(term6494, term6494.getClass(), "sampleURL", "");
        setField(term6494, term6494.getClass(), "thumbnailURL", "");
        setField(term6494, term6494.getClass(), "tags", "");
        setField(term6494, term6494.getClass(), "postURL", "");
        setIntField(term6494, term6494.getClass(), "id", -1724487863);
        setIntField(term6494, term6494.getClass(), "width", -128490829);
        setIntField(term6494, term6494.getClass(), "height", 202214133);
        Object term6503 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6503, term6503.getClass(), "fileURL", "");
        setField(term6503, term6503.getClass(), "sampleURL", "");
        setField(term6503, term6503.getClass(), "thumbnailURL", "");
        setField(term6503, term6503.getClass(), "tags", "");
        setField(term6503, term6503.getClass(), "postURL", "");
        setIntField(term6503, term6503.getClass(), "id", 1543091617);
        setIntField(term6503, term6503.getClass(), "width", -763166094);
        setIntField(term6503, term6503.getClass(), "height", -222941705);
        Object term6512 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6512, term6512.getClass(), "fileURL", "");
        setField(term6512, term6512.getClass(), "sampleURL", "");
        setField(term6512, term6512.getClass(), "thumbnailURL", "");
        setField(term6512, term6512.getClass(), "tags", "");
        setField(term6512, term6512.getClass(), "postURL", "");
        setIntField(term6512, term6512.getClass(), "id", 291864719);
        setIntField(term6512, term6512.getClass(), "width", -1549607466);
        setIntField(term6512, term6512.getClass(), "height", 853609788);
        Object term6521 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6521, term6521.getClass(), "fileURL", "");
        setField(term6521, term6521.getClass(), "sampleURL", "");
        setField(term6521, term6521.getClass(), "thumbnailURL", "");
        setField(term6521, term6521.getClass(), "tags", "");
        setField(term6521, term6521.getClass(), "postURL", "");
        setIntField(term6521, term6521.getClass(), "id", -197820800);
        setIntField(term6521, term6521.getClass(), "width", 723812297);
        setIntField(term6521, term6521.getClass(), "height", 1639448749);
        Object term6530 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6530, term6530.getClass(), "fileURL", "");
        setField(term6530, term6530.getClass(), "sampleURL", "");
        setField(term6530, term6530.getClass(), "thumbnailURL", "");
        setField(term6530, term6530.getClass(), "tags", "");
        setField(term6530, term6530.getClass(), "postURL", "");
        setIntField(term6530, term6530.getClass(), "id", 873659088);
        setIntField(term6530, term6530.getClass(), "width", -975748721);
        setIntField(term6530, term6530.getClass(), "height", 433248783);
        Object term6539 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term6539, term6539.getClass(), "fileURL", "");
        setField(term6539, term6539.getClass(), "sampleURL", "");
        setField(term6539, term6539.getClass(), "thumbnailURL", "");
        setField(term6539, term6539.getClass(), "tags", "");
        setField(term6539, term6539.getClass(), "postURL", "");
        setIntField(term6539, term6539.getClass(), "id", -507944154);
        setIntField(term6539, term6539.getClass(), "width", -1736183862);
        setIntField(term6539, term6539.getClass(), "height", 897010381);
        ArrayList term6492 = new ArrayList();
        ((ArrayList) term6492).add(term6494);
        ((ArrayList) term6492).add(term6503);
        ((ArrayList) term6492).add(term6512);
        ((ArrayList) term6492).add(term6521);
        ((ArrayList) term6492).add(term6530);
        ((ArrayList) term6492).add(term6539);
        term6465 = newInstance(Class.forName("loliSnatcher.LocalbooruHandler"));
        setField(term6465, term6465.getClass(), "baseURL", "pOuFRlHmbK");
        setIntField(term6465, term6465.getClass(), "pageNum", 243280944);
        setIntField(term6465, term6465.getClass(), "limit", -726681073);
        setField(term6465, term6465.getClass(), "prevTags", "WrzdBkinqV");
        setField(term6465, term6465.getClass(), "fetched", term6492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.LocalbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oYymmLqbfJ";
        callMethod(klass, "getPostURL", argTypes, term6465, args);
    }

};


