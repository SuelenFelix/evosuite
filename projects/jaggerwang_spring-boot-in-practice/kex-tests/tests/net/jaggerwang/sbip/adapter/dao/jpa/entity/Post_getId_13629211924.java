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

public class Post_getId_13629211924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5380;

    public Post_getId_13629211924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5381 = new Long(-6100012593724108983L);
        Long term5383 = new Long(5465527210299101732L);
        Class<? extends Object> term5441 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term5440 = ((Class) term5441).getDeclaredField((String) "VIDEO");
        ((Field) term5440).setAccessible(true);
        Object enum13 = ((Field) term5440).get((Object) null);
        Long term5408 = new Long(4699157009689333952L);
        Long term5410 = new Long(-78240609295693193L);
        Long term5412 = new Long(3090901538358721367L);
        Long term5414 = new Long(-1677189124507026637L);
        ArrayList term5406 = new ArrayList();
        ((ArrayList) term5406).add(term5408);
        ((ArrayList) term5406).add(term5410);
        ((ArrayList) term5406).add(term5412);
        ((ArrayList) term5406).add(term5414);
        Long term5418 = new Long(4795660804170399986L);
        term5380 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term5420 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5421 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5425 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5430 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5431 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5435 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5380, term5380.getClass(), "id", term5381);
        setField(term5380, term5380.getClass(), "userId", term5383);
        setField(term5380, term5380.getClass(), "type", enum13);
        setField(term5380, term5380.getClass(), "text", "LvtrsXUliU");
        setField(term5380, term5380.getClass(), "imageIds", term5406);
        setField(term5380, term5380.getClass(), "videoId", term5418);
        setIntField(term5421, term5421.getClass(), "year", 2023);
        setShortField(term5421, term5421.getClass(), "month", (short) 5);
        setShortField(term5421, term5421.getClass(), "day", (short) 23);
        setField(term5420, term5420.getClass(), "date", term5421);
        setByteField(term5425, term5425.getClass(), "hour", (byte) 0);
        setByteField(term5425, term5425.getClass(), "minute", (byte) 50);
        setByteField(term5425, term5425.getClass(), "second", (byte) 5);
        setIntField(term5425, term5425.getClass(), "nano", 296286825);
        setField(term5420, term5420.getClass(), "time", term5425);
        setField(term5380, term5380.getClass(), "createdAt", term5420);
        setIntField(term5431, term5431.getClass(), "year", 2015);
        setShortField(term5431, term5431.getClass(), "month", (short) 2);
        setShortField(term5431, term5431.getClass(), "day", (short) 5);
        setField(term5430, term5430.getClass(), "date", term5431);
        setByteField(term5435, term5435.getClass(), "hour", (byte) 3);
        setByteField(term5435, term5435.getClass(), "minute", (byte) 26);
        setByteField(term5435, term5435.getClass(), "second", (byte) 49);
        setIntField(term5435, term5435.getClass(), "nano", 995758570);
        setField(term5430, term5430.getClass(), "time", term5435);
        setField(term5380, term5380.getClass(), "updatedAt", term5430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term5380, args);
    }

};


