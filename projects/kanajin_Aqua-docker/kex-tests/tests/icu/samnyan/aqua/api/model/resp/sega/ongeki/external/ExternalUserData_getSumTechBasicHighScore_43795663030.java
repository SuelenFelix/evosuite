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

public class ExternalUserData_getSumTechBasicHighScore_43795663030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3176104;

    public ExternalUserData_getSumTechBasicHighScore_43795663030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3176104 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3176104, term3176104.getClass(), "accessCode", "cLEbaRtiKy");
        setField(term3176104, term3176104.getClass(), "userName", "jpjpBaWGyJ");
        setIntField(term3176104, term3176104.getClass(), "level", 1106128788);
        setIntField(term3176104, term3176104.getClass(), "reincarnationNum", 391985333);
        setLongField(term3176104, term3176104.getClass(), "exp", 2675771078779441587L);
        setLongField(term3176104, term3176104.getClass(), "point", -5668485065570966019L);
        setLongField(term3176104, term3176104.getClass(), "totalPoint", 5363460583740735470L);
        setIntField(term3176104, term3176104.getClass(), "playCount", 888413019);
        setIntField(term3176104, term3176104.getClass(), "jewelCount", -1309991868);
        setIntField(term3176104, term3176104.getClass(), "totalJewelCount", -1342029098);
        setIntField(term3176104, term3176104.getClass(), "medalCount", -266275030);
        setIntField(term3176104, term3176104.getClass(), "playerRating", -693661200);
        setIntField(term3176104, term3176104.getClass(), "highestRating", 169629260);
        setIntField(term3176104, term3176104.getClass(), "battlePoint", -2015271571);
        setIntField(term3176104, term3176104.getClass(), "bestBattlePoint", -1897419620);
        setIntField(term3176104, term3176104.getClass(), "overDamageBattlePoint", -1916309309);
        setIntField(term3176104, term3176104.getClass(), "nameplateId", -2081704355);
        setIntField(term3176104, term3176104.getClass(), "trophyId", -1841082229);
        setIntField(term3176104, term3176104.getClass(), "cardId", -1445068037);
        setIntField(term3176104, term3176104.getClass(), "characterId", 1253061893);
        setIntField(term3176104, term3176104.getClass(), "tabSetting", -1637494603);
        setIntField(term3176104, term3176104.getClass(), "tabSortSetting", -1862483392);
        setIntField(term3176104, term3176104.getClass(), "cardCategorySetting", 396020388);
        setIntField(term3176104, term3176104.getClass(), "cardSortSetting", -1817321494);
        setIntField(term3176104, term3176104.getClass(), "rivalScoreCategorySetting", -2087108379);
        setIntField(term3176104, term3176104.getClass(), "playedTutorialBit", -1629501226);
        setIntField(term3176104, term3176104.getClass(), "firstTutorialCancelNum", 1569385462);
        setLongField(term3176104, term3176104.getClass(), "sumTechHighScore", 7029427765987219471L);
        setLongField(term3176104, term3176104.getClass(), "sumTechBasicHighScore", -4024843182202605987L);
        setLongField(term3176104, term3176104.getClass(), "sumTechAdvancedHighScore", -3906459530128994851L);
        setLongField(term3176104, term3176104.getClass(), "sumTechExpertHighScore", -8483997328173788466L);
        setLongField(term3176104, term3176104.getClass(), "sumTechMasterHighScore", 4888317481357971183L);
        setLongField(term3176104, term3176104.getClass(), "sumTechLunaticHighScore", -7318675403442038425L);
        setLongField(term3176104, term3176104.getClass(), "sumBattleHighScore", -5943831000547232686L);
        setLongField(term3176104, term3176104.getClass(), "sumBattleBasicHighScore", -5574788575745882101L);
        setLongField(term3176104, term3176104.getClass(), "sumBattleAdvancedHighScore", -4925096456045390693L);
        setLongField(term3176104, term3176104.getClass(), "sumBattleExpertHighScore", 6070869799234466817L);
        setLongField(term3176104, term3176104.getClass(), "sumBattleMasterHighScore", 370511548610800684L);
        setLongField(term3176104, term3176104.getClass(), "sumBattleLunaticHighScore", 93856264250764759L);
        setField(term3176104, term3176104.getClass(), "eventWatchedDate", "MGyKlveUdf");
        setField(term3176104, term3176104.getClass(), "cmEventWatchedDate", "VVLgFOtoLn");
        setField(term3176104, term3176104.getClass(), "firstGameId", "gGHBFRUvYm");
        setField(term3176104, term3176104.getClass(), "firstRomVersion", "YvBJLCZifz");
        setField(term3176104, term3176104.getClass(), "firstDataVersion", "QMNOBzOTxQ");
        setField(term3176104, term3176104.getClass(), "firstPlayDate", "FfexRrgkmB");
        setField(term3176104, term3176104.getClass(), "lastGameId", "jMKcNAOfyZ");
        setField(term3176104, term3176104.getClass(), "lastRomVersion", "zyemTUyXxv");
        setField(term3176104, term3176104.getClass(), "lastDataVersion", "PxOKIxxYrt");
        setField(term3176104, term3176104.getClass(), "compatibleCmVersion", "CVLeWSZhLY");
        setField(term3176104, term3176104.getClass(), "lastPlayDate", "STIeBcJMeH");
        setIntField(term3176104, term3176104.getClass(), "lastPlaceId", 812436144);
        setField(term3176104, term3176104.getClass(), "lastPlaceName", "pwWAHTyjfs");
        setIntField(term3176104, term3176104.getClass(), "lastRegionId", 1372358528);
        setField(term3176104, term3176104.getClass(), "lastRegionName", "bNWaAKyENi");
        setIntField(term3176104, term3176104.getClass(), "lastAllNetId", 986374270);
        setField(term3176104, term3176104.getClass(), "lastClientId", "WeHuJIcmVy");
        setIntField(term3176104, term3176104.getClass(), "lastUsedDeckId", -2060296667);
        setIntField(term3176104, term3176104.getClass(), "lastPlayMusicLevel", -1210763552);
        setIntField(term3176104, term3176104.getClass(), "lastEmoneyBrand", -1136161009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechBasicHighScore", argTypes, term3176104, args);
    }

};


