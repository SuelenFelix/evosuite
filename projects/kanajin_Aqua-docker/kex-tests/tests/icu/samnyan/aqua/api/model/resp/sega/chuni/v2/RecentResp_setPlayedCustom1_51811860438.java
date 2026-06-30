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

public class RecentResp_setPlayedCustom1_51811860438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48187;
     Object term48239;

    public RecentResp_setPlayedCustom1_51811860438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48187 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48188 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48189 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48193 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48203 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48189, term48189.getClass(), "year", 2016);
        setShortField(term48189, term48189.getClass(), "month", (short) 1);
        setShortField(term48189, term48189.getClass(), "day", (short) 2);
        setField(term48188, term48188.getClass(), "date", term48189);
        setByteField(term48193, term48193.getClass(), "hour", (byte) 13);
        setByteField(term48193, term48193.getClass(), "minute", (byte) 24);
        setByteField(term48193, term48193.getClass(), "second", (byte) 10);
        setIntField(term48193, term48193.getClass(), "nano", 70073780);
        setField(term48188, term48188.getClass(), "time", term48193);
        setField(term48187, term48187.getClass(), "playDate", term48188);
        setIntField(term48199, term48199.getClass(), "year", 2013);
        setShortField(term48199, term48199.getClass(), "month", (short) 2);
        setShortField(term48199, term48199.getClass(), "day", (short) 21);
        setField(term48198, term48198.getClass(), "date", term48199);
        setByteField(term48203, term48203.getClass(), "hour", (byte) 4);
        setByteField(term48203, term48203.getClass(), "minute", (byte) 18);
        setByteField(term48203, term48203.getClass(), "second", (byte) 6);
        setIntField(term48203, term48203.getClass(), "nano", 2952762);
        setField(term48198, term48198.getClass(), "time", term48203);
        setField(term48187, term48187.getClass(), "userPlayDate", term48198);
        setIntField(term48187, term48187.getClass(), "musicId", -400500781);
        setIntField(term48187, term48187.getClass(), "level", -1811725314);
        setIntField(term48187, term48187.getClass(), "customId", -1802258300);
        setIntField(term48187, term48187.getClass(), "playedCustom1", -407739204);
        setIntField(term48187, term48187.getClass(), "playedCustom2", 551650321);
        setIntField(term48187, term48187.getClass(), "playedCustom3", 1863609082);
        setIntField(term48187, term48187.getClass(), "track", 346023694);
        setIntField(term48187, term48187.getClass(), "score", 1378096239);
        setIntField(term48187, term48187.getClass(), "rank", -1082231594);
        setIntField(term48187, term48187.getClass(), "maxCombo", -1775141108);
        setIntField(term48187, term48187.getClass(), "maxChain", -606500993);
        setIntField(term48187, term48187.getClass(), "rateTap", 475994339);
        setIntField(term48187, term48187.getClass(), "rateHold", -460066219);
        setIntField(term48187, term48187.getClass(), "rateSlide", -1947540595);
        setIntField(term48187, term48187.getClass(), "rateAir", -1198145043);
        setIntField(term48187, term48187.getClass(), "rateFlick", -999740641);
        setIntField(term48187, term48187.getClass(), "judgeGuilty", -639247037);
        setIntField(term48187, term48187.getClass(), "judgeAttack", -110418958);
        setIntField(term48187, term48187.getClass(), "judgeJustice", 1131695499);
        setIntField(term48187, term48187.getClass(), "judgeCritical", -699693103);
        setIntField(term48187, term48187.getClass(), "playerRating", -365179239);
        setBooleanField(term48187, term48187.getClass(), "isNewRecord", false);
        setBooleanField(term48187, term48187.getClass(), "isFullCombo", true);
        setIntField(term48187, term48187.getClass(), "fullChainKind", -1670737346);
        setBooleanField(term48187, term48187.getClass(), "isAllJustice", true);
        setIntField(term48187, term48187.getClass(), "characterId", -1150935030);
        setIntField(term48187, term48187.getClass(), "skillId", 78607598);
        setIntField(term48187, term48187.getClass(), "playKind", -126292072);
        setBooleanField(term48187, term48187.getClass(), "isClear", true);
        setIntField(term48187, term48187.getClass(), "skillLevel", -1541809993);
        setIntField(term48187, term48187.getClass(), "skillEffect", -1100665028);
        term48239 = new Integer(-1572533124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48239;
        callMethod(klass, "setPlayedCustom1", argTypes, term48187, args);
    }

};


