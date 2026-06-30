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

public class UserKop_getTechRecordDate_17025299308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274483;

    public UserKop_getTechRecordDate_17025299308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term274489 = new Long(7656211287234019484L);
        term274483 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term274485 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term274487 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term274503 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274504 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274508 = newInstance(Class.forName("java.time.LocalTime"));
        Object term274513 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274514 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274518 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term274483, term274483.getClass(), "id", 8856039144467442032L);
        setLongField(term274485, term274485.getClass(), "id", -2521675001089650253L);
        setLongField(term274487, term274487.getClass(), "id", -7310720930340308903L);
        setField(term274487, term274487.getClass(), "extId", term274489);
        setField(term274487, term274487.getClass(), "luid", "HaHCKzGZQv");
        setIntField(term274504, term274504.getClass(), "year", 2012);
        setShortField(term274504, term274504.getClass(), "month", (short) 11);
        setShortField(term274504, term274504.getClass(), "day", (short) 7);
        setField(term274503, term274503.getClass(), "date", term274504);
        setByteField(term274508, term274508.getClass(), "hour", (byte) 10);
        setByteField(term274508, term274508.getClass(), "minute", (byte) 35);
        setByteField(term274508, term274508.getClass(), "second", (byte) 16);
        setIntField(term274508, term274508.getClass(), "nano", 565845331);
        setField(term274503, term274503.getClass(), "time", term274508);
        setField(term274487, term274487.getClass(), "registerTime", term274503);
        setIntField(term274514, term274514.getClass(), "year", 2022);
        setShortField(term274514, term274514.getClass(), "month", (short) 2);
        setShortField(term274514, term274514.getClass(), "day", (short) 16);
        setField(term274513, term274513.getClass(), "date", term274514);
        setByteField(term274518, term274518.getClass(), "hour", (byte) 19);
        setByteField(term274518, term274518.getClass(), "minute", (byte) 33);
        setByteField(term274518, term274518.getClass(), "second", (byte) 28);
        setIntField(term274518, term274518.getClass(), "nano", 581349752);
        setField(term274513, term274513.getClass(), "time", term274518);
        setField(term274487, term274487.getClass(), "accessTime", term274513);
        setField(term274485, term274485.getClass(), "card", term274487);
        setField(term274485, term274485.getClass(), "userName", "AbzkZFggJr");
        setIntField(term274485, term274485.getClass(), "level", -1294400546);
        setIntField(term274485, term274485.getClass(), "reincarnationNum", 189925564);
        setLongField(term274485, term274485.getClass(), "exp", 735866165220348271L);
        setLongField(term274485, term274485.getClass(), "point", -8046071842340103078L);
        setLongField(term274485, term274485.getClass(), "totalPoint", 3226653715501122042L);
        setIntField(term274485, term274485.getClass(), "playCount", -1624176648);
        setIntField(term274485, term274485.getClass(), "jewelCount", -1110552515);
        setIntField(term274485, term274485.getClass(), "totalJewelCount", 1693657312);
        setIntField(term274485, term274485.getClass(), "medalCount", -1593288718);
        setIntField(term274485, term274485.getClass(), "playerRating", -1708472547);
        setIntField(term274485, term274485.getClass(), "highestRating", 874901091);
        setIntField(term274485, term274485.getClass(), "battlePoint", -1273024348);
        setIntField(term274485, term274485.getClass(), "bestBattlePoint", 1511312168);
        setIntField(term274485, term274485.getClass(), "overDamageBattlePoint", -1864897841);
        setBooleanField(term274485, term274485.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term274485, term274485.getClass(), "nameplateId", 831738832);
        setIntField(term274485, term274485.getClass(), "trophyId", -981559823);
        setIntField(term274485, term274485.getClass(), "cardId", 369520724);
        setIntField(term274485, term274485.getClass(), "characterId", 604315124);
        setIntField(term274485, term274485.getClass(), "characterVoiceNo", 1474708071);
        setIntField(term274485, term274485.getClass(), "tabSetting", -835592791);
        setIntField(term274485, term274485.getClass(), "tabSortSetting", -87410665);
        setIntField(term274485, term274485.getClass(), "cardCategorySetting", -1185466701);
        setIntField(term274485, term274485.getClass(), "cardSortSetting", -1572652644);
        setIntField(term274485, term274485.getClass(), "rivalScoreCategorySetting", 1749808685);
        setIntField(term274485, term274485.getClass(), "playedTutorialBit", -265393325);
        setIntField(term274485, term274485.getClass(), "firstTutorialCancelNum", -363381122);
        setLongField(term274485, term274485.getClass(), "sumTechHighScore", 5077228121419770846L);
        setLongField(term274485, term274485.getClass(), "sumTechBasicHighScore", 4946297906946638021L);
        setLongField(term274485, term274485.getClass(), "sumTechAdvancedHighScore", -1933569314915159368L);
        setLongField(term274485, term274485.getClass(), "sumTechExpertHighScore", -8039252267793242747L);
        setLongField(term274485, term274485.getClass(), "sumTechMasterHighScore", -8639981963264329624L);
        setLongField(term274485, term274485.getClass(), "sumTechLunaticHighScore", -3390782261068284906L);
        setLongField(term274485, term274485.getClass(), "sumBattleHighScore", 7865308931637946011L);
        setLongField(term274485, term274485.getClass(), "sumBattleBasicHighScore", -6943155793411786596L);
        setLongField(term274485, term274485.getClass(), "sumBattleAdvancedHighScore", 6314696459595846648L);
        setLongField(term274485, term274485.getClass(), "sumBattleExpertHighScore", -5117468235294750229L);
        setLongField(term274485, term274485.getClass(), "sumBattleMasterHighScore", -5882399806153214183L);
        setLongField(term274485, term274485.getClass(), "sumBattleLunaticHighScore", 8851351187127807528L);
        setField(term274485, term274485.getClass(), "eventWatchedDate", "tslhBSOQwF");
        setField(term274485, term274485.getClass(), "cmEventWatchedDate", "aodFIcJOBQ");
        setField(term274485, term274485.getClass(), "firstGameId", "sTtkOgTFht");
        setField(term274485, term274485.getClass(), "firstRomVersion", "rlGSusXzPG");
        setField(term274485, term274485.getClass(), "firstDataVersion", "whEcuYLKhg");
        setField(term274485, term274485.getClass(), "firstPlayDate", "gQBDWeRxHb");
        setField(term274485, term274485.getClass(), "lastGameId", "yaQlsOUqsP");
        setField(term274485, term274485.getClass(), "lastRomVersion", "YGhgJpKqvy");
        setField(term274485, term274485.getClass(), "lastDataVersion", "wmQJCThqui");
        setField(term274485, term274485.getClass(), "compatibleCmVersion", "LPKxpcUvxv");
        setField(term274485, term274485.getClass(), "lastPlayDate", "nRWGYtemZz");
        setIntField(term274485, term274485.getClass(), "lastPlaceId", 1478916134);
        setField(term274485, term274485.getClass(), "lastPlaceName", "iRcITsMQmk");
        setIntField(term274485, term274485.getClass(), "lastRegionId", 1754376447);
        setField(term274485, term274485.getClass(), "lastRegionName", "KNlBfmVqJG");
        setIntField(term274485, term274485.getClass(), "lastAllNetId", -1649449473);
        setField(term274485, term274485.getClass(), "lastClientId", "UEwBYiCmKK");
        setIntField(term274485, term274485.getClass(), "lastUsedDeckId", -1746373038);
        setIntField(term274485, term274485.getClass(), "lastPlayMusicLevel", 1160307954);
        setIntField(term274485, term274485.getClass(), "lastEmoneyBrand", -544472408);
        setField(term274483, term274483.getClass(), "user", term274485);
        setField(term274483, term274483.getClass(), "authKey", "EbRWmGnzKZ");
        setIntField(term274483, term274483.getClass(), "kopId", -422270147);
        setIntField(term274483, term274483.getClass(), "areaId", 1482939197);
        setIntField(term274483, term274483.getClass(), "totalTechScore", -176811174);
        setIntField(term274483, term274483.getClass(), "totalPlatinumScore", -679553829);
        setField(term274483, term274483.getClass(), "techRecordDate", "LntssJRTBe");
        setBooleanField(term274483, term274483.getClass(), "isTotalTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTechRecordDate", argTypes, term274483, args);
    }

};


