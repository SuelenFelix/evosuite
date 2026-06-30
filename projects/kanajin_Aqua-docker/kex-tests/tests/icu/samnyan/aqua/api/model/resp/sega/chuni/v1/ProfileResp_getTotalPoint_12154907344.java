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

public class ProfileResp_getTotalPoint_12154907344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333;

    public ProfileResp_getTotalPoint_12154907344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term380 = newInstance(Class.forName("java.time.LocalTime"));
        Object term385 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term386 = newInstance(Class.forName("java.time.LocalDate"));
        Object term390 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term333, term333.getClass(), "userName", "hRNSzYYIrc");
        setIntField(term333, term333.getClass(), "level", 1876565163);
        setField(term333, term333.getClass(), "exp", "RMFIsYGgne");
        setLongField(term333, term333.getClass(), "point", 1967728129628047933L);
        setLongField(term333, term333.getClass(), "totalPoint", 2120084523938730454L);
        setIntField(term333, term333.getClass(), "playCount", -817164822);
        setIntField(term333, term333.getClass(), "playerRating", -1016503459);
        setIntField(term333, term333.getClass(), "highestRating", -1968847291);
        setIntField(term333, term333.getClass(), "nameplateId", 579005622);
        setIntField(term333, term333.getClass(), "frameId", -14890619);
        setIntField(term333, term333.getClass(), "characterId", 1632125673);
        setIntField(term333, term333.getClass(), "trophyId", 454281060);
        setIntField(term333, term333.getClass(), "totalMapNum", -1786399638);
        setLongField(term333, term333.getClass(), "totalHiScore", 6855071767938501807L);
        setLongField(term333, term333.getClass(), "totalBasicHighScore", -5892135042702373494L);
        setLongField(term333, term333.getClass(), "totalAdvancedHighScore", 5262507301787091109L);
        setLongField(term333, term333.getClass(), "totalExpertHighScore", -6823727938421990489L);
        setLongField(term333, term333.getClass(), "totalMasterHighScore", -484994522244390100L);
        setIntField(term333, term333.getClass(), "friendCount", 2055867847);
        setIntField(term376, term376.getClass(), "year", 2029);
        setShortField(term376, term376.getClass(), "month", (short) 8);
        setShortField(term376, term376.getClass(), "day", (short) 29);
        setField(term375, term375.getClass(), "date", term376);
        setByteField(term380, term380.getClass(), "hour", (byte) 15);
        setByteField(term380, term380.getClass(), "minute", (byte) 50);
        setByteField(term380, term380.getClass(), "second", (byte) 1);
        setIntField(term380, term380.getClass(), "nano", 277971904);
        setField(term375, term375.getClass(), "time", term380);
        setField(term333, term333.getClass(), "firstPlayDate", term375);
        setIntField(term386, term386.getClass(), "year", 2022);
        setShortField(term386, term386.getClass(), "month", (short) 11);
        setShortField(term386, term386.getClass(), "day", (short) 16);
        setField(term385, term385.getClass(), "date", term386);
        setByteField(term390, term390.getClass(), "hour", (byte) 15);
        setByteField(term390, term390.getClass(), "minute", (byte) 54);
        setByteField(term390, term390.getClass(), "second", (byte) 2);
        setIntField(term390, term390.getClass(), "nano", 733274103);
        setField(term385, term385.getClass(), "time", term390);
        setField(term333, term333.getClass(), "lastPlayDate", term385);
        setIntField(term333, term333.getClass(), "courseClass", -1048298087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPoint", argTypes, term333, args);
    }

};


