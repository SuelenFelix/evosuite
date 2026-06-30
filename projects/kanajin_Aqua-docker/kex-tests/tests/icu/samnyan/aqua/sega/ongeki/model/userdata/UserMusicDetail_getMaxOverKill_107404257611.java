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

public class UserMusicDetail_getMaxOverKill_107404257611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408581;

    public UserMusicDetail_getMaxOverKill_107404257611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term408587 = new Long(-9079706905309751984L);
        term408581 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term408583 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term408585 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term408601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term408602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term408606 = newInstance(Class.forName("java.time.LocalTime"));
        Object term408611 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term408612 = newInstance(Class.forName("java.time.LocalDate"));
        Object term408616 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term408581, term408581.getClass(), "id", -828507344599670563L);
        setLongField(term408583, term408583.getClass(), "id", 9075490098762397901L);
        setLongField(term408585, term408585.getClass(), "id", -195280124140253882L);
        setField(term408585, term408585.getClass(), "extId", term408587);
        setField(term408585, term408585.getClass(), "luid", "lKtugGPQIt");
        setIntField(term408602, term408602.getClass(), "year", 2026);
        setShortField(term408602, term408602.getClass(), "month", (short) 1);
        setShortField(term408602, term408602.getClass(), "day", (short) 17);
        setField(term408601, term408601.getClass(), "date", term408602);
        setByteField(term408606, term408606.getClass(), "hour", (byte) 9);
        setByteField(term408606, term408606.getClass(), "minute", (byte) 22);
        setByteField(term408606, term408606.getClass(), "second", (byte) 10);
        setIntField(term408606, term408606.getClass(), "nano", 411650029);
        setField(term408601, term408601.getClass(), "time", term408606);
        setField(term408585, term408585.getClass(), "registerTime", term408601);
        setIntField(term408612, term408612.getClass(), "year", 2017);
        setShortField(term408612, term408612.getClass(), "month", (short) 8);
        setShortField(term408612, term408612.getClass(), "day", (short) 8);
        setField(term408611, term408611.getClass(), "date", term408612);
        setByteField(term408616, term408616.getClass(), "hour", (byte) 7);
        setByteField(term408616, term408616.getClass(), "minute", (byte) 31);
        setByteField(term408616, term408616.getClass(), "second", (byte) 6);
        setIntField(term408616, term408616.getClass(), "nano", 442316602);
        setField(term408611, term408611.getClass(), "time", term408616);
        setField(term408585, term408585.getClass(), "accessTime", term408611);
        setField(term408583, term408583.getClass(), "card", term408585);
        setField(term408583, term408583.getClass(), "userName", "oENhHyMFuZ");
        setIntField(term408583, term408583.getClass(), "level", 2097363320);
        setIntField(term408583, term408583.getClass(), "reincarnationNum", 680539450);
        setLongField(term408583, term408583.getClass(), "exp", -2530481208397282198L);
        setLongField(term408583, term408583.getClass(), "point", 926348940376066688L);
        setLongField(term408583, term408583.getClass(), "totalPoint", -82027138281358505L);
        setIntField(term408583, term408583.getClass(), "playCount", -341937068);
        setIntField(term408583, term408583.getClass(), "jewelCount", 530525707);
        setIntField(term408583, term408583.getClass(), "totalJewelCount", -1822704989);
        setIntField(term408583, term408583.getClass(), "medalCount", 987344892);
        setIntField(term408583, term408583.getClass(), "playerRating", -1235764823);
        setIntField(term408583, term408583.getClass(), "highestRating", 476401308);
        setIntField(term408583, term408583.getClass(), "battlePoint", -691975586);
        setIntField(term408583, term408583.getClass(), "bestBattlePoint", -625040595);
        setIntField(term408583, term408583.getClass(), "overDamageBattlePoint", 1203490531);
        setBooleanField(term408583, term408583.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term408583, term408583.getClass(), "nameplateId", -1393425051);
        setIntField(term408583, term408583.getClass(), "trophyId", 1871316476);
        setIntField(term408583, term408583.getClass(), "cardId", 1330840151);
        setIntField(term408583, term408583.getClass(), "characterId", 1525512337);
        setIntField(term408583, term408583.getClass(), "characterVoiceNo", -2013456162);
        setIntField(term408583, term408583.getClass(), "tabSetting", -1778542453);
        setIntField(term408583, term408583.getClass(), "tabSortSetting", -117877442);
        setIntField(term408583, term408583.getClass(), "cardCategorySetting", 1944317324);
        setIntField(term408583, term408583.getClass(), "cardSortSetting", 1645961696);
        setIntField(term408583, term408583.getClass(), "rivalScoreCategorySetting", 1542820680);
        setIntField(term408583, term408583.getClass(), "playedTutorialBit", 1561368902);
        setIntField(term408583, term408583.getClass(), "firstTutorialCancelNum", -1859934574);
        setLongField(term408583, term408583.getClass(), "sumTechHighScore", 4296996141366018145L);
        setLongField(term408583, term408583.getClass(), "sumTechBasicHighScore", 1300791613152413877L);
        setLongField(term408583, term408583.getClass(), "sumTechAdvancedHighScore", -6161864456143230897L);
        setLongField(term408583, term408583.getClass(), "sumTechExpertHighScore", 923880641429581390L);
        setLongField(term408583, term408583.getClass(), "sumTechMasterHighScore", 8778993846795546114L);
        setLongField(term408583, term408583.getClass(), "sumTechLunaticHighScore", -4303931238037988100L);
        setLongField(term408583, term408583.getClass(), "sumBattleHighScore", 4077536699822200973L);
        setLongField(term408583, term408583.getClass(), "sumBattleBasicHighScore", -360930387310661813L);
        setLongField(term408583, term408583.getClass(), "sumBattleAdvancedHighScore", -7924346739368771682L);
        setLongField(term408583, term408583.getClass(), "sumBattleExpertHighScore", 5407325613776448093L);
        setLongField(term408583, term408583.getClass(), "sumBattleMasterHighScore", -2342911426190618364L);
        setLongField(term408583, term408583.getClass(), "sumBattleLunaticHighScore", 5243522213632600334L);
        setField(term408583, term408583.getClass(), "eventWatchedDate", "DpemoirrZf");
        setField(term408583, term408583.getClass(), "cmEventWatchedDate", "TWgGOFIFvM");
        setField(term408583, term408583.getClass(), "firstGameId", "ikCXBjhqxN");
        setField(term408583, term408583.getClass(), "firstRomVersion", "eAnxcyomSt");
        setField(term408583, term408583.getClass(), "firstDataVersion", "rGZvdYtYQq");
        setField(term408583, term408583.getClass(), "firstPlayDate", "IykCfqDpKO");
        setField(term408583, term408583.getClass(), "lastGameId", "PTGKJilgVA");
        setField(term408583, term408583.getClass(), "lastRomVersion", "eVxEASQlus");
        setField(term408583, term408583.getClass(), "lastDataVersion", "JkWTBJDXis");
        setField(term408583, term408583.getClass(), "compatibleCmVersion", "wFhdWKaIxC");
        setField(term408583, term408583.getClass(), "lastPlayDate", "TRAyHJrLCq");
        setIntField(term408583, term408583.getClass(), "lastPlaceId", 1482565040);
        setField(term408583, term408583.getClass(), "lastPlaceName", "TfHsxbFcHM");
        setIntField(term408583, term408583.getClass(), "lastRegionId", -1320789675);
        setField(term408583, term408583.getClass(), "lastRegionName", "XzYxjcHJSc");
        setIntField(term408583, term408583.getClass(), "lastAllNetId", -1403759343);
        setField(term408583, term408583.getClass(), "lastClientId", "YYKTbwAEBS");
        setIntField(term408583, term408583.getClass(), "lastUsedDeckId", 125571860);
        setIntField(term408583, term408583.getClass(), "lastPlayMusicLevel", 2080345147);
        setIntField(term408583, term408583.getClass(), "lastEmoneyBrand", -853634391);
        setField(term408581, term408581.getClass(), "user", term408583);
        setIntField(term408581, term408581.getClass(), "musicId", -222838164);
        setIntField(term408581, term408581.getClass(), "level", 539707214);
        setIntField(term408581, term408581.getClass(), "playCount", 141145763);
        setIntField(term408581, term408581.getClass(), "techScoreMax", -956933561);
        setIntField(term408581, term408581.getClass(), "techScoreRank", -928042389);
        setIntField(term408581, term408581.getClass(), "battleScoreMax", 239466392);
        setIntField(term408581, term408581.getClass(), "battleScoreRank", -709215750);
        setIntField(term408581, term408581.getClass(), "maxComboCount", -1652122702);
        setIntField(term408581, term408581.getClass(), "maxOverKill", 1198067665);
        setIntField(term408581, term408581.getClass(), "maxTeamOverKill", 257119484);
        setBooleanField(term408581, term408581.getClass(), "isFullBell", false);
        setBooleanField(term408581, term408581.getClass(), "isFullCombo", false);
        setBooleanField(term408581, term408581.getClass(), "isAllBreake", false);
        setBooleanField(term408581, term408581.getClass(), "isLock", false);
        setIntField(term408581, term408581.getClass(), "clearStatus", -205782452);
        setBooleanField(term408581, term408581.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxOverKill", argTypes, term408581, args);
    }

};


