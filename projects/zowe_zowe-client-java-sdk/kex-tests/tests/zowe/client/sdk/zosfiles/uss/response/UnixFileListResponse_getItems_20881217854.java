package zowe.client.sdk.zosfiles.uss.response;

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
import static zowe.client.sdk.zosfiles.uss.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class UnixFileListResponse_getItems_20881217854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term762;

    public UnixFileListResponse_getItems_20881217854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term763 = new Integer(597278769);
        Integer term765 = new Integer(-1685132342);
        Integer term767 = new Integer(-1456670397);
        Long term774 = new Long(-8614778293741404325L);
        Long term776 = new Long(-5447369594017685765L);
        Long term779 = new Long(-5724112525188606013L);
        Object term771 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term771, term771.getClass(), "name", "");
        setField(term771, term771.getClass(), "mode", "");
        setField(term771, term771.getClass(), "size", term774);
        setField(term771, term771.getClass(), "uid", term776);
        setField(term771, term771.getClass(), "user", "");
        setField(term771, term771.getClass(), "gid", term779);
        setField(term771, term771.getClass(), "group", "");
        setField(term771, term771.getClass(), "mtime", "");
        setField(term771, term771.getClass(), "target", "");
        Long term787 = new Long(-6100012593724108983L);
        Long term789 = new Long(5465527210299101732L);
        Long term792 = new Long(4699157009689333952L);
        Object term784 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term784, term784.getClass(), "name", "");
        setField(term784, term784.getClass(), "mode", "");
        setField(term784, term784.getClass(), "size", term787);
        setField(term784, term784.getClass(), "uid", term789);
        setField(term784, term784.getClass(), "user", "");
        setField(term784, term784.getClass(), "gid", term792);
        setField(term784, term784.getClass(), "group", "");
        setField(term784, term784.getClass(), "mtime", "");
        setField(term784, term784.getClass(), "target", "");
        ArrayList term769 = new ArrayList();
        ((ArrayList) term769).add(term771);
        ((ArrayList) term769).add(term784);
        term762 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.response.UnixFileListResponse"));
        setField(term762, term762.getClass(), "jsonVersion", term763);
        setField(term762, term762.getClass(), "returnedRows", term765);
        setField(term762, term762.getClass(), "totalRows", term767);
        setField(term762, term762.getClass(), "items", term769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.response.UnixFileListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItems", argTypes, term762, args);
    }

};


