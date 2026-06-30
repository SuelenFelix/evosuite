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

public class ExternalUserData_getSumBattleHighScore_53419758035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3178084;

    public ExternalUserData_getSumBattleHighScore_53419758035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3178084 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3178084, term3178084.getClass(), "accessCode", "DkMeCacotp");
        setField(term3178084, term3178084.getClass(), "userName", "YkRuBDQTZL");
        setIntField(term3178084, term3178084.getClass(), "level", -568690782);
        setIntField(term3178084, term3178084.getClass(), "reincarnationNum", 1069271097);
        setLongField(term3178084, term3178084.getClass(), "exp", 6764971975782532468L);
        setLongField(term3178084, term3178084.getClass(), "point", -4543720841535624757L);
        setLongField(term3178084, term3178084.getClass(), "totalPoint", -2398833823072399099L);
        setIntField(term3178084, term3178084.getClass(), "playCount", 846222201);
        setIntField(term3178084, term3178084.getClass(), "jewelCount", -977889957);
        setIntField(term3178084, term3178084.getClass(), "totalJewelCount", 1350007286);
        setIntField(term3178084, term3178084.getClass(), "medalCount", 822990847);
        setIntField(term3178084, term3178084.getClass(), "playerRating", -1264743651);
        setIntField(term3178084, term3178084.getClass(), "highestRating", -705906058);
        setIntField(term3178084, term3178084.getClass(), "battlePoint", -1702515043);
        setIntField(term3178084, term3178084.getClass(), "bestBattlePoint", 1719295317);
        setIntField(term3178084, term3178084.getClass(), "overDamageBattlePoint", 981596870);
        setIntField(term3178084, term3178084.getClass(), "nameplateId", -1603000186);
        setIntField(term3178084, term3178084.getClass(), "trophyId", -236967859);
        setIntField(term3178084, term3178084.getClass(), "cardId", -596666539);
        setIntField(term3178084, term3178084.getClass(), "characterId", -1086262842);
        setIntField(term3178084, term3178084.getClass(), "tabSetting", -1199876035);
        setIntField(term3178084, term3178084.getClass(), "tabSortSetting", 459611139);
        setIntField(term3178084, term3178084.getClass(), "cardCategorySetting", -1543538042);
        setIntField(term3178084, term3178084.getClass(), "cardSortSetting", -550138691);
        setIntField(term3178084, term3178084.getClass(), "rivalScoreCategorySetting", -1780201736);
        setIntField(term3178084, term3178084.getClass(), "playedTutorialBit", -1796008153);
        setIntField(term3178084, term3178084.getClass(), "firstTutorialCancelNum", -935061975);
        setLongField(term3178084, term3178084.getClass(), "sumTechHighScore", -5009997941456226982L);
        setLongField(term3178084, term3178084.getClass(), "sumTechBasicHighScore", -5232157664015554109L);
        setLongField(term3178084, term3178084.getClass(), "sumTechAdvancedHighScore", -2945432591396796856L);
        setLongField(term3178084, term3178084.getClass(), "sumTechExpertHighScore", -2847549772400114629L);
        setLongField(term3178084, term3178084.getClass(), "sumTechMasterHighScore", -1373577922478197661L);
        setLongField(term3178084, term3178084.getClass(), "sumTechLunaticHighScore", 4554890069047437718L);
        setLongField(term3178084, term3178084.getClass(), "sumBattleHighScore", -7799052932110517143L);
        setLongField(term3178084, term3178084.getClass(), "sumBattleBasicHighScore", 8064291854978728147L);
        setLongField(term3178084, term3178084.getClass(), "sumBattleAdvancedHighScore", 6964587346395772145L);
        setLongField(term3178084, term3178084.getClass(), "sumBattleExpertHighScore", -2008354507939731370L);
        setLongField(term3178084, term3178084.getClass(), "sumBattleMasterHighScore", -2007503137386697333L);
        setLongField(term3178084, term3178084.getClass(), "sumBattleLunaticHighScore", -1004767144999836761L);
        setField(term3178084, term3178084.getClass(), "eventWatchedDate", "LnUlZKamFZ");
        setField(term3178084, term3178084.getClass(), "cmEventWatchedDate", "mfrNBgIlRN");
        setField(term3178084, term3178084.getClass(), "firstGameId", "JDGbXgMsRU");
        setField(term3178084, term3178084.getClass(), "firstRomVersion", "vSRcbrkcqe");
        setField(term3178084, term3178084.getClass(), "firstDataVersion", "ZpATevQYAp");
        setField(term3178084, term3178084.getClass(), "firstPlayDate", "yQsildPMTq");
        setField(term3178084, term3178084.getClass(), "lastGameId", "yknIfkjFhB");
        setField(term3178084, term3178084.getClass(), "lastRomVersion", "aDKeuboKfe");
        setField(term3178084, term3178084.getClass(), "lastDataVersion", "JWXakWHixa");
        setField(term3178084, term3178084.getClass(), "compatibleCmVersion", "jfRzbLAgNX");
        setField(term3178084, term3178084.getClass(), "lastPlayDate", "IqTNPTlOsG");
        setIntField(term3178084, term3178084.getClass(), "lastPlaceId", -131378590);
        setField(term3178084, term3178084.getClass(), "lastPlaceName", "wqPpsCbZgC");
        setIntField(term3178084, term3178084.getClass(), "lastRegionId", -1494790605);
        setField(term3178084, term3178084.getClass(), "lastRegionName", "SjTLIoiNYP");
        setIntField(term3178084, term3178084.getClass(), "lastAllNetId", -1673464850);
        setField(term3178084, term3178084.getClass(), "lastClientId", "ZKdHEZMsAZ");
        setIntField(term3178084, term3178084.getClass(), "lastUsedDeckId", 1108638419);
        setIntField(term3178084, term3178084.getClass(), "lastPlayMusicLevel", 1560107139);
        setIntField(term3178084, term3178084.getClass(), "lastEmoneyBrand", -574128577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleHighScore", argTypes, term3178084, args);
    }

};


