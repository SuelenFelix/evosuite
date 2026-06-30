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

public class GelbooruHandler_Search_10898686171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3955;

    public GelbooruHandler_Search_10898686171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4008 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4008, term4008.getClass(), "fileURL", "");
        setField(term4008, term4008.getClass(), "sampleURL", "");
        setField(term4008, term4008.getClass(), "thumbnailURL", "");
        setField(term4008, term4008.getClass(), "tags", "");
        setField(term4008, term4008.getClass(), "postURL", "");
        setIntField(term4008, term4008.getClass(), "id", 388157121);
        setIntField(term4008, term4008.getClass(), "width", 1684998508);
        setIntField(term4008, term4008.getClass(), "height", -1476644457);
        Object term4017 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4017, term4017.getClass(), "fileURL", "");
        setField(term4017, term4017.getClass(), "sampleURL", "");
        setField(term4017, term4017.getClass(), "thumbnailURL", "");
        setField(term4017, term4017.getClass(), "tags", "");
        setField(term4017, term4017.getClass(), "postURL", "");
        setIntField(term4017, term4017.getClass(), "id", 1270666529);
        setIntField(term4017, term4017.getClass(), "width", -1146679443);
        setIntField(term4017, term4017.getClass(), "height", -860131894);
        Object term4026 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4026, term4026.getClass(), "fileURL", "");
        setField(term4026, term4026.getClass(), "sampleURL", "");
        setField(term4026, term4026.getClass(), "thumbnailURL", "");
        setField(term4026, term4026.getClass(), "tags", "");
        setField(term4026, term4026.getClass(), "postURL", "");
        setIntField(term4026, term4026.getClass(), "id", -1022990421);
        setIntField(term4026, term4026.getClass(), "width", 1045547089);
        setIntField(term4026, term4026.getClass(), "height", -1122880881);
        Object term4035 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4035, term4035.getClass(), "fileURL", "");
        setField(term4035, term4035.getClass(), "sampleURL", "");
        setField(term4035, term4035.getClass(), "thumbnailURL", "");
        setField(term4035, term4035.getClass(), "tags", "");
        setField(term4035, term4035.getClass(), "postURL", "");
        setIntField(term4035, term4035.getClass(), "id", -542712742);
        setIntField(term4035, term4035.getClass(), "width", -1254072822);
        setIntField(term4035, term4035.getClass(), "height", -1111249833);
        Object term4044 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term4044, term4044.getClass(), "fileURL", "");
        setField(term4044, term4044.getClass(), "sampleURL", "");
        setField(term4044, term4044.getClass(), "thumbnailURL", "");
        setField(term4044, term4044.getClass(), "tags", "");
        setField(term4044, term4044.getClass(), "postURL", "");
        setIntField(term4044, term4044.getClass(), "id", -1692331299);
        setIntField(term4044, term4044.getClass(), "width", 479531250);
        setIntField(term4044, term4044.getClass(), "height", 1320570890);
        ArrayList term4006 = new ArrayList();
        ((ArrayList) term4006).add(term4008);
        ((ArrayList) term4006).add(term4017);
        ((ArrayList) term4006).add(term4026);
        ((ArrayList) term4006).add(term4035);
        ((ArrayList) term4006).add(term4044);
        term3955 = newInstance(Class.forName("loliSnatcher.GelbooruHandler"));
        setField(term3955, term3955.getClass(), "apiKey", "bdyhHbDAmJ");
        setField(term3955, term3955.getClass(), "userID", "BBXiTNHqGE");
        setField(term3955, term3955.getClass(), "baseURL", "IEYhJmgCVd");
        setIntField(term3955, term3955.getClass(), "pageNum", -1618206977);
        setIntField(term3955, term3955.getClass(), "limit", -1747406163);
        setField(term3955, term3955.getClass(), "prevTags", "KSJeYkkvpk");
        setField(term3955, term3955.getClass(), "fetched", term4006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.GelbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vSeruUyNWX";
        callMethod(klass, "Search", argTypes, term3955, args);
    }

};


