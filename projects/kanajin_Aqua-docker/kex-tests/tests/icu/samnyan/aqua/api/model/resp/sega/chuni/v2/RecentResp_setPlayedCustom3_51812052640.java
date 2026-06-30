package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class RecentResp_setPlayedCustom3_51812052640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48295;
     Object term48347;

    public RecentResp_setPlayedCustom3_51812052640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48295 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48296 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48297 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48301 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48306 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48307 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48311 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48297, term48297.getClass(), "year", 2019);
        setShortField(term48297, term48297.getClass(), "month", (short) 8);
        setShortField(term48297, term48297.getClass(), "day", (short) 7);
        setField(term48296, term48296.getClass(), "date", term48297);
        setByteField(term48301, term48301.getClass(), "hour", (byte) 5);
        setByteField(term48301, term48301.getClass(), "minute", (byte) 54);
        setByteField(term48301, term48301.getClass(), "second", (byte) 59);
        setIntField(term48301, term48301.getClass(), "nano", 56284870);
        setField(term48296, term48296.getClass(), "time", term48301);
        setField(term48295, term48295.getClass(), "playDate", term48296);
        setIntField(term48307, term48307.getClass(), "year", 2023);
        setShortField(term48307, term48307.getClass(), "month", (short) 9);
        setShortField(term48307, term48307.getClass(), "day", (short) 23);
        setField(term48306, term48306.getClass(), "date", term48307);
        setByteField(term48311, term48311.getClass(), "hour", (byte) 14);
        setByteField(term48311, term48311.getClass(), "minute", (byte) 52);
        setByteField(term48311, term48311.getClass(), "second", (byte) 34);
        setIntField(term48311, term48311.getClass(), "nano", 879945118);
        setField(term48306, term48306.getClass(), "time", term48311);
        setField(term48295, term48295.getClass(), "userPlayDate", term48306);
        setIntField(term48295, term48295.getClass(), "musicId", 986298442);
        setIntField(term48295, term48295.getClass(), "level", 1751660702);
        setIntField(term48295, term48295.getClass(), "customId", 433217860);
        setIntField(term48295, term48295.getClass(), "playedCustom1", 495773924);
        setIntField(term48295, term48295.getClass(), "playedCustom2", 1485597364);
        setIntField(term48295, term48295.getClass(), "playedCustom3", 1232259140);
        setIntField(term48295, term48295.getClass(), "track", -1371367751);
        setIntField(term48295, term48295.getClass(), "score", -954813389);
        setIntField(term48295, term48295.getClass(), "rank", -232542458);
        setIntField(term48295, term48295.getClass(), "maxCombo", -106999876);
        setIntField(term48295, term48295.getClass(), "maxChain", -2129996761);
        setIntField(term48295, term48295.getClass(), "rateTap", 1822990018);
        setIntField(term48295, term48295.getClass(), "rateHold", -417542619);
        setIntField(term48295, term48295.getClass(), "rateSlide", 562244123);
        setIntField(term48295, term48295.getClass(), "rateAir", -1020238686);
        setIntField(term48295, term48295.getClass(), "rateFlick", -1450230869);
        setIntField(term48295, term48295.getClass(), "judgeGuilty", -785918740);
        setIntField(term48295, term48295.getClass(), "judgeAttack", 384642213);
        setIntField(term48295, term48295.getClass(), "judgeJustice", 1673176720);
        setIntField(term48295, term48295.getClass(), "judgeCritical", 1084767630);
        setIntField(term48295, term48295.getClass(), "playerRating", 1634202484);
        setBooleanField(term48295, term48295.getClass(), "isNewRecord", true);
        setBooleanField(term48295, term48295.getClass(), "isFullCombo", false);
        setIntField(term48295, term48295.getClass(), "fullChainKind", -1738191161);
        setBooleanField(term48295, term48295.getClass(), "isAllJustice", true);
        setIntField(term48295, term48295.getClass(), "characterId", 48416396);
        setIntField(term48295, term48295.getClass(), "skillId", -1949441630);
        setIntField(term48295, term48295.getClass(), "playKind", 1641286805);
        setBooleanField(term48295, term48295.getClass(), "isClear", false);
        setIntField(term48295, term48295.getClass(), "skillLevel", -370516662);
        setIntField(term48295, term48295.getClass(), "skillEffect", -372652916);
        term48347 = new Integer(1915058189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48347;
        callMethod(klass, "setPlayedCustom3", argTypes, term48295, args);
    }

};


