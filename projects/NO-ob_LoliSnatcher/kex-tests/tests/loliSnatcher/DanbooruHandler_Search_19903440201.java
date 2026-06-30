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

public class DanbooruHandler_Search_19903440201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1638;

    public DanbooruHandler_Search_19903440201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1667 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1667, term1667.getClass(), "fileURL", "");
        setField(term1667, term1667.getClass(), "sampleURL", "");
        setField(term1667, term1667.getClass(), "thumbnailURL", "");
        setField(term1667, term1667.getClass(), "tags", "");
        setField(term1667, term1667.getClass(), "postURL", "");
        setIntField(term1667, term1667.getClass(), "id", -1786399638);
        setIntField(term1667, term1667.getClass(), "width", 2055867847);
        setIntField(term1667, term1667.getClass(), "height", -1048298087);
        Object term1676 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1676, term1676.getClass(), "fileURL", "");
        setField(term1676, term1676.getClass(), "sampleURL", "");
        setField(term1676, term1676.getClass(), "thumbnailURL", "");
        setField(term1676, term1676.getClass(), "tags", "");
        setField(term1676, term1676.getClass(), "postURL", "");
        setIntField(term1676, term1676.getClass(), "id", 292681826);
        setIntField(term1676, term1676.getClass(), "width", 458147407);
        setIntField(term1676, term1676.getClass(), "height", -184153539);
        Object term1685 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1685, term1685.getClass(), "fileURL", "");
        setField(term1685, term1685.getClass(), "sampleURL", "");
        setField(term1685, term1685.getClass(), "thumbnailURL", "");
        setField(term1685, term1685.getClass(), "tags", "");
        setField(term1685, term1685.getClass(), "postURL", "");
        setIntField(term1685, term1685.getClass(), "id", 493620644);
        setIntField(term1685, term1685.getClass(), "width", 1328271830);
        setIntField(term1685, term1685.getClass(), "height", 1596070772);
        ArrayList term1665 = new ArrayList();
        ((ArrayList) term1665).add(term1667);
        ((ArrayList) term1665).add(term1676);
        ((ArrayList) term1665).add(term1685);
        term1638 = newInstance(Class.forName("loliSnatcher.DanbooruHandler"));
        setField(term1638, term1638.getClass(), "baseURL", "xOcJIiQQDu");
        setIntField(term1638, term1638.getClass(), "pageNum", 1632125673);
        setIntField(term1638, term1638.getClass(), "limit", 454281060);
        setField(term1638, term1638.getClass(), "prevTags", "GVizqqzXpy");
        setField(term1638, term1638.getClass(), "fetched", term1665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.DanbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZVecLZMLHF";
        callMethod(klass, "Search", argTypes, term1638, args);
    }

};


