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

public class GelbooruHandler_getItems_18007722102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4117;

    public GelbooruHandler_getItems_18007722102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4170 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4170, term4170.getClass(), "fileURL", "");
        setField(term4170, term4170.getClass(), "sampleURL", "");
        setField(term4170, term4170.getClass(), "thumbnailURL", "");
        setField(term4170, term4170.getClass(), "tags", "");
        setField(term4170, term4170.getClass(), "postURL", "");
        setIntField(term4170, term4170.getClass(), "id", 1959097203);
        setIntField(term4170, term4170.getClass(), "width", -209654048);
        setIntField(term4170, term4170.getClass(), "height", 477625804);
        Object term4179 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4179, term4179.getClass(), "fileURL", "");
        setField(term4179, term4179.getClass(), "sampleURL", "");
        setField(term4179, term4179.getClass(), "thumbnailURL", "");
        setField(term4179, term4179.getClass(), "tags", "");
        setField(term4179, term4179.getClass(), "postURL", "");
        setIntField(term4179, term4179.getClass(), "id", 252575029);
        setIntField(term4179, term4179.getClass(), "width", 57189932);
        setIntField(term4179, term4179.getClass(), "height", 1460722225);
        ArrayList term4168 = new ArrayList();
        ((ArrayList) term4168).add(term4170);
        ((ArrayList) term4168).add(term4179);
        term4117 = newInstance(Class.forName("loliSnatcher.GelbooruHandler"));
        setField(term4117, term4117.getClass(), "apiKey", "UkKvaeJfEC");
        setField(term4117, term4117.getClass(), "userID", "WPxXsahPRq");
        setField(term4117, term4117.getClass(), "baseURL", "IENRuqmwUU");
        setIntField(term4117, term4117.getClass(), "pageNum", -130649791);
        setIntField(term4117, term4117.getClass(), "limit", 534834644);
        setField(term4117, term4117.getClass(), "prevTags", "GsWxOwXvSu");
        setField(term4117, term4117.getClass(), "fetched", term4168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.GelbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.net.ssl.HttpsURLConnection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getItems", argTypes, term4117, args);
    }

};


