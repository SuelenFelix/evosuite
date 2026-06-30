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
import java.lang.Long;

public class ProfileResp_setTotalPoint_30110999626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2207;
     Object term2270;

    public ProfileResp_setTotalPoint_30110999626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2207 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term2249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2254 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2264 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2207, term2207.getClass(), "userName", "onpbIeEKoi");
        setIntField(term2207, term2207.getClass(), "level", -43417861);
        setField(term2207, term2207.getClass(), "exp", "YRHGsAkhxb");
        setLongField(term2207, term2207.getClass(), "point", -4030863184426321096L);
        setLongField(term2207, term2207.getClass(), "totalPoint", -8010214112439224349L);
        setIntField(term2207, term2207.getClass(), "playCount", -1533843432);
        setIntField(term2207, term2207.getClass(), "playerRating", -123338791);
        setIntField(term2207, term2207.getClass(), "highestRating", -1467089634);
        setIntField(term2207, term2207.getClass(), "nameplateId", 413548937);
        setIntField(term2207, term2207.getClass(), "frameId", 1901317214);
        setIntField(term2207, term2207.getClass(), "characterId", 1166710220);
        setIntField(term2207, term2207.getClass(), "trophyId", -1070592289);
        setIntField(term2207, term2207.getClass(), "totalMapNum", -1464172784);
        setLongField(term2207, term2207.getClass(), "totalHiScore", -6673920710396545553L);
        setLongField(term2207, term2207.getClass(), "totalBasicHighScore", 3412644969878030772L);
        setLongField(term2207, term2207.getClass(), "totalAdvancedHighScore", 6698455537431331246L);
        setLongField(term2207, term2207.getClass(), "totalExpertHighScore", -8327432141027603933L);
        setLongField(term2207, term2207.getClass(), "totalMasterHighScore", -433040798405298080L);
        setIntField(term2207, term2207.getClass(), "friendCount", 32185364);
        setIntField(term2250, term2250.getClass(), "year", 2011);
        setShortField(term2250, term2250.getClass(), "month", (short) 6);
        setShortField(term2250, term2250.getClass(), "day", (short) 26);
        setField(term2249, term2249.getClass(), "date", term2250);
        setByteField(term2254, term2254.getClass(), "hour", (byte) 22);
        setByteField(term2254, term2254.getClass(), "minute", (byte) 39);
        setByteField(term2254, term2254.getClass(), "second", (byte) 11);
        setIntField(term2254, term2254.getClass(), "nano", 686293604);
        setField(term2249, term2249.getClass(), "time", term2254);
        setField(term2207, term2207.getClass(), "firstPlayDate", term2249);
        setIntField(term2260, term2260.getClass(), "year", 2012);
        setShortField(term2260, term2260.getClass(), "month", (short) 7);
        setShortField(term2260, term2260.getClass(), "day", (short) 21);
        setField(term2259, term2259.getClass(), "date", term2260);
        setByteField(term2264, term2264.getClass(), "hour", (byte) 13);
        setByteField(term2264, term2264.getClass(), "minute", (byte) 41);
        setByteField(term2264, term2264.getClass(), "second", (byte) 44);
        setIntField(term2264, term2264.getClass(), "nano", 394467282);
        setField(term2259, term2259.getClass(), "time", term2264);
        setField(term2207, term2207.getClass(), "lastPlayDate", term2259);
        setIntField(term2207, term2207.getClass(), "courseClass", 1768204942);
        term2270 = new Long(-1505191021111100819L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2270;
        callMethod(klass, "setTotalPoint", argTypes, term2207, args);
    }

};


