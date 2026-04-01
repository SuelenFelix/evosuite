package kyungseo.poc.simple.web.security.persistence.entity.ds1;

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
import static kyungseo.poc.simple.web.security.persistence.entity.ds1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;

public class NewLocationToken_getUserLocation_13175107697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12100;

    public NewLocationToken_getUserLocation_13175107697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12101 = new Long(3853743792832767733L);
        Long term12116 = new Long(-6064923943154213519L);
        Long term12132 = new Long(-6344058468200613078L);
        Boolean term12170 = new Boolean(true);
        Integer term12172 = new Integer(-1195339592);
        ArrayList term12210 = new ArrayList();
        ((ArrayList) term12210).add((Object)null);
        ((ArrayList) term12210).add((Object)null);
        ((ArrayList) term12210).add((Object)null);
        ((ArrayList) term12210).add((Object)null);
        ((ArrayList) term12210).add((Object)null);
        ((ArrayList) term12210).add((Object)null);
        ((ArrayList) term12210).add((Object)null);
        term12100 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken"));
        Object term12115 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.UserLocation"));
        Object term12131 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.User"));
        Object term12227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12232 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12242 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12100, term12100.getClass(), "id", term12101);
        setField(term12100, term12100.getClass(), "token", "gKgsqLPDCs");
        setField(term12115, term12115.getClass(), "id", term12116);
        setField(term12115, term12115.getClass(), "country", "crZAQIKgDI");
        setBooleanField(term12115, term12115.getClass(), "enabled", true);
        setField(term12131, term12131.getClass(), "id", term12132);
        setField(term12131, term12131.getClass(), "membername", "uDAdogNiBQ");
        setField(term12131, term12131.getClass(), "email", "GnPrxkKUmR");
        setField(term12131, term12131.getClass(), "password", "gVgLmqgxMh");
        setField(term12131, term12131.getClass(), "enabled", term12170);
        setField(term12131, term12131.getClass(), "age", term12172);
        setField(term12131, term12131.getClass(), "phoneNumber", "QWknVCpJTU");
        setField(term12131, term12131.getClass(), "country", "XhnCbWwpIr");
        setField(term12131, term12131.getClass(), "birthdate", "BVMUadSiyU");
        setField(term12131, term12131.getClass(), "roles", term12210);
        setBooleanField(term12131, term12131.getClass(), "isUsing2FA", false);
        setField(term12131, term12131.getClass(), "secret", "LEbiLyVKDG");
        setIntField(term12228, term12228.getClass(), "year", 2010);
        setShortField(term12228, term12228.getClass(), "month", (short) 8);
        setShortField(term12228, term12228.getClass(), "day", (short) 17);
        setField(term12227, term12227.getClass(), "date", term12228);
        setByteField(term12232, term12232.getClass(), "hour", (byte) 5);
        setByteField(term12232, term12232.getClass(), "minute", (byte) 41);
        setByteField(term12232, term12232.getClass(), "second", (byte) 7);
        setIntField(term12232, term12232.getClass(), "nano", 26533684);
        setField(term12227, term12227.getClass(), "time", term12232);
        setField(term12131, term12131.getClass(), "regDate", term12227);
        setIntField(term12238, term12238.getClass(), "year", 2012);
        setShortField(term12238, term12238.getClass(), "month", (short) 4);
        setShortField(term12238, term12238.getClass(), "day", (short) 28);
        setField(term12237, term12237.getClass(), "date", term12238);
        setByteField(term12242, term12242.getClass(), "hour", (byte) 11);
        setByteField(term12242, term12242.getClass(), "minute", (byte) 47);
        setByteField(term12242, term12242.getClass(), "second", (byte) 25);
        setIntField(term12242, term12242.getClass(), "nano", 790659871);
        setField(term12237, term12237.getClass(), "time", term12242);
        setField(term12131, term12131.getClass(), "modDate", term12237);
        setField(term12115, term12115.getClass(), "user", term12131);
        setField(term12100, term12100.getClass(), "userLocation", term12115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.NewLocationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserLocation", argTypes, term12100, args);
    }

};


