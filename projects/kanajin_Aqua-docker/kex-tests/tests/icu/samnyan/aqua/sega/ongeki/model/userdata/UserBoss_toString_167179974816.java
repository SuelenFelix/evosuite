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

public class UserBoss_toString_167179974816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141020;

    public UserBoss_toString_167179974816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term141026 = new Long(-1964501434345816975L);
        term141020 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term141022 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term141024 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term141040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141045 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141050 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141055 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term141020, term141020.getClass(), "id", -7760368409779559643L);
        setLongField(term141022, term141022.getClass(), "id", 6306448925265383634L);
        setLongField(term141024, term141024.getClass(), "id", -3291502114584913915L);
        setField(term141024, term141024.getClass(), "extId", term141026);
        setField(term141024, term141024.getClass(), "luid", "YUJWXjGqoj");
        setIntField(term141041, term141041.getClass(), "year", 2023);
        setShortField(term141041, term141041.getClass(), "month", (short) 7);
        setShortField(term141041, term141041.getClass(), "day", (short) 18);
        setField(term141040, term141040.getClass(), "date", term141041);
        setByteField(term141045, term141045.getClass(), "hour", (byte) 11);
        setByteField(term141045, term141045.getClass(), "minute", (byte) 33);
        setByteField(term141045, term141045.getClass(), "second", (byte) 28);
        setIntField(term141045, term141045.getClass(), "nano", 15208773);
        setField(term141040, term141040.getClass(), "time", term141045);
        setField(term141024, term141024.getClass(), "registerTime", term141040);
        setIntField(term141051, term141051.getClass(), "year", 2011);
        setShortField(term141051, term141051.getClass(), "month", (short) 11);
        setShortField(term141051, term141051.getClass(), "day", (short) 13);
        setField(term141050, term141050.getClass(), "date", term141051);
        setByteField(term141055, term141055.getClass(), "hour", (byte) 17);
        setByteField(term141055, term141055.getClass(), "minute", (byte) 43);
        setByteField(term141055, term141055.getClass(), "second", (byte) 47);
        setIntField(term141055, term141055.getClass(), "nano", 537140404);
        setField(term141050, term141050.getClass(), "time", term141055);
        setField(term141024, term141024.getClass(), "accessTime", term141050);
        setField(term141022, term141022.getClass(), "card", term141024);
        setField(term141022, term141022.getClass(), "userName", "FYbsLyvQEc");
        setIntField(term141022, term141022.getClass(), "level", -392494577);
        setIntField(term141022, term141022.getClass(), "reincarnationNum", -1182169103);
        setLongField(term141022, term141022.getClass(), "exp", 3291296131736319063L);
        setLongField(term141022, term141022.getClass(), "point", 918390725343842085L);
        setLongField(term141022, term141022.getClass(), "totalPoint", -7818439404129919282L);
        setIntField(term141022, term141022.getClass(), "playCount", 75613974);
        setIntField(term141022, term141022.getClass(), "jewelCount", -184719611);
        setIntField(term141022, term141022.getClass(), "totalJewelCount", -1275570760);
        setIntField(term141022, term141022.getClass(), "medalCount", -1359553558);
        setIntField(term141022, term141022.getClass(), "playerRating", -1307021664);
        setIntField(term141022, term141022.getClass(), "highestRating", -202359899);
        setIntField(term141022, term141022.getClass(), "battlePoint", -2145573227);
        setIntField(term141022, term141022.getClass(), "bestBattlePoint", 1334594060);
        setIntField(term141022, term141022.getClass(), "overDamageBattlePoint", 2070138820);
        setBooleanField(term141022, term141022.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term141022, term141022.getClass(), "nameplateId", -323557659);
        setIntField(term141022, term141022.getClass(), "trophyId", 1046757455);
        setIntField(term141022, term141022.getClass(), "cardId", 597376126);
        setIntField(term141022, term141022.getClass(), "characterId", 1562609944);
        setIntField(term141022, term141022.getClass(), "characterVoiceNo", -568660846);
        setIntField(term141022, term141022.getClass(), "tabSetting", -1734283788);
        setIntField(term141022, term141022.getClass(), "tabSortSetting", -553895569);
        setIntField(term141022, term141022.getClass(), "cardCategorySetting", 1574271133);
        setIntField(term141022, term141022.getClass(), "cardSortSetting", -320820030);
        setIntField(term141022, term141022.getClass(), "rivalScoreCategorySetting", 1564533277);
        setIntField(term141022, term141022.getClass(), "playedTutorialBit", 457118315);
        setIntField(term141022, term141022.getClass(), "firstTutorialCancelNum", -1741727092);
        setLongField(term141022, term141022.getClass(), "sumTechHighScore", 7691289875244918815L);
        setLongField(term141022, term141022.getClass(), "sumTechBasicHighScore", 3070549417150105917L);
        setLongField(term141022, term141022.getClass(), "sumTechAdvancedHighScore", -1608679732998387768L);
        setLongField(term141022, term141022.getClass(), "sumTechExpertHighScore", 4613972983899953167L);
        setLongField(term141022, term141022.getClass(), "sumTechMasterHighScore", -5612186846658459247L);
        setLongField(term141022, term141022.getClass(), "sumTechLunaticHighScore", 1745003028524303639L);
        setLongField(term141022, term141022.getClass(), "sumBattleHighScore", -2106727716640103633L);
        setLongField(term141022, term141022.getClass(), "sumBattleBasicHighScore", -4618442779407489580L);
        setLongField(term141022, term141022.getClass(), "sumBattleAdvancedHighScore", 6478971343891127934L);
        setLongField(term141022, term141022.getClass(), "sumBattleExpertHighScore", -3971002487361023498L);
        setLongField(term141022, term141022.getClass(), "sumBattleMasterHighScore", 4272244278753004962L);
        setLongField(term141022, term141022.getClass(), "sumBattleLunaticHighScore", 8316962932743941665L);
        setField(term141022, term141022.getClass(), "eventWatchedDate", "DZVnOFFNzA");
        setField(term141022, term141022.getClass(), "cmEventWatchedDate", "UhHOlEncqe");
        setField(term141022, term141022.getClass(), "firstGameId", "BombodvByI");
        setField(term141022, term141022.getClass(), "firstRomVersion", "xWXSMsmgup");
        setField(term141022, term141022.getClass(), "firstDataVersion", "CiRiThUkzG");
        setField(term141022, term141022.getClass(), "firstPlayDate", "USOHXZaoed");
        setField(term141022, term141022.getClass(), "lastGameId", "sIAuMXSPLw");
        setField(term141022, term141022.getClass(), "lastRomVersion", "BHUMLKEWjf");
        setField(term141022, term141022.getClass(), "lastDataVersion", "bCRIEMBwda");
        setField(term141022, term141022.getClass(), "compatibleCmVersion", "rJpPoVDPxO");
        setField(term141022, term141022.getClass(), "lastPlayDate", "wAzHMzePqz");
        setIntField(term141022, term141022.getClass(), "lastPlaceId", 1927550284);
        setField(term141022, term141022.getClass(), "lastPlaceName", "apDIHttQkF");
        setIntField(term141022, term141022.getClass(), "lastRegionId", -454951597);
        setField(term141022, term141022.getClass(), "lastRegionName", "JnkpKxjKwX");
        setIntField(term141022, term141022.getClass(), "lastAllNetId", -992070416);
        setField(term141022, term141022.getClass(), "lastClientId", "QmmFUcQTWe");
        setIntField(term141022, term141022.getClass(), "lastUsedDeckId", 1959596117);
        setIntField(term141022, term141022.getClass(), "lastPlayMusicLevel", 298481274);
        setIntField(term141022, term141022.getClass(), "lastEmoneyBrand", -82602322);
        setField(term141020, term141020.getClass(), "user", term141022);
        setIntField(term141020, term141020.getClass(), "musicId", 201191489);
        setIntField(term141020, term141020.getClass(), "damage", 1003344868);
        setBooleanField(term141020, term141020.getClass(), "isClear", false);
        setIntField(term141020, term141020.getClass(), "eventId", 699428605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term141020, args);
    }

};


