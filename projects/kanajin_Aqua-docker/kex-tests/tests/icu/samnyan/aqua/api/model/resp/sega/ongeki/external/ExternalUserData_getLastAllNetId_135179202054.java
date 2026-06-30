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

public class ExternalUserData_getLastAllNetId_135179202054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117534;

    public ExternalUserData_getLastAllNetId_135179202054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117534 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term117534, term117534.getClass(), "accessCode", "bNARBCCQim");
        setField(term117534, term117534.getClass(), "userName", "IUNYmythma");
        setIntField(term117534, term117534.getClass(), "level", 1443031698);
        setIntField(term117534, term117534.getClass(), "reincarnationNum", 1081453526);
        setLongField(term117534, term117534.getClass(), "exp", -1196613288262458205L);
        setLongField(term117534, term117534.getClass(), "point", -4353243523900058035L);
        setLongField(term117534, term117534.getClass(), "totalPoint", 7900596771603143871L);
        setIntField(term117534, term117534.getClass(), "playCount", -1949184472);
        setIntField(term117534, term117534.getClass(), "jewelCount", 1413606237);
        setIntField(term117534, term117534.getClass(), "totalJewelCount", 835818336);
        setIntField(term117534, term117534.getClass(), "medalCount", 2079573896);
        setIntField(term117534, term117534.getClass(), "playerRating", -1533349072);
        setIntField(term117534, term117534.getClass(), "highestRating", -1874930146);
        setIntField(term117534, term117534.getClass(), "battlePoint", 1297173634);
        setIntField(term117534, term117534.getClass(), "bestBattlePoint", 1426874727);
        setIntField(term117534, term117534.getClass(), "overDamageBattlePoint", 1413162113);
        setIntField(term117534, term117534.getClass(), "nameplateId", -2111473112);
        setIntField(term117534, term117534.getClass(), "trophyId", 523090397);
        setIntField(term117534, term117534.getClass(), "cardId", -1554787434);
        setIntField(term117534, term117534.getClass(), "characterId", -643229132);
        setIntField(term117534, term117534.getClass(), "tabSetting", 1107275099);
        setIntField(term117534, term117534.getClass(), "tabSortSetting", -607198983);
        setIntField(term117534, term117534.getClass(), "cardCategorySetting", 2122646258);
        setIntField(term117534, term117534.getClass(), "cardSortSetting", -351807075);
        setIntField(term117534, term117534.getClass(), "rivalScoreCategorySetting", 1749646560);
        setIntField(term117534, term117534.getClass(), "playedTutorialBit", 1050983103);
        setIntField(term117534, term117534.getClass(), "firstTutorialCancelNum", 827623307);
        setLongField(term117534, term117534.getClass(), "sumTechHighScore", -7727812548590909075L);
        setLongField(term117534, term117534.getClass(), "sumTechBasicHighScore", -7041400520007266498L);
        setLongField(term117534, term117534.getClass(), "sumTechAdvancedHighScore", 8056668597431253042L);
        setLongField(term117534, term117534.getClass(), "sumTechExpertHighScore", 4899158238784342068L);
        setLongField(term117534, term117534.getClass(), "sumTechMasterHighScore", 1137091658310647744L);
        setLongField(term117534, term117534.getClass(), "sumTechLunaticHighScore", -5771733709474376387L);
        setLongField(term117534, term117534.getClass(), "sumBattleHighScore", -486319717648901570L);
        setLongField(term117534, term117534.getClass(), "sumBattleBasicHighScore", 548239283608218118L);
        setLongField(term117534, term117534.getClass(), "sumBattleAdvancedHighScore", -2393150017658519295L);
        setLongField(term117534, term117534.getClass(), "sumBattleExpertHighScore", -282949357886650094L);
        setLongField(term117534, term117534.getClass(), "sumBattleMasterHighScore", 5675685642943024361L);
        setLongField(term117534, term117534.getClass(), "sumBattleLunaticHighScore", 2388536828509795515L);
        setField(term117534, term117534.getClass(), "eventWatchedDate", "sMZrsZlNQZ");
        setField(term117534, term117534.getClass(), "cmEventWatchedDate", "bQqeeCglIt");
        setField(term117534, term117534.getClass(), "firstGameId", "eZQGfGuyjn");
        setField(term117534, term117534.getClass(), "firstRomVersion", "wzlnektawT");
        setField(term117534, term117534.getClass(), "firstDataVersion", "TkfMUqKrVs");
        setField(term117534, term117534.getClass(), "firstPlayDate", "nrRAnhPOLE");
        setField(term117534, term117534.getClass(), "lastGameId", "KWOGOjMRVh");
        setField(term117534, term117534.getClass(), "lastRomVersion", "AZCNGxdxrF");
        setField(term117534, term117534.getClass(), "lastDataVersion", "QjuKOcxuCu");
        setField(term117534, term117534.getClass(), "compatibleCmVersion", "RAHHfUndRU");
        setField(term117534, term117534.getClass(), "lastPlayDate", "bmJqqZktWg");
        setIntField(term117534, term117534.getClass(), "lastPlaceId", -1294522706);
        setField(term117534, term117534.getClass(), "lastPlaceName", "iMkleCzkRF");
        setIntField(term117534, term117534.getClass(), "lastRegionId", -1583264571);
        setField(term117534, term117534.getClass(), "lastRegionName", "QmhWJdcFsE");
        setIntField(term117534, term117534.getClass(), "lastAllNetId", 485727620);
        setField(term117534, term117534.getClass(), "lastClientId", "bSTOabrbCe");
        setIntField(term117534, term117534.getClass(), "lastUsedDeckId", -1788254129);
        setIntField(term117534, term117534.getClass(), "lastPlayMusicLevel", -1821431907);
        setIntField(term117534, term117534.getClass(), "lastEmoneyBrand", 312597708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastAllNetId", argTypes, term117534, args);
    }

};


