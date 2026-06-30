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

public class GelbooruHandler_getTags_7865417086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4617;

    public GelbooruHandler_getTags_7865417086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4670 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4670, term4670.getClass(), "fileURL", "");
        setField(term4670, term4670.getClass(), "sampleURL", "");
        setField(term4670, term4670.getClass(), "thumbnailURL", "");
        setField(term4670, term4670.getClass(), "tags", "");
        setField(term4670, term4670.getClass(), "postURL", "");
        setIntField(term4670, term4670.getClass(), "id", -129547140);
        setIntField(term4670, term4670.getClass(), "width", 199287428);
        setIntField(term4670, term4670.getClass(), "height", -1195339592);
        Object term4679 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4679, term4679.getClass(), "fileURL", "");
        setField(term4679, term4679.getClass(), "sampleURL", "");
        setField(term4679, term4679.getClass(), "thumbnailURL", "");
        setField(term4679, term4679.getClass(), "tags", "");
        setField(term4679, term4679.getClass(), "postURL", "");
        setIntField(term4679, term4679.getClass(), "id", -376422566);
        setIntField(term4679, term4679.getClass(), "width", 306847454);
        setIntField(term4679, term4679.getClass(), "height", 1745276158);
        ArrayList term4668 = new ArrayList();
        ((ArrayList) term4668).add(term4670);
        ((ArrayList) term4668).add(term4679);
        term4617 = newInstance(Class.forName("loliSnatcher.GelbooruHandler"));
        setField(term4617, term4617.getClass(), "apiKey", "rwKoAngzCu");
        setField(term4617, term4617.getClass(), "userID", "VUkRVwROTl");
        setField(term4617, term4617.getClass(), "baseURL", "UDlkdccCRn");
        setIntField(term4617, term4617.getClass(), "pageNum", 515182546);
        setIntField(term4617, term4617.getClass(), "limit", -936895502);
        setField(term4617, term4617.getClass(), "prevTags", "McpzErOcYb");
        setField(term4617, term4617.getClass(), "fetched", term4668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.GelbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QNjNTLlUaV";
        callMethod(klass, "getTags", argTypes, term4617, args);
    }

};


