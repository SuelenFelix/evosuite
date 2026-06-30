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

public class RecentResp_setPlayerRating_152812073755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49105;
     Object term49157;

    public RecentResp_setPlayerRating_152812073755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49105 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49106 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49107 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49111 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49116 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49117 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49121 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49107, term49107.getClass(), "year", 2024);
        setShortField(term49107, term49107.getClass(), "month", (short) 5);
        setShortField(term49107, term49107.getClass(), "day", (short) 8);
        setField(term49106, term49106.getClass(), "date", term49107);
        setByteField(term49111, term49111.getClass(), "hour", (byte) 10);
        setByteField(term49111, term49111.getClass(), "minute", (byte) 21);
        setByteField(term49111, term49111.getClass(), "second", (byte) 1);
        setIntField(term49111, term49111.getClass(), "nano", 912060546);
        setField(term49106, term49106.getClass(), "time", term49111);
        setField(term49105, term49105.getClass(), "playDate", term49106);
        setIntField(term49117, term49117.getClass(), "year", 2016);
        setShortField(term49117, term49117.getClass(), "month", (short) 1);
        setShortField(term49117, term49117.getClass(), "day", (short) 22);
        setField(term49116, term49116.getClass(), "date", term49117);
        setByteField(term49121, term49121.getClass(), "hour", (byte) 23);
        setByteField(term49121, term49121.getClass(), "minute", (byte) 0);
        setByteField(term49121, term49121.getClass(), "second", (byte) 1);
        setIntField(term49121, term49121.getClass(), "nano", 558329369);
        setField(term49116, term49116.getClass(), "time", term49121);
        setField(term49105, term49105.getClass(), "userPlayDate", term49116);
        setIntField(term49105, term49105.getClass(), "musicId", 1131350330);
        setIntField(term49105, term49105.getClass(), "level", -1463702476);
        setIntField(term49105, term49105.getClass(), "customId", 90151812);
        setIntField(term49105, term49105.getClass(), "playedCustom1", -416703693);
        setIntField(term49105, term49105.getClass(), "playedCustom2", -1718111500);
        setIntField(term49105, term49105.getClass(), "playedCustom3", 2134049264);
        setIntField(term49105, term49105.getClass(), "track", -619693439);
        setIntField(term49105, term49105.getClass(), "score", 1886882056);
        setIntField(term49105, term49105.getClass(), "rank", -689559993);
        setIntField(term49105, term49105.getClass(), "maxCombo", 263696243);
        setIntField(term49105, term49105.getClass(), "maxChain", -2012537672);
        setIntField(term49105, term49105.getClass(), "rateTap", -879433115);
        setIntField(term49105, term49105.getClass(), "rateHold", 275958841);
        setIntField(term49105, term49105.getClass(), "rateSlide", 1628668899);
        setIntField(term49105, term49105.getClass(), "rateAir", -998305335);
        setIntField(term49105, term49105.getClass(), "rateFlick", 2120008602);
        setIntField(term49105, term49105.getClass(), "judgeGuilty", 1085966764);
        setIntField(term49105, term49105.getClass(), "judgeAttack", -609882960);
        setIntField(term49105, term49105.getClass(), "judgeJustice", -1690283734);
        setIntField(term49105, term49105.getClass(), "judgeCritical", -1620783951);
        setIntField(term49105, term49105.getClass(), "playerRating", 1400387811);
        setBooleanField(term49105, term49105.getClass(), "isNewRecord", false);
        setBooleanField(term49105, term49105.getClass(), "isFullCombo", false);
        setIntField(term49105, term49105.getClass(), "fullChainKind", 903826116);
        setBooleanField(term49105, term49105.getClass(), "isAllJustice", false);
        setIntField(term49105, term49105.getClass(), "characterId", 641366348);
        setIntField(term49105, term49105.getClass(), "skillId", -353276989);
        setIntField(term49105, term49105.getClass(), "playKind", -505563323);
        setBooleanField(term49105, term49105.getClass(), "isClear", true);
        setIntField(term49105, term49105.getClass(), "skillLevel", -2087065864);
        setIntField(term49105, term49105.getClass(), "skillEffect", -169812741);
        term49157 = new Integer(-1015119737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term49157;
        callMethod(klass, "setPlayerRating", argTypes, term49105, args);
    }

};


