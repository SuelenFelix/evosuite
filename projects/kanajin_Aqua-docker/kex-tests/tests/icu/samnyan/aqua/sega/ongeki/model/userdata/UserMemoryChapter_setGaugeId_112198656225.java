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

public class UserMemoryChapter_setGaugeId_112198656225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400241;
     Object term400517;

    public UserMemoryChapter_setGaugeId_112198656225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term400247 = new Long(-9093996849713569099L);
        term400241 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term400243 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term400245 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term400261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term400262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term400266 = newInstance(Class.forName("java.time.LocalTime"));
        Object term400271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term400272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term400276 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term400241, term400241.getClass(), "id", 1354479052873636977L);
        setLongField(term400243, term400243.getClass(), "id", -117512134107938746L);
        setLongField(term400245, term400245.getClass(), "id", -7140526075149130623L);
        setField(term400245, term400245.getClass(), "extId", term400247);
        setField(term400245, term400245.getClass(), "luid", "AICFFKhPgV");
        setIntField(term400262, term400262.getClass(), "year", 2028);
        setShortField(term400262, term400262.getClass(), "month", (short) 5);
        setShortField(term400262, term400262.getClass(), "day", (short) 24);
        setField(term400261, term400261.getClass(), "date", term400262);
        setByteField(term400266, term400266.getClass(), "hour", (byte) 20);
        setByteField(term400266, term400266.getClass(), "minute", (byte) 5);
        setByteField(term400266, term400266.getClass(), "second", (byte) 44);
        setIntField(term400266, term400266.getClass(), "nano", 283024850);
        setField(term400261, term400261.getClass(), "time", term400266);
        setField(term400245, term400245.getClass(), "registerTime", term400261);
        setIntField(term400272, term400272.getClass(), "year", 2029);
        setShortField(term400272, term400272.getClass(), "month", (short) 3);
        setShortField(term400272, term400272.getClass(), "day", (short) 15);
        setField(term400271, term400271.getClass(), "date", term400272);
        setByteField(term400276, term400276.getClass(), "hour", (byte) 10);
        setByteField(term400276, term400276.getClass(), "minute", (byte) 22);
        setByteField(term400276, term400276.getClass(), "second", (byte) 21);
        setIntField(term400276, term400276.getClass(), "nano", 258160604);
        setField(term400271, term400271.getClass(), "time", term400276);
        setField(term400245, term400245.getClass(), "accessTime", term400271);
        setField(term400243, term400243.getClass(), "card", term400245);
        setField(term400243, term400243.getClass(), "userName", "rLLkFXlhOd");
        setIntField(term400243, term400243.getClass(), "level", -26449806);
        setIntField(term400243, term400243.getClass(), "reincarnationNum", -1340944372);
        setLongField(term400243, term400243.getClass(), "exp", -4426461911148980237L);
        setLongField(term400243, term400243.getClass(), "point", 2119372310151365060L);
        setLongField(term400243, term400243.getClass(), "totalPoint", 3168529367313854171L);
        setIntField(term400243, term400243.getClass(), "playCount", -1710434956);
        setIntField(term400243, term400243.getClass(), "jewelCount", 1032632043);
        setIntField(term400243, term400243.getClass(), "totalJewelCount", 59494235);
        setIntField(term400243, term400243.getClass(), "medalCount", 1255516136);
        setIntField(term400243, term400243.getClass(), "playerRating", 107875765);
        setIntField(term400243, term400243.getClass(), "highestRating", 597554974);
        setIntField(term400243, term400243.getClass(), "battlePoint", 726717456);
        setIntField(term400243, term400243.getClass(), "bestBattlePoint", -2010454769);
        setIntField(term400243, term400243.getClass(), "overDamageBattlePoint", -1732750479);
        setBooleanField(term400243, term400243.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term400243, term400243.getClass(), "nameplateId", -1461571095);
        setIntField(term400243, term400243.getClass(), "trophyId", 1283475002);
        setIntField(term400243, term400243.getClass(), "cardId", 2106988767);
        setIntField(term400243, term400243.getClass(), "characterId", 1686040175);
        setIntField(term400243, term400243.getClass(), "characterVoiceNo", -1314053772);
        setIntField(term400243, term400243.getClass(), "tabSetting", 269083762);
        setIntField(term400243, term400243.getClass(), "tabSortSetting", 1857002917);
        setIntField(term400243, term400243.getClass(), "cardCategorySetting", 2090759345);
        setIntField(term400243, term400243.getClass(), "cardSortSetting", -735422633);
        setIntField(term400243, term400243.getClass(), "rivalScoreCategorySetting", -1827359520);
        setIntField(term400243, term400243.getClass(), "playedTutorialBit", -751195021);
        setIntField(term400243, term400243.getClass(), "firstTutorialCancelNum", 1933807025);
        setLongField(term400243, term400243.getClass(), "sumTechHighScore", 6018592208859523081L);
        setLongField(term400243, term400243.getClass(), "sumTechBasicHighScore", -2038659601689335459L);
        setLongField(term400243, term400243.getClass(), "sumTechAdvancedHighScore", 1985814517618986307L);
        setLongField(term400243, term400243.getClass(), "sumTechExpertHighScore", -4870713741413113241L);
        setLongField(term400243, term400243.getClass(), "sumTechMasterHighScore", 9220115466685186411L);
        setLongField(term400243, term400243.getClass(), "sumTechLunaticHighScore", -4515056768994598922L);
        setLongField(term400243, term400243.getClass(), "sumBattleHighScore", 1567123395716472997L);
        setLongField(term400243, term400243.getClass(), "sumBattleBasicHighScore", -484036261559284770L);
        setLongField(term400243, term400243.getClass(), "sumBattleAdvancedHighScore", -2243829497490816095L);
        setLongField(term400243, term400243.getClass(), "sumBattleExpertHighScore", -3438003060752845626L);
        setLongField(term400243, term400243.getClass(), "sumBattleMasterHighScore", -4645269763846499772L);
        setLongField(term400243, term400243.getClass(), "sumBattleLunaticHighScore", -7925928983049200778L);
        setField(term400243, term400243.getClass(), "eventWatchedDate", "albSOooFLd");
        setField(term400243, term400243.getClass(), "cmEventWatchedDate", "JrJvDceCcA");
        setField(term400243, term400243.getClass(), "firstGameId", "PJmPSGPmkd");
        setField(term400243, term400243.getClass(), "firstRomVersion", "lyPubgZNoQ");
        setField(term400243, term400243.getClass(), "firstDataVersion", "NYVYgMBpXO");
        setField(term400243, term400243.getClass(), "firstPlayDate", "LwAJBiDAwO");
        setField(term400243, term400243.getClass(), "lastGameId", "ghxYKWbHex");
        setField(term400243, term400243.getClass(), "lastRomVersion", "qdqrczBJOI");
        setField(term400243, term400243.getClass(), "lastDataVersion", "RqontBSBNP");
        setField(term400243, term400243.getClass(), "compatibleCmVersion", "LJXrJOMqtH");
        setField(term400243, term400243.getClass(), "lastPlayDate", "kipqazTwpk");
        setIntField(term400243, term400243.getClass(), "lastPlaceId", -379750252);
        setField(term400243, term400243.getClass(), "lastPlaceName", "mSkRVgVhsG");
        setIntField(term400243, term400243.getClass(), "lastRegionId", 921027621);
        setField(term400243, term400243.getClass(), "lastRegionName", "VznIbOBYEJ");
        setIntField(term400243, term400243.getClass(), "lastAllNetId", -569344970);
        setField(term400243, term400243.getClass(), "lastClientId", "ObvyNNXSWK");
        setIntField(term400243, term400243.getClass(), "lastUsedDeckId", -2004605459);
        setIntField(term400243, term400243.getClass(), "lastPlayMusicLevel", 2119550151);
        setIntField(term400243, term400243.getClass(), "lastEmoneyBrand", -616993158);
        setField(term400241, term400241.getClass(), "user", term400243);
        setIntField(term400241, term400241.getClass(), "chapterId", 840220167);
        setIntField(term400241, term400241.getClass(), "jewelCount", -749087067);
        setIntField(term400241, term400241.getClass(), "lastPlayMusicCategory", -524919653);
        setIntField(term400241, term400241.getClass(), "lastPlayMusicId", 780506905);
        setIntField(term400241, term400241.getClass(), "lastPlayMusicLevel", 1414597313);
        setBooleanField(term400241, term400241.getClass(), "isDialogWatched", false);
        setBooleanField(term400241, term400241.getClass(), "isStoryWatched", true);
        setBooleanField(term400241, term400241.getClass(), "isBossWatched", false);
        setBooleanField(term400241, term400241.getClass(), "isClear", false);
        setIntField(term400241, term400241.getClass(), "gaugeId", -663452189);
        setIntField(term400241, term400241.getClass(), "gaugeNum", -1915225216);
        term400517 = new Integer(-1776455205);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term400517;
        callMethod(klass, "setGaugeId", argTypes, term400241, args);
    }

};


