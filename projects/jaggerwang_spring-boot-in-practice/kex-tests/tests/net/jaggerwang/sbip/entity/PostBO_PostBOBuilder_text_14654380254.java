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

public class PostBO_PostBOBuilder_text_14654380254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22415;

    public PostBO_PostBOBuilder_text_14654380254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22416 = new Long(1634166935474035772L);
        Long term22418 = new Long(-2614906266506360948L);
        Class<? extends Object> term22485 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term22484 = ((Class) term22485).getDeclaredField((String) "TEXT");
        ((Field) term22484).setAccessible(true);
        Object enum63 = ((Field) term22484).get((Object) null);
        Long term22442 = new Long(1133267598258375793L);
        Long term22444 = new Long(2990264647913003810L);
        Long term22446 = new Long(-2195794659127490022L);
        ArrayList term22440 = new ArrayList();
        ((ArrayList) term22440).add(term22442);
        ((ArrayList) term22440).add(term22444);
        ((ArrayList) term22440).add(term22446);
        Long term22450 = new Long(6142089107139955834L);
        term22415 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder"));
        Object term22452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22457 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22462 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22463 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22467 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22415, term22415.getClass(), "id", term22416);
        setField(term22415, term22415.getClass(), "userId", term22418);
        setField(term22415, term22415.getClass(), "type", enum63);
        setField(term22415, term22415.getClass(), "text", "tXfQjSqDzN");
        setField(term22415, term22415.getClass(), "imageIds", term22440);
        setField(term22415, term22415.getClass(), "videoId", term22450);
        setIntField(term22453, term22453.getClass(), "year", 2028);
        setShortField(term22453, term22453.getClass(), "month", (short) 5);
        setShortField(term22453, term22453.getClass(), "day", (short) 6);
        setField(term22452, term22452.getClass(), "date", term22453);
        setByteField(term22457, term22457.getClass(), "hour", (byte) 19);
        setByteField(term22457, term22457.getClass(), "minute", (byte) 33);
        setByteField(term22457, term22457.getClass(), "second", (byte) 32);
        setIntField(term22457, term22457.getClass(), "nano", 917257563);
        setField(term22452, term22452.getClass(), "time", term22457);
        setField(term22415, term22415.getClass(), "createdAt", term22452);
        setIntField(term22463, term22463.getClass(), "year", 2029);
        setShortField(term22463, term22463.getClass(), "month", (short) 7);
        setShortField(term22463, term22463.getClass(), "day", (short) 22);
        setField(term22462, term22462.getClass(), "date", term22463);
        setByteField(term22467, term22467.getClass(), "hour", (byte) 17);
        setByteField(term22467, term22467.getClass(), "minute", (byte) 59);
        setByteField(term22467, term22467.getClass(), "second", (byte) 58);
        setIntField(term22467, term22467.getClass(), "nano", 921418702);
        setField(term22462, term22462.getClass(), "time", term22467);
        setField(term22415, term22415.getClass(), "updatedAt", term22462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BjugTaMcxJ";
        callMethod(klass, "text", argTypes, term22415, args);
    }

};


