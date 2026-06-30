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

public class MoebooruHandler_Search_15764528981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public MoebooruHandler_Search_15764528981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term79 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term79, term79.getClass(), "fileURL", "");
        setField(term79, term79.getClass(), "sampleURL", "");
        setField(term79, term79.getClass(), "thumbnailURL", "");
        setField(term79, term79.getClass(), "tags", "");
        setField(term79, term79.getClass(), "postURL", "");
        setIntField(term79, term79.getClass(), "id", -1922583790);
        setIntField(term79, term79.getClass(), "width", -616727354);
        setIntField(term79, term79.getClass(), "height", -1955890973);
        Object term88 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term88, term88.getClass(), "fileURL", "");
        setField(term88, term88.getClass(), "sampleURL", "");
        setField(term88, term88.getClass(), "thumbnailURL", "");
        setField(term88, term88.getClass(), "tags", "");
        setField(term88, term88.getClass(), "postURL", "");
        setIntField(term88, term88.getClass(), "id", -2038273078);
        setIntField(term88, term88.getClass(), "width", 1227103734);
        setIntField(term88, term88.getClass(), "height", -1339778481);
        Object term97 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term97, term97.getClass(), "fileURL", "");
        setField(term97, term97.getClass(), "sampleURL", "");
        setField(term97, term97.getClass(), "thumbnailURL", "");
        setField(term97, term97.getClass(), "tags", "");
        setField(term97, term97.getClass(), "postURL", "");
        setIntField(term97, term97.getClass(), "id", 1725571209);
        setIntField(term97, term97.getClass(), "width", -522618178);
        setIntField(term97, term97.getClass(), "height", 1134449235);
        Object term106 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term106, term106.getClass(), "fileURL", "");
        setField(term106, term106.getClass(), "sampleURL", "");
        setField(term106, term106.getClass(), "thumbnailURL", "");
        setField(term106, term106.getClass(), "tags", "");
        setField(term106, term106.getClass(), "postURL", "");
        setIntField(term106, term106.getClass(), "id", -883034806);
        setIntField(term106, term106.getClass(), "width", 1585847225);
        setIntField(term106, term106.getClass(), "height", 597278769);
        Object term115 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term115, term115.getClass(), "fileURL", "");
        setField(term115, term115.getClass(), "sampleURL", "");
        setField(term115, term115.getClass(), "thumbnailURL", "");
        setField(term115, term115.getClass(), "tags", "");
        setField(term115, term115.getClass(), "postURL", "");
        setIntField(term115, term115.getClass(), "id", -1685132342);
        setIntField(term115, term115.getClass(), "width", -1456670397);
        setIntField(term115, term115.getClass(), "height", 1622346318);
        ArrayList term77 = new ArrayList();
        ((ArrayList) term77).add(term79);
        ((ArrayList) term77).add(term88);
        ((ArrayList) term77).add(term97);
        ((ArrayList) term77).add(term106);
        ((ArrayList) term77).add(term115);
        term25 = newInstance(Class.forName("loliSnatcher.MoebooruHandler"));
        setIntField(term25, term25.getClass(), "pageNum", 1484323161);
        setField(term25, term25.getClass(), "apiKey", "sjlJAEtRrb");
        setField(term25, term25.getClass(), "userID", "MuLcgQHgqz");
        setField(term25, term25.getClass(), "baseURL", "xxtlPwDYFs");
        setIntField(term25, term25.getClass(), "limit", 391863371);
        setField(term25, term25.getClass(), "prevTags", "jJCZpVmanW");
        setField(term25, term25.getClass(), "fetched", term77);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.MoebooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWDIEULEFu";
        callMethod(klass, "Search", argTypes, term25, args);
    }

};


