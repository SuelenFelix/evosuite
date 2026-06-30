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

public class UserEventMusic_setType_3022012714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375807;
     Object term376091;

    public UserEventMusic_setType_3022012714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term375813 = new Long(-8123300791906968552L);
        term375807 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term375809 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term375811 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term375827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term375828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term375832 = newInstance(Class.forName("java.time.LocalTime"));
        Object term375837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term375838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term375842 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term375807, term375807.getClass(), "id", 8108462990548933329L);
        setLongField(term375809, term375809.getClass(), "id", -4371777180965420552L);
        setLongField(term375811, term375811.getClass(), "id", 416405075601495886L);
        setField(term375811, term375811.getClass(), "extId", term375813);
        setField(term375811, term375811.getClass(), "luid", "zaYpkkfbRP");
        setIntField(term375828, term375828.getClass(), "year", 2021);
        setShortField(term375828, term375828.getClass(), "month", (short) 7);
        setShortField(term375828, term375828.getClass(), "day", (short) 24);
        setField(term375827, term375827.getClass(), "date", term375828);
        setByteField(term375832, term375832.getClass(), "hour", (byte) 8);
        setByteField(term375832, term375832.getClass(), "minute", (byte) 13);
        setByteField(term375832, term375832.getClass(), "second", (byte) 23);
        setIntField(term375832, term375832.getClass(), "nano", 516398012);
        setField(term375827, term375827.getClass(), "time", term375832);
        setField(term375811, term375811.getClass(), "registerTime", term375827);
        setIntField(term375838, term375838.getClass(), "year", 2017);
        setShortField(term375838, term375838.getClass(), "month", (short) 2);
        setShortField(term375838, term375838.getClass(), "day", (short) 17);
        setField(term375837, term375837.getClass(), "date", term375838);
        setByteField(term375842, term375842.getClass(), "hour", (byte) 3);
        setByteField(term375842, term375842.getClass(), "minute", (byte) 40);
        setByteField(term375842, term375842.getClass(), "second", (byte) 46);
        setIntField(term375842, term375842.getClass(), "nano", 480309563);
        setField(term375837, term375837.getClass(), "time", term375842);
        setField(term375811, term375811.getClass(), "accessTime", term375837);
        setField(term375809, term375809.getClass(), "card", term375811);
        setField(term375809, term375809.getClass(), "userName", "fIoQOZeoVK");
        setIntField(term375809, term375809.getClass(), "level", -1203537201);
        setIntField(term375809, term375809.getClass(), "reincarnationNum", 2131172351);
        setLongField(term375809, term375809.getClass(), "exp", 2399095539280529799L);
        setLongField(term375809, term375809.getClass(), "point", 5562433057252841214L);
        setLongField(term375809, term375809.getClass(), "totalPoint", -807251221470184871L);
        setIntField(term375809, term375809.getClass(), "playCount", -1707760972);
        setIntField(term375809, term375809.getClass(), "jewelCount", 1813883423);
        setIntField(term375809, term375809.getClass(), "totalJewelCount", -2099267811);
        setIntField(term375809, term375809.getClass(), "medalCount", -473631755);
        setIntField(term375809, term375809.getClass(), "playerRating", 2100816102);
        setIntField(term375809, term375809.getClass(), "highestRating", -239176483);
        setIntField(term375809, term375809.getClass(), "battlePoint", 1484004073);
        setIntField(term375809, term375809.getClass(), "bestBattlePoint", -507324602);
        setIntField(term375809, term375809.getClass(), "overDamageBattlePoint", -1870037645);
        setBooleanField(term375809, term375809.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term375809, term375809.getClass(), "nameplateId", -1630976291);
        setIntField(term375809, term375809.getClass(), "trophyId", -2025708791);
        setIntField(term375809, term375809.getClass(), "cardId", -1044782308);
        setIntField(term375809, term375809.getClass(), "characterId", -1535998860);
        setIntField(term375809, term375809.getClass(), "characterVoiceNo", 448021407);
        setIntField(term375809, term375809.getClass(), "tabSetting", 1652632930);
        setIntField(term375809, term375809.getClass(), "tabSortSetting", 1227039212);
        setIntField(term375809, term375809.getClass(), "cardCategorySetting", 2048319524);
        setIntField(term375809, term375809.getClass(), "cardSortSetting", -406140778);
        setIntField(term375809, term375809.getClass(), "rivalScoreCategorySetting", 2028910166);
        setIntField(term375809, term375809.getClass(), "playedTutorialBit", -876089893);
        setIntField(term375809, term375809.getClass(), "firstTutorialCancelNum", 1652944236);
        setLongField(term375809, term375809.getClass(), "sumTechHighScore", -6514143125202158691L);
        setLongField(term375809, term375809.getClass(), "sumTechBasicHighScore", -7589947380966328578L);
        setLongField(term375809, term375809.getClass(), "sumTechAdvancedHighScore", -7138386014175736529L);
        setLongField(term375809, term375809.getClass(), "sumTechExpertHighScore", 1534133787301739770L);
        setLongField(term375809, term375809.getClass(), "sumTechMasterHighScore", 8883413811190967399L);
        setLongField(term375809, term375809.getClass(), "sumTechLunaticHighScore", -945659221294827576L);
        setLongField(term375809, term375809.getClass(), "sumBattleHighScore", -2595385204410054835L);
        setLongField(term375809, term375809.getClass(), "sumBattleBasicHighScore", 1966653589707505696L);
        setLongField(term375809, term375809.getClass(), "sumBattleAdvancedHighScore", 8946390347671909402L);
        setLongField(term375809, term375809.getClass(), "sumBattleExpertHighScore", 5290572993173048188L);
        setLongField(term375809, term375809.getClass(), "sumBattleMasterHighScore", -6730396720290408858L);
        setLongField(term375809, term375809.getClass(), "sumBattleLunaticHighScore", 5573873562450841560L);
        setField(term375809, term375809.getClass(), "eventWatchedDate", "tTkJxeMIhG");
        setField(term375809, term375809.getClass(), "cmEventWatchedDate", "dZFkTlgeNK");
        setField(term375809, term375809.getClass(), "firstGameId", "fIpDMwXuFo");
        setField(term375809, term375809.getClass(), "firstRomVersion", "JOzegoretC");
        setField(term375809, term375809.getClass(), "firstDataVersion", "tPXOigwNgS");
        setField(term375809, term375809.getClass(), "firstPlayDate", "DJloaaFcGd");
        setField(term375809, term375809.getClass(), "lastGameId", "qtJfVtqXwz");
        setField(term375809, term375809.getClass(), "lastRomVersion", "rPuqsGPaYs");
        setField(term375809, term375809.getClass(), "lastDataVersion", "ytaTlbXdUL");
        setField(term375809, term375809.getClass(), "compatibleCmVersion", "OPVZFRAEHh");
        setField(term375809, term375809.getClass(), "lastPlayDate", "LhHCNqoJli");
        setIntField(term375809, term375809.getClass(), "lastPlaceId", 1891479599);
        setField(term375809, term375809.getClass(), "lastPlaceName", "WOGuKtBNyF");
        setIntField(term375809, term375809.getClass(), "lastRegionId", 924875130);
        setField(term375809, term375809.getClass(), "lastRegionName", "TpsLJBxkis");
        setIntField(term375809, term375809.getClass(), "lastAllNetId", 1342936412);
        setField(term375809, term375809.getClass(), "lastClientId", "GYtHjClQtm");
        setIntField(term375809, term375809.getClass(), "lastUsedDeckId", -617548359);
        setIntField(term375809, term375809.getClass(), "lastPlayMusicLevel", -658095854);
        setIntField(term375809, term375809.getClass(), "lastEmoneyBrand", 1946904972);
        setField(term375807, term375807.getClass(), "user", term375809);
        setIntField(term375807, term375807.getClass(), "eventId", -736614883);
        setIntField(term375807, term375807.getClass(), "type", 41314837);
        setIntField(term375807, term375807.getClass(), "musicId", -2139992665);
        setIntField(term375807, term375807.getClass(), "level", -437406813);
        setIntField(term375807, term375807.getClass(), "techScoreMax", 1616020003);
        setIntField(term375807, term375807.getClass(), "platinumScoreMax", 1933392757);
        setField(term375807, term375807.getClass(), "techRecordDate", "WHinUJeSCZ");
        setBooleanField(term375807, term375807.getClass(), "isTechNewRecord", true);
        term376091 = new Integer(1569998811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term376091;
        callMethod(klass, "setType", argTypes, term375807, args);
    }

};


