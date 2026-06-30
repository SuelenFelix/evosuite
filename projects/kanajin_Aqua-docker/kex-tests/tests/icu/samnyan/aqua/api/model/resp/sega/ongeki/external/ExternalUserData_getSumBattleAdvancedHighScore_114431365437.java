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

public class ExternalUserData_getSumBattleAdvancedHighScore_114431365437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3178876;

    public ExternalUserData_getSumBattleAdvancedHighScore_114431365437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3178876 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3178876, term3178876.getClass(), "accessCode", "BVthGkENWG");
        setField(term3178876, term3178876.getClass(), "userName", "SjBGJtVZpp");
        setIntField(term3178876, term3178876.getClass(), "level", -44328368);
        setIntField(term3178876, term3178876.getClass(), "reincarnationNum", -668796986);
        setLongField(term3178876, term3178876.getClass(), "exp", -1522924025386171849L);
        setLongField(term3178876, term3178876.getClass(), "point", 5034464198665828520L);
        setLongField(term3178876, term3178876.getClass(), "totalPoint", 3939738187320161923L);
        setIntField(term3178876, term3178876.getClass(), "playCount", -1485735391);
        setIntField(term3178876, term3178876.getClass(), "jewelCount", 2012566381);
        setIntField(term3178876, term3178876.getClass(), "totalJewelCount", 1643843390);
        setIntField(term3178876, term3178876.getClass(), "medalCount", 916434401);
        setIntField(term3178876, term3178876.getClass(), "playerRating", -1190720274);
        setIntField(term3178876, term3178876.getClass(), "highestRating", -573301823);
        setIntField(term3178876, term3178876.getClass(), "battlePoint", 1587287781);
        setIntField(term3178876, term3178876.getClass(), "bestBattlePoint", -1654593492);
        setIntField(term3178876, term3178876.getClass(), "overDamageBattlePoint", 2123651753);
        setIntField(term3178876, term3178876.getClass(), "nameplateId", -1653119532);
        setIntField(term3178876, term3178876.getClass(), "trophyId", -1012323937);
        setIntField(term3178876, term3178876.getClass(), "cardId", 1143869791);
        setIntField(term3178876, term3178876.getClass(), "characterId", -1617574477);
        setIntField(term3178876, term3178876.getClass(), "tabSetting", 912569587);
        setIntField(term3178876, term3178876.getClass(), "tabSortSetting", -1927812925);
        setIntField(term3178876, term3178876.getClass(), "cardCategorySetting", 2043049460);
        setIntField(term3178876, term3178876.getClass(), "cardSortSetting", 864907060);
        setIntField(term3178876, term3178876.getClass(), "rivalScoreCategorySetting", -870928084);
        setIntField(term3178876, term3178876.getClass(), "playedTutorialBit", 985991246);
        setIntField(term3178876, term3178876.getClass(), "firstTutorialCancelNum", 1914509051);
        setLongField(term3178876, term3178876.getClass(), "sumTechHighScore", -366717491912493302L);
        setLongField(term3178876, term3178876.getClass(), "sumTechBasicHighScore", -4016395927517624358L);
        setLongField(term3178876, term3178876.getClass(), "sumTechAdvancedHighScore", 5801142022452730795L);
        setLongField(term3178876, term3178876.getClass(), "sumTechExpertHighScore", -1173707077341650344L);
        setLongField(term3178876, term3178876.getClass(), "sumTechMasterHighScore", -6129985868615932464L);
        setLongField(term3178876, term3178876.getClass(), "sumTechLunaticHighScore", -1035128303940429841L);
        setLongField(term3178876, term3178876.getClass(), "sumBattleHighScore", 1298881240773714761L);
        setLongField(term3178876, term3178876.getClass(), "sumBattleBasicHighScore", -5391700280606768790L);
        setLongField(term3178876, term3178876.getClass(), "sumBattleAdvancedHighScore", -5094007277341662437L);
        setLongField(term3178876, term3178876.getClass(), "sumBattleExpertHighScore", -8408066430428664914L);
        setLongField(term3178876, term3178876.getClass(), "sumBattleMasterHighScore", -4305464594628383137L);
        setLongField(term3178876, term3178876.getClass(), "sumBattleLunaticHighScore", -8576274191885593277L);
        setField(term3178876, term3178876.getClass(), "eventWatchedDate", "XkLwSkbBCp");
        setField(term3178876, term3178876.getClass(), "cmEventWatchedDate", "WsGypbrPiP");
        setField(term3178876, term3178876.getClass(), "firstGameId", "JNRkrDSCSS");
        setField(term3178876, term3178876.getClass(), "firstRomVersion", "eAPeaLMEpj");
        setField(term3178876, term3178876.getClass(), "firstDataVersion", "mwLjpcPLUw");
        setField(term3178876, term3178876.getClass(), "firstPlayDate", "oHDWOsfOoz");
        setField(term3178876, term3178876.getClass(), "lastGameId", "ZiSePDcSQb");
        setField(term3178876, term3178876.getClass(), "lastRomVersion", "LHPMyrAnzZ");
        setField(term3178876, term3178876.getClass(), "lastDataVersion", "fyteCMiExv");
        setField(term3178876, term3178876.getClass(), "compatibleCmVersion", "mjlUxhGzmO");
        setField(term3178876, term3178876.getClass(), "lastPlayDate", "SOVfAfhkWO");
        setIntField(term3178876, term3178876.getClass(), "lastPlaceId", -2074709151);
        setField(term3178876, term3178876.getClass(), "lastPlaceName", "bCwSycgpwC");
        setIntField(term3178876, term3178876.getClass(), "lastRegionId", 843245637);
        setField(term3178876, term3178876.getClass(), "lastRegionName", "GqhHBSXIVz");
        setIntField(term3178876, term3178876.getClass(), "lastAllNetId", 779267775);
        setField(term3178876, term3178876.getClass(), "lastClientId", "TmGJHdGbiM");
        setIntField(term3178876, term3178876.getClass(), "lastUsedDeckId", -201435602);
        setIntField(term3178876, term3178876.getClass(), "lastPlayMusicLevel", -793172479);
        setIntField(term3178876, term3178876.getClass(), "lastEmoneyBrand", 906373615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleAdvancedHighScore", argTypes, term3178876, args);
    }

};


