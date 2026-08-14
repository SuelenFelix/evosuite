package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Post_PostBuilder_toString_69302198310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26951;

    public Post_PostBuilder_toString_69302198310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26952 = new Long(8505184530074334434L);
        Long term26954 = new Long(-1610129689783641208L);
        Class<? extends Object> term27018 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term27017 = ((Class) term27018).getDeclaredField((String) "IMAGE");
        ((Field) term27017).setAccessible(true);
        Object enum69 = ((Field) term27017).get((Object) null);
        Long term26979 = new Long(-2613029888948149747L);
        Long term26981 = new Long(-6418282217428803693L);
        Long term26983 = new Long(-5608790408657117046L);
        Long term26985 = new Long(-6265886087280835813L);
        Long term26987 = new Long(8408467837292297525L);
        Long term26989 = new Long(-5157976075409724332L);
        Long term26991 = new Long(5638814204437933939L);
        ArrayList term26977 = new ArrayList();
        ((ArrayList) term26977).add(term26979);
        ((ArrayList) term26977).add(term26981);
        ((ArrayList) term26977).add(term26983);
        ((ArrayList) term26977).add(term26985);
        ((ArrayList) term26977).add(term26987);
        ((ArrayList) term26977).add(term26989);
        ((ArrayList) term26977).add(term26991);
        Long term26995 = new Long(-5717327658642389548L);
        term26951 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder"));
        Object term26997 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27002 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27012 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26951, term26951.getClass(), "id", term26952);
        setField(term26951, term26951.getClass(), "userId", term26954);
        setField(term26951, term26951.getClass(), "type", enum69);
        setField(term26951, term26951.getClass(), "text", "beAMpkroCQ");
        setField(term26951, term26951.getClass(), "imageIds", term26977);
        setField(term26951, term26951.getClass(), "videoId", term26995);
        setIntField(term26998, term26998.getClass(), "year", 2021);
        setShortField(term26998, term26998.getClass(), "month", (short) 5);
        setShortField(term26998, term26998.getClass(), "day", (short) 13);
        setField(term26997, term26997.getClass(), "date", term26998);
        setByteField(term27002, term27002.getClass(), "hour", (byte) 15);
        setByteField(term27002, term27002.getClass(), "minute", (byte) 40);
        setByteField(term27002, term27002.getClass(), "second", (byte) 27);
        setIntField(term27002, term27002.getClass(), "nano", 319035378);
        setField(term26997, term26997.getClass(), "time", term27002);
        setField(term26951, term26951.getClass(), "createdAt", term26997);
        setIntField(term27008, term27008.getClass(), "year", 2012);
        setShortField(term27008, term27008.getClass(), "month", (short) 5);
        setShortField(term27008, term27008.getClass(), "day", (short) 21);
        setField(term27007, term27007.getClass(), "date", term27008);
        setByteField(term27012, term27012.getClass(), "hour", (byte) 19);
        setByteField(term27012, term27012.getClass(), "minute", (byte) 56);
        setByteField(term27012, term27012.getClass(), "second", (byte) 3);
        setIntField(term27012, term27012.getClass(), "nano", 266247153);
        setField(term27007, term27007.getClass(), "time", term27012);
        setField(term26951, term26951.getClass(), "updatedAt", term27007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term26951, args);
    }

};


