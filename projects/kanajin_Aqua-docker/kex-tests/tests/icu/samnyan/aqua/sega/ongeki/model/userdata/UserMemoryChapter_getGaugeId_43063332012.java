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

public class UserMemoryChapter_getGaugeId_43063332012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394130;

    public UserMemoryChapter_getGaugeId_43063332012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term394136 = new Long(-7148236042086608592L);
        term394130 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term394132 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term394134 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term394150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term394151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term394155 = newInstance(Class.forName("java.time.LocalTime"));
        Object term394160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term394161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term394165 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term394130, term394130.getClass(), "id", -2758159044747427982L);
        setLongField(term394132, term394132.getClass(), "id", -266203687406320169L);
        setLongField(term394134, term394134.getClass(), "id", -1956255898200543753L);
        setField(term394134, term394134.getClass(), "extId", term394136);
        setField(term394134, term394134.getClass(), "luid", "OEiAFjfYDd");
        setIntField(term394151, term394151.getClass(), "year", 2014);
        setShortField(term394151, term394151.getClass(), "month", (short) 4);
        setShortField(term394151, term394151.getClass(), "day", (short) 18);
        setField(term394150, term394150.getClass(), "date", term394151);
        setByteField(term394155, term394155.getClass(), "hour", (byte) 1);
        setByteField(term394155, term394155.getClass(), "minute", (byte) 2);
        setByteField(term394155, term394155.getClass(), "second", (byte) 14);
        setIntField(term394155, term394155.getClass(), "nano", 59792039);
        setField(term394150, term394150.getClass(), "time", term394155);
        setField(term394134, term394134.getClass(), "registerTime", term394150);
        setIntField(term394161, term394161.getClass(), "year", 2017);
        setShortField(term394161, term394161.getClass(), "month", (short) 6);
        setShortField(term394161, term394161.getClass(), "day", (short) 7);
        setField(term394160, term394160.getClass(), "date", term394161);
        setByteField(term394165, term394165.getClass(), "hour", (byte) 13);
        setByteField(term394165, term394165.getClass(), "minute", (byte) 17);
        setByteField(term394165, term394165.getClass(), "second", (byte) 37);
        setIntField(term394165, term394165.getClass(), "nano", 71604979);
        setField(term394160, term394160.getClass(), "time", term394165);
        setField(term394134, term394134.getClass(), "accessTime", term394160);
        setField(term394132, term394132.getClass(), "card", term394134);
        setField(term394132, term394132.getClass(), "userName", "dzPgfbQAzx");
        setIntField(term394132, term394132.getClass(), "level", 132475052);
        setIntField(term394132, term394132.getClass(), "reincarnationNum", 974144166);
        setLongField(term394132, term394132.getClass(), "exp", 7688630631976149323L);
        setLongField(term394132, term394132.getClass(), "point", 544278422376780687L);
        setLongField(term394132, term394132.getClass(), "totalPoint", -546547651222754410L);
        setIntField(term394132, term394132.getClass(), "playCount", 1435209857);
        setIntField(term394132, term394132.getClass(), "jewelCount", -796747447);
        setIntField(term394132, term394132.getClass(), "totalJewelCount", -1618844424);
        setIntField(term394132, term394132.getClass(), "medalCount", 1705783596);
        setIntField(term394132, term394132.getClass(), "playerRating", -1641801728);
        setIntField(term394132, term394132.getClass(), "highestRating", -1861319447);
        setIntField(term394132, term394132.getClass(), "battlePoint", -464492428);
        setIntField(term394132, term394132.getClass(), "bestBattlePoint", 863903329);
        setIntField(term394132, term394132.getClass(), "overDamageBattlePoint", -1590128044);
        setBooleanField(term394132, term394132.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term394132, term394132.getClass(), "nameplateId", -2138770984);
        setIntField(term394132, term394132.getClass(), "trophyId", 390278013);
        setIntField(term394132, term394132.getClass(), "cardId", -1896538459);
        setIntField(term394132, term394132.getClass(), "characterId", 173848573);
        setIntField(term394132, term394132.getClass(), "characterVoiceNo", -701725343);
        setIntField(term394132, term394132.getClass(), "tabSetting", -110372496);
        setIntField(term394132, term394132.getClass(), "tabSortSetting", -518555915);
        setIntField(term394132, term394132.getClass(), "cardCategorySetting", -2066845932);
        setIntField(term394132, term394132.getClass(), "cardSortSetting", -1754471169);
        setIntField(term394132, term394132.getClass(), "rivalScoreCategorySetting", 1565022317);
        setIntField(term394132, term394132.getClass(), "playedTutorialBit", 1248740189);
        setIntField(term394132, term394132.getClass(), "firstTutorialCancelNum", 659022515);
        setLongField(term394132, term394132.getClass(), "sumTechHighScore", 3300349739333444627L);
        setLongField(term394132, term394132.getClass(), "sumTechBasicHighScore", -4005828385271750251L);
        setLongField(term394132, term394132.getClass(), "sumTechAdvancedHighScore", 6749474520579652998L);
        setLongField(term394132, term394132.getClass(), "sumTechExpertHighScore", 2301209664232124921L);
        setLongField(term394132, term394132.getClass(), "sumTechMasterHighScore", 4816798014595709050L);
        setLongField(term394132, term394132.getClass(), "sumTechLunaticHighScore", -5083481370084073907L);
        setLongField(term394132, term394132.getClass(), "sumBattleHighScore", 4442815134458583731L);
        setLongField(term394132, term394132.getClass(), "sumBattleBasicHighScore", 236867616603711542L);
        setLongField(term394132, term394132.getClass(), "sumBattleAdvancedHighScore", -2657684679287156727L);
        setLongField(term394132, term394132.getClass(), "sumBattleExpertHighScore", -1199100702736789765L);
        setLongField(term394132, term394132.getClass(), "sumBattleMasterHighScore", -6355125531843490414L);
        setLongField(term394132, term394132.getClass(), "sumBattleLunaticHighScore", 63184321465033031L);
        setField(term394132, term394132.getClass(), "eventWatchedDate", "sfuLnoETvn");
        setField(term394132, term394132.getClass(), "cmEventWatchedDate", "GQQnKTsYOK");
        setField(term394132, term394132.getClass(), "firstGameId", "ofyNCZAyVs");
        setField(term394132, term394132.getClass(), "firstRomVersion", "hGiBzSanpJ");
        setField(term394132, term394132.getClass(), "firstDataVersion", "QCUQUkooDQ");
        setField(term394132, term394132.getClass(), "firstPlayDate", "WcdJCinyjg");
        setField(term394132, term394132.getClass(), "lastGameId", "tMwMYljvNE");
        setField(term394132, term394132.getClass(), "lastRomVersion", "dvunmenUtA");
        setField(term394132, term394132.getClass(), "lastDataVersion", "vVXkZzNbuA");
        setField(term394132, term394132.getClass(), "compatibleCmVersion", "prSNkqgTak");
        setField(term394132, term394132.getClass(), "lastPlayDate", "iQpXmyPGbg");
        setIntField(term394132, term394132.getClass(), "lastPlaceId", -1988721685);
        setField(term394132, term394132.getClass(), "lastPlaceName", "MtUFFbEksn");
        setIntField(term394132, term394132.getClass(), "lastRegionId", -1437021858);
        setField(term394132, term394132.getClass(), "lastRegionName", "CKkNPYjNue");
        setIntField(term394132, term394132.getClass(), "lastAllNetId", 1986039979);
        setField(term394132, term394132.getClass(), "lastClientId", "LJAxzAbcNQ");
        setIntField(term394132, term394132.getClass(), "lastUsedDeckId", 349252755);
        setIntField(term394132, term394132.getClass(), "lastPlayMusicLevel", -1541327371);
        setIntField(term394132, term394132.getClass(), "lastEmoneyBrand", -247561161);
        setField(term394130, term394130.getClass(), "user", term394132);
        setIntField(term394130, term394130.getClass(), "chapterId", -1984307867);
        setIntField(term394130, term394130.getClass(), "jewelCount", 1557165301);
        setIntField(term394130, term394130.getClass(), "lastPlayMusicCategory", 329292695);
        setIntField(term394130, term394130.getClass(), "lastPlayMusicId", -1189604225);
        setIntField(term394130, term394130.getClass(), "lastPlayMusicLevel", 2036545020);
        setBooleanField(term394130, term394130.getClass(), "isDialogWatched", true);
        setBooleanField(term394130, term394130.getClass(), "isStoryWatched", true);
        setBooleanField(term394130, term394130.getClass(), "isBossWatched", true);
        setBooleanField(term394130, term394130.getClass(), "isClear", true);
        setIntField(term394130, term394130.getClass(), "gaugeId", 1327606982);
        setIntField(term394130, term394130.getClass(), "gaugeNum", 688569158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGaugeId", argTypes, term394130, args);
    }

};


