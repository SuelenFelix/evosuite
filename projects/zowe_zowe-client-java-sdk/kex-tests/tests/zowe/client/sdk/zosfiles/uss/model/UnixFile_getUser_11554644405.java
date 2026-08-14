package zowe.client.sdk.zosfiles.uss.model;

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
import static zowe.client.sdk.zosfiles.uss.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UnixFile_getUser_11554644405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3702;

    public UnixFile_getUser_11554644405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3727 = new Long(5330761990446327930L);
        Long term3729 = new Long(-3954795081650780841L);
        Long term3743 = new Long(3288791194263207397L);
        term3702 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term3702, term3702.getClass(), "name", "WHcwFgsGFC");
        setField(term3702, term3702.getClass(), "mode", "HzqpegHiRq");
        setField(term3702, term3702.getClass(), "size", term3727);
        setField(term3702, term3702.getClass(), "uid", term3729);
        setField(term3702, term3702.getClass(), "user", "jwsfVjMoJT");
        setField(term3702, term3702.getClass(), "gid", term3743);
        setField(term3702, term3702.getClass(), "group", "ZfdXfCCFDf");
        setField(term3702, term3702.getClass(), "mtime", "MwwjNtdOFT");
        setField(term3702, term3702.getClass(), "target", "VYkqXKVlAJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term3702, args);
    }

};


