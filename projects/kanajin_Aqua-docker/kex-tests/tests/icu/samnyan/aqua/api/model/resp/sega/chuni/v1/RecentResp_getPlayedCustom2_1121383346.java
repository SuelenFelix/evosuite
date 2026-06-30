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

public class RecentResp_getPlayedCustom2_1121383346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51667;

    public RecentResp_getPlayedCustom2_1121383346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51667 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term51668 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51669 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51673 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51683 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51669, term51669.getClass(), "year", 2024);
        setShortField(term51669, term51669.getClass(), "month", (short) 5);
        setShortField(term51669, term51669.getClass(), "day", (short) 8);
        setField(term51668, term51668.getClass(), "date", term51669);
        setByteField(term51673, term51673.getClass(), "hour", (byte) 10);
        setByteField(term51673, term51673.getClass(), "minute", (byte) 21);
        setByteField(term51673, term51673.getClass(), "second", (byte) 1);
        setIntField(term51673, term51673.getClass(), "nano", 912060546);
        setField(term51668, term51668.getClass(), "time", term51673);
        setField(term51667, term51667.getClass(), "playDate", term51668);
        setIntField(term51679, term51679.getClass(), "year", 2016);
        setShortField(term51679, term51679.getClass(), "month", (short) 1);
        setShortField(term51679, term51679.getClass(), "day", (short) 22);
        setField(term51678, term51678.getClass(), "date", term51679);
        setByteField(term51683, term51683.getClass(), "hour", (byte) 23);
        setByteField(term51683, term51683.getClass(), "minute", (byte) 0);
        setByteField(term51683, term51683.getClass(), "second", (byte) 1);
        setIntField(term51683, term51683.getClass(), "nano", 558329369);
        setField(term51678, term51678.getClass(), "time", term51683);
        setField(term51667, term51667.getClass(), "userPlayDate", term51678);
        setIntField(term51667, term51667.getClass(), "musicId", 164755425);
        setIntField(term51667, term51667.getClass(), "level", 205469595);
        setIntField(term51667, term51667.getClass(), "customId", -638606539);
        setIntField(term51667, term51667.getClass(), "playedCustom1", -172607907);
        setIntField(term51667, term51667.getClass(), "playedCustom2", 182656750);
        setIntField(term51667, term51667.getClass(), "playedCustom3", -51407538);
        setIntField(term51667, term51667.getClass(), "track", -465783748);
        setIntField(term51667, term51667.getClass(), "score", 1780832439);
        setIntField(term51667, term51667.getClass(), "rank", 1781593194);
        setIntField(term51667, term51667.getClass(), "maxCombo", -929366947);
        setIntField(term51667, term51667.getClass(), "maxChain", -10579292);
        setIntField(term51667, term51667.getClass(), "rateTap", 2042788478);
        setIntField(term51667, term51667.getClass(), "rateHold", -620591021);
        setIntField(term51667, term51667.getClass(), "rateSlide", -766656824);
        setIntField(term51667, term51667.getClass(), "rateAir", 137514813);
        setIntField(term51667, term51667.getClass(), "rateFlick", -590298353);
        setIntField(term51667, term51667.getClass(), "judgeGuilty", -917544425);
        setIntField(term51667, term51667.getClass(), "judgeAttack", -1044762733);
        setIntField(term51667, term51667.getClass(), "judgeJustice", 446184231);
        setIntField(term51667, term51667.getClass(), "judgeCritical", 1313599240);
        setIntField(term51667, term51667.getClass(), "playerRating", 1889501733);
        setBooleanField(term51667, term51667.getClass(), "isNewRecord", true);
        setBooleanField(term51667, term51667.getClass(), "isFullCombo", false);
        setIntField(term51667, term51667.getClass(), "fullChainKind", 1316243148);
        setBooleanField(term51667, term51667.getClass(), "isAllJustice", true);
        setIntField(term51667, term51667.getClass(), "characterId", 1524913540);
        setIntField(term51667, term51667.getClass(), "skillId", -1924743705);
        setIntField(term51667, term51667.getClass(), "playKind", -1829672767);
        setBooleanField(term51667, term51667.getClass(), "isClear", true);
        setIntField(term51667, term51667.getClass(), "skillLevel", -311098933);
        setIntField(term51667, term51667.getClass(), "skillEffect", -1778687889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedCustom2", argTypes, term51667, args);
    }

};


