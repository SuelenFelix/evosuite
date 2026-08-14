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
import java.lang.Object;

public class UserBO_UserBOBuilder_email_4916341845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28783;

    public UserBO_UserBOBuilder_email_4916341845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28784 = new Long(-1486519351300660432L);
        Long term28834 = new Long(4777103307547199454L);
        term28783 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        Object term28848 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28849 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28853 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28863 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28783, term28783.getClass(), "id", term28784);
        setField(term28783, term28783.getClass(), "username", "MeTmRZXErV");
        setField(term28783, term28783.getClass(), "password", "jNxbVmoZgq");
        setField(term28783, term28783.getClass(), "mobile", "PvmBHIXaMY");
        setField(term28783, term28783.getClass(), "email", "hulYxtowxw");
        setField(term28783, term28783.getClass(), "avatarId", term28834);
        setField(term28783, term28783.getClass(), "intro", "GNEmuHPNcU");
        setIntField(term28849, term28849.getClass(), "year", 2021);
        setShortField(term28849, term28849.getClass(), "month", (short) 2);
        setShortField(term28849, term28849.getClass(), "day", (short) 21);
        setField(term28848, term28848.getClass(), "date", term28849);
        setByteField(term28853, term28853.getClass(), "hour", (byte) 4);
        setByteField(term28853, term28853.getClass(), "minute", (byte) 22);
        setByteField(term28853, term28853.getClass(), "second", (byte) 2);
        setIntField(term28853, term28853.getClass(), "nano", 752727543);
        setField(term28848, term28848.getClass(), "time", term28853);
        setField(term28783, term28783.getClass(), "createdAt", term28848);
        setIntField(term28859, term28859.getClass(), "year", 2017);
        setShortField(term28859, term28859.getClass(), "month", (short) 8);
        setShortField(term28859, term28859.getClass(), "day", (short) 30);
        setField(term28858, term28858.getClass(), "date", term28859);
        setByteField(term28863, term28863.getClass(), "hour", (byte) 3);
        setByteField(term28863, term28863.getClass(), "minute", (byte) 48);
        setByteField(term28863, term28863.getClass(), "second", (byte) 37);
        setIntField(term28863, term28863.getClass(), "nano", 121640121);
        setField(term28858, term28858.getClass(), "time", term28863);
        setField(term28783, term28783.getClass(), "updatedAt", term28858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoSfuKDFRe";
        callMethod(klass, "email", argTypes, term28783, args);
    }

};


