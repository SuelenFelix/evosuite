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

public class RecentResp_setRank_176272027443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53627;
     Object term53679;

    public RecentResp_setRank_176272027443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53627 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term53628 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53629 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53633 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53638 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53639 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53643 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53629, term53629.getClass(), "year", 2018);
        setShortField(term53629, term53629.getClass(), "month", (short) 12);
        setShortField(term53629, term53629.getClass(), "day", (short) 31);
        setField(term53628, term53628.getClass(), "date", term53629);
        setByteField(term53633, term53633.getClass(), "hour", (byte) 21);
        setByteField(term53633, term53633.getClass(), "minute", (byte) 20);
        setByteField(term53633, term53633.getClass(), "second", (byte) 32);
        setIntField(term53633, term53633.getClass(), "nano", 236426663);
        setField(term53628, term53628.getClass(), "time", term53633);
        setField(term53627, term53627.getClass(), "playDate", term53628);
        setIntField(term53639, term53639.getClass(), "year", 2027);
        setShortField(term53639, term53639.getClass(), "month", (short) 10);
        setShortField(term53639, term53639.getClass(), "day", (short) 22);
        setField(term53638, term53638.getClass(), "date", term53639);
        setByteField(term53643, term53643.getClass(), "hour", (byte) 22);
        setByteField(term53643, term53643.getClass(), "minute", (byte) 49);
        setByteField(term53643, term53643.getClass(), "second", (byte) 17);
        setIntField(term53643, term53643.getClass(), "nano", 698349746);
        setField(term53638, term53638.getClass(), "time", term53643);
        setField(term53627, term53627.getClass(), "userPlayDate", term53638);
        setIntField(term53627, term53627.getClass(), "musicId", 2142343992);
        setIntField(term53627, term53627.getClass(), "level", -875414289);
        setIntField(term53627, term53627.getClass(), "customId", 510025419);
        setIntField(term53627, term53627.getClass(), "playedCustom1", 768579195);
        setIntField(term53627, term53627.getClass(), "playedCustom2", 935186156);
        setIntField(term53627, term53627.getClass(), "playedCustom3", -101515724);
        setIntField(term53627, term53627.getClass(), "track", 987526407);
        setIntField(term53627, term53627.getClass(), "score", -1370999464);
        setIntField(term53627, term53627.getClass(), "rank", -409231949);
        setIntField(term53627, term53627.getClass(), "maxCombo", -666074929);
        setIntField(term53627, term53627.getClass(), "maxChain", 1263172764);
        setIntField(term53627, term53627.getClass(), "rateTap", 294155442);
        setIntField(term53627, term53627.getClass(), "rateHold", -790860079);
        setIntField(term53627, term53627.getClass(), "rateSlide", 52653332);
        setIntField(term53627, term53627.getClass(), "rateAir", 605369567);
        setIntField(term53627, term53627.getClass(), "rateFlick", 662969700);
        setIntField(term53627, term53627.getClass(), "judgeGuilty", -907171757);
        setIntField(term53627, term53627.getClass(), "judgeAttack", 1041315057);
        setIntField(term53627, term53627.getClass(), "judgeJustice", 5602462);
        setIntField(term53627, term53627.getClass(), "judgeCritical", 1573768776);
        setIntField(term53627, term53627.getClass(), "playerRating", 1525686645);
        setBooleanField(term53627, term53627.getClass(), "isNewRecord", true);
        setBooleanField(term53627, term53627.getClass(), "isFullCombo", true);
        setIntField(term53627, term53627.getClass(), "fullChainKind", -538376054);
        setBooleanField(term53627, term53627.getClass(), "isAllJustice", true);
        setIntField(term53627, term53627.getClass(), "characterId", -159290084);
        setIntField(term53627, term53627.getClass(), "skillId", -1181936403);
        setIntField(term53627, term53627.getClass(), "playKind", 597843779);
        setBooleanField(term53627, term53627.getClass(), "isClear", false);
        setIntField(term53627, term53627.getClass(), "skillLevel", -920715260);
        setIntField(term53627, term53627.getClass(), "skillEffect", -111304359);
        term53679 = new Integer(-1359946362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53679;
        callMethod(klass, "setRank", argTypes, term53627, args);
    }

};


