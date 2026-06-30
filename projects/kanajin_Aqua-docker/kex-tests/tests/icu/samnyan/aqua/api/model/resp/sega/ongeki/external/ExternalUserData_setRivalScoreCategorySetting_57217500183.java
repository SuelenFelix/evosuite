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
import java.lang.Integer;

public class ExternalUserData_setRivalScoreCategorySetting_57217500183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129106;
     Object term129342;

    public ExternalUserData_setRivalScoreCategorySetting_57217500183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129106 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term129106, term129106.getClass(), "accessCode", "lJgxCBLHFM");
        setField(term129106, term129106.getClass(), "userName", "AMJhKACfge");
        setIntField(term129106, term129106.getClass(), "level", 1298889892);
        setIntField(term129106, term129106.getClass(), "reincarnationNum", 1226917990);
        setLongField(term129106, term129106.getClass(), "exp", -9209805423098416493L);
        setLongField(term129106, term129106.getClass(), "point", -7933271144025637984L);
        setLongField(term129106, term129106.getClass(), "totalPoint", 3690542535599826779L);
        setIntField(term129106, term129106.getClass(), "playCount", -89281425);
        setIntField(term129106, term129106.getClass(), "jewelCount", 1262193901);
        setIntField(term129106, term129106.getClass(), "totalJewelCount", -134497289);
        setIntField(term129106, term129106.getClass(), "medalCount", 2048146220);
        setIntField(term129106, term129106.getClass(), "playerRating", -399396275);
        setIntField(term129106, term129106.getClass(), "highestRating", -1316868332);
        setIntField(term129106, term129106.getClass(), "battlePoint", 1554834873);
        setIntField(term129106, term129106.getClass(), "bestBattlePoint", -1590493662);
        setIntField(term129106, term129106.getClass(), "overDamageBattlePoint", 1802219275);
        setIntField(term129106, term129106.getClass(), "nameplateId", -697355325);
        setIntField(term129106, term129106.getClass(), "trophyId", 1306219827);
        setIntField(term129106, term129106.getClass(), "cardId", -1127264829);
        setIntField(term129106, term129106.getClass(), "characterId", 1479371730);
        setIntField(term129106, term129106.getClass(), "tabSetting", 1619996616);
        setIntField(term129106, term129106.getClass(), "tabSortSetting", 815370471);
        setIntField(term129106, term129106.getClass(), "cardCategorySetting", -1410876055);
        setIntField(term129106, term129106.getClass(), "cardSortSetting", 1126738115);
        setIntField(term129106, term129106.getClass(), "rivalScoreCategorySetting", 516922474);
        setIntField(term129106, term129106.getClass(), "playedTutorialBit", -1934344988);
        setIntField(term129106, term129106.getClass(), "firstTutorialCancelNum", 1224563988);
        setLongField(term129106, term129106.getClass(), "sumTechHighScore", -8276160793799992908L);
        setLongField(term129106, term129106.getClass(), "sumTechBasicHighScore", 2850309609822456590L);
        setLongField(term129106, term129106.getClass(), "sumTechAdvancedHighScore", -2755760342811919315L);
        setLongField(term129106, term129106.getClass(), "sumTechExpertHighScore", 2160976780758240372L);
        setLongField(term129106, term129106.getClass(), "sumTechMasterHighScore", 7795561592859762852L);
        setLongField(term129106, term129106.getClass(), "sumTechLunaticHighScore", 5615105314199345292L);
        setLongField(term129106, term129106.getClass(), "sumBattleHighScore", 1995097271982095425L);
        setLongField(term129106, term129106.getClass(), "sumBattleBasicHighScore", -2666860666928783917L);
        setLongField(term129106, term129106.getClass(), "sumBattleAdvancedHighScore", 1012896355243506341L);
        setLongField(term129106, term129106.getClass(), "sumBattleExpertHighScore", 6965558236170239942L);
        setLongField(term129106, term129106.getClass(), "sumBattleMasterHighScore", 1458709963903698697L);
        setLongField(term129106, term129106.getClass(), "sumBattleLunaticHighScore", 7212759459207544486L);
        setField(term129106, term129106.getClass(), "eventWatchedDate", "ojirbuIOdW");
        setField(term129106, term129106.getClass(), "cmEventWatchedDate", "GBtmoSoIuB");
        setField(term129106, term129106.getClass(), "firstGameId", "LOqdJRaXPm");
        setField(term129106, term129106.getClass(), "firstRomVersion", "iFmgidNTpy");
        setField(term129106, term129106.getClass(), "firstDataVersion", "ILeEQwQBZy");
        setField(term129106, term129106.getClass(), "firstPlayDate", "RPGGLeBsra");
        setField(term129106, term129106.getClass(), "lastGameId", "nlwCqQVEZc");
        setField(term129106, term129106.getClass(), "lastRomVersion", "GZxxphcsJI");
        setField(term129106, term129106.getClass(), "lastDataVersion", "UmQkCFzvDC");
        setField(term129106, term129106.getClass(), "compatibleCmVersion", "WFsvWcdxyE");
        setField(term129106, term129106.getClass(), "lastPlayDate", "huVhrFhAXC");
        setIntField(term129106, term129106.getClass(), "lastPlaceId", -1434138256);
        setField(term129106, term129106.getClass(), "lastPlaceName", "QSFBFIKDuA");
        setIntField(term129106, term129106.getClass(), "lastRegionId", 1545174224);
        setField(term129106, term129106.getClass(), "lastRegionName", "RcrOmqAXJy");
        setIntField(term129106, term129106.getClass(), "lastAllNetId", -967680421);
        setField(term129106, term129106.getClass(), "lastClientId", "eWAJSQqtUy");
        setIntField(term129106, term129106.getClass(), "lastUsedDeckId", 343373673);
        setIntField(term129106, term129106.getClass(), "lastPlayMusicLevel", -1027713907);
        setIntField(term129106, term129106.getClass(), "lastEmoneyBrand", -1188661854);
        term129342 = new Integer(1411236979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term129342;
        callMethod(klass, "setRivalScoreCategorySetting", argTypes, term129106, args);
    }

};


