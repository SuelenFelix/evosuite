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

public class RecentResp_getPlayKind_126327100029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52863;

    public RecentResp_getPlayKind_126327100029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52863 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term52864 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52865 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52869 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52874 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52875 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52879 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term52865, term52865.getClass(), "year", 2013);
        setShortField(term52865, term52865.getClass(), "month", (short) 4);
        setShortField(term52865, term52865.getClass(), "day", (short) 26);
        setField(term52864, term52864.getClass(), "date", term52865);
        setByteField(term52869, term52869.getClass(), "hour", (byte) 11);
        setByteField(term52869, term52869.getClass(), "minute", (byte) 7);
        setByteField(term52869, term52869.getClass(), "second", (byte) 42);
        setIntField(term52869, term52869.getClass(), "nano", 202198585);
        setField(term52864, term52864.getClass(), "time", term52869);
        setField(term52863, term52863.getClass(), "playDate", term52864);
        setIntField(term52875, term52875.getClass(), "year", 2010);
        setShortField(term52875, term52875.getClass(), "month", (short) 1);
        setShortField(term52875, term52875.getClass(), "day", (short) 11);
        setField(term52874, term52874.getClass(), "date", term52875);
        setByteField(term52879, term52879.getClass(), "hour", (byte) 23);
        setByteField(term52879, term52879.getClass(), "minute", (byte) 36);
        setByteField(term52879, term52879.getClass(), "second", (byte) 37);
        setIntField(term52879, term52879.getClass(), "nano", 947768655);
        setField(term52874, term52874.getClass(), "time", term52879);
        setField(term52863, term52863.getClass(), "userPlayDate", term52874);
        setIntField(term52863, term52863.getClass(), "musicId", 1616706735);
        setIntField(term52863, term52863.getClass(), "level", -445244024);
        setIntField(term52863, term52863.getClass(), "customId", -1836568689);
        setIntField(term52863, term52863.getClass(), "playedCustom1", 367237282);
        setIntField(term52863, term52863.getClass(), "playedCustom2", 1917343242);
        setIntField(term52863, term52863.getClass(), "playedCustom3", 504552083);
        setIntField(term52863, term52863.getClass(), "track", -714955265);
        setIntField(term52863, term52863.getClass(), "score", 1191317081);
        setIntField(term52863, term52863.getClass(), "rank", -1321805207);
        setIntField(term52863, term52863.getClass(), "maxCombo", 1827794411);
        setIntField(term52863, term52863.getClass(), "maxChain", -1377700263);
        setIntField(term52863, term52863.getClass(), "rateTap", -38722118);
        setIntField(term52863, term52863.getClass(), "rateHold", 1123663642);
        setIntField(term52863, term52863.getClass(), "rateSlide", 404156777);
        setIntField(term52863, term52863.getClass(), "rateAir", 74684104);
        setIntField(term52863, term52863.getClass(), "rateFlick", 502851553);
        setIntField(term52863, term52863.getClass(), "judgeGuilty", -1149654883);
        setIntField(term52863, term52863.getClass(), "judgeAttack", -346017809);
        setIntField(term52863, term52863.getClass(), "judgeJustice", 1922136769);
        setIntField(term52863, term52863.getClass(), "judgeCritical", 1253469190);
        setIntField(term52863, term52863.getClass(), "playerRating", -92568219);
        setBooleanField(term52863, term52863.getClass(), "isNewRecord", false);
        setBooleanField(term52863, term52863.getClass(), "isFullCombo", true);
        setIntField(term52863, term52863.getClass(), "fullChainKind", 647226080);
        setBooleanField(term52863, term52863.getClass(), "isAllJustice", true);
        setIntField(term52863, term52863.getClass(), "characterId", -1031047832);
        setIntField(term52863, term52863.getClass(), "skillId", -1460628462);
        setIntField(term52863, term52863.getClass(), "playKind", -1466838817);
        setBooleanField(term52863, term52863.getClass(), "isClear", false);
        setIntField(term52863, term52863.getClass(), "skillLevel", -1308667183);
        setIntField(term52863, term52863.getClass(), "skillEffect", -1936073165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayKind", argTypes, term52863, args);
    }

};


