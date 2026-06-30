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

public class RecentResp_setUserPlayDate_126261167934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47963;
     Object term48015;

    public RecentResp_setUserPlayDate_126261167934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47963 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47964 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47965 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47969 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47974 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47979 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47965, term47965.getClass(), "year", 2023);
        setShortField(term47965, term47965.getClass(), "month", (short) 6);
        setShortField(term47965, term47965.getClass(), "day", (short) 11);
        setField(term47964, term47964.getClass(), "date", term47965);
        setByteField(term47969, term47969.getClass(), "hour", (byte) 20);
        setByteField(term47969, term47969.getClass(), "minute", (byte) 37);
        setByteField(term47969, term47969.getClass(), "second", (byte) 26);
        setIntField(term47969, term47969.getClass(), "nano", 879792435);
        setField(term47964, term47964.getClass(), "time", term47969);
        setField(term47963, term47963.getClass(), "playDate", term47964);
        setIntField(term47975, term47975.getClass(), "year", 2016);
        setShortField(term47975, term47975.getClass(), "month", (short) 12);
        setShortField(term47975, term47975.getClass(), "day", (short) 20);
        setField(term47974, term47974.getClass(), "date", term47975);
        setByteField(term47979, term47979.getClass(), "hour", (byte) 20);
        setByteField(term47979, term47979.getClass(), "minute", (byte) 42);
        setByteField(term47979, term47979.getClass(), "second", (byte) 4);
        setIntField(term47979, term47979.getClass(), "nano", 499637837);
        setField(term47974, term47974.getClass(), "time", term47979);
        setField(term47963, term47963.getClass(), "userPlayDate", term47974);
        setIntField(term47963, term47963.getClass(), "musicId", 186917839);
        setIntField(term47963, term47963.getClass(), "level", 1727889509);
        setIntField(term47963, term47963.getClass(), "customId", -159961860);
        setIntField(term47963, term47963.getClass(), "playedCustom1", -1656685141);
        setIntField(term47963, term47963.getClass(), "playedCustom2", -1550347560);
        setIntField(term47963, term47963.getClass(), "playedCustom3", 1130655068);
        setIntField(term47963, term47963.getClass(), "track", 1747437566);
        setIntField(term47963, term47963.getClass(), "score", -1175737970);
        setIntField(term47963, term47963.getClass(), "rank", 891165187);
        setIntField(term47963, term47963.getClass(), "maxCombo", 1608737678);
        setIntField(term47963, term47963.getClass(), "maxChain", -1605443550);
        setIntField(term47963, term47963.getClass(), "rateTap", -735690372);
        setIntField(term47963, term47963.getClass(), "rateHold", 110644904);
        setIntField(term47963, term47963.getClass(), "rateSlide", -1457905205);
        setIntField(term47963, term47963.getClass(), "rateAir", 1722454323);
        setIntField(term47963, term47963.getClass(), "rateFlick", 630174216);
        setIntField(term47963, term47963.getClass(), "judgeGuilty", -1081282297);
        setIntField(term47963, term47963.getClass(), "judgeAttack", 1331103887);
        setIntField(term47963, term47963.getClass(), "judgeJustice", 637911543);
        setIntField(term47963, term47963.getClass(), "judgeCritical", -779100899);
        setIntField(term47963, term47963.getClass(), "playerRating", -1750603840);
        setBooleanField(term47963, term47963.getClass(), "isNewRecord", true);
        setBooleanField(term47963, term47963.getClass(), "isFullCombo", false);
        setIntField(term47963, term47963.getClass(), "fullChainKind", 2088919651);
        setBooleanField(term47963, term47963.getClass(), "isAllJustice", true);
        setIntField(term47963, term47963.getClass(), "characterId", 949997254);
        setIntField(term47963, term47963.getClass(), "skillId", 690762493);
        setIntField(term47963, term47963.getClass(), "playKind", -1050083704);
        setBooleanField(term47963, term47963.getClass(), "isClear", true);
        setIntField(term47963, term47963.getClass(), "skillLevel", -1513402749);
        setIntField(term47963, term47963.getClass(), "skillEffect", -1865692837);
        term48015 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48016 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48020 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term48016, term48016.getClass(), "year", 2017);
        setShortField(term48016, term48016.getClass(), "month", (short) 1);
        setShortField(term48016, term48016.getClass(), "day", (short) 2);
        setField(term48015, term48015.getClass(), "date", term48016);
        setByteField(term48020, term48020.getClass(), "hour", (byte) 17);
        setByteField(term48020, term48020.getClass(), "minute", (byte) 7);
        setByteField(term48020, term48020.getClass(), "second", (byte) 40);
        setIntField(term48020, term48020.getClass(), "nano", 688544705);
        setField(term48015, term48015.getClass(), "time", term48020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term48015;
        callMethod(klass, "setUserPlayDate", argTypes, term47963, args);
    }

};


