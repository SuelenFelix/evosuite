package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProfileResp_setUserName_123740026322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1827;

    public ProfileResp_setUserName_123740026322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1827 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term1869 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1870 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1874 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1884 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1827, term1827.getClass(), "userName", "BndsHwAFMv");
        setIntField(term1827, term1827.getClass(), "level", 534834644);
        setField(term1827, term1827.getClass(), "exp", "GzFkzHGYFt");
        setLongField(term1827, term1827.getClass(), "point", -8603648071751666348L);
        setLongField(term1827, term1827.getClass(), "totalPoint", -7884871963229073324L);
        setIntField(term1827, term1827.getClass(), "playCount", 1959097203);
        setIntField(term1827, term1827.getClass(), "playerRating", -209654048);
        setIntField(term1827, term1827.getClass(), "highestRating", 477625804);
        setIntField(term1827, term1827.getClass(), "nameplateId", 252575029);
        setIntField(term1827, term1827.getClass(), "frameId", 57189932);
        setIntField(term1827, term1827.getClass(), "characterId", 1460722225);
        setIntField(term1827, term1827.getClass(), "trophyId", 1743224434);
        setIntField(term1827, term1827.getClass(), "totalMapNum", 842904495);
        setLongField(term1827, term1827.getClass(), "totalHiScore", -8649738738252714180L);
        setLongField(term1827, term1827.getClass(), "totalBasicHighScore", -7278883608542636188L);
        setLongField(term1827, term1827.getClass(), "totalAdvancedHighScore", -1539859611880912454L);
        setLongField(term1827, term1827.getClass(), "totalExpertHighScore", 4100236067313034103L);
        setLongField(term1827, term1827.getClass(), "totalMasterHighScore", 1195529027276497124L);
        setIntField(term1827, term1827.getClass(), "friendCount", 1008080511);
        setIntField(term1870, term1870.getClass(), "year", 2020);
        setShortField(term1870, term1870.getClass(), "month", (short) 5);
        setShortField(term1870, term1870.getClass(), "day", (short) 18);
        setField(term1869, term1869.getClass(), "date", term1870);
        setByteField(term1874, term1874.getClass(), "hour", (byte) 5);
        setByteField(term1874, term1874.getClass(), "minute", (byte) 46);
        setByteField(term1874, term1874.getClass(), "second", (byte) 13);
        setIntField(term1874, term1874.getClass(), "nano", 45893173);
        setField(term1869, term1869.getClass(), "time", term1874);
        setField(term1827, term1827.getClass(), "firstPlayDate", term1869);
        setIntField(term1880, term1880.getClass(), "year", 2017);
        setShortField(term1880, term1880.getClass(), "month", (short) 4);
        setShortField(term1880, term1880.getClass(), "day", (short) 3);
        setField(term1879, term1879.getClass(), "date", term1880);
        setByteField(term1884, term1884.getClass(), "hour", (byte) 6);
        setByteField(term1884, term1884.getClass(), "minute", (byte) 51);
        setByteField(term1884, term1884.getClass(), "second", (byte) 10);
        setIntField(term1884, term1884.getClass(), "nano", 316377166);
        setField(term1879, term1879.getClass(), "time", term1884);
        setField(term1827, term1827.getClass(), "lastPlayDate", term1879);
        setIntField(term1827, term1827.getClass(), "courseClass", 1935707624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "setUserName", argTypes, term1827, args);
    }

};


