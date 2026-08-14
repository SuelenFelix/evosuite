package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Reply_hashCode_15404401317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8805;

    public Reply_hashCode_15404401317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9052 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term9051 = ((Class) term9052).getDeclaredField((String) "USER");
        ((Field) term9051).setAccessible(true);
        Object enum20 = ((Field) term9051).get((Object) null);
        Object term8904 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term8904, term8904.getClass(), "id", -1813280137);
        setField(term8904, term8904.getClass(), "content", null);
        setField(term8904, term8904.getClass(), "board", null);
        setField(term8904, term8904.getClass(), "user", null);
        setField(term8904, term8904.getClass(), "createDate", null);
        Object term8906 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term8906, term8906.getClass(), "id", 0);
        setField(term8906, term8906.getClass(), "content", null);
        setField(term8906, term8906.getClass(), "board", null);
        setField(term8906, term8906.getClass(), "user", null);
        setField(term8906, term8906.getClass(), "createDate", null);
        Object term8908 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term8908, term8908.getClass(), "id", 1303442927);
        setField(term8908, term8908.getClass(), "content", null);
        setField(term8908, term8908.getClass(), "board", null);
        setField(term8908, term8908.getClass(), "user", null);
        setField(term8908, term8908.getClass(), "createDate", null);
        Object term8910 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term8910, term8910.getClass(), "id", 0);
        setField(term8910, term8910.getClass(), "content", null);
        setField(term8910, term8910.getClass(), "board", null);
        setField(term8910, term8910.getClass(), "user", null);
        setField(term8910, term8910.getClass(), "createDate", null);
        Object term8912 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term8912, term8912.getClass(), "id", 0);
        setField(term8912, term8912.getClass(), "content", null);
        setField(term8912, term8912.getClass(), "board", null);
        setField(term8912, term8912.getClass(), "user", null);
        setField(term8912, term8912.getClass(), "createDate", null);
        Object term8914 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term8914, term8914.getClass(), "id", -1667482829);
        setField(term8914, term8914.getClass(), "content", null);
        setField(term8914, term8914.getClass(), "board", null);
        setField(term8914, term8914.getClass(), "user", null);
        setField(term8914, term8914.getClass(), "createDate", null);
        ArrayList term8902 = new ArrayList();
        ((ArrayList) term8902).add(term8904);
        ((ArrayList) term8902).add(term8906);
        ((ArrayList) term8902).add(term8908);
        ((ArrayList) term8902).add(term8910);
        ((ArrayList) term8902).add(term8906);
        ((ArrayList) term8902).add(term8912);
        ((ArrayList) term8902).add(term8914);
        ((ArrayList) term8902).add(term8908);
        term8805 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term8819 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term8846 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term8899 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term8918 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8923 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8928 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term8978 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term8981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8986 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term8805, term8805.getClass(), "id", 1209799204);
        setField(term8805, term8805.getClass(), "content", "POPYycoDBy");
        setIntField(term8819, term8819.getClass(), "id", 1094107751);
        setField(term8819, term8819.getClass(), "title", "LuWMOXdAPA");
        setField(term8819, term8819.getClass(), "content", "blSffTnsOv");
        setIntField(term8819, term8819.getClass(), "count", 844222656);
        setIntField(term8846, term8846.getClass(), "id", -18216811);
        setField(term8846, term8846.getClass(), "username", "qbUMcIvEXH");
        setField(term8846, term8846.getClass(), "password", "TVxGTjeDcu");
        setField(term8846, term8846.getClass(), "email", "ABPtcyCzkR");
        setField(term8846, term8846.getClass(), "role", enum20);
        setField(term8846, term8846.getClass(), "oauth", "QgHhxMyKvr");
        setIntField(term8899, term8899.getClass(), "nanos", 678000000);
        setLongField(term8899, term8899.getClass(), "fastTime", 1616822668000L);
        setField(term8899, term8899.getClass(), "cdate", null);
        setField(term8846, term8846.getClass(), "createDate", term8899);
        setField(term8819, term8819.getClass(), "user", term8846);
        setField(term8819, term8819.getClass(), "replys", term8902);
        setIntField(term8919, term8919.getClass(), "year", 2029);
        setShortField(term8919, term8919.getClass(), "month", (short) 6);
        setShortField(term8919, term8919.getClass(), "day", (short) 4);
        setField(term8918, term8918.getClass(), "date", term8919);
        setByteField(term8923, term8923.getClass(), "hour", (byte) 22);
        setByteField(term8923, term8923.getClass(), "minute", (byte) 1);
        setByteField(term8923, term8923.getClass(), "second", (byte) 38);
        setIntField(term8923, term8923.getClass(), "nano", 329228491);
        setField(term8918, term8918.getClass(), "time", term8923);
        setField(term8819, term8819.getClass(), "createDate", term8918);
        setField(term8805, term8805.getClass(), "board", term8819);
        setIntField(term8928, term8928.getClass(), "id", -100825168);
        setField(term8928, term8928.getClass(), "username", "wUcSfItZgv");
        setField(term8928, term8928.getClass(), "password", "rOfPCPHmtJ");
        setField(term8928, term8928.getClass(), "email", "EnmiAvfpJv");
        setField(term8928, term8928.getClass(), "role", enum20);
        setField(term8928, term8928.getClass(), "oauth", "AdYzLPMcwe");
        setIntField(term8978, term8978.getClass(), "nanos", 249000000);
        setLongField(term8978, term8978.getClass(), "fastTime", 1695459581000L);
        setField(term8978, term8978.getClass(), "cdate", null);
        setField(term8928, term8928.getClass(), "createDate", term8978);
        setField(term8805, term8805.getClass(), "user", term8928);
        setIntField(term8982, term8982.getClass(), "year", 2027);
        setShortField(term8982, term8982.getClass(), "month", (short) 5);
        setShortField(term8982, term8982.getClass(), "day", (short) 2);
        setField(term8981, term8981.getClass(), "date", term8982);
        setByteField(term8986, term8986.getClass(), "hour", (byte) 6);
        setByteField(term8986, term8986.getClass(), "minute", (byte) 10);
        setByteField(term8986, term8986.getClass(), "second", (byte) 19);
        setIntField(term8986, term8986.getClass(), "nano", 422884120);
        setField(term8981, term8981.getClass(), "time", term8986);
        setField(term8805, term8805.getClass(), "createDate", term8981);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8805, args);
    }

};


