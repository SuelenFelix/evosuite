package com.github.cuteluobo.livedanmuarchive.async;

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
import static com.github.cuteluobo.livedanmuarchive.async.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class AbstractDanMuSender_setSqliteDanMuReader_7966642569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2102;

    public AbstractDanMuSender_setSqliteDanMuReader_7966642569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2103 = new ArrayList();
        ((ArrayList) term2103).add((Object)null);
        ((ArrayList) term2103).add((Object)null);
        ((ArrayList) term2103).add((Object)null);
        ((ArrayList) term2103).add((Object)null);
        ((ArrayList) term2103).add((Object)null);
        ((ArrayList) term2103).add((Object)null);
        HashMap term2107 = new HashMap();
        HashMap term2117 = new HashMap();
        term2102 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader"));
        setField(term2102, term2102.getClass(), "danMuReaderList", term2103);
        setField(term2102, term2102.getClass(), "startTimeMap", term2107);
        setField(term2102, term2102.getClass(), "endTimeMap", term2117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.async.AbstractDanMuSender");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.BatchSqliteDanMuReader");
        Object[] args = new Object[1];
        args[0] = term2102;
        callMethod(klass, "setSqliteDanMuReader", argTypes, null, args);
    }

};


