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

public class UserDeck_hashCode_115950655015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148862;

    public UserDeck_hashCode_115950655015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term148868 = new Long(3086974592680165932L);
        term148862 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck"));
        Object term148864 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term148866 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term148882 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148883 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148887 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148892 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148893 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148897 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term148862, term148862.getClass(), "id", -2488601009965230814L);
        setLongField(term148864, term148864.getClass(), "id", 375806662749788880L);
        setLongField(term148866, term148866.getClass(), "id", -3558717090290217927L);
        setField(term148866, term148866.getClass(), "extId", term148868);
        setField(term148866, term148866.getClass(), "luid", "qWfJfYLLPv");
        setIntField(term148883, term148883.getClass(), "year", 2013);
        setShortField(term148883, term148883.getClass(), "month", (short) 9);
        setShortField(term148883, term148883.getClass(), "day", (short) 14);
        setField(term148882, term148882.getClass(), "date", term148883);
        setByteField(term148887, term148887.getClass(), "hour", (byte) 18);
        setByteField(term148887, term148887.getClass(), "minute", (byte) 10);
        setByteField(term148887, term148887.getClass(), "second", (byte) 39);
        setIntField(term148887, term148887.getClass(), "nano", 650634905);
        setField(term148882, term148882.getClass(), "time", term148887);
        setField(term148866, term148866.getClass(), "registerTime", term148882);
        setIntField(term148893, term148893.getClass(), "year", 2012);
        setShortField(term148893, term148893.getClass(), "month", (short) 8);
        setShortField(term148893, term148893.getClass(), "day", (short) 8);
        setField(term148892, term148892.getClass(), "date", term148893);
        setByteField(term148897, term148897.getClass(), "hour", (byte) 5);
        setByteField(term148897, term148897.getClass(), "minute", (byte) 3);
        setByteField(term148897, term148897.getClass(), "second", (byte) 9);
        setIntField(term148897, term148897.getClass(), "nano", 246856443);
        setField(term148892, term148892.getClass(), "time", term148897);
        setField(term148866, term148866.getClass(), "accessTime", term148892);
        setField(term148864, term148864.getClass(), "card", term148866);
        setField(term148864, term148864.getClass(), "userName", "VZbUjcRZMe");
        setIntField(term148864, term148864.getClass(), "level", -1060700711);
        setIntField(term148864, term148864.getClass(), "reincarnationNum", 1281979005);
        setLongField(term148864, term148864.getClass(), "exp", -3566816813060150566L);
        setLongField(term148864, term148864.getClass(), "point", 7151305745013646192L);
        setLongField(term148864, term148864.getClass(), "totalPoint", -8240366569533623716L);
        setIntField(term148864, term148864.getClass(), "playCount", -1535572179);
        setIntField(term148864, term148864.getClass(), "jewelCount", -1210680742);
        setIntField(term148864, term148864.getClass(), "totalJewelCount", -2024761841);
        setIntField(term148864, term148864.getClass(), "medalCount", 517435996);
        setIntField(term148864, term148864.getClass(), "playerRating", 997085806);
        setIntField(term148864, term148864.getClass(), "highestRating", -1890633633);
        setIntField(term148864, term148864.getClass(), "battlePoint", 556792495);
        setIntField(term148864, term148864.getClass(), "bestBattlePoint", 1635397327);
        setIntField(term148864, term148864.getClass(), "overDamageBattlePoint", -1407747575);
        setBooleanField(term148864, term148864.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term148864, term148864.getClass(), "nameplateId", -129952888);
        setIntField(term148864, term148864.getClass(), "trophyId", 1093590118);
        setIntField(term148864, term148864.getClass(), "cardId", -610005848);
        setIntField(term148864, term148864.getClass(), "characterId", 1856644657);
        setIntField(term148864, term148864.getClass(), "characterVoiceNo", -1777396332);
        setIntField(term148864, term148864.getClass(), "tabSetting", 1949483184);
        setIntField(term148864, term148864.getClass(), "tabSortSetting", -116853826);
        setIntField(term148864, term148864.getClass(), "cardCategorySetting", 720273368);
        setIntField(term148864, term148864.getClass(), "cardSortSetting", 439433705);
        setIntField(term148864, term148864.getClass(), "rivalScoreCategorySetting", 651646147);
        setIntField(term148864, term148864.getClass(), "playedTutorialBit", -182685183);
        setIntField(term148864, term148864.getClass(), "firstTutorialCancelNum", 1900550190);
        setLongField(term148864, term148864.getClass(), "sumTechHighScore", 6408770549904640792L);
        setLongField(term148864, term148864.getClass(), "sumTechBasicHighScore", -2319451368596963599L);
        setLongField(term148864, term148864.getClass(), "sumTechAdvancedHighScore", 3676708336218726252L);
        setLongField(term148864, term148864.getClass(), "sumTechExpertHighScore", 1470580030656066295L);
        setLongField(term148864, term148864.getClass(), "sumTechMasterHighScore", -1790494049212803372L);
        setLongField(term148864, term148864.getClass(), "sumTechLunaticHighScore", -6326810074393630866L);
        setLongField(term148864, term148864.getClass(), "sumBattleHighScore", 7162270557566668904L);
        setLongField(term148864, term148864.getClass(), "sumBattleBasicHighScore", -7918869759855982554L);
        setLongField(term148864, term148864.getClass(), "sumBattleAdvancedHighScore", -1795877006009760078L);
        setLongField(term148864, term148864.getClass(), "sumBattleExpertHighScore", 4051857363519737369L);
        setLongField(term148864, term148864.getClass(), "sumBattleMasterHighScore", 6058888269525904056L);
        setLongField(term148864, term148864.getClass(), "sumBattleLunaticHighScore", -2900172203519247339L);
        setField(term148864, term148864.getClass(), "eventWatchedDate", "gDouKwsHFO");
        setField(term148864, term148864.getClass(), "cmEventWatchedDate", "LOXLADrcBI");
        setField(term148864, term148864.getClass(), "firstGameId", "BRVeCzWPKZ");
        setField(term148864, term148864.getClass(), "firstRomVersion", "iVfYVgPFch");
        setField(term148864, term148864.getClass(), "firstDataVersion", "ZaImFGAzCz");
        setField(term148864, term148864.getClass(), "firstPlayDate", "lkySuzJAZx");
        setField(term148864, term148864.getClass(), "lastGameId", "SzCYINBfMP");
        setField(term148864, term148864.getClass(), "lastRomVersion", "SZxGdkheQC");
        setField(term148864, term148864.getClass(), "lastDataVersion", "ezHsVprTGp");
        setField(term148864, term148864.getClass(), "compatibleCmVersion", "LYGBvfTqST");
        setField(term148864, term148864.getClass(), "lastPlayDate", "SUHmXgYhGj");
        setIntField(term148864, term148864.getClass(), "lastPlaceId", -223373115);
        setField(term148864, term148864.getClass(), "lastPlaceName", "cYhJgiPexe");
        setIntField(term148864, term148864.getClass(), "lastRegionId", -2069853525);
        setField(term148864, term148864.getClass(), "lastRegionName", "zIofafmnvq");
        setIntField(term148864, term148864.getClass(), "lastAllNetId", -20546610);
        setField(term148864, term148864.getClass(), "lastClientId", "TUlaPxQqxL");
        setIntField(term148864, term148864.getClass(), "lastUsedDeckId", 2028422247);
        setIntField(term148864, term148864.getClass(), "lastPlayMusicLevel", 776507834);
        setIntField(term148864, term148864.getClass(), "lastEmoneyBrand", -1588665163);
        setField(term148862, term148862.getClass(), "user", term148864);
        setIntField(term148862, term148862.getClass(), "deckId", -986489468);
        setIntField(term148862, term148862.getClass(), "cardId1", -204607039);
        setIntField(term148862, term148862.getClass(), "cardId2", 78293336);
        setIntField(term148862, term148862.getClass(), "cardId3", -257780975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserDeck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term148862, args);
    }

};


