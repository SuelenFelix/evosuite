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

public class RecentResp_setSkillEffect_204224569565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49645;
     Object term49697;

    public RecentResp_setSkillEffect_204224569565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49645 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term49646 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49647 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49651 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49656 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49657 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49661 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49647, term49647.getClass(), "year", 2013);
        setShortField(term49647, term49647.getClass(), "month", (short) 8);
        setShortField(term49647, term49647.getClass(), "day", (short) 30);
        setField(term49646, term49646.getClass(), "date", term49647);
        setByteField(term49651, term49651.getClass(), "hour", (byte) 23);
        setByteField(term49651, term49651.getClass(), "minute", (byte) 18);
        setByteField(term49651, term49651.getClass(), "second", (byte) 55);
        setIntField(term49651, term49651.getClass(), "nano", 174457563);
        setField(term49646, term49646.getClass(), "time", term49651);
        setField(term49645, term49645.getClass(), "playDate", term49646);
        setIntField(term49657, term49657.getClass(), "year", 2025);
        setShortField(term49657, term49657.getClass(), "month", (short) 12);
        setShortField(term49657, term49657.getClass(), "day", (short) 30);
        setField(term49656, term49656.getClass(), "date", term49657);
        setByteField(term49661, term49661.getClass(), "hour", (byte) 16);
        setByteField(term49661, term49661.getClass(), "minute", (byte) 48);
        setByteField(term49661, term49661.getClass(), "second", (byte) 54);
        setIntField(term49661, term49661.getClass(), "nano", 288599555);
        setField(term49656, term49656.getClass(), "time", term49661);
        setField(term49645, term49645.getClass(), "userPlayDate", term49656);
        setIntField(term49645, term49645.getClass(), "musicId", 505497573);
        setIntField(term49645, term49645.getClass(), "level", 1848062442);
        setIntField(term49645, term49645.getClass(), "customId", -122481618);
        setIntField(term49645, term49645.getClass(), "playedCustom1", -82929535);
        setIntField(term49645, term49645.getClass(), "playedCustom2", 1850505181);
        setIntField(term49645, term49645.getClass(), "playedCustom3", 324766253);
        setIntField(term49645, term49645.getClass(), "track", -1128978986);
        setIntField(term49645, term49645.getClass(), "score", 192962115);
        setIntField(term49645, term49645.getClass(), "rank", 1531205463);
        setIntField(term49645, term49645.getClass(), "maxCombo", 586115489);
        setIntField(term49645, term49645.getClass(), "maxChain", 1377331021);
        setIntField(term49645, term49645.getClass(), "rateTap", 1915536131);
        setIntField(term49645, term49645.getClass(), "rateHold", 936561631);
        setIntField(term49645, term49645.getClass(), "rateSlide", -160474197);
        setIntField(term49645, term49645.getClass(), "rateAir", 279768924);
        setIntField(term49645, term49645.getClass(), "rateFlick", 1949719112);
        setIntField(term49645, term49645.getClass(), "judgeGuilty", 203059697);
        setIntField(term49645, term49645.getClass(), "judgeAttack", 260352378);
        setIntField(term49645, term49645.getClass(), "judgeJustice", -1344061485);
        setIntField(term49645, term49645.getClass(), "judgeCritical", -13926283);
        setIntField(term49645, term49645.getClass(), "playerRating", -1240452164);
        setBooleanField(term49645, term49645.getClass(), "isNewRecord", true);
        setBooleanField(term49645, term49645.getClass(), "isFullCombo", false);
        setIntField(term49645, term49645.getClass(), "fullChainKind", 501130109);
        setBooleanField(term49645, term49645.getClass(), "isAllJustice", false);
        setIntField(term49645, term49645.getClass(), "characterId", -1307655183);
        setIntField(term49645, term49645.getClass(), "skillId", 1309934432);
        setIntField(term49645, term49645.getClass(), "playKind", 909183017);
        setBooleanField(term49645, term49645.getClass(), "isClear", true);
        setIntField(term49645, term49645.getClass(), "skillLevel", -2115858923);
        setIntField(term49645, term49645.getClass(), "skillEffect", 1709658376);
        term49697 = new Integer(-1235730396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term49697;
        callMethod(klass, "setSkillEffect", argTypes, term49645, args);
    }

};


