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

public class UserData_getSumTechAdvancedHighScore_202318968132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35454;

    public UserData_getSumTechAdvancedHighScore_202318968132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35458 = new Long(6005241913654469005L);
        term35454 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term35456 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term35472 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35473 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35477 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35482 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35483 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35487 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term35454, term35454.getClass(), "id", 8601797948269882230L);
        setLongField(term35456, term35456.getClass(), "id", -7129626484175473918L);
        setField(term35456, term35456.getClass(), "extId", term35458);
        setField(term35456, term35456.getClass(), "luid", "mJJkYzNPob");
        setIntField(term35473, term35473.getClass(), "year", 2014);
        setShortField(term35473, term35473.getClass(), "month", (short) 6);
        setShortField(term35473, term35473.getClass(), "day", (short) 28);
        setField(term35472, term35472.getClass(), "date", term35473);
        setByteField(term35477, term35477.getClass(), "hour", (byte) 7);
        setByteField(term35477, term35477.getClass(), "minute", (byte) 14);
        setByteField(term35477, term35477.getClass(), "second", (byte) 59);
        setIntField(term35477, term35477.getClass(), "nano", 314278386);
        setField(term35472, term35472.getClass(), "time", term35477);
        setField(term35456, term35456.getClass(), "registerTime", term35472);
        setIntField(term35483, term35483.getClass(), "year", 2015);
        setShortField(term35483, term35483.getClass(), "month", (short) 10);
        setShortField(term35483, term35483.getClass(), "day", (short) 8);
        setField(term35482, term35482.getClass(), "date", term35483);
        setByteField(term35487, term35487.getClass(), "hour", (byte) 22);
        setByteField(term35487, term35487.getClass(), "minute", (byte) 20);
        setByteField(term35487, term35487.getClass(), "second", (byte) 59);
        setIntField(term35487, term35487.getClass(), "nano", 350521903);
        setField(term35482, term35482.getClass(), "time", term35487);
        setField(term35456, term35456.getClass(), "accessTime", term35482);
        setField(term35454, term35454.getClass(), "card", term35456);
        setField(term35454, term35454.getClass(), "userName", "mRDwekkZQg");
        setIntField(term35454, term35454.getClass(), "level", 387128751);
        setIntField(term35454, term35454.getClass(), "reincarnationNum", 1220621259);
        setLongField(term35454, term35454.getClass(), "exp", -470660852193401098L);
        setLongField(term35454, term35454.getClass(), "point", -2861878171001013253L);
        setLongField(term35454, term35454.getClass(), "totalPoint", 8195384410089351384L);
        setIntField(term35454, term35454.getClass(), "playCount", 272507740);
        setIntField(term35454, term35454.getClass(), "jewelCount", -2117539025);
        setIntField(term35454, term35454.getClass(), "totalJewelCount", 736842788);
        setIntField(term35454, term35454.getClass(), "medalCount", 416550042);
        setIntField(term35454, term35454.getClass(), "playerRating", 1745727714);
        setIntField(term35454, term35454.getClass(), "highestRating", -1577886337);
        setIntField(term35454, term35454.getClass(), "battlePoint", -481394578);
        setIntField(term35454, term35454.getClass(), "bestBattlePoint", 1440683242);
        setIntField(term35454, term35454.getClass(), "overDamageBattlePoint", -1746192055);
        setBooleanField(term35454, term35454.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term35454, term35454.getClass(), "nameplateId", -996911099);
        setIntField(term35454, term35454.getClass(), "trophyId", -610865659);
        setIntField(term35454, term35454.getClass(), "cardId", 2044119255);
        setIntField(term35454, term35454.getClass(), "characterId", -1924668199);
        setIntField(term35454, term35454.getClass(), "characterVoiceNo", 903039854);
        setIntField(term35454, term35454.getClass(), "tabSetting", -705528573);
        setIntField(term35454, term35454.getClass(), "tabSortSetting", -480070896);
        setIntField(term35454, term35454.getClass(), "cardCategorySetting", -1811732249);
        setIntField(term35454, term35454.getClass(), "cardSortSetting", 1993504802);
        setIntField(term35454, term35454.getClass(), "rivalScoreCategorySetting", 526852618);
        setIntField(term35454, term35454.getClass(), "playedTutorialBit", 903788782);
        setIntField(term35454, term35454.getClass(), "firstTutorialCancelNum", -608033702);
        setLongField(term35454, term35454.getClass(), "sumTechHighScore", -6437827706975956105L);
        setLongField(term35454, term35454.getClass(), "sumTechBasicHighScore", -4890319435899707472L);
        setLongField(term35454, term35454.getClass(), "sumTechAdvancedHighScore", 6556282323732455484L);
        setLongField(term35454, term35454.getClass(), "sumTechExpertHighScore", -6266533510820240265L);
        setLongField(term35454, term35454.getClass(), "sumTechMasterHighScore", 3350405455840199132L);
        setLongField(term35454, term35454.getClass(), "sumTechLunaticHighScore", 2490169994997257831L);
        setLongField(term35454, term35454.getClass(), "sumBattleHighScore", 8578793794565531960L);
        setLongField(term35454, term35454.getClass(), "sumBattleBasicHighScore", -3649565702016413399L);
        setLongField(term35454, term35454.getClass(), "sumBattleAdvancedHighScore", -373060971444161211L);
        setLongField(term35454, term35454.getClass(), "sumBattleExpertHighScore", -2342559604213128910L);
        setLongField(term35454, term35454.getClass(), "sumBattleMasterHighScore", 7857334824369215506L);
        setLongField(term35454, term35454.getClass(), "sumBattleLunaticHighScore", -4871569513248515478L);
        setField(term35454, term35454.getClass(), "eventWatchedDate", "RIGChgqpTI");
        setField(term35454, term35454.getClass(), "cmEventWatchedDate", "YCrgXnhgoK");
        setField(term35454, term35454.getClass(), "firstGameId", "nQodIeQekM");
        setField(term35454, term35454.getClass(), "firstRomVersion", "YXORpHCDcd");
        setField(term35454, term35454.getClass(), "firstDataVersion", "XzZbAcRADD");
        setField(term35454, term35454.getClass(), "firstPlayDate", "UqSNWSoTRy");
        setField(term35454, term35454.getClass(), "lastGameId", "VesRqDfjMa");
        setField(term35454, term35454.getClass(), "lastRomVersion", "AQTTebOiZR");
        setField(term35454, term35454.getClass(), "lastDataVersion", "mgeIhswNtk");
        setField(term35454, term35454.getClass(), "compatibleCmVersion", "QwKYpiVQlL");
        setField(term35454, term35454.getClass(), "lastPlayDate", "kSGsHNQQoW");
        setIntField(term35454, term35454.getClass(), "lastPlaceId", 1118825073);
        setField(term35454, term35454.getClass(), "lastPlaceName", "MWezlyjdaG");
        setIntField(term35454, term35454.getClass(), "lastRegionId", 751108197);
        setField(term35454, term35454.getClass(), "lastRegionName", "drpBJuEKQG");
        setIntField(term35454, term35454.getClass(), "lastAllNetId", -1810066487);
        setField(term35454, term35454.getClass(), "lastClientId", "GGpORnLrOW");
        setIntField(term35454, term35454.getClass(), "lastUsedDeckId", 12697707);
        setIntField(term35454, term35454.getClass(), "lastPlayMusicLevel", -971143668);
        setIntField(term35454, term35454.getClass(), "lastEmoneyBrand", 127763053);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechAdvancedHighScore", argTypes, term35454, args);
    }

};


