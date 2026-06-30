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

public class DanbooruHandler_getItems_12794404272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1738;

    public DanbooruHandler_getItems_12794404272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1767 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1767, term1767.getClass(), "fileURL", "");
        setField(term1767, term1767.getClass(), "sampleURL", "");
        setField(term1767, term1767.getClass(), "thumbnailURL", "");
        setField(term1767, term1767.getClass(), "tags", "");
        setField(term1767, term1767.getClass(), "postURL", "");
        setIntField(term1767, term1767.getClass(), "id", -2095575670);
        setIntField(term1767, term1767.getClass(), "width", 1225272962);
        setIntField(term1767, term1767.getClass(), "height", 1324040357);
        Object term1776 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1776, term1776.getClass(), "fileURL", "");
        setField(term1776, term1776.getClass(), "sampleURL", "");
        setField(term1776, term1776.getClass(), "thumbnailURL", "");
        setField(term1776, term1776.getClass(), "tags", "");
        setField(term1776, term1776.getClass(), "postURL", "");
        setIntField(term1776, term1776.getClass(), "id", -1588772968);
        setIntField(term1776, term1776.getClass(), "width", -93135961);
        setIntField(term1776, term1776.getClass(), "height", -112921587);
        Object term1785 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1785, term1785.getClass(), "fileURL", "");
        setField(term1785, term1785.getClass(), "sampleURL", "");
        setField(term1785, term1785.getClass(), "thumbnailURL", "");
        setField(term1785, term1785.getClass(), "tags", "");
        setField(term1785, term1785.getClass(), "postURL", "");
        setIntField(term1785, term1785.getClass(), "id", 933028652);
        setIntField(term1785, term1785.getClass(), "width", 287287233);
        setIntField(term1785, term1785.getClass(), "height", 962840079);
        Object term1794 = newInstance(Class.forName("loliSnatcher.BooruItem"));
        setField(term1794, term1794.getClass(), "fileURL", "");
        setField(term1794, term1794.getClass(), "sampleURL", "");
        setField(term1794, term1794.getClass(), "thumbnailURL", "");
        setField(term1794, term1794.getClass(), "tags", "");
        setField(term1794, term1794.getClass(), "postURL", "");
        setIntField(term1794, term1794.getClass(), "id", 1540719661);
        setIntField(term1794, term1794.getClass(), "width", 1265463001);
        setIntField(term1794, term1794.getClass(), "height", 335112684);
        ArrayList term1765 = new ArrayList();
        ((ArrayList) term1765).add(term1767);
        ((ArrayList) term1765).add(term1776);
        ((ArrayList) term1765).add(term1785);
        ((ArrayList) term1765).add(term1794);
        term1738 = newInstance(Class.forName("loliSnatcher.DanbooruHandler"));
        setField(term1738, term1738.getClass(), "baseURL", "fztQhjqwdP");
        setIntField(term1738, term1738.getClass(), "pageNum", 97029295);
        setIntField(term1738, term1738.getClass(), "limit", -1371869594);
        setField(term1738, term1738.getClass(), "prevTags", "eVpkWxjuki");
        setField(term1738, term1738.getClass(), "fetched", term1765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.DanbooruHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.net.ssl.HttpsURLConnection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getItems", argTypes, term1738, args);
    }

};


