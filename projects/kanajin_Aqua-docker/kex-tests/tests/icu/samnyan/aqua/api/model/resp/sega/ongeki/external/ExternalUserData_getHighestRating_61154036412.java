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

public class ExternalUserData_getHighestRating_61154036412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100902;

    public ExternalUserData_getHighestRating_61154036412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100902 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term100902, term100902.getClass(), "accessCode", "HsBwPvBQYq");
        setField(term100902, term100902.getClass(), "userName", "mbQVAHLnYZ");
        setIntField(term100902, term100902.getClass(), "level", 738184428);
        setIntField(term100902, term100902.getClass(), "reincarnationNum", 742693469);
        setLongField(term100902, term100902.getClass(), "exp", -4005828385271750251L);
        setLongField(term100902, term100902.getClass(), "point", 6749474520579652998L);
        setLongField(term100902, term100902.getClass(), "totalPoint", 2301209664232124921L);
        setIntField(term100902, term100902.getClass(), "playCount", -680799146);
        setIntField(term100902, term100902.getClass(), "jewelCount", -624130052);
        setIntField(term100902, term100902.getClass(), "totalJewelCount", 1393208863);
        setIntField(term100902, term100902.getClass(), "medalCount", -1178534678);
        setIntField(term100902, term100902.getClass(), "playerRating", 849870303);
        setIntField(term100902, term100902.getClass(), "highestRating", -133282941);
        setIntField(term100902, term100902.getClass(), "battlePoint", -894846771);
        setIntField(term100902, term100902.getClass(), "bestBattlePoint", 183214400);
        setIntField(term100902, term100902.getClass(), "overDamageBattlePoint", -408220592);
        setIntField(term100902, term100902.getClass(), "nameplateId", 1058802595);
        setIntField(term100902, term100902.getClass(), "trophyId", -1671263450);
        setIntField(term100902, term100902.getClass(), "cardId", 750084667);
        setIntField(term100902, term100902.getClass(), "characterId", 847923537);
        setIntField(term100902, term100902.getClass(), "tabSetting", 1193785062);
        setIntField(term100902, term100902.getClass(), "tabSortSetting", -951685340);
        setIntField(term100902, term100902.getClass(), "cardCategorySetting", 2029529208);
        setIntField(term100902, term100902.getClass(), "cardSortSetting", -1301133780);
        setIntField(term100902, term100902.getClass(), "rivalScoreCategorySetting", -1078238868);
        setIntField(term100902, term100902.getClass(), "playedTutorialBit", -912824629);
        setIntField(term100902, term100902.getClass(), "firstTutorialCancelNum", -1049478321);
        setLongField(term100902, term100902.getClass(), "sumTechHighScore", 4816798014595709050L);
        setLongField(term100902, term100902.getClass(), "sumTechBasicHighScore", -5083481370084073907L);
        setLongField(term100902, term100902.getClass(), "sumTechAdvancedHighScore", 4442815134458583731L);
        setLongField(term100902, term100902.getClass(), "sumTechExpertHighScore", 236867616603711542L);
        setLongField(term100902, term100902.getClass(), "sumTechMasterHighScore", -2657684679287156727L);
        setLongField(term100902, term100902.getClass(), "sumTechLunaticHighScore", -1199100702736789765L);
        setLongField(term100902, term100902.getClass(), "sumBattleHighScore", -6355125531843490414L);
        setLongField(term100902, term100902.getClass(), "sumBattleBasicHighScore", 63184321465033031L);
        setLongField(term100902, term100902.getClass(), "sumBattleAdvancedHighScore", 4161342594538013440L);
        setLongField(term100902, term100902.getClass(), "sumBattleExpertHighScore", 1312631357330663214L);
        setLongField(term100902, term100902.getClass(), "sumBattleMasterHighScore", 713741022574034502L);
        setLongField(term100902, term100902.getClass(), "sumBattleLunaticHighScore", 2684889914049833069L);
        setField(term100902, term100902.getClass(), "eventWatchedDate", "gzXCSzfLRw");
        setField(term100902, term100902.getClass(), "cmEventWatchedDate", "STbIzhKYbc");
        setField(term100902, term100902.getClass(), "firstGameId", "GiNgzUhphY");
        setField(term100902, term100902.getClass(), "firstRomVersion", "umZbyHuBhr");
        setField(term100902, term100902.getClass(), "firstDataVersion", "tOrFBrfbWp");
        setField(term100902, term100902.getClass(), "firstPlayDate", "lmFPylVjXc");
        setField(term100902, term100902.getClass(), "lastGameId", "JWkqmdEawJ");
        setField(term100902, term100902.getClass(), "lastRomVersion", "vvuzTrHlgy");
        setField(term100902, term100902.getClass(), "lastDataVersion", "YJrFsMWVir");
        setField(term100902, term100902.getClass(), "compatibleCmVersion", "qOiyGQvBYd");
        setField(term100902, term100902.getClass(), "lastPlayDate", "pLqzknftJT");
        setIntField(term100902, term100902.getClass(), "lastPlaceId", -1168929868);
        setField(term100902, term100902.getClass(), "lastPlaceName", "ThVBdUbZdZ");
        setIntField(term100902, term100902.getClass(), "lastRegionId", -831051521);
        setField(term100902, term100902.getClass(), "lastRegionName", "aczVliXJwv");
        setIntField(term100902, term100902.getClass(), "lastAllNetId", -1141163854);
        setField(term100902, term100902.getClass(), "lastClientId", "arwgNGuWdv");
        setIntField(term100902, term100902.getClass(), "lastUsedDeckId", -1015993088);
        setIntField(term100902, term100902.getClass(), "lastPlayMusicLevel", -120593310);
        setIntField(term100902, term100902.getClass(), "lastEmoneyBrand", 1357256293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term100902, args);
    }

};


