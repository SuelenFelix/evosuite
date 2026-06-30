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

public class RecentResp_setJudgeAttack_29485862252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48943;
     Object term48995;

    public RecentResp_setJudgeAttack_29485862252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48943 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48944 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48945 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48949 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48954 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48955 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48959 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48945, term48945.getClass(), "year", 2027);
        setShortField(term48945, term48945.getClass(), "month", (short) 11);
        setShortField(term48945, term48945.getClass(), "day", (short) 17);
        setField(term48944, term48944.getClass(), "date", term48945);
        setByteField(term48949, term48949.getClass(), "hour", (byte) 8);
        setByteField(term48949, term48949.getClass(), "minute", (byte) 27);
        setByteField(term48949, term48949.getClass(), "second", (byte) 41);
        setIntField(term48949, term48949.getClass(), "nano", 737345800);
        setField(term48944, term48944.getClass(), "time", term48949);
        setField(term48943, term48943.getClass(), "playDate", term48944);
        setIntField(term48955, term48955.getClass(), "year", 2028);
        setShortField(term48955, term48955.getClass(), "month", (short) 9);
        setShortField(term48955, term48955.getClass(), "day", (short) 4);
        setField(term48954, term48954.getClass(), "date", term48955);
        setByteField(term48959, term48959.getClass(), "hour", (byte) 2);
        setByteField(term48959, term48959.getClass(), "minute", (byte) 4);
        setByteField(term48959, term48959.getClass(), "second", (byte) 33);
        setIntField(term48959, term48959.getClass(), "nano", 927519741);
        setField(term48954, term48954.getClass(), "time", term48959);
        setField(term48943, term48943.getClass(), "userPlayDate", term48954);
        setIntField(term48943, term48943.getClass(), "musicId", -1232290301);
        setIntField(term48943, term48943.getClass(), "level", -1411058034);
        setIntField(term48943, term48943.getClass(), "customId", -144155597);
        setIntField(term48943, term48943.getClass(), "playedCustom1", -996670851);
        setIntField(term48943, term48943.getClass(), "playedCustom2", 340642931);
        setIntField(term48943, term48943.getClass(), "playedCustom3", -2018441502);
        setIntField(term48943, term48943.getClass(), "track", -762480882);
        setIntField(term48943, term48943.getClass(), "score", -263338308);
        setIntField(term48943, term48943.getClass(), "rank", 1496385296);
        setIntField(term48943, term48943.getClass(), "maxCombo", -1339659575);
        setIntField(term48943, term48943.getClass(), "maxChain", 2123597267);
        setIntField(term48943, term48943.getClass(), "rateTap", -147077267);
        setIntField(term48943, term48943.getClass(), "rateHold", -550222549);
        setIntField(term48943, term48943.getClass(), "rateSlide", -499576898);
        setIntField(term48943, term48943.getClass(), "rateAir", -686129078);
        setIntField(term48943, term48943.getClass(), "rateFlick", 1016118972);
        setIntField(term48943, term48943.getClass(), "judgeGuilty", 1276607451);
        setIntField(term48943, term48943.getClass(), "judgeAttack", -547325184);
        setIntField(term48943, term48943.getClass(), "judgeJustice", 1470261214);
        setIntField(term48943, term48943.getClass(), "judgeCritical", 1402619496);
        setIntField(term48943, term48943.getClass(), "playerRating", 1253501512);
        setBooleanField(term48943, term48943.getClass(), "isNewRecord", false);
        setBooleanField(term48943, term48943.getClass(), "isFullCombo", true);
        setIntField(term48943, term48943.getClass(), "fullChainKind", 594655877);
        setBooleanField(term48943, term48943.getClass(), "isAllJustice", true);
        setIntField(term48943, term48943.getClass(), "characterId", 281155455);
        setIntField(term48943, term48943.getClass(), "skillId", 85079003);
        setIntField(term48943, term48943.getClass(), "playKind", -2010823131);
        setBooleanField(term48943, term48943.getClass(), "isClear", false);
        setIntField(term48943, term48943.getClass(), "skillLevel", -1368198865);
        setIntField(term48943, term48943.getClass(), "skillEffect", -14635574);
        term48995 = new Integer(2111644026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48995;
        callMethod(klass, "setJudgeAttack", argTypes, term48943, args);
    }

};


