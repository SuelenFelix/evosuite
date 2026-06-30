package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_getLastRegionId_201412125254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3185608;

    public ExternalUserData_getLastRegionId_201412125254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3185608 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3185608, term3185608.getClass(), "accessCode", "dFmcKLpjOn");
        setField(term3185608, term3185608.getClass(), "userName", "aGAUWmWopU");
        setIntField(term3185608, term3185608.getClass(), "level", -362764280);
        setIntField(term3185608, term3185608.getClass(), "reincarnationNum", 497413978);
        setLongField(term3185608, term3185608.getClass(), "exp", 4471519889402304352L);
        setLongField(term3185608, term3185608.getClass(), "point", -3190464645572384293L);
        setLongField(term3185608, term3185608.getClass(), "totalPoint", 35825102189322843L);
        setIntField(term3185608, term3185608.getClass(), "playCount", -806796072);
        setIntField(term3185608, term3185608.getClass(), "jewelCount", -1599402738);
        setIntField(term3185608, term3185608.getClass(), "totalJewelCount", -113981706);
        setIntField(term3185608, term3185608.getClass(), "medalCount", -741471270);
        setIntField(term3185608, term3185608.getClass(), "playerRating", -1897005394);
        setIntField(term3185608, term3185608.getClass(), "highestRating", 693107704);
        setIntField(term3185608, term3185608.getClass(), "battlePoint", 1497811858);
        setIntField(term3185608, term3185608.getClass(), "bestBattlePoint", -1662680366);
        setIntField(term3185608, term3185608.getClass(), "overDamageBattlePoint", 2140438876);
        setIntField(term3185608, term3185608.getClass(), "nameplateId", 829863955);
        setIntField(term3185608, term3185608.getClass(), "trophyId", -777897992);
        setIntField(term3185608, term3185608.getClass(), "cardId", -486554155);
        setIntField(term3185608, term3185608.getClass(), "characterId", 137352716);
        setIntField(term3185608, term3185608.getClass(), "tabSetting", -899675374);
        setIntField(term3185608, term3185608.getClass(), "tabSortSetting", 1836251072);
        setIntField(term3185608, term3185608.getClass(), "cardCategorySetting", -1326185214);
        setIntField(term3185608, term3185608.getClass(), "cardSortSetting", 1196756878);
        setIntField(term3185608, term3185608.getClass(), "rivalScoreCategorySetting", 1627351829);
        setIntField(term3185608, term3185608.getClass(), "playedTutorialBit", 2045990241);
        setIntField(term3185608, term3185608.getClass(), "firstTutorialCancelNum", -1957264741);
        setLongField(term3185608, term3185608.getClass(), "sumTechHighScore", -5456177796048320716L);
        setLongField(term3185608, term3185608.getClass(), "sumTechBasicHighScore", 1914014389338815070L);
        setLongField(term3185608, term3185608.getClass(), "sumTechAdvancedHighScore", -3075122746076401334L);
        setLongField(term3185608, term3185608.getClass(), "sumTechExpertHighScore", 4703189163247844516L);
        setLongField(term3185608, term3185608.getClass(), "sumTechMasterHighScore", -2651478620429738663L);
        setLongField(term3185608, term3185608.getClass(), "sumTechLunaticHighScore", 2458210649039316623L);
        setLongField(term3185608, term3185608.getClass(), "sumBattleHighScore", -4243539827924625293L);
        setLongField(term3185608, term3185608.getClass(), "sumBattleBasicHighScore", -464472831593052656L);
        setLongField(term3185608, term3185608.getClass(), "sumBattleAdvancedHighScore", 7204648989593503875L);
        setLongField(term3185608, term3185608.getClass(), "sumBattleExpertHighScore", 8757190576083045452L);
        setLongField(term3185608, term3185608.getClass(), "sumBattleMasterHighScore", 3419244756481702287L);
        setLongField(term3185608, term3185608.getClass(), "sumBattleLunaticHighScore", 6953148096024176252L);
        setField(term3185608, term3185608.getClass(), "eventWatchedDate", "MOxnoHLLzD");
        setField(term3185608, term3185608.getClass(), "cmEventWatchedDate", "pZxddLewqU");
        setField(term3185608, term3185608.getClass(), "firstGameId", "JJNprPXPtJ");
        setField(term3185608, term3185608.getClass(), "firstRomVersion", "mNCulrcoWJ");
        setField(term3185608, term3185608.getClass(), "firstDataVersion", "SCXqoNVkjh");
        setField(term3185608, term3185608.getClass(), "firstPlayDate", "SkMqKPTzUo");
        setField(term3185608, term3185608.getClass(), "lastGameId", "leGLvyLzGc");
        setField(term3185608, term3185608.getClass(), "lastRomVersion", "JYRutceCTP");
        setField(term3185608, term3185608.getClass(), "lastDataVersion", "VxumGwokOm");
        setField(term3185608, term3185608.getClass(), "compatibleCmVersion", "TZKlCgoBTo");
        setField(term3185608, term3185608.getClass(), "lastPlayDate", "GJtsRZNfDI");
        setIntField(term3185608, term3185608.getClass(), "lastPlaceId", -611657641);
        setField(term3185608, term3185608.getClass(), "lastPlaceName", "twJperVvpc");
        setIntField(term3185608, term3185608.getClass(), "lastRegionId", -519959966);
        setField(term3185608, term3185608.getClass(), "lastRegionName", "MQKFTWYGAU");
        setIntField(term3185608, term3185608.getClass(), "lastAllNetId", 1517904340);
        setField(term3185608, term3185608.getClass(), "lastClientId", "UewhQNhpQx");
        setIntField(term3185608, term3185608.getClass(), "lastUsedDeckId", -2005201964);
        setIntField(term3185608, term3185608.getClass(), "lastPlayMusicLevel", -1873453876);
        setIntField(term3185608, term3185608.getClass(), "lastEmoneyBrand", 101363284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term3185608, args);
    }

};


