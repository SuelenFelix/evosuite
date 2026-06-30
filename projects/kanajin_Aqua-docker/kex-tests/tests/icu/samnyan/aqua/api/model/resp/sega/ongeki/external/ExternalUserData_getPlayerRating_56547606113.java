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

public class ExternalUserData_getPlayerRating_56547606113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3169372;

    public ExternalUserData_getPlayerRating_56547606113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3169372 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3169372, term3169372.getClass(), "accessCode", "nrBGmKGmiB");
        setField(term3169372, term3169372.getClass(), "userName", "EIorWvQIzp");
        setIntField(term3169372, term3169372.getClass(), "level", -1643186163);
        setIntField(term3169372, term3169372.getClass(), "reincarnationNum", 197920611);
        setLongField(term3169372, term3169372.getClass(), "exp", 3431124557268328816L);
        setLongField(term3169372, term3169372.getClass(), "point", 7198082983073078134L);
        setLongField(term3169372, term3169372.getClass(), "totalPoint", 769433865965090140L);
        setIntField(term3169372, term3169372.getClass(), "playCount", 301552891);
        setIntField(term3169372, term3169372.getClass(), "jewelCount", 1481349092);
        setIntField(term3169372, term3169372.getClass(), "totalJewelCount", 452918682);
        setIntField(term3169372, term3169372.getClass(), "medalCount", -1187889824);
        setIntField(term3169372, term3169372.getClass(), "playerRating", 2072815305);
        setIntField(term3169372, term3169372.getClass(), "highestRating", 568712556);
        setIntField(term3169372, term3169372.getClass(), "battlePoint", -1829790260);
        setIntField(term3169372, term3169372.getClass(), "bestBattlePoint", -1096344610);
        setIntField(term3169372, term3169372.getClass(), "overDamageBattlePoint", 176503200);
        setIntField(term3169372, term3169372.getClass(), "nameplateId", 348962056);
        setIntField(term3169372, term3169372.getClass(), "trophyId", 2123982453);
        setIntField(term3169372, term3169372.getClass(), "cardId", 1094792403);
        setIntField(term3169372, term3169372.getClass(), "characterId", 2138888521);
        setIntField(term3169372, term3169372.getClass(), "tabSetting", 1824865907);
        setIntField(term3169372, term3169372.getClass(), "tabSortSetting", -1956630590);
        setIntField(term3169372, term3169372.getClass(), "cardCategorySetting", 1111060953);
        setIntField(term3169372, term3169372.getClass(), "cardSortSetting", 244220081);
        setIntField(term3169372, term3169372.getClass(), "rivalScoreCategorySetting", 1150199561);
        setIntField(term3169372, term3169372.getClass(), "playedTutorialBit", -829178908);
        setIntField(term3169372, term3169372.getClass(), "firstTutorialCancelNum", -468949763);
        setLongField(term3169372, term3169372.getClass(), "sumTechHighScore", -6143519854618412693L);
        setLongField(term3169372, term3169372.getClass(), "sumTechBasicHighScore", -3248991200594304045L);
        setLongField(term3169372, term3169372.getClass(), "sumTechAdvancedHighScore", 5046095726057911264L);
        setLongField(term3169372, term3169372.getClass(), "sumTechExpertHighScore", 3609619398486643516L);
        setLongField(term3169372, term3169372.getClass(), "sumTechMasterHighScore", -5741337803364097830L);
        setLongField(term3169372, term3169372.getClass(), "sumTechLunaticHighScore", 715917286000265604L);
        setLongField(term3169372, term3169372.getClass(), "sumBattleHighScore", 8256582698086870558L);
        setLongField(term3169372, term3169372.getClass(), "sumBattleBasicHighScore", -7944237617629202400L);
        setLongField(term3169372, term3169372.getClass(), "sumBattleAdvancedHighScore", -5793804672981354797L);
        setLongField(term3169372, term3169372.getClass(), "sumBattleExpertHighScore", -7502784230860438446L);
        setLongField(term3169372, term3169372.getClass(), "sumBattleMasterHighScore", -4485205953474195611L);
        setLongField(term3169372, term3169372.getClass(), "sumBattleLunaticHighScore", 9020706468984115114L);
        setField(term3169372, term3169372.getClass(), "eventWatchedDate", "OuiFDFExAp");
        setField(term3169372, term3169372.getClass(), "cmEventWatchedDate", "ILbuXtSQxN");
        setField(term3169372, term3169372.getClass(), "firstGameId", "kLteNCENlT");
        setField(term3169372, term3169372.getClass(), "firstRomVersion", "poqmiYFTrk");
        setField(term3169372, term3169372.getClass(), "firstDataVersion", "sHamqvqxmH");
        setField(term3169372, term3169372.getClass(), "firstPlayDate", "kJSqTDULja");
        setField(term3169372, term3169372.getClass(), "lastGameId", "rtnLtVpIEg");
        setField(term3169372, term3169372.getClass(), "lastRomVersion", "frQUbCgsiE");
        setField(term3169372, term3169372.getClass(), "lastDataVersion", "FkflrTkCWn");
        setField(term3169372, term3169372.getClass(), "compatibleCmVersion", "jDeeruHohY");
        setField(term3169372, term3169372.getClass(), "lastPlayDate", "uaWAAqCkxq");
        setIntField(term3169372, term3169372.getClass(), "lastPlaceId", 412367924);
        setField(term3169372, term3169372.getClass(), "lastPlaceName", "otEJZjVFDB");
        setIntField(term3169372, term3169372.getClass(), "lastRegionId", -1657476930);
        setField(term3169372, term3169372.getClass(), "lastRegionName", "qUnHyOXBNN");
        setIntField(term3169372, term3169372.getClass(), "lastAllNetId", -735564558);
        setField(term3169372, term3169372.getClass(), "lastClientId", "WldLJaxtBL");
        setIntField(term3169372, term3169372.getClass(), "lastUsedDeckId", -820030762);
        setIntField(term3169372, term3169372.getClass(), "lastPlayMusicLevel", -286626787);
        setIntField(term3169372, term3169372.getClass(), "lastEmoneyBrand", -274297775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term3169372, args);
    }

};


