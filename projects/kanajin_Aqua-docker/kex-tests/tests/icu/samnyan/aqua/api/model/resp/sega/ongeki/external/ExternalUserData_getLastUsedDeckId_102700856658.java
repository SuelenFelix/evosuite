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

public class ExternalUserData_getLastUsedDeckId_102700856658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3187192;

    public ExternalUserData_getLastUsedDeckId_102700856658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3187192 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3187192, term3187192.getClass(), "accessCode", "FCAPsBJnMa");
        setField(term3187192, term3187192.getClass(), "userName", "uCZDxFMmYG");
        setIntField(term3187192, term3187192.getClass(), "level", 1609577886);
        setIntField(term3187192, term3187192.getClass(), "reincarnationNum", -117796974);
        setLongField(term3187192, term3187192.getClass(), "exp", 7113107292726710435L);
        setLongField(term3187192, term3187192.getClass(), "point", -5438609926687141249L);
        setLongField(term3187192, term3187192.getClass(), "totalPoint", -1432468294299433984L);
        setIntField(term3187192, term3187192.getClass(), "playCount", -684130421);
        setIntField(term3187192, term3187192.getClass(), "jewelCount", -1889341557);
        setIntField(term3187192, term3187192.getClass(), "totalJewelCount", 599796485);
        setIntField(term3187192, term3187192.getClass(), "medalCount", 887597736);
        setIntField(term3187192, term3187192.getClass(), "playerRating", 1129054100);
        setIntField(term3187192, term3187192.getClass(), "highestRating", -326872040);
        setIntField(term3187192, term3187192.getClass(), "battlePoint", -1558273969);
        setIntField(term3187192, term3187192.getClass(), "bestBattlePoint", -1596008334);
        setIntField(term3187192, term3187192.getClass(), "overDamageBattlePoint", 1906324371);
        setIntField(term3187192, term3187192.getClass(), "nameplateId", 504455368);
        setIntField(term3187192, term3187192.getClass(), "trophyId", 1240632739);
        setIntField(term3187192, term3187192.getClass(), "cardId", -454879875);
        setIntField(term3187192, term3187192.getClass(), "characterId", 667440016);
        setIntField(term3187192, term3187192.getClass(), "tabSetting", -1843876288);
        setIntField(term3187192, term3187192.getClass(), "tabSortSetting", 284904974);
        setIntField(term3187192, term3187192.getClass(), "cardCategorySetting", -1653935725);
        setIntField(term3187192, term3187192.getClass(), "cardSortSetting", 818729001);
        setIntField(term3187192, term3187192.getClass(), "rivalScoreCategorySetting", -976708155);
        setIntField(term3187192, term3187192.getClass(), "playedTutorialBit", 1007598575);
        setIntField(term3187192, term3187192.getClass(), "firstTutorialCancelNum", 226786896);
        setLongField(term3187192, term3187192.getClass(), "sumTechHighScore", -7084005790327904443L);
        setLongField(term3187192, term3187192.getClass(), "sumTechBasicHighScore", 5219656858663153675L);
        setLongField(term3187192, term3187192.getClass(), "sumTechAdvancedHighScore", 5269336656178603607L);
        setLongField(term3187192, term3187192.getClass(), "sumTechExpertHighScore", 6911546778684797918L);
        setLongField(term3187192, term3187192.getClass(), "sumTechMasterHighScore", 1257470580992132251L);
        setLongField(term3187192, term3187192.getClass(), "sumTechLunaticHighScore", -1503620363359806158L);
        setLongField(term3187192, term3187192.getClass(), "sumBattleHighScore", -8422649107133600248L);
        setLongField(term3187192, term3187192.getClass(), "sumBattleBasicHighScore", -2556519577285719992L);
        setLongField(term3187192, term3187192.getClass(), "sumBattleAdvancedHighScore", 2503334577848599076L);
        setLongField(term3187192, term3187192.getClass(), "sumBattleExpertHighScore", 6799904202688223757L);
        setLongField(term3187192, term3187192.getClass(), "sumBattleMasterHighScore", 5805146641942074567L);
        setLongField(term3187192, term3187192.getClass(), "sumBattleLunaticHighScore", -6699825035158898568L);
        setField(term3187192, term3187192.getClass(), "eventWatchedDate", "GGoWbuXTGP");
        setField(term3187192, term3187192.getClass(), "cmEventWatchedDate", "ZFnJuznTXj");
        setField(term3187192, term3187192.getClass(), "firstGameId", "VQIaczgFBU");
        setField(term3187192, term3187192.getClass(), "firstRomVersion", "oYYQOtJmlu");
        setField(term3187192, term3187192.getClass(), "firstDataVersion", "FDNtklFAlW");
        setField(term3187192, term3187192.getClass(), "firstPlayDate", "FBeokoEVyh");
        setField(term3187192, term3187192.getClass(), "lastGameId", "PfEyBalwFK");
        setField(term3187192, term3187192.getClass(), "lastRomVersion", "XCcYvVLSOw");
        setField(term3187192, term3187192.getClass(), "lastDataVersion", "LbKqLOyiQu");
        setField(term3187192, term3187192.getClass(), "compatibleCmVersion", "awieaESaxr");
        setField(term3187192, term3187192.getClass(), "lastPlayDate", "gSOuAJcoCE");
        setIntField(term3187192, term3187192.getClass(), "lastPlaceId", -952017004);
        setField(term3187192, term3187192.getClass(), "lastPlaceName", "MRvNvpnVKP");
        setIntField(term3187192, term3187192.getClass(), "lastRegionId", 1157495791);
        setField(term3187192, term3187192.getClass(), "lastRegionName", "hMSOqgUmer");
        setIntField(term3187192, term3187192.getClass(), "lastAllNetId", 1710370709);
        setField(term3187192, term3187192.getClass(), "lastClientId", "QoAGsENPoE");
        setIntField(term3187192, term3187192.getClass(), "lastUsedDeckId", 372314868);
        setIntField(term3187192, term3187192.getClass(), "lastPlayMusicLevel", -1195911453);
        setIntField(term3187192, term3187192.getClass(), "lastEmoneyBrand", 873306780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastUsedDeckId", argTypes, term3187192, args);
    }

};


