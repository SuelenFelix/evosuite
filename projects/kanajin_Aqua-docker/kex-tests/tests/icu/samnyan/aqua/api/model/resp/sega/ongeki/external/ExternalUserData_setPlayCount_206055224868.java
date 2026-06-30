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

public class ExternalUserData_setPlayCount_206055224868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3191206;
     Object term3191442;

    public ExternalUserData_setPlayCount_206055224868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3191206 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3191206, term3191206.getClass(), "accessCode", "orNYBtpjPf");
        setField(term3191206, term3191206.getClass(), "userName", "xCrwgfcjzX");
        setIntField(term3191206, term3191206.getClass(), "level", -840383755);
        setIntField(term3191206, term3191206.getClass(), "reincarnationNum", -1775910923);
        setLongField(term3191206, term3191206.getClass(), "exp", 8544852428383466251L);
        setLongField(term3191206, term3191206.getClass(), "point", -3627508253564896723L);
        setLongField(term3191206, term3191206.getClass(), "totalPoint", -2080300041642291212L);
        setIntField(term3191206, term3191206.getClass(), "playCount", 1137779901);
        setIntField(term3191206, term3191206.getClass(), "jewelCount", 894411745);
        setIntField(term3191206, term3191206.getClass(), "totalJewelCount", 954547384);
        setIntField(term3191206, term3191206.getClass(), "medalCount", -1771443702);
        setIntField(term3191206, term3191206.getClass(), "playerRating", -1411525200);
        setIntField(term3191206, term3191206.getClass(), "highestRating", 243922625);
        setIntField(term3191206, term3191206.getClass(), "battlePoint", -152761695);
        setIntField(term3191206, term3191206.getClass(), "bestBattlePoint", -1779345014);
        setIntField(term3191206, term3191206.getClass(), "overDamageBattlePoint", 1322395021);
        setIntField(term3191206, term3191206.getClass(), "nameplateId", 136492416);
        setIntField(term3191206, term3191206.getClass(), "trophyId", -544700671);
        setIntField(term3191206, term3191206.getClass(), "cardId", 1333079988);
        setIntField(term3191206, term3191206.getClass(), "characterId", -848579354);
        setIntField(term3191206, term3191206.getClass(), "tabSetting", -1733795573);
        setIntField(term3191206, term3191206.getClass(), "tabSortSetting", -1301695599);
        setIntField(term3191206, term3191206.getClass(), "cardCategorySetting", 112269403);
        setIntField(term3191206, term3191206.getClass(), "cardSortSetting", -1812985296);
        setIntField(term3191206, term3191206.getClass(), "rivalScoreCategorySetting", -740934951);
        setIntField(term3191206, term3191206.getClass(), "playedTutorialBit", 338877438);
        setIntField(term3191206, term3191206.getClass(), "firstTutorialCancelNum", -356969443);
        setLongField(term3191206, term3191206.getClass(), "sumTechHighScore", 7046089021806310865L);
        setLongField(term3191206, term3191206.getClass(), "sumTechBasicHighScore", 1128238002729094886L);
        setLongField(term3191206, term3191206.getClass(), "sumTechAdvancedHighScore", -7633859713463136534L);
        setLongField(term3191206, term3191206.getClass(), "sumTechExpertHighScore", 6548779498496296179L);
        setLongField(term3191206, term3191206.getClass(), "sumTechMasterHighScore", 4404431132882596564L);
        setLongField(term3191206, term3191206.getClass(), "sumTechLunaticHighScore", -2213499793272195603L);
        setLongField(term3191206, term3191206.getClass(), "sumBattleHighScore", -6238058717852134236L);
        setLongField(term3191206, term3191206.getClass(), "sumBattleBasicHighScore", -4909626158416536604L);
        setLongField(term3191206, term3191206.getClass(), "sumBattleAdvancedHighScore", 7297850383835605576L);
        setLongField(term3191206, term3191206.getClass(), "sumBattleExpertHighScore", -6237176446243364116L);
        setLongField(term3191206, term3191206.getClass(), "sumBattleMasterHighScore", 7934758203823200237L);
        setLongField(term3191206, term3191206.getClass(), "sumBattleLunaticHighScore", -3494209972044899037L);
        setField(term3191206, term3191206.getClass(), "eventWatchedDate", "XvLEPPoRAq");
        setField(term3191206, term3191206.getClass(), "cmEventWatchedDate", "swpZRdKqnt");
        setField(term3191206, term3191206.getClass(), "firstGameId", "mdCaSzBWUa");
        setField(term3191206, term3191206.getClass(), "firstRomVersion", "vggkjmorDt");
        setField(term3191206, term3191206.getClass(), "firstDataVersion", "zBxvUHbDKT");
        setField(term3191206, term3191206.getClass(), "firstPlayDate", "lsGINznvjr");
        setField(term3191206, term3191206.getClass(), "lastGameId", "BLPPMuZPcq");
        setField(term3191206, term3191206.getClass(), "lastRomVersion", "LFjPFDfTyx");
        setField(term3191206, term3191206.getClass(), "lastDataVersion", "nFgIOwDGDT");
        setField(term3191206, term3191206.getClass(), "compatibleCmVersion", "vnTJLpgblH");
        setField(term3191206, term3191206.getClass(), "lastPlayDate", "CDIowsdfyM");
        setIntField(term3191206, term3191206.getClass(), "lastPlaceId", 1280205294);
        setField(term3191206, term3191206.getClass(), "lastPlaceName", "vYbByimzgX");
        setIntField(term3191206, term3191206.getClass(), "lastRegionId", 2099919935);
        setField(term3191206, term3191206.getClass(), "lastRegionName", "ihLwjAWZzV");
        setIntField(term3191206, term3191206.getClass(), "lastAllNetId", 236870823);
        setField(term3191206, term3191206.getClass(), "lastClientId", "fzqGyLWjMC");
        setIntField(term3191206, term3191206.getClass(), "lastUsedDeckId", 1621438939);
        setIntField(term3191206, term3191206.getClass(), "lastPlayMusicLevel", -2134123250);
        setIntField(term3191206, term3191206.getClass(), "lastEmoneyBrand", 2031267586);
        term3191442 = new Integer(904237477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3191442;
        callMethod(klass, "setPlayCount", argTypes, term3191206, args);
    }

};


