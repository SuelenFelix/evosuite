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

public class Board_getReplys_10207204997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15637;

    public Board_getReplys_10207204997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15824 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term15823 = ((Class) term15824).getDeclaredField((String) "USER");
        ((Field) term15823).setAccessible(true);
        Object enum36 = ((Field) term15823).get((Object) null);
        Object term15727 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term15730 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term15733 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term15735 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term15727, term15727.getClass(), "id", 947449400);
        setField(term15727, term15727.getClass(), "content", "");
        setIntField(term15730, term15730.getClass(), "id", -763799087);
        setField(term15730, term15730.getClass(), "title", null);
        setField(term15730, term15730.getClass(), "content", null);
        setIntField(term15730, term15730.getClass(), "count", 1207142014);
        setField(term15730, term15730.getClass(), "user", null);
        setField(term15730, term15730.getClass(), "replys", null);
        setField(term15730, term15730.getClass(), "createDate", null);
        setField(term15727, term15727.getClass(), "board", term15730);
        setIntField(term15733, term15733.getClass(), "id", 0);
        setField(term15733, term15733.getClass(), "username", null);
        setField(term15733, term15733.getClass(), "password", null);
        setField(term15733, term15733.getClass(), "email", null);
        setField(term15733, term15733.getClass(), "role", null);
        setField(term15733, term15733.getClass(), "oauth", null);
        setField(term15733, term15733.getClass(), "createDate", null);
        setField(term15727, term15727.getClass(), "user", term15733);
        setField(term15735, term15735.getClass(), "date", null);
        setField(term15735, term15735.getClass(), "time", null);
        setField(term15727, term15727.getClass(), "createDate", term15735);
        Object term15736 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term15739 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term15742 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term15736, term15736.getClass(), "id", 633598642);
        setField(term15736, term15736.getClass(), "content", "");
        setIntField(term15739, term15739.getClass(), "id", 1862841859);
        setField(term15739, term15739.getClass(), "title", null);
        setField(term15739, term15739.getClass(), "content", null);
        setIntField(term15739, term15739.getClass(), "count", -1114668574);
        setField(term15739, term15739.getClass(), "user", null);
        setField(term15739, term15739.getClass(), "replys", null);
        setField(term15739, term15739.getClass(), "createDate", null);
        setField(term15736, term15736.getClass(), "board", term15739);
        setField(term15736, term15736.getClass(), "user", term15733);
        setField(term15742, term15742.getClass(), "date", null);
        setField(term15742, term15742.getClass(), "time", null);
        setField(term15736, term15736.getClass(), "createDate", term15742);
        Object term15743 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term15746 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term15749 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term15751 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term15743, term15743.getClass(), "id", 1713573821);
        setField(term15743, term15743.getClass(), "content", "");
        setIntField(term15746, term15746.getClass(), "id", 1956590498);
        setField(term15746, term15746.getClass(), "title", null);
        setField(term15746, term15746.getClass(), "content", null);
        setIntField(term15746, term15746.getClass(), "count", 1467356494);
        setField(term15746, term15746.getClass(), "user", null);
        setField(term15746, term15746.getClass(), "replys", null);
        setField(term15746, term15746.getClass(), "createDate", null);
        setField(term15743, term15743.getClass(), "board", term15746);
        setIntField(term15749, term15749.getClass(), "id", 0);
        setField(term15749, term15749.getClass(), "username", null);
        setField(term15749, term15749.getClass(), "password", null);
        setField(term15749, term15749.getClass(), "email", null);
        setField(term15749, term15749.getClass(), "role", null);
        setField(term15749, term15749.getClass(), "oauth", null);
        setField(term15749, term15749.getClass(), "createDate", null);
        setField(term15743, term15743.getClass(), "user", term15749);
        setField(term15751, term15751.getClass(), "date", null);
        setField(term15751, term15751.getClass(), "time", null);
        setField(term15743, term15743.getClass(), "createDate", term15751);
        Object term15752 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term15755 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term15758 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term15760 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term15752, term15752.getClass(), "id", 213831054);
        setField(term15752, term15752.getClass(), "content", "");
        setIntField(term15755, term15755.getClass(), "id", 330043745);
        setField(term15755, term15755.getClass(), "title", null);
        setField(term15755, term15755.getClass(), "content", null);
        setIntField(term15755, term15755.getClass(), "count", -509349195);
        setField(term15755, term15755.getClass(), "user", null);
        setField(term15755, term15755.getClass(), "replys", null);
        setField(term15755, term15755.getClass(), "createDate", null);
        setField(term15752, term15752.getClass(), "board", term15755);
        setIntField(term15758, term15758.getClass(), "id", -1639041228);
        setField(term15758, term15758.getClass(), "username", null);
        setField(term15758, term15758.getClass(), "password", null);
        setField(term15758, term15758.getClass(), "email", null);
        setField(term15758, term15758.getClass(), "role", enum36);
        setField(term15758, term15758.getClass(), "oauth", null);
        setField(term15758, term15758.getClass(), "createDate", null);
        setField(term15752, term15752.getClass(), "user", term15758);
        setField(term15760, term15760.getClass(), "date", null);
        setField(term15760, term15760.getClass(), "time", null);
        setField(term15752, term15752.getClass(), "createDate", term15760);
        ArrayList term15725 = new ArrayList();
        ((ArrayList) term15725).add(term15727);
        ((ArrayList) term15725).add(term15736);
        ((ArrayList) term15725).add(term15743);
        ((ArrayList) term15725).add(term15743);
        ((ArrayList) term15725).add(term15752);
        term15637 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term15664 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term15722 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term15763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15768 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term15637, term15637.getClass(), "id", -27944011);
        setField(term15637, term15637.getClass(), "title", "XjIOUIzJUP");
        setField(term15637, term15637.getClass(), "content", "iGTpXnnTqB");
        setIntField(term15637, term15637.getClass(), "count", -20614472);
        setIntField(term15664, term15664.getClass(), "id", 1126618861);
        setField(term15664, term15664.getClass(), "username", "XgJzBOYfQB");
        setField(term15664, term15664.getClass(), "password", "GAPGgDekVG");
        setField(term15664, term15664.getClass(), "email", "WmTogHwGLE");
        setField(term15664, term15664.getClass(), "role", enum36);
        setField(term15664, term15664.getClass(), "oauth", "qYOIXsGycY");
        setIntField(term15722, term15722.getClass(), "nanos", 11000000);
        setLongField(term15722, term15722.getClass(), "fastTime", 1668055372000L);
        setField(term15722, term15722.getClass(), "cdate", null);
        setField(term15664, term15664.getClass(), "createDate", term15722);
        setField(term15637, term15637.getClass(), "user", term15664);
        setField(term15637, term15637.getClass(), "replys", term15725);
        setIntField(term15764, term15764.getClass(), "year", 2024);
        setShortField(term15764, term15764.getClass(), "month", (short) 9);
        setShortField(term15764, term15764.getClass(), "day", (short) 7);
        setField(term15763, term15763.getClass(), "date", term15764);
        setByteField(term15768, term15768.getClass(), "hour", (byte) 2);
        setByteField(term15768, term15768.getClass(), "minute", (byte) 37);
        setByteField(term15768, term15768.getClass(), "second", (byte) 4);
        setIntField(term15768, term15768.getClass(), "nano", 236043949);
        setField(term15763, term15763.getClass(), "time", term15768);
        setField(term15637, term15637.getClass(), "createDate", term15763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReplys", argTypes, term15637, args);
    }

};


