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

public class RecentResp_getSkillEffect_21443012132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47849;

    public RecentResp_getSkillEffect_21443012132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47849 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47850 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47851 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47855 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47860 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47861 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47865 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47851, term47851.getClass(), "year", 2020);
        setShortField(term47851, term47851.getClass(), "month", (short) 12);
        setShortField(term47851, term47851.getClass(), "day", (short) 10);
        setField(term47850, term47850.getClass(), "date", term47851);
        setByteField(term47855, term47855.getClass(), "hour", (byte) 3);
        setByteField(term47855, term47855.getClass(), "minute", (byte) 40);
        setByteField(term47855, term47855.getClass(), "second", (byte) 14);
        setIntField(term47855, term47855.getClass(), "nano", 879978907);
        setField(term47850, term47850.getClass(), "time", term47855);
        setField(term47849, term47849.getClass(), "playDate", term47850);
        setIntField(term47861, term47861.getClass(), "year", 2010);
        setShortField(term47861, term47861.getClass(), "month", (short) 3);
        setShortField(term47861, term47861.getClass(), "day", (short) 31);
        setField(term47860, term47860.getClass(), "date", term47861);
        setByteField(term47865, term47865.getClass(), "hour", (byte) 17);
        setByteField(term47865, term47865.getClass(), "minute", (byte) 7);
        setByteField(term47865, term47865.getClass(), "second", (byte) 55);
        setIntField(term47865, term47865.getClass(), "nano", 725965566);
        setField(term47860, term47860.getClass(), "time", term47865);
        setField(term47849, term47849.getClass(), "userPlayDate", term47860);
        setIntField(term47849, term47849.getClass(), "musicId", -781333853);
        setIntField(term47849, term47849.getClass(), "level", 158137467);
        setIntField(term47849, term47849.getClass(), "customId", 1299041951);
        setIntField(term47849, term47849.getClass(), "playedCustom1", -1772128093);
        setIntField(term47849, term47849.getClass(), "playedCustom2", -2057880798);
        setIntField(term47849, term47849.getClass(), "playedCustom3", -2041732081);
        setIntField(term47849, term47849.getClass(), "track", 2073870078);
        setIntField(term47849, term47849.getClass(), "score", 1649066040);
        setIntField(term47849, term47849.getClass(), "rank", -640093979);
        setIntField(term47849, term47849.getClass(), "maxCombo", 1665282382);
        setIntField(term47849, term47849.getClass(), "maxChain", 1536865175);
        setIntField(term47849, term47849.getClass(), "rateTap", -1059947211);
        setIntField(term47849, term47849.getClass(), "rateHold", -768583538);
        setIntField(term47849, term47849.getClass(), "rateSlide", 372329686);
        setIntField(term47849, term47849.getClass(), "rateAir", -381739191);
        setIntField(term47849, term47849.getClass(), "rateFlick", -432438127);
        setIntField(term47849, term47849.getClass(), "judgeGuilty", 44813544);
        setIntField(term47849, term47849.getClass(), "judgeAttack", 654539936);
        setIntField(term47849, term47849.getClass(), "judgeJustice", -929524036);
        setIntField(term47849, term47849.getClass(), "judgeCritical", 1539575963);
        setIntField(term47849, term47849.getClass(), "playerRating", -381662221);
        setBooleanField(term47849, term47849.getClass(), "isNewRecord", true);
        setBooleanField(term47849, term47849.getClass(), "isFullCombo", true);
        setIntField(term47849, term47849.getClass(), "fullChainKind", -1367263864);
        setBooleanField(term47849, term47849.getClass(), "isAllJustice", false);
        setIntField(term47849, term47849.getClass(), "characterId", 1810292112);
        setIntField(term47849, term47849.getClass(), "skillId", 385619995);
        setIntField(term47849, term47849.getClass(), "playKind", -920852160);
        setBooleanField(term47849, term47849.getClass(), "isClear", true);
        setIntField(term47849, term47849.getClass(), "skillLevel", -1975385844);
        setIntField(term47849, term47849.getClass(), "skillEffect", -720629032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillEffect", argTypes, term47849, args);
    }

};


