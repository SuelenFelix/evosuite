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

public class RecentResp_setCustomId_59007684737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48133;
     Object term48185;

    public RecentResp_setCustomId_59007684737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48133 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term48134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48139 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48149 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48135, term48135.getClass(), "year", 2019);
        setShortField(term48135, term48135.getClass(), "month", (short) 8);
        setShortField(term48135, term48135.getClass(), "day", (short) 6);
        setField(term48134, term48134.getClass(), "date", term48135);
        setByteField(term48139, term48139.getClass(), "hour", (byte) 19);
        setByteField(term48139, term48139.getClass(), "minute", (byte) 30);
        setByteField(term48139, term48139.getClass(), "second", (byte) 36);
        setIntField(term48139, term48139.getClass(), "nano", 118147558);
        setField(term48134, term48134.getClass(), "time", term48139);
        setField(term48133, term48133.getClass(), "playDate", term48134);
        setIntField(term48145, term48145.getClass(), "year", 2010);
        setShortField(term48145, term48145.getClass(), "month", (short) 11);
        setShortField(term48145, term48145.getClass(), "day", (short) 17);
        setField(term48144, term48144.getClass(), "date", term48145);
        setByteField(term48149, term48149.getClass(), "hour", (byte) 7);
        setByteField(term48149, term48149.getClass(), "minute", (byte) 36);
        setByteField(term48149, term48149.getClass(), "second", (byte) 53);
        setIntField(term48149, term48149.getClass(), "nano", 316643445);
        setField(term48144, term48144.getClass(), "time", term48149);
        setField(term48133, term48133.getClass(), "userPlayDate", term48144);
        setIntField(term48133, term48133.getClass(), "musicId", 1727638564);
        setIntField(term48133, term48133.getClass(), "level", 1102029917);
        setIntField(term48133, term48133.getClass(), "customId", 506784803);
        setIntField(term48133, term48133.getClass(), "playedCustom1", -1201816382);
        setIntField(term48133, term48133.getClass(), "playedCustom2", 964841377);
        setIntField(term48133, term48133.getClass(), "playedCustom3", -1503153618);
        setIntField(term48133, term48133.getClass(), "track", -1417720854);
        setIntField(term48133, term48133.getClass(), "score", -231019352);
        setIntField(term48133, term48133.getClass(), "rank", -677712787);
        setIntField(term48133, term48133.getClass(), "maxCombo", -473854701);
        setIntField(term48133, term48133.getClass(), "maxChain", -193355905);
        setIntField(term48133, term48133.getClass(), "rateTap", -104223978);
        setIntField(term48133, term48133.getClass(), "rateHold", 192932780);
        setIntField(term48133, term48133.getClass(), "rateSlide", -902517932);
        setIntField(term48133, term48133.getClass(), "rateAir", 2043141938);
        setIntField(term48133, term48133.getClass(), "rateFlick", 51110531);
        setIntField(term48133, term48133.getClass(), "judgeGuilty", -142424158);
        setIntField(term48133, term48133.getClass(), "judgeAttack", 360866091);
        setIntField(term48133, term48133.getClass(), "judgeJustice", -1711966798);
        setIntField(term48133, term48133.getClass(), "judgeCritical", 414375178);
        setIntField(term48133, term48133.getClass(), "playerRating", -189623871);
        setBooleanField(term48133, term48133.getClass(), "isNewRecord", false);
        setBooleanField(term48133, term48133.getClass(), "isFullCombo", false);
        setIntField(term48133, term48133.getClass(), "fullChainKind", -1500608395);
        setBooleanField(term48133, term48133.getClass(), "isAllJustice", true);
        setIntField(term48133, term48133.getClass(), "characterId", -1957666898);
        setIntField(term48133, term48133.getClass(), "skillId", -1073146570);
        setIntField(term48133, term48133.getClass(), "playKind", -898083613);
        setBooleanField(term48133, term48133.getClass(), "isClear", true);
        setIntField(term48133, term48133.getClass(), "skillLevel", 1072590759);
        setIntField(term48133, term48133.getClass(), "skillEffect", -261873217);
        term48185 = new Integer(275234848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48185;
        callMethod(klass, "setCustomId", argTypes, term48133, args);
    }

};


