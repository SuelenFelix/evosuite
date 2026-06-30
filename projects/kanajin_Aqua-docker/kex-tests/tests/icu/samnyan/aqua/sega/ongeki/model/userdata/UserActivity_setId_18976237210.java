package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserActivity_setId_18976237210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287042;
     Object term287314;

    public UserActivity_setId_18976237210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term287048 = new Long(-4187265590402169996L);
        term287042 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term287044 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term287046 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term287062 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term287063 = newInstance(Class.forName("java.time.LocalDate"));
        Object term287067 = newInstance(Class.forName("java.time.LocalTime"));
        Object term287072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term287073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term287077 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term287042, term287042.getClass(), "id", 1165020947274615127L);
        setLongField(term287044, term287044.getClass(), "id", 735676027341945601L);
        setLongField(term287046, term287046.getClass(), "id", -434406272837356070L);
        setField(term287046, term287046.getClass(), "extId", term287048);
        setField(term287046, term287046.getClass(), "luid", "ERUptLbOom");
        setIntField(term287063, term287063.getClass(), "year", 2023);
        setShortField(term287063, term287063.getClass(), "month", (short) 7);
        setShortField(term287063, term287063.getClass(), "day", (short) 23);
        setField(term287062, term287062.getClass(), "date", term287063);
        setByteField(term287067, term287067.getClass(), "hour", (byte) 14);
        setByteField(term287067, term287067.getClass(), "minute", (byte) 20);
        setByteField(term287067, term287067.getClass(), "second", (byte) 6);
        setIntField(term287067, term287067.getClass(), "nano", 595815701);
        setField(term287062, term287062.getClass(), "time", term287067);
        setField(term287046, term287046.getClass(), "registerTime", term287062);
        setIntField(term287073, term287073.getClass(), "year", 2010);
        setShortField(term287073, term287073.getClass(), "month", (short) 7);
        setShortField(term287073, term287073.getClass(), "day", (short) 20);
        setField(term287072, term287072.getClass(), "date", term287073);
        setByteField(term287077, term287077.getClass(), "hour", (byte) 6);
        setByteField(term287077, term287077.getClass(), "minute", (byte) 46);
        setByteField(term287077, term287077.getClass(), "second", (byte) 28);
        setIntField(term287077, term287077.getClass(), "nano", 655649977);
        setField(term287072, term287072.getClass(), "time", term287077);
        setField(term287046, term287046.getClass(), "accessTime", term287072);
        setField(term287044, term287044.getClass(), "card", term287046);
        setField(term287044, term287044.getClass(), "userName", "bBEslIUoPI");
        setIntField(term287044, term287044.getClass(), "level", 1936424239);
        setIntField(term287044, term287044.getClass(), "reincarnationNum", 389842212);
        setLongField(term287044, term287044.getClass(), "exp", -8525710274851851069L);
        setLongField(term287044, term287044.getClass(), "point", -7399284535712493029L);
        setLongField(term287044, term287044.getClass(), "totalPoint", 7048712643610639817L);
        setIntField(term287044, term287044.getClass(), "playCount", 678068437);
        setIntField(term287044, term287044.getClass(), "jewelCount", 1454786257);
        setIntField(term287044, term287044.getClass(), "totalJewelCount", 1219101209);
        setIntField(term287044, term287044.getClass(), "medalCount", -339641170);
        setIntField(term287044, term287044.getClass(), "playerRating", -1456358645);
        setIntField(term287044, term287044.getClass(), "highestRating", -58778046);
        setIntField(term287044, term287044.getClass(), "battlePoint", -1653954813);
        setIntField(term287044, term287044.getClass(), "bestBattlePoint", 146680795);
        setIntField(term287044, term287044.getClass(), "overDamageBattlePoint", 1102033819);
        setBooleanField(term287044, term287044.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term287044, term287044.getClass(), "nameplateId", -483760060);
        setIntField(term287044, term287044.getClass(), "trophyId", 1798062324);
        setIntField(term287044, term287044.getClass(), "cardId", 1512303261);
        setIntField(term287044, term287044.getClass(), "characterId", 2115862769);
        setIntField(term287044, term287044.getClass(), "characterVoiceNo", 1361584843);
        setIntField(term287044, term287044.getClass(), "tabSetting", -1380535995);
        setIntField(term287044, term287044.getClass(), "tabSortSetting", 322765382);
        setIntField(term287044, term287044.getClass(), "cardCategorySetting", -1849847162);
        setIntField(term287044, term287044.getClass(), "cardSortSetting", -964098977);
        setIntField(term287044, term287044.getClass(), "rivalScoreCategorySetting", -1418072409);
        setIntField(term287044, term287044.getClass(), "playedTutorialBit", -1460855753);
        setIntField(term287044, term287044.getClass(), "firstTutorialCancelNum", -307197050);
        setLongField(term287044, term287044.getClass(), "sumTechHighScore", 7409748702052279983L);
        setLongField(term287044, term287044.getClass(), "sumTechBasicHighScore", 6349639977111060701L);
        setLongField(term287044, term287044.getClass(), "sumTechAdvancedHighScore", 8516573918819578937L);
        setLongField(term287044, term287044.getClass(), "sumTechExpertHighScore", -7405111877661619329L);
        setLongField(term287044, term287044.getClass(), "sumTechMasterHighScore", 1065139155314131399L);
        setLongField(term287044, term287044.getClass(), "sumTechLunaticHighScore", 4862971025915010280L);
        setLongField(term287044, term287044.getClass(), "sumBattleHighScore", -3572845096067371653L);
        setLongField(term287044, term287044.getClass(), "sumBattleBasicHighScore", 1360833426730787147L);
        setLongField(term287044, term287044.getClass(), "sumBattleAdvancedHighScore", -7267930296622341267L);
        setLongField(term287044, term287044.getClass(), "sumBattleExpertHighScore", -7544259202817368739L);
        setLongField(term287044, term287044.getClass(), "sumBattleMasterHighScore", 8548751965741178576L);
        setLongField(term287044, term287044.getClass(), "sumBattleLunaticHighScore", 8471186647310142999L);
        setField(term287044, term287044.getClass(), "eventWatchedDate", "YDRVeGkKiv");
        setField(term287044, term287044.getClass(), "cmEventWatchedDate", "phnhOsIrPf");
        setField(term287044, term287044.getClass(), "firstGameId", "IqCiPyIYlC");
        setField(term287044, term287044.getClass(), "firstRomVersion", "AaoQDNZhnS");
        setField(term287044, term287044.getClass(), "firstDataVersion", "IKAtLbhKWa");
        setField(term287044, term287044.getClass(), "firstPlayDate", "DYgUODVEAY");
        setField(term287044, term287044.getClass(), "lastGameId", "wVWNIpvTso");
        setField(term287044, term287044.getClass(), "lastRomVersion", "fdTrnfevnD");
        setField(term287044, term287044.getClass(), "lastDataVersion", "pSwgKxEgKt");
        setField(term287044, term287044.getClass(), "compatibleCmVersion", "fBoTpMYSyX");
        setField(term287044, term287044.getClass(), "lastPlayDate", "BbROkBKzRp");
        setIntField(term287044, term287044.getClass(), "lastPlaceId", 960424942);
        setField(term287044, term287044.getClass(), "lastPlaceName", "WqsZmoEMhC");
        setIntField(term287044, term287044.getClass(), "lastRegionId", 1894128234);
        setField(term287044, term287044.getClass(), "lastRegionName", "PZnyLdXxJA");
        setIntField(term287044, term287044.getClass(), "lastAllNetId", 201156573);
        setField(term287044, term287044.getClass(), "lastClientId", "vQxIPNOxke");
        setIntField(term287044, term287044.getClass(), "lastUsedDeckId", 308978610);
        setIntField(term287044, term287044.getClass(), "lastPlayMusicLevel", -1017906723);
        setIntField(term287044, term287044.getClass(), "lastEmoneyBrand", -187095556);
        setField(term287042, term287042.getClass(), "user", term287044);
        setIntField(term287042, term287042.getClass(), "kind", -1137660962);
        setIntField(term287042, term287042.getClass(), "activityId", -1432112505);
        setIntField(term287042, term287042.getClass(), "sortNumber", 1112647263);
        setIntField(term287042, term287042.getClass(), "param1", 50515119);
        setIntField(term287042, term287042.getClass(), "param2", -1612007794);
        setIntField(term287042, term287042.getClass(), "param3", 261769376);
        setIntField(term287042, term287042.getClass(), "param4", 282224906);
        term287314 = new Long(-6355695632609765038L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term287314;
        callMethod(klass, "setId", argTypes, term287042, args);
    }

};


