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

public class ExternalUserData_getFirstDataVersion_194920143845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3182044;

    public ExternalUserData_getFirstDataVersion_194920143845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3182044 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3182044, term3182044.getClass(), "accessCode", "oDvtrjwfjV");
        setField(term3182044, term3182044.getClass(), "userName", "tlMXXVmuOq");
        setIntField(term3182044, term3182044.getClass(), "level", -269993248);
        setIntField(term3182044, term3182044.getClass(), "reincarnationNum", -1499799764);
        setLongField(term3182044, term3182044.getClass(), "exp", -7786757686523708302L);
        setLongField(term3182044, term3182044.getClass(), "point", 5499141843990097605L);
        setLongField(term3182044, term3182044.getClass(), "totalPoint", -3903055364941620394L);
        setIntField(term3182044, term3182044.getClass(), "playCount", 1551321527);
        setIntField(term3182044, term3182044.getClass(), "jewelCount", 1685259234);
        setIntField(term3182044, term3182044.getClass(), "totalJewelCount", -851082218);
        setIntField(term3182044, term3182044.getClass(), "medalCount", -1286144067);
        setIntField(term3182044, term3182044.getClass(), "playerRating", 1283784017);
        setIntField(term3182044, term3182044.getClass(), "highestRating", 882196808);
        setIntField(term3182044, term3182044.getClass(), "battlePoint", -1505280554);
        setIntField(term3182044, term3182044.getClass(), "bestBattlePoint", -2033696853);
        setIntField(term3182044, term3182044.getClass(), "overDamageBattlePoint", 919965508);
        setIntField(term3182044, term3182044.getClass(), "nameplateId", 1644134558);
        setIntField(term3182044, term3182044.getClass(), "trophyId", -841170777);
        setIntField(term3182044, term3182044.getClass(), "cardId", -618999481);
        setIntField(term3182044, term3182044.getClass(), "characterId", -446226224);
        setIntField(term3182044, term3182044.getClass(), "tabSetting", 664337843);
        setIntField(term3182044, term3182044.getClass(), "tabSortSetting", 602383088);
        setIntField(term3182044, term3182044.getClass(), "cardCategorySetting", 362277888);
        setIntField(term3182044, term3182044.getClass(), "cardSortSetting", -531242533);
        setIntField(term3182044, term3182044.getClass(), "rivalScoreCategorySetting", 1591434108);
        setIntField(term3182044, term3182044.getClass(), "playedTutorialBit", 2068320410);
        setIntField(term3182044, term3182044.getClass(), "firstTutorialCancelNum", -741051074);
        setLongField(term3182044, term3182044.getClass(), "sumTechHighScore", -279947906211022751L);
        setLongField(term3182044, term3182044.getClass(), "sumTechBasicHighScore", 5211557597690492706L);
        setLongField(term3182044, term3182044.getClass(), "sumTechAdvancedHighScore", 403770300059689073L);
        setLongField(term3182044, term3182044.getClass(), "sumTechExpertHighScore", -4813334451864951206L);
        setLongField(term3182044, term3182044.getClass(), "sumTechMasterHighScore", -4359520014360473483L);
        setLongField(term3182044, term3182044.getClass(), "sumTechLunaticHighScore", -2138398439364606777L);
        setLongField(term3182044, term3182044.getClass(), "sumBattleHighScore", -4542936274296814224L);
        setLongField(term3182044, term3182044.getClass(), "sumBattleBasicHighScore", 3590432614437165946L);
        setLongField(term3182044, term3182044.getClass(), "sumBattleAdvancedHighScore", -2098905645271162494L);
        setLongField(term3182044, term3182044.getClass(), "sumBattleExpertHighScore", 4728958145218184464L);
        setLongField(term3182044, term3182044.getClass(), "sumBattleMasterHighScore", 1715663017916117974L);
        setLongField(term3182044, term3182044.getClass(), "sumBattleLunaticHighScore", -3414128713842716106L);
        setField(term3182044, term3182044.getClass(), "eventWatchedDate", "jpxBGnyIJQ");
        setField(term3182044, term3182044.getClass(), "cmEventWatchedDate", "djVvGdzSRC");
        setField(term3182044, term3182044.getClass(), "firstGameId", "aHarWveQAL");
        setField(term3182044, term3182044.getClass(), "firstRomVersion", "OCouXxENmv");
        setField(term3182044, term3182044.getClass(), "firstDataVersion", "COojFBPuhO");
        setField(term3182044, term3182044.getClass(), "firstPlayDate", "tcZzeRLNGm");
        setField(term3182044, term3182044.getClass(), "lastGameId", "LSwGIWGZEc");
        setField(term3182044, term3182044.getClass(), "lastRomVersion", "KojVCEALIK");
        setField(term3182044, term3182044.getClass(), "lastDataVersion", "cTocEFIBdB");
        setField(term3182044, term3182044.getClass(), "compatibleCmVersion", "XDzgFGTqLG");
        setField(term3182044, term3182044.getClass(), "lastPlayDate", "DOqqEMLDGJ");
        setIntField(term3182044, term3182044.getClass(), "lastPlaceId", -237475015);
        setField(term3182044, term3182044.getClass(), "lastPlaceName", "nXhWYfnAwh");
        setIntField(term3182044, term3182044.getClass(), "lastRegionId", -1710347514);
        setField(term3182044, term3182044.getClass(), "lastRegionName", "HUgcgEmySY");
        setIntField(term3182044, term3182044.getClass(), "lastAllNetId", 1097103603);
        setField(term3182044, term3182044.getClass(), "lastClientId", "WoLgDIWrWk");
        setIntField(term3182044, term3182044.getClass(), "lastUsedDeckId", 752935534);
        setIntField(term3182044, term3182044.getClass(), "lastPlayMusicLevel", -1355744980);
        setIntField(term3182044, term3182044.getClass(), "lastEmoneyBrand", -1757450841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstDataVersion", argTypes, term3182044, args);
    }

};


