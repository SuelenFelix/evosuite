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
import java.lang.Integer;

public class UserData_setTrophyId_179174731381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56283;
     Object term56546;

    public UserData_setTrophyId_179174731381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term56287 = new Long(148047808219672941L);
        term56283 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term56285 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term56301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56316 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term56283, term56283.getClass(), "id", -7658308085805400095L);
        setLongField(term56285, term56285.getClass(), "id", -4985422849657460879L);
        setField(term56285, term56285.getClass(), "extId", term56287);
        setField(term56285, term56285.getClass(), "luid", "siRXAywvyp");
        setIntField(term56302, term56302.getClass(), "year", 2019);
        setShortField(term56302, term56302.getClass(), "month", (short) 5);
        setShortField(term56302, term56302.getClass(), "day", (short) 16);
        setField(term56301, term56301.getClass(), "date", term56302);
        setByteField(term56306, term56306.getClass(), "hour", (byte) 3);
        setByteField(term56306, term56306.getClass(), "minute", (byte) 12);
        setByteField(term56306, term56306.getClass(), "second", (byte) 27);
        setIntField(term56306, term56306.getClass(), "nano", 775737832);
        setField(term56301, term56301.getClass(), "time", term56306);
        setField(term56285, term56285.getClass(), "registerTime", term56301);
        setIntField(term56312, term56312.getClass(), "year", 2016);
        setShortField(term56312, term56312.getClass(), "month", (short) 12);
        setShortField(term56312, term56312.getClass(), "day", (short) 2);
        setField(term56311, term56311.getClass(), "date", term56312);
        setByteField(term56316, term56316.getClass(), "hour", (byte) 7);
        setByteField(term56316, term56316.getClass(), "minute", (byte) 38);
        setByteField(term56316, term56316.getClass(), "second", (byte) 49);
        setIntField(term56316, term56316.getClass(), "nano", 415044053);
        setField(term56311, term56311.getClass(), "time", term56316);
        setField(term56285, term56285.getClass(), "accessTime", term56311);
        setField(term56283, term56283.getClass(), "card", term56285);
        setField(term56283, term56283.getClass(), "userName", "ZRLaReQeFg");
        setIntField(term56283, term56283.getClass(), "level", -1098526777);
        setIntField(term56283, term56283.getClass(), "reincarnationNum", 871491464);
        setLongField(term56283, term56283.getClass(), "exp", -5119974436779485754L);
        setLongField(term56283, term56283.getClass(), "point", -983800227104783410L);
        setLongField(term56283, term56283.getClass(), "totalPoint", 6682873780442022620L);
        setIntField(term56283, term56283.getClass(), "playCount", 1250354269);
        setIntField(term56283, term56283.getClass(), "jewelCount", 695748317);
        setIntField(term56283, term56283.getClass(), "totalJewelCount", -439470959);
        setIntField(term56283, term56283.getClass(), "medalCount", -248472453);
        setIntField(term56283, term56283.getClass(), "playerRating", 1056759659);
        setIntField(term56283, term56283.getClass(), "highestRating", -233313895);
        setIntField(term56283, term56283.getClass(), "battlePoint", 2014416586);
        setIntField(term56283, term56283.getClass(), "bestBattlePoint", 1614071253);
        setIntField(term56283, term56283.getClass(), "overDamageBattlePoint", -548611489);
        setBooleanField(term56283, term56283.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term56283, term56283.getClass(), "nameplateId", 792588182);
        setIntField(term56283, term56283.getClass(), "trophyId", 1145540785);
        setIntField(term56283, term56283.getClass(), "cardId", -1255440898);
        setIntField(term56283, term56283.getClass(), "characterId", -1185096329);
        setIntField(term56283, term56283.getClass(), "characterVoiceNo", -2051822073);
        setIntField(term56283, term56283.getClass(), "tabSetting", -838891056);
        setIntField(term56283, term56283.getClass(), "tabSortSetting", -2133180225);
        setIntField(term56283, term56283.getClass(), "cardCategorySetting", -1486915040);
        setIntField(term56283, term56283.getClass(), "cardSortSetting", -1960290626);
        setIntField(term56283, term56283.getClass(), "rivalScoreCategorySetting", -1941903722);
        setIntField(term56283, term56283.getClass(), "playedTutorialBit", 491009356);
        setIntField(term56283, term56283.getClass(), "firstTutorialCancelNum", 1180952236);
        setLongField(term56283, term56283.getClass(), "sumTechHighScore", -3902939984522157167L);
        setLongField(term56283, term56283.getClass(), "sumTechBasicHighScore", 7961135201719676082L);
        setLongField(term56283, term56283.getClass(), "sumTechAdvancedHighScore", -1611050402158000680L);
        setLongField(term56283, term56283.getClass(), "sumTechExpertHighScore", 8861575654665150501L);
        setLongField(term56283, term56283.getClass(), "sumTechMasterHighScore", 293702982753277786L);
        setLongField(term56283, term56283.getClass(), "sumTechLunaticHighScore", 7809414208372445190L);
        setLongField(term56283, term56283.getClass(), "sumBattleHighScore", 3056037435259866024L);
        setLongField(term56283, term56283.getClass(), "sumBattleBasicHighScore", 1372923762481191417L);
        setLongField(term56283, term56283.getClass(), "sumBattleAdvancedHighScore", 4307370135092659893L);
        setLongField(term56283, term56283.getClass(), "sumBattleExpertHighScore", -9046114186297002593L);
        setLongField(term56283, term56283.getClass(), "sumBattleMasterHighScore", -398055953150289256L);
        setLongField(term56283, term56283.getClass(), "sumBattleLunaticHighScore", -1356391415982968329L);
        setField(term56283, term56283.getClass(), "eventWatchedDate", "cOcXspUxKR");
        setField(term56283, term56283.getClass(), "cmEventWatchedDate", "JNzgWUmqtl");
        setField(term56283, term56283.getClass(), "firstGameId", "UxVfWaXiSr");
        setField(term56283, term56283.getClass(), "firstRomVersion", "yTrvklotrs");
        setField(term56283, term56283.getClass(), "firstDataVersion", "kNkFIdfwqs");
        setField(term56283, term56283.getClass(), "firstPlayDate", "sHLdqoTjnP");
        setField(term56283, term56283.getClass(), "lastGameId", "UakuVGzEav");
        setField(term56283, term56283.getClass(), "lastRomVersion", "DxiwTTouEo");
        setField(term56283, term56283.getClass(), "lastDataVersion", "ghoklPMuMt");
        setField(term56283, term56283.getClass(), "compatibleCmVersion", "uAgfQbLPeZ");
        setField(term56283, term56283.getClass(), "lastPlayDate", "aZiFZfzhQT");
        setIntField(term56283, term56283.getClass(), "lastPlaceId", 1549827025);
        setField(term56283, term56283.getClass(), "lastPlaceName", "HbzAbCwWRh");
        setIntField(term56283, term56283.getClass(), "lastRegionId", 523998499);
        setField(term56283, term56283.getClass(), "lastRegionName", "yBgWgFtVxP");
        setIntField(term56283, term56283.getClass(), "lastAllNetId", -808741755);
        setField(term56283, term56283.getClass(), "lastClientId", "NAwiEDVBcB");
        setIntField(term56283, term56283.getClass(), "lastUsedDeckId", -1088446142);
        setIntField(term56283, term56283.getClass(), "lastPlayMusicLevel", 342337914);
        setIntField(term56283, term56283.getClass(), "lastEmoneyBrand", 920216419);
        term56546 = new Integer(-1576226952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56546;
        callMethod(klass, "setTrophyId", argTypes, term56283, args);
    }

};


