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

public class UserTrainingRoom_setCardId_94485235811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18517;
     Object term18808;

    public UserTrainingRoom_setCardId_94485235811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18523 = new Long(-6292278961887936280L);
        term18517 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term18519 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term18521 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term18537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18542 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18552 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term18517, term18517.getClass(), "id", 6371581018571997173L);
        setLongField(term18519, term18519.getClass(), "id", 6604328992663797314L);
        setLongField(term18521, term18521.getClass(), "id", -5133307284441518726L);
        setField(term18521, term18521.getClass(), "extId", term18523);
        setField(term18521, term18521.getClass(), "luid", "EHoNUaeyvT");
        setIntField(term18538, term18538.getClass(), "year", 2020);
        setShortField(term18538, term18538.getClass(), "month", (short) 5);
        setShortField(term18538, term18538.getClass(), "day", (short) 12);
        setField(term18537, term18537.getClass(), "date", term18538);
        setByteField(term18542, term18542.getClass(), "hour", (byte) 0);
        setByteField(term18542, term18542.getClass(), "minute", (byte) 15);
        setByteField(term18542, term18542.getClass(), "second", (byte) 24);
        setIntField(term18542, term18542.getClass(), "nano", 250257744);
        setField(term18537, term18537.getClass(), "time", term18542);
        setField(term18521, term18521.getClass(), "registerTime", term18537);
        setIntField(term18548, term18548.getClass(), "year", 2013);
        setShortField(term18548, term18548.getClass(), "month", (short) 9);
        setShortField(term18548, term18548.getClass(), "day", (short) 19);
        setField(term18547, term18547.getClass(), "date", term18548);
        setByteField(term18552, term18552.getClass(), "hour", (byte) 12);
        setByteField(term18552, term18552.getClass(), "minute", (byte) 29);
        setByteField(term18552, term18552.getClass(), "second", (byte) 28);
        setIntField(term18552, term18552.getClass(), "nano", 244069764);
        setField(term18547, term18547.getClass(), "time", term18552);
        setField(term18521, term18521.getClass(), "accessTime", term18547);
        setField(term18519, term18519.getClass(), "card", term18521);
        setField(term18519, term18519.getClass(), "userName", "ZwKmasCVIy");
        setIntField(term18519, term18519.getClass(), "level", 12581312);
        setIntField(term18519, term18519.getClass(), "reincarnationNum", 2087383644);
        setLongField(term18519, term18519.getClass(), "exp", 7921404547326630089L);
        setLongField(term18519, term18519.getClass(), "point", 2155219577693802424L);
        setLongField(term18519, term18519.getClass(), "totalPoint", -4033544645261759750L);
        setIntField(term18519, term18519.getClass(), "playCount", 405527523);
        setIntField(term18519, term18519.getClass(), "jewelCount", -1123526433);
        setIntField(term18519, term18519.getClass(), "totalJewelCount", 910269225);
        setIntField(term18519, term18519.getClass(), "medalCount", -298852874);
        setIntField(term18519, term18519.getClass(), "playerRating", 1094297953);
        setIntField(term18519, term18519.getClass(), "highestRating", -329141819);
        setIntField(term18519, term18519.getClass(), "battlePoint", -963204620);
        setIntField(term18519, term18519.getClass(), "bestBattlePoint", 172898580);
        setIntField(term18519, term18519.getClass(), "overDamageBattlePoint", -777833461);
        setBooleanField(term18519, term18519.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term18519, term18519.getClass(), "nameplateId", 1583691829);
        setIntField(term18519, term18519.getClass(), "trophyId", -1468541076);
        setIntField(term18519, term18519.getClass(), "cardId", -1796760393);
        setIntField(term18519, term18519.getClass(), "characterId", -2099267271);
        setIntField(term18519, term18519.getClass(), "characterVoiceNo", 1134565344);
        setIntField(term18519, term18519.getClass(), "tabSetting", -1747434000);
        setIntField(term18519, term18519.getClass(), "tabSortSetting", 1611620166);
        setIntField(term18519, term18519.getClass(), "cardCategorySetting", 249657454);
        setIntField(term18519, term18519.getClass(), "cardSortSetting", 1734630901);
        setIntField(term18519, term18519.getClass(), "rivalScoreCategorySetting", -703815246);
        setIntField(term18519, term18519.getClass(), "playedTutorialBit", 157300746);
        setIntField(term18519, term18519.getClass(), "firstTutorialCancelNum", -1600748613);
        setLongField(term18519, term18519.getClass(), "sumTechHighScore", 593230449611047187L);
        setLongField(term18519, term18519.getClass(), "sumTechBasicHighScore", -3355167737637002830L);
        setLongField(term18519, term18519.getClass(), "sumTechAdvancedHighScore", -8854988339892073229L);
        setLongField(term18519, term18519.getClass(), "sumTechExpertHighScore", 2769081086274438111L);
        setLongField(term18519, term18519.getClass(), "sumTechMasterHighScore", -6339531459447942677L);
        setLongField(term18519, term18519.getClass(), "sumTechLunaticHighScore", 2014229530618878786L);
        setLongField(term18519, term18519.getClass(), "sumBattleHighScore", -3684549603148553700L);
        setLongField(term18519, term18519.getClass(), "sumBattleBasicHighScore", 4665980239039735158L);
        setLongField(term18519, term18519.getClass(), "sumBattleAdvancedHighScore", 7429946509853918683L);
        setLongField(term18519, term18519.getClass(), "sumBattleExpertHighScore", -7148236042086608592L);
        setLongField(term18519, term18519.getClass(), "sumBattleMasterHighScore", 7716258711075652753L);
        setLongField(term18519, term18519.getClass(), "sumBattleLunaticHighScore", -3988042285731673145L);
        setField(term18519, term18519.getClass(), "eventWatchedDate", "pxokrVaeMd");
        setField(term18519, term18519.getClass(), "cmEventWatchedDate", "ujxmmZZcbT");
        setField(term18519, term18519.getClass(), "firstGameId", "BOvgwHfoHQ");
        setField(term18519, term18519.getClass(), "firstRomVersion", "hPpFNeDBIb");
        setField(term18519, term18519.getClass(), "firstDataVersion", "DNOtiLPAIY");
        setField(term18519, term18519.getClass(), "firstPlayDate", "FnEkAHBfyV");
        setField(term18519, term18519.getClass(), "lastGameId", "VfmNFpEuax");
        setField(term18519, term18519.getClass(), "lastRomVersion", "ANHjlWPmZG");
        setField(term18519, term18519.getClass(), "lastDataVersion", "SibzENsyyy");
        setField(term18519, term18519.getClass(), "compatibleCmVersion", "mrqGHotaef");
        setField(term18519, term18519.getClass(), "lastPlayDate", "UbZGBpQZQW");
        setIntField(term18519, term18519.getClass(), "lastPlaceId", -1509192782);
        setField(term18519, term18519.getClass(), "lastPlaceName", "SvGTualQPa");
        setIntField(term18519, term18519.getClass(), "lastRegionId", -867925573);
        setField(term18519, term18519.getClass(), "lastRegionName", "mdxcgZwsaP");
        setIntField(term18519, term18519.getClass(), "lastAllNetId", 478422495);
        setField(term18519, term18519.getClass(), "lastClientId", "XildIRoZHG");
        setIntField(term18519, term18519.getClass(), "lastUsedDeckId", 1727771237);
        setIntField(term18519, term18519.getClass(), "lastPlayMusicLevel", 2033663549);
        setIntField(term18519, term18519.getClass(), "lastEmoneyBrand", 1766479154);
        setField(term18517, term18517.getClass(), "user", term18519);
        setField(term18517, term18517.getClass(), "authKey", "lEcrFlxJXH");
        setIntField(term18517, term18517.getClass(), "roomId", 533171496);
        setIntField(term18517, term18517.getClass(), "cardId", 1369020869);
        setField(term18517, term18517.getClass(), "valueDate", "VNdDwXMYxR");
        term18808 = new Integer(-1428947021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18808;
        callMethod(klass, "setCardId", argTypes, term18517, args);
    }

};


