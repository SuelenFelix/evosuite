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

public class ExternalUserData_getCardCategorySetting_130674421324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3173728;

    public ExternalUserData_getCardCategorySetting_130674421324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3173728 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3173728, term3173728.getClass(), "accessCode", "XuUOXmtFBF");
        setField(term3173728, term3173728.getClass(), "userName", "tlfkhGnLgD");
        setIntField(term3173728, term3173728.getClass(), "level", -1203122810);
        setIntField(term3173728, term3173728.getClass(), "reincarnationNum", -865415454);
        setLongField(term3173728, term3173728.getClass(), "exp", -6825347894882405536L);
        setLongField(term3173728, term3173728.getClass(), "point", -6007161394239990404L);
        setLongField(term3173728, term3173728.getClass(), "totalPoint", -2120133232222239761L);
        setIntField(term3173728, term3173728.getClass(), "playCount", -85591664);
        setIntField(term3173728, term3173728.getClass(), "jewelCount", 680526782);
        setIntField(term3173728, term3173728.getClass(), "totalJewelCount", -671972940);
        setIntField(term3173728, term3173728.getClass(), "medalCount", -1713471501);
        setIntField(term3173728, term3173728.getClass(), "playerRating", 432123835);
        setIntField(term3173728, term3173728.getClass(), "highestRating", 1006742936);
        setIntField(term3173728, term3173728.getClass(), "battlePoint", -1442372134);
        setIntField(term3173728, term3173728.getClass(), "bestBattlePoint", -143026933);
        setIntField(term3173728, term3173728.getClass(), "overDamageBattlePoint", 743267580);
        setIntField(term3173728, term3173728.getClass(), "nameplateId", 1378981132);
        setIntField(term3173728, term3173728.getClass(), "trophyId", -36595175);
        setIntField(term3173728, term3173728.getClass(), "cardId", 244231225);
        setIntField(term3173728, term3173728.getClass(), "characterId", 560774382);
        setIntField(term3173728, term3173728.getClass(), "tabSetting", 1377217095);
        setIntField(term3173728, term3173728.getClass(), "tabSortSetting", -660646714);
        setIntField(term3173728, term3173728.getClass(), "cardCategorySetting", -1967424398);
        setIntField(term3173728, term3173728.getClass(), "cardSortSetting", -617472954);
        setIntField(term3173728, term3173728.getClass(), "rivalScoreCategorySetting", 157681658);
        setIntField(term3173728, term3173728.getClass(), "playedTutorialBit", 387607370);
        setIntField(term3173728, term3173728.getClass(), "firstTutorialCancelNum", 889091748);
        setLongField(term3173728, term3173728.getClass(), "sumTechHighScore", 1727364256098546711L);
        setLongField(term3173728, term3173728.getClass(), "sumTechBasicHighScore", 1341090965519325377L);
        setLongField(term3173728, term3173728.getClass(), "sumTechAdvancedHighScore", -3788418882939402047L);
        setLongField(term3173728, term3173728.getClass(), "sumTechExpertHighScore", 8451049804775574353L);
        setLongField(term3173728, term3173728.getClass(), "sumTechMasterHighScore", -3667407326263111376L);
        setLongField(term3173728, term3173728.getClass(), "sumTechLunaticHighScore", 9221481987053944735L);
        setLongField(term3173728, term3173728.getClass(), "sumBattleHighScore", 5037390507164605097L);
        setLongField(term3173728, term3173728.getClass(), "sumBattleBasicHighScore", 762918444258614872L);
        setLongField(term3173728, term3173728.getClass(), "sumBattleAdvancedHighScore", 1141749191518421702L);
        setLongField(term3173728, term3173728.getClass(), "sumBattleExpertHighScore", -9171851775546749645L);
        setLongField(term3173728, term3173728.getClass(), "sumBattleMasterHighScore", 9090732261462933625L);
        setLongField(term3173728, term3173728.getClass(), "sumBattleLunaticHighScore", 3814301510998952349L);
        setField(term3173728, term3173728.getClass(), "eventWatchedDate", "RWcErwtkCG");
        setField(term3173728, term3173728.getClass(), "cmEventWatchedDate", "PtTgpIIDBu");
        setField(term3173728, term3173728.getClass(), "firstGameId", "WJsuUpDOWj");
        setField(term3173728, term3173728.getClass(), "firstRomVersion", "IbTenEFWor");
        setField(term3173728, term3173728.getClass(), "firstDataVersion", "IWYsKvkRmc");
        setField(term3173728, term3173728.getClass(), "firstPlayDate", "JWzGFdMPvl");
        setField(term3173728, term3173728.getClass(), "lastGameId", "OqvkOixpdY");
        setField(term3173728, term3173728.getClass(), "lastRomVersion", "wIOYTRwPAr");
        setField(term3173728, term3173728.getClass(), "lastDataVersion", "OXFVzEMPiI");
        setField(term3173728, term3173728.getClass(), "compatibleCmVersion", "SAPspxshES");
        setField(term3173728, term3173728.getClass(), "lastPlayDate", "otYpdxYnxs");
        setIntField(term3173728, term3173728.getClass(), "lastPlaceId", 2084300379);
        setField(term3173728, term3173728.getClass(), "lastPlaceName", "dHrrYWUdmR");
        setIntField(term3173728, term3173728.getClass(), "lastRegionId", 406637716);
        setField(term3173728, term3173728.getClass(), "lastRegionName", "WTPOxlSWxX");
        setIntField(term3173728, term3173728.getClass(), "lastAllNetId", -1313880758);
        setField(term3173728, term3173728.getClass(), "lastClientId", "RwcOQPcPta");
        setIntField(term3173728, term3173728.getClass(), "lastUsedDeckId", 1113383945);
        setIntField(term3173728, term3173728.getClass(), "lastPlayMusicLevel", -249624855);
        setIntField(term3173728, term3173728.getClass(), "lastEmoneyBrand", 535941811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardCategorySetting", argTypes, term3173728, args);
    }

};


