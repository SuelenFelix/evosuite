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
import java.lang.Boolean;

public class RecentResp_setAllJustice_113085206459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54491;
     Object term54543;

    public RecentResp_setAllJustice_113085206459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54491 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54492 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54493 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54497 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54507 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54493, term54493.getClass(), "year", 2011);
        setShortField(term54493, term54493.getClass(), "month", (short) 10);
        setShortField(term54493, term54493.getClass(), "day", (short) 1);
        setField(term54492, term54492.getClass(), "date", term54493);
        setByteField(term54497, term54497.getClass(), "hour", (byte) 18);
        setByteField(term54497, term54497.getClass(), "minute", (byte) 14);
        setByteField(term54497, term54497.getClass(), "second", (byte) 45);
        setIntField(term54497, term54497.getClass(), "nano", 803299439);
        setField(term54492, term54492.getClass(), "time", term54497);
        setField(term54491, term54491.getClass(), "playDate", term54492);
        setIntField(term54503, term54503.getClass(), "year", 2012);
        setShortField(term54503, term54503.getClass(), "month", (short) 9);
        setShortField(term54503, term54503.getClass(), "day", (short) 19);
        setField(term54502, term54502.getClass(), "date", term54503);
        setByteField(term54507, term54507.getClass(), "hour", (byte) 7);
        setByteField(term54507, term54507.getClass(), "minute", (byte) 16);
        setByteField(term54507, term54507.getClass(), "second", (byte) 32);
        setIntField(term54507, term54507.getClass(), "nano", 771452025);
        setField(term54502, term54502.getClass(), "time", term54507);
        setField(term54491, term54491.getClass(), "userPlayDate", term54502);
        setIntField(term54491, term54491.getClass(), "musicId", -1108621848);
        setIntField(term54491, term54491.getClass(), "level", 1868049133);
        setIntField(term54491, term54491.getClass(), "customId", -2041713971);
        setIntField(term54491, term54491.getClass(), "playedCustom1", 752002755);
        setIntField(term54491, term54491.getClass(), "playedCustom2", -975157064);
        setIntField(term54491, term54491.getClass(), "playedCustom3", -378255267);
        setIntField(term54491, term54491.getClass(), "track", -1205835103);
        setIntField(term54491, term54491.getClass(), "score", -2022370596);
        setIntField(term54491, term54491.getClass(), "rank", 856428856);
        setIntField(term54491, term54491.getClass(), "maxCombo", 1295040350);
        setIntField(term54491, term54491.getClass(), "maxChain", 1744402926);
        setIntField(term54491, term54491.getClass(), "rateTap", -68148707);
        setIntField(term54491, term54491.getClass(), "rateHold", -487634357);
        setIntField(term54491, term54491.getClass(), "rateSlide", 52605389);
        setIntField(term54491, term54491.getClass(), "rateAir", -769585004);
        setIntField(term54491, term54491.getClass(), "rateFlick", 483184455);
        setIntField(term54491, term54491.getClass(), "judgeGuilty", -1969040570);
        setIntField(term54491, term54491.getClass(), "judgeAttack", 1627123408);
        setIntField(term54491, term54491.getClass(), "judgeJustice", 782600956);
        setIntField(term54491, term54491.getClass(), "judgeCritical", -1051453067);
        setIntField(term54491, term54491.getClass(), "playerRating", -865849681);
        setBooleanField(term54491, term54491.getClass(), "isNewRecord", false);
        setBooleanField(term54491, term54491.getClass(), "isFullCombo", true);
        setIntField(term54491, term54491.getClass(), "fullChainKind", -1554795442);
        setBooleanField(term54491, term54491.getClass(), "isAllJustice", true);
        setIntField(term54491, term54491.getClass(), "characterId", 1486110844);
        setIntField(term54491, term54491.getClass(), "skillId", 1811211444);
        setIntField(term54491, term54491.getClass(), "playKind", -1188357817);
        setBooleanField(term54491, term54491.getClass(), "isClear", false);
        setIntField(term54491, term54491.getClass(), "skillLevel", 800428961);
        setIntField(term54491, term54491.getClass(), "skillEffect", 1035639807);
        term54543 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term54543;
        callMethod(klass, "setAllJustice", argTypes, term54491, args);
    }

};


