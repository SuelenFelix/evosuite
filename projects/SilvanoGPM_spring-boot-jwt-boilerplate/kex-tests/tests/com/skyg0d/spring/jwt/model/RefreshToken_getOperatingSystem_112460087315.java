package com.skyg0d.spring.jwt.model;

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
import static com.skyg0d.spring.jwt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class RefreshToken_getOperatingSystem_112460087315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7179;

    public RefreshToken_getOperatingSystem_112460087315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7218 = new HashMap();
        Set<Object> term7350 =  ((Map) term7218).keySet();
        HashSet term7217 = new HashSet((Collection<? extends Object>) term7350);
        term7179 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term7180 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term7223 = newInstance(Class.forName("java.util.UUID"));
        Object term7226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7231 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7241 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7258 = newInstance(Class.forName("java.time.Instant"));
        Object term7297 = newInstance(Class.forName("java.util.UUID"));
        Object term7300 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7301 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7305 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7310 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7311 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7315 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7180, term7180.getClass(), "username", "HWkpTmtlrc");
        setField(term7180, term7180.getClass(), "email", "hMmaoREuCK");
        setField(term7180, term7180.getClass(), "password", "VeDtgDzGAN");
        setField(term7180, term7180.getClass(), "roles", term7217);
        setLongField(term7223, term7223.getClass(), "mostSigBits", -4023935540989049732L);
        setLongField(term7223, term7223.getClass(), "leastSigBits", 855932984568615096L);
        setField(term7180, term7180.getClass(), "id", term7223);
        setIntField(term7227, term7227.getClass(), "year", 2020);
        setShortField(term7227, term7227.getClass(), "month", (short) 10);
        setShortField(term7227, term7227.getClass(), "day", (short) 8);
        setField(term7226, term7226.getClass(), "date", term7227);
        setByteField(term7231, term7231.getClass(), "hour", (byte) 15);
        setByteField(term7231, term7231.getClass(), "minute", (byte) 57);
        setByteField(term7231, term7231.getClass(), "second", (byte) 17);
        setIntField(term7231, term7231.getClass(), "nano", 288139529);
        setField(term7226, term7226.getClass(), "time", term7231);
        setField(term7180, term7180.getClass(), "createdAt", term7226);
        setIntField(term7237, term7237.getClass(), "year", 2022);
        setShortField(term7237, term7237.getClass(), "month", (short) 6);
        setShortField(term7237, term7237.getClass(), "day", (short) 12);
        setField(term7236, term7236.getClass(), "date", term7237);
        setByteField(term7241, term7241.getClass(), "hour", (byte) 14);
        setByteField(term7241, term7241.getClass(), "minute", (byte) 3);
        setByteField(term7241, term7241.getClass(), "second", (byte) 7);
        setIntField(term7241, term7241.getClass(), "nano", 637592645);
        setField(term7236, term7236.getClass(), "time", term7241);
        setField(term7180, term7180.getClass(), "updatedAt", term7236);
        setField(term7179, term7179.getClass(), "user", term7180);
        setField(term7179, term7179.getClass(), "token", "aWYOWZFyaX");
        setLongField(term7258, term7258.getClass(), "seconds", 1882638884L);
        setIntField(term7258, term7258.getClass(), "nanos", 364000000);
        setField(term7179, term7179.getClass(), "expiryDate", term7258);
        setField(term7179, term7179.getClass(), "browser", "BRIVNtfUWU");
        setField(term7179, term7179.getClass(), "operatingSystem", "DbiCVtPPCT");
        setField(term7179, term7179.getClass(), "ipAddress", "WzFopsaDuG");
        setLongField(term7297, term7297.getClass(), "mostSigBits", -1616722610139554082L);
        setLongField(term7297, term7297.getClass(), "leastSigBits", 7495904023107549024L);
        setField(term7179, term7179.getClass(), "id", term7297);
        setIntField(term7301, term7301.getClass(), "year", 2023);
        setShortField(term7301, term7301.getClass(), "month", (short) 11);
        setShortField(term7301, term7301.getClass(), "day", (short) 14);
        setField(term7300, term7300.getClass(), "date", term7301);
        setByteField(term7305, term7305.getClass(), "hour", (byte) 15);
        setByteField(term7305, term7305.getClass(), "minute", (byte) 2);
        setByteField(term7305, term7305.getClass(), "second", (byte) 47);
        setIntField(term7305, term7305.getClass(), "nano", 703984770);
        setField(term7300, term7300.getClass(), "time", term7305);
        setField(term7179, term7179.getClass(), "createdAt", term7300);
        setIntField(term7311, term7311.getClass(), "year", 2024);
        setShortField(term7311, term7311.getClass(), "month", (short) 4);
        setShortField(term7311, term7311.getClass(), "day", (short) 26);
        setField(term7310, term7310.getClass(), "date", term7311);
        setByteField(term7315, term7315.getClass(), "hour", (byte) 15);
        setByteField(term7315, term7315.getClass(), "minute", (byte) 12);
        setByteField(term7315, term7315.getClass(), "second", (byte) 31);
        setIntField(term7315, term7315.getClass(), "nano", 839979637);
        setField(term7310, term7310.getClass(), "time", term7315);
        setField(term7179, term7179.getClass(), "updatedAt", term7310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOperatingSystem", argTypes, term7179, args);
    }

};


