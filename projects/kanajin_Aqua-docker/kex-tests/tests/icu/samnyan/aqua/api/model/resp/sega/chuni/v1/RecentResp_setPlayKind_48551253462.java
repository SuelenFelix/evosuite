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

public class RecentResp_setPlayKind_48551253462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54653;
     Object term54705;

    public RecentResp_setPlayKind_48551253462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54653 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term54654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54659 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54669 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term54655, term54655.getClass(), "year", 2028);
        setShortField(term54655, term54655.getClass(), "month", (short) 2);
        setShortField(term54655, term54655.getClass(), "day", (short) 8);
        setField(term54654, term54654.getClass(), "date", term54655);
        setByteField(term54659, term54659.getClass(), "hour", (byte) 12);
        setByteField(term54659, term54659.getClass(), "minute", (byte) 27);
        setByteField(term54659, term54659.getClass(), "second", (byte) 18);
        setIntField(term54659, term54659.getClass(), "nano", 853147382);
        setField(term54654, term54654.getClass(), "time", term54659);
        setField(term54653, term54653.getClass(), "playDate", term54654);
        setIntField(term54665, term54665.getClass(), "year", 2028);
        setShortField(term54665, term54665.getClass(), "month", (short) 10);
        setShortField(term54665, term54665.getClass(), "day", (short) 3);
        setField(term54664, term54664.getClass(), "date", term54665);
        setByteField(term54669, term54669.getClass(), "hour", (byte) 22);
        setByteField(term54669, term54669.getClass(), "minute", (byte) 20);
        setByteField(term54669, term54669.getClass(), "second", (byte) 16);
        setIntField(term54669, term54669.getClass(), "nano", 358560291);
        setField(term54664, term54664.getClass(), "time", term54669);
        setField(term54653, term54653.getClass(), "userPlayDate", term54664);
        setIntField(term54653, term54653.getClass(), "musicId", -133199375);
        setIntField(term54653, term54653.getClass(), "level", -356245449);
        setIntField(term54653, term54653.getClass(), "customId", -1305056502);
        setIntField(term54653, term54653.getClass(), "playedCustom1", 1382545880);
        setIntField(term54653, term54653.getClass(), "playedCustom2", -1299406001);
        setIntField(term54653, term54653.getClass(), "playedCustom3", -1360145510);
        setIntField(term54653, term54653.getClass(), "track", -1122695171);
        setIntField(term54653, term54653.getClass(), "score", -1304945951);
        setIntField(term54653, term54653.getClass(), "rank", 1324880713);
        setIntField(term54653, term54653.getClass(), "maxCombo", -331841554);
        setIntField(term54653, term54653.getClass(), "maxChain", 913848623);
        setIntField(term54653, term54653.getClass(), "rateTap", 1449221084);
        setIntField(term54653, term54653.getClass(), "rateHold", -217809217);
        setIntField(term54653, term54653.getClass(), "rateSlide", -473949548);
        setIntField(term54653, term54653.getClass(), "rateAir", 1898831696);
        setIntField(term54653, term54653.getClass(), "rateFlick", 1811064455);
        setIntField(term54653, term54653.getClass(), "judgeGuilty", 1183674366);
        setIntField(term54653, term54653.getClass(), "judgeAttack", 2120314865);
        setIntField(term54653, term54653.getClass(), "judgeJustice", -1783088801);
        setIntField(term54653, term54653.getClass(), "judgeCritical", 353452001);
        setIntField(term54653, term54653.getClass(), "playerRating", -1160759211);
        setBooleanField(term54653, term54653.getClass(), "isNewRecord", false);
        setBooleanField(term54653, term54653.getClass(), "isFullCombo", false);
        setIntField(term54653, term54653.getClass(), "fullChainKind", 118302577);
        setBooleanField(term54653, term54653.getClass(), "isAllJustice", false);
        setIntField(term54653, term54653.getClass(), "characterId", -1192086944);
        setIntField(term54653, term54653.getClass(), "skillId", 1689097670);
        setIntField(term54653, term54653.getClass(), "playKind", -229058840);
        setBooleanField(term54653, term54653.getClass(), "isClear", true);
        setIntField(term54653, term54653.getClass(), "skillLevel", -445086770);
        setIntField(term54653, term54653.getClass(), "skillEffect", 1555977804);
        term54705 = new Integer(-1039875364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54705;
        callMethod(klass, "setPlayKind", argTypes, term54653, args);
    }

};


