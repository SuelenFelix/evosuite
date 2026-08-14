package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserStatDTO_UserStatDTOBuilder_userId_14631174812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57957;
     Object term57990;

    public UserStatDTO_UserStatDTOBuilder_userId_14631174812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57958 = new Long(-5615015000728170842L);
        Long term57960 = new Long(-8165230786269861125L);
        Long term57962 = new Long(7818214521807331044L);
        Long term57964 = new Long(7027549200302660557L);
        Long term57966 = new Long(-4623233001658453008L);
        Long term57968 = new Long(-2816485221625714088L);
        term57957 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder"));
        Object term57970 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57971 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57975 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57980 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57981 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57985 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term57957, term57957.getClass(), "id", term57958);
        setField(term57957, term57957.getClass(), "userId", term57960);
        setField(term57957, term57957.getClass(), "postCount", term57962);
        setField(term57957, term57957.getClass(), "likeCount", term57964);
        setField(term57957, term57957.getClass(), "followingCount", term57966);
        setField(term57957, term57957.getClass(), "followerCount", term57968);
        setIntField(term57971, term57971.getClass(), "year", 2010);
        setShortField(term57971, term57971.getClass(), "month", (short) 11);
        setShortField(term57971, term57971.getClass(), "day", (short) 7);
        setField(term57970, term57970.getClass(), "date", term57971);
        setByteField(term57975, term57975.getClass(), "hour", (byte) 17);
        setByteField(term57975, term57975.getClass(), "minute", (byte) 2);
        setByteField(term57975, term57975.getClass(), "second", (byte) 45);
        setIntField(term57975, term57975.getClass(), "nano", 891551261);
        setField(term57970, term57970.getClass(), "time", term57975);
        setField(term57957, term57957.getClass(), "createdAt", term57970);
        setIntField(term57981, term57981.getClass(), "year", 2018);
        setShortField(term57981, term57981.getClass(), "month", (short) 4);
        setShortField(term57981, term57981.getClass(), "day", (short) 19);
        setField(term57980, term57980.getClass(), "date", term57981);
        setByteField(term57985, term57985.getClass(), "hour", (byte) 14);
        setByteField(term57985, term57985.getClass(), "minute", (byte) 21);
        setByteField(term57985, term57985.getClass(), "second", (byte) 19);
        setIntField(term57985, term57985.getClass(), "nano", 997536814);
        setField(term57980, term57980.getClass(), "time", term57985);
        setField(term57957, term57957.getClass(), "updatedAt", term57980);
        term57990 = new Long(2920715047797197542L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term57990;
        callMethod(klass, "userId", argTypes, term57957, args);
    }

};


