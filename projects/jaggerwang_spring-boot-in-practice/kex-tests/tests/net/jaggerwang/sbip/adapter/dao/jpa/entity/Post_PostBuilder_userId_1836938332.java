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

public class Post_PostBuilder_userId_1836938332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24411;
     Object term24474;

    public Post_PostBuilder_userId_1836938332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24412 = new Long(-3692936312179064102L);
        Long term24414 = new Long(5498944509671266637L);
        Class<? extends Object> term24477 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term24476 = ((Class) term24477).getDeclaredField((String) "TEXT");
        ((Field) term24476).setAccessible(true);
        Object enum60 = ((Field) term24476).get((Object) null);
        Long term24438 = new Long(-6838909359433858599L);
        Long term24440 = new Long(4947643967691976731L);
        Long term24442 = new Long(4548576710115075073L);
        Long term24444 = new Long(-1486519351300660432L);
        Long term24446 = new Long(4777103307547199454L);
        Long term24448 = new Long(6462632207326555041L);
        ArrayList term24436 = new ArrayList();
        ((ArrayList) term24436).add(term24438);
        ((ArrayList) term24436).add(term24440);
        ((ArrayList) term24436).add(term24442);
        ((ArrayList) term24436).add(term24444);
        ((ArrayList) term24436).add(term24446);
        ((ArrayList) term24436).add(term24448);
        Long term24452 = new Long(-3188913050877092148L);
        term24411 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder"));
        Object term24454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24459 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24469 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24411, term24411.getClass(), "id", term24412);
        setField(term24411, term24411.getClass(), "userId", term24414);
        setField(term24411, term24411.getClass(), "type", enum60);
        setField(term24411, term24411.getClass(), "text", "WZzvmIHhzZ");
        setField(term24411, term24411.getClass(), "imageIds", term24436);
        setField(term24411, term24411.getClass(), "videoId", term24452);
        setIntField(term24455, term24455.getClass(), "year", 2013);
        setShortField(term24455, term24455.getClass(), "month", (short) 3);
        setShortField(term24455, term24455.getClass(), "day", (short) 3);
        setField(term24454, term24454.getClass(), "date", term24455);
        setByteField(term24459, term24459.getClass(), "hour", (byte) 22);
        setByteField(term24459, term24459.getClass(), "minute", (byte) 27);
        setByteField(term24459, term24459.getClass(), "second", (byte) 52);
        setIntField(term24459, term24459.getClass(), "nano", 968779154);
        setField(term24454, term24454.getClass(), "time", term24459);
        setField(term24411, term24411.getClass(), "createdAt", term24454);
        setIntField(term24465, term24465.getClass(), "year", 2019);
        setShortField(term24465, term24465.getClass(), "month", (short) 8);
        setShortField(term24465, term24465.getClass(), "day", (short) 31);
        setField(term24464, term24464.getClass(), "date", term24465);
        setByteField(term24469, term24469.getClass(), "hour", (byte) 22);
        setByteField(term24469, term24469.getClass(), "minute", (byte) 31);
        setByteField(term24469, term24469.getClass(), "second", (byte) 36);
        setIntField(term24469, term24469.getClass(), "nano", 403358328);
        setField(term24464, term24464.getClass(), "time", term24469);
        setField(term24411, term24411.getClass(), "updatedAt", term24464);
        term24474 = new Long(-6759247883224780481L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term24474;
        callMethod(klass, "userId", argTypes, term24411, args);
    }

};


