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

public class ExternalUserData_getSumBattleExpertHighScore_135211174636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110406;

    public ExternalUserData_getSumBattleExpertHighScore_135211174636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110406 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term110406, term110406.getClass(), "accessCode", "jlMONtFMdU");
        setField(term110406, term110406.getClass(), "userName", "yhqTsCzhGr");
        setIntField(term110406, term110406.getClass(), "level", 1789121784);
        setIntField(term110406, term110406.getClass(), "reincarnationNum", -1638118744);
        setLongField(term110406, term110406.getClass(), "exp", -5686652191625724579L);
        setLongField(term110406, term110406.getClass(), "point", 1340091358565624805L);
        setLongField(term110406, term110406.getClass(), "totalPoint", 6941396573792375146L);
        setIntField(term110406, term110406.getClass(), "playCount", -970261152);
        setIntField(term110406, term110406.getClass(), "jewelCount", -2117013988);
        setIntField(term110406, term110406.getClass(), "totalJewelCount", 768189581);
        setIntField(term110406, term110406.getClass(), "medalCount", -707778482);
        setIntField(term110406, term110406.getClass(), "playerRating", -212044505);
        setIntField(term110406, term110406.getClass(), "highestRating", -581312763);
        setIntField(term110406, term110406.getClass(), "battlePoint", 497282191);
        setIntField(term110406, term110406.getClass(), "bestBattlePoint", -1090894024);
        setIntField(term110406, term110406.getClass(), "overDamageBattlePoint", -293160959);
        setIntField(term110406, term110406.getClass(), "nameplateId", -1264749241);
        setIntField(term110406, term110406.getClass(), "trophyId", -1270275381);
        setIntField(term110406, term110406.getClass(), "cardId", -1004295468);
        setIntField(term110406, term110406.getClass(), "characterId", -380403261);
        setIntField(term110406, term110406.getClass(), "tabSetting", 944496462);
        setIntField(term110406, term110406.getClass(), "tabSortSetting", -823981966);
        setIntField(term110406, term110406.getClass(), "cardCategorySetting", 2562929);
        setIntField(term110406, term110406.getClass(), "cardSortSetting", 224431744);
        setIntField(term110406, term110406.getClass(), "rivalScoreCategorySetting", 1422388541);
        setIntField(term110406, term110406.getClass(), "playedTutorialBit", 864686180);
        setIntField(term110406, term110406.getClass(), "firstTutorialCancelNum", -1720923847);
        setLongField(term110406, term110406.getClass(), "sumTechHighScore", -4091679009787304302L);
        setLongField(term110406, term110406.getClass(), "sumTechBasicHighScore", -8945295960188420005L);
        setLongField(term110406, term110406.getClass(), "sumTechAdvancedHighScore", -5953362533731116176L);
        setLongField(term110406, term110406.getClass(), "sumTechExpertHighScore", -2714236923061647943L);
        setLongField(term110406, term110406.getClass(), "sumTechMasterHighScore", -7142980066972309692L);
        setLongField(term110406, term110406.getClass(), "sumTechLunaticHighScore", 252956363843220481L);
        setLongField(term110406, term110406.getClass(), "sumBattleHighScore", -4543821661885369887L);
        setLongField(term110406, term110406.getClass(), "sumBattleBasicHighScore", -6412638974259573918L);
        setLongField(term110406, term110406.getClass(), "sumBattleAdvancedHighScore", -1434316050735076219L);
        setLongField(term110406, term110406.getClass(), "sumBattleExpertHighScore", -5375722573779961660L);
        setLongField(term110406, term110406.getClass(), "sumBattleMasterHighScore", -6304168127691353469L);
        setLongField(term110406, term110406.getClass(), "sumBattleLunaticHighScore", -4319775030389096180L);
        setField(term110406, term110406.getClass(), "eventWatchedDate", "wfVccGKwtx");
        setField(term110406, term110406.getClass(), "cmEventWatchedDate", "vTzuskcrOw");
        setField(term110406, term110406.getClass(), "firstGameId", "kyzlJwMraL");
        setField(term110406, term110406.getClass(), "firstRomVersion", "rcGVvlcpyI");
        setField(term110406, term110406.getClass(), "firstDataVersion", "yNTpPLrRxy");
        setField(term110406, term110406.getClass(), "firstPlayDate", "uGPYzCYNcK");
        setField(term110406, term110406.getClass(), "lastGameId", "rfrQURPggv");
        setField(term110406, term110406.getClass(), "lastRomVersion", "LcEYyzFTnY");
        setField(term110406, term110406.getClass(), "lastDataVersion", "UwbEHLqxSO");
        setField(term110406, term110406.getClass(), "compatibleCmVersion", "DrVsMeJTCu");
        setField(term110406, term110406.getClass(), "lastPlayDate", "FLxDyBgVYy");
        setIntField(term110406, term110406.getClass(), "lastPlaceId", 515585139);
        setField(term110406, term110406.getClass(), "lastPlaceName", "VSpOFnXurK");
        setIntField(term110406, term110406.getClass(), "lastRegionId", -2093322497);
        setField(term110406, term110406.getClass(), "lastRegionName", "TJCTcbweDG");
        setIntField(term110406, term110406.getClass(), "lastAllNetId", 259679666);
        setField(term110406, term110406.getClass(), "lastClientId", "aINaTyGiau");
        setIntField(term110406, term110406.getClass(), "lastUsedDeckId", -1677153698);
        setIntField(term110406, term110406.getClass(), "lastPlayMusicLevel", -1822345183);
        setIntField(term110406, term110406.getClass(), "lastEmoneyBrand", 1395974044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleExpertHighScore", argTypes, term110406, args);
    }

};


