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

public class UserBoss_setMusicId_5692054399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138007;
     Object term138276;

    public UserBoss_setMusicId_5692054399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term138013 = new Long(7735460540091431012L);
        term138007 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term138009 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term138011 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term138027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138032 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138037 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138038 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138042 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term138007, term138007.getClass(), "id", 1621514155455807927L);
        setLongField(term138009, term138009.getClass(), "id", 4020756017629374672L);
        setLongField(term138011, term138011.getClass(), "id", -5760391419964149502L);
        setField(term138011, term138011.getClass(), "extId", term138013);
        setField(term138011, term138011.getClass(), "luid", "QoDtuFsSzS");
        setIntField(term138028, term138028.getClass(), "year", 2014);
        setShortField(term138028, term138028.getClass(), "month", (short) 5);
        setShortField(term138028, term138028.getClass(), "day", (short) 26);
        setField(term138027, term138027.getClass(), "date", term138028);
        setByteField(term138032, term138032.getClass(), "hour", (byte) 21);
        setByteField(term138032, term138032.getClass(), "minute", (byte) 54);
        setByteField(term138032, term138032.getClass(), "second", (byte) 33);
        setIntField(term138032, term138032.getClass(), "nano", 182465793);
        setField(term138027, term138027.getClass(), "time", term138032);
        setField(term138011, term138011.getClass(), "registerTime", term138027);
        setIntField(term138038, term138038.getClass(), "year", 2019);
        setShortField(term138038, term138038.getClass(), "month", (short) 4);
        setShortField(term138038, term138038.getClass(), "day", (short) 3);
        setField(term138037, term138037.getClass(), "date", term138038);
        setByteField(term138042, term138042.getClass(), "hour", (byte) 11);
        setByteField(term138042, term138042.getClass(), "minute", (byte) 54);
        setByteField(term138042, term138042.getClass(), "second", (byte) 10);
        setIntField(term138042, term138042.getClass(), "nano", 203720801);
        setField(term138037, term138037.getClass(), "time", term138042);
        setField(term138011, term138011.getClass(), "accessTime", term138037);
        setField(term138009, term138009.getClass(), "card", term138011);
        setField(term138009, term138009.getClass(), "userName", "hlFZKpXZIY");
        setIntField(term138009, term138009.getClass(), "level", 1616884797);
        setIntField(term138009, term138009.getClass(), "reincarnationNum", 2030586700);
        setLongField(term138009, term138009.getClass(), "exp", -5258338934627268028L);
        setLongField(term138009, term138009.getClass(), "point", -11509111363783705L);
        setLongField(term138009, term138009.getClass(), "totalPoint", 2285889589447297286L);
        setIntField(term138009, term138009.getClass(), "playCount", -340603553);
        setIntField(term138009, term138009.getClass(), "jewelCount", 225498620);
        setIntField(term138009, term138009.getClass(), "totalJewelCount", -1390906119);
        setIntField(term138009, term138009.getClass(), "medalCount", 36971401);
        setIntField(term138009, term138009.getClass(), "playerRating", 1516544818);
        setIntField(term138009, term138009.getClass(), "highestRating", 194365806);
        setIntField(term138009, term138009.getClass(), "battlePoint", 953836264);
        setIntField(term138009, term138009.getClass(), "bestBattlePoint", 1420814192);
        setIntField(term138009, term138009.getClass(), "overDamageBattlePoint", -382860485);
        setBooleanField(term138009, term138009.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term138009, term138009.getClass(), "nameplateId", 634627334);
        setIntField(term138009, term138009.getClass(), "trophyId", 1164370758);
        setIntField(term138009, term138009.getClass(), "cardId", 857653739);
        setIntField(term138009, term138009.getClass(), "characterId", -1000522677);
        setIntField(term138009, term138009.getClass(), "characterVoiceNo", -17458048);
        setIntField(term138009, term138009.getClass(), "tabSetting", 1912855522);
        setIntField(term138009, term138009.getClass(), "tabSortSetting", 1949021422);
        setIntField(term138009, term138009.getClass(), "cardCategorySetting", -912838937);
        setIntField(term138009, term138009.getClass(), "cardSortSetting", 16552477);
        setIntField(term138009, term138009.getClass(), "rivalScoreCategorySetting", -102621386);
        setIntField(term138009, term138009.getClass(), "playedTutorialBit", -1817209345);
        setIntField(term138009, term138009.getClass(), "firstTutorialCancelNum", -1215141504);
        setLongField(term138009, term138009.getClass(), "sumTechHighScore", 4257829740558707752L);
        setLongField(term138009, term138009.getClass(), "sumTechBasicHighScore", 1357295173785937907L);
        setLongField(term138009, term138009.getClass(), "sumTechAdvancedHighScore", -2108840255931461335L);
        setLongField(term138009, term138009.getClass(), "sumTechExpertHighScore", -6379361803384883636L);
        setLongField(term138009, term138009.getClass(), "sumTechMasterHighScore", -7525827490418949233L);
        setLongField(term138009, term138009.getClass(), "sumTechLunaticHighScore", 1238837691215808002L);
        setLongField(term138009, term138009.getClass(), "sumBattleHighScore", 5581332108428965667L);
        setLongField(term138009, term138009.getClass(), "sumBattleBasicHighScore", -2314230919290518989L);
        setLongField(term138009, term138009.getClass(), "sumBattleAdvancedHighScore", 3053570956046784252L);
        setLongField(term138009, term138009.getClass(), "sumBattleExpertHighScore", -4615381096562300428L);
        setLongField(term138009, term138009.getClass(), "sumBattleMasterHighScore", -1050687642510555171L);
        setLongField(term138009, term138009.getClass(), "sumBattleLunaticHighScore", 63300737657484113L);
        setField(term138009, term138009.getClass(), "eventWatchedDate", "tRkHyXXipG");
        setField(term138009, term138009.getClass(), "cmEventWatchedDate", "OAJdjKRfIM");
        setField(term138009, term138009.getClass(), "firstGameId", "BvzAbMTwzf");
        setField(term138009, term138009.getClass(), "firstRomVersion", "fcmWxpNhDp");
        setField(term138009, term138009.getClass(), "firstDataVersion", "eAuqPLqmIz");
        setField(term138009, term138009.getClass(), "firstPlayDate", "jttexnFOYa");
        setField(term138009, term138009.getClass(), "lastGameId", "VTcNUeCrHP");
        setField(term138009, term138009.getClass(), "lastRomVersion", "dRGHrevrGk");
        setField(term138009, term138009.getClass(), "lastDataVersion", "nUztHQImUf");
        setField(term138009, term138009.getClass(), "compatibleCmVersion", "ntLvGqxKQC");
        setField(term138009, term138009.getClass(), "lastPlayDate", "KJiHZHSclg");
        setIntField(term138009, term138009.getClass(), "lastPlaceId", -485437241);
        setField(term138009, term138009.getClass(), "lastPlaceName", "EVCYyZgkIk");
        setIntField(term138009, term138009.getClass(), "lastRegionId", -1166670409);
        setField(term138009, term138009.getClass(), "lastRegionName", "YzWEZeucrS");
        setIntField(term138009, term138009.getClass(), "lastAllNetId", 832294648);
        setField(term138009, term138009.getClass(), "lastClientId", "dWqMWOnvZA");
        setIntField(term138009, term138009.getClass(), "lastUsedDeckId", -840215577);
        setIntField(term138009, term138009.getClass(), "lastPlayMusicLevel", -53296007);
        setIntField(term138009, term138009.getClass(), "lastEmoneyBrand", -424687506);
        setField(term138007, term138007.getClass(), "user", term138009);
        setIntField(term138007, term138007.getClass(), "musicId", -624302325);
        setIntField(term138007, term138007.getClass(), "damage", -1974788609);
        setBooleanField(term138007, term138007.getClass(), "isClear", false);
        setIntField(term138007, term138007.getClass(), "eventId", -262908707);
        term138276 = new Integer(885420232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term138276;
        callMethod(klass, "setMusicId", argTypes, term138007, args);
    }

};


