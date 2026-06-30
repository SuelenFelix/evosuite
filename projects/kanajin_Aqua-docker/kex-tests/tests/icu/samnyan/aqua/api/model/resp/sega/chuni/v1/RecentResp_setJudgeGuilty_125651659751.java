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
import java.lang.Integer;

public class RecentResp_setJudgeGuilty_125651659751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54059;
     Object term54111;

    public RecentResp_setJudgeGuilty_125651659751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54059 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54060 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54061 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54065 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54070 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54071 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54075 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54061, term54061.getClass(), "year", 2028);
        setShortField(term54061, term54061.getClass(), "month", (short) 7);
        setShortField(term54061, term54061.getClass(), "day", (short) 17);
        setField(term54060, term54060.getClass(), "date", term54061);
        setByteField(term54065, term54065.getClass(), "hour", (byte) 1);
        setByteField(term54065, term54065.getClass(), "minute", (byte) 57);
        setByteField(term54065, term54065.getClass(), "second", (byte) 11);
        setIntField(term54065, term54065.getClass(), "nano", 379878282);
        setField(term54060, term54060.getClass(), "time", term54065);
        setField(term54059, term54059.getClass(), "playDate", term54060);
        setIntField(term54071, term54071.getClass(), "year", 2019);
        setShortField(term54071, term54071.getClass(), "month", (short) 3);
        setShortField(term54071, term54071.getClass(), "day", (short) 15);
        setField(term54070, term54070.getClass(), "date", term54071);
        setByteField(term54075, term54075.getClass(), "hour", (byte) 22);
        setByteField(term54075, term54075.getClass(), "minute", (byte) 15);
        setByteField(term54075, term54075.getClass(), "second", (byte) 34);
        setIntField(term54075, term54075.getClass(), "nano", 75761129);
        setField(term54070, term54070.getClass(), "time", term54075);
        setField(term54059, term54059.getClass(), "userPlayDate", term54070);
        setIntField(term54059, term54059.getClass(), "musicId", -987757870);
        setIntField(term54059, term54059.getClass(), "level", 2132585005);
        setIntField(term54059, term54059.getClass(), "customId", 451557051);
        setIntField(term54059, term54059.getClass(), "playedCustom1", 71783796);
        setIntField(term54059, term54059.getClass(), "playedCustom2", 2085417929);
        setIntField(term54059, term54059.getClass(), "playedCustom3", 644887242);
        setIntField(term54059, term54059.getClass(), "track", 1544325432);
        setIntField(term54059, term54059.getClass(), "score", 908157389);
        setIntField(term54059, term54059.getClass(), "rank", 691619263);
        setIntField(term54059, term54059.getClass(), "maxCombo", 637841150);
        setIntField(term54059, term54059.getClass(), "maxChain", 1599041316);
        setIntField(term54059, term54059.getClass(), "rateTap", 1478113587);
        setIntField(term54059, term54059.getClass(), "rateHold", 1580986308);
        setIntField(term54059, term54059.getClass(), "rateSlide", -870011438);
        setIntField(term54059, term54059.getClass(), "rateAir", -1767217325);
        setIntField(term54059, term54059.getClass(), "rateFlick", -170630873);
        setIntField(term54059, term54059.getClass(), "judgeGuilty", -1246900588);
        setIntField(term54059, term54059.getClass(), "judgeAttack", 548633933);
        setIntField(term54059, term54059.getClass(), "judgeJustice", -1532179986);
        setIntField(term54059, term54059.getClass(), "judgeCritical", 1644599689);
        setIntField(term54059, term54059.getClass(), "playerRating", 1665477880);
        setBooleanField(term54059, term54059.getClass(), "isNewRecord", true);
        setBooleanField(term54059, term54059.getClass(), "isFullCombo", true);
        setIntField(term54059, term54059.getClass(), "fullChainKind", 2044728583);
        setBooleanField(term54059, term54059.getClass(), "isAllJustice", false);
        setIntField(term54059, term54059.getClass(), "characterId", 64790905);
        setIntField(term54059, term54059.getClass(), "skillId", -1199056049);
        setIntField(term54059, term54059.getClass(), "playKind", -1074336148);
        setBooleanField(term54059, term54059.getClass(), "isClear", true);
        setIntField(term54059, term54059.getClass(), "skillLevel", -561801733);
        setIntField(term54059, term54059.getClass(), "skillEffect", 2134609936);
        term54111 = new Integer(-409989519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54111;
        callMethod(klass, "setJudgeGuilty", argTypes, term54059, args);
    }

};


