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

public class ExternalUserData_getLastPlaceName_72530804451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116346;

    public ExternalUserData_getLastPlaceName_72530804451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116346 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term116346, term116346.getClass(), "accessCode", "eHvxXssaKr");
        setField(term116346, term116346.getClass(), "userName", "RhIMXJgnoS");
        setIntField(term116346, term116346.getClass(), "level", -2080453015);
        setIntField(term116346, term116346.getClass(), "reincarnationNum", -1255446977);
        setLongField(term116346, term116346.getClass(), "exp", 5243522213632600334L);
        setLongField(term116346, term116346.getClass(), "point", -7136107935516349839L);
        setLongField(term116346, term116346.getClass(), "totalPoint", -207216193437887145L);
        setIntField(term116346, term116346.getClass(), "playCount", -138479619);
        setIntField(term116346, term116346.getClass(), "jewelCount", -200883734);
        setIntField(term116346, term116346.getClass(), "totalJewelCount", -878308204);
        setIntField(term116346, term116346.getClass(), "medalCount", -2019936559);
        setIntField(term116346, term116346.getClass(), "playerRating", 1271583428);
        setIntField(term116346, term116346.getClass(), "highestRating", -466845119);
        setIntField(term116346, term116346.getClass(), "battlePoint", -888696227);
        setIntField(term116346, term116346.getClass(), "bestBattlePoint", -1285655636);
        setIntField(term116346, term116346.getClass(), "overDamageBattlePoint", 817380599);
        setIntField(term116346, term116346.getClass(), "nameplateId", -701807357);
        setIntField(term116346, term116346.getClass(), "trophyId", 2116646561);
        setIntField(term116346, term116346.getClass(), "cardId", 107762308);
        setIntField(term116346, term116346.getClass(), "characterId", -1130983067);
        setIntField(term116346, term116346.getClass(), "tabSetting", 383355780);
        setIntField(term116346, term116346.getClass(), "tabSortSetting", 1672581768);
        setIntField(term116346, term116346.getClass(), "cardCategorySetting", 1447798018);
        setIntField(term116346, term116346.getClass(), "cardSortSetting", 1323153059);
        setIntField(term116346, term116346.getClass(), "rivalScoreCategorySetting", 677935105);
        setIntField(term116346, term116346.getClass(), "playedTutorialBit", -84620787);
        setIntField(term116346, term116346.getClass(), "firstTutorialCancelNum", 1030838523);
        setLongField(term116346, term116346.getClass(), "sumTechHighScore", -8678993299894875263L);
        setLongField(term116346, term116346.getClass(), "sumTechBasicHighScore", 5831523226469995511L);
        setLongField(term116346, term116346.getClass(), "sumTechAdvancedHighScore", 2812942122564805626L);
        setLongField(term116346, term116346.getClass(), "sumTechExpertHighScore", -7046295986047695281L);
        setLongField(term116346, term116346.getClass(), "sumTechMasterHighScore", -8441682245123980715L);
        setLongField(term116346, term116346.getClass(), "sumTechLunaticHighScore", -812848686153529715L);
        setLongField(term116346, term116346.getClass(), "sumBattleHighScore", 4785718299598661245L);
        setLongField(term116346, term116346.getClass(), "sumBattleBasicHighScore", -4468157061082693107L);
        setLongField(term116346, term116346.getClass(), "sumBattleAdvancedHighScore", -3201514133571470122L);
        setLongField(term116346, term116346.getClass(), "sumBattleExpertHighScore", 4580986026397521403L);
        setLongField(term116346, term116346.getClass(), "sumBattleMasterHighScore", -4895149170305055360L);
        setLongField(term116346, term116346.getClass(), "sumBattleLunaticHighScore", 133828517357949500L);
        setField(term116346, term116346.getClass(), "eventWatchedDate", "tvMiyiLSlL");
        setField(term116346, term116346.getClass(), "cmEventWatchedDate", "eDBXIeleUw");
        setField(term116346, term116346.getClass(), "firstGameId", "fypoGGlvtB");
        setField(term116346, term116346.getClass(), "firstRomVersion", "zNTuElUkJH");
        setField(term116346, term116346.getClass(), "firstDataVersion", "JDrXIGnDFI");
        setField(term116346, term116346.getClass(), "firstPlayDate", "xTdlEQSuBq");
        setField(term116346, term116346.getClass(), "lastGameId", "PFGSSQCYPp");
        setField(term116346, term116346.getClass(), "lastRomVersion", "DcPLzEXYrK");
        setField(term116346, term116346.getClass(), "lastDataVersion", "PqFWgRqqGK");
        setField(term116346, term116346.getClass(), "compatibleCmVersion", "iUiqROQvua");
        setField(term116346, term116346.getClass(), "lastPlayDate", "tNxgmRhIcN");
        setIntField(term116346, term116346.getClass(), "lastPlaceId", -525832912);
        setField(term116346, term116346.getClass(), "lastPlaceName", "BovbePKRjG");
        setIntField(term116346, term116346.getClass(), "lastRegionId", -1902417165);
        setField(term116346, term116346.getClass(), "lastRegionName", "tzYzntrZvY");
        setIntField(term116346, term116346.getClass(), "lastAllNetId", -1871804227);
        setField(term116346, term116346.getClass(), "lastClientId", "ALpGpsJyIc");
        setIntField(term116346, term116346.getClass(), "lastUsedDeckId", 431245285);
        setIntField(term116346, term116346.getClass(), "lastPlayMusicLevel", 633527258);
        setIntField(term116346, term116346.getClass(), "lastEmoneyBrand", 407609768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceName", argTypes, term116346, args);
    }

};


