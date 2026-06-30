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

public class ExternalUserData_getFirstGameId_95901413341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112386;

    public ExternalUserData_getFirstGameId_95901413341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112386 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term112386, term112386.getClass(), "accessCode", "FqIUPZQKtw");
        setField(term112386, term112386.getClass(), "userName", "QEzXCFJyaD");
        setIntField(term112386, term112386.getClass(), "level", 98167318);
        setIntField(term112386, term112386.getClass(), "reincarnationNum", -1482729618);
        setLongField(term112386, term112386.getClass(), "exp", 1908480098967503445L);
        setLongField(term112386, term112386.getClass(), "point", 1939409221013600883L);
        setLongField(term112386, term112386.getClass(), "totalPoint", 6650512235487380881L);
        setIntField(term112386, term112386.getClass(), "playCount", 309257520);
        setIntField(term112386, term112386.getClass(), "jewelCount", 1532928300);
        setIntField(term112386, term112386.getClass(), "totalJewelCount", 1922647405);
        setIntField(term112386, term112386.getClass(), "medalCount", 1800912477);
        setIntField(term112386, term112386.getClass(), "playerRating", -1093857374);
        setIntField(term112386, term112386.getClass(), "highestRating", -76421334);
        setIntField(term112386, term112386.getClass(), "battlePoint", -16676421);
        setIntField(term112386, term112386.getClass(), "bestBattlePoint", -1305807639);
        setIntField(term112386, term112386.getClass(), "overDamageBattlePoint", -707785462);
        setIntField(term112386, term112386.getClass(), "nameplateId", 368585456);
        setIntField(term112386, term112386.getClass(), "trophyId", -705998759);
        setIntField(term112386, term112386.getClass(), "cardId", 691836397);
        setIntField(term112386, term112386.getClass(), "characterId", -370299530);
        setIntField(term112386, term112386.getClass(), "tabSetting", -983826321);
        setIntField(term112386, term112386.getClass(), "tabSortSetting", 1711731218);
        setIntField(term112386, term112386.getClass(), "cardCategorySetting", -986041789);
        setIntField(term112386, term112386.getClass(), "cardSortSetting", 1462489633);
        setIntField(term112386, term112386.getClass(), "rivalScoreCategorySetting", -1745757750);
        setIntField(term112386, term112386.getClass(), "playedTutorialBit", 1629463081);
        setIntField(term112386, term112386.getClass(), "firstTutorialCancelNum", 467888506);
        setLongField(term112386, term112386.getClass(), "sumTechHighScore", -8796965023246191952L);
        setLongField(term112386, term112386.getClass(), "sumTechBasicHighScore", 7146866325263763663L);
        setLongField(term112386, term112386.getClass(), "sumTechAdvancedHighScore", -2840005887862287668L);
        setLongField(term112386, term112386.getClass(), "sumTechExpertHighScore", 7909964535341297656L);
        setLongField(term112386, term112386.getClass(), "sumTechMasterHighScore", 1502897996915587896L);
        setLongField(term112386, term112386.getClass(), "sumTechLunaticHighScore", 5807078452178071797L);
        setLongField(term112386, term112386.getClass(), "sumBattleHighScore", 8993016582371171372L);
        setLongField(term112386, term112386.getClass(), "sumBattleBasicHighScore", 282420200720715089L);
        setLongField(term112386, term112386.getClass(), "sumBattleAdvancedHighScore", -8137183670134160915L);
        setLongField(term112386, term112386.getClass(), "sumBattleExpertHighScore", -7361022332795272676L);
        setLongField(term112386, term112386.getClass(), "sumBattleMasterHighScore", 3571534492929139026L);
        setLongField(term112386, term112386.getClass(), "sumBattleLunaticHighScore", 1768510726246994451L);
        setField(term112386, term112386.getClass(), "eventWatchedDate", "MMfSSDzqaq");
        setField(term112386, term112386.getClass(), "cmEventWatchedDate", "kwiZbXSGpI");
        setField(term112386, term112386.getClass(), "firstGameId", "aFAywDDNnc");
        setField(term112386, term112386.getClass(), "firstRomVersion", "boAPrSbTkG");
        setField(term112386, term112386.getClass(), "firstDataVersion", "CHKiyIGmzv");
        setField(term112386, term112386.getClass(), "firstPlayDate", "erbOqSnPtH");
        setField(term112386, term112386.getClass(), "lastGameId", "bUrfDTGdWW");
        setField(term112386, term112386.getClass(), "lastRomVersion", "ZOuEgtmesa");
        setField(term112386, term112386.getClass(), "lastDataVersion", "KEGjtYjfap");
        setField(term112386, term112386.getClass(), "compatibleCmVersion", "orsNfoaJuM");
        setField(term112386, term112386.getClass(), "lastPlayDate", "wXrGkjBDmb");
        setIntField(term112386, term112386.getClass(), "lastPlaceId", -2043368935);
        setField(term112386, term112386.getClass(), "lastPlaceName", "LmjMDcYNHm");
        setIntField(term112386, term112386.getClass(), "lastRegionId", 1832988966);
        setField(term112386, term112386.getClass(), "lastRegionName", "vbcZGIvgux");
        setIntField(term112386, term112386.getClass(), "lastAllNetId", 390509984);
        setField(term112386, term112386.getClass(), "lastClientId", "ZVMjJRyNia");
        setIntField(term112386, term112386.getClass(), "lastUsedDeckId", -1037149755);
        setIntField(term112386, term112386.getClass(), "lastPlayMusicLevel", -1956670174);
        setIntField(term112386, term112386.getClass(), "lastEmoneyBrand", 181795780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstGameId", argTypes, term112386, args);
    }

};


