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
import java.lang.Object;

public class UserStat_UserStatBuilder_build_5771996599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4432;

    public UserStat_UserStatBuilder_build_5771996599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4433 = new Long(-3948863953565024517L);
        Long term4435 = new Long(-6587807377747738663L);
        Long term4437 = new Long(-6301101997917060727L);
        Long term4439 = new Long(8166095254618543564L);
        Long term4441 = new Long(-4598158870068953328L);
        Long term4443 = new Long(138235087558060686L);
        term4432 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder"));
        Object term4445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4450 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4460 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4432, term4432.getClass(), "id", term4433);
        setField(term4432, term4432.getClass(), "userId", term4435);
        setField(term4432, term4432.getClass(), "postCount", term4437);
        setField(term4432, term4432.getClass(), "likeCount", term4439);
        setField(term4432, term4432.getClass(), "followingCount", term4441);
        setField(term4432, term4432.getClass(), "followerCount", term4443);
        setIntField(term4446, term4446.getClass(), "year", 2020);
        setShortField(term4446, term4446.getClass(), "month", (short) 8);
        setShortField(term4446, term4446.getClass(), "day", (short) 16);
        setField(term4445, term4445.getClass(), "date", term4446);
        setByteField(term4450, term4450.getClass(), "hour", (byte) 4);
        setByteField(term4450, term4450.getClass(), "minute", (byte) 37);
        setByteField(term4450, term4450.getClass(), "second", (byte) 19);
        setIntField(term4450, term4450.getClass(), "nano", 605410923);
        setField(term4445, term4445.getClass(), "time", term4450);
        setField(term4432, term4432.getClass(), "createdAt", term4445);
        setIntField(term4456, term4456.getClass(), "year", 2028);
        setShortField(term4456, term4456.getClass(), "month", (short) 5);
        setShortField(term4456, term4456.getClass(), "day", (short) 2);
        setField(term4455, term4455.getClass(), "date", term4456);
        setByteField(term4460, term4460.getClass(), "hour", (byte) 2);
        setByteField(term4460, term4460.getClass(), "minute", (byte) 59);
        setByteField(term4460, term4460.getClass(), "second", (byte) 30);
        setIntField(term4460, term4460.getClass(), "nano", 222274238);
        setField(term4455, term4455.getClass(), "time", term4460);
        setField(term4432, term4432.getClass(), "updatedAt", term4455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4432, args);
    }

};


