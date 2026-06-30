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

public class ProfileResp_getFrameId_18337166749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748;

    public ProfileResp_getFrameId_18337166749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term748 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term790 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term791 = newInstance(Class.forName("java.time.LocalDate"));
        Object term795 = newInstance(Class.forName("java.time.LocalTime"));
        Object term800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term805 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term748, term748.getClass(), "userName", "HyxfbSQYBe");
        setIntField(term748, term748.getClass(), "level", 304775596);
        setField(term748, term748.getClass(), "exp", "pCTimMblYc");
        setLongField(term748, term748.getClass(), "point", -1610676979013636850L);
        setLongField(term748, term748.getClass(), "totalPoint", 2062173786000223358L);
        setIntField(term748, term748.getClass(), "playCount", -1347665717);
        setIntField(term748, term748.getClass(), "playerRating", -1888585309);
        setIntField(term748, term748.getClass(), "highestRating", 683666002);
        setIntField(term748, term748.getClass(), "nameplateId", 1596213415);
        setIntField(term748, term748.getClass(), "frameId", -268815336);
        setIntField(term748, term748.getClass(), "characterId", -1210583429);
        setIntField(term748, term748.getClass(), "trophyId", -663691365);
        setIntField(term748, term748.getClass(), "totalMapNum", 339854490);
        setLongField(term748, term748.getClass(), "totalHiScore", -8658027316505137504L);
        setLongField(term748, term748.getClass(), "totalBasicHighScore", 414749984815662075L);
        setLongField(term748, term748.getClass(), "totalAdvancedHighScore", 463622836963501975L);
        setLongField(term748, term748.getClass(), "totalExpertHighScore", 305759998609888272L);
        setLongField(term748, term748.getClass(), "totalMasterHighScore", -8654565919063661957L);
        setIntField(term748, term748.getClass(), "friendCount", -615654495);
        setIntField(term791, term791.getClass(), "year", 2017);
        setShortField(term791, term791.getClass(), "month", (short) 3);
        setShortField(term791, term791.getClass(), "day", (short) 5);
        setField(term790, term790.getClass(), "date", term791);
        setByteField(term795, term795.getClass(), "hour", (byte) 20);
        setByteField(term795, term795.getClass(), "minute", (byte) 34);
        setByteField(term795, term795.getClass(), "second", (byte) 55);
        setIntField(term795, term795.getClass(), "nano", 78024496);
        setField(term790, term790.getClass(), "time", term795);
        setField(term748, term748.getClass(), "firstPlayDate", term790);
        setIntField(term801, term801.getClass(), "year", 2020);
        setShortField(term801, term801.getClass(), "month", (short) 7);
        setShortField(term801, term801.getClass(), "day", (short) 24);
        setField(term800, term800.getClass(), "date", term801);
        setByteField(term805, term805.getClass(), "hour", (byte) 0);
        setByteField(term805, term805.getClass(), "minute", (byte) 59);
        setByteField(term805, term805.getClass(), "second", (byte) 56);
        setIntField(term805, term805.getClass(), "nano", 320219201);
        setField(term800, term800.getClass(), "time", term805);
        setField(term748, term748.getClass(), "lastPlayDate", term800);
        setIntField(term748, term748.getClass(), "courseClass", -1476117762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term748, args);
    }

};


