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

public class UserDeck_getUser_6845897912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142850;

    public UserDeck_getUser_6845897912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term142856 = new Long(6315101499811179240L);
        term142850 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term142852 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term142854 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term142870 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142871 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142875 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142880 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142881 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142885 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term142850, term142850.getClass(), "id", -1295572730269757966L);
        setLongField(term142852, term142852.getClass(), "id", -7440635955298814067L);
        setLongField(term142854, term142854.getClass(), "id", 5222992628263081167L);
        setField(term142854, term142854.getClass(), "extId", term142856);
        setField(term142854, term142854.getClass(), "luid", "LcoJdPibmE");
        setIntField(term142871, term142871.getClass(), "year", 2023);
        setShortField(term142871, term142871.getClass(), "month", (short) 2);
        setShortField(term142871, term142871.getClass(), "day", (short) 24);
        setField(term142870, term142870.getClass(), "date", term142871);
        setByteField(term142875, term142875.getClass(), "hour", (byte) 13);
        setByteField(term142875, term142875.getClass(), "minute", (byte) 14);
        setByteField(term142875, term142875.getClass(), "second", (byte) 25);
        setIntField(term142875, term142875.getClass(), "nano", 73608340);
        setField(term142870, term142870.getClass(), "time", term142875);
        setField(term142854, term142854.getClass(), "registerTime", term142870);
        setIntField(term142881, term142881.getClass(), "year", 2015);
        setShortField(term142881, term142881.getClass(), "month", (short) 9);
        setShortField(term142881, term142881.getClass(), "day", (short) 8);
        setField(term142880, term142880.getClass(), "date", term142881);
        setByteField(term142885, term142885.getClass(), "hour", (byte) 8);
        setByteField(term142885, term142885.getClass(), "minute", (byte) 25);
        setByteField(term142885, term142885.getClass(), "second", (byte) 10);
        setIntField(term142885, term142885.getClass(), "nano", 506972016);
        setField(term142880, term142880.getClass(), "time", term142885);
        setField(term142854, term142854.getClass(), "accessTime", term142880);
        setField(term142852, term142852.getClass(), "card", term142854);
        setField(term142852, term142852.getClass(), "userName", "HCkvHZWbSX");
        setIntField(term142852, term142852.getClass(), "level", 72576894);
        setIntField(term142852, term142852.getClass(), "reincarnationNum", 1802709528);
        setLongField(term142852, term142852.getClass(), "exp", 1138822236367626642L);
        setLongField(term142852, term142852.getClass(), "point", -6939312668699878714L);
        setLongField(term142852, term142852.getClass(), "totalPoint", -9092901934876176859L);
        setIntField(term142852, term142852.getClass(), "playCount", 625411236);
        setIntField(term142852, term142852.getClass(), "jewelCount", 1278363908);
        setIntField(term142852, term142852.getClass(), "totalJewelCount", 1679478889);
        setIntField(term142852, term142852.getClass(), "medalCount", 1711128633);
        setIntField(term142852, term142852.getClass(), "playerRating", 558898048);
        setIntField(term142852, term142852.getClass(), "highestRating", -1751947747);
        setIntField(term142852, term142852.getClass(), "battlePoint", 750226278);
        setIntField(term142852, term142852.getClass(), "bestBattlePoint", -1153409944);
        setIntField(term142852, term142852.getClass(), "overDamageBattlePoint", 1063281217);
        setBooleanField(term142852, term142852.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term142852, term142852.getClass(), "nameplateId", 981222791);
        setIntField(term142852, term142852.getClass(), "trophyId", 1297362786);
        setIntField(term142852, term142852.getClass(), "cardId", -1701558271);
        setIntField(term142852, term142852.getClass(), "characterId", 1777553175);
        setIntField(term142852, term142852.getClass(), "characterVoiceNo", 1321016655);
        setIntField(term142852, term142852.getClass(), "tabSetting", -893412167);
        setIntField(term142852, term142852.getClass(), "tabSortSetting", 985381114);
        setIntField(term142852, term142852.getClass(), "cardCategorySetting", 2091907097);
        setIntField(term142852, term142852.getClass(), "cardSortSetting", 589633036);
        setIntField(term142852, term142852.getClass(), "rivalScoreCategorySetting", 608454583);
        setIntField(term142852, term142852.getClass(), "playedTutorialBit", -117720047);
        setIntField(term142852, term142852.getClass(), "firstTutorialCancelNum", -892566680);
        setLongField(term142852, term142852.getClass(), "sumTechHighScore", 5473703080672300831L);
        setLongField(term142852, term142852.getClass(), "sumTechBasicHighScore", -23577173278234071L);
        setLongField(term142852, term142852.getClass(), "sumTechAdvancedHighScore", -4525803456155125807L);
        setLongField(term142852, term142852.getClass(), "sumTechExpertHighScore", -6204016093615598773L);
        setLongField(term142852, term142852.getClass(), "sumTechMasterHighScore", -5737702124238338999L);
        setLongField(term142852, term142852.getClass(), "sumTechLunaticHighScore", 6686784951893832293L);
        setLongField(term142852, term142852.getClass(), "sumBattleHighScore", 3130172104750827625L);
        setLongField(term142852, term142852.getClass(), "sumBattleBasicHighScore", -2677677916808587225L);
        setLongField(term142852, term142852.getClass(), "sumBattleAdvancedHighScore", -4172946896137591853L);
        setLongField(term142852, term142852.getClass(), "sumBattleExpertHighScore", 4130513856530989044L);
        setLongField(term142852, term142852.getClass(), "sumBattleMasterHighScore", 690425753736911206L);
        setLongField(term142852, term142852.getClass(), "sumBattleLunaticHighScore", -7745621016310424311L);
        setField(term142852, term142852.getClass(), "eventWatchedDate", "JVxVmSrZrh");
        setField(term142852, term142852.getClass(), "cmEventWatchedDate", "xHynRanbSE");
        setField(term142852, term142852.getClass(), "firstGameId", "ACdUTXxFxF");
        setField(term142852, term142852.getClass(), "firstRomVersion", "MsjtvLqctc");
        setField(term142852, term142852.getClass(), "firstDataVersion", "omhBZktFpR");
        setField(term142852, term142852.getClass(), "firstPlayDate", "zEsjjlIKrF");
        setField(term142852, term142852.getClass(), "lastGameId", "XeoSSCwSfl");
        setField(term142852, term142852.getClass(), "lastRomVersion", "adcoGovSer");
        setField(term142852, term142852.getClass(), "lastDataVersion", "DZqXfiKqtE");
        setField(term142852, term142852.getClass(), "compatibleCmVersion", "YOsqpIMuey");
        setField(term142852, term142852.getClass(), "lastPlayDate", "dfJffzsKZe");
        setIntField(term142852, term142852.getClass(), "lastPlaceId", 1674142259);
        setField(term142852, term142852.getClass(), "lastPlaceName", "dTgyMBkwWX");
        setIntField(term142852, term142852.getClass(), "lastRegionId", -1303208102);
        setField(term142852, term142852.getClass(), "lastRegionName", "mhIqZywfDK");
        setIntField(term142852, term142852.getClass(), "lastAllNetId", 1957563972);
        setField(term142852, term142852.getClass(), "lastClientId", "MXPBuilyzu");
        setIntField(term142852, term142852.getClass(), "lastUsedDeckId", -193596012);
        setIntField(term142852, term142852.getClass(), "lastPlayMusicLevel", 919991978);
        setIntField(term142852, term142852.getClass(), "lastEmoneyBrand", -240870307);
        setField(term142850, term142850.getClass(), "user", term142852);
        setIntField(term142850, term142850.getClass(), "deckId", -812476026);
        setIntField(term142850, term142850.getClass(), "cardId1", -1921252803);
        setIntField(term142850, term142850.getClass(), "cardId2", 542685338);
        setIntField(term142850, term142850.getClass(), "cardId3", 593280113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term142850, args);
    }

};


