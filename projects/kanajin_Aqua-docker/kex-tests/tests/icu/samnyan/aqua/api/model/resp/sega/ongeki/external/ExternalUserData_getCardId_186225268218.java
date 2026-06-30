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

public class ExternalUserData_getCardId_186225268218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103278;

    public ExternalUserData_getCardId_186225268218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103278 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term103278, term103278.getClass(), "accessCode", "CDjnJTCyDp");
        setField(term103278, term103278.getClass(), "userName", "rNzHrfrGVL");
        setIntField(term103278, term103278.getClass(), "level", -2011363019);
        setIntField(term103278, term103278.getClass(), "reincarnationNum", 1331638094);
        setLongField(term103278, term103278.getClass(), "exp", -115390034484396886L);
        setLongField(term103278, term103278.getClass(), "point", -3287880884177946931L);
        setLongField(term103278, term103278.getClass(), "totalPoint", -8637180152381266746L);
        setIntField(term103278, term103278.getClass(), "playCount", -1409600010);
        setIntField(term103278, term103278.getClass(), "jewelCount", -727597571);
        setIntField(term103278, term103278.getClass(), "totalJewelCount", 501718246);
        setIntField(term103278, term103278.getClass(), "medalCount", 1801903852);
        setIntField(term103278, term103278.getClass(), "playerRating", -65673880);
        setIntField(term103278, term103278.getClass(), "highestRating", 1228502823);
        setIntField(term103278, term103278.getClass(), "battlePoint", 199333488);
        setIntField(term103278, term103278.getClass(), "bestBattlePoint", 1821842532);
        setIntField(term103278, term103278.getClass(), "overDamageBattlePoint", -1914308877);
        setIntField(term103278, term103278.getClass(), "nameplateId", -1374025729);
        setIntField(term103278, term103278.getClass(), "trophyId", -1570135661);
        setIntField(term103278, term103278.getClass(), "cardId", 517443387);
        setIntField(term103278, term103278.getClass(), "characterId", 1853805746);
        setIntField(term103278, term103278.getClass(), "tabSetting", -1671563569);
        setIntField(term103278, term103278.getClass(), "tabSortSetting", 855691328);
        setIntField(term103278, term103278.getClass(), "cardCategorySetting", -41960698);
        setIntField(term103278, term103278.getClass(), "cardSortSetting", -1188711158);
        setIntField(term103278, term103278.getClass(), "rivalScoreCategorySetting", 1842445056);
        setIntField(term103278, term103278.getClass(), "playedTutorialBit", -1536694952);
        setIntField(term103278, term103278.getClass(), "firstTutorialCancelNum", 2041310422);
        setLongField(term103278, term103278.getClass(), "sumTechHighScore", -581400228756073964L);
        setLongField(term103278, term103278.getClass(), "sumTechBasicHighScore", 2287844117902968763L);
        setLongField(term103278, term103278.getClass(), "sumTechAdvancedHighScore", 6878259540912005351L);
        setLongField(term103278, term103278.getClass(), "sumTechExpertHighScore", -6685795678650226734L);
        setLongField(term103278, term103278.getClass(), "sumTechMasterHighScore", 7692335908639437463L);
        setLongField(term103278, term103278.getClass(), "sumTechLunaticHighScore", 3007859086830511081L);
        setLongField(term103278, term103278.getClass(), "sumBattleHighScore", 2299879841219058112L);
        setLongField(term103278, term103278.getClass(), "sumBattleBasicHighScore", -5436291262767823754L);
        setLongField(term103278, term103278.getClass(), "sumBattleAdvancedHighScore", -407857484202759438L);
        setLongField(term103278, term103278.getClass(), "sumBattleExpertHighScore", -6640112612664470324L);
        setLongField(term103278, term103278.getClass(), "sumBattleMasterHighScore", -2303481683520306797L);
        setLongField(term103278, term103278.getClass(), "sumBattleLunaticHighScore", -2466013599161348963L);
        setField(term103278, term103278.getClass(), "eventWatchedDate", "ymxSWBzOig");
        setField(term103278, term103278.getClass(), "cmEventWatchedDate", "hIPtmFFVkJ");
        setField(term103278, term103278.getClass(), "firstGameId", "pmtrddnNIl");
        setField(term103278, term103278.getClass(), "firstRomVersion", "hMcQqqWrkI");
        setField(term103278, term103278.getClass(), "firstDataVersion", "VqproKMPaT");
        setField(term103278, term103278.getClass(), "firstPlayDate", "rCMXmSGkfG");
        setField(term103278, term103278.getClass(), "lastGameId", "OSBwmfgFVY");
        setField(term103278, term103278.getClass(), "lastRomVersion", "WaKfMegDHZ");
        setField(term103278, term103278.getClass(), "lastDataVersion", "WRabHwyEOz");
        setField(term103278, term103278.getClass(), "compatibleCmVersion", "KQKXgucNwu");
        setField(term103278, term103278.getClass(), "lastPlayDate", "WXVAvampgb");
        setIntField(term103278, term103278.getClass(), "lastPlaceId", 1438706959);
        setField(term103278, term103278.getClass(), "lastPlaceName", "oYTnZefdoa");
        setIntField(term103278, term103278.getClass(), "lastRegionId", 42887595);
        setField(term103278, term103278.getClass(), "lastRegionName", "NURhqfzHKI");
        setIntField(term103278, term103278.getClass(), "lastAllNetId", 486541242);
        setField(term103278, term103278.getClass(), "lastClientId", "LnZYsJlUsQ");
        setIntField(term103278, term103278.getClass(), "lastUsedDeckId", -437318670);
        setIntField(term103278, term103278.getClass(), "lastPlayMusicLevel", -1828747994);
        setIntField(term103278, term103278.getClass(), "lastEmoneyBrand", 848418672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId", argTypes, term103278, args);
    }

};


