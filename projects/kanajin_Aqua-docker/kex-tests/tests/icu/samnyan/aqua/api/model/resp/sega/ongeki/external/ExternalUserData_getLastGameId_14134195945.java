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

public class ExternalUserData_getLastGameId_14134195945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113970;

    public ExternalUserData_getLastGameId_14134195945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113970 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term113970, term113970.getClass(), "accessCode", "jrbsNrloog");
        setField(term113970, term113970.getClass(), "userName", "HgvnIvqOcq");
        setIntField(term113970, term113970.getClass(), "level", 1978808484);
        setIntField(term113970, term113970.getClass(), "reincarnationNum", -698188242);
        setLongField(term113970, term113970.getClass(), "exp", 1833599522965636758L);
        setLongField(term113970, term113970.getClass(), "point", 9052837432546483731L);
        setLongField(term113970, term113970.getClass(), "totalPoint", 720893526583298286L);
        setIntField(term113970, term113970.getClass(), "playCount", 1573519811);
        setIntField(term113970, term113970.getClass(), "jewelCount", 1617713509);
        setIntField(term113970, term113970.getClass(), "totalJewelCount", -2030591781);
        setIntField(term113970, term113970.getClass(), "medalCount", -2087246131);
        setIntField(term113970, term113970.getClass(), "playerRating", -1260398274);
        setIntField(term113970, term113970.getClass(), "highestRating", 1852477784);
        setIntField(term113970, term113970.getClass(), "battlePoint", 560784179);
        setIntField(term113970, term113970.getClass(), "bestBattlePoint", -64793320);
        setIntField(term113970, term113970.getClass(), "overDamageBattlePoint", -692517157);
        setIntField(term113970, term113970.getClass(), "nameplateId", 904986822);
        setIntField(term113970, term113970.getClass(), "trophyId", -1431233374);
        setIntField(term113970, term113970.getClass(), "cardId", -347764581);
        setIntField(term113970, term113970.getClass(), "characterId", -1078227747);
        setIntField(term113970, term113970.getClass(), "tabSetting", -1233058039);
        setIntField(term113970, term113970.getClass(), "tabSortSetting", -410033021);
        setIntField(term113970, term113970.getClass(), "cardCategorySetting", -1542000875);
        setIntField(term113970, term113970.getClass(), "cardSortSetting", 704056103);
        setIntField(term113970, term113970.getClass(), "rivalScoreCategorySetting", -573354656);
        setIntField(term113970, term113970.getClass(), "playedTutorialBit", 1743038105);
        setIntField(term113970, term113970.getClass(), "firstTutorialCancelNum", 1824051238);
        setLongField(term113970, term113970.getClass(), "sumTechHighScore", -7231097584212090931L);
        setLongField(term113970, term113970.getClass(), "sumTechBasicHighScore", -2451137721126559250L);
        setLongField(term113970, term113970.getClass(), "sumTechAdvancedHighScore", -7142079422361265774L);
        setLongField(term113970, term113970.getClass(), "sumTechExpertHighScore", 4204446600829498873L);
        setLongField(term113970, term113970.getClass(), "sumTechMasterHighScore", 7261930415384168406L);
        setLongField(term113970, term113970.getClass(), "sumTechLunaticHighScore", 284407895381973861L);
        setLongField(term113970, term113970.getClass(), "sumBattleHighScore", 5812631139346531212L);
        setLongField(term113970, term113970.getClass(), "sumBattleBasicHighScore", 630357306867194790L);
        setLongField(term113970, term113970.getClass(), "sumBattleAdvancedHighScore", 4853024974865293806L);
        setLongField(term113970, term113970.getClass(), "sumBattleExpertHighScore", 4963556831644279467L);
        setLongField(term113970, term113970.getClass(), "sumBattleMasterHighScore", 6827756407148809342L);
        setLongField(term113970, term113970.getClass(), "sumBattleLunaticHighScore", -6279272390622510968L);
        setField(term113970, term113970.getClass(), "eventWatchedDate", "zaYpkkfbRP");
        setField(term113970, term113970.getClass(), "cmEventWatchedDate", "fIoQOZeoVK");
        setField(term113970, term113970.getClass(), "firstGameId", "tTkJxeMIhG");
        setField(term113970, term113970.getClass(), "firstRomVersion", "dZFkTlgeNK");
        setField(term113970, term113970.getClass(), "firstDataVersion", "fIpDMwXuFo");
        setField(term113970, term113970.getClass(), "firstPlayDate", "JOzegoretC");
        setField(term113970, term113970.getClass(), "lastGameId", "tPXOigwNgS");
        setField(term113970, term113970.getClass(), "lastRomVersion", "DJloaaFcGd");
        setField(term113970, term113970.getClass(), "lastDataVersion", "qtJfVtqXwz");
        setField(term113970, term113970.getClass(), "compatibleCmVersion", "rPuqsGPaYs");
        setField(term113970, term113970.getClass(), "lastPlayDate", "ytaTlbXdUL");
        setIntField(term113970, term113970.getClass(), "lastPlaceId", -1070640419);
        setField(term113970, term113970.getClass(), "lastPlaceName", "OPVZFRAEHh");
        setIntField(term113970, term113970.getClass(), "lastRegionId", 388889531);
        setField(term113970, term113970.getClass(), "lastRegionName", "LhHCNqoJli");
        setIntField(term113970, term113970.getClass(), "lastAllNetId", -1925539501);
        setField(term113970, term113970.getClass(), "lastClientId", "WOGuKtBNyF");
        setIntField(term113970, term113970.getClass(), "lastUsedDeckId", -2042593210);
        setIntField(term113970, term113970.getClass(), "lastPlayMusicLevel", 176820298);
        setIntField(term113970, term113970.getClass(), "lastEmoneyBrand", 1848174293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term113970, args);
    }

};


