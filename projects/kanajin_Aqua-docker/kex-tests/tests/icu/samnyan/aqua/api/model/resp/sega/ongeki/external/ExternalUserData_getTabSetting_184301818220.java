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

public class ExternalUserData_getTabSetting_184301818220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104070;

    public ExternalUserData_getTabSetting_184301818220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104070 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term104070, term104070.getClass(), "accessCode", "JEHJUYLfVk");
        setField(term104070, term104070.getClass(), "userName", "NfZZIqZUGJ");
        setIntField(term104070, term104070.getClass(), "level", 281612155);
        setIntField(term104070, term104070.getClass(), "reincarnationNum", -481794035);
        setLongField(term104070, term104070.getClass(), "exp", -3761687501434493555L);
        setLongField(term104070, term104070.getClass(), "point", 6923371778481878441L);
        setLongField(term104070, term104070.getClass(), "totalPoint", -2664657769396188905L);
        setIntField(term104070, term104070.getClass(), "playCount", 133050499);
        setIntField(term104070, term104070.getClass(), "jewelCount", 1912220223);
        setIntField(term104070, term104070.getClass(), "totalJewelCount", -678439021);
        setIntField(term104070, term104070.getClass(), "medalCount", 1996302310);
        setIntField(term104070, term104070.getClass(), "playerRating", 1393835005);
        setIntField(term104070, term104070.getClass(), "highestRating", -110011807);
        setIntField(term104070, term104070.getClass(), "battlePoint", -1542113774);
        setIntField(term104070, term104070.getClass(), "bestBattlePoint", 1694430517);
        setIntField(term104070, term104070.getClass(), "overDamageBattlePoint", -1600319522);
        setIntField(term104070, term104070.getClass(), "nameplateId", -1565593246);
        setIntField(term104070, term104070.getClass(), "trophyId", -1902403579);
        setIntField(term104070, term104070.getClass(), "cardId", 1113168734);
        setIntField(term104070, term104070.getClass(), "characterId", 1136050907);
        setIntField(term104070, term104070.getClass(), "tabSetting", 1335273666);
        setIntField(term104070, term104070.getClass(), "tabSortSetting", -995949019);
        setIntField(term104070, term104070.getClass(), "cardCategorySetting", 318420452);
        setIntField(term104070, term104070.getClass(), "cardSortSetting", 1488172590);
        setIntField(term104070, term104070.getClass(), "rivalScoreCategorySetting", 84146422);
        setIntField(term104070, term104070.getClass(), "playedTutorialBit", -464584939);
        setIntField(term104070, term104070.getClass(), "firstTutorialCancelNum", -321206429);
        setLongField(term104070, term104070.getClass(), "sumTechHighScore", -7805613835090517266L);
        setLongField(term104070, term104070.getClass(), "sumTechBasicHighScore", -2960551939365707278L);
        setLongField(term104070, term104070.getClass(), "sumTechAdvancedHighScore", 6033165802535975223L);
        setLongField(term104070, term104070.getClass(), "sumTechExpertHighScore", 2755312857820090237L);
        setLongField(term104070, term104070.getClass(), "sumTechMasterHighScore", -7834079687983203731L);
        setLongField(term104070, term104070.getClass(), "sumTechLunaticHighScore", 7406582048091992868L);
        setLongField(term104070, term104070.getClass(), "sumBattleHighScore", 2503971592095458212L);
        setLongField(term104070, term104070.getClass(), "sumBattleBasicHighScore", 483652353726945577L);
        setLongField(term104070, term104070.getClass(), "sumBattleAdvancedHighScore", 5923292358480924028L);
        setLongField(term104070, term104070.getClass(), "sumBattleExpertHighScore", -8917633736802211417L);
        setLongField(term104070, term104070.getClass(), "sumBattleMasterHighScore", 6841951969811132105L);
        setLongField(term104070, term104070.getClass(), "sumBattleLunaticHighScore", 7029460330693322196L);
        setField(term104070, term104070.getClass(), "eventWatchedDate", "cccqLKEZEH");
        setField(term104070, term104070.getClass(), "cmEventWatchedDate", "ufJDjorAHB");
        setField(term104070, term104070.getClass(), "firstGameId", "vvCdszcZAM");
        setField(term104070, term104070.getClass(), "firstRomVersion", "TfVnaAMbff");
        setField(term104070, term104070.getClass(), "firstDataVersion", "sFBmgRhzYE");
        setField(term104070, term104070.getClass(), "firstPlayDate", "XseDawXOYK");
        setField(term104070, term104070.getClass(), "lastGameId", "cGjkKMuRym");
        setField(term104070, term104070.getClass(), "lastRomVersion", "UkyFIpmXgn");
        setField(term104070, term104070.getClass(), "lastDataVersion", "WwUMKfEIId");
        setField(term104070, term104070.getClass(), "compatibleCmVersion", "SslgLEDDsh");
        setField(term104070, term104070.getClass(), "lastPlayDate", "TgVVwNRUEz");
        setIntField(term104070, term104070.getClass(), "lastPlaceId", -384265354);
        setField(term104070, term104070.getClass(), "lastPlaceName", "iTTbIFtzFS");
        setIntField(term104070, term104070.getClass(), "lastRegionId", -1660286082);
        setField(term104070, term104070.getClass(), "lastRegionName", "QBNhggbqkk");
        setIntField(term104070, term104070.getClass(), "lastAllNetId", -678506009);
        setField(term104070, term104070.getClass(), "lastClientId", "gIPMuBfHKY");
        setIntField(term104070, term104070.getClass(), "lastUsedDeckId", 1798065091);
        setIntField(term104070, term104070.getClass(), "lastPlayMusicLevel", 552715483);
        setIntField(term104070, term104070.getClass(), "lastEmoneyBrand", 1064843831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTabSetting", argTypes, term104070, args);
    }

};


