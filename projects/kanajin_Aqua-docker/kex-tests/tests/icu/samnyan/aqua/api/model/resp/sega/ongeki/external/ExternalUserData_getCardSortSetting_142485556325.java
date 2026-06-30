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

public class ExternalUserData_getCardSortSetting_142485556325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3174124;

    public ExternalUserData_getCardSortSetting_142485556325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3174124 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3174124, term3174124.getClass(), "accessCode", "ECbVxJndVP");
        setField(term3174124, term3174124.getClass(), "userName", "SVhxAQPIbD");
        setIntField(term3174124, term3174124.getClass(), "level", -1165828601);
        setIntField(term3174124, term3174124.getClass(), "reincarnationNum", 1956386240);
        setLongField(term3174124, term3174124.getClass(), "exp", -8092521989280941744L);
        setLongField(term3174124, term3174124.getClass(), "point", -5649011700934456937L);
        setLongField(term3174124, term3174124.getClass(), "totalPoint", -3473290850682460422L);
        setIntField(term3174124, term3174124.getClass(), "playCount", 1953440785);
        setIntField(term3174124, term3174124.getClass(), "jewelCount", 1382415575);
        setIntField(term3174124, term3174124.getClass(), "totalJewelCount", 1754380294);
        setIntField(term3174124, term3174124.getClass(), "medalCount", -123373160);
        setIntField(term3174124, term3174124.getClass(), "playerRating", 897709219);
        setIntField(term3174124, term3174124.getClass(), "highestRating", 1902184536);
        setIntField(term3174124, term3174124.getClass(), "battlePoint", 1219618547);
        setIntField(term3174124, term3174124.getClass(), "bestBattlePoint", 1867950127);
        setIntField(term3174124, term3174124.getClass(), "overDamageBattlePoint", 1478178464);
        setIntField(term3174124, term3174124.getClass(), "nameplateId", -470541414);
        setIntField(term3174124, term3174124.getClass(), "trophyId", 339334081);
        setIntField(term3174124, term3174124.getClass(), "cardId", 1878769723);
        setIntField(term3174124, term3174124.getClass(), "characterId", 2047019513);
        setIntField(term3174124, term3174124.getClass(), "tabSetting", 1371177854);
        setIntField(term3174124, term3174124.getClass(), "tabSortSetting", 884449046);
        setIntField(term3174124, term3174124.getClass(), "cardCategorySetting", 1489216295);
        setIntField(term3174124, term3174124.getClass(), "cardSortSetting", 325104541);
        setIntField(term3174124, term3174124.getClass(), "rivalScoreCategorySetting", 1952732187);
        setIntField(term3174124, term3174124.getClass(), "playedTutorialBit", -968276506);
        setIntField(term3174124, term3174124.getClass(), "firstTutorialCancelNum", 2120410849);
        setLongField(term3174124, term3174124.getClass(), "sumTechHighScore", -8996785106429704481L);
        setLongField(term3174124, term3174124.getClass(), "sumTechBasicHighScore", 1891790056096649481L);
        setLongField(term3174124, term3174124.getClass(), "sumTechAdvancedHighScore", 4528186996069767245L);
        setLongField(term3174124, term3174124.getClass(), "sumTechExpertHighScore", 3778591471328059128L);
        setLongField(term3174124, term3174124.getClass(), "sumTechMasterHighScore", -1585898007841211008L);
        setLongField(term3174124, term3174124.getClass(), "sumTechLunaticHighScore", 9119069160374388336L);
        setLongField(term3174124, term3174124.getClass(), "sumBattleHighScore", -4114100745627631431L);
        setLongField(term3174124, term3174124.getClass(), "sumBattleBasicHighScore", -4873188533939791418L);
        setLongField(term3174124, term3174124.getClass(), "sumBattleAdvancedHighScore", -8415388270986030330L);
        setLongField(term3174124, term3174124.getClass(), "sumBattleExpertHighScore", 5403454399078972104L);
        setLongField(term3174124, term3174124.getClass(), "sumBattleMasterHighScore", 3190920589672138402L);
        setLongField(term3174124, term3174124.getClass(), "sumBattleLunaticHighScore", -3921182691251096135L);
        setField(term3174124, term3174124.getClass(), "eventWatchedDate", "FFnepDRzUN");
        setField(term3174124, term3174124.getClass(), "cmEventWatchedDate", "svTcPStvyc");
        setField(term3174124, term3174124.getClass(), "firstGameId", "RgndfwGNLy");
        setField(term3174124, term3174124.getClass(), "firstRomVersion", "eXBBzVFndn");
        setField(term3174124, term3174124.getClass(), "firstDataVersion", "krZyQTPkqX");
        setField(term3174124, term3174124.getClass(), "firstPlayDate", "ZEBykTyqsO");
        setField(term3174124, term3174124.getClass(), "lastGameId", "PXRYlCBBfn");
        setField(term3174124, term3174124.getClass(), "lastRomVersion", "mtwWNWtrZg");
        setField(term3174124, term3174124.getClass(), "lastDataVersion", "txPPNJiNQO");
        setField(term3174124, term3174124.getClass(), "compatibleCmVersion", "nncvHZYZcN");
        setField(term3174124, term3174124.getClass(), "lastPlayDate", "zMmTJtscYI");
        setIntField(term3174124, term3174124.getClass(), "lastPlaceId", -338686798);
        setField(term3174124, term3174124.getClass(), "lastPlaceName", "MbJXglaLKp");
        setIntField(term3174124, term3174124.getClass(), "lastRegionId", -1099046739);
        setField(term3174124, term3174124.getClass(), "lastRegionName", "tBrDyOgaiI");
        setIntField(term3174124, term3174124.getClass(), "lastAllNetId", -46142371);
        setField(term3174124, term3174124.getClass(), "lastClientId", "BRkzTLyUqT");
        setIntField(term3174124, term3174124.getClass(), "lastUsedDeckId", -367816462);
        setIntField(term3174124, term3174124.getClass(), "lastPlayMusicLevel", -1865932255);
        setIntField(term3174124, term3174124.getClass(), "lastEmoneyBrand", 2116173517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardSortSetting", argTypes, term3174124, args);
    }

};


