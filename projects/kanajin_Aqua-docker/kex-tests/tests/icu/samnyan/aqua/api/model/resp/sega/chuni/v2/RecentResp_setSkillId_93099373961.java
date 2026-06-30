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

public class RecentResp_setSkillId_93099373961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49429;
     Object term49481;

    public RecentResp_setSkillId_93099373961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49429 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49430 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49431 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49435 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49440 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49441 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49445 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49431, term49431.getClass(), "year", 2017);
        setShortField(term49431, term49431.getClass(), "month", (short) 10);
        setShortField(term49431, term49431.getClass(), "day", (short) 10);
        setField(term49430, term49430.getClass(), "date", term49431);
        setByteField(term49435, term49435.getClass(), "hour", (byte) 18);
        setByteField(term49435, term49435.getClass(), "minute", (byte) 16);
        setByteField(term49435, term49435.getClass(), "second", (byte) 29);
        setIntField(term49435, term49435.getClass(), "nano", 468943994);
        setField(term49430, term49430.getClass(), "time", term49435);
        setField(term49429, term49429.getClass(), "playDate", term49430);
        setIntField(term49441, term49441.getClass(), "year", 2029);
        setShortField(term49441, term49441.getClass(), "month", (short) 3);
        setShortField(term49441, term49441.getClass(), "day", (short) 21);
        setField(term49440, term49440.getClass(), "date", term49441);
        setByteField(term49445, term49445.getClass(), "hour", (byte) 12);
        setByteField(term49445, term49445.getClass(), "minute", (byte) 42);
        setByteField(term49445, term49445.getClass(), "second", (byte) 52);
        setIntField(term49445, term49445.getClass(), "nano", 391302765);
        setField(term49440, term49440.getClass(), "time", term49445);
        setField(term49429, term49429.getClass(), "userPlayDate", term49440);
        setIntField(term49429, term49429.getClass(), "musicId", 628507821);
        setIntField(term49429, term49429.getClass(), "level", 247792610);
        setIntField(term49429, term49429.getClass(), "customId", -2059652097);
        setIntField(term49429, term49429.getClass(), "playedCustom1", 75564248);
        setIntField(term49429, term49429.getClass(), "playedCustom2", -829801689);
        setIntField(term49429, term49429.getClass(), "playedCustom3", 265481386);
        setIntField(term49429, term49429.getClass(), "track", -893720551);
        setIntField(term49429, term49429.getClass(), "score", 696829611);
        setIntField(term49429, term49429.getClass(), "rank", 1751983051);
        setIntField(term49429, term49429.getClass(), "maxCombo", -1416766445);
        setIntField(term49429, term49429.getClass(), "maxChain", -203238563);
        setIntField(term49429, term49429.getClass(), "rateTap", -132358473);
        setIntField(term49429, term49429.getClass(), "rateHold", 130567867);
        setIntField(term49429, term49429.getClass(), "rateSlide", 33782620);
        setIntField(term49429, term49429.getClass(), "rateAir", -818766632);
        setIntField(term49429, term49429.getClass(), "rateFlick", 45627161);
        setIntField(term49429, term49429.getClass(), "judgeGuilty", -206817101);
        setIntField(term49429, term49429.getClass(), "judgeAttack", 1541533024);
        setIntField(term49429, term49429.getClass(), "judgeJustice", -1032828989);
        setIntField(term49429, term49429.getClass(), "judgeCritical", -649944911);
        setIntField(term49429, term49429.getClass(), "playerRating", -1426067073);
        setBooleanField(term49429, term49429.getClass(), "isNewRecord", true);
        setBooleanField(term49429, term49429.getClass(), "isFullCombo", true);
        setIntField(term49429, term49429.getClass(), "fullChainKind", -1679645192);
        setBooleanField(term49429, term49429.getClass(), "isAllJustice", false);
        setIntField(term49429, term49429.getClass(), "characterId", 1524285721);
        setIntField(term49429, term49429.getClass(), "skillId", -808971480);
        setIntField(term49429, term49429.getClass(), "playKind", 534508972);
        setBooleanField(term49429, term49429.getClass(), "isClear", false);
        setIntField(term49429, term49429.getClass(), "skillLevel", -301935716);
        setIntField(term49429, term49429.getClass(), "skillEffect", 1701720681);
        term49481 = new Integer(-378738380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term49481;
        callMethod(klass, "setSkillId", argTypes, term49429, args);
    }

};


