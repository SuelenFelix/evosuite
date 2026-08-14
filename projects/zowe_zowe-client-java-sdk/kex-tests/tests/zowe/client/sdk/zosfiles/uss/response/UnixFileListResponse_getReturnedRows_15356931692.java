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

public class UnixFileListResponse_getReturnedRows_15356931692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term649;

    public UnixFileListResponse_getReturnedRows_15356931692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term650 = new Integer(-1339778481);
        Integer term652 = new Integer(1725571209);
        Integer term654 = new Integer(-522618178);
        Long term661 = new Long(1457594663983990440L);
        Long term663 = new Long(3452833434644634217L);
        Long term666 = new Long(-8603648071751666348L);
        Object term658 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term658, term658.getClass(), "name", "");
        setField(term658, term658.getClass(), "mode", "");
        setField(term658, term658.getClass(), "size", term661);
        setField(term658, term658.getClass(), "uid", term663);
        setField(term658, term658.getClass(), "user", "");
        setField(term658, term658.getClass(), "gid", term666);
        setField(term658, term658.getClass(), "group", "");
        setField(term658, term658.getClass(), "mtime", "");
        setField(term658, term658.getClass(), "target", "");
        ArrayList term656 = new ArrayList();
        ((ArrayList) term656).add(term658);
        term649 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.response.UnixFileListResponse"));
        setField(term649, term649.getClass(), "jsonVersion", term650);
        setField(term649, term649.getClass(), "returnedRows", term652);
        setField(term649, term649.getClass(), "totalRows", term654);
        setField(term649, term649.getClass(), "items", term656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.response.UnixFileListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReturnedRows", argTypes, term649, args);
    }

};


