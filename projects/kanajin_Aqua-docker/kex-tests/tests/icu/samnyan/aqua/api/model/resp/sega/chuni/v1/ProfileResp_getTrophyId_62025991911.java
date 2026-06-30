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

public class ProfileResp_getTrophyId_62025991911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term914;

    public ProfileResp_getTrophyId_62025991911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term914 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term956 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term957 = newInstance(Class.forName("java.time.LocalDate"));
        Object term961 = newInstance(Class.forName("java.time.LocalTime"));
        Object term966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term971 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term914, term914.getClass(), "userName", "xOEqzGAmDU");
        setIntField(term914, term914.getClass(), "level", 1072005683);
        setField(term914, term914.getClass(), "exp", "eZFUvlxvGV");
        setLongField(term914, term914.getClass(), "point", 9013624480170062917L);
        setLongField(term914, term914.getClass(), "totalPoint", 7862575738391801707L);
        setIntField(term914, term914.getClass(), "playCount", 1861318859);
        setIntField(term914, term914.getClass(), "playerRating", 1474524152);
        setIntField(term914, term914.getClass(), "highestRating", 568954359);
        setIntField(term914, term914.getClass(), "nameplateId", 53410913);
        setIntField(term914, term914.getClass(), "frameId", -375014958);
        setIntField(term914, term914.getClass(), "characterId", 1107176718);
        setIntField(term914, term914.getClass(), "trophyId", 480137250);
        setIntField(term914, term914.getClass(), "totalMapNum", -341152642);
        setLongField(term914, term914.getClass(), "totalHiScore", 50358265865610362L);
        setLongField(term914, term914.getClass(), "totalBasicHighScore", 5510783420697225605L);
        setLongField(term914, term914.getClass(), "totalAdvancedHighScore", 6005241913654469005L);
        setLongField(term914, term914.getClass(), "totalExpertHighScore", -1983291584002806658L);
        setLongField(term914, term914.getClass(), "totalMasterHighScore", 5946780097489996391L);
        setIntField(term914, term914.getClass(), "friendCount", -2015854073);
        setIntField(term957, term957.getClass(), "year", 2015);
        setShortField(term957, term957.getClass(), "month", (short) 3);
        setShortField(term957, term957.getClass(), "day", (short) 10);
        setField(term956, term956.getClass(), "date", term957);
        setByteField(term961, term961.getClass(), "hour", (byte) 23);
        setByteField(term961, term961.getClass(), "minute", (byte) 34);
        setByteField(term961, term961.getClass(), "second", (byte) 44);
        setIntField(term961, term961.getClass(), "nano", 587322824);
        setField(term956, term956.getClass(), "time", term961);
        setField(term914, term914.getClass(), "firstPlayDate", term956);
        setIntField(term967, term967.getClass(), "year", 2027);
        setShortField(term967, term967.getClass(), "month", (short) 8);
        setShortField(term967, term967.getClass(), "day", (short) 26);
        setField(term966, term966.getClass(), "date", term967);
        setByteField(term971, term971.getClass(), "hour", (byte) 5);
        setByteField(term971, term971.getClass(), "minute", (byte) 11);
        setByteField(term971, term971.getClass(), "second", (byte) 9);
        setIntField(term971, term971.getClass(), "nano", 219245092);
        setField(term966, term966.getClass(), "time", term971);
        setField(term914, term914.getClass(), "lastPlayDate", term966);
        setIntField(term914, term914.getClass(), "courseClass", 538259104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term914, args);
    }

};


