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

public class ProfileResp_getFirstPlayDate_37320310719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1578;

    public ProfileResp_getFirstPlayDate_37320310719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1578 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term1620 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1621 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1625 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1635 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1578, term1578.getClass(), "userName", "nyiiPDVjAc");
        setIntField(term1578, term1578.getClass(), "level", -165587447);
        setField(term1578, term1578.getClass(), "exp", "aKnKipADSo");
        setLongField(term1578, term1578.getClass(), "point", 6843866297465638866L);
        setLongField(term1578, term1578.getClass(), "totalPoint", -4023935540989049732L);
        setIntField(term1578, term1578.getClass(), "playCount", -1347358701);
        setIntField(term1578, term1578.getClass(), "playerRating", 806595993);
        setIntField(term1578, term1578.getClass(), "highestRating", 548228925);
        setIntField(term1578, term1578.getClass(), "nameplateId", -749861210);
        setIntField(term1578, term1578.getClass(), "frameId", 1694224101);
        setIntField(term1578, term1578.getClass(), "characterId", 937859191);
        setIntField(term1578, term1578.getClass(), "trophyId", -916584829);
        setIntField(term1578, term1578.getClass(), "totalMapNum", -2131181468);
        setLongField(term1578, term1578.getClass(), "totalHiScore", 855932984568615096L);
        setLongField(term1578, term1578.getClass(), "totalBasicHighScore", -1616722610139554082L);
        setLongField(term1578, term1578.getClass(), "totalAdvancedHighScore", 7495904023107549024L);
        setLongField(term1578, term1578.getClass(), "totalExpertHighScore", 8802866251294305945L);
        setLongField(term1578, term1578.getClass(), "totalMasterHighScore", 4513004407927379358L);
        setIntField(term1578, term1578.getClass(), "friendCount", 282916351);
        setIntField(term1621, term1621.getClass(), "year", 2023);
        setShortField(term1621, term1621.getClass(), "month", (short) 7);
        setShortField(term1621, term1621.getClass(), "day", (short) 16);
        setField(term1620, term1620.getClass(), "date", term1621);
        setByteField(term1625, term1625.getClass(), "hour", (byte) 3);
        setByteField(term1625, term1625.getClass(), "minute", (byte) 1);
        setByteField(term1625, term1625.getClass(), "second", (byte) 19);
        setIntField(term1625, term1625.getClass(), "nano", 488629554);
        setField(term1620, term1620.getClass(), "time", term1625);
        setField(term1578, term1578.getClass(), "firstPlayDate", term1620);
        setIntField(term1631, term1631.getClass(), "year", 2018);
        setShortField(term1631, term1631.getClass(), "month", (short) 7);
        setShortField(term1631, term1631.getClass(), "day", (short) 12);
        setField(term1630, term1630.getClass(), "date", term1631);
        setByteField(term1635, term1635.getClass(), "hour", (byte) 1);
        setByteField(term1635, term1635.getClass(), "minute", (byte) 3);
        setByteField(term1635, term1635.getClass(), "second", (byte) 47);
        setIntField(term1635, term1635.getClass(), "nano", 2729929);
        setField(term1630, term1630.getClass(), "time", term1635);
        setField(term1578, term1578.getClass(), "lastPlayDate", term1630);
        setIntField(term1578, term1578.getClass(), "courseClass", 880977281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstPlayDate", argTypes, term1578, args);
    }

};


