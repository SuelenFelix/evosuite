package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostBO_canEqual_57388697218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18353;
     Object term18414;

    public PostBO_canEqual_57388697218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18354 = new Long(-6001151456088965547L);
        Long term18356 = new Long(1740732617708040141L);
        Class<? extends Object> term18416 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term18415 = ((Class) term18416).getDeclaredField((String) "TEXT");
        ((Field) term18415).setAccessible(true);
        Object enum51 = ((Field) term18415).get((Object) null);
        Long term18380 = new Long(3472971833455746664L);
        Long term18382 = new Long(3731931947533293029L);
        Long term18384 = new Long(9214973322210954344L);
        Long term18386 = new Long(3662777917800385964L);
        Long term18388 = new Long(-7005300544167632229L);
        ArrayList term18378 = new ArrayList();
        ((ArrayList) term18378).add(term18380);
        ((ArrayList) term18378).add(term18382);
        ((ArrayList) term18378).add(term18384);
        ((ArrayList) term18378).add(term18386);
        ((ArrayList) term18378).add(term18388);
        Long term18392 = new Long(-278716491237139968L);
        term18353 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term18394 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18395 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18399 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18409 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18353, term18353.getClass(), "id", term18354);
        setField(term18353, term18353.getClass(), "userId", term18356);
        setField(term18353, term18353.getClass(), "type", enum51);
        setField(term18353, term18353.getClass(), "text", "cudZvLMQon");
        setField(term18353, term18353.getClass(), "imageIds", term18378);
        setField(term18353, term18353.getClass(), "videoId", term18392);
        setIntField(term18395, term18395.getClass(), "year", 2010);
        setShortField(term18395, term18395.getClass(), "month", (short) 2);
        setShortField(term18395, term18395.getClass(), "day", (short) 28);
        setField(term18394, term18394.getClass(), "date", term18395);
        setByteField(term18399, term18399.getClass(), "hour", (byte) 2);
        setByteField(term18399, term18399.getClass(), "minute", (byte) 54);
        setByteField(term18399, term18399.getClass(), "second", (byte) 48);
        setIntField(term18399, term18399.getClass(), "nano", 930628940);
        setField(term18394, term18394.getClass(), "time", term18399);
        setField(term18353, term18353.getClass(), "createdAt", term18394);
        setIntField(term18405, term18405.getClass(), "year", 2022);
        setShortField(term18405, term18405.getClass(), "month", (short) 3);
        setShortField(term18405, term18405.getClass(), "day", (short) 11);
        setField(term18404, term18404.getClass(), "date", term18405);
        setByteField(term18409, term18409.getClass(), "hour", (byte) 7);
        setByteField(term18409, term18409.getClass(), "minute", (byte) 12);
        setByteField(term18409, term18409.getClass(), "second", (byte) 56);
        setIntField(term18409, term18409.getClass(), "nano", 884158779);
        setField(term18404, term18404.getClass(), "time", term18409);
        setField(term18353, term18353.getClass(), "updatedAt", term18404);
        term18414 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18414;
        callMethod(klass, "canEqual", argTypes, term18353, args);
    }

};


