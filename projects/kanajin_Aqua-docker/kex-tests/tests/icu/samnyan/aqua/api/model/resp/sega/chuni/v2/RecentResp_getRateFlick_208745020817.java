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

public class RecentResp_getRateFlick_208745020817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47069;

    public RecentResp_getRateFlick_208745020817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47069 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47070 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47071 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47075 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47080 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47081 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47085 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47071, term47071.getClass(), "year", 2010);
        setShortField(term47071, term47071.getClass(), "month", (short) 5);
        setShortField(term47071, term47071.getClass(), "day", (short) 27);
        setField(term47070, term47070.getClass(), "date", term47071);
        setByteField(term47075, term47075.getClass(), "hour", (byte) 12);
        setByteField(term47075, term47075.getClass(), "minute", (byte) 53);
        setByteField(term47075, term47075.getClass(), "second", (byte) 45);
        setIntField(term47075, term47075.getClass(), "nano", 508314626);
        setField(term47070, term47070.getClass(), "time", term47075);
        setField(term47069, term47069.getClass(), "playDate", term47070);
        setIntField(term47081, term47081.getClass(), "year", 2028);
        setShortField(term47081, term47081.getClass(), "month", (short) 2);
        setShortField(term47081, term47081.getClass(), "day", (short) 29);
        setField(term47080, term47080.getClass(), "date", term47081);
        setByteField(term47085, term47085.getClass(), "hour", (byte) 9);
        setByteField(term47085, term47085.getClass(), "minute", (byte) 45);
        setByteField(term47085, term47085.getClass(), "second", (byte) 4);
        setIntField(term47085, term47085.getClass(), "nano", 508964901);
        setField(term47080, term47080.getClass(), "time", term47085);
        setField(term47069, term47069.getClass(), "userPlayDate", term47080);
        setIntField(term47069, term47069.getClass(), "musicId", 1181771633);
        setIntField(term47069, term47069.getClass(), "level", -21975974);
        setIntField(term47069, term47069.getClass(), "customId", -862969915);
        setIntField(term47069, term47069.getClass(), "playedCustom1", -1289681614);
        setIntField(term47069, term47069.getClass(), "playedCustom2", 496461454);
        setIntField(term47069, term47069.getClass(), "playedCustom3", -697047947);
        setIntField(term47069, term47069.getClass(), "track", 505327656);
        setIntField(term47069, term47069.getClass(), "score", 1779734830);
        setIntField(term47069, term47069.getClass(), "rank", -714618793);
        setIntField(term47069, term47069.getClass(), "maxCombo", 1350743761);
        setIntField(term47069, term47069.getClass(), "maxChain", -2100246850);
        setIntField(term47069, term47069.getClass(), "rateTap", 174682854);
        setIntField(term47069, term47069.getClass(), "rateHold", -1618786023);
        setIntField(term47069, term47069.getClass(), "rateSlide", -316033780);
        setIntField(term47069, term47069.getClass(), "rateAir", -1242223364);
        setIntField(term47069, term47069.getClass(), "rateFlick", -347672279);
        setIntField(term47069, term47069.getClass(), "judgeGuilty", -2001561246);
        setIntField(term47069, term47069.getClass(), "judgeAttack", -526492477);
        setIntField(term47069, term47069.getClass(), "judgeJustice", 934758494);
        setIntField(term47069, term47069.getClass(), "judgeCritical", -1458746421);
        setIntField(term47069, term47069.getClass(), "playerRating", 1248508832);
        setBooleanField(term47069, term47069.getClass(), "isNewRecord", false);
        setBooleanField(term47069, term47069.getClass(), "isFullCombo", false);
        setIntField(term47069, term47069.getClass(), "fullChainKind", -1508290965);
        setBooleanField(term47069, term47069.getClass(), "isAllJustice", false);
        setIntField(term47069, term47069.getClass(), "characterId", -537204050);
        setIntField(term47069, term47069.getClass(), "skillId", 549083285);
        setIntField(term47069, term47069.getClass(), "playKind", 110630919);
        setBooleanField(term47069, term47069.getClass(), "isClear", false);
        setIntField(term47069, term47069.getClass(), "skillLevel", 2002558305);
        setIntField(term47069, term47069.getClass(), "skillEffect", -1729207675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateFlick", argTypes, term47069, args);
    }

};


