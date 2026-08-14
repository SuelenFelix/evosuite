package com.github.cuteluobo.livedanmuarchive.utils.reader;

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
import static com.github.cuteluobo.livedanmuarchive.utils.reader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class SqliteDanMuReader_conventList_15939341358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404;

    public SqliteDanMuReader_conventList_15939341358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term408 = new Long(-484994522244390100L);
        Integer term410 = new Integer(1622346318);
        Integer term424 = new Integer(1048535127);
        Integer term426 = new Integer(-655067527);
        Long term428 = new Long(1233889271256172047L);
        Object term407 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term407, term407.getClass(), "id", term408);
        setField(term407, term407.getClass(), "userId", term410);
        setField(term407, term407.getClass(), "data", "MxlszYVzRf");
        setField(term407, term407.getClass(), "format", term424);
        setField(term407, term407.getClass(), "type", term426);
        setField(term407, term407.getClass(), "createTime", term428);
        setField(term407, term407.getClass(), "createTimeText", "LQFpaHEwXR");
        Long term444 = new Long(6617340557564669657L);
        Integer term446 = new Integer(-6029667);
        Integer term449 = new Integer(-2068769794);
        Integer term451 = new Integer(-117576464);
        Long term453 = new Long(1439298019805881866L);
        Object term443 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term443, term443.getClass(), "id", term444);
        setField(term443, term443.getClass(), "userId", term446);
        setField(term443, term443.getClass(), "data", "");
        setField(term443, term443.getClass(), "format", term449);
        setField(term443, term443.getClass(), "type", term451);
        setField(term443, term443.getClass(), "createTime", term453);
        setField(term443, term443.getClass(), "createTimeText", "");
        Long term458 = new Long(-8708192233349544946L);
        Integer term460 = new Integer(-1007160944);
        Integer term462 = new Integer(1135664017);
        Integer term464 = new Integer(590364439);
        Long term466 = new Long(5907001541142728739L);
        Object term457 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term457, term457.getClass(), "id", term458);
        setField(term457, term457.getClass(), "userId", term460);
        setField(term457, term457.getClass(), "data", null);
        setField(term457, term457.getClass(), "format", term462);
        setField(term457, term457.getClass(), "type", term464);
        setField(term457, term457.getClass(), "createTime", term466);
        setField(term457, term457.getClass(), "createTimeText", null);
        term404 = new LinkedList();
        ((LinkedList) term404).add(term407);
        ((LinkedList) term404).add(term443);
        ((LinkedList) term404).add(term457);
        ((LinkedList) term404).add((Object)null);
        ((LinkedList) term404).add((Object)null);
        ((LinkedList) term404).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.reader.SqliteDanMuReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term404;
        callMethod(klass, "conventList", argTypes, null, args);
    }

};


