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

public class ExternalUserData_getSumTechAdvancedHighScore_111666050031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3176500;

    public ExternalUserData_getSumTechAdvancedHighScore_111666050031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3176500 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3176500, term3176500.getClass(), "accessCode", "hUajHocCLH");
        setField(term3176500, term3176500.getClass(), "userName", "fUuzLdmdtO");
        setIntField(term3176500, term3176500.getClass(), "level", -203831509);
        setIntField(term3176500, term3176500.getClass(), "reincarnationNum", 1501902669);
        setLongField(term3176500, term3176500.getClass(), "exp", 2729793026817787317L);
        setLongField(term3176500, term3176500.getClass(), "point", 4941221825508329348L);
        setLongField(term3176500, term3176500.getClass(), "totalPoint", -735993896215795971L);
        setIntField(term3176500, term3176500.getClass(), "playCount", -572973357);
        setIntField(term3176500, term3176500.getClass(), "jewelCount", -956560313);
        setIntField(term3176500, term3176500.getClass(), "totalJewelCount", 1584736957);
        setIntField(term3176500, term3176500.getClass(), "medalCount", -1774638646);
        setIntField(term3176500, term3176500.getClass(), "playerRating", 825231991);
        setIntField(term3176500, term3176500.getClass(), "highestRating", 1834429821);
        setIntField(term3176500, term3176500.getClass(), "battlePoint", -701721246);
        setIntField(term3176500, term3176500.getClass(), "bestBattlePoint", -534707514);
        setIntField(term3176500, term3176500.getClass(), "overDamageBattlePoint", 376761426);
        setIntField(term3176500, term3176500.getClass(), "nameplateId", -1707455143);
        setIntField(term3176500, term3176500.getClass(), "trophyId", 1494760505);
        setIntField(term3176500, term3176500.getClass(), "cardId", -995557870);
        setIntField(term3176500, term3176500.getClass(), "characterId", 1658211015);
        setIntField(term3176500, term3176500.getClass(), "tabSetting", 1287625930);
        setIntField(term3176500, term3176500.getClass(), "tabSortSetting", 624333879);
        setIntField(term3176500, term3176500.getClass(), "cardCategorySetting", -928775367);
        setIntField(term3176500, term3176500.getClass(), "cardSortSetting", -1261880936);
        setIntField(term3176500, term3176500.getClass(), "rivalScoreCategorySetting", -1505036231);
        setIntField(term3176500, term3176500.getClass(), "playedTutorialBit", 2031341902);
        setIntField(term3176500, term3176500.getClass(), "firstTutorialCancelNum", 1493639122);
        setLongField(term3176500, term3176500.getClass(), "sumTechHighScore", 7053634390230571212L);
        setLongField(term3176500, term3176500.getClass(), "sumTechBasicHighScore", 620758594832926178L);
        setLongField(term3176500, term3176500.getClass(), "sumTechAdvancedHighScore", -5402651588939291160L);
        setLongField(term3176500, term3176500.getClass(), "sumTechExpertHighScore", 3889098996202162590L);
        setLongField(term3176500, term3176500.getClass(), "sumTechMasterHighScore", -3831118885372130203L);
        setLongField(term3176500, term3176500.getClass(), "sumTechLunaticHighScore", -8190877237868536757L);
        setLongField(term3176500, term3176500.getClass(), "sumBattleHighScore", 2925045061706127948L);
        setLongField(term3176500, term3176500.getClass(), "sumBattleBasicHighScore", -4570328045891416L);
        setLongField(term3176500, term3176500.getClass(), "sumBattleAdvancedHighScore", 22977889976497026L);
        setLongField(term3176500, term3176500.getClass(), "sumBattleExpertHighScore", -5335039148649586659L);
        setLongField(term3176500, term3176500.getClass(), "sumBattleMasterHighScore", -1055482811599984271L);
        setLongField(term3176500, term3176500.getClass(), "sumBattleLunaticHighScore", 8251124472600544508L);
        setField(term3176500, term3176500.getClass(), "eventWatchedDate", "rSaICMCKEQ");
        setField(term3176500, term3176500.getClass(), "cmEventWatchedDate", "HRaWUsZhNg");
        setField(term3176500, term3176500.getClass(), "firstGameId", "dNiygbMdVW");
        setField(term3176500, term3176500.getClass(), "firstRomVersion", "wLWtTHPWfJ");
        setField(term3176500, term3176500.getClass(), "firstDataVersion", "ULVRHUzswP");
        setField(term3176500, term3176500.getClass(), "firstPlayDate", "ZlaYHEMBPb");
        setField(term3176500, term3176500.getClass(), "lastGameId", "ELBxrwfSuw");
        setField(term3176500, term3176500.getClass(), "lastRomVersion", "ACNKtbvngp");
        setField(term3176500, term3176500.getClass(), "lastDataVersion", "ZnoscdFMqm");
        setField(term3176500, term3176500.getClass(), "compatibleCmVersion", "hidaJPsNYW");
        setField(term3176500, term3176500.getClass(), "lastPlayDate", "ndZPOlfzdc");
        setIntField(term3176500, term3176500.getClass(), "lastPlaceId", 20178860);
        setField(term3176500, term3176500.getClass(), "lastPlaceName", "FIPsstRAiU");
        setIntField(term3176500, term3176500.getClass(), "lastRegionId", -373924864);
        setField(term3176500, term3176500.getClass(), "lastRegionName", "vdVAOMdBVz");
        setIntField(term3176500, term3176500.getClass(), "lastAllNetId", 491238347);
        setField(term3176500, term3176500.getClass(), "lastClientId", "zGNrXifNQM");
        setIntField(term3176500, term3176500.getClass(), "lastUsedDeckId", 1815204630);
        setIntField(term3176500, term3176500.getClass(), "lastPlayMusicLevel", 931972369);
        setIntField(term3176500, term3176500.getClass(), "lastEmoneyBrand", -596857827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechAdvancedHighScore", argTypes, term3176500, args);
    }

};


